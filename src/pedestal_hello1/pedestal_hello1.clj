(ns pedestal-hello1.pedestal-hello1
  (:require
   [io.pedestal.http :as http]
   [io.pedestal.http.route :as route]))

(defn respond-hello [request]
  {:status 200 :body "Hello, world!"})

(def routes
  (route/expand-routes
   #{["/greet" :get respond-hello :route-name :greet]}))


(defn -main
  "Invoke me with clojure -M -m pedestal-hello1.pedestal-hello1"
  [& args]
  (println "-main with" args))
