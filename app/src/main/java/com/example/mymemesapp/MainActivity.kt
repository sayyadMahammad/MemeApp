package com.example.mymemesapp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.compose.runtime.Composable
import androidx.lifecycle.ViewModel
import com.example.mymemesapp.data.Meme
import com.example.mymemesapp.ui.MainViewModel
import com.example.mymemesapp.ui.RV
import dagger.hilt.EntryPoint
import dagger.hilt.android.HiltAndroidApp

@EntryPoint
class MainActivity : AppCompatActivity() {
    lateinit var viewModel: MainViewModel
    lateinit var mList : List<Meme> // by lazy { ::fn }
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
       // RV(list = )

       // RV(list = mList )
    }

//    private fun fn(ls : MutableList<Meme>) {
//        mList =ls
//    }

    private fun observeViewModel(viewModel: MainViewModel){

        viewModel.memesList.observe(this){
           //fn(it)
            mList = it
        }

    }
}