package top.androidman.superbutton

import android.os.Bundle
import android.view.View
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import top.androidman.SuperButton

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        supportActionBar!!.hide()
        setContentView(R.layout.activity_main)

        val button = findViewById<SuperButton>(R.id.sb_test)

    }

    fun test(view: View?) {
        Toast.makeText(this, "是不是很神奇", Toast.LENGTH_SHORT).show()
    }
}