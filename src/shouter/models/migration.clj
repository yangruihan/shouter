(ns shouter.models.migration
  (:require [clojure.java.jdbc :as sql]
            [shouter.models.shout :as shout]))

(defn migrated? []
  (-> (sql/query shout/spec
                 [(str "SELECT COUNT(*) FROM information_schema.tables "
                       "where table_name='shouts'")])
    first last last pos?))

(defn migrate []
  (when (not (migrated?))
    (print "Creating database structure...") (flush)
    (sql/db-do-commands shout/spec
                        (sql/create-table-ddl
                          :shouts
                          [:id :int "PRIMARY KEY" "AUTO_INCREMENT"]
                          [:body "VARCHAR(255)" "NOT NULL"]
                          [:created_at :timestamp
                           "NOT NULL" "DEFAULT CURRENT_TIMESTAMP ON UPDATE CURRENT_TIMESTAMP"]))
    (println " done")))

