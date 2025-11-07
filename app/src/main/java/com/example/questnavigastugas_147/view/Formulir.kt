package com.example.questnavigastugas_147.view


import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Modifier

@Composable
fun Form(modifier: Modifier = Modifier,
         onBackBtnClick: () -> Unit = {},
         OnSubmitBtnClick: (String, String, String, String) -> Unit
) {
    var textNama by remember { mutableStateOf("") }
    var textJK by remember { mutableStateOf("") }
    var textStatus by remember { mutableStateOf("") }
    var textAlamat by remember { mutableStateOf("") }

    val gender = listOf("Laki-laki", "Perempuan")
    val status = listOf("Janda", "Lajang", "Duda")
}