/*
Write a loop that swaps adjacent elements of an array of integers. For example,
Array(1, 2, 3, 4, 5)becomes Array(2, 1, 4, 3, 5).
*/

def odd(n: Int) = n % 2 != 0

val arr = Array(1, 2, 3, 4, 5, 6, 7, 8)
var tmp = 0

for (i <- 0 until arr.length if odd(i) ) {
		tmp = arr(i)
		arr(i) = arr(i-1)
		arr(i-1) = tmp
}
arr
