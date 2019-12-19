(ns ring-server.handler
  (:require
   [ring-server.views.projects :as projects]
   [ring-server.views.index :as index]
   [ring-server.views.error :as error]))



(defn handler [request]
  (cond (= (:uri request) "/home")
        (index/home request)

        (= (:uri request) "/projects")
        (projects/list-projects request)

        :else
        (error/site-not-found request)))


