package com.tlenparty.popularlibraries.model.repositories

import com.tlenparty.popularlibraries.baselogic.ListPresenter
import com.tlenparty.popularlibraries.baselogic.user_repositories.RepositoryItemView
import com.tlenparty.popularlibraries.model.entites.GithubUserRepository

class RepositoryListPresenter: ListPresenter<RepositoryItemView> {
    val repositories = mutableListOf<GithubUserRepository>()

    override var itemClickListener: ((RepositoryItemView) -> Unit)? = null


    override fun bindView(view: RepositoryItemView) {
        val repository = repositories[view.currentPosition]
        view.setName(repository.fullName)
    }

    override fun getCount() = repositories.size
}