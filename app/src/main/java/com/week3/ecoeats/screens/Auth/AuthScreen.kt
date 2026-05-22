package com.week3.ecoeats.screens.Auth

import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.ui.layout.ContentScale
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Button
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.week3.ecoeats.ui.theme.DarkOliveGreen
import androidx.compose.foundation.Image
import androidx.compose.foundation.shape.RoundedCornerShape
import com.week3.ecoeats.R
import androidx.compose.material3.ButtonDefaults
import androidx.compose.ui.Alignment
import androidx.compose.ui.draw.clip
import com.week3.ecoeats.ui.theme.CharcoalBrown
import com.week3.ecoeats.ui.theme.Cornsilk
import com.week3.ecoeats.ui.theme.LaurelGreen
import com.week3.ecoeats.ui.theme.white

@Composable
fun AuthScreen(modifier: Modifier = Modifier){
    Box(
        modifier = Modifier
            .fillMaxSize()
            .background(Cornsilk)
    ){
        Image(
            painter = painterResource(R.drawable.gambar1),
            contentDescription = "Gambar awal",
            contentScale = ContentScale.Crop,
            modifier = Modifier
                .fillMaxWidth()
                .height(280.dp)
                //.padding(16.dp)
        )
        Spacer(modifier= Modifier.height(10.dp))
        Box(
            modifier = Modifier
                .fillMaxWidth()
                //.weight(1f)
                .clip(
                    RoundedCornerShape(
                        topStart = 32.dp,
                        topEnd = 32.dp
                    )
                )
                .background(Cornsilk)
        )
        Column(
            modifier = Modifier
                .fillMaxWidth()
                .fillMaxHeight(0.55f)
                .align(Alignment.BottomCenter)
                .clip(RoundedCornerShape(topStart = 32.dp, topEnd = 32.dp))
                .padding(horizontal = 32.dp)
        ) {
            WelcomeText()
            Spacer(modifier = Modifier.height(50.dp))
            ButtonDaftar()
            Spacer(modifier = Modifier.height(50.dp))
            ButtonMasuk()
            Spacer(modifier = Modifier.height(50.dp))
        }
    }
}
@Composable
fun WelcomeText(){
    Text(
        text="SELAMAT DATANG DI ECOEATS!",
        color = DarkOliveGreen,
        fontSize = 22.sp,
        fontWeight = FontWeight.Bold,
        textAlign = TextAlign.Center,
        lineHeight = 32.sp
    )
}
@Composable
fun ButtonDaftar(){
    Button(
        onClick = {},
        modifier = Modifier.fillMaxWidth(),
        shape = MaterialTheme.shapes.large,
        colors = ButtonDefaults.buttonColors(
            containerColor = DarkOliveGreen,
            contentColor = white
        )
    ) {
        Text(
            text = "DAFTAR"
        )
    }
}

@Composable
fun ButtonMasuk(){
    Button(
        onClick = {},
        modifier = Modifier.fillMaxWidth(),
        shape = MaterialTheme.shapes.large,
        colors = ButtonDefaults.buttonColors(
            containerColor = DarkOliveGreen,
            contentColor = white
        )
    ) {
        Text(
            text = "MASUK"
        )
    }
}