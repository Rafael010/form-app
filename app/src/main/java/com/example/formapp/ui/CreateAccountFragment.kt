package com.example.formapp.ui

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.navigation.findNavController
import com.example.formapp.databinding.FragmentCreateAccountBinding

class CreateAccountFragment : Fragment() {

    private lateinit var binding: FragmentCreateAccountBinding

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        binding = FragmentCreateAccountBinding.inflate(inflater)
        toComplaint()
        return binding.root
    }

    private fun toComplaint() {
        binding.CreateAccount.setOnClickListener {
            binding.root.findNavController().navigate(CreateAccountFragmentDirections.actionToLoginFromCreateAccount())
        }
    }

}