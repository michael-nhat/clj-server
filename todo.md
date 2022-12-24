##### Todo
    - pedestal example
    - repl workflow


##### Done
    - clj -X:start
    - init with clj, neil


clojure  -Sverbose -M:env-dev:repl-rebel
clj -Sdeps '{:deps {nrepl/nrepl {:mvn/version "0.5.3"}}}' -m nrepl.cmdline -c --host 127.0.0.1 --port PORT

    clj -M -m nrepl.cmdline -c --port `< .nrepl-port`

https://practical.li/clojure-staging/alternative-tools/clojure-tools/set-namespace-on-repl-startup.html