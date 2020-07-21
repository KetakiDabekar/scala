abstract class order(){
var oid=0
var odesc=" "
}
class purchaseOrder(var id:Int,var desc:String,var pid:Int,var pname:String,var pno:Long)extends order(){
oid=id
odesc=desc

	def display(){
		println("Id of order:"+oid)
		println("describtion of order:"+odesc)
		println("supplier Id:"+pid)
		println("supplier name:"+pname)
		println("supplier phone no:"+pno)
	}
}
class saleOrder(var id:Int,var desc:String,var cid:Int,var cname:String,var cno:Long)extends order(){
oid=id
odesc=desc

	def display(){
		println("Id of order:"+oid)
		println("descibtion of order:"+odesc)
		println("customer Id:"+cid)
		println("customer name:"+cname)
		println("customer no:"+cno)
	}
}
object slip3a{
def main(args:Array[String]){
var po=new purchaseOrder(101,"Threecomputer",1110,"sumit",898976)
po.display()
var so=new saleOrder(220,"Onecomputer",1023,"ketaki",909087)
so.display()
}
}
