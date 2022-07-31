package com.example.listwisata

object WisataData {
    private val nama = arrayOf(
        "Dufan",
        "Trans Studio",
        "Curug Cimarinjung",
        "Bali",
        "Malioboro",
        "Geopark Ciletuh",
        "Pasir Putih Ujung Genteng",
        "Cimory Dairyland",
        "Puncak",
        "Sawarna"
    )
    private val location = arrayOf(
        "Jakarta",
        "Bandung",
        "Geopark Ciletuh",
        "Bali",
        "Yogyakarta",
        "Pelabuhan Ratu",
        "Ujung Genteng",
        "Bogor",
        "Puncak",
        "Sawarna",
    )
    private val detail = arrayOf(
        "Belum diisi",
        "Belum diisi",
        "Belum diisi",
        "Belum diisi",
        "Belum diisi",
        "Belum diisi",
        "Belum diisi",
        "Belum diisi",
        "Belum diisi",
        "Belum diisi",
    )
    private val img = intArrayOf(
        R.drawable.user1,
        R.drawable.user2,
        R.drawable.user3,
        R.drawable.user4,
        R.drawable.user5,
        R.drawable.user6,
        R.drawable.user7,
        R.drawable.user8,
        R.drawable.user9,
        R.drawable.user10,
    )

    val listData: ArrayList<WisataModel>
        get() {
            val list = arrayListOf<WisataModel>()
            for (position in nama.indices) {
                val wisata = WisataModel()
                wisata.nama = nama[position]
                wisata.location = location[position]
                wisata.detail = detail[position]
                wisata.img = img[position]

                list.add(wisata)
            }
            return list
        }
}