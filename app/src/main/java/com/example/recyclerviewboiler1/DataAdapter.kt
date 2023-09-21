package com.example.recyclerviewboiler1

import android.content.Context
import android.view.View
import android.view.ViewGroup
import android.view.ViewParent
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.example.recyclerviewboiler1.model.Constellation


class DataViewHolder(val itemView: View): RecyclerView.ViewHolder(itemView){
    val textView: TextView = itemView.findViewById(R.id.item_name)
}


// Adapter class: constructor params -> Context, Data extends RecyclerView.Adapter<DataViewHolder>()(a generic class, of type DataViewHolder)
class DataAdapter(val context: Context, val dataList: List<Constellation>): RecyclerView.Adapter<DataViewHolder>() {

    /**
     *  Three methods needs to be overriden
     *  1. onCreateViewHolder(context: Context, dataSet: List<Type>) -> returns ViewHolder
     *  2. onBindViewHolder(viewHolder: ViewHolder, position Int)
     *  3. getItemCount() -> returns size of the data-set
     *
     * */

    // overriding onCreateViewHolder, params -> ViewGroup, ViewType, return ViewHolder
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): DataViewHolder{

    }
    // overriding onBindViewHolder, params -> ViewHolder, Int(current item position)
    override fun onBindViewHolder(holder: DataViewHolder, position: Int){

    }
    // overriding getItemCount
    override fun getItemCount(): Int {

    }
}