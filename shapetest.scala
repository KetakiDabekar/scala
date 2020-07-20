abstract class shape{
def volume()
def display()
}

class cube extends shape{
var vol=0

	def volume(){
		println("Enter the lenght:")
		var l=scala.io.StdIn.readInt()

		vol=l*l*l
	}
	def display(){
		println("Volume of cube is:"+vol)
	}
}

class cylinder extends shape{
var vol=0.0

def volume(){
println("Enter the radius for cylinder:")
var r=scala.io.StdIn.readInt()
println("Enter the height for cylinder:")
var h=scala.io.StdIn.readInt()
 
vol=3.14*r*r*h
}
def display(){
println("Volume for cylinder is:"+vol)
}


}


object shapetest{
def main(args:Array[String]){
val cu=new cube()
val cy=new cylinder()

cu.volume()
cu.display()

cy.volume()
cy.display()
}
}
