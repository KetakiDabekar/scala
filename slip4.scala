
object slip4{
def main(args:Array[String]){
println("Enter number of rows:")
var r=scala.io.StdIn.readInt()
println("Enter number of columns:")
var c=scala.io.StdIn.readInt()
val mat=Array.ofDim[Int](r,c)
println("Enter the matrix elements:")

for(i<- 0 to r-1;j<-0 to c-1)
{
mat(i)(j)=scala.io.StdIn.readInt()
}

println("matrix elements are")
for(i<- 0 to r-1;j<- 0 to c-1)
{
println(s"${mat(i)(j)}")
if(j==c-1)
println()
}
println("transpose of matrix is:")
for(j<-0 to c-1;i<- 0 to r-1)
{
println(s"${mat(i)(j)}")
if(i==r-1)
println()
}

var isLower=true

for(i<- 0 to r-1 ){
for(j<-0 to c-1){
if(i<j){
	if(mat(i)(j)!=0)
	isLower=false
}
}
}
if(isLower==true)
	println("It is lower traingular")
else
	println("It is not lower traingular")
}
}
