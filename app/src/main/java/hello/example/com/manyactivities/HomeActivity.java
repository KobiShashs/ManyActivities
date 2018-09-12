package hello.example.com.manyactivities;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class HomeActivity extends AppCompatActivity {

    private TextView textView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home);
        textView = (TextView)findViewById(R.id.text_view);

        String nameToPresent = getIntent().getStringExtra("NAME");
        textView.setText(nameToPresent);
    }
}
