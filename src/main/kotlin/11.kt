fun main(args:Array<String>){
    println("class properties");
    var c1:Contact=Contact(name="Khadga Bahadur Shrestha",role="Admin");
    var c2:Contact=Contact(name="Arjun Shrestha");
    println("${c1.name} ${c1.role}")
    println("${c2.name} ${c2.role}")
    println(c1.demoMessage)
}

class Contact(val name:String,val role:String="User"){
    var demoMessage:String
        get() {
            return "Hey";
        }
        set(value){}

    init{
        println("Init")
    }
}