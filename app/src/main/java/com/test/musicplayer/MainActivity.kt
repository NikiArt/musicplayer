package com.test.musicplayer

import android.net.Uri
import android.os.Bundle
import android.support.v7.app.AppCompatActivity

class MainActivity : AppCompatActivity(), PlayerFragment.OnFragmentInteractionListener {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        var fragmentTransaction = supportFragmentManager.beginTransaction()
        fragmentTransaction.add(R.id.activity_main_fragment, PlayerFragment())
        fragmentTransaction.commit()
    }

    override fun onFragmentInteraction(uri: Uri) {

    }
}
