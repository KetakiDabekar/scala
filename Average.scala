object Average{
def main(args:Array[String]){
var c=0
var d=0
println("Enter the first number:")
var a=scala.io.StdIn.readInt()
println("Enter the second number:")
var b=scala.io.StdIn.readInt()
d=b-a
for(i<- a to b)
{
c+=i
}
c=c/d
println("average is: "+c)
}
}
