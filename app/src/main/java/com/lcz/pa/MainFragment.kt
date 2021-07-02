package com.lcz.pa

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.fragment.app.viewModels
import com.lcz.pa.databinding.FragmentMainBinding
import com.lcz.pa.viewmodels.GardenPlantingListViewModel
import dagger.hilt.android.AndroidEntryPoint

/**
 *
 * desc: TODO
 *
 * create by lcz on 2021-07-02
 */
@AndroidEntryPoint
class MainFragment : Fragment() {

    private lateinit var binding: FragmentMainBinding

    private val viewModel: GardenPlantingListViewModel by viewModels()

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        binding = FragmentMainBinding.inflate(inflater, container, false)
        return binding.root
    }
}