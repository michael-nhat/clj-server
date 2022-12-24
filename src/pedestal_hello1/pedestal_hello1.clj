(ns pedestal-hello1.pedestal-hello1
  (:require
   [io.pedestal.http :as http]
   [io.pedestal.http.route :as route]
   [nrepl.server :as nrepl-server]
   [cider.nrepl :refer (cider-nrepl-handler)]))

;; (defonce nrepl-server (nrepl-server/start-server :port 7888 :handler cider-nrepl-handler))
;; (spit "./.nrepl-port" (:port nrepl-server))

(defn respond-hello [request]
  {:status 200 :body "Hello, world!"})

(def routes
  (route/expand-routes
   #{["/greet" :get respond-hello :route-name :greet]}))

(defn repl [])

(defn -main
  "Invoke me with clojure -M -m pedestal-hello1.pedestal-hello1"
  [& args]
  ;; (nrepl-server)
  (println "-main runned with " args))
