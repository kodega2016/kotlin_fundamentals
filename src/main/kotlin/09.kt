fun main(args:Array<String>){
    println("data class".uppercase());

    var user1=UserInfo("Khadga Shrestha",25);
    var user2=user1.copy(name="Rameshow shrestha");

    println(user1)
    println(user2)
    println(user1==user2)

    val (name,age)=user1;
    println("Name:$name Age:$age")


}

data class UserInfo(val name:String,val age:Int);