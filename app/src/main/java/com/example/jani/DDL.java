package com.example.jani;

import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Context;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.google.android.material.dialog.MaterialAlertDialogBuilder;
import com.google.android.material.floatingactionbutton.FloatingActionButton;

public class DDL extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_ddl0);
        FloatingActionButton add_button = (FloatingActionButton) findViewById(R.id.add_DDL_item);
        add_button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                LayoutInflater inflater = getLayoutInflater();
                View ddl_dialog = inflater.inflate(R.layout.ddl_dialog,(ViewGroup) findViewById(R.id.ddl_dialog));
                AlertDialog dialog = new MaterialAlertDialogBuilder(DDL.this)
                        .setTitle("新建DDL")
                        .setMessage("Congratulations!")
                        .setView(ddl_dialog)
                        .setNeutralButton("暂存",null)
                        .setNegativeButton("取消", null)
                        .setPositiveButton("确定", null)
                        .create();
                dialog.show();
            }
        });
    }
}