import scala.collection.immutable._
object maxmin{
def main(args:Array[String]){
 
val name:SortedSet[Int]=SortedSet(23,56,12,1,4,5,67,89,45)

val arr=name.toArray
val n=arr.length

println("smallest number:"+arr(0))
println("smallest number:"+arr(n-1))
}
}
