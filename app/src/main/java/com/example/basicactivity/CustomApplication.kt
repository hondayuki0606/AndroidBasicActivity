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
            .name("myrealm.realm")
            .encryptionKey(getMyKey())
            .schemaVersion(42)
            .modules(MySchemaModule())
            .migration(MyMigration())
            .readOnly()
            .inMemory()
            .build()
        Realm.setDefaultConfiguration(config)
    }
}