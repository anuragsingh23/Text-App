package com.example.textapp.ui.fragment

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.navigation.fragment.findNavController
import com.example.textapp.R
import com.example.textapp.databinding.FragmentSigninBinding

class SigninFragment: Fragment(R.layout.fragment_signin) {

    private var binding : FragmentSigninBinding? = null

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        binding = FragmentSigninBinding.inflate(layoutInflater,container,false)

        binding?.btn?.setOnClickListener {
            findNavController().navigate(R.id.action_signinFragment_to_confirmationFragment)
        }
        return binding?.root


    }
}