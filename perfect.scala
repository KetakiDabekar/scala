object perfect{
def main(args:Array[String]){
var rem,sum=0
val r=scala.util.Random
for(i<- 1 to 5){
var a=r.nextInt(10)
println(a)
for(i<- 1 to a-1)
{
rem=a%i
if(rem==0)
{
sum+=i
}
}
if(sum==a)
	println("numebr is perfect")
else
	println("numebr is not perfect")
}

}
}
