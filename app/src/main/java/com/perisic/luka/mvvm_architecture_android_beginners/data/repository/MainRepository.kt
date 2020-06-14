package com.perisic.luka.mvvm_architecture_android_beginners.data.repository

import com.perisic.luka.mvvm_architecture_android_beginners.data.api.ApiHelper
import com.perisic.luka.mvvm_architecture_android_beginners.data.model.User
import io.reactivex.Single

class MainRepository(private val apiHelper: ApiHelper) {

    fun getUsers(): Single<List<User>> {
        return apiHelper.getUsers()
    }

}