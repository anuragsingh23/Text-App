package com.example.textapp.ui.fragment

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.lifecycle.ViewModel
import androidx.lifecycle.ViewModelProvider
import com.example.textapp.R
import com.example.textapp.databinding.FragmentChatBinding
import com.example.textapp.ui.viewModel.MainViewModel

class ChatFragment : Fragment(R.layout.fragment_chat) {


    private var _binding: FragmentChatBinding? = null

    private val binding get() = _binding!!



    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)


    }

    override fun onDestroyView() {
        super.onDestroyView()
        _binding = null
    }
}
