package wu.tutorials.verify.Presentation.Sign_in

data class SignInState(
    val isSignInSuccessful : Boolean = false
    ,val signInError:String? = null
)
