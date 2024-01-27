package com.example.myapplication.ui.theme

import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Card
import androidx.compose.material3.CardDefaults
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.style.TextOverflow
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavHostController
import androidx.hilt.navigation.compose.hiltViewModel


@Composable
fun LoginPage(
    navCtrl: NavHostController,
    viewModel: LoginLogic = hiltViewModel()
) {
    val viewStates = viewModel.viewStates
    Column (
        Modifier
            .fillMaxSize()
    ) {
        Box(
            Modifier
                .background(color = Color.Green)
                .fillMaxSize()
        ) {
            Column (Modifier.fillMaxSize()) {
                Card(
                    shape = RoundedCornerShape(20.dp),
                    elevation = CardDefaults.cardElevation(
                        defaultElevation = 6.dp
                    ),
                    modifier = Modifier.padding(20.dp, 20.dp, 20.dp, 20.dp)
                ) {
                    Row (
                        Modifier
                            .fillMaxWidth()
                            .clickable {
                                viewModel.testApiCall()
                            }) {
                        Column (Modifier.fillMaxWidth()) {
                            Text(
                                text = "Api Button",
                                Modifier.padding(8.dp, 8.dp, 8.dp, 8.dp),
                                fontSize = 16.sp,
                                maxLines = 1,
                                overflow = TextOverflow.Ellipsis
                            )
                        }
                    }
                }
            }
        }
    }
}