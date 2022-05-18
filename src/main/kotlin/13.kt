fun main(){
    println("Inheritance");

    var admin:Admin=Admin("Khadga Shrestha","khadgalovecoding2016@gmail.com","admin");
    var staff:Staff=Staff("Menuka Shrestha","menuka@gmail.com",12);

    println(admin.showInfo());
    println( staff.showInfo());

    getUserInfo(admin);
    getUserInfo(staff);

}

fun getUserInfo(user:Admin){
    var info=user.showInfo();
    println(info)
}
fun getUserInfo(user:Staff){
    var info=user.showInfo();
    println(info)
}

open class Person(var name:String,var email:String){
    open fun showInfo():String{
        return "Name:$name Email:$email";
    }
}

class Admin(name:String,email:String,val role:String):Person(
    name,email
);
class Staff(name:String,email:String,val score:Int):Person(name,email){
    override fun showInfo():String{
        super.showInfo();
        return "Staff name:$name with $score point";
    }
}