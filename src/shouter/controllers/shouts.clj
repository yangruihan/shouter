(ns shouter.controllers.shouts
  (:require [compojure.core :refer [defroutes GET POST]]
            [clojure.string :as str]
            [ring.util.response :as ring]
            [shouter.views.shouts :as view]
            [shouter.models.shout :as model]))

;; the home page
(defn index []
  (view/index (model/all)))

;; create a shout
(defn create
  [shout]
  (when-not (str/blank? shout)
    (model/create shout))
  (ring/redirect "/"))

;; the route config
(defroutes routes
  (GET "/" [] (index))
  (POST "/" [shout] (create shout)))

