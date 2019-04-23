package com.example.mvptest.base

interface BaseView<T>{
    fun setPresenter(presenter:T)
}