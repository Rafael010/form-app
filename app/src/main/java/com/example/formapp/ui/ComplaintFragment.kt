package com.example.formapp.ui

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import com.example.formapp.databinding.FragmentComplaintBinding
import com.seedlotfi.towerinfodialog.TowerDialog

class ComplaintFragment : Fragment() {

    private lateinit var binding: FragmentComplaintBinding

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        binding = FragmentComplaintBinding.inflate(inflater)
        back()
        return binding.root
    }

    private fun back(){
        binding.Cancel.setOnClickListener {
            requireActivity().onBackPressedDispatcher.onBackPressed()
        }

        binding.Send.setOnClickListener {
            loadDialog()
        }
    }

    private fun loadDialog(){
        val dialog = context?.let {
            TowerDialog.Companion.Builder()
                // set context required
                .setContext(it)
                .setTitle("Obrigado")
                .setIsSuccess(true)
                .setMessage(" Sua denúncia foi enviada com sucesso ")
                // set title bold default is false
                .setTileIsBold(true)
                .setButtonText("Fechar")
                .build()
        }

        dialog?.show {
            requireActivity().onBackPressedDispatcher.onBackPressed()
        }
    }
}