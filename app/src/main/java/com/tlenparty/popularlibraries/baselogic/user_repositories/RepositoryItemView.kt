package com.tlenparty.popularlibraries.baselogic.user_repositories

interface RepositoryItemView {

    var currentPosition: Int

    fun setName(text: String)

}