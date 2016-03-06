(ns shouter.models.shout
  (:use [korma.db :refer [defdb mysql]]
        [korma.core :refer [select insert values order defentity]]))

(defdb db (mysql {:db "shouter",
                  :host "localhost",
                  :port 3306,
                  :user "root",
                  :password "123456"}))

(defentity shouts)

(def spec (or (System/getenv "DATABASE_URL")
              "mysql:///shouter?useUnicode=true&characterEncoding=UTF-8&user=root&password=123456"))

; get all shouts
(defn all []
   (select shouts
           (order :id)))

; save a shout into database
(defn create [shout]
  (insert shouts
          (values {:body shout})))