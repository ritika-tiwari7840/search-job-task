package com.ritika.search_job_task

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import android.widget.TextView
import androidx.navigation.NavController
import androidx.navigation.NavOptions
import androidx.navigation.Navigation


class LoginScreen : Fragment() {
    private lateinit var navController: NavController

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
    }


    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        navController= Navigation.findNavController(view)
    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        val view= inflater.inflate(R.layout.fragment_login_screen, container, false)

        view.findViewById<TextView>(R.id.login_create_account).setOnClickListener {
            // Call the function to navigate to LoginScreen
            val regFragment = RegisterScreen()

            // Use parentFragmentManager instead of supportFragmentManager
            val transaction = parentFragmentManager.beginTransaction()
            parentFragmentManager.popBackStack()  // This removes previous fragment from the stack
            transaction.replace(R.id.main_activity, regFragment)
            transaction.addToBackStack(null)
            transaction.commit()
        }


        view.findViewById<TextView>(R.id.login_create_account).setOnClickListener {


            navController.navigate(R.id.action_loginScreen_to_registerScreen,

                null,
                NavOptions.Builder()
                    .setPopUpTo(R.id.welcomeScreen, false)
                    .build()
                )

        }

        return view
    }



    companion object {

    }
}