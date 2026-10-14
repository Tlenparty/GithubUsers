package com.tlenparty.popularlibraries.helpers.screens

import androidx.fragment.app.Fragment
import androidx.fragment.app.FragmentFactory
import com.tlenparty.popularlibraries.converter.ConverterFragment
import com.github.terrakok.cicerone.androidx.FragmentScreen

class ImageCompressorScreen:FragmentScreen {

    override fun createFragment(factory: FragmentFactory): Fragment = ConverterFragment.newInstance()
}