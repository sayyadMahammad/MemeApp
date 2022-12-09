package com.example.mymemesapp.ui

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.example.mymemesapp.data.Meme
import com.example.mymemesapp.dataLayer.UseCase
import dagger.hilt.android.lifecycle.HiltViewModel
import kotlinx.coroutines.launch
import javax.inject.Inject

@HiltViewModel
class MainViewModel @Inject constructor(val useCase: UseCase):ViewModel(){

    private var _memesList = MutableLiveData<List<Meme>>()
    val memesList : LiveData<List<Meme>>
    get() = _memesList


    fun fetchMemes(){
        viewModelScope.launch {
           val result= useCase.getMemes()
            if(result.success ){
                _memesList.postValue(result.data.memes)
            }

        }
    }








}