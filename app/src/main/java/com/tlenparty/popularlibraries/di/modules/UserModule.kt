package com.tlenparty.popularlibraries.di.modules

import com.tlenparty.popularlibraries.converter.Converter
import com.tlenparty.popularlibraries.converter.ConverterImpl
import com.tlenparty.popularlibraries.helpers.network.INetworkStatus
import com.tlenparty.popularlibraries.helpers.network.NetworkStatusImpl
import com.tlenparty.popularlibraries.model.db.cache.GithubCacheImpl
import com.tlenparty.popularlibraries.model.db.cache.IGithubCache
import com.tlenparty.popularlibraries.model.entites.GithubUsersRepository
import com.tlenparty.popularlibraries.model.repositories.GithubUsersRepositoryImpl
import com.tlenparty.popularlibraries.model.repositories.UserAvatarRepository
import com.tlenparty.popularlibraries.model.repositories.UserAvatarRepositoryImpl
import dagger.Binds
import dagger.Module
import javax.inject.Singleton

// Необходимо добавить в компоненты
@Module
interface UserModule {

    @Singleton
    @Binds // Указывает метот внутри модуля, набезе него надо сделать фабрику внутри которой буду зависимости
    fun bindGithubUsersRepository(githubUsersRepositoryImpl: GithubUsersRepositoryImpl): GithubUsersRepository

    @Singleton
    @Binds
    fun bindGithubCache(githubCache: GithubCacheImpl): IGithubCache

    @Singleton
    @Binds
    fun bindNetworkStatus(networkStatus: NetworkStatusImpl): INetworkStatus

    @Binds
    fun bindImageConverter(imageConverter: ConverterImpl): Converter

    @Singleton
    @Binds
    fun bindUserAvatarRepository(userAvatarRepository: UserAvatarRepositoryImpl): UserAvatarRepository


}