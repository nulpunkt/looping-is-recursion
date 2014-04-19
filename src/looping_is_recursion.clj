(ns looping-is-recursion)

(defn power [base exp]
  (loop [acc 1
         base base
         exp exp]
    (if (zero? exp)
      acc
      (recur (* acc base) base (dec exp)))))

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
  (loop [i 0
         pred pred
         a-seq a-seq]
    (cond
      (empty? a-seq) nil
      (pred (first a-seq)) i
      :elso (recur (inc i) pred (rest a-seq)))))

(defn avg [a-seq]
  -1)

(defn parity [a-seq]
  ":(")

(defn fast-fibo [n]
  ":(")

(defn cut-at-repetition [a-seq]
  [":("])

