(ns ring-server.core
  (:require [ring.adapter.jetty :as jetty]))

(defn handler [request]
  {:status 200
   :headers {"Content-Type" "text/html"}
   :body "Hello World"})

(defn start-server! []
  (jetty/run-jetty #'handler
                           {:port 2000
                            :join? false}))

