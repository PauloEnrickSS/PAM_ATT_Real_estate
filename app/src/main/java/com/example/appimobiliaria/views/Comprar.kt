package com.example.appimobiliaria.views

import android.annotation.SuppressLint
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Scaffold
import androidx.compose.material3.TopAppBar
import androidx.compose.material3.TopAppBarDefaults
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.navigation.NavController
import androidx.navigation.compose.rememberNavController
import com.example.appimobiliaria.R
import com.example.appimobiliaria.components.BackButton
import com.example.appimobiliaria.components.ImgCard
import com.example.appimobiliaria.components.NavContent
import com.example.appimobiliaria.ui.theme.DarkGreen
import com.example.appimobiliaria.ui.theme.RedDark

@SuppressLint("UnusedMaterial3ScaffoldPaddingParameter")
@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun ComprarScreen(navController: NavController){
    Scaffold(
        topBar = {
            TopAppBar(
                title = {
                    NavContent()
                },
                colors = TopAppBarDefaults.mediumTopAppBarColors(
                    containerColor = RedDark
                ),
                navigationIcon = {
                    BackButton(){
                        navController.navigate("home")
                    }
                }
            )
        }
    ){
        ContentComprarScreen(navController)
    }
}

@Composable
fun ContentComprarScreen(navController: NavController){
    Column (
        modifier = Modifier.fillMaxSize()
            .padding(top = 80.dp),
        horizontalAlignment = Alignment.CenterHorizontally
    ){
        ImgCard(

            "Casa 1",
            "R$ 75.000,00",
            Color.Black,
            painterResource(R.drawable.casa)
        )
        Spacer(modifier = Modifier.height(16.dp))
        ImgCard(
            "Casa 2",
            "R$ 40.000,00",
            DarkGreen,
            painterResource(R.drawable.casa)
        )
    }
}

@Preview(showBackground = true)
@Composable
fun ComprarPreview(){
    val navController = rememberNavController()
    ComprarScreen(navController)
}