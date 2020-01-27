package com.smile.presentation

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.lifecycle.ViewModelProviders
import com.smile.presentation.base.BaseFragment

/**
 * A placeholder fragment containing a simple view.
 */
const val MAIN_FRAGMENT_TAG = "MAIN_FRAGMENT_TAG"

class MainActivityFragment : BaseFragment() {

    private lateinit var viewModel: MainViewModel

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        return null
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        viewModel = ViewModelProviders.of(
            this,
            viewModelFactory.get()
        ).get(MainViewModel::class.java)
    }

}
