(defproject shouter "0.1.0-SNAPSHOT"
  :description "Shouter app"
  :url "http://github.com/yangruihan/shouter"
  :min-lein-version "2.0.0" 
  :license {:name "Eclipse Public License"
            :url "http://www.eclipse.org/legal/epl-v10.html"}
  :dependencies [[org.clojure/clojure "1.8.0"]
                 [org.clojure/java.jdbc "0.3.7"]
                 [mysql/mysql-connector-java "5.1.25"]
                 [ring/ring-jetty-adapter "1.4.0"]
                 [compojure "1.4.0"]
                 [ring/ring-defaults "0.1.2"]
                 [hiccup "1.0.5"]
                 [korma "0.4.2"]]
  :main ^:skip-aot shouter.web
  :uberjar-name "shouter-standalone.jar"
  :plugins [[lein-ring "0.8.13"]]
  :ring {:handler shouter.web/application
         :init shouter.models.migration/migrate}
  :profiles {:dev {:dependencies [[javax.servlet/servlet-api "2.5"]
                                  [ring-mock "0.1.5"]]}
             :uberjar {:aot :all}})
