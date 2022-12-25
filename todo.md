##### Todo
    - pedestal example
    - calva extension dev experience
    - reload repl when -main file code change

##### Done
    - clj -X:start
    - init with clj, neil
    - repl workflow


clojure  -Sverbose -M:env-dev:repl-rebel
clj -Sdeps '{:deps {nrepl/nrepl {:mvn/version "1.1.0-alpha1"}}}' -m nrepl.cmdline -c --host 127.0.0.1 --port PORT

    clj -M -m nrepl.cmdline -c --port `< .nrepl-port`

https://practical.li/clojure-staging/alternative-tools/clojure-tools/set-namespace-on-repl-startup.html

clojure  -Sverbose -M:env-dev
then
clojure  -Sverbose -M:client
then eval

https://stackoverflow.com/questions/37104853/how-to-automatically-reload-clojure-code

https://github.com/pedestal/samples/blob/master/auto-reload-server/dev/dev.clj
https://github.com/pedestal/samples/tree/master/auto-reload-server

