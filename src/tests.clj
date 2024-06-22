(ns tests
  (:require [clojure.test :refer [run-tests]]
            [square-test]))

(run-tests 'square-test)