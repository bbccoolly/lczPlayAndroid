package com.lcz.pa.ui

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.fragment.app.viewModels
import com.lcz.pa.databinding.FragmentPlantListBinding
import com.lcz.pa.viewmodels.PlantListViewModel
import dagger.hilt.android.AndroidEntryPoint

/**
 *
 * desc: TODO
 *
 * create by lcz on 2021-07-02
 */
@AndroidEntryPoint
class PlantListFragment: Fragment() {

    private val viewModel:PlantListViewModel by viewModels()

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        val binding = FragmentPlantListBinding.inflate(inflater, container, false)
        context ?: return binding.root
        return binding.root
    }
}