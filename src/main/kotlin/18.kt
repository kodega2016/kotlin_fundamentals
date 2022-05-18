fun main(args:Array<String>){
    var currentStatus:Status=Status.Active;
    println("Current Status:$currentStatus");
    for (status in Status.values()){
        println("Status:${status.name} ${status.ordinal} ${status.forAdmin}")
    }

}
enum class Status(val forAdmin:Boolean){
    Active(false),
    Inactive(false),
    Rejected(true)
}