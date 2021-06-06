package com.example.basicactivity

class CustomRecyclerViewAdapter(realmResults: RealmResults<BloodPress>) :
RecyclerView.Adapter<ViewHolder>() {
    private val rResults: RealmResults<BloodPress> = realmResults
    
}