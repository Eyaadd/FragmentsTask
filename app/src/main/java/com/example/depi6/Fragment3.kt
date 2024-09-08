package com.example.depi6

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.example.depi6.databinding.Fragment3Binding
import com.example.depi6.databinding.FragmentBlankBinding


class Fragment3 : Fragment() {
    lateinit var binding: Fragment3Binding

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        binding = Fragment3Binding.inflate(layoutInflater,container,false)
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_3, container, false)
    }

}