fun main(args:Array<String>){
    println("interfaces")

    var cycle:Vehicle=Cycle();
    cycle.start();
    cycle.stop();

}
interface Vehicle{
    fun start()
    fun stop()
}

class Cycle:Vehicle{
    override fun start(){
        println("Start...")
    }

    override fun stop() {
        println("Stop...")
    }
}