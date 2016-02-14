package com.codegears.programming.activity;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.text.Editable;
import android.text.InputFilter;
import android.text.TextWatcher;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;
import com.codegears.programming.R;
import java.util.ArrayList;
import java.util.Arrays;

public class SubMenu6Activity extends AppCompatActivity {

    private EditText number_data_1;
    private EditText number_data_2;
    private  Button bt_call;
    private static TextView tc_cal;
    private String number_1;
    private String number_2;

    static private int seqStart = 0;
    static private int seqEnd = -1;

    private ArrayList<Integer> aListNumbers;

    private  int maxLength;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_activity_menu_6);

        number_data_1 = (EditText) findViewById(R.id.et_text);
        number_data_2 = (EditText) findViewById(R.id.et_text_2);


        number_data_1.addTextChangedListener(new TextWatcher() {
            @Override
            public void beforeTextChanged(CharSequence s, int start, int count, int after) {

            }

            @Override
            public void onTextChanged(CharSequence s, int start, int before, int count) {

            }

            @Override
            public void afterTextChanged(Editable s) {

                number_1 =  number_data_1.getText().toString();
                Log.e("number_1",number_1);
            }
        });

       number_data_2.addTextChangedListener(new TextWatcher() {
           @Override
           public void beforeTextChanged(CharSequence s, int start, int count, int after) {

           }
           @Override
           public void onTextChanged(CharSequence s, int start, int before, int count) {

              maxLength = ((Integer.parseInt(number_1) * 2)+  maxLength  );
               number_data_2.setFilters(new InputFilter[] {new InputFilter.LengthFilter(maxLength)});
           }
           @Override
           public void afterTextChanged(Editable s) {

           }
       });

        bt_call = (Button) findViewById(R.id.bt_cul);
        tc_cal = (TextView) findViewById(R.id.text_data);
        bt_call.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if ((number_data_1.getText().toString().equals(""))) {
                    Toast.makeText(getApplication(), " Plese in put daata",
                            Toast.LENGTH_LONG).show();
                } else {
                  //  number_1 = number_data_1.getText().toString();
                    number_2 = number_data_2.getText().toString();

                    String[] data_numbet_ant = number_2.split(",");
                    int[] results = new int[data_numbet_ant.length];
                    Log.e("results", String.valueOf(results));
                    for (int i = 0; i < data_numbet_ant.length; i++) {
                        try {
                            results[i] = Integer.parseInt(data_numbet_ant[i]);
                        Log.e("results[i]", String.valueOf(results[i]));


                        }
                        catch (NumberFormatException nfe) {};
                    }

                    grouping(maxLength,results);
                }
            }
        });
    }
    public static ArrayList<ArrayList<Integer>> grouping(int limit, int[] array) {
        Arrays.sort(array);
        ArrayList<Integer> input = new ArrayList<>();
        for (int i = 1; i < array.length; i++) {
            input.add(array[i]);

            Log.e("array[i]", String.valueOf(array[i]));
        }
        ArrayList<ArrayList<Integer>> groups = new ArrayList<>();
        groups.add(new ArrayList<Integer>());
        ArrayList<Integer> sums = new ArrayList<>();
        sums.add(0);

        while (!input.isEmpty()) {
            int n = input.get(0); // Store the number to 'n', to shortcut.
            if (n > limit) {
                throw new IllegalArgumentException("number is greater than the limit. Cannot add number.");
            }
            boolean match = false;
            // Search the next groups and check if our current number ('n') fits.
            for (int i = 0; i < sums.size(); i++) {
                if (sums.get(i) + n <= limit) {
                    // If it fits, then add the number to the group.
                    sums.set(i, sums.get(i) + n);
                    groups.get(i).add(n);
                    match = true;

                    Log.e("data_sum_set", String.valueOf(sums.get(i) + n));
                    break;
                }
            }
            // If 'n' doesn't fit in any group, create a new one.
            if (!match) {
                ArrayList<Integer> e = new ArrayList<>();
                e.add(n);
                groups.add(e);
                sums.add(n);
                Log.e("!match_e",e.toString());
            }
            // Remove our number.
            input.remove(0);
            Log.e("groups",groups.toString());
            tc_cal.setText(groups.toString());
        }
        return groups;
    }



//    public static int maxSubSum4( int [ ] a )
//    {
//
//        int i ;
//
//        for(   i = 1 ; i < a.length ; i++) {
//
//            String ss = String.valueOf(a);
//
//            Log.e("ss",ss);
//        }
//        return a.length > 0 ? maxSumRec( a, 0, a.length - 1 ) : 0;
//
//
//
//    }
//
//    private static int maxSumRec( int [ ] a, int left, int right )
//    {
//
//
//        Log.e("maxSumRec_1",String.valueOf(a.toString()) );
//        Log.e("maxSumRec_1",String.valueOf(left) );
//        Log.e("maxSumRec_2",String.valueOf(right) );
//
//        int maxLeftBorderSum = 0, maxRightBorderSum = 0;
//        int leftBorderSum = 0, rightBorderSum = 0;
//        int center = ( left + right ) / 2;
//
//        if( left == right )  // Base case
//            return a[ left ] > 0 ? a[ left ] : 0;
//
//        int maxLeftSum  = maxSumRec( a, left, center );
//        int maxRightSum = maxSumRec( a, center + 1, right );
//
//        for( int i = center; i >= left; i-- )
//        {
//            leftBorderSum += a[ i ];
//            if( leftBorderSum > maxLeftBorderSum )
//                maxLeftBorderSum = leftBorderSum;
//        }
//
//        for( int i = center + 1; i <= right; i++ )
//        {
//            rightBorderSum += a[ i ];
//            if( rightBorderSum > maxRightBorderSum )
//                maxRightBorderSum = rightBorderSum;
//        }
//
//
//        Log.e("sum",String.valueOf(maxLeftSum) );
//        Log.e("sum",String.valueOf(maxRightSum) );
//        Log.e("sum",String.valueOf(maxLeftBorderSum) );
//        Log.e("sum",String.valueOf(maxRightBorderSum) );
//
//        tc_cal.setText(String.valueOf(maxRightBorderSum)  );
//
//        return max3( maxLeftSum, maxRightSum,
//                maxLeftBorderSum + maxRightBorderSum );
//    }
//
//    private static int max3( int a, int b, int c )
//    {
//        return a > b ? a > c ? a : c : b > c ? b : c;
//    }

    //    public static int maxSubSum1( int [ ] a )
//    {
//        int maxSum = 0;
//
//        for( int i = 0; i < a.length; i++ )
//            for( int j = i; j < a.length; j++ )
//            {
//                int thisSum = 0;
//
//                for( int k = i; k <= j; k++ )
//                    thisSum += a[ k ];
//
//                if( thisSum > maxSum )
//                {
//                    maxSum   = thisSum;
//                    seqStart = i;
//                    seqEnd   = j;
//                }
//            }
//
//        Log.e("max", String.valueOf(maxSum));
//        tc_cal.setText(String.valueOf(maxSum));
//
//        return maxSum;
//    }


}




