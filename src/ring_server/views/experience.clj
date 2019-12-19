(ns ring-server.views.experience
  (:require
   [hiccup.core]
   [hiccup.page :as page]))

(defn list-experience [request]
  (page/html5
   [:div
    [:h1 "My Experience"]
    [:p  "My experience is vast but I still have to write it down"]]))
