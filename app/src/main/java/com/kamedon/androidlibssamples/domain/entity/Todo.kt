package com.kamedon.androidlibssamples.domain.entity

/**
 * Created by kamei.hidetoshi on 2016/08/16.
 */

data class Todo(val body: String, val status: Status) {
}

enum class Status {
    PBI, WIP, DONE
}

