package com.example.landmarkbookkotlin

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import com.example.landmarkbookkotlin.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    private lateinit var binding : ActivityMainBinding
    private lateinit var landmarkList : ArrayList<LandMark>

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        binding = ActivityMainBinding.inflate(layoutInflater)
        val view = binding.root
        setContentView(view)

        landmarkList = ArrayList()

        //data

        val pisa = LandMark("Pisa", "Italy", R.drawable.pisa)
        val colosseum = LandMark("Colosseum", "Italy", R.drawable.colosseum)
        val eiffel = LandMark("Eiffel", "France", R.drawable.eiffel)
        val londonBridge = LandMark("London Bridge", "United Kingdom", R.drawable.londonbridge)

        landmarkList.add(pisa)
        landmarkList.add(colosseum)
        landmarkList.add(eiffel)
        landmarkList.add(londonBridge)

        binding.recyclerview.layoutManager = LinearLayoutManager(this)
        val  landmarkAdapter = LandmarkAdapter(landmarkList)
        binding.recyclerview.adapter = landmarkAdapter


    }
}