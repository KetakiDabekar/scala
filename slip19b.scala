import scala.collection.mutable.ListBuffer
object slip19b{
def main(args:Array[String]){
var list1=new ListBuffer[Int]
var list2=new ListBuffer[Int]

for(i<- 0 to 50){
var b=2*i+3
list1+=b
}
for(a<- list1)
{
	if(a%5!=0)
	{
		list2+=a
	}	

}
println(list1)
println(list2)
}
}

/*
object timepass{
def main(args:Array[String])
{
var l1:List[Int]=List()
var l2:List[Int]=List()
var n=0
for(i<- 0 to 50)
{
	n=2*i+3
	l1::=n
}
println("first list is:"+l1.sorted)
for(i<-l1)
{
	if(i%5!=0)
	{
		l2::=i
	}
}
println("second list:"+l2)
}

}
*/
