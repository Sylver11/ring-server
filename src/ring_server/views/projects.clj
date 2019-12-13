(ns ring-server.views.projects
  (:require
   [hiccup.core]
   [hiccup.page :as page]))


(defn list-projects [request]
  (page/html5
   [:ul [:li [:a {:href "/project/1"} "Project 1"]]
    [:li [:a {:href "/project/2"} "Project 2"]]
    [:li [:a {:href "/project/3"} "Project 3"]]]))

(defn projects-id [id]
  (page/html5
   [:div [:p (str "this is project number: " id)]]))
