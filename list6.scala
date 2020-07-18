import scala.collection.mutable.ListBuffer
object list3{
def main(args:Array[String]){

val list1=new ListBuffer[Int]
val list2=new ListBuffer[Int] 

for(i<-0 to 50){
var n=i
var a=2*n+3
list1+=a
	
}
for(e<-list1){
	if(e%7!=0){
		list2+=e
	}
}
println(list1)
println(list2)
}
}
