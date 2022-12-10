package com.example.mymemesapp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.lifecycle.ViewModelProvider
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.example.mymemesapp.data.Meme
import com.example.mymemesapp.ui.MainViewModel
import com.example.mymemesapp.ui.MemesAdapter
import dagger.hilt.android.AndroidEntryPoint

@AndroidEntryPoint
class MainActivity : AppCompatActivity() {
    //lateinit var viewModel: MainViewModel
   // lateinit var memesAdapter: MemesAdapter

    lateinit var mList : List<Meme> // by lazy { ::fn }
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
       val  viewModel=ViewModelProvider(this).get(MainViewModel::class.java)
      //  observeViewModel(viewModel)
        var recyclerView = findViewById<RecyclerView>(R.id.recyclerView)
        recyclerView.layoutManager=LinearLayoutManager(this)

      val    memesAdapter by lazy { MemesAdapter(::fn) }
        recyclerView.adapter=memesAdapter
        viewModel.memesList.observe(this){
            memesAdapter.getList(it)
        }

    }
    fun fn(){

    }


//    private fun observeViewModel(viewModel: MainViewModel){
//
//        viewModel.memesList.observe(this){
//          memesAdapter.getList(it)
//        }
//
//    }
}