package ru.sukharev.fileexplorer

import android.arch.lifecycle.ViewModelProviders
import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import android.support.v7.widget.RecyclerView

class ExploreActivity : AppCompatActivity() {

    private lateinit var viewModel: ExploreViewModel
    private val recyclerView = lazy {findViewById<RecyclerView>(R.id.explore_recycler_view)}

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_explore)
        viewModel = ViewModelProviders.of(this).get(ExploreViewModel::class.java)
    }
}
