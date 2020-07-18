object list2{
def main(args:Array[String]){

val list1=List(2,6,4,5)
val list2=List(3,1,8,9)

println(list1)
println(list2)

val merge=list1++list2
println(merge)

val sort=merge.sorted

println(sort)



}
}
