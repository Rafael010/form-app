package com.example.formapp.ui

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.example.formapp.databinding.FragmentMarketingBinding

class MarketingFragment : Fragment() {

    private lateinit var binding: FragmentMarketingBinding

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        binding = FragmentMarketingBinding.inflate(inflater)
        loadImages()
        return binding.root
    }

    private fun loadImages(){
        binding.RecyclerViewPhoto.layoutManager = LinearLayoutManager(
            context,
            RecyclerView.VERTICAL,
            false
        )
        val adGallery = AdapterGallery(context, getImages())
        binding.RecyclerViewPhoto.isFocusable = false
        binding.RecyclerViewPhoto.adapter = adGallery
    }

    private fun getImages(): ArrayList<String> {
        val arrayList = ArrayList<String>()
        arrayList.add("https://www.cruzvermelhamg.org.br/images/2022/09/16/canaldenunciaspng.png")
        arrayList.add("https://www.cruzvermelhamg.org.br/images/2022/09/16/canaldenunciaspng.png")
        arrayList.add("https://www.cruzvermelhamg.org.br/images/2022/09/16/canaldenunciaspng.png")
        arrayList.add("https://www.cruzvermelhamg.org.br/images/2022/09/16/canaldenunciaspng.png")
        arrayList.add("https://www.cruzvermelhamg.org.br/images/2022/09/16/canaldenunciaspng.png")
        arrayList.add("https://www.cruzvermelhamg.org.br/images/2022/09/16/canaldenunciaspng.png")
        arrayList.add("https://www.cruzvermelhamg.org.br/images/2022/09/16/canaldenunciaspng.png")
        arrayList.add("https://www.cruzvermelhamg.org.br/images/2022/09/16/canaldenunciaspng.png")
        return arrayList
    }
}