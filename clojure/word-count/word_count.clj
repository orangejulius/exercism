(ns word-count
    (:require [clojure.string :as s]))

(defn word-array [words]
    (s/split (s/lower-case words) #"\W+"))

(defn word-count [words]
  (frequencies (word-array words)))
