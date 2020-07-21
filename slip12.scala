object slip12{
def main(args:Array[String]){
println("Enter the no.of rows in matrix1:")
var r1=scala.io.StdIn.readInt()
println("Enter the no.of coloumns in matrix1:")
var c1=scala.io.StdIn.readInt()

println("Enter the no.of rows in matrix2:")
var r2=scala.io.StdIn.readInt()
while(c1!=r2)
{
println("no.of columns of matrix1 no.of rows of matrix 2 are not equal try again")

}
println("Enter the no.of coloumns in matrix2:")
var c2=scala.io.StdIn.readInt()

val mat1=Array.ofDim[Int](r1,c1)
val mat2=Array.ofDim[Int](r2,c2)
val result=Array.ofDim[Int](r1,c2)

println("Entre elements of matrix1:")
for(i<-0 to r1-1;j<-0 to c1-1)
{
mat1(i)(j)=scala.io.StdIn.readInt()
}

println("Enter elements of matrix2:")
for(i<-0 to r2-1;j<-0 to c2-1)
{
mat2(i)(j)=scala.io.StdIn.readInt()
}

println("elements of matrix1:")
for(i<-0 to r1-1;j<-0 to c1-1)
{
println(s"${mat1(i)(j)}")
if(j==c1-1)println()
}


println("elements of matrix2:")
for(i<-0 to r2-1;j<-0 to c2-1){
println(s"${mat2(i)(j)}")
if(j==c2-1)println()
}


for(i<-0 to r1-1;j<-0 to c2-1){
result(i)(j)=0
}

for(i<-0 to r1-1){
for(j<-0 to c2-1){
for(k<-0 to c1-1){
result(i)(j)+=mat1(i)(k)*mat2(k)(j)

}
}
}

println("multiplication matrix is:")
for(i<-0 to r1-1;j<-0 to c2-1)
{
println(s"${result(i)(j)}")
if(j==c2-1)println()
}

}
}

