abstract class Order()
{
var orderid:Int=0
var odescription:String=" ";
}
class PurchaseOrder( var oid:Int,val descrip:String,var sid:Int,var
sname:String,var pno:Long) extends Order()
{
orderid=oid;
odescription=descrip;
def display()
{
println("Order Id:"+orderid);
println("Description:"+odescription);
println("Supplier Id:"+sid);
println("Supplier Name:"+sname);
println("Phone Number:"+pno);
}
}
class SalesOrder(var oid:Int,val descrip:String,var cid:Int,var
cname:String,var pno:Long) extends Order()
{

orderid=oid;
odescription=descrip;

def display()
{

println("Order Id:"+orderid);
println("Description:"+odescription);
println("Customer Id:"+cid);
println("Customer Name:"+cname);
println("Phone Number:"+pno);
}
}
object Slip3
{
def main(args:Array[String])
{
var c1=new SalesOrder(1,"TwoLaptops",200,"XYZ",233221);
var s1=new PurchaseOrder(2,"ThreeComputers",101,"ABC",211231);
println("Purchase Order");
c1.display();
println("Sales Orders");
s1.display();
}
}
