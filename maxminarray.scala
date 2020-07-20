object maxminarray{
def main(args:Array[String]){
println("Enter the number of for array:")
var n=scala.io.StdIn.readInt()
val num=new Array[Int](n)
println("enter elements are:")
for(i<- 0 to n-1){
num(i)=scala.io.StdIn.readInt()
}
println("entered elements are:")
for(e<-num)
println(e)
scala.util.Sorting.quickSort(num)
println("Sorted Array")
println("min element is:"+num(0))
println("max element is:"+num(n-1))
}
}
