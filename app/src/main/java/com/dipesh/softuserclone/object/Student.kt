package com.dipesh.softuserclone.`object`

import com.dipesh.softuserclone.model.student

object Student {
    var lstStudent= arrayListOf<student>()
    fun addStudent(){
        lstStudent= arrayListOf();

        lstStudent.add(student(
                studentName ="Dipesh Lama",studentAge = "23",studentGender = "Male",
                studentAddress ="Pepsicola", imageLink = "https://avatars0.githubusercontent.com/u/52686056?s=460&u=73ffdc30bec473c47aeb3ba9604e0f97e0a1fe5b&v=4"
        ))

        lstStudent.add(student(
                studentName ="Anjelina Jolie",studentAge = "52",studentGender = "Female",
                studentAddress ="Los Angeles", imageLink = "https://pbs.twimg.com/profile_images/1325119155377418242/Tz2VwEvI_400x400.jpg"
        ))

        lstStudent.add(student(
            studentName ="Leonardo DiCaprio",studentAge = "55",studentGender = "Male",
            studentAddress ="California", imageLink = "https://in.bmscdn.com/iedb/artist/images/website/poster/large/leonardo-dicaprio-1273-06-05-2020-06-55-21.jpg?1"
        ))
    }
}