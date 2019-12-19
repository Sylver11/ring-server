(ns ring-server.views.projects
  (:require
   [hiccup.core]
   [hiccup.page :as page]))


(defn projects [request]
  (page/html5
   [:div
    [:h1 "Project site"]
    [:p  "This is where I will list my projects"]]))
