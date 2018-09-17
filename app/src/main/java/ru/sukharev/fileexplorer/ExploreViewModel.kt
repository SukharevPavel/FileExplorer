package ru.sukharev.fileexplorer

import android.arch.lifecycle.ViewModel
import android.databinding.ObservableField

class ExploreViewModel : ViewModel() {

    val currentDir : ObservableField<String> = ObservableField()



}