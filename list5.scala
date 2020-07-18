import scala.collection.mutable.ListBuffer
object list5{
def main(args:Array[String]){

val list=List.range(1,100)
val list1=new ListBuffer[Int]() 
for(e<-list){
	if(e%10==0){
		list1+=e
	}
}
println(list1)
}
}
