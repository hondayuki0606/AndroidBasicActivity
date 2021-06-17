package com.example.basicactivity

import android.app.Application
import io.realm.Realm
import io.realm.RealmConfiguration

class CustomApplication: Application() {
    override fun onCreate() {
        super.onCreate()
        // 初期化
        Realm.init(this)

        // 設定
        val config = RealmConfiguration.Builder()
                .build()
        // モデルクラスを変更しようとしたときにNeededを使用するとExceptionを回避し、データベースを削除してくれる
//        val config = RealmConfiguration.Builder()
//                .deleteRealmIfMigrationNeeded()
//                .build()
        // 全件削除
//        Realm.deleteRealm(config)
        Realm.setDefaultConfiguration(config)
    }
}