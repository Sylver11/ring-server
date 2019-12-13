(ns ring-server.handler
  (:require
   [ring-server.views.projects :as projects]
   [ring-server.views.index :as index]
   [ring-server.views.error :as error]
   [clojure.string :as string]
            ))


(defn route-handler-dispatch [{:keys [uri]}]
  (if (re-find #"\d+$" uri)
    [(string/replace uri #"\d+$" "") :id]
    uri))

(defmulti route-handler route-handler-dispatch)

(defmethod route-handler :default [request]
  (error/site-not-found request))

(defmethod route-handler "/" [request]
  (index/home request))

(defmethod route-handler ["/project/" :id] [{:keys [uri]}]
  (let [id (Long. (re-find #"\d+$" uri))]
    (projects/projects-id id)))

(defmethod route-handler "/projects" [request]
  (projects/list-projects request))

