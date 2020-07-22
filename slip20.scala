import scala.util._
object slip20{
def main(args:Array[String]){
var l1:List[Int]=List()
var l2:List[Int]=List()
var n1=0
for(i<-1 to 10 )
{
	l1::=Random.nextInt(10)
}
println("list one:"+l1.sorted)

for(j<-l1)
{

n1=3*j*j+4*j+6
l2::=n1
}
println("second list:"+l2.sorted)
}
}


