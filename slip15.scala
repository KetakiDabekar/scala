import scala.collection.mutable.ListBuffer
object scala15{
def main(args:Array[String]){

var list1=new ListBuffer[Int]
var list2=new ListBuffer[Int]

for(i<- 1 to 100)
{
	list1+=i
}
println(list1)
println("++++++++++++++++++++++++++++++++++++++++++++++++++++++++++")
for(i<-list1)
{
	for(j<-1 to i)
	{
		if(i==j*j)
		list2+=i
	}
}
println("List for perfect square"+list2)

}
}

