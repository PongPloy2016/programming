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

import java.util.ArrayList;

public class SubMenu6Activity extends AppCompatActivity {

    EditText number_data_1;

    Button bt_call;
    static TextView tc_cal;

    String number_1;
    private int i;
    ArrayList<Integer> aListNumbers;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_activity_menu6);


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


                    String[] data_numbet_ant = number_1.split(",");


                    int[] results = new int[data_numbet_ant.length];
                    Log.e("results", String.valueOf(results));

                    for (int i = 0; i < data_numbet_ant.length; i++) {
                        try {
                            results[i] = Integer.parseInt(data_numbet_ant[i]);

                        Log.e("results[i]", String.valueOf(results[i]));

                             aListNumbers = new ArrayList<>();
                            aListNumbers.add(results[i]);

                            aListNumbers.toString();


                            subsequence(results);

                        }



                        catch (NumberFormatException nfe) {};
                    }



                    //  processLine(data_numbet_ant);
//                    Integer [] a = new Integer[data_numbet_ant.length];
//
//                    for( i =0; i<a.length;i++)
//                    {
//                        a[i]= Integer.parseInt(data_numbet_ant[i]);
//
//
//                    }
//
//                   // int a = Integer.parseInt(data_numbet_ant[0] + data_numbet_ant[1]);
//
//                    Log.e("data sum", String.valueOf(a));
//                     Log.e("data  a[i]", String.valueOf( a[i]));


//                    int data_1_1 = Integer.parseInt(data_numbet_ant[0] );
//                    int data_1_2 = Integer.parseInt(data_numbet_ant[1] );
//                    int data_2_1 = Integer.parseInt(data_numbet_ant[2] );
//                    int data_2_2 = Integer.parseInt(data_numbet_ant[3] );
//                    int data_3_1 = Integer.parseInt(data_numbet_ant[4] );
//                    int data_3_2 = Integer.parseInt(data_numbet_ant[5] );

                    ArrayList<Integer> aListNumbers = new ArrayList<>();

//                    aListNumbers.add(data_1_1);
//                    aListNumbers.add(data_1_2);

             //       subsequence(a[i]);


                }
            }
        });

    }


    public static Integer[] toObject(int[] intArray) {

        Integer[] result = new Integer[intArray.length];
        for (int i = 0; i < intArray.length; i++) {
            result[i] = Integer.valueOf(intArray[i]);
        }
        return result;
    }

    public static void subsequence(int[] arr)
    {
        int max = 0;
        int tempMax = 0;
        int count = 0;

        Log.e("arr",arr.toString());

        // My problem is in here:
        for (int i = 0; i < arr.length; i++)
        {
            tempMax += arr[i];
            if (max < tempMax)
            {
                max = tempMax;
                count ++;
            }
        }


        System.out.println("count = " + count);
        System.out.println("Max sum is " + max);
        System.out.print("Sequence is: ");

        Log.e("max", String.valueOf(max));
        tc_cal.setText(String.valueOf(max));

        for (int j = 0; j < count; j++)
            System.out.print(arr[j] + " ");

        System.out.println("\n");
    }
}




