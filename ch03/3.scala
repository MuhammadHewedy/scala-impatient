/*
Repeat the preceding assignment, but produce a new array with the swapped
values. Use for/yield.
*/

// inspried by: 
//	https://github.com/hempalex/scala-impatient/blob/master/Chapter03/03.scala

def odd(n: Int) = n % 2 != 0
def notLast(i: Int, length: Int) = i < length - 1

def swap(arr: Array[Int]) = {	
	for (i <- 0 until arr.length) yield{
			if (odd(i)) 
				arr(i-1)
			else if (notLast(i, arr.length))
				arr(i+1)
			else
				arr(i)
	}
}

val arr = Array(1, 2, 3, 4, 5, 6, 7)
val newArr = swap(arr)
