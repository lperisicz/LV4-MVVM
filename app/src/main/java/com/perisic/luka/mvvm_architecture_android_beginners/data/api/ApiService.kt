package com.perisic.luka.mvvm_architecture_android_beginners.data.api

import com.perisic.luka.mvvm_architecture_android_beginners.data.model.User
import io.reactivex.Single

interface ApiService {

    fun getUsers(): Single<List<User>>

}