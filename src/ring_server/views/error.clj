(ns ring-server.views.error
  (:require
   [hiccup.core]
   [hiccup.page :as page]))


(defn site-not-found [request]
  (page/html5
   [:div [:h1 "Oops looks like this site does not exist"]]))
