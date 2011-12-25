(ns pianist.test.core
  (:use [pianist.core])
  (:use [clojure.test]))

(deftest replace-me ;; FIXME: write
  (is false "No tests have been written."))

;; Calling the function with a path and parsemap
(parse-rdb-file "test/fixtures/dump.rdb" (parsemap))

(parse-rdb-file "test/fixtures/not_a_dump.rdb" (parsemap))

(count (map #(bit-test % 0) (parse-rdb-file "test/fixtures/dump.rdb" (parsemap))))
