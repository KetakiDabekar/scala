object count{
def main(args:Array[String]){
println("Enter a string:")
val s=readLine()
println("Enter a character:")
var n=readChar()
var count=0

for(e<-s){
if(e==n){
count+=1
}
}
println("no.of character that occur is="+count)
}
}
