package com.dipesh.softuserclone.adapter

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.bumptech.glide.Glide
import com.dipesh.softuserclone.R
import com.dipesh.softuserclone.model.student

class StudentAdapter(
        val lstStudents:ArrayList<student>,
        val context:Context
):RecyclerView.Adapter<StudentAdapter.StudentViewHolder>() {
    class StudentViewHolder(view:View)
        :RecyclerView.ViewHolder(view){
            val tvName:TextView
            val tvAge:TextView
            val tvAddress:TextView
            val tvGender:TextView
            val imgProfile:ImageView

            init {
                tvName=view.findViewById(R.id.tvName)
                tvAge=view.findViewById(R.id.tvAge)
                tvAddress=view.findViewById(R.id.tvAddress)
                tvGender=view.findViewById(R.id.tvGender)
                imgProfile=view.findViewById(R.id.imgView)
            }
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): StudentViewHolder {
        val view=LayoutInflater.from(parent.context)
                .inflate(R.layout.my_layout,parent,false)
        return StudentViewHolder(view)
    }

    override fun onBindViewHolder(holder: StudentViewHolder, position: Int) {
        val student=lstStudents[position]
        holder.tvName.text=student.studentName
        holder.tvAge.text=student.studentAge.toString()
        holder.tvAddress.text=student.studentAddress
        holder.tvGender.text=student.studentGender

        Glide.with(context).load(student.imageLink)
                .into(holder.imgProfile)
    }

    override fun getItemCount(): Int {
        return lstStudents.size
    }
}