(ns rna-transcription
  (:require [clojure.string :refer (join)]))

(def one-to-rna
  { \C \G \G \C \A \U \T \A})

(defn transcribe [dna]
  (assert (contains? one-to-rna dna))
  (one-to-rna dna))

(defn to-rna [dna]
  (join "" (map transcribe dna)))
