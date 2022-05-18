fun main(args:Array<String>){
    println("Functions");

    greet();
    greet("Khadga Shrestha")
    greetUser("Nisma");
    println(getUserInfo("Khadga Shrestha"))

}
fun greet():Unit{
    println("Welcome...");
}
fun greet(name:String){
    println("Welcome $name");
}
fun  greetUser(name:String){
    println("Greeting $name");
}
fun getUserInfo(name:String):String{
    return "Mr.$name";
}

