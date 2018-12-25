package half.keyboard.br.com.lebronx.keyboard

import android.content.Intent
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.TextView
import kotlinx.android.synthetic.main.activity_main.*
import android.view.animation.AnimationUtils
import android.view.animation.Animation
import android.widget.LinearLayout


class MainActivity : AppCompatActivity() {




    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        buttonKey.setOnClickListener(View.OnClickListener {
            val intent = Intent(this, Main_Activity::class.java)
            startActivity(intent)
        })
    }
}
