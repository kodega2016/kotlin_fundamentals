fun main(args:Array<String>){
    println("Anonymous functions")
    println(getSum(10,20));
}

var getSum:(Int,Int)->Int={
    a:Int,b:Int->a+b
};