package com.anmp.adv160420081week2

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.Navigation
import kotlinx.android.synthetic.main.fragment_main.*

class MainFragment : Fragment() {
    var skor=0
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_main, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        var angka1=(0..100).shuffled().first()
        var angka2=(0..100).shuffled().first()
        txtAngka1.text=angka1.toString()
        txtAngka2.text=angka2.toString()
        btnSubmit.setOnClickListener {
            var jawaban=txtAnswer.text.toString().toInt()
            var temp1=txtAngka1.text.toString().toInt()
            var temp2=txtAngka2.text.toString().toInt()
            if (temp1+temp2==jawaban){
                skor++
                txtAngka1.text=((0..100).shuffled().first()).toString()
                txtAngka2.text=((0..100).shuffled().first()).toString()
            }
            else{
                val action=MainFragmentDirections.actionResultFragment(skor)
                Navigation.findNavController(it).navigate(action)

            }

        }
    }

}