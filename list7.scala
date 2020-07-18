import scala.collection.mutable.ListBuffer
object list7{
def main(args:Array[String]){

val list=new ListBuffer[Int]

for(i<-0 to 10){
var n=i
var n1=i*i

var a=((3*n1)+(4*n)+6)
list+=a
}
println(list)

}
}
