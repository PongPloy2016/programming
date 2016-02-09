package com.codegears.programming.activity;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;

import com.codegears.programming.R;


public class MenuActivity extends AppCompatActivity {

    private Button menu1 ;
    private Button menu2 ;
    private Button menu3 ;
    private Button menu4 ;
    private Button menu5 ;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_menu);

                menu1 =  (Button) findViewById(R.id.bt_menu1);
                  menu2 =  (Button) findViewById(R.id.bt_menu2);
                  menu3 =  (Button) findViewById(R.id.bt_menu3);
                  menu4 =  (Button) findViewById(R.id.bt_menu4);
                  menu5 =  (Button) findViewById(R.id.bt_menu5);

        menu1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(getApplication(), SubMenu1Activity.class);
                startActivity(i);

            }
        });

        menu2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent k = new Intent(getApplication(), SubMenu2Activity.class);
                startActivity(k);
            }
        });

        menu3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent j = new Intent(getApplication(), SunMenu3Activty.class);
                startActivity(j);
            }
        });


        menu4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent p = new Intent(getApplication(), SubMenu4Activty.class);
                startActivity(p);
            }
        });

        menu5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent k = new Intent(getApplication(), SubMenu5Activty.class);
                startActivity(k);
            }
        });


    }
}
