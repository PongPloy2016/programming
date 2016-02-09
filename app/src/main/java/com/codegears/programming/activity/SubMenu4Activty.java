package com.codegears.programming.activity;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;


import com.codegears.programming.R;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.PriorityQueue;

public class SubMenu4Activty extends AppCompatActivity {


    EditText number_data_1;
    EditText number_data_2;
    EditText number_data_3;
    Button bt_call;
    TextView tc_cal;

    String number_1;
    String number_2;
    String number_3;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_activity_meum_4);


        number_data_1 = (EditText) findViewById(R.id.et_text);
        number_data_2 = (EditText) findViewById(R.id.ex_number_ant);
        number_data_3 = (EditText) findViewById(R.id.ex_number_start);
        bt_call = (Button) findViewById(R.id.bt_cul);
        tc_cal = (TextView) findViewById(R.id.text_data);


        bt_call.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {


                if((number_data_1.getText().toString().equals(""))){

                    Toast.makeText(getApplication(), " Plese in put daata",
                            Toast.LENGTH_LONG).show();

                }

                if((number_data_2.getText().toString().equals(""))){

                    Toast.makeText(getApplication(), " Plese in put daata",
                            Toast.LENGTH_LONG).show();

                }

                if((number_data_3.getText().toString().equals(""))){

                    Toast.makeText(getApplication(), " Plese in put daata",
                            Toast.LENGTH_LONG).show();

                }

                if ((number_data_1.getText().toString().equals("")) && (number_data_2.getText().toString().equals("")) &&(number_data_3.getText().toString().equals("")))

                {
                    Toast.makeText(getApplication(), " Plese in put daata All",
                            Toast.LENGTH_LONG).show();


                }



                else {



                    number_1 = number_data_1.getText().toString();
                    number_2 = number_data_2.getText().toString();
                    number_3 = number_data_3.getText().toString();

                    String data_numbet_ant [] = number_1.split(",");

                    int data_1_1 = Integer.parseInt(data_numbet_ant[0]);
                    int data_1_2 = Integer.parseInt(data_numbet_ant[1]);
//*****************************************************************

                    int ss_2 = Integer.parseInt (number_2);

//****************************************************************
                    String ss_3 [] = number_3.split(",");

                    int ss_3_sub1 = Integer.parseInt(ss_3[0]);
                 //   int ss_3_sub2 = Integer.parseInt(ss_3[1]);

  //************************************************
//
                    if((  2 <=data_1_1   ) && (  data_1_1 <= 20000   ) ) {

                        if((  2 <=data_1_2   ) && (  data_1_2 <= 20000   ) ) {


                            if ((  1 <=ss_2   ) && (  ss_2 <= 70000   ) ) {


                                Log.e("ss1_sub", String.valueOf(data_1_1));
                                Log.e("ss1_2_sub", String.valueOf(data_1_2));
                                Log.e("ss2", String.valueOf(ss_2));
                                Log.e("ss3_sub", String.valueOf(ss_3_sub1));
                                Log.e("ss3_2_sub", ss_3 [1]);



                            }

                        }

                    }



                }


            }
        });


    }


}


