package uz.gita.maxwaydemo.mobdev.presentation.views.adapter.mainadapter.home

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.DiffUtil
import androidx.recyclerview.widget.ListAdapter
import androidx.recyclerview.widget.RecyclerView
import com.bumptech.glide.Glide
import uz.gita.maxwaydemo.mobdev.R
import uz.gita.maxwaydemo.mobdev.data.model.mainmodel.home.AdsModel
import uz.gita.maxwaydemo.mobdev.databinding.SlideItemBinding

class AdsAdapter : ListAdapter<AdsModel, AdsAdapter.ViewHolder>(AdsModelDiffUtils) {

    object AdsModelDiffUtils : DiffUtil.ItemCallback<AdsModel>() {
        override fun areItemsTheSame(oldItem: AdsModel, newItem: AdsModel): Boolean {
            return oldItem.id == newItem.id
        }

        override fun areContentsTheSame(oldItem: AdsModel, newItem: AdsModel): Boolean {
            return oldItem == newItem
        }

    }

    inner class ViewHolder(private val binding: SlideItemBinding) :
        RecyclerView.ViewHolder(binding.root) {
        fun bind() = with(binding) {
            Glide
                .with(binding.root)
                .load(getItem(absoluteAdapterPosition).image)
                .placeholder(R.drawable.place_holder)
                .into(slideAds)
        }

    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        return ViewHolder(
            SlideItemBinding.inflate(
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