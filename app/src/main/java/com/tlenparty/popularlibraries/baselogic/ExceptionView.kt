package com.tlenparty.popularlibraries.baselogic

import moxy.viewstate.strategy.alias.SingleState

@SingleState
interface ExceptionView {
    fun showException(throwable: Throwable)
}