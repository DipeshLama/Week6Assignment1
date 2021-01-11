package com.dipesh.softuserclone.model

import android.os.Parcel
import android.os.Parcelable

class student(
        val studentId:String?,
        val studentName:String?,
        val studentAge:Int?,
        val studentGender:String?,
        val studentAddress:String?,
        val imageLink:String?
):Parcelable {
    constructor(parcel: Parcel) : this(
            parcel.readString(),
            parcel.readString(),
            parcel.readValue(Int::class.java.classLoader) as? Int,
            parcel.readString(),
            parcel.readString(),
            parcel.readString()) {
    }

    override fun writeToParcel(parcel: Parcel, flags: Int) {
        parcel.writeString(studentId)
        parcel.writeString(studentName)
        parcel.writeValue(studentAge)
        parcel.writeString(studentGender)
        parcel.writeString(studentAddress)
        parcel.writeString(imageLink)
    }

    override fun describeContents(): Int {
        return 0
    }

    companion object CREATOR : Parcelable.Creator<student> {
        override fun createFromParcel(parcel: Parcel): student {
            return student(parcel)
        }

        override fun newArray(size: Int): Array<student?> {
            return arrayOfNulls(size)
        }
    }
}