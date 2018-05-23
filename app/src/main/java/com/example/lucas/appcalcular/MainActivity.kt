package com.example.lucas.appcalcular

import android.content.Intent
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.Toast

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val edtValor1 = findViewById<EditText>(R.id.edtValor1)
        val edtValor2 = findViewById<EditText>(R.id.edtValor2)
        val btnCalcular= findViewById<Button>(R.id.btnCalcular)

        var resultado = 0

        if (intent.extras != null){
            var test: String = intent.extras["NOTA1"].toString()
            var testCase2: String = intent.extras["NOTA2"].toString()
            edtValor1.setText(test)
            edtValor2.setText(testCase2)
//            Toast.makeText(this, test, Toast.LENGTH_LONG).show()
//            edtValor2.text = intent.getStringExtra("NOTA2").toString()

            resultado  = edtValor1.text.toString().toInt() + edtValor2.text.toString().toInt()


        }


        btnCalcular.setOnClickListener{
            val resultIntent = Intent()
            resultIntent.putExtra("RESULTADO",resultado)
            setResult(Intent.FILL_IN_ACTION, resultIntent)
            finish()
        }
    }
}
