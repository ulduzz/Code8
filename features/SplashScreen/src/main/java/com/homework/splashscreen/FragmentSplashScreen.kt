package com.homework.splashscreen

import android.os.Bundle
import android.os.Handler
import android.os.Looper
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.fragment.findNavController


class FragmentSplashScreen : Fragment() {


    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
       val view =inflater.inflate(R.layout.fragment_splash_screen, container, false)

      Handler(Looper.myLooper()!!).postDelayed({

                                               findNavController().navigate(R.id.action_fragmentSplashScreen_to_fragmentHomeFragment)

      } ,5000)

        return view
    }


}