package com.example.progmob2020;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import com.example.progmob2020.Pertemuan2.ListActivity;
import com.example.progmob2020.Pertemuan2.RecyclerActivity;

public class MainActivity extends AppCompatActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        //Variabell
        final TextView textview = (TextView) findViewById(R.id.mainActivityTextView);
        Button myBtn = (Button)findViewById((R.id.button1));
        final EditText myEditText = (EditText)findViewById(R.id.editText1);
        Button btnHelp  = (Button)findViewById(R.id.btnHelp);

        //Pertemuan2
        Button btnList = (Button)findViewById(R.id.buttonListView);
        Button btnRecycler = (Button)findViewById(R.id.buttonRecyclerView);
        Button btnCard = (Button)findViewById(R.id.buttonCardView);

        //Action
        textview.setText("test untuk update view");
        myBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //Log.d("Coba CLICKKK", myEditText.getText().toString());
                textview.setText(myEditText.getText().toString());
            }
        });
        btnHelp.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this,HelpActivity.class);
                Bundle b =  new Bundle();

                b.putString("helpString",myEditText.getText().toString());
                intent.putExtras(b);

                startActivity(intent);
            }
        });

        btnList.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MainActivity.this, ListActivity.class);
                startActivity(intent);
            }
        });

        btnRecycler.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MainActivity.this, RecyclerActivity.class);
                startActivity(intent);
            }
        });


    }
}