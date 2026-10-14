package com.tlenparty.popularlibraries.di.modules

import com.tlenparty.popularlibraries.baselogic.main.MainActivity
import com.tlenparty.popularlibraries.baselogic.user.UserFragment
import com.tlenparty.popularlibraries.baselogic.user_repositories.RepositoryFragment
import com.tlenparty.popularlibraries.baselogic.users.UsersFragment
import com.tlenparty.popularlibraries.converter.ConverterFragment
import dagger.Module
import dagger.android.ContributesAndroidInjector

@Module
interface UIModule {
    // Чтобы не было ошибки no injector factory bound for Class <...MainActivity>
    @ContributesAndroidInjector
    fun bindMainActivity(): MainActivity

    @ContributesAndroidInjector
    fun bindUserFragment(): UserFragment

    @ContributesAndroidInjector
    fun bindUsersFragment(): UsersFragment

    @ContributesAndroidInjector
    fun bindRepositoryFragment(): RepositoryFragment

    @ContributesAndroidInjector
    fun bindConverterFragment(): ConverterFragment

}