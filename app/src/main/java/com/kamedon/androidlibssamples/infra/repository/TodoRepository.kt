package com.kamedon.androidlibssamples.infra.repository

import com.kamedon.androidlibssamples.domain.entity.Status
import com.kamedon.androidlibssamples.domain.entity.Todo
import rx.Observable
import rx.lang.kotlin.toObservable

/**
 * Created by kamei.hidetoshi on 2016/08/16.
 */
class TodoRepository() {
    fun query(): Observable<Todo> {
        val list: MutableList<Todo> = mutableListOf(Todo("task1", Status.PBI))
        return list.toObservable()
    }
}