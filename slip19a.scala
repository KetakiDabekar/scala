object slip19a{
def main(args:Array[String]){
println("create list using Lisp styel:")
val list1=100::29::34::Nil
println("lisp style list:"+list1)

println("create list using java style:")
val list2=List[Double](8.5,2.9,6.456,7.12355)
println("java style list:"+list2)

println("create list using fill style:")
val list3=List.fill(4)("aditya")
println(list3)

println("create list using range style:")
val list4=List.range(63,70)
println(list4)

println("create list using tabulate style:")
val list5=List.tabulate(6)(n=> n*n)
println(list5)

}
}
