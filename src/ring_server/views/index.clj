(ns ring-server.views.index
  (:require
   [hiccup.core]
   [hiccup.page :as page]))


(defn home [request]
  (page/html5
   [:div
    [:h1 "Welcome to my personal Website"]
    [:p  "This is the Ring server doing its magic"]]))

