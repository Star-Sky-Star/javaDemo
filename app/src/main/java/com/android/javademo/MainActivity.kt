package com.android.javademo

import android.content.Intent
import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import android.view.Window
import kotlinx.android.synthetic.main.activity_main.*


class MainActivity : AppCompatActivity() {


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        window.requestFeature(Window.FEATURE_CONTENT_TRANSITIONS)
        // set an exit transition  启动一个新activity时，执行当前视图移除屏幕外的动画。并不是finish时候的动画。
        // window.exitTransition = Slide(Gravity.BOTTOM)
        setContentView(R.layout.activity_main)

        top.setOnClickListener {
            val intent = Intent(this, SecondActivity::class.java)
            startActivity(intent)
            overridePendingTransition(R.anim.slide_in_left, R.anim.slide_in_right)
            /*if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.LOLLIPOP) {
                window.allowEnterTransitionOverlap = true
                val intent = Intent(this, SecondActivity::class.java)
                val options = ActivityOptions.makeSceneTransitionAnimation(this)
                startActivity(intent, options.toBundle())
            }else{

            }*/

        }
    }
}
