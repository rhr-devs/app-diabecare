package com.example.android.diabecare.ui

import android.annotation.SuppressLint
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import android.widget.TextView
import androidx.lifecycle.Observer
import androidx.lifecycle.ViewModelProvider
import com.example.android.diabecare.R
import com.example.android.diabecare.repository.Repository
import com.example.android.diabecare.viewModelFactory.HomeViewModelFactory
import com.example.android.diabecare.viewModels.HomeViewModel
import com.google.android.material.textfield.TextInputEditText

class checkDiabetes : Fragment() {
    private lateinit var viewModel: HomeViewModel
    private lateinit var pregInput: TextInputEditText
    private lateinit var gluInput: TextInputEditText
    private lateinit var insInput: TextInputEditText
    private lateinit var bpInput: TextInputEditText
    private lateinit var sktInput: TextInputEditText
    private lateinit var bmiInput: TextInputEditText
    private lateinit var dpfInput: TextInputEditText
    private lateinit var ageInput: TextInputEditText
    private lateinit var result : TextView


    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?,
    ): View? {
        val view = inflater.inflate(R.layout.fragment_check_diabetes, container, false)

        pregInput = view.findViewById(R.id.preg)
        gluInput = view.findViewById(R.id.glu)
        insInput = view.findViewById(R.id.ins)
        bpInput = view.findViewById(R.id.bp)
        sktInput = view.findViewById(R.id.skt)
        bmiInput = view.findViewById(R.id.bmi)
        dpfInput = view.findViewById(R.id.dpf)
        ageInput = view.findViewById(R.id.age)
        result = view.findViewById(R.id.result)

        return view
    }



    @SuppressLint("CutPasteId")
    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        val preg = pregInput.text
        val glu= gluInput.text
        val ins= insInput.text
        val bp= bpInput.text
        val skt= sktInput.text
        val bmi= bmiInput.text
        val dpf= dpfInput.text
        val age= ageInput.text

        val repository = Repository()
        val viewModelFactory = HomeViewModelFactory(repository)
        viewModel = ViewModelProvider(this,viewModelFactory).get(HomeViewModel::class.java)
        view.findViewById<Button>(R.id.predictBtn).setOnClickListener {
            viewModel.getPrediction(preg.toString().toInt(),
                glu.toString().toInt(),
                ins.toString().toInt(),
                bp.toString().toInt(),
                skt.toString().toInt(),
                bmi.toString().toInt(),
                dpf.toString().toInt(),
                age.toString().toInt())
            viewModel.getResult().observe(viewLifecycleOwner, Observer {response->
                result.text = response
            })
        }

    }

}