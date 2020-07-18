import scala.collection.mutable.ListBuffer
object list3{
def main(args:Array[String]){

val list=List.range(1,50)
val list1=new ListBuffer[Int]() 
for(e<-list){
	if(e%3==0){
		list1+=e
	}
}
println(list1)
}
}
