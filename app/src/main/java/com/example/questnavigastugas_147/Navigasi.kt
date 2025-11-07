package com.example.questnavigastugas_147

import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Scaffold
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.navigation.NavHostController
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import com.example.questnavigastugas_147.view.Awal
import com.example.questnavigastugas_147.view.Form
import com.example.questnavigastugas_147.view.TampilData

enum class Navigasi {
    Homepage,
    Formulirku,
    Detail
}

@Composable
fun DataApp(
    navController: NavHostController = rememberNavController(),
    modifier: Modifier = Modifier
) {
    Scaffold { isiRuang ->
        NavHost(
            navController = navController,
            startDestination = Navigasi.Homepage.name,
            modifier = Modifier.padding(paddingValues = isiRuang)
        ) {
            composable(route = Navigasi.Homepage.name) {
                Awal(
                    OnSubmitBtnClick = {
                        navController.navigate(route = Navigasi.Formulirku.name)
                    }
                )
            }
            composable(route = Navigasi.Formulirku.name) {
                Form(
                    onBackBtnClick = {
                        navController.popBackStack(
                            route = Navigasi.Homepage.name,
                            inclusive = false
                        )
                    },
                    OnSubmitBtnClick = { nama, jk, status, alamat ->
                        navController.navigate("Detail/$nama/$jk/$status/$alamat")
                    }
                )
            }
            composable(
                route = "Detail/{nama}/{jk}/{status}/{alamat}"
            ) { backStackEntry ->
                val nama = backStackEntry.arguments?.getString("nama") ?: ""
                val jk = backStackEntry.arguments?.getString("jk") ?: ""
                val status = backStackEntry.arguments?.getString("status") ?: ""
                val alamat = backStackEntry.arguments?.getString("alamat") ?: ""

                TampilData(
                    nama = nama,
                    jk = jk,
                    status = status,
                    alamat = alamat,
                    onBackBtnClick = {
                        navController.popBackStack(
                            route = Navigasi.Formulirku.name,
                            inclusive = false
                        )
                    },
                    OnSubmitBtnClick = {
                        navController.navigate(route = Navigasi.Homepage.name) {
                            popUpTo(Navigasi.Homepage.name)
                            launchSingleTop = true
                        }
                    }
                )
            }
        }
    }
}
