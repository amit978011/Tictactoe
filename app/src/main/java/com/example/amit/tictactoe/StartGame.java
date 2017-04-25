package com.example.amit.tictactoe;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;
import android.widget.ImageView;

public class StartGame extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_start_game);

        ImageButton imageButtoncross=(ImageButton) findViewById(R.id.ivcross);
        ImageButton imageButtonzero=(ImageButton)  findViewById(R.id.ivzero);

        imageButtonzero.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(StartGame.this,MainActivity.class);
                intent.putExtra("option","zero");
                startActivity(intent);

            }
        });


        imageButtoncross.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(StartGame.this,MainActivity.class);
                intent.putExtra("option","cross");
                startActivity(intent);

            }
        });

    }
}
