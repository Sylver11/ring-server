(ns ring-server.views.about
  (:require
   [hiccup.core]
   [hiccup.page :as page]))

(defn me [request]
  (page/html5
   [:div
    [:h1 "About me"]
    [:p  "This is where I will talk about myself"]]))
