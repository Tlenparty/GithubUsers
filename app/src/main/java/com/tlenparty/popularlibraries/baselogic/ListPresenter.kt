package com.tlenparty.popularlibraries.baselogic

interface ListPresenter<T> {

    //обработчик клика по элементу списка
    var itemClickListener: ((T) -> Unit)?

    //привязка элемента к view
    fun bindView(view: T)

    //количество элементов в списке
    fun getCount(): Int
}