package com.jeruk.gd3_c_0665.entity

class Dosen(var name: String, var pengajar: String) {

    //companion object seperti static di java dan berikut adalah array untuk menyimpan data dummy mahasiswa
    companion object {
        @JvmField
        var lissOfDosen = arrayOf(
            Dosen("Fedelis Brian", "Pengajar Kelas A, B, dan D"),
            Dosen("Thomas Adi", "Pengajar Kelas C"),
        )
    }

}