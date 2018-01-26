                      ;;AI Programming 
  ;;-----------------------------------------------------------
  ;; 1. Using only the first and rest functions, write the sequences of expressions that retrieve the X from the following lists/vectors. -----------------------------------------------------------

;; 1.1: ‘(a X b c)
(first (rest '(a X b c)))

;; 1.2: ‘[a b X c]
(first (rest (rest '(a b X c))))

;; 1.3: ‘(a b [X] c)
(first (first (rest (rest '(a b [X] c)))))

;; 1.4: ‘([X])
(first (first '([X])))

;; 1.5: ‘(a (b (X (c))))
(first (first (rest (first (rest '(a (b (X (c)))))))))
;; 1.6: ‘(a (b (X)) c)

(first (first (rest (first (rest '(a (b (X)) c))))))


  ;;-----------------------------------------------------------
  ;; 2. Using only the following symbols: cons 'a 'b 'c () Write the expressions which build the following lists: -----------------------------------------------------------

;; 2.1: (a b c)
(cons 'a (cons 'b(cons 'c())))

;; 2.2: (a (b c))
;; need to find out this!!

;; 2.3: ((a) b c)
(cons (cons 'a())(cons 'b(cons 'c())))

  ;;-----------------------------------------------------------
  ;; 3. count is a function that takes a list (or vector or ...) as its argument and returns as its value the length of that list. So count applied to '(a b c d) gives a value of 4. Look at the lists in problem-2 and 1.5 & 1.6 in problem-1, noting what you think their lengths should be, then check using count. If you find the answer is not what you had expected make sure you know why. -----------------------------------------------------------
;; 1.5
(count '(a (b (X (c)))))
;; length = 2.

;; 1.6
(count '(a (b (X)) c))
;; length = 3.

;; 2.1
(count '(a b c))
;; length = 3.

;; 2.2
(count '(a (b c)))
;; length = 2.

;; 2.3
(count '((a) b c))
;; length = 3.

  ;;-----------------------------------------------------------
  ;; 4. Write the following functions -----------------------------------------------------------

;; 4.1  inc-num takes 1 arg which is a number & returns the number incremented by 1 – keep it simple.
(defn inc-num [n] (inc n))
(inc-num 123)

;; 4.2 inc-1st takes 1 arg which is a list of numbers returns the list with the first number incremented.
(defn inc-first [lis] (inc (first lis)))
(inc-first '(1 2 3 4 5))

;; 4.3 vector-head takes a list as its arg & returns the list with the first item vectorised. (find out how to put something in a vector)
(defn vector-head [lis] (vector (first lis)))
(vector-head '(a b c))

;;-----------------------------------------------------------
;; 5. find the most appropriate way to retrieve 'spam' from the following data structures... -----------------------------------------------------------

;; 5.1
('{:a egg, :b spam, :c chips} :b)

;; 5.2
'(cat dog {:a egg, :b spam, :c chips} rat frog)

;; 5.3 
'(cat [dog bat] {fruit #{mango melon pawpaw},breakfast {:a egg, :b spam, :c chips}} rat frog)

;; 5.4: investigate at 5.3 & describe all the data structures it contains.


;;-----------------------------------------------------------
;; 6. There is a number puzzle where you start from one number and have to reach another number in as few steps as possible using only a small number of mathematical operations. For example: given legal mathematical operations of multiplying by 10, dividing by 2, adding 5 and subtracting 3, what step are required to get from 7 to 57. -----------------------------------------------------------


;;-----------------------------------------------------------
;; 7. Design a state representation and a transformation function for the “Farmer, Dog, Goose, Corn” problem. -----------------------------------------------------------



