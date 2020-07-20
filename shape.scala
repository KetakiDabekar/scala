abstract class shape{
def volume()
def display()
}

class cube extends shape{
val vol=0

def volume(){
println("Enter the lenght:")
var l=scala.io.StdIn.readInt()

vol=l*l*l
}
def display(){
println("Volume of cube is:"+vol)
}

}


object shapetest{
val cu=new cube()
cu.volume()
cu.display()

}
