/*
Write a loop that swaps adjacent elements of an array of integers. For example,
Array(1, 2, 3, 4, 5)becomes Array(2, 1, 4, 3, 5).
*/

def odd(n: Int) = n % 2 != 0
def nonZeroOdd(n: Int) = n > 0 && odd(n)

val arr = Array(1, 2, 3, 4, 5, 6, 7, 8)
var tmp = 0

for (i <- 0 until arr.length) {
	if (nonZeroOdd(i) ) {
		tmp = arr(i) 
		arr(i) = arr(i-1)
		arr(i-1) = tmp
	}
}
arr
