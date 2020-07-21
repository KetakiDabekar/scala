object slip6{
def reverse(ch:Char):Char=
{
	if(ch.isLower)
		ch.toUpper
		
	else
		ch.toLower
}

def main(args:Array[String]){

println("Enter the string:")
val str=scala.io.StdIn.readLine()

val str1=new StringBuilder(str)
println("Enter the chracter:")
val ch=scala.io.StdIn.readChar()

str1.deleteCharAt(str1.indexOf(ch.toString()))

var str2=str1.deleteCharAt(str1.lastIndexOf(ch.toString())).toString

var str3=str2.map(reverse)
println(str3)
}
}
/*
object timepass{
def reverse(ch:Char):Char=
{
	if(ch.isLower)
		ch.toUpper
	else
		ch.toLower
}

def main(args:Array[String])
{
println("Enter a string:")
var str=scala.io.StdIn.readLine()
var str1=new StringBuilder(str)
println("Enter the character:")
var ch=scala.io.StdIn.readChar()

str1.deleteCharAt(str1.indexOf(ch.toString()))
var str2=str1.deleteCharAt(str1.lastIndexOf(ch.toString())).toString()
println(str2.map(reverse(_)))
}
}
*/
