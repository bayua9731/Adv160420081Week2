package com.anmp.adv160420081week2

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.Navigation
import kotlinx.android.synthetic.main.fragment_game.*
import kotlinx.android.synthetic.main.fragment_result.*


class ResultFragment : Fragment() {
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_result, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        if(arguments!=null){
            val skor=ResultFragmentArgs.fromBundle(requireArguments()).skor
            txtScore.text="Your Score is "+skor.toString()
        }

        btnBackMain.setOnClickListener {
            val action= ResultFragmentDirections.actionMainScreen()
            Navigation.findNavController(it).navigate(action)
        }
    }





}