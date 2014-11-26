(ns anagram)

(defn normalize [word]
  (sort (.toLowerCase word)))

(defn anagrams-for [word words]
  (filter #(and (not (= (.toLowerCase %) (.toLowerCase word)))
                (= (normalize %) (normalize word))) words))
