package app.aplicacion.retoprogramacin_03.core

import android.app.Activity
import android.view.View
import android.widget.Toast
import androidx.fragment.app.Fragment

fun Activity.toasT(message:String){
    Toast.makeText(this,message,Toast.LENGTH_LONG).show()
}

fun Fragment.toas(message:String){
    Toast.makeText(requireContext(),message,Toast.LENGTH_LONG).show()
}