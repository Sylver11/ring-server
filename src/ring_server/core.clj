(ns ring-server.core
  (:require [ring.adapter.jetty :as jetty]))

;;defer to funtions for each page handler
;;put those handlers in their own namespace
;;use hiccup to render the page body
;;explore templating -common header/footer,unique content per page

(defn handler [request]
  (cond (= (:uri request) "/home")
        {:status 200
         :body "This is the Home Page"}

        (= (:uri request) "/projects")
        {:status 200
         :body "Project Page"}

        :else
        {:status 200
         :body "This is the catch all site"}))


(defonce *server (atom nil))

(defn start-server! []
  (reset! *server
          (jetty/run-jetty #'handler
                           {:port 2000
                            :join? false})))

(defn stop-server! []
  (when-some [server @*server]
    (.stop server))
  (reset! *server nil))

(defn reset-server! []
  (stop-server!)
  (start-server!)
  )
