package com.tlenparty.popularlibraries.helpers.screens

import androidx.fragment.app.FragmentFactory
import com.tlenparty.popularlibraries.baselogic.user.UserFragment
import com.github.terrakok.cicerone.androidx.FragmentScreen

class UserScreen(private val userLogin:String):FragmentScreen {
    override fun createFragment(factory: FragmentFactory) = UserFragment.newInstance(userLogin)

}
