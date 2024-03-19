package com.example.natevitinhokauaerick

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.EditText
import android.widget.RadioButton
import android.widget.TextView
import kotlin.math.atan
import kotlin.math.cos
import kotlin.math.sin
import kotlin.math.sqrt
import kotlin.math.tan

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }

    fun conversao (view: View) {

    val numdigitado1 = findViewById<EditText>(R.id.editTextA)
        val valordigitado1 = numdigitado1.text.toString().toFloat()
    val numdigitado2 = findViewById<EditText>(R.id.editTextB)
        val valordigitado2 = numdigitado2.text.toString().toFloat()
    val modulo = findViewById<TextView>(R.id.textModulo)
    val angulo = findViewById<TextView>(R.id.textAngulo)
        val op1 = findViewById<RadioButton>(R.id.radioButton1)
        val op2 = findViewById<RadioButton>(R.id.radioButton2)

    var z = sqrt((valordigitado1 * valordigitado1)+(valordigitado2*valordigitado2))
        var o = atan(valordigitado2 / valordigitado1)
       // var polarmod = cos(valordigitado1/z)
       // var polarang = sin(valordigitado2/z)
        var retmod = valordigitado1 * cos(valordigitado2)
        var retand = valordigitado1 * sin(valordigitado2)

        if (op1.isChecked) {
            modulo.setText("A: $retmod")
            angulo.setText("B: $retand")
        }

        if (op2.isChecked) {
            modulo.setText("Módulo: $z")
            angulo.setText("Angulo: $o")
        }
    }

}
