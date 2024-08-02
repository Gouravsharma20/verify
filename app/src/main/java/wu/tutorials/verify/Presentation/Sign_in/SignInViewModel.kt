package wu.tutorials.verify.Presentation.Sign_in

import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.asStateFlow
import kotlinx.coroutines.flow.update

public final class SignInViewModel {
    private val _state = MutableStateFlow(SignInState())
    val state = _state.asStateFlow()

    fun onSignInResult(result: SignInResult) {
        _state.update { it.copy(
            isSignInSuccessful = result.data !=null,
            signInError = result.errorMessage
        ) }
    }
    fun resetState() {
        _state.update { SignInState() }
    }
}