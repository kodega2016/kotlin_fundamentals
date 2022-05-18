fun main(args:Array<String>){
    println("Sealed class");
    //var authState:AuthState=AuthState.Authenticated("userID");
    var authState:AuthState=AuthState.Authenticating();
    when(authState){
        is AuthState.Authenticating-> println("Authenticating...")
        is AuthState.Authenticated-> println("Authenticated ${authState.userID}")
        is AuthState.AuthError-> println("AuthError...")
        is AuthState.Unauthenticated -> println("UnAuthenticated...")
    }
}

sealed class AuthState{
    class Unauthenticated:AuthState()
    class Authenticating:AuthState()
    class Authenticated(val userID:String):AuthState()
    class AuthError():AuthState();
}