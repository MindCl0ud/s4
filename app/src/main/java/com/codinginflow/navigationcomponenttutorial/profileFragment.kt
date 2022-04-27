package com.codinginflow.navigationcomponenttutorial

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import android.widget.EditText
import android.widget.ImageView
import android.widget.TextView
import androidx.fragment.app.Fragment
import androidx.navigation.fragment.findNavController
import kotlinx.android.synthetic.main.fragment_profile.*

class profileFragment : Fragment() {
    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstance: Bundle?)
            : View?{
        val view = inflater.inflate(R.layout.fragment_profile, container,false)
        val usernameprofileview : TextView = view.findViewById(R.id.usernameprofile)
        val args = this.arguments
        val inputData = args?.get("username")
        usernameprofileview.text = inputData.toString()
        val nameprofileview : TextView = view.findViewById(R.id.nameview)
        val args1 = this.arguments
        val inputData1 = args1?.get("name")
        nameprofileview.text = inputData1.toString()
        val emailprofileview : TextView = view.findViewById(R.id.emailview)
        val args2 = this.arguments
        val inputData2 = args2?.get("email")
        emailprofileview.text = inputData2.toString()
        val phoneprofileview : TextView = view.findViewById(R.id.phoneview)
        val args3 = this.arguments
        val inputData3 = args3?.get("phone")
        phoneprofileview.text = inputData3.toString()
        val backbtn : ImageView = view.findViewById(R.id.imageView3)
        backbtn.setOnClickListener{
            val bundle = Bundle()
            val fragment = HomeFragment()
            val pass = usernameprofileview.text.toString()
            bundle.putString("username", pass)
            fragment.arguments = bundle
            fragmentManager?.beginTransaction()?.replace(R.id.nav_host_fragment, fragment)?.commit()
        }
        return view
    }


}