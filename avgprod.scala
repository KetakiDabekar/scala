import scala.collection.immutable._

object avgprod{
def main(args:Array[String]){

val set1=Set(1,2,3,4)
val set2=Set(5,6,7,8)

val merge=set1++set2
println("Merge Set:"+merge)

val arr=merge.toArray
val n=arr.length

val avg=0
val p=1

for(i<-0 to n-1){
	p=p*arr(i)
	avg=avg+arr(i)
}

println("product is>>>"+p)
println("average is>>>"+avg)
}
}
