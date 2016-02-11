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

public class SubMenu1Activity extends AppCompatActivity {
    private Button bt_cal ;
    private EditText num1 ;
    private EditText num2 ;
    private String number1 , number2 ;
    private static int i;
    private  static TextView  number_call ;
    private ArrayList<String> aListNumbers = new ArrayList<>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_activity_menu_1);
        bt_cal  = (Button) findViewById(R.id.bt_calculate);
        num1 = (EditText) findViewById  (R.id.et_num1);
        num2 = (EditText) findViewById  (R.id.et_num2);
        number_call = (TextView) findViewById  (R.id.text_view_number);

        bt_cal.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                number1 = num1.getText().toString() ;
                number2 = num2.getText().toString();
               int s1  = Integer.parseInt(number1);
               int s2  = Integer.parseInt(number2);
                count(s1,s2);
            }
        });
    }
    public    int count(int L, int R) {
        int resultNum = 0;
        for(  i= L ; i<= R ;i++){
            int count= 0 ;
            for( int n = i ; n >=1 ;n -- ){

                if(i%n==0){
                    count = count + 1 ;
                    //	System.out.println("  Data : \n "  +count );
                }
            }
            if(count == 2)
            {//b = b +i + "" ;
                String ss=	String .valueOf(i);
                //	System.out.print("\n" +i );
                if(isPalindrome(i))
                {
                    resultNum++;
                }
                else{
                }
            }
        }

        return resultNum;
    }
    public boolean isPalindrome(int number  ) {
        int p = number; // ประกาศ  p เป็น int ให้เท่ากับ number ของ ตัวที่ มาจาก method
        int r = 0; //ประกาศ r เป็น int โดยให้มีค่าเรื่องต้นเท่ากับ 0
        int w = 0 ;
        while (p != 0) {  // เงื่อนไข While ถ้า p ไม่เท่ากับ 0  เช่น  2!= 0 จริง  เข้า
            w = p % 10;
            //หาหลักหน่วย  //หลักสิบ //หลักร้อย
            // ประกาศตัว แปร W ให้ เท่ากับค่า p ที่มาจาก parramiter ให้ & mod กับ  10 คือ เช่น  2 % 10 = 2 ; w= 2 ; 3% 10 ; w =3
            r = r * 10 + w;  // (ให้  R ที่มาจาก การประกาศค่ตัวแปร แล้ว * 10) + w  จะมาจากค่า w = p % 10; ที่ mod ไว้  เช่น 0*10 + 2 = 2
            p = p / 10;  //แล้วใช้ p ที่จมาจากตัว paramiter แล้วมาหาร  10  เพราะถ้าไม่มี ก็จะสามารถพิมพ์ค่าออกมาได้  || ทำไงก็ได้ให้เป็น 0  และเอามาแทนค่ตัวต่อไป
        }
        // 1 วนวูปเช็คว่า   (p != 0) หรือไม่   โดย  p มาจาก sp = number ที่รับมาpp
        // 2 r = (r * 10)  ; หลัก หน่วย   หลักสิบ   * 10   จะเพิ่มขึ้นในสถานะ โดยใช้วิธีการสลับที่  โดยจะไม่ซ้ำกัน เมื่อมีการแยก  ที่จะสามารถขึ้นไปตัวต่อไปได้ + (p%10)หาเศษในหลักหน่วย0 :  ;

        //3   p = p /10 ; เพื่อเช็ค  ว่าให้มันเป็น 0 เพื่อหลุด Loop
        if (number == r) {
            String strNumbers = "1,2,3,4,5";
            String s1 = String.valueOf(i);
            Log.e("data", s1);
           // String[] strValues = new String[] {s1 };
            //ArrayList<String> aListNumbers = new ArrayList<String>(Arrays.asList(strValues));
            aListNumbers.add(s1);
            String[] stockArr = new String[aListNumbers.size()];
            stockArr = aListNumbers.toArray(stockArr);
           number_call.setText(aListNumbers.toString());
            Log.e("stockArr", stockArr.toString());

            return true; //เรียก return ไป
        }
        return false;
    }

}
