package uz.gita.maxwaydemo.mobdev.utils

import android.widget.Toast
import androidx.fragment.app.Fragment

fun Fragment.showToast(message: String, time: Int = Toast.LENGTH_SHORT) {
    Toast.makeText(requireContext(), message, time).show()
}

fun Long.getPrice(): String {
    var full = this.toString()
    var answer = ""
    var n = full.length
    while (n > 3) {
        n -= 3
        answer = " " + full.substring(full.length - 3, full.length) + answer
        full = full.removeRange(full.length - 3, full.length)
    }
    answer = full + answer
    return "$answer sum"
}