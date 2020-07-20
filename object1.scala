class Account(acno:Int,name:String,balance:Int,minbal:Int){
//var acno:Int=0;
//var name:String=null; 
//var balance:Int=0;
//var minbal:Int=0;

def viewBal(){
println("balance:"+balance)
}

}

object object1{
def main(args:Array[String]){
var a=new Account(101,"ketaki",15000,500)
println("account number is:"+a.acno)
println("account name is:"+a.name)
println("account balance is:"+a.balance)
println("account min balance is:"+a.minbal)



println("view balance is:"+a.viewBal)

}
}
