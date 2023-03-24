package ru.mirea.allik.toastapp;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    EditText editTextTextPersonName;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void press(View view) {
        EditText text1 = (EditText)findViewById(R.id.editTextTextPersonName);

        Toast toast = Toast.makeText(getApplicationContext(),
                "СТУДЕНТ №1 ГРУППА БСБО-03-20 Количество символов - " + String.valueOf(text1.getText()).length(),
                Toast.LENGTH_SHORT);
        toast.show();
    }
}