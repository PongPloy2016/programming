package com.codegears.programming.activity;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListAdapter;
import android.widget.ListView;

import com.codegears.programming.R;
import com.codegears.programming.adapter.MyArrayAdapter;
import com.codegears.programming.util.Logger;


public class MenuActivity extends AppCompatActivity {
    private  static  final  String[] cities = {


            "MENU 1",
            "MENU 2",
            "MENU 3",
            "MENU 4",
            "MENU 5",
            "MENU 6",
            "MENU 7",
            "MENU 8",
            "MENU 9",
            "MENU 10",
            "MENU 11",
            "MENU 12",
            "MENU 13",
            "MENU 14",
            "MENU 15",

    };

    private ListView ListView_Menu;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_menu);

        ListAdapter myArrayAdapter = new MyArrayAdapter(
                this,                        // context
                R.layout.row_layout_listview_custom,  // layoutResource int
                R.id.triple_user,            // textViewResourceId int
                cities                      // list of objects
        );
        ListView_Menu = (ListView) findViewById(R.id.listView);
        ListView_Menu.setAdapter(myArrayAdapter);
        ListView_Menu.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                switch (position) {
                    case 0: {
                        Intent i = new Intent(getApplication(), SubMenu1Activity.class);
                        startActivity(i);
                        break;
                    }
                    case 1: {
                        Intent k = new Intent(getApplication(), SubMenu2Activity.class);
                        startActivity(k);
                        break;
                    }
                    case 2: {
                        Intent j = new Intent(getApplication(), SunMenu3Activty.class);
                        startActivity(j);
                        break;
                    }
                    case 3: {
                        Intent j = new Intent(getApplication(), SubMenu4Activty.class);
                        startActivity(j);
                        break;
                    }
                    case 4: {
                        Intent i = new Intent(getApplication(), SubMenu5Activty.class);
                        startActivity(i);
                        break;
                    }
                    case 5: {
                        Intent p = new Intent(getApplication(), SubMenu6Activity.class);
                        startActivity(p);
                        Logger.Log("name_data_main",cities.toString());
                        break;
                    }
                }
            }
        });
    }
}
