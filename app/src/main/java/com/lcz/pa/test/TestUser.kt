package com.lcz.pa.test

import javax.inject.Inject

/**
 *
 * desc: TODO
 *
 * create by lcz on 2021-07-01
 */
class TestUser @Inject constructor() {
    var name = "lcz"
    var age = 18
    override fun toString(): String {
        return "User(name=$name age$age)"
    }
}