package com.example.kotlinwebintent

import android.content.Intent
import android.net.Uri
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }
    fun clickBrowse(view: View){
        var url = urlText.text.toString()
        val intent = Intent()
        intent.setAction(Intent.ACTION_VIEW)
        url = "http://"+url
        intent.setData(Uri.parse(url))
        startActivity(intent)
    }

}
