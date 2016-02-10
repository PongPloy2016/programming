package com.codegears.programming.activity;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.ListAdapter;
import android.widget.ListView;
import android.widget.Toast;

import com.codegears.programming.Adapter.User;
import com.codegears.programming.R;
import com.codegears.programming.Adapter.MyArrayAdapter;

import java.util.ArrayList;


public class MenuActivity extends AppCompatActivity {

    private Button menu1 ;
    private Button menu2 ;
    private Button menu3 ;
    private Button menu4 ;
    private Button menu5 ;
    ListView cityListView;
    String[] Cities ;

    public String name;
    public String hometown;




    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_menu);


        menu1 =  (Button) findViewById(R.id.bt_menu1);
        menu2 =  (Button) findViewById(R.id.bt_menu2);
        menu3 =  (Button) findViewById(R.id.bt_menu3);
        menu4 =  (Button) findViewById(R.id.bt_menu4);
        menu5 =  (Button) findViewById(R.id.bt_menu5);

        ArrayList<User> array = User.getUsers();



//        Cities = new String[]{
//                "MENU ",
//        };
//
//        for(int i = 1 ; i < Cities.length ; i++){
//
//            Cities = new String[]{
//                    "MENU ", String.valueOf(+i),
//            };
//
//        }

        String[] Cities = {
                "MENU 1",
                "MENU 2",
                "MENU 3",
                "MENU 4",
                "MENU 5",
                "MENU 6",
                "MENU 7",
                "MENU 8",
        };



        ListAdapter myArrayAdapter = new MyArrayAdapter(
                this,                        // context
                R.layout.row_layout_listview_custom,  // layoutResource int
                R.id.triple_user,            // textViewResourceId int
                Cities                      // list of objects
        );



       // ListAdapter cityAdapter = new ArrayAdapter<String>(this, android.R.layout.simple_list_item_1, Cities);
         cityListView = (ListView) findViewById(R.id.listView);
        cityListView.setAdapter(myArrayAdapter);
       // cityListView.setAdapter(cityAdapter);


        cityListView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                String value = cityListView.getAdapter().getItem(position).toString();


                switch (position){
                    case 0 :
                    {
                        Intent i = new Intent(getApplication(), SubMenu1Activity.class);
                        startActivity(i);
                        break;
                    }
                    case 1 :
                    {

                        Intent k = new Intent(getApplication(), SubMenu2Activity.class);
                        startActivity(k);

                        break;
                    }
                    case 2 :
                    {

                        Intent j = new Intent(getApplication(), SunMenu3Activty.class);
                        startActivity(j);
                        break;
                    }
                    case 3 :
                    {

                        Intent j = new Intent(getApplication(), SubMenu4Activty.class);
                        startActivity(j);
                        break;
                    }
                    case 4 :
                    {

                        Intent i = new Intent(getApplication(), SubMenu5Activty.class);
                        startActivity(i);

                        break;
                    }
                    case 5 :
                    {

                        Intent p = new Intent(getApplication(), SubMenu6Activity.class);
                        startActivity(p);
                        break;
                    }



                }


//                if(position ==1){
//
//                    Intent i = new Intent(getApplication(), SubMenu1Activity.class);
//                    startActivity(i);
//                }
//
//                if(value .equals("MENU 2")){
//
//                    Intent k = new Intent(getApplication(), SubMenu2Activity.class);
//                    startActivity(k);
//                }
//
//
//                if(value .equals("MENU 3")){
//
//                    Intent j = new Intent(getApplication(), SunMenu3Activty.class);
//                    startActivity(j);
//                }
//
//
//                if(value .equals("MENU 4")){
//
//                    Intent j = new Intent(getApplication(), SubMenu4Activty.class);
//                    startActivity(j);
//                }
//
//                if(value .equals("MENU 5")){
//
//                    Intent i = new Intent(getApplication(), SubMenu5Activty.class);
//                    startActivity(i);
//                }
//
//                if(value .equals("MENU 5")){
//
//                    Intent i = new Intent(getApplication(), SubMenu5Activty.class);
//                    startActivity(i);
//                }
//
//                else{
//
//                    Toast.makeText(getApplication(), " No  data",
//                            Toast.LENGTH_LONG).show();
//                }



                Log.e("Onclick",value);
            }
        });

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
