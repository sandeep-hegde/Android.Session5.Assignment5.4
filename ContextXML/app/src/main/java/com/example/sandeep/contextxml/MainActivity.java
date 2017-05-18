//Android Developer Training Session 5 - Assignment 5.4

//Problem Statement - You need to create context menu having three options through xml
//and show toast on selection of particular option.


package com.example.sandeep.contextxml;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.ContextMenu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.widget.TextView;
import android.widget.Toast;

/*
1.Create new "menu" folder under res.
2.Create new context_menu_layout.xml(any name) under menu folder.
3.After creating custom menu layout add the new items Action 1,Action 2, Action 3.
4.Register TextView with context menu.
5.Inflate the custom context menu layout into activity_main.xml layout.
*/

public class MainActivity extends AppCompatActivity {

    TextView mText;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        mText = (TextView) findViewById(R.id.textView);

        //Registering TextView with context menu.
        registerForContextMenu(mText);
    }

    @Override

    //Method to inflate the context_menu_layout into activity_main.xml

    public void onCreateContextMenu(ContextMenu menu, View v, ContextMenu.ContextMenuInfo menuInfo) {
        super.onCreateContextMenu(menu, v, menuInfo);

        MenuInflater inflater = getMenuInflater();
        inflater.inflate(R.menu.context_menu_layout, menu);
    }

    @Override

    //Method to show what happens when the items in the menu is clicked

    public boolean onContextItemSelected(MenuItem item) {

        switch (item.getItemId()) {

            case R.id.option_1:
                Toast.makeText(this, "ACTION 1", Toast.LENGTH_SHORT).show();
                break;

            case R.id.option_2:
                Toast.makeText(this, "ACTION 2", Toast.LENGTH_SHORT).show();
                break;

            case R.id.option_3:
                Toast.makeText(this, "ACTION 3", Toast.LENGTH_SHORT).show();
                break;

        }

        return super.onContextItemSelected(item);


    }
}



