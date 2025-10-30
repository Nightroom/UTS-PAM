package lat.pam.aplikasi_makanan

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import lat.pam.aplikasi_makanan.ui.navigation.AppNavigation
import lat.pam.aplikasi_makanan.ui.theme.Aplikasi_makananTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            Aplikasi_makananTheme {
                AppNavigation()
            }
        }
    }
}
