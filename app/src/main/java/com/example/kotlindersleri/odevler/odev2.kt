package com.example.kotlindersleri.odevler

fun main() {


    fun dereceyiFahrenheitaDonustur(celsius: Double): Double {
        return celsius * 1.8 + 32
    }

    fun dikdortgenCevresiHesapla(kisaKenar: Int, uzunKenar: Int): Int {
        if (kisaKenar <= 0 || uzunKenar <= 0) {
            return 0 // Geçersiz kenarlar için 0 döndür
        }
        return 2 * (kisaKenar + uzunKenar)
    }


    fun faktoriyelHesapla(sayi: Int): Long {
        if (sayi < 0) {
            return -1L // Negatif sayılar için -1 döndür (Long)
        }
        if (sayi == 0 || sayi == 1) {
            return 1L // 0! ve 1! = 1 (Long)
        }
        var sonuc: Long = 1
        for (i in 2..sayi) {
            sonuc *= i
        }
        return sonuc
    }

    fun kelimeKarakterSayisi(kelime: String): Int {
        return kelime.length
    }


    fun icAcilarToplamiHesapla(kenarSayisi: Int): Int {
        if (kenarSayisi < 3) {
            return 0 // Geçersiz kenar sayısı için 0 döndür
        }
        return (kenarSayisi - 2) * 180
    }


    fun maasHesapla(gunSayisi: Int): Int {
        if (gunSayisi < 0) {
            return 0 // Geçersiz gün sayısı
        }
        val saatlikUcretNormal = 10
        val saatlikUcretMesai = 20
        val gunlukCalismaSaati = 8
        val aylikMesaiSiniri = 160

        val toplamCalismaSaati = gunSayisi * gunlukCalismaSaati

        val normalCalismaSaati = minOf(toplamCalismaSaati, aylikMesaiSiniri)
        val mesaiSaati = maxOf(0, toplamCalismaSaati - aylikMesaiSiniri)

        val toplamMaas =
            (normalCalismaSaati * saatlikUcretNormal) + (mesaiSaati * saatlikUcretMesai)
        return toplamMaas
    }


    fun kotaUcretiHesapla(kullanilanGB: Int): Int {
        if (kullanilanGB < 0) {
            return 0 // Geçersiz kullanım
        }

        val kotaSiniri = 50 // GB
        val temelUcret = 100 // TL
        val asimUcretiGBBasina = 4 // TL

        if (kullanilanGB <= kotaSiniri) {
            return temelUcret
        } else {
            val asilanMiktar = kullanilanGB - kotaSiniri
            val ekUcret = asilanMiktar * asimUcretiGBBasina
            return temelUcret + ekUcret
        }
    }

}











