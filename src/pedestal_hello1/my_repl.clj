(ns pedestal-hello1.my-repl
  (:require [pedestal-hello1.pedestal-hello1]
            [nrepl.server :as nrepl-server]
            [cider.nrepl :refer [cider-nrepl-handler]]
            [rebel-readline.main :as rebel]))
;; (pedestal-hello1.pedestal-hello1/-main)

(defn greeting-fn []
  (print "wtf, gretting")
  (ns pedestal-hello1.pedestal-hello1))

(defn -main [& arg]
;;   (nrepl-server/start-server :port 7889 :handler cider-nrepl-handler)
  (ns pedestal-hello1.pedestal-hello1)
  (nrepl-server/start-server :port 7886 :handler cider-nrepl-handler :greeting-fn greeting-fn)
  (pedestal-hello1.pedestal-hello1/-main)
  (println "my nrepl server ")
  (rebel/-main)
  (System/exit 0)
  )

