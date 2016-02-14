package com.codegears.programming.activity;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.View;




import com.codegears.programming.R;
import com.codegears.programming.adapter.CustomAdapter;

import com.codegears.programming.adapter.HeaderFooterAdapter;
import com.codegears.programming.adapter.NameMenu;
import com.codegears.programming.adapter.RecyclerItemClickListener;
import com.codegears.programming.util.Logger;
import java.util.ArrayList;

public class RecycleViewMainActivity extends AppCompatActivity {

    private ArrayList<NameMenu> mPersonList;
    private RecyclerView mRecyclerView;
    private CustomAdapter mAdapter;
    private RecyclerView.LayoutManager mLayoutManager;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_recycle_view_main);


        mRecyclerView = (RecyclerView) findViewById(R.id.recyclerView);
        // use this setting to improve performance if you know that changes
        // in content do not change the layout size of the RecyclerView
        mRecyclerView.setHasFixedSize(true);
        // use a linear layout manager
        mLayoutManager = new LinearLayoutManager(getApplicationContext());
        mRecyclerView.setLayoutManager(mLayoutManager);


        LinearLayoutManager linearLayoutManager = new LinearLayoutManager (this);
        HeaderFooterAdapter adapter = new HeaderFooterAdapter(RecycleViewMainActivity.this,getListItems());
        mRecyclerView.setLayoutManager(linearLayoutManager);
        mRecyclerView.setAdapter(adapter);

        mRecyclerView.addOnItemTouchListener(
                new RecyclerItemClickListener(getApplicationContext(), new RecyclerItemClickListener.OnItemClickListener() {
                    @Override
                    public void onItemClick(View view, int position) {
                        try {
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
                                    Logger.Log("name_data_main", p.toString());
                                    break;
                                }
                            }
                        } catch (Exception e) {
                            e.printStackTrace();
                        }
                    }
                })
        );
       // setupPersonList();
    }
//    private void setupPersonList() {
//        mPersonList = new ArrayList<NameMenu>();
//        mPersonList.clear();
//        for (int i = 0; i < 25; i++) {
//            NameMenu person = new NameMenu("Person " + i);
//            mPersonList.add(person);
//        }
//        mAdapter = new CustomAdapter(mPersonList, this);
//        mRecyclerView.setAdapter(mAdapter);
//    }


    public ArrayList<Generic> getListItems () {
        ArrayList<Generic> generics = new ArrayList<Generic> ();
        for (int i = 0; i < 10; i++) {
            Generic item = new Generic ();
            item.setName ("list item" + i);
            generics.add (item);
        }
        return generics;
    }


}

