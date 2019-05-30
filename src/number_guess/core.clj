(ns number-guess.core
  (:gen-class))


(defn play []
  (def secret (+ 1 (rand-int 20)))
  (println "I've thought of a number between 1 and 20, can you guess what it is?")

  (loop []
    (println "Take a guess ...")
    (def guess (Integer. (read-line)))
    (cond
      (> guess secret) (println "Your number is too big")
      (< guess secret) (println "Your number is too small"))
    (when-not (= guess secret)
      (recur)))

  (println "But that number is just right!")
  )

(defn -main
  "I play a cracking game of guess my number"
  [& args]
  (play))
