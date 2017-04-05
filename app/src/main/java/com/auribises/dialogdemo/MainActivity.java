package com.auribises.dialogdemo;

import android.app.Dialog;
import android.app.ProgressDialog;
import android.content.DialogInterface;
import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void clickHandler(View view){
        //showAlertDialog();
        //showAlertDialogWithItems();
        //showProgressDialog();
        showCustomDialog();
    }

    void showAlertDialog(){

        AlertDialog.Builder builder = new AlertDialog.Builder(this);
        builder.setTitle("Title");
        builder.setMessage("This is Message");
        builder.setCancelable(false); // If user will press the back key dialog will not be dismissed
        builder.setPositiveButton("Ok", new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialogInterface, int i) {

            }
        });
        builder.setNegativeButton("Cancel",null);
        builder.setNeutralButton("Done", new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialogInterface, int i) {
                finish();
            }
        });
        AlertDialog dialog = builder.create();
        dialog.show();


        //dialog.dismiss();
    }

    void showAlertDialogWithItems(){

        AlertDialog.Builder builder = new AlertDialog.Builder(this);
        builder.setTitle("Title");
        String[] items = {"View","Delete","Update","Restore"};
        builder.setItems(items, new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialogInterface, int i) {
                switch (i){
                    case 0:

                        break;

                    case 1:

                        break;
                }
            }
        });
        AlertDialog dialog = builder.create();
        dialog.show();


        //dialog.dismiss();
    }

    void showProgressDialog(){
        ProgressDialog progressDialog = new ProgressDialog(this);
        progressDialog.setMessage("Loading...");
        progressDialog.show();
    }

    void showCustomDialog(){
        Button button = null;
        Dialog dialog = new Dialog(this);
        dialog.setContentView(R.layout.activity_main);

        button = (Button)dialog.findViewById(R.id.button);

        dialog.show();
    }
}
