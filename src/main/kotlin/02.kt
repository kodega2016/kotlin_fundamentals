fun main(args:Array<String>){
    println("control flow");

    var isAdmin:Boolean=true;
    if(isAdmin){
        println("User is admin.");
    }else{
        println("User is regular user.")
    }


    var scalingRange=0..10;
    for (i in scalingRange){
        println(i)
    }

    var myChar='C';

    when(myChar){
        'A','C'->println("My char is A or C")
        'B'-> println("My chat is B")
        else-> println("Missed the target")
    }
    var mySymbol="AA";
    var result:String=when(mySymbol){
        "AA"->"Got AA"
        "BB"->"Got BB"
        else->"Missed the target"
    }
    println("Result:$result");
}