fun main(args:Array<String>){
    var mazda:Car=Car("mazda");
    var mazdaEngine=mazda.Engine("rotary");
    println(mazdaEngine.toString())
}

class Car(val name:String){
    inner class Engine(val engineName:String){
        override fun toString(): String {
            println("$name has $engineName")
            return super.toString()
        }
    }
}