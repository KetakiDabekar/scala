object slip9{
def main(args:Array[String]){
var max=0
var key=""
val map=Map("ketaki"->67,"shivali"->76,"abrar"->87,"rohit"->45,"akshay"->50)

for((k,v)<-map)
{
if(v>max)
{
	max=v
	key=k
}
}
println("name of student:"+key+"high percentage:"+max)

}
}
