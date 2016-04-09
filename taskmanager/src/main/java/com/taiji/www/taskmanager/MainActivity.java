package com.taiji.www.taskmanager;

import android.content.Intent;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.Button;

public class MainActivity extends AppCompatActivity implements View.OnClickListener{
    private Button TaskManage;
    private Button TaskFeedBack;
    private Button TaskSetting;
    private Button TaskRec;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        TaskManage=(Button)findViewById(R.id.Button);
        TaskFeedBack=(Button)findViewById(R.id.Button2);
        TaskSetting=(Button)findViewById(R.id.Button3);
        TaskRec=(Button)findViewById(R.id.Button4);
        TaskManage.setOnClickListener(this);
        TaskFeedBack.setOnClickListener(this);
        TaskSetting.setOnClickListener(this);
        TaskRec.setOnClickListener(this);

        FloatingActionButton fab = (FloatingActionButton) findViewById(R.id.fab);
        fab.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Snackbar.make(view, "Replace with your own action", Snackbar.LENGTH_LONG)
                        .setAction("Action", null).show();
            }
        });
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_main, menu);
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
            return true;
        }

        return super.onOptionsItemSelected(item);
    }

    @Override
    public void onClick(View v) {
        switch (v.getId()){
            case R.id.Button:
                Intent intent_manage = new Intent(MainActivity.this,TaskManageActivity.class);
                startActivity(intent_manage);
                break;
            case R.id.Button2:
                Intent intent_feedback = new Intent(MainActivity.this,TaskFeedBackActivity.class);
                startActivity(intent_feedback);
                break;
            case R.id.Button3:
                Intent intent_setting = new Intent(MainActivity.this,TaskSettingActivity.class);
                startActivity(intent_setting);
                break;
            case R.id.Button4:
                Intent intent_rec = new Intent(MainActivity.this,TaskRecActivity.class);
                startActivity(intent_rec);
                break;
            default:
                break;
        }

    }
}
