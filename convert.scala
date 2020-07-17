object convert{
def main(args:Array[String]){
println("Enter a string")
val s=readLine()
var cnt=0
var n=s.length
for(i<- 0 to n-1){
	if(s(i)>='A' && s(i)<='Z')
	{
		cnt+=1
	}
}
println("Uppercase count is"+cnt)
val s1=s.toLowerCase()
println("new string is:"+s1)
}
}
