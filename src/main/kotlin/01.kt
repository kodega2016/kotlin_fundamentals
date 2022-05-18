fun main(args:Array<String>){
    println("Kotlin Fundamentals");

    //Variables
    var name:String="Khadga Shrestha";
    var age:Int=25;
    val gender:String="Male";
    var isMarried:Boolean?=null;
    var message:String?=null;
    //gender="Female";

    println("Name:$name");
    println("Age:$age")
    println("Gender:$gender");
    println("IsMarried:$isMarried");
    println("Message Count:${message?.length?:0}");

    //Data Types
    var userName:String="kodega2016";
    var userAge:Int=25;
    var isActive:Boolean=false;
    var salary:Double=40000.0;
    var myChar:Char='K';

    println("User name:${userName::class.java.typeName}");




}