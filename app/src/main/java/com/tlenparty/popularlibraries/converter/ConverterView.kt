package com.tlenparty.popularlibraries.converter

import android.net.Uri
import com.tlenparty.popularlibraries.helpers.screens.ScreenView
import moxy.viewstate.strategy.alias.AddToEndSingle

interface ConverterView : ScreenView {

    @AddToEndSingle
    fun showContent(uri: Uri?)

    @AddToEndSingle
    fun showLoading()
}