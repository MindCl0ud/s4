package com.codinginflow.navigationcomponenttutorial

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import androidx.fragment.app.Fragment
import androidx.navigation.fragment.findNavController
import kotlinx.android.synthetic.main.fragment_home.*

class HomeFragment : Fragment() {

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstance: Bundle?)
            : View?{
        val view = inflater.inflate(R.layout.fragment_home, container,false)
        val usernameview : TextView = view.findViewById(R.id.Username)
        val args = this.arguments
        val inputData = args?.get("username")
        usernameview.text = inputData.toString()
        val savebtn : Button = view.findViewById(R.id.button_save)
        savebtn.setOnClickListener{
            val name : EditText = view.findViewById(R.id.editTextTextPersonName)
            val email : EditText = view.findViewById(R.id.editTextTextEmailAddress)
            val phone : EditText = view.findViewById(R.id.editTextPhone)
            val pass = usernameview.text.toString()
            val pass1 = name.text.toString()
            val pass2 = email.text.toString()
            val pass3 = phone.text.toString()
            val bundle = Bundle()
            val fragment = profileFragment()
            bundle.putString("username", pass)
            bundle.putString("name", pass1)
            bundle.putString("email", pass2)
            bundle.putString("phone", pass3)
            fragment.arguments = bundle
            fragmentManager?.beginTransaction()?.replace(R.id.nav_host_fragment, fragment)?.commit()
        }
        return view
    }

}