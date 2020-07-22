object slip16{

def lower(ch:Char):Char=(ch.toByte+32).toChar 
def upper(ch:Char):Char=(ch.toByte-32).toChar

def reverse(ch:Char):Char=
{
	if(ch>='A' && ch<='Z')
		lower(ch)
	else
		upper(ch)
	
}
def main(args:Array[String]){
println("Enter the string:")
var str=scala.io.StdIn.readLine()

println(str.map(reverse(_)))
}
}
