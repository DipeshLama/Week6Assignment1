package com.dipesh.softuserclone.fragments

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.webkit.WebView
import android.webkit.WebViewClient
import com.dipesh.softuserclone.R

class AboutFragment : Fragment() {
    private  lateinit var webViewAbout:WebView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        val view = inflater.inflate(R.layout.fragment_about, container, false)
        webViewAbout=view.findViewById(R.id.webViewAbout)
        webViewAbout.settings.javaScriptEnabled=true
        val webViewClient=WebViewClient()
        webViewAbout.webViewClient=webViewClient
        webViewAbout.loadUrl("https://softwarica.edu.np")
        return view
    }


}