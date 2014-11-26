(ns bob)

(defn silence? [phrase]
  (empty? (.trim phrase)))

(defn question? [phrase]
  (.endsWith phrase "?"))

(defn shouting? [phrase]
  (and (not (= (.toUpperCase phrase) (.toLowerCase phrase)))
  (= (.toUpperCase phrase) phrase)))

(defn response-for [phrase]
  (cond
    (silence? phrase) "Fine. Be that way!"
    (shouting? phrase) "Whoa, chill out!"
    (question? phrase) "Sure."
    :else "Whatever."))
