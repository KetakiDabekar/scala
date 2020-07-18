object Intersect{
def main(args:Array[String]){
val name1=Set("ketaki","shivali","aaransh")
val name2=Set("ketaki","gayatri","aaransh","amit")
println("set1:"+name1)
println("set2:"+name2)

var seti=name1.intersect(name2)
println("common="+seti)
}

}
