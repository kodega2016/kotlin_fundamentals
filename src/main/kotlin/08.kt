fun main(args:Array<String>){
    println("Class")

    var user:User=User("Khadga","Shrestha",25);
    user.fname="Kumar Kanta";
    println(user.fullName);
    println(user.fname);
    user.showInfo();
}

class User(var fname:String,var lname:String,var age:Int){

    var fullName:String="$fname $lname";

    fun showInfo():Unit{
        println("Name:$fullName Age:$age");
    }
}