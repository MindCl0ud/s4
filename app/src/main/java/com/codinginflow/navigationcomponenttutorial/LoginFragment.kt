package com.codinginflow.navigationcomponenttutorial

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import androidx.fragment.app.Fragment
import androidx.fragment.app.FragmentContainer
import androidx.navigation.fragment.findNavController
import kotlinx.android.synthetic.main.fragment_home.*
import kotlinx.android.synthetic.main.fragment_login.*
import kotlinx.coroutines.selects.SelectInstance

class LoginFragment : Fragment() {
    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstance: Bundle?)
    : View?{
        val view = inflater.inflate(R.layout.fragment_login, container,false)
        val btnlgn : Button = view.findViewById(R.id.button_login)
        btnlgn.setOnClickListener{
            val editText : EditText = view.findViewById(R.id.edit_text_username)
            val input = editText.text.toString()
            val bundle = Bundle()
            bundle.putString("username", input)
            val fragment = HomeFragment()
            fragment.arguments = bundle
            fragmentManager?.beginTransaction()?.replace(R.id.nav_host_fragment, fragment)?.commit()
        }
        return view
    }
}