/*
Given an array of integers, produce a new array that contains all positive
values of the original array, in their original order, followed by all values that
are zero or negative, in their original order.
*/

def postiveFirst(arr: Array[Int]) = {

	val a = for (e <- arr if e > 0) yield e
	val an = for (e <- arr if e <= 0) yield e

	a ++ an
}

val arr = Array(0, 1, -3, 5, -5, -6, 10, 20)
val pFirstArr = postiveFirst(arr)