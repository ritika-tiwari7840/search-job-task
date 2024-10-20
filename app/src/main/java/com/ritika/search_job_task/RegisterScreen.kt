package com.ritika.search_job_task

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView


class RegisterScreen : Fragment() {


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        val view = inflater.inflate(R.layout.fragment_register_screen, container, false)


        view.findViewById<TextView>(R.id.register_create_account).setOnClickListener {
            // Call the function to navigate to LoginScreen
            val loginFragment = LoginScreen()

            // Use parentFragmentManager instead of supportFragmentManager
            val transaction = parentFragmentManager.beginTransaction()
            parentFragmentManager.popBackStack()  // This removes previous fragment from the stack
            transaction.replace(R.id.main_activity, loginFragment)
            transaction.addToBackStack(null)
            transaction.commit()
        }

        return view
    }



    companion object {

    }
}