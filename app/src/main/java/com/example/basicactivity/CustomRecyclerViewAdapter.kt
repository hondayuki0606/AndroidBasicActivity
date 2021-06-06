package com.example.basicactivity

class CustomRecyclerViewAdapter(realmResults: RealmResults<BloodPress>) :
RecyclerView.Adapter<ViewHolder>() {
    private val rResults: RealmResults<BloodPress> = realmResults

    override fun onCreateViewHolder(parent: ViewGroup, position: Int): ViewHolder{
        val view = LayoutInflater.from(parent.context)
                .inflate(R.layout.one_result, parent, false)
        val viewholder = VireHolder(view)
        return viewholder
    }

    override fun getItemCount() :Int {
        return rResults.size
    }

    override fun onBindViewHolder(holder: ViewHolder, postion: Int) {

    }
}