package com.android.javademo

import android.annotation.TargetApi
import android.os.Build
import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import android.transition.Slide
import android.view.Gravity
import android.view.KeyEvent
import android.view.Window
import kotlinx.android.synthetic.main.activity_second.*

class SecondActivity : AppCompatActivity() {

   // @TargetApi(Build.VERSION_CODES.LOLLIPOP)
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
      //  window.requestFeature(Window.FEATURE_CONTENT_TRANSITIONS)
        // set an exit transition  启动一个新activity时，执行当前视图移除屏幕外的动画。并不是finish时候的动画。
  /*      window.exitTransition = Slide(Gravity.TOP)
        window.enterTransition = Slide(Gravity.BOTTOM)*/
        setContentView(R.layout.activity_second)
        finish.setOnClickListener {
            finish()
            overridePendingTransition(0, R.anim.slide_in_top)
        }
    }

    override fun onBackPressed() {
        super.onBackPressed()
        finish()
        overridePendingTransition(0, R.anim.slide_in_top)
    }
}
