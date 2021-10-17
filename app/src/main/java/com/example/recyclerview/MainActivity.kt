package com.example.recyclerview

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView

class MainActivity : AppCompatActivity() {

    companion  object{
        val INTENT_PARCELABLE = "OBJECT_INTENT"
    }
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val aryazafriList = listOf<AryaZafri>(
            AryaZafri(
                R.drawable.arya1,
                "Arya Zafri",
                "He is a smart man and loves to help people"
            ),
            AryaZafri(
                R.drawable.arya2,
                "Arya Zafri",
                "He is a man who can make that friend comfortable and happy"
            ),
            AryaZafri(
                R.drawable.arya3,
                "Arya Zafri",
                "He is a man who likes to smile and laugh happily"
            ),
            AryaZafri(
                R.drawable.awa1,
                "Naswa Bila Zakia Fr",
                "She is a cheerful, friendly, and likes to try new things around her"
            ),
            AryaZafri(
                R.drawable.awa2,
                "Naswa Bila Zakia Fr",
                "She is a strong and independent woman"
            ),
            AryaZafri(
                R.drawable.awa3,
                "Naswa Bila Zakia Fr",
                "She is a girl who likes to feed cats and loves to take care of cats"
            )
        )

        val recyclerView = findViewById<RecyclerView>(R.id.rv_arya)
        recyclerView.layoutManager = LinearLayoutManager(this)
        recyclerView.setHasFixedSize(true)
        recyclerView.adapter = AryazafriAdapter(this, aryazafriList){
            val intent = Intent (this, DetailActivity::class.java)
            intent.putExtra(INTENT_PARCELABLE, it)
            startActivity(intent)

        }
    }
}