object arraystring{
def main(args:Array[String]){
val arr=Array("today","monday")
println("array elements are:")
for(e<-arr)
println(e)
println("enter a string:")
val m=scala.io.StdIn.readLine()
val b=arr:+m
println("Now array is:")
for(e<-b)
println(e)
}
}
