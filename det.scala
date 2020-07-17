object det{
def main(args:Array[String]){
println("Size of an array:")
var n=readInt()
val a=Array.ofDim[Int](n,n)
var res=0
val det=0
println("Enter matrix  elements:")
for(i<-0 to n-1;j<-0 to n-1){
a(i)(j)=readInt()
}
println("Matrix elements are:")
for(i<-0 to n-1;j<-0 to n-1){
print(s"${a(i)(j)}")
if(j==n-1)println()
}
res=det(a,n)
println("determinant is"+res)
}

def det(a:Array[Array[Int]],n:Int){
var determinant=0

if(n==2)
{
determinant=a(0)(0)*a(1)(1)-a(0)(1)*a(1)(0)
}
if(n==3)
{
determinant=a(0)(0)*((a(1)(1)*a(2)(2))-(a(2)(1)*a(1)(2)))-a(0)(1)*(a(1)(0)*a(2)(2)-a(2)(0)*a(1)(2))+a(0)(2)*(a(1)(0)*a(2)(1)-a(2)(0)*a(1)(1))
}
}
}
