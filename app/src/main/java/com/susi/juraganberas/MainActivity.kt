package com.susi.juraganberas

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    var data: ArrayList<DataModel>? = null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        //Inisialisasi Array
        data = ArrayList()

        //Simpan data

        data?.add(DataModel(R.drawable.bmw,"Beras BMW","Rp 52.000/5kg","Salah satu pilihan beras BMW yang paling " +
                "orang-orang sukai adalah beras pandan wangi yang menyerbakkan bau pandan ketika telah matang. Beras ini memiliki bentuk yang " +
                "cenderung bulat dengan warna bening kekuningan serta tekstur nasi yang sedikit lengket dan cenderung pulen."))

        data?.add(DataModel(R.drawable.hotel,"Beras Hotel","Rp 112.000/5kg", "Beras Hotel merupakan beras " +
                "rendah gula yang aman dikonsumsi oleh penderita diabetes. Selain itu, beras ini juga cocok untuk diet sehat " +
                "Walaupun rendah gula, kualitas beras ini terjamin, rasanya tetap enak dan tentunya pulen."))

        data?.add(DataModel(R.drawable.idola,"Beras Idola","Rp 70.000/5kg", "Beras Idola memang belum seterkenal " +
                "merk beras yang lain, tetapi kualitas beras ini tidak perlu diragukan. Rasa dari beras ini enak dan tidak kalah pulen " +
                "dengan beras lain. Karenanya, beras ini kadang menjadi best seller di kota-kota tertentu."))

        data?.add(DataModel(R.drawable.maknyuss,"Beras Maknyuss","Rp 60.000/5kg", "Produk yang satu ini mengutamakan " +
                "kualitas beras yang dapat menghasilkan nasi yang pulen serta enak. Selain itu, Beras Maknyus juga berkomitmen dalam " +
                "membuat beras tanpa pemutih, pengawet, dan pewarna."))

        data?.add(DataModel(R.drawable.sania,"Beras Sania","Rp 60.000/5kg", "Beras Sania mengaplikasikan teknologi " +
                "Hok Lo Jepang, yakni metode paddy to rice. Dengan kata lain, beras ini hanya diolah jika seseorang mengirimkan pesanan, " +
                "sehingga beras yang diterima akan datang dalam keadaan masih segar."))

        data?.add(DataModel(R.drawable.rojolele,"Beras Rojolele","Rp 50.000/5kg", "Sudah lama dikenal oleh masyarakat " +
                "Indonesia, Rojolele memproduksi beras dengan aroma pandan yang wangi. Teksturnya yang pulen dengan bentuk sedikit lonjong, " +
                "kamu bisa memilih beras dalam kemasan 5 atau 10 kg."))

        data?.add(DataModel(R.drawable.sipulen,"Beras Si Pulen","Rp 70.000/5kg", "Ini adalah beras yang sangat " +
                "mudah ditemukan di supermarket ataupun agen beras manapun. Harga dan kualitas sudah tentu seimbang. Beras Si Pulen " +
                "ada 3 varian, Long Grain Crystal, Pandan Wangi, dan Mutiara Medium Grain."))


        data?.add(DataModel(R.drawable.sumo,"Beras Sumo","Rp 65.000/5kg", "Sebagai merk yang menawarkan beras " +
                "berkualitas premium, Beras Sumo menawarkan dua jenis varian beras, yaitu merah dan kuning. Varian merah menghasilkan " +
                "nasi bertekstur lembut yang mudah dikonsumsi menggunakan sumpit, sedangkan varian kuning memiliki tekstur yang sedikit lembut dengan patahan 15%."))

        //Set data to Adapter
        recyclerview.adapter = DataAdapter(data, object : DataAdapter.OnClickListener{
            override fun detail(item: DataModel?) {
                val intent = Intent(this@MainActivity, DetailActivity::class.java)
                intent.putExtra("gambar", item?.gambar)
                intent.putExtra("nama", item?.nama)
                intent.putExtra("harga", item?.harga)
                intent.putExtra("keterangan", item?.keterangan)
                startActivity(intent)
            }

        })


    }
    }