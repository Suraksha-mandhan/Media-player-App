package com.example.mediaplayer

import android.media.MediaPlayer
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_main.*

 class MainActivity : AppCompatActivity() {

     lateinit var mp:MediaPlayer
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        mp= MediaPlayer.create(this,R.raw.demo)
        play_btn.setOnClickListener{
            mp.start()
        }
        pause_btn.setOnClickListener{
            mp.pause()
        }
        stop_btn.setOnClickListener{
            mp.stop()
            mp=MediaPlayer.create(this,R.raw.demo)
        }
    }

     override fun onStop() {
         super.onStop()
         mp.release()
     }
}
