(ns looping-is-recursion)

(defn power [base exp]
  (let [power-helper (fn [acc base exp]
                        (if (zero? exp)
                          acc
                          (recur (* acc base) base (dec exp))))]
  (power-helper 1 base exp)))

(defn last-element [a-seq]
  ":(")

(defn seq= [seq1 seq2]
  ":(")

(defn find-first-index [pred a-seq]
  ":(")

(defn avg [a-seq]
  -1)

(defn parity [a-seq]
  ":(")

(defn fast-fibo [n]
  ":(")

(defn cut-at-repetition [a-seq]
  [":("])

