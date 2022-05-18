fun main(args:Array<String>){
    println("Secondary constructor...")

    var info:Info=Info("Loading....");
    info.showLog();

}

class Info{
    lateinit var message:String;

    constructor(msg:String){
        message=msg;
        println("This is a constructor");
    }

    fun showLog(){
        println("Message:$message")
    }
}