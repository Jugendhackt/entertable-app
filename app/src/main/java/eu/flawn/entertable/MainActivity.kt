package eu.flawn.entertable

import android.os.Bundle
import android.view.View
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        var v = findViewById<View>(R.id.mainactivity);
        v.setBackgroundColor(0xE4D1B8);
    }
}
