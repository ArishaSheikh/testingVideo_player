package com.example.videoeditor

import android.net.Uri
import android.net.Uri.parse
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.MediaController
import android.widget.Toast
import android.widget.VideoView

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

//        val submit_btn = findViewById<Button>(R.id.submit_Button)
//
//       submit_btn.setOnClickListener{
//           Toast.makeText(applicationContext, "You clicked a button", Toast.LENGTH_LONG).show()
//
//       }
        //it control pause play
        val videoPlayer = findViewById<VideoView>(R.id.video_play)
        val mediaController = MediaController(this)
        mediaController.setAnchorView(videoPlayer)
        //specify the location of media player
        //uri stands for universal resource identifier
        val uri : Uri = parse(
            "android.resource://" + packageName +"/raw/my_video"
        )
          //setting media controller and URL and starting the video view
         videoPlayer.setMediaController(mediaController)
         videoPlayer.setVideoURI(uri)
         videoPlayer.requestFocus()
         videoPlayer .start()





    }
}