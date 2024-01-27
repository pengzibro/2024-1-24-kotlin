// 问汝生平所学，吃饭睡觉导管

package com.example.myapplication

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import com.example.myapplication.ui.theme.MyApplicationTheme

// 定义了一个叫MainActivity的类，继承于ComponentActivity，
// ComponentActivity是一个用于支持jetpack compose的活动类
class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        // onCreate，生命周期，活动创建时被调用
        super.onCreate(savedInstanceState)
        // setContent设置界面的内容
        setContent {
            // MyApplicationTheme自订的compose主题，设置样式和颜色
            MyApplicationTheme {
                // A surface container using the 'background' color from the theme
                // Surface设置一个容器，代表界面的表面
                // fillMaxSize 充满父容器的大小
                // 设置颜色为主题中的背景颜色
                Surface(
                    modifier = Modifier.fillMaxSize(), color = MaterialTheme.colorScheme.background
                ) {
                    // 调用了Greeting函数，参数为安卓
                    Greeting("Android")
                }
            }
        }
    }
}

@Composable
// modifier是一个类型为Modifier的参数，用于指定组件的修饰符
fun Greeting(name: String, modifier: Modifier = Modifier) {
    //
    Text(
        text = "Hello $name!", modifier = modifier
    )
}

@Preview(showBackground = true)
@Composable
fun GreetingPreview() {
    MyApplicationTheme {
        Greeting("Android")
    }
}