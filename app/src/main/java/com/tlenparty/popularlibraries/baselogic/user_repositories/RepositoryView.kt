package com.tlenparty.popularlibraries.baselogic.user_repositories

import com.tlenparty.popularlibraries.baselogic.ExceptionView
import moxy.MvpView
import moxy.viewstate.strategy.alias.SingleState

@SingleState
interface RepositoryView: MvpView,ExceptionView {

    fun showInfo(text: String)
}