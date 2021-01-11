package com.dipesh.softuserclone

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.EditText

class LoginActivity : AppCompatActivity(),View.OnClickListener {
    private lateinit var etUsername:EditText
    private lateinit var etPassword:EditText
    private lateinit var btnLogin:Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_login)
        etUsername=findViewById(R.id.etUserName)
        etPassword=findViewById(R.id.etPassword)
        btnLogin=findViewById(R.id.btnLogin)
    }

    private fun isValid():Boolean{
        when{
            etUsername.text.isEmpty()==true->{
                etUsername.error="Field must not be empty"
                return false
            }

            etPassword.text.isEmpty()==true->{
                etPassword.error="Field must not be empty"
                return false
            }
        }
        return true
    }

    override fun onClick(v: View?) {
        when(v?.id){
            R.id.btnLogin->{

            }
        }
    }
}