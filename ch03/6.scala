/*
How do you rearrange the elements of an Array[Int]so that they appear in
reverse sorted order? How do you do the same with an ArrayBuffer[Int]?
*/
import collection.mutable._
import scala.util.Sorting._

val a =  Array[Int] (20, 52, 13, -1, 43, -3, 0, 86)

quickSort(a)
a.reverse

val ab = ArrayBuffer[Int](20, 52, 13, -1, 43, -3, 0, 86)
ab.sortWith(_ > _)
