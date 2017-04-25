package com.example.amit.tictactoe;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;

public class MainActivity extends AppCompatActivity {
String option;
    String turn;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        final ImageButton ib1=(ImageButton)findViewById(R.id.ib1);
        final ImageButton ib2=(ImageButton)findViewById(R.id.ib2);
        final ImageButton ib3=(ImageButton)findViewById(R.id.ib3);
        final ImageButton ib4=(ImageButton)findViewById(R.id.ib4);
        final ImageButton ib5=(ImageButton)findViewById(R.id.ib5);
        final ImageButton ib6=(ImageButton)findViewById(R.id.ib6);
        final ImageButton ib7=(ImageButton)findViewById(R.id.ib7);
        final ImageButton ib8=(ImageButton)findViewById(R.id.ib8);
        final ImageButton ib9=(ImageButton)findViewById(R.id.ib9);






        Bundle bundle = getIntent().getExtras();

        if(bundle.getString("option")!= null)
        {
            option =bundle.getString("option");
            turn  =option;

        }
/*

        ib1.setOnClickListener(new View.OnClickListener() {
            @Override

            public void onClick(View v) {

                if(turn=="zero")
                    ib1.setImageResource(R.drawable.zero);

            }
        });
*/


                if(turn.equals("zero"))
        {
            ib1.setOnClickListener(new View.OnClickListener() {
             @Override
             public void onClick(View v) {
               ib1.setImageResource(R.drawable.zero);

                ib1.setClickable(false);
                turn="cross";
             }
         });

            ib2.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    ib2.setImageResource(R.drawable.zero);
                    ib2.setClickable(false);

                    turn="cross";

                }
            });

            ib3.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    ib3.setImageResource(R.drawable.zero);
                    ib3.setClickable(false);
                    turn="cross";

                }
            });

            ib4.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    ib4.setImageResource(R.drawable.zero);
                    ib4.setClickable(false);
                    turn="cross";

                }
            });

            ib5.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    ib5.setImageResource(R.drawable.zero);
                    ib5.setClickable(false);
                    turn="cross";

                }
            });

            ib6.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    ib6.setImageResource(R.drawable.zero);
                    ib6.setClickable(false);
                    turn="cross";

                }
            });

            ib7.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    ib7.setImageResource(R.drawable.zero);
                    ib7.setClickable(false);
                    turn="cross";

                }
            });

            ib8.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    ib8.setImageResource(R.drawable.zero);
                    ib8.setClickable(false);
                    turn="cross";

                }
            });

            ib9.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    ib9.setImageResource(R.drawable.zero);
                    ib9.setClickable(false);
                    turn="cross";

                }
            });




        }

        if(turn.equals("cross"))
        {
            ib1.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    ib1.setImageResource(R.drawable.cross);
                    ib1.setClickable(false);
                    turn="zero";

                }
            });

            ib2.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    ib2.setImageResource(R.drawable.cross);
                    ib2.setClickable(false);
                    turn="zero";


                }
            });

            ib3.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    ib3.setImageResource(R.drawable.cross);
                    ib3.setClickable(false);
                    turn="zero";

                }
            });

            ib4.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    ib4.setImageResource(R.drawable.cross);
                    ib4.setClickable(false);
                    turn="zero";

                }
            });

            ib5.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    ib5.setImageResource(R.drawable.cross);
                    ib5.setClickable(false);
                    turn="zero";

                }
            });

            ib6.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    ib6.setImageResource(R.drawable.cross);
                    ib6.setClickable(false);
                    turn="zero";

                }
            });

            ib7.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    ib7.setImageResource(R.drawable.cross);
                    ib7.setClickable(false);
                    turn="zero";

                }
            });

            ib8.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    ib8.setImageResource(R.drawable.cross);
                    ib8.setClickable(false);
                    turn="zero";

                }
            });

            ib9.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    ib9.setImageResource(R.drawable.cross);
                    ib9.setClickable(false);
                    turn="zero";

                }
            });




        }





    }
}
