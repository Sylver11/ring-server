(ns ring-server.views.projects
  (:require
   [hiccup.core]
   [hiccup.page :as page]
;;   [ring-server.db.queries.projects-listed :as projects-listed]
   ))





(def projects-listed
  {1 {:title "Project 1"
      :description "This is the first project"}
   2 {:title "Project 2"
      :description "Wuuuhuu this is our second Project"}
   3 {:title "Project 3"
      :description "Project 3 has arrived"}})



(defn list-projects [request]
  (page/html5
   [:ul
    (for [[id {:keys [title]}] projects-listed]
      [:li
       [:a  {:href (str "project/" id)}
        title]])]))

(defn projects-id [id]
  (let [project (get projects-listed id)]
  (page/html5
   [:div
    [:h1 (:title project)]
    [:p  (:description project)]])))
