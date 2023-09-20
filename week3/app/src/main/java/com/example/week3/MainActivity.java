package com.example.week3;

import android.os.Bundle;


import androidx.appcompat.app.AppCompatActivity;

import android.view.View;

import androidx.core.view.WindowCompat;
import androidx.navigation.NavController;
import androidx.navigation.Navigation;
import androidx.navigation.ui.AppBarConfiguration;
import androidx.navigation.ui.NavigationUI;

import com.example.week3.databinding.ActivityMainBinding;

import android.view.Menu;
import android.widget.GridView;

import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    /*private AppBarConfiguration appBarConfiguration;
    private ActivityMainBinding binding;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }'*/

    TextView selection;
    String[] items = {"Android","IPhone","WindowsMobile",
            "Blackberry","WebOS","Ubuntu","Windows7", "Max OS X"};


    @Override
    public void onCreate(Bundle icicle) {
        super.onCreate(icicle);
        setContentView(R.layout.gridview);
        findViewById(R.id.grid);
        selection = (TextView) findViewById(R.id.selection);

        GridView gv = (GridView) findViewById(R.id.grid);
        ArrayAdapter<String> aa = new ArrayAdapter<String>(this, android.R.layout.simple_list_item_1,items );
        gv.setAdapter(aa);
        /*

        gv.setOnItemClickListener((AdapterView.OnItemClickListener) this);*/
    }
    /*
    public void onItemClick(AdapterView<?> parent, View v,
                            int position, long id) {
        selection.setText(items[position]);
    }*/
}// class



