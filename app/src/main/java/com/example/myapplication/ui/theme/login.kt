import android.app.Activity
import android.os.Bundle
import android.util.Log
import com.example.myapplication.R

class MyActivity : Activity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_my) // 设置你的布局文件

        Log.d("MyActivity", "onCreate called")
        // 这里是Activity被创建时应该执行的代码
    }

    override fun onStart() {
        super.onStart()
        Log.d("MyActivity", "onStart called")
        // 当Activity对用户可见时，但尚未获取焦点时调用
    }

    override fun onResume() {
        super.onResume()
        Log.d("MyActivity", "onResume called")
        // 当Activity开始与用户交互时调用
    }

    override fun onPause() {
        super.onPause()
        Log.d("MyActivity", "onPause called")
        // 当Activity不再与用户交互时调用，可能是因为另一个Activity正在启动
    }

    override fun onStop() {
        super.onStop()
        Log.d("MyActivity", "onStop called")
        // 当Activity不再对用户可见时调用
    }

    override fun onRestart() {
        super.onRestart()
        Log.d("MyActivity", "onRestart called")
        // 当Activity从停止状态变为活动状态时调用
    }

    override fun onDestroy() {
        super.onDestroy()
        Log.d("MyActivity", "onDestroy called")
        // 当Activity即将被销毁时调用，通常是因为它正在被关闭
    }

    override fun onSaveInstanceState(outState: Bundle) {
        super.onSaveInstanceState(outState)
        // 当Activity即将被销毁，并且有可能在之后被重建时调用
        // 可以使用outState来保存Activity的状态
        // 例如：outState.putString("key", "value")
    }


}