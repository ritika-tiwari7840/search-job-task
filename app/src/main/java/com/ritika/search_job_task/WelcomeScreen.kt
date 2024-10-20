package com.ritika.search_job_task

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import com.ritika.search_job_task.databinding.ActivityMainBinding

class WelcomeScreen : Fragment() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?,
    ): View? {
        // Inflate the layout for this fragment
        val view = inflater.inflate(R.layout.fragment_welcome_screen, container, false)

        view.findViewById<Button>(R.id.welcome_login).setOnClickListener {
            // Call the function to navigate to LoginScreen
            val loginFragment = LoginScreen()

            // Use parentFragmentManager instead of supportFragmentManager
            val transaction = parentFragmentManager.beginTransaction()
            parentFragmentManager.popBackStack()  // This removes previous fragment from the stack
            transaction.replace(R.id.main_activity, loginFragment)
            transaction.addToBackStack(null)
            transaction.commit()
        }
        view.findViewById<Button>(R.id.welcome_reg).setOnClickListener {
            // Call the function to navigate to LoginScreen
            val regFragment = RegisterScreen()

            // Use parentFragmentManager instead of supportFragmentManager
            val transaction = parentFragmentManager.beginTransaction()
            parentFragmentManager.popBackStack()  // This removes previous fragment from the stack
            transaction.replace(R.id.main_activity, regFragment)
            transaction.addToBackStack(null)
            transaction.commit()
        }

        return view
    }

    companion object {
        // Optional: You can add any static methods or arguments here if needed
    }
}
