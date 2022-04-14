package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;


import android.os.Bundle;
import android.graphics.Color;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;


public class MainActivity extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
    //创建选项菜单
    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        MenuInflater inflater = new MenuInflater(this);     //实例化一个MenuInflater对象
        inflater.inflate(R.menu.menu,menu);        //解析菜单文件
        return super.onCreateOptionsMenu(menu);
    }

    //当菜单项被选择时，做出相应的处理
    @Override
    public boolean onOptionsItemSelected(MenuItem item) {

        DrawView dv = findViewById(R.id.drawView1);
        dv.paint.setXfermode(null);                                 //取消擦除效果
        dv.paint.setStrokeWidth(5);                                 //初始化画笔的宽度
        switch (item.getItemId()) {
            case R.id.red:
                dv.paint.setColor(Color.RED);
                item.setChecked(true);
                break;
            case R.id.green:
                dv.paint.setColor(Color.GREEN);
                item.setChecked(true);
                break;
            case R.id.blue:
                dv.paint.setColor(Color.BLUE);
                item.setChecked(true);
                break;
            case R.id.width_1:
                dv.paint.setStrokeWidth(5);
                break;
            case R.id.width_2:
                dv.paint.setStrokeWidth(10);
                break;
            case R.id.width_3:
                dv.paint.setStrokeWidth(15);
                break;
            case R.id.clear:
                dv.clear();
                break;
            case R.id.undo:
                dv.undo();
                break;
            case R.id.save:
                dv.saveimg();
                break;
            case R.id.delete:
                dv.delete();
                break;
            default:
                return super.onOptionsItemSelected(item);
        }
        return true;
    }
}

