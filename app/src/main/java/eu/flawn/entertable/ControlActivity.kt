package eu.flawn.entertable

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.EventLog
import android.view.MotionEvent
import android.view.View
import kotlinx.android.synthetic.main.activity_control.*
import java.io.IOException
import java.nio.charset.Charset

class ControlActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_control)

        imageButtonUP.setOnTouchListener(View.OnTouchListener { v, event ->

            if (event.action == MotionEvent.ACTION_DOWN) {

            } else if (event.action == MotionEvent.ACTION_UP) {

            }
            true
        })



        imageButtonDWN.setOnTouchListener(View.OnTouchListener { v, event ->

            if (event.action == MotionEvent.ACTION_DOWN) {

            } else if (event.action == MotionEvent.ACTION_UP) {

            }
            true
        })



    }
}
