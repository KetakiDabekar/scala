object factorail{
def main(args:Array[String]){
printf("Enter the number for factorail:")
var a=scala.io.StdIn.readInt()
var fact=1
for(i<- 1 to a)
{
fact*=i
}
println("factorail of number:"+fact)

}
}
