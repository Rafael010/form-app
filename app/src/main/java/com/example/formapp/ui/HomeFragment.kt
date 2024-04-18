package com.example.formapp.ui

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.navigation.findNavController
import com.example.formapp.databinding.FragmentHomeBinding

class HomeFragment : Fragment() {

    private lateinit var binding: FragmentHomeBinding

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        binding = FragmentHomeBinding.inflate(inflater)
        toLogin()
        toCreateAccount()
        return binding.root
    }

    private fun toCreateAccount() {
        binding.CreateAccount.setOnClickListener {
            binding.root.findNavController().navigate(HomeFragmentDirections.actionToCreateAccount())
        }
    }

    private fun toLogin(){
        binding.SignIn.setOnClickListener {
            binding.root.findNavController().navigate(HomeFragmentDirections.actionToLogin())
        }
    }
}