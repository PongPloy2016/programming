package com.codegears.programming.activity;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import com.codegears.programming.R;

public class SubMenu5Activty extends AppCompatActivity {

    EditText number_data_1;

    Button bt_call;
    TextView tc_cal;

    String number_1;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_activity_menu_5);


        number_data_1 = (EditText) findViewById(R.id.et_text);

        bt_call = (Button) findViewById(R.id.bt_cul);
        tc_cal = (TextView) findViewById(R.id.text_data);


        bt_call.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {


                if ((number_data_1.getText().toString().equals(""))) {

                    Toast.makeText(getApplication(), " Plese in put daata",
                            Toast.LENGTH_LONG).show();

                } else {


                    number_1 = number_data_1.getText().toString();


                    String data_numbet_ant[] = number_1.split(",");

                    int a = Integer.parseInt(data_numbet_ant[0] + data_numbet_ant[1]);

                    Log.e("data sum", String.valueOf(a));


                    int data_1_1 = Integer.parseInt(data_numbet_ant[0] );
                    int data_1_2 = Integer.parseInt(data_numbet_ant[1] );
                    int data_2_1 = Integer.parseInt(data_numbet_ant[2] );
                    int data_2_2 = Integer.parseInt(data_numbet_ant[3] );
                    int data_3_1 = Integer.parseInt(data_numbet_ant[4] );
                    int data_3_2 = Integer.parseInt(data_numbet_ant[5] );

                    int aaa = data_1_1 + data_1_2 ;
                    int bbb = data_2_1 + data_2_2 ;
                    int ccc = data_3_1 + data_3_2 ;

                    Log.e("aaa", String.valueOf(aaa));
                    Log.e("bbb", String.valueOf(bbb));
                    Log.e("ccc", String.valueOf(ccc));


                //    int data_1_2 = Integer.parseInt(data_numbet_ant[2] );
                    int data_1_3 = Integer.parseInt(data_numbet_ant[4]);
//                    int data_1_4 = Integer.parseInt(data_numbet_ant[3]);
//                    int data_1_5 = Integer.parseInt(data_numbet_ant[4]);
//                    int data_1_6 = Integer.parseInt(data_numbet_ant[5]);


                    if( ((aaa + bbb) > ccc) && ((aaa + ccc) >bbb ) && (bbb+ ccc) > aaa) {

                        tc_cal.setText("yes");

                    }

                    else {


                        tc_cal.setText("No");
                    }
//                    if (a+b > c && a+c > b && b+c > a)
//                        cout << "The sides form a triangle" << endl;
//                    else
//                        cout << "The sides do not form a triangle." << endl;
//                    return 0;


                    Log.e("ss1_sub", String.valueOf(data_1_1));
                    Log.e("ss1_2_sub", String.valueOf(data_1_2));


                }
            }
        });

            }
}

