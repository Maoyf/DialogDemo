package com.cdivtc.dialogdemo;

import android.app.ProgressDialog;
import android.content.DialogInterface;
import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        //普通对话框
        //commonDialog();
        //单选对话框
        //SingleDialog();
        //多选对话框
        //MultiDialog();
        //进度条对话框
        //ProDialog();
        //消息对话框
        //创建Toast
        Toast.makeText(MainActivity.this,"HELLO,Toast",Toast.LENGTH_LONG).show();


    }

    private void ProDialog() {
        //声明对话框
        ProgressDialog proDialog;
        //构建对话框
        proDialog = new ProgressDialog(MainActivity.this);
        proDialog.setTitle("进度条对话框");
        proDialog.setIcon(R.mipmap.ic_launcher);
        proDialog.setMessage("正在下载请稍候...");
        proDialog.setProgressStyle(ProgressDialog.STYLE_SPINNER);
        proDialog.show();
    }

    private void MultiDialog() {
        //生成对话框
        new AlertDialog.Builder(MainActivity.this)
                .setTitle("请添加兴趣爱好！")
                .setIcon(R.mipmap.ic_launcher)
                .setMultiChoiceItems(new String[]{"旅游", "美食","汽车","宠物"}, null,null)
                .setPositiveButton("确定",null)
                .show();
    }

    private void SingleDialog() {
        //生成对话框
        new AlertDialog.Builder(MainActivity.this)
                .setTitle("请选择性别")
                .setIcon(R.mipmap.ic_launcher)
                .setSingleChoiceItems(new String[]{"男", "女"}, 0, new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialog, int which) {
                    }
                })
                .setPositiveButton("确定",null)
                .show();
    }

    private void commonDialog() {
        //定义一个对话框对象
        AlertDialog dialog ;
        //绑定当前界面窗口，设置相关属性
        dialog = new AlertDialog.Builder(MainActivity.this).setTitle("普通Dialog对话框")//设置标题
                .setMessage("是否确定退出？")//设置消息
                .setIcon(R.mipmap.ic_launcher)//设置图标
                .setPositiveButton("确定",null)//添加确定按钮
                .setNegativeButton("取消",null)//添加取消按钮
                .create();//创建对话框
        dialog.show();
    }
}
