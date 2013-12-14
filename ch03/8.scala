/*
Rewrite the example at the end of  Section 3.4,  “Transforming  Arrays,”  on
page 34using the dropmethod for dropping the index of the first match. Look
the method up in Scaladoc.
*/

val ab = ArrayBuffer(1, 2, -1, -2, -3, 4, 5)

val negative = for (e <- ab if e < 0) yield e
val abp = (for (e <- ab if e >= 0) yield e)  ++ negative

val x = abp.dropRight(negative.length - 1)

// good solution also here:
//https://github.com/hempalex/scala-impatient/blob/master/Chapter03/08.scala
