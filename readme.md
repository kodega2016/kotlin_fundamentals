### Kotlin Fundamentals
#### Explore the fundamentals of core kotlin

#### Basic kotlin program
```kotlin
fun main(args:Array<String>){
    println("Kotlin Fundamentals");
}
```

#### Variables[by default variable are null safe in nature]
In kotlin variables are declared using var and val with its type,
var is used to define mutable variable whereas val is used to define a variable as constant.

```kotlin
var name:String="Khadga Shrestha";
//Here we have define a variable name with the type String
var age:Int=25;
val gender:String="Male";
//gender="Female";
//Here we cannot assign a new value to the gender because it is constant in its nature.
```
We can also define a variable that can hold null value as
```kotlin
var isMarried:Boolean?=null;
```
We have null safe operator ? to perform operation with null safety.
```kotlin
var message:String?=null;
println("Message Count:${message?.length?:0}");
//Here ?: is the Elvis Operator.
```

#### Pairs and Tripples
In kotlin we can define 2D and 3D grid with pair and triple
```kotlin
//Pairs And Triples
var winner:Pair<String,String> = Pair("Ram","Sita");
println(winner);
println(winner.first);
println(winner.second);
println(winner.toList())
val (winnerOne,winnerTwo)=winner;
println("Winner One:$winnerOne");
println("Winner Two:$winnerTwo");

var tripple:Triple<Int,Int,Int> = Triple(10,2,52);
println(tripple);
val (x,y,z)=tripple;
//Destructing the values from the triple
println("$x $y $z");
```

#### Basic control flow

##### if else statement
```kotlin
var isAdmin:Boolean=true;
if(isAdmin){
    println("User is admin.");
}else{
    println("User is regular user.")
}
```

#### Ranges
```kotlin
var scalingRange=0..10;
for (i in scalingRange){
    println(i)
}
```

#### When expression
```kotlin
var myChar='C';
when(myChar){
    'A','C'->println("My char is A or C")
    'B'-> println("My chat is B")
    else-> println("Missed the target")
}
```
We can also return value from when express as
```kotlin
var mySymbol="AA";
var result:String=when(mySymbol){
    "AA"->"Got AA"
    "BB"->"Got BB"
    else->"Missed the target"
}
println("Result:$result");
```

#### Functions
In kotlin,We can define function using fun keyboard as
```kotlin
fun greet():Unit{
    println("Welcome...");
}
//By default the return type of this fun is Void[Unit]
```
We can pass the params to the fun as 
```kotlin
fun  greetUser(name:String){
    println("Greeting $name");
}
```
Function with params and return type
```kotlin
fun getUserInfo(name:String):String{
    return "Mr.$name";
}
```
#### Function overloading
Here we can define more than one function with same name but the params or return type should be different.
```kotlin
fun greet():Unit{
    println("Welcome...");
}
fun greet(name:String){
    println("Welcome $name");
}
//Calling the two different fun with required params
greet();
greet("Khadga Shrestha")
```

#### Nullability
In kotlin,variable by default non nullable but we can define null type also
And we have null safe(?.) and null assertion(!!.) operator.
```kotlin
var errorCode:Int?;
errorCode=null;
println(errorCode)
println(errorCode.toString()?:"No Error")
var userRole:String?;
userRole="admin";
println(userRole!!.isEmpty());
```
##### let() function
We can use let() to perform type safe operation
```kotlin
userRole?.let {
println("User:${userRole}")
}
```
##### Elvis Operator
Used to provide default value 
```kotlin
var role:String?=null;
println("User role is ${role?:"user"}")
```

#### Arrays And Lists
Array can be define as
```kotlin
var roles:Array<String> = arrayOf<String>("admin","publisher","user");
roles=roles.plus("moderator");
println("${roles.size}");
print(roles.toList());
```
We can iterate over array as
```kotlin
roles.forEach {
    role->
    run {
        println("User role:$role")
    }
}
```

#### List
```kotlin
var userLists:List<String> = listOf<String>(
    "kodega","nisma","marjunmer","anish","sunil"
);
var subUsers= userLists.subList(0,userLists.size/2);
println(userLists);
println(subUsers)
```

#### Map
key-value pair 
```kotlin
var userInfo= mutableMapOf<String,Any>(
    "name" to "Khadga",
    "age" to 25
);

//userInfo["gender"]="Male";
userInfo.set("gender","Male");
println(userInfo)
println(userInfo["name"]);
println(userInfo.entries);
println(userInfo.get("age"));
println(userInfo.get("status"));
```
Accessing the value of the map
```kotlin
for((key,value) in userInfo){
    println("$key $value");
}
```

#### Sets
unique values of types
```kotlin
var memberInfo= mutableSetOf<String>("kumar","hari","nisma","kumar");
memberInfo.add("gopal");
memberInfo.add("kumar");
println(memberInfo);
```

#### Anonymous function
```kotlin
var getSum:(Int,Int)->Int={
    a:Int,b:Int->a+b
};
```

#### Class
Class can be created using class keyword as 
```kotlin
class User(var fname:String,var lname:String,var age:Int){
    var fullName:String="$fname $lname";
    
    fun showInfo():Unit{
        println("Name:$fullName Age:$age");
    }
}
```
Here the properties of the User is mutable.To create 
immutable properties we need to define properties as val
```kotlin
class User(val fname:String,val lname:String,val age:Int){
    var fullName:String="$fname $lname";
    
    fun showInfo():Unit{
        println("Name:$fullName Age:$age");
    }
}

```

#### Data class
Can be implemented as
```kotlin
data class UserInfo(val name:String,val age:Int);

var user1=UserInfo("Khadga Shrestha",25);
var user2=user1.copy(name="Rameshow shrestha");

println(user1)
println(user2)
println(user1==user2)

val (name,age)=user1;
println("Name:$name Age:$age")
```

#### Object type[static member]
Kotlin provide object to create singleton as 
```kotlin
object UserRepo{
    val allUsers= mutableListOf<String>();
    fun getUsers():List<String>{
        return allUsers;
    }
    fun addUser(user:String):Unit{
        allUsers.add(user);
    }
}

UserRepo.addUser("Khadga Shrestha");
UserRepo.addUser("Hari Kumar Udasi");
var users=UserRepo.getUsers();
println(users);

```

#### Object type field only[static member]
```kotlin
class AppUser{
    companion object Factory{
        var supportedDevice:List<String> = listOf<String>("android","ios");
    }
}
var devices=AppUser.supportedDevice;
println("Devices:$devices");
```

#### Class and its properties
We can declare properties of the class as follows and also can pass default value,provide custom getter and setter.
```kotlin
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

```

#### Extension properties
We can extend the properties of the class as
```kotlin
class Circle(val radius:Double)

val Circle.area:Double
    get(){
        return Math.PI*Math.pow(radius,2.0);
    }

var c:Circle=Circle(10.0);
println(c.area)
```

#### Extension methods
We can extend the additional functionality by adding extension function as
```kotlin
class Circle(val radius:Double){
}

fun Circle.getInfo():String{
    return "Circle of Radius $radius";
}
println(c.getInfo())
```

#### Inheritance
Inheriting the properties and methods from one class to another can be achieved as following 
```kotlin
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

var admin:Admin=Admin("Khadga Shrestha","khadgalovecoding2016@gmail.com","admin");
var staff:Staff=Staff("Menuka Shrestha","menuka@gmail.com",12);

println(admin.showInfo());
println( staff.showInfo());

```

#### Polymorphism
Treat object based on the context
```kotlin
fun getUserInfo(user:Admin){
    var info=user.showInfo();
    println(info)
}
fun getUserInfo(user:Staff){
    var info=user.showInfo();
    println(info)
}

var admin:Admin=Admin("Khadga Shrestha","khadgalovecoding2016@gmail.com","admin");
var staff:Staff=Staff("Menuka Shrestha","menuka@gmail.com",12);

getUserInfo(admin);
getUserInfo(staff);
```