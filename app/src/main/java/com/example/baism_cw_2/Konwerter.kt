package com.example.baism_cw_2

class KonwerterWalut {

    fun plnNaEuro(zlotowki: Double): Double {
        val kursEuro = 4.30
        val wynik = zlotowki / kursEuro
        return wynik
    }

    fun euroNaPln(euro: Double): Double {
        val kursEuro = 4.30
        val wynik = euro * kursEuro
        return wynik
    }
}
