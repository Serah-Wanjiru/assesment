fun main() {
    var a=name("serah","mercy")
    println(a[1])
    non("serah")
    var c=serah("ann","mary","joy","esther","maria")
    println(c)
    calculator(34,56)


}
fun name(name1:String,name2:String):String{
    return name1
}
fun numbers(num1: Int,num2: Int,num3: Int):Int{
    var m= arrayOf(num1,num2,num3)

}



fun non(Name:String){
    println(Name[0])
    println(Name[1])
    println(Name[2])
    println(Name[3])
    println(Name[4])



}
fun serah(name1: String,name2: String,name3: String,name4: String,name5: String):String{
    var naME= arrayOf("name1,","name2","name3","name4","name5")
    return naME.contentToString()

}
fun calculator(num1:Int,num2: Int){
    var n=num1+num2
    println(n)
    var k=num2-num1
    println(k)
    var z=num2%num1
    println(z)
    var h=num2*num1
    println(h)

}