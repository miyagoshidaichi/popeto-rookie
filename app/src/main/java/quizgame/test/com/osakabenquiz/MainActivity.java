package quizgame.test.com.osakabenquiz;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.view.Window;
import android.widget.Button;
import android.widget.TextView;
import android.graphics.Typeface;
import android.widget.Toast;
import android.content.Intent;





public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        requestWindowFeature(Window.FEATURE_NO_TITLE);

        setContentView(R.layout.activity_main);

        // タイトルテキスト
        ((TextView) findViewById(R.id.titleText)).setTypeface(Typeface.createFromAsset(getAssets(), "manteka.ttf"));
        // Normalボタン
        ((Button) findViewById(R.id.button_normal)).setTypeface(Typeface.createFromAsset(getAssets(), "manteka.ttf"));

    }

    public void onClick(View v) {
        switch (v.getId()) {



            case R.id.button_normal:

                Intent intent = new Intent(MainActivity.this, StageSelect.class);
                startActivity(intent);
                break;


        }
    }

}