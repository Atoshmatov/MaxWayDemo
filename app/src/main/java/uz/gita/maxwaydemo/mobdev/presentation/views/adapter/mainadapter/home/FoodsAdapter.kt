package uz.gita.maxwaydemo.mobdev.presentation.views.adapter.mainadapter.home

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.DiffUtil
import androidx.recyclerview.widget.ListAdapter
import androidx.recyclerview.widget.RecyclerView
import com.bumptech.glide.Glide
import uz.gita.maxwaydemo.mobdev.R
import uz.gita.maxwaydemo.mobdev.data.model.mainmodel.home.FoodsModel
import uz.gita.maxwaydemo.mobdev.databinding.FoodsItemBinding
import uz.gita.maxwaydemo.mobdev.utils.getPrice

class FoodsAdapter : ListAdapter<FoodsModel, FoodsAdapter.ViewHolder>(FoodsModelDiffUtils) {

    private val foods = ArrayList<FoodsModel>()


    object FoodsModelDiffUtils : DiffUtil.ItemCallback<FoodsModel>() {
        override fun areItemsTheSame(oldItem: FoodsModel, newItem: FoodsModel): Boolean =
            oldItem.id == newItem.id


        override fun areContentsTheSame(oldItem: FoodsModel, newItem: FoodsModel): Boolean =
            oldItem == newItem
    }

    inner class ViewHolder(private val binding: FoodsItemBinding) :
        RecyclerView.ViewHolder(binding.root) {
        fun bind() = with(binding) {
            foodName.text = getItem(absoluteAdapterPosition).name
            foodsCost.text = getItem(absoluteAdapterPosition).cost!!.getPrice()
            Glide
                .with(binding.root)
                .load(getItem(absoluteAdapterPosition).image)
                .placeholder(R.drawable.place_holder)
                .into(imageFood)
        }
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        return ViewHolder(
            FoodsItemBinding.inflate(
                LayoutInflater.from(parent.context),
                parent,
                false
            )
        )
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        holder.bind()
    }
}