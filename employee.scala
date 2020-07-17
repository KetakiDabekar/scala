abstract class EmployeeW {
	def compute()
}
class Worker extends EmployeeW{
	println("Hello3")
	var i,r,h=0
	def accept(){
		println("Enter Worker Id")
		i=scala.io.StdIn.readInt()
		println("Enter Salary per hour")
		r=scala.io.StdIn.readInt()
		println("Enter working hours")
		h=scala.io.StdIn.readInt()
		}
	def compute(){
		var sal=r*h*30
		println("Salary of Worker :"+i+" is "+sal)
		}
	
}
class Manager extends EmployeeW{
	var id,s,i=0
	def accept(){
		println("Enter Manager Id")
		 id=scala.io.StdIn.readInt()
		println("Enter Salary")
		s=scala.io.StdIn.readInt()
		println("Enter incentive")
		i=scala.io.StdIn.readInt()
		}
	def compute(){
		var sal=s+i
		println("Salary of manager "+id+"is"+sal)
	}
}	

object EmpSalDemo{
	def main(args:Array[String]){
		println("Hello1")
		
		println("Hello2")
		var w=new Worker()
		w.accept()
		w.compute()
		var m=new Manager()
		m.accept()
		m.compute()
	}
}	
