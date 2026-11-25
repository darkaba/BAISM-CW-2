package com.example.baism_cw_2

import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import androidx.activity.ComponentActivity
import android.widget.LinearLayout

class MainActivity : ComponentActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        val kwota = EditText(this)
        kwota.hint = "Kwota PLN"

        val przycisk = Button(this)
        przycisk.text = "Przelicz"

        val wynik = TextView(this)

        val uklad = android.widget.LinearLayout(this)
        uklad.orientation = LinearLayout.VERTICAL

        uklad.addView(kwota)
        uklad.addView(przycisk)
        uklad.addView(wynik)

        setContentView(uklad)

        val konwerter = KonwerterWalut()

        przycisk.setOnClickListener {
            val liczba = kwota.text.toString().toDoubleOrNull()

            if (liczba != null) {
                val euro = konwerter.plnNaEuro(liczba)
                wynik.text = "$euro EUR"
            } else {
                wynik.text = "Podaj liczbę"
            }
        }
    }
}
