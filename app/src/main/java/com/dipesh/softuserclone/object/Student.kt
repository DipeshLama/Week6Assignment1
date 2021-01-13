package com.dipesh.softuserclone.`object`

import com.dipesh.softuserclone.model.student

object Student {
    var lstStudent= arrayListOf<student>()
    fun addStudent(){
        lstStudent= arrayListOf();
        lstStudent.add(student(
            studentName ="Dipesh Lama",studentAge = 20,studentGender = "Male",
                studentAddress ="Pepsicola",imageLink = "https://avatars0.githubusercontent.com/u/52686056?s=460&u=73ffdc30bec473c47aeb3ba9604e0f97e0a1fe5b&v=4"
        ))

        lstStudent.add(student(
                studentName ="Dipesh Lama",studentAge = 20,studentGender = "Male",
                studentAddress ="Pepsicola",imageLink = "https://avatars0.githubusercontent.com/u/52686056?s=460&u=73ffdc30bec473c47aeb3ba9604e0f97e0a1fe5b&v=4"
        ))
    }
}