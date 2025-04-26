package com.example.kotlindersleri_.Odevler



fun icAciToplami(kenarSayisi: Int): Int {
    return (kenarSayisi - 2) * 180
}

fun maasHesapla(gunSayisi: Int): Int {
    val calismaSaati = gunSayisi * 8
    val normalSaatUcreti = 10
    val mesaiUcreti = 20

    return if (calismaSaati <= 160) {
        calismaSaati * normalSaatUcreti
    } else {
        val mesaiSaati = calismaSaati - 160
        (160 * normalSaatUcreti) + (mesaiSaati * mesaiUcreti)
    }
}

fun kotaUcretiHesapla(kotaGb: Int): Int {
    val kotaSiniri = 50
    val kotaUcreti = 100
    val asimUcreti = 4

    return if (kotaGb <= kotaSiniri) {
        kotaUcreti
    } else {
        val ekstraGb = kotaGb - kotaSiniri
        kotaUcreti + (ekstraGb * asimUcreti)
    }
}

fun dereceToFahrenheit(celsius: Double): Double {
    return celsius * 1.8 + 32
}

fun dikdortgenCevresi(kenar1: Int, kenar2: Int): Int {
    return 2 * (kenar1 + kenar2)
}

fun faktoriyel(sayi: Int): Int {
    var sonuc = 1
    for (i in 1..sayi) {
        sonuc *= i
    }
    return sonuc
}

fun aHarfiSayisi(kelime: String): Int {
    return kelime.count { it == 'a' || it == 'A' }
}


fun main() {
    println("6 kenarli seklin ic acilari toplami: ${icAciToplami(6)} derece")
    println("22 gun calisan birinin maasi: ${maasHesapla(22)} ")
    println("60 GB internet kullanan birinin odeyecegi ucret: ${kotaUcretiHesapla(60)} ")

    println("30 derece Fahrenheit: ${dereceToFahrenheit(30.0)}")
    println("dikdortgen cevresi (3, 4): ${dikdortgenCevresi(3, 4)}")
    println("5'in faktoriyel: ${faktoriyel(5)}")
    println("\"Ankara\" kelimesinde 'a' sayisi: ${aHarfiSayisi("Ankara")}")
}

