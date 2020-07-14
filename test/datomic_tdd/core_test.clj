(ns datomic-tdd.core-test
  (:require [clojure.test :refer :all]
            [datomic-api :as d]
            [datomic-tdd.core :refer :all]))


(defn fresh-database []
  (let [db-name (gensym)
        db-uri (str "datomic:mem://" db-name)]
    (d/create-database db-uri)
    (let [conn (d/connect db-uri)]
      ;; TODO - build schema
      conn)))
