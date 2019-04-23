package com.example.mvptest.utils

import android.annotation.SuppressLint
import androidx.annotation.NonNull
import androidx.core.util.Preconditions.checkNotNull
import androidx.fragment.app.Fragment
import androidx.fragment.app.FragmentManager
import androidx.fragment.app.FragmentTransaction

class ActivityUtils{

   @SuppressLint("RestrictedApi")
   public fun addFragmentToActivity(@NonNull fragmentManager: FragmentManager,
                                    @NonNull fragment: Fragment, frameId:Int) {
        checkNotNull(fragmentManager)
        checkNotNull(fragment)
        val transaction = fragmentManager.beginTransaction()
        transaction.add(frameId, fragment)
        transaction.commit()
    }
}