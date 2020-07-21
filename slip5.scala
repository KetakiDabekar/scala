object slip5{
def main(args:Array[String]){

val set1=Set("aniket","abrar","akshay","rohit","shivam","amit","ram","seeta")
val set2=Set("shivali","gayatri","saloni","aaransh","ketaki","ram","amit","seeta")

var set3=set1.diff(set2)
println(set1)
println(set2)
println(set3)
println("++++++++++++++++++++++++++++++++++")
var set4=set2.diff(set1)
println(set1)
println(set2)
println(set4)
println("++++++++++++++++++++++++++++++++++")
var result=set3++set4
println(result)


}
}
