package com.dipesh.softuserclone.fragments

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.annotation.Nullable
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.dipesh.softuserclone.R
import com.dipesh.softuserclone.adapter.StudentAdapter
import com.dipesh.softuserclone.model.student

class HomeFragment : Fragment() {
    private var lstStudent=ArrayList<student>()
    private lateinit var recyclerView:RecyclerView

    override fun onCreate(  savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
    }


    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment

        val view= inflater.inflate(R.layout.fragment_home, container, false)
       // testData()
        recyclerView=view.findViewById(R.id.recyclerView)
        recyclerView.setHasFixedSize(true)
        val adapter=StudentAdapter(lstStudent, requireContext())
        recyclerView.layoutManager=LinearLayoutManager(requireContext())
        recyclerView.adapter=adapter
        return view
    }

//    private fun testData(){
//        lstStudent.add(student("1","Dipesh Lama",23,"Male","Pepsicola","https://avatars0.githubusercontent.com/u/52686056?s=460&u=73ffdc30bec473c47aeb3ba9604e0f97e0a1fe5b&v=4"))
//    }
}