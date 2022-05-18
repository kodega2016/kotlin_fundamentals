fun main(args:Array<String>){
    println("Maps and Sets")


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

    for((key,value) in userInfo){
        println("$key $value");
    }

    var memberInfo= mutableSetOf<String>("kumar","hari","nisma","kumar");
    memberInfo.add("gopal");
    memberInfo.add("kumar");
    println(memberInfo);

}