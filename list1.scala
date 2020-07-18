object list1{
def main(args:Array[String]){

println("List using Lisp style:")
val list1=1::2::3::Nil
println(list1)

println("List using java style:")
val list2=List(1,2.0D,5.67F)
println(list2)

println("List using range style:")
val list3=List.range(1,10,3)
println(list3)

println("List using fill style:")
val list4=List.fill(5)("Aaransh")
println(list4)

println("List using tabulated style:")
val list5=List.tabulate(6)(m=> m+m)
println(list5)

}
}
