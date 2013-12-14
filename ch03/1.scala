/*
Write a code snippet that sets a to an array of random integers between  0
(inclusive) and n(exclusive)
*/
import scala.util.Random

val n = 10
val a = new Array[Int](10)
for (i <- 0 until a.length) a(i) = Random.nextInt(n)
a
