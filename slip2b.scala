import scala.util.control._
object slip2b{
def main(args:Array[String])
{
println("Enter the value for n1:")
var n1=scala.io.StdIn.readInt()
println("Enter the value for n1:")
var n2=scala.io.StdIn.readInt()
var loop=new Breaks
var i,count,sum=0
var n=0
for(i<- n1 to n2)
{
count=0
loop.breakable{
for(j<-2 to i/2)
{
if(i%j==0)
{
count+1
loop.break
}

}
if(count==0)
{
	sum=sum+i
	n=n+1
}
}
}

println("sum of prime numbers:"+sum)
println("total prime number in between n1:"+n1+"and n2:"+n2+"is"+n)
var avg=sum/n
println("avarage of prime numbers:"+avg)

}
}
