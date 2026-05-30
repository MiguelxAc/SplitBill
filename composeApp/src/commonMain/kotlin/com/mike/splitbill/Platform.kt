package com.mike.splitbill

interface Platform {
    val name: String
}

expect fun getPlatform(): Platform