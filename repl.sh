clojure -Sdeps '{:deps {nrepl/nrepl {:mvn/version,"1.1.1"},cider/cider-nrepl {:mvn/version,"0.47.1"}}}' -M -m nrepl.cmdline --middleware "[cider.nrepl/cider-middleware]"