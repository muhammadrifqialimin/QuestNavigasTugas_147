package com.example.questnavigastugas_147.view

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.questnavigastugas_147.R

@Composable
fun Awal(
    modifier: Modifier = Modifier,
    OnSubmitBtnClick: () -> Unit
) {
    Column(
        modifier = modifier
            .fillMaxSize()
            .padding(horizontal = 16.dp, vertical = 15.dp),
        horizontalAlignment = Alignment.CenterHorizontally,
        verticalArrangement = Arrangement.Center
    ){
        Text(
            text = "Selamat Datang",
            fontSize = 42.sp,
            fontWeight = FontWeight.Bold,
            color = Color(0xFFD32F2F),
            textAlign = TextAlign.Center
        )
        Spacer(modifier = Modifier.height(70.dp))
        Image(
            painter = painterResource(id = R.drawable.elxixec),
            contentDescription = "Logo CARD-LIST",
            modifier = Modifier
                .size(180.dp)
                .padding(4.dp)
        )
        Spacer(modifier = Modifier.height(70.dp))
        Column(horizontalAlignment = Alignment.CenterHorizontally) {
            Text(
                text = "Muhammad Rifqi Alimin",
                fontSize = 20.sp,
                fontWeight = FontWeight.Medium,
                color = Color.Black
            )
            Spacer(modifier = Modifier.height(4.dp))
            Text(
                text = "20230140147",
                fontSize = 14.sp,
                color = Color.Gray
            )
        }
        Spacer(modifier = Modifier.height(50.dp))

        Button(
            onClick = OnSubmitBtnClick,
            colors = ButtonDefaults.buttonColors(containerColor = Color(0xFFD32F2F)),
            shape = RoundedCornerShape(50),
            modifier = Modifier
                .width(200.dp)
                .height(50.dp)
        ) {
            Text(text = "Submit", fontSize = 18.sp, color = Color.White)
        }

    }
}