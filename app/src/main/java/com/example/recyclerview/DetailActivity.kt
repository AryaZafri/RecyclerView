package com.example.recyclerview

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ImageView
import android.widget.TextView

class DetailActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_detail)

        supportActionBar?.setDisplayHomeAsUpEnabled(true)

        val aryaZafri = intent.getParcelableExtra<AryaZafri>(MainActivity.INTENT_PARCELABLE)

        val imgAryaZafri = findViewById<ImageView>(R.id.img_item_photo)
        val nameAryaZafri = findViewById<TextView>(R.id.tv_item_name)
        val descAryaZafri = findViewById<TextView>(R.id.tv_item_description)

        imgAryaZafri.setImageResource(aryaZafri?.imgAryaZafri!!)
        nameAryaZafri.text = aryaZafri.nameAryaZafri
        descAryaZafri.text = aryaZafri.descAryaZafri
    }

    override fun onSupportNavigateUp(): Boolean {
        onBackPressed()
        return true
    }
}