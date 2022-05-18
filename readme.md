### Kotlin Fundamentals
#### Explore the fundamentals of core kotlin

#### Basic kotlin program
```kotlin
fun main(args:Array<String>){
    println("Kotlin Fundamentals");
}
```

##### Variables[by default variable are null safe in nature]
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

### Functions
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
