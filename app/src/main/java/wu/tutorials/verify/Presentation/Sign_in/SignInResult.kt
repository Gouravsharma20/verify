package wu.tutorials.verify.Presentation.Sign_in

import android.service.autofill.UserData

data class SignInResult(val data:wu.tutorials.verify.Presentation.Sign_in.UserData?
,val errorMessage:String?
)

data class UserData(val userId:String,
                    val userName:String?
                    ,val profilePictureUrl:String?
)
