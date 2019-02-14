package meiyu.mykotlin2019

import android.graphics.Color
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.util.TypedValue
import android.view.View
import android.widget.Toast

import butterknife.ButterKnife
import butterknife.OnClick
import kotlinx.android.synthetic.main.activity_main.*
import meiyu.mykotlin2019.R.layout.activity_main

class MainActivity : AppCompatActivity() {


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        setContentView(activity_main)
        ButterKnife.bind(this)

        tv_test.text = "kotlin butterKnife !"

        tv_test2.text = " hello 2"

        tv_test2.setTextColor(Color.RED)
        tv_test2.setTextSize(TypedValue.COMPLEX_UNIT_SP, 20f)


    }


    @OnClick(R.id.tv_test, R.id.tv_test2)
    fun onClickEvent(view: View) {
        when (view.id) {

            R.id.tv_test -> {
                Log.e("MainActivity", "test1")
                Toast.makeText(this, "hello test 1", Toast.LENGTH_SHORT).show()

            }

            R.id.tv_test2 -> {
                Log.e("MainActivity", "test1-2")
                Toast.makeText(this, "hello test 2", Toast.LENGTH_SHORT).show()

            }
            else -> { // 注意这个块
                Toast.makeText(this, "no no no ", Toast.LENGTH_SHORT).show()
            }
        }

    }
}
