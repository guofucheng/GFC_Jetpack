package com.gfc.jetpack.ui.login

import android.content.Context
import android.os.Bundle
import android.util.Log
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.navigation.Navigation
import com.gfc.jetpack.R
import com.gfc.jetpack.databinding.FragmentLoginBinding


class LoginFragment : Fragment() {

    private val TAG = "LoginFragment"
    fun print(str:String){
        Log.e(TAG,str)
    }
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        print("onCreate")
    }
    override fun onAttach(context: Context) {
        super.onAttach(context)
        print("onAttach")
    }
    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {

        print("onCreateView")
        val binding = FragmentLoginBinding.inflate(inflater)
        binding.btnTest.setOnClickListener {
            Navigation.findNavController(it).navigate(R.id.action_loginFragment_to_blankFragment)

        }
        return binding.root
    }
    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        print("onViewCreated")
    }
    override fun onActivityCreated(savedInstanceState: Bundle?) {
        super.onActivityCreated(savedInstanceState)
        print("onActivityCreated")
    }






    override fun onStart() {
        super.onStart()
        print("onStart")
    }

    override fun onResume() {
        super.onResume()
        print("onResume")
    }

    override fun onPause() {
        super.onPause()
        print("onPause")
    }

    override fun onStop() {
        super.onStop()
        print("onStop")
    }

    override fun onDestroy() {
        super.onDestroy()
        print("onDestroy")
    }

    override fun onDestroyView() {
        super.onDestroyView()
        print("onDestroyView")
    }


    override fun onDetach() {
        super.onDetach()
        print("onDetach")
    }


}