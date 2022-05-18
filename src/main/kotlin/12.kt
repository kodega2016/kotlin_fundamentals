fun main(args:Array<String>){
    var c:Circle=Circle(10.0);
    println(c.area)
    println(c.getInfo())
}
class Circle(val radius:Double){
}

val Circle.area:Double
    get(){
        return Math.PI*Math.pow(radius,2.0);
    }

fun Circle.getInfo():String{
    return "Circle of Radius $radius";
}