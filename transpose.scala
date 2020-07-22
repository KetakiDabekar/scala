object transpose{
def main(args:Array[String]){
println("Enter the no.of rows:")
var m=scala.io.StdIn.readInt()
println("Enter the no.of columns:")
var n=scala.io.StdIn.readInt()

val a=Array.ofDim[Int](m,n)
println("eneter array elemnets:")
for(i<-0 to m-1;j<-0 to n-1){
a(i)(j)=scala.io.StdIn.readInt()
}
println("enetered array elemnets:")
for(i<-0 to m-1;j<-0 to n-1){
print(s"\t${a(i)(j)}")
if(j==n-1)println()
}

println("transpose of elemets:")
for(j<-0 to n-1;i<-0 to m-1){
print(s"\t${a(i)(j)}")
if(i==m-1)println()
}


}
}
