

object occurance{
def main(args:Array[String]){
println("enter the first string:")
val str1=scala.io.StdIn.readLine()
println("enter the second string:")
val str2=scala.io.StdIn.readLine()
val n=str2.length()
//val res=str1.contains(str2)
val res=str1.substring(n)
println("new strind is:"+res)
val str=res.reverse
println("new strind is:"+str)

}

}
