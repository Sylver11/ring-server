(ns ring-server.handler
  (:require
   [ring-server.views.projects :as projects]
   [ring-server.views.index :as index]
   [ring-server.views.error :as error]
   [ring-server.views.about :as about]
   [ring-server.views.experience :as experience]))



(defn handler [request]
  (cond (= (:uri request) "/")
        (index/home request)

        (= (:uri request) "/projects")
        (projects/projects request)

        (= (:uri request) "/about")
        (about/me request)

        (= (:uri request) "/experience")
        (experience/list-experience request)

        :else
        (error/site-not-found request)))


