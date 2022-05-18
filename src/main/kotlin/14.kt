fun main(args:Array<String>){
    var auth:BaseAuth=Auth();
    auth.showLog();
    auth.login("khadgalovecoding2016@gmail.com","password");
}
abstract class BaseAuth{
    abstract fun login(email:String,password:String);

    fun showLog(){
        println("Showing log...");
    }
}
class Auth:BaseAuth(){
    override fun login(email: String, password: String) {
        println("Login with $email and $password");
    }
}