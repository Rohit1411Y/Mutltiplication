package com.example.addition;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    EditText n1;
    TextView []text = new TextView[10];
    Button button;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
       // Toast.makeText(this, " Good Morning ", Toast.LENGTH_SHORT).show();

       ;
        n1 =findViewById(R.id.n1);

    text[0] = findViewById(R.id.textView0);

        text[1] = findViewById(R.id.textView1);
        text[2] = findViewById(R.id.textView2);
        text[3] = findViewById(R.id.textView3);
        text[4] = findViewById(R.id.textView4);
        text[5] = findViewById(R.id.textView5);
        text[6] = findViewById(R.id.textView6);
        text[7] = findViewById(R.id.textView7);
        text[8] = findViewById(R.id.textView8);
        text[9] = findViewById(R.id.textView9);
        button =findViewById(R.id.button);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
             // int sum = Integer.parseInt(n1.getText().toString());
              //+Integer.parseInt(n2.getText().toString());
           // text1.setText("The sum is : "+sum);
                int []table = new int[11];
                for(int i =1;i<11;i++) {
                    table[i] = Integer.parseInt(n1.getText().toString())*i;

                }
                for(int i =0;i<10;i++)
              text[i].setText(":"+ table[i+1]);


            }
        });

    }
}