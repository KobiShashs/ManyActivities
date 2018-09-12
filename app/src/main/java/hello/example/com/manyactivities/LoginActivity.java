package hello.example.com.manyactivities;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

public class LoginActivity extends AppCompatActivity {

    private EditText editText;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);
        editText = (EditText)findViewById(R.id.edit_text);
    }

    public void WhenYouClick(View view){
        //Toast.makeText(this, "Go to screen number 2", Toast.LENGTH_SHORT).show();
        Intent intent = new Intent(this,HomeActivity.class);
        String name = editText.getText().toString();
        intent.putExtra("NAME", name);
        startActivity(intent);



    }
}
