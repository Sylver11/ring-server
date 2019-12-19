(ns ring-server.core
  (:require  [ring.adapter.jetty :as jetty]
             [ring-server.handler :as handler]
            ))


(defn middleware [request]
  {:status 200
   :body (handler/handler request)})

(defonce *server (atom nil))

(defn start-server! []
  (reset! *server
          (jetty/run-jetty #'middleware
                           {:port 2000
                            :join? false})))

(defn stop-server! []
  (when-some [server @*server]
    (.stop server))
  (reset! *server nil))

(defn reset-server! []
  (stop-server!)
  (start-server!))

#_(reset-server!)
