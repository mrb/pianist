(ns pianist.test.core
  (:use [pianist.core])
  (:use [clojure.test]))

(deftest is-a-valid-dump-file
  (parse-rdb-file "test/fixtures/dump.rdb" (parsemap))
  (is true))

(deftest is-not-a-valid-dump-file
  (parse-rdb-file "test/fixtures/not_a_dump.rdb" (parsemap))
  (is "Not a valid Redis .rdb file"))

;;(count (map #(bit-test % 0) (parse-rdb-file "test/fixtures/dump.rdb" (parsemap))))
