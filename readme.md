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
