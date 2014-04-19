(ns looping-is-recursion)

(defn power [base exp]
  (let [power-helper (fn [acc base exp]
                        (if (zero? exp)
                          acc
                          (recur (* acc base) base (dec exp))))]
  (power-helper 1 base exp)))

(defn last-element [a-seq]
  (cond
    (empty? a-seq) nil
    (= (count a-seq) 1) (first a-seq)
    :else (recur (rest a-seq))))

(defn seq= [seq1 seq2]
  (cond
    (and (empty? seq1) (empty? seq2)) true
    (not= (count seq1) (count seq2)) false
    (not= (first seq1) (first seq2)) false
    :else (recur (rest seq1) (rest seq2))))

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

