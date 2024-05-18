package com.roman_tsisyk.readandlearn.extensions

fun String.transformUrl(): String {
    return this.replace("/deities/images/", "/images/deities/")
}


fun String.addBaseURL(): String {
    return BASE_URL + this
}




const val BASE_URL = "https://raw.githubusercontent.com/slavic-api/API/main/"