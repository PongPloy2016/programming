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


/**
 * Created by pongwiiApp on 3/2/2559.
 */
public class SunMenu3Activty extends AppCompatActivity {

    EditText array_string;
    Button bt_call;
    TextView tc_cal;

    String  numbet ;
    private int i ,ss,ss1,ss2,ss3,ss4 ;




    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_activity__menu_3);


        final int[] preD = new int[5];
        final int[] min = {999}; // min holds the minimum value, nextNode holds the value for the next node.
        final int[] nextNode = {0};

        final int[][] distance = {new int[5]}; // the distance matrix
        final int[][] matrix = new int[5][5]; // the actual matrix
        final int[] visited = new int[5]; // the visited array


        array_string = (EditText) findViewById(R.id.et_text);
        bt_call = (Button) findViewById(R.id.bt_cul);
        tc_cal = (TextView) findViewById(R.id.text_data);


        bt_call.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                numbet = array_string.getText().toString();

                ss = Integer.parseInt(numbet);


                Log.e("numbet data", numbet);

                //  String ayy[] = numbet.split(",");

                // Log.e("ayy data",ayy.toString());

                if ((1 <= ss) && (ss <= 100)) {
                    if(ss <= 20){
                        ss2 = ss -6 ;  // 15-6 = 9
                        //  tc_cal.setText(ss2);
                        if(ss2 >= 9){
                            ss3 = ss -9 ;
                            //    tc_cal.setText( ss3);
                            if (ss3 >= 6){
                                ss4 = ss3 +ss3 ;
//                                tc_cal.setText( ss4);
                                tc_cal.setText(ss3 + "\n"+ss2 +"\n" + ss4+ "\n" + ss);
                            }
                            else {
                                tc_cal.setText("No");
                            }
                        }
                        else {
                            tc_cal.setText("No");
                        }
                    }
                    else {
                        tc_cal.setText("No");
                    }
//                    Arrays.sort(ayy, Collections.reverseOrder());
//                    for (int i = 0; i < ayy.length; i++) {
//
//                        Log.e("ayy[i]",ayy[i]);
//                        tc_cal.setText(ayy[i]);
//                    }

                } else {


                    Toast.makeText(getApplication(), "กรุณากรอกใหม่",
                            Toast.LENGTH_LONG).show();
                }
            }


        });


    }


}
