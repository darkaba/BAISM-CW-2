package com.example.baism_cw_2

import org.junit.Test
import org.junit.Assert.assertEquals

class KonwerterWalutTest {

    val konwerter = KonwerterWalut()

    @Test
    fun testPlnNaEuro() {
        val wynik = konwerter.plnNaEuro(43.0)
        assertEquals(100.0, wynik, 0.01)
    }

    @Test
    fun testEuroNaPln() {
        val wynik = konwerter.euroNaPln(10.0)
        assertEquals(43.0, wynik, 0.01)
    }
}
