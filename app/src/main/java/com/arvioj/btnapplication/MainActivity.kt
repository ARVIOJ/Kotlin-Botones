package com.arvioj.btnapplication

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.widget.Button
import android.widget.Toast

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val boton1 : Button = findViewById(R.id.button);
        val boton2 : Button = findViewById(R.id.button2);

        boton1.setOnClickListener(){

        Log.d("btnApplication","Click en el boton 1")
            Toast.makeText(this,"Click en el boton 1",Toast.LENGTH_SHORT).show()
        }

        boton2.setOnClickListener(){

            Log.d("btnApplication","Click en el boton 2")
            Toast.makeText(this,"Click en el boton 2",Toast.LENGTH_SHORT).show()
        }


    }
}