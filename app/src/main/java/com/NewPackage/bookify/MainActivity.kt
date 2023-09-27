package com.NewPackage.bookify

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.devatrii.bookify.R
import com.devatrii.bookify.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    lateinit var binding: ActivityMainBinding
    val activity = this
    val list: ArrayList<BooksModel> = ArrayList()
    val adapter = BooksAdapter(list, activity)
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.apply {
            mRecyclerViewHome.adapter = adapter
            list.add(BooksModel(R.drawable.b,"Boys",getString(R.string.description_1),"bl.pdf"))
            list.add(BooksModel(R.drawable.alita,"Battle Angel-Alita",getString(R.string.description_2),"alita.pdf"))
            list.add(BooksModel(R.drawable.love,"A condition called-Love",getString(R.string.description_3),"alita.pdf"))
            list.add(BooksModel(R.drawable.cent,"How To Be Fine",getString(R.string.description_4),"sample_book.pdf"))
            list.add(BooksModel(R.drawable.gojo,"Out of the Box",getString(R.string.description_5),"sample_book.pdf"))
            list.add(BooksModel(R.drawable.hero,"Stripped",getString(R.string.description_6),"sample_book.pdf"))
            list.add(BooksModel(R.drawable.note,"12 Rules for Life",getString(R.string.description_7),"sample_book.pdf"))
            list.add(BooksModel(R.drawable.titan,"Readistan",getString(R.string.description_8),"sample_book.pdf"))
            list.add(BooksModel(R.drawable.vaga,"Reclaim Your Heart",getString(R.string.description_9),"sample_book.pdf"))
            list.add(BooksModel(R.drawable.one,"Lost Islamic History",getString(R.string.description_10),"sample_book.pdf"))
        }

    }
}