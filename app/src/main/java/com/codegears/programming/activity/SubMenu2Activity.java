package com.codegears.programming.activity;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;


import com.codegears.programming.R;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class SubMenu2Activity extends AppCompatActivity {

    private Button bt_cal ,bt_claer;
    private EditText num1 ;
    private EditText num2 ;
    private String number1 , number2 ;
    private  static TextView number_call ;
    private   String[] stockArr ;
    private  static String o1,o2;
    private boolean cc  ;
    Boolean test = false;
    private int ss,ss2 ;
    private int i,k , h,c  ;
    private ArrayList<String> aListNumbers = new ArrayList<>();
    private ArrayList<String> aListNumbers2 = new ArrayList<>();

    private Boolean  check ;
    List<String> list1;
    List<Object> list2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_activity_menu_2);

        bt_cal  = (Button) findViewById(R.id.bt_cal1_menu);
        bt_claer  = (Button) findViewById(R.id.bt_cal1_clear);
        num1 = (EditText) findViewById  (R.id.et_cal1);
        num2 = (EditText) findViewById  (R.id.et_cal2);
        number_call = (TextView) findViewById  (R.id.text_view_number_cal);

        bt_claer.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                aListNumbers.clear();
                aListNumbers2.clear();
                num1.setText("");
                num2.setText("");
                number_call.setText(R.string.name_Menu_message);
            }
        });
        bt_cal.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                number1 = num1.getText().toString();
                number2 = num2.getText().toString();
                int num = ss;
                String ayy [] = number1.split(",");
                String ayy2 [] = number2.split(",");
                compareSets(ayy,ayy2);
            }
        });
    }
    public     String   compareSets (String[] a, String[] b   ) {
        // TODO Auto-generated method stub
        Log.e("", a +" +"+ "\n");
        Log.e ("", b +"+ "+ "\n");
        for (   h = 0; h < b.length; h++) {
            //   o1 = a[h];
            Log.e("number2", "=" + b[h]);
            // numbers2[k];
            for (c = 0; c < a.length; c++) {
                try {
                    o2 = b[c];
                    o1 = a[h];
                    Log.e("Number aListNumbers  = ", o2.toString());
                    Log.e("Number aListNumbers2 = ", o1.toString());
                    Log.e("Data = ", o1 + "," + o2 + "\n");
                    aListNumbers.add(o1);
                    aListNumbers2.add(o2);
                    Log.e("Number Numbers  = ",aListNumbers.toString());
                    Log.e("Number Numbers_2 = ", aListNumbers2.toString());
                    list1 = new ArrayList<String>();
                    list2 = new ArrayList<Object>();
                    list1.add(o1);
                    list2.add(o2);
                    Log.e("List1 = ", list1.toString());
                    Log.e("List2 = ", list2.toString());
                    Log.e("Number equals check  = ", String.valueOf(list1.equals(list2)));
                    check = Boolean.valueOf(String.valueOf(list1.equals(list2)));
                    Log.e("Data equals  ", String.valueOf(aListNumbers.equals(aListNumbers2)));
                    //equalLists(aListNumbers,aListNumbers2);
                } catch (Exception e) {
                    // TODO: handle exception
                }
           }}
        if ( equalLists(aListNumbers,aListNumbers2) ) {
            if(list1.containsAll(list2) && list2.containsAll(list1)){
                Log.e("list1  = ", list1.toString());
                Log.e("list2 = ", list2.toString());
                number_call.setText("EQUAL");
                aListNumbers.clear();
                aListNumbers2.clear();
                }
            //   Log.e("Data o1 == o2", o1 + "," + o2 + "\n");
            Log.e("Number aListNumbers  = ", aListNumbers.toString());
            Log.e("Number aListNumbers2 = ", aListNumbers2.toString());

            check = true;
            number_call.setText("EQUAL");
        }
        else if (a.length <= b.length) {
            Log.e("LESS", "\n");
            number_call.setText("LESS");
            aListNumbers.clear();
            aListNumbers2.clear();
            return "LESS";
        } else if (a.length >= b.length) {
            Log.e("GREATER", "\n");
            number_call.setText("GREATER");
            aListNumbers.clear();
            aListNumbers2.clear();
            return "GREATER";
        }  else {
            number_call.setText("INCOMPARABLE");
            Log.e("Data o1 != o2", o1 + "," + o2 + "\n");
            aListNumbers.clear();
            aListNumbers2.clear();
            cc = false;
            return "INCOMPARABLE";
        }
        return null;
    }
    public  boolean equalLists(List<String> one, List<String> two){
        if (one == null && two == null){
            return true;
        }
        if((one == null && two != null)
                || one != null && two == null
                || one.size() != two.size()){
            return false;
        }
        one = new ArrayList<String>(one);
        two = new ArrayList<String>(two);
        Collections.sort(one);
        Collections.sort(two);
        return one.equals(two);
    }
}
