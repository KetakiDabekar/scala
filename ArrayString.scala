object ArrayString{
def main(args:Array[String]){
val a=Array("Today","is")
println("Array elements:")
for(e<-a)
println(e)
println("Enter a new string:")
val m=readLine()
val b=a:+m
println("all strings in array:")
for(e<-b)
println(b)
}
}
