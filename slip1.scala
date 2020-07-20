object slip1{
def main(args:Array[String])
{
var map1=Map("ketaki"->"computer","mr.joshi"->"computer","saloni"->"maths","gauri"->"ele")

for((k,v)<-map1)
{
	if(v.equalsIgnoreCase(map1("mr.joshi")))
		println("name:"+k+"departmant"+v)
}
}

}

