object Upper{
def main(args:Array[String]){
	println("enter the size pf matrix")
	var n=readInt();
	val A=Array.ofDim[Int](n,n)
	println("Enter the array elements:")
	for(i<-0 to n-1;j<-0 to n-1)
	{
		A(i)(j)=readInt()
	}
	println("Array elements are:")
	for(i<-0 to n-1;j<-0 to n-1)
	{
		print(s"\t${A(i)(j)}")
		if(j==n-1)print("\n")
	}
	if(mat(A,n))
		println("matrix is upper traingular")
	else
		println("matrix is not upper traingular")
}
def mat(A:Array[Array[Int]],n:Int):Boolean=
{
for(i<-1 to n-1;j<-0 to i-1)
if(A(i)(j)!=0){
return false
}
return true
}
}

