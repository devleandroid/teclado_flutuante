package half.keyboard.br.com.lebronx.keyboard;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.content.res.Configuration;
import android.graphics.Color;
import android.graphics.drawable.ColorDrawable;
import android.inputmethodservice.Keyboard;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.EditText;
import android.widget.LinearLayout;
import android.widget.Toast;

public class Main_Activity extends AppCompatActivity {

    private KeyboardView myKeyboard;

    private EditText edtNumber;
    private Animation slideUp;
    private Animation slideDown;
    private LinearLayout layout;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.main_activity);

        layout = (LinearLayout) findViewById(R.id.layout);

        slideUp = AnimationUtils.loadAnimation(getApplicationContext(), R.anim.slide_in_up);
        slideDown = AnimationUtils.loadAnimation(getApplicationContext(), R.anim.slide_down);

        layout.startAnimation(slideUp);
        layout.setVisibility(View.VISIBLE);

        // edtNumber = (EditText)findViewById(R.id.edtNumber);

       // edtNumber.setRawInputType(Configuration.KEYBOARD_QWERTY);
        myKeyboard = new KeyboardView(this);

        if (!myKeyboard.getInputText().isEmpty()){
            Toast.makeText(getApplicationContext(), "Numero digitado " + myKeyboard.getInputText(), Toast.LENGTH_LONG).show();
        }
    }

    @Override
    public void onBackPressed() {
        // super.onBackPressed();
        // layout.startAnimation(slideDown);
        // layout.setVisibility(View.GONE);
        finish();
    }
}
