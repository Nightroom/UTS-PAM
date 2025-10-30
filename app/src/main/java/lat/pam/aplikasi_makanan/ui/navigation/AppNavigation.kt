package lat.pam.aplikasi_makanan.ui.navigation

import androidx.compose.runtime.Composable
import androidx.navigation.NavType
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import androidx.navigation.navArgument
import lat.pam.aplikasi_makanan.ui.screens.AppShell
import lat.pam.aplikasi_makanan.ui.screens.AuthChoiceScreen
import lat.pam.aplikasi_makanan.ui.screens.CheckoutScreen
import lat.pam.aplikasi_makanan.ui.screens.ConfirmationScreen
import lat.pam.aplikasi_makanan.ui.screens.DetailScreen
import lat.pam.aplikasi_makanan.ui.screens.LoginScreen
import lat.pam.aplikasi_makanan.ui.screens.RegisterScreen
import lat.pam.aplikasi_makanan.ui.screens.SplashScreen

@Composable
fun AppNavigation() {
    val navController = rememberNavController()

    NavHost(
        navController = navController,
        startDestination = Routes.SPLASH
    ) {
        composable(Routes.SPLASH) {
            SplashScreen(navController = navController)
        }

        composable(Routes.AUTH_CHOICE) {
            AuthChoiceScreen(navController = navController)
        }

        composable(Routes.REGISTER) {
            RegisterScreen(navController = navController)
        }

        composable(Routes.LOGIN) {
            LoginScreen(navController = navController)
        }

        composable(
            route = Routes.MAIN,
            arguments = listOf(navArgument("userName") { type = NavType.StringType })
        ) { backStackEntry ->
            val userName = backStackEntry.arguments?.getString("userName")
            AppShell(mainNavController = navController, userName = userName)
        }

        composable(
            route = Routes.DETAIL,
            arguments = listOf(
                navArgument("userName") { type = NavType.StringType },
                navArgument("foodId") { type = NavType.IntType }
            )
        ) { backStackEntry ->
            val userName = backStackEntry.arguments?.getString("userName")
            val foodId = backStackEntry.arguments?.getInt("foodId")
            DetailScreen(navController = navController, userName = userName, foodId = foodId)
        }

        composable(
            route = Routes.CHECKOUT,
            arguments = listOf(navArgument("userName") { type = NavType.StringType })
        ) { backStackEntry ->
            val userName = backStackEntry.arguments?.getString("userName")
            CheckoutScreen(navController = navController, userName = userName)
        }

        composable(
            route = Routes.CONFIRMATION,
            arguments = listOf(navArgument("userName") { type = NavType.StringType })
        ) { backStackEntry ->
            val userName = backStackEntry.arguments?.getString("userName")
            ConfirmationScreen(navController = navController, userName = userName)
        }
    }
}