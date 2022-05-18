fun main(args:Array<String>){
    println("Collections")

    var roles:Array<String> = arrayOf<String>("admin","publisher","user");
    roles=roles.plus("moderator");
    println("${roles.size}");
    print(roles.toList());

    roles.forEach {
        role->
        run {
            println("User role:$role")
        }
    }

    //List
    var userLists = mutableListOf<String>(
        "kodega","nisma","marjunmer","anish","sunil"
    );

    var subUsers= userLists.subList(0,userLists.size/2);
    println(userLists);
    println(subUsers)

    userLists.add("ram");

    println("kodega" in userLists);

}