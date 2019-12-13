(ns ring-server.views.index
  (:require
   [hiccup.core]
   [hiccup.page :as page]))



(defn home [request]
  (page/html5
   [:div "Welcome to the home page"])
  )

