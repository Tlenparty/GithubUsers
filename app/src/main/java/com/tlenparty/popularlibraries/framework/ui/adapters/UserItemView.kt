package com.tlenparty.popularlibraries.framework.ui.adapters

import com.tlenparty.popularlibraries.model.entites.GithubUser

/**
 * Интерфейс для позиции списка
 */
interface UserItemView:IItemView {
    fun setLogin(text:String)

    fun setAvatar(user: GithubUser)
}