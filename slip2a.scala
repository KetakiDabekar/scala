object slip2a{
def main(args:Array[String]){
	var no=scala.util.Random
	for(i<- 0 to 4)
	{
	var no1=no.nextInt(10)
	bin(no1)
	oct(no1)
	}
}
def bin(n:Int)
{
	var a=new Array[Int](4)
	var n1=n
	var i=0
	while(n1>0)
	{
		a(i)=n%2
		n1=n1/2
		i=i+1
	}
	println("Binary of this:"+n+"is")
	val b=a.reverse
	for(e<-b)
	print(e)
	println()
}
def oct(m:Int)
{
	var a=new Array[Int](4)
	var n1=m
	var i=0
	while(n1>0)
	{
		a(i)=m%8
		n1=n1/8
		i=i+1
	}
	println("octal number of:"+m+"is")
	var b=a.reverse
	for(e<-b)
	print(e)
	println()
}
}
