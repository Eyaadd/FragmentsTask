package com.example.depi6

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.example.depi6.databinding.Fragment2Binding

class Fragment2 : Fragment() {

    lateinit var binding : Fragment2Binding
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        binding = Fragment2Binding.inflate(layoutInflater,container,false)
        // Inflate the layout for this fragment
        return binding.root
    }
}