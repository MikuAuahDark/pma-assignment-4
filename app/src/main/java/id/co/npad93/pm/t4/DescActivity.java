package id.co.npad93.pm.t4;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

public class DescActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_desc);
        getSupportActionBar().setHomeButtonEnabled(true);

        Intent intent = getIntent();
        CharaData chara = CharaData.get(intent.getStringExtra("name"));

        this.<ImageView>findViewById(R.id.imageView2).setImageResource(chara.getImage());
        this.<TextView>findViewById(R.id.textView3).setText(chara.getName());
        this.<TextView>findViewById(R.id.textView9).setText(": " + chara.getBirthday());
        this.<TextView>findViewById(R.id.textView10).setText(": " + chara.getNation());
        this.<TextView>findViewById(R.id.textView11).setText(": " + chara.getAffiliation());
        this.<TextView>findViewById(R.id.textView12).setText(chara.getDescription());
    }
}
