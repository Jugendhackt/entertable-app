package eu.flawn.entertable

import android.os.Bundle
import android.view.View
import androidx.appcompat.app.AppCompatActivity
import eu.flawn.entertable.requests.Request
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        var v = findViewById<View>(R.id.mainactivity);
        v.setBackgroundColor(0xEDF4EA);
        onbutton.setOnClickListener {
            var request = Request("YALLA HABU");
            request.start();
        }
    }
}
