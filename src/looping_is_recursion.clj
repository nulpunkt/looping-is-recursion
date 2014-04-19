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
  (loop [sum 0
         i 0
         a-seq a-seq]
    (if (empty? a-seq)
      (/ sum i)
      (recur (+ (first a-seq) sum) (inc i) (rest a-seq)))))

(defn parity [a-seq]
  (loop
    [acc '()
     a-seq a-seq]
    (if (empty? a-seq)
      acc
      (let [elm (first a-seq)
            trimmed (remove (partial = elm) a-seq)]
        (if (odd? (- (count trimmed) (count a-seq)))
          (recur (cons elm acc) trimmed)
          (recur acc trimmed))))))

(defn fast-fibo [n]
  (if (< n 2)
    n
    (loop [f1 0
           f2 1
           n n]
      (if (zero? n)
        f1
        (recur f2 (+ f1 f2) (dec n))))))

(defn cut-at-repetition [a-seq]
  (loop [acc []
         seen-so-far #{}
         a-seq a-seq]
    (let [current (first a-seq)]
      (if (or (empty? a-seq) (contains? seen-so-far current))
        acc
        (recur (conj acc current) (conj seen-so-far current) (rest a-seq))))))

