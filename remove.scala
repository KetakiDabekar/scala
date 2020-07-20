object remove{
def main(args:Array[String]){
println("Enter the first string:")
val m=readLine()
println("Enter the second string:")
val n=readLine()
val res=m.replaceAll(n,"")
println("new string:"+res)
}
}
