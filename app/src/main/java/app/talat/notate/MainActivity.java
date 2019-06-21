package app.talat.notate;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    private TextView textView;
    private TextView textView2;
    private TextView textView3;
    private EditText editText2;
    private EditText editText3;
    private ImageView imageView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        textView = findViewById(R.id.textView);
        textView2 =findViewById(R.id.textView2);
        textView3 =findViewById(R.id.textView3);
        editText2 =findViewById(R.id.editText2);
        editText3 =findViewById(R.id.editText3);
        imageView =findViewById(R.id.imageView);


textView2.setOnClickListener(new View.OnClickListener() {
    @Override
    public void onClick(View v) {
        Intent Note_Page = new Intent(MainActivity.this,Note_Page.class);
        startActivity(Note_Page);

    }
});



    }
}
