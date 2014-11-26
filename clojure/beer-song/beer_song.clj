(ns beer-song
    (:require [clojure.string :as string]))

(defn bottles [num]
  (if (= 1 num) "bottle" "bottles"))

(defn bottles_num_first [num]
  (if (= 0 num) "No more" num))

(defn bottles_num_last [num]
  (if (= 0 num) "no more" num))

(defn verse_start [num]
  (str (bottles_num_first num) " " (bottles num) " of beer on the wall")
  )

(defn one_it [num]
  (if (= 1 num) "it" "one"))

(defn verse-finale [num]
  (if (= 0 num)
         (str "Go to the store and buy some more, 99 bottles of beer on the wall.\n")
         (str "Take " (one_it num) " down and pass it around, " (bottles_num_last(- num 1)) " " (bottles (- num 1)) " of beer on the wall.\n")))

(defn verse [num]
  (str (verse_start num) ", " (bottles_num_last num)" " (bottles num)
       " of beer.\n" (verse-finale num)))

(defn sing
  ([num1] (string/join "\n" (map verse (into-array (range num1 -1 -1)))))
  ([num1 num2] (string/join "\n" (map verse (into-array(range num1 (- num2 1) -1))))))
