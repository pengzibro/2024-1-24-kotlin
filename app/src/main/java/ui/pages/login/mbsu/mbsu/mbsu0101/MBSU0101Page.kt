package ui.pages.login.mbsu.mbsu.mbsu0101

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
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.hilt.navigation.compose.hiltViewModel
import androidx.lifecycle.ViewModel

@Composable
@Preview

fun LoginPage() {
    Column(
        modifier = Modifier.fillMaxSize()
    ) {
        Box(
            modifier = Modifier
                .background(color = Color.White)
                .fillMaxSize()
        ) {
            Column(modifier = Modifier.fillMaxSize()) {
                // 第一个按钮
                Card(
                    shape = RoundedCornerShape(10.dp),
                    elevation = CardDefaults.cardElevation(defaultElevation = 2.dp),
                    modifier = Modifier.padding(20.dp, 20.dp, 20.dp, 0.dp)
                ) {
                    Row(
                        modifier = Modifier
                            .fillMaxWidth() // 只需要 fillMaxWidth
                    ) {
                        Text(
                            text = "API Button",
                            modifier = Modifier.padding(8.dp), // 直接应用 Modifier
                            fontSize = 16.sp,
                            maxLines = 1,
                            overflow = TextOverflow.Ellipsis,
                            // 如果需要，可以在这里添加 clickable 修饰符
                        )
                    }
                }
                Card(
                    shape = RoundedCornerShape(10.dp),
                    elevation = CardDefaults.cardElevation(
                        defaultElevation = 2.dp
                    ),
                    modifier = Modifier.padding(20.dp, 20.dp, 20.dp, 0.dp)
                ) {
                    Row(
                        Modifier
                            .fillMaxWidth()
                            .clickable {
                            }
                    ) {
                        Column(Modifier.fillMaxWidth()) {
                            Text(
                                text = "DB_SELECT",
                                Modifier.padding(8.dp),
                                fontSize = 16.sp,
                                maxLines = 1,
                                overflow = TextOverflow.Ellipsis
                            )
                        }
                    }
                }
                Card(
                    shape = RoundedCornerShape(10.dp),
                    elevation = CardDefaults.cardElevation(
                        defaultElevation = 2.dp
                    ),
                    modifier = Modifier.padding(20.dp, 20.dp, 20.dp, 0.dp)
                ) {
                    Row(
                        Modifier
                            .fillMaxWidth()
                            .clickable {
//                                viewModel.dataCreate()
                            }) {
                        Column(Modifier.fillMaxWidth()) {
                            Text(
                                text = "DB_CREATE",
                                Modifier.padding(8.dp, 8.dp, 8.dp, 8.dp),
                                fontSize = 16.sp,
                                maxLines = 1,
                                overflow = TextOverflow.Ellipsis
                            )
                        }
                    }
                }
                Card(
                    shape = RoundedCornerShape(10.dp),
                    elevation = CardDefaults.cardElevation(
                        defaultElevation = 2.dp
                    ),
                    modifier = Modifier
                        .padding(20.dp, 20.dp, 20.dp, 0.dp)
                ) {
                }
                Column(
                    Modifier
                        .fillMaxSize()
                ) {
                    Text(
                        text = "DB_CREATE",
                        Modifier.padding(8.dp, 8.dp, 8.dp, 8.dp),
                        fontSize = 16.sp,
                        maxLines = 1,
                        overflow = TextOverflow.Ellipsis
                    )
                    Text(
                        text = "DB_CREATE",
                        Modifier.padding(8.dp, 8.dp, 8.dp, 8.dp),
                        fontSize = 16.sp,
                        maxLines = 1,
                        overflow = TextOverflow.Ellipsis
                    )
                    Text(
                        text = "DB_CREATE",
                        Modifier.padding(8.dp, 8.dp, 8.dp, 8.dp),
                        fontSize = 16.sp,
                        maxLines = 1,
                        overflow = TextOverflow.Ellipsis
                    )
                    Text(
                        text = "DB_CREATE",
                        Modifier.padding(8.dp, 8.dp, 8.dp, 8.dp),
                        fontSize = 16.sp,
                        maxLines = 1,
                        overflow = TextOverflow.Ellipsis
                    )
                    Text(
                        text = "DB_CREATE",
                        Modifier.padding(8.dp, 8.dp, 8.dp, 8.dp),
                        fontSize = 16.sp,
                        maxLines = 1,
                        overflow = TextOverflow.Ellipsis
                    )
                    Text(
                        text = "DB_CREATE",
                        Modifier.padding(8.dp, 8.dp, 8.dp, 8.dp),
                        fontSize = 16.sp,
                        maxLines = 1,
                        overflow = TextOverflow.Ellipsis
                    )
                    Text(
                        text = "DB_CREATE",
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



