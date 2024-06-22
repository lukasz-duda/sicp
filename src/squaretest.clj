(ns squaretest
  (:require [clojure.test :refer [deftest is testing]]
            [square :refer [square]]))

(deftest square-test
  (testing "integers"
    (is (= 4 (square 2)))
    (is (= 9 (square 3)))))