fun main(args:Array<String>){
    println("Object Types")

    UserRepo.addUser("Khadga Shrestha");
    UserRepo.addUser("Hari Kumar Udasi");

    var users=UserRepo.getUsers();
    println(users);
    var devices=AppUser.supportedDevice;
    println("Devices:$devices");

}

class AppUser{
    companion object Factory{
        var supportedDevice:List<String> = listOf<String>("android","ios");
    }
}



object UserRepo{
    val allUsers= mutableListOf<String>();
    fun getUsers():List<String>{
        return allUsers;
    }
    fun addUser(user:String):Unit{
        allUsers.add(user);
    }
}