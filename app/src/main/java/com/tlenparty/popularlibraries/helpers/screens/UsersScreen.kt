package com.tlenparty.popularlibraries.helpers.screens

import androidx.fragment.app.Fragment
import androidx.fragment.app.FragmentFactory
import com.tlenparty.popularlibraries.baselogic.users.UsersFragment
import com.github.terrakok.cicerone.androidx.FragmentScreen

class UsersScreen:FragmentScreen {
    override fun createFragment(factory: FragmentFactory): Fragment {
        return UsersFragment.newInstance()
    }
}