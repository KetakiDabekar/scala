object slip13{
def main(args:Array[String]){
val set1=Set(2,7,8,22,56)
val set2=Set(67,34,12,11,10)
println(set1)
println(set2)
val merge=set1++set2
println(merge)

//val arr=merge.toArray

//val n=arr.length
var sum=0
for(i<-merge){
	sum+=i
}
println("sum of merge sort:"+sum)

println(merge.max)
println(merge.min)
}
}

