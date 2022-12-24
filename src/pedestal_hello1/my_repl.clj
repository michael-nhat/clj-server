(ns pedestal-hello1.my-repl
  (:require [pedestal-hello1.pedestal-hello1]
            [nrepl.server :as nrepl-server]
            [cider.nrepl :refer (cider-nrepl-handler)]))
;; (pedestal-hello1.pedestal-hello1/-main)

(defn -main []
  (nrepl-server/start-server :port 7889 :handler cider-nrepl-handler)
  (pedestal-hello1.pedestal-hello1/-main))

(-main)