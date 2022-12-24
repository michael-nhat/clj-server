(ns pedestal-hello1.my-repl
  (:require [pedestal-hello1.pedestal-hello1]
            [nrepl.server :as nrepl-server]
            [cider.nrepl :refer [cider-nrepl-handler]]
            [rebel-readline.main :as rebel]))
;; (pedestal-hello1.pedestal-hello1/-main)

(defn greeting-fn []  
  (print "wtf, gretting")
  (ns pedestal-hello1.pedestal-hello1)
  )

(defn -main [& arg]
;;   (nrepl-server/start-server :port 7889 :handler cider-nrepl-handler)
  (println "nrepl server at port 7889")
  (nrepl-server/start-server :port 7886 :handler cider-nrepl-handler :greeting-fn greeting-fn)
  (pedestal-hello1.pedestal-hello1/-main)
(ns pedestal-hello1.pedestal-hello1)
  (rebel/-main)
  ;; (System/exit 0)
  )

