object slip8{
def main(args:Array[String]){
val array=Array("Today","Tomorrow","sunday")
for(a<- array){
println(a)
}

println("Enter a new string you want to entered:")
val str=scala.io.StdIn.readLine()
val b=array:+str
for(i<-b)
println(b)


}
}
