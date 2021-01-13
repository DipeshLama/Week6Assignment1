package com.dipesh.softuserclone.fragments

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import android.widget.EditText
import com.dipesh.softuserclone.Communicator
import com.dipesh.softuserclone.R

class AddStudentFragment : Fragment() {
    private lateinit var communicator: Communicator
    private lateinit var etFullName:EditText
    private lateinit var btnSend:Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {

        val view= inflater.inflate(R.layout.fragment_add_student, container, false)
//        communicator=activity as Communicator
        etFullName=view.findViewById(R.id.etFullName)
        btnSend=view.findViewById(R.id.btnSave)

        btnSend.setOnClickListener {

        }
        return view
    }
}