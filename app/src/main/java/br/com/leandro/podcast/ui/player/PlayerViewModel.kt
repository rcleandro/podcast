package br.com.leandro.podcast.ui.player

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel

class PlayerViewModel : ViewModel() {

    private val _text = MutableLiveData<String>().apply {
        value = "This is player Fragment"
    }
    val text: LiveData<String> = _text
}