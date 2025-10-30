package lat.pam.aplikasi_makanan.data

import androidx.compose.runtime.mutableStateListOf

data class User(val fullName: String, val email: String, val password: String)

object UserDataStore {
    private val _users = mutableStateListOf<User>()

    fun registerUser(user: User): Boolean {
        // Cek jika email sudah ada
        if (_users.any { it.email == user.email }) {
            return false // Registrasi gagal
        }
        _users.add(user)
        return true // Registrasi berhasil
    }

    fun validateUser(email: String, password: String): User? {
        return _users.find { it.email == email && it.password == password }
    }
}