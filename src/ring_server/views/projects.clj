(ns ring-server.views.projects
  (:require
   [hiccup.core]
   [hiccup.page :as page]
   [ring-server.db.queries.projects-listed :as projects-listed]))



(def projects-listed)

(defn list-projects [request]
  (page/html5
   [:ul
    (for [[id {:keys [title]}] projects-listed]
      [:li
       [:a [:href (str "project/" id)]
        title]])]))

(defn projects-id [id]
  (page/html5
   [:div [:p (str "this is project number: " id)]]))
