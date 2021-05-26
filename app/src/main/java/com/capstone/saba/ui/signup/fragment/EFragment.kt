package com.capstone.saba.ui.signup.fragment

import android.content.Intent
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageButton
import com.capstone.saba.R
import com.capstone.saba.ui.login.LoginActivity


class EFragment : Fragment(), View.OnClickListener {

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_e, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        val btnNext: ImageButton = view.findViewById(R.id.img_button_next)
        btnNext.setOnClickListener(this)
    }

    override fun onClick(v: View) {
        if (v.id == R.id.img_button_next){
            val intent = Intent(context, LoginActivity::class.java)
            startActivity(intent)
        }
    }
}