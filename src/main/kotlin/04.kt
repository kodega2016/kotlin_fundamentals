fun main(args:Array<String>){
    println("Nullability")
    var errorCode:Int?;
    errorCode=null;
    println(errorCode)
    println(errorCode.toString()?:"No Error")
    var userRole:String?;
    userRole="admin";
    println(userRole!!.isEmpty());

//    userRole=null;

    var uRole:String?;

    userRole?.let {
        println("User:${userRole}")
    }

    var role:String?=null;
    println("User role is ${role?:"user"}")
}