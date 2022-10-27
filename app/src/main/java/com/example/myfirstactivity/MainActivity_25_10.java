package com.example.myfirstactivity;

import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity_25_10 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.my_first_activity);
    }

    public void btnClick(View view) {
        int id = view.getId();
        // Log.i("btnClick", " Click id: " + id);

        // R.id.txtHello // Найти элемент по Id
        String txt = (String) ((EditText)findViewById(R.id.edtMessage)).getText().toString();

        TextView txtHeader = findViewById(R.id.txtHello);
        txtHeader.setText(txt);

        Log.i("btnClick", " Text: " + txt);
        Toast.makeText(
                this,
                " Text: " + txt,
                Toast.LENGTH_LONG).show();
    }
}