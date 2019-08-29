package com.example.alla.menu;

import android.content.DialogInterface;
import android.content.Intent;
import android.graphics.Color;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.ContextMenu;
import android.view.Gravity;
import android.view.View;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.CheckBox;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    CheckBox cb1, cb2;
    TextView tColor, tSize;
    ImageView imageView;
    AlertDialog.Builder builder;

    final int MENU_COLOR_RED = 1;
    final int MENU_COLOR_GREEN = 2;
    final int MENU_COLOR_BLUE = 3;
    final int MENU_COLOR_YELLOW = 4;
    final int MENU_COLOR_ORANGE = 5;
    final int MENU_COLOR_PINK = 6;
    final int MENU_SIZE_22 = 7;
    final int MENU_SIZE_24 = 8;
    final int MENU_SIZE_26 = 9;
    final int MENU_SIZE_28 = 10;
    final int MENU_SIZE_30 = 11;
    final int MENU_SIZE_32 = 12;
    final int MENU_SIZE_34 = 13;
    final int MENU_SIZE_36 = 14;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        cb1 = findViewById(R.id.cb1);
        cb2 = findViewById(R.id.cb2);

        tColor = findViewById(R.id.textColor);
        tSize = findViewById(R.id.textSize);

        registerForContextMenu(tColor);
        registerForContextMenu(tSize);

        imageView = findViewById(R.id.imageView);
        imageView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast toast = Toast.makeText(getApplicationContext(), "hello", Toast.LENGTH_SHORT);
                toast.setGravity(Gravity.CENTER, 0, 0);
                LinearLayout linearLayout = (LinearLayout) toast.getView();
                ImageView imageView = new ImageView(getApplicationContext());
                imageView.setImageResource(R.drawable.aa);
                imageView.setMaxWidth(100);
                imageView.setMaxHeight(100);
                linearLayout.addView(imageView, 1);
                linearLayout.setMinimumWidth(500);
                linearLayout.setMinimumHeight(500);
                toast.show();
            }
        });
        FloatingActionButton fab = (FloatingActionButton) findViewById(R.id.fab);
        fab.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
//                Snackbar.make(view, "Replace with your own action", Snackbar.LENGTH_LONG)
//                        .setAction("Action", null).show();

                /*builder.setMessage(R.string.dialog_message) .setTitle(R.string.dialog_title);

                //Setting message manually and performing action on button click
                builder.setMessage("Do you want to close this application ?")
                        .setCancelable(false)
                        .setPositiveButton("Yes", new DialogInterface.OnClickListener() {
                            public void onClick(DialogInterface dialog, int id) {
                                finish();
                                Toast.makeText(getApplicationContext(),"you choose yes action for alertbox",
                                        Toast.LENGTH_SHORT).show();
                            }
                        })
                        .setNegativeButton("No", new DialogInterface.OnClickListener() {
                            public void onClick(DialogInterface dialog, int id) {
                                //  Action for 'NO' Button
                                dialog.cancel();
                                Toast.makeText(getApplicationContext(),"you choose no action for alertbox",
                                        Toast.LENGTH_SHORT).show();
                            }
                        });
                //Creating dialog box
                AlertDialog alert = builder.create();
                //Setting the title manually
                alert.setTitle("AlertDialogExample");
                alert.show();*/
                Toast.makeText(getApplicationContext(), "hello", Toast.LENGTH_SHORT).show();
                Intent i = new Intent(getApplicationContext(), Main3Activity.class);
                startActivity(i);
            }
        });
    }

    @Override
    public void onCreateContextMenu(ContextMenu menu, View v, ContextMenu.ContextMenuInfo menuInfo) {
        switch (v.getId()) {
            case R.id.textColor:
                menu.add(0, MENU_COLOR_RED, 0, "Red");
                menu.add(0, MENU_COLOR_GREEN, 0, "Green");
                menu.add(0, MENU_COLOR_BLUE, 0, "Blue");
                menu.add(0, MENU_COLOR_ORANGE, 0, "Orange");
                menu.add(0, MENU_COLOR_YELLOW, 0, "Yellow");
                menu.add(0, MENU_COLOR_PINK, 0, "Pink");
                break;
            case R.id.textSize:
                menu.add(0, MENU_SIZE_22, 0, "22");
                menu.add(0, MENU_SIZE_24, 0, "24");
                menu.add(0, MENU_SIZE_26, 0, "26");
                menu.add(0, MENU_SIZE_28, 0, "28");
                menu.add(0, MENU_SIZE_30, 0, "30");
                menu.add(0, MENU_SIZE_32, 0, "32");
                menu.add(0, MENU_SIZE_34, 0, "34");
                menu.add(0, MENU_SIZE_36, 0, "36");
                break;

        }
    }

    @Override
    public boolean onContextItemSelected(MenuItem item) {
        switch (item.getItemId()) {
            case MENU_COLOR_RED:
                tColor.setTextColor(Color.RED);
                break;
            case MENU_COLOR_GREEN:
                tColor.setTextColor(Color.GREEN);
                break;
            case MENU_COLOR_BLUE:
                tColor.setTextColor(Color.BLUE);
                break;
            case MENU_COLOR_YELLOW:
                tColor.setTextColor(Color.YELLOW);
                break;

            case MENU_COLOR_PINK:
                tColor.setTextColor(Color.rgb(255, 51, 153));
                break;

            case MENU_COLOR_ORANGE:
                tColor.setTextColor(Color.rgb(255, 153, 0));
                break;

            case MENU_SIZE_22:
                tSize.setTextSize(22);
                tSize.setText("Text size = 22");
                break;
            case MENU_SIZE_24:
                tSize.setTextSize(24);
                tSize.setText("Text size = 24");
                break;
            case MENU_SIZE_26:
                tSize.setTextSize(26);
                tSize.setText("Text size = 26");
                break;
            case MENU_SIZE_28:
                tSize.setTextSize(28);
                tSize.setText("Text size = 28");
                break;
            case MENU_SIZE_30:
                tSize.setTextSize(30);
                tSize.setText("Text size = 30");
                break;
            case MENU_SIZE_32:
                tSize.setTextSize(32);
                tSize.setText("Text size = 32");
                break;
            case MENU_SIZE_34:
                tSize.setTextSize(34);
                tSize.setText("Text size = 34");
                break;
            case MENU_SIZE_36:
                tSize.setTextSize(36);
                tSize.setText("Text size = 36");
                break;
        }
        return super.onContextItemSelected(item);
    }

    @Override
    public boolean onPrepareOptionsMenu(Menu menu) {
        MenuItem action = menu.findItem(R.id.action_settings);
        if (cb2.isChecked()) {
            action.setVisible(true);
        } else {
            action.setVisible(false);
        }
        menu.setGroupVisible(R.id.groups, cb1.isChecked());
        return super.onPrepareOptionsMenu(menu);
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_main, menu);
        menu.add(2, 4, 4, "hello").setCheckable(true);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            Toast.makeText(getApplicationContext(), "settings 0", Toast.LENGTH_SHORT).show();
            return true;
        } else if (id == R.id.action_settings1) {
            Toast.makeText(getApplicationContext(), "settings 1", Toast.LENGTH_SHORT).show();
            return true;
        } else if (id == R.id.action_settings2) {
            Toast.makeText(getApplicationContext(), "settings 2", Toast.LENGTH_SHORT).show();
            return true;
        } else if (id == R.id.action_settings3) {
            Toast.makeText(getApplicationContext(), "settings 3", Toast.LENGTH_SHORT).show();
            return true;
        } else if (id == R.id.action_settings4) {
            Intent i = new Intent(getApplicationContext(), Main2Activity.class);
            startActivity(i);
            Toast.makeText(getApplicationContext(), "settings 4", Toast.LENGTH_SHORT).show();
            return true;
        } else if (id == R.id.action_settings5) {
            item.setChecked(!item.isChecked());
            Toast.makeText(getApplicationContext(), "settings 5", Toast.LENGTH_SHORT).show();
            return true;
        } else if (id == 4) {
            item.setChecked(!item.isChecked());
            return true;
        }

        return super.onOptionsItemSelected(item);
    }
}