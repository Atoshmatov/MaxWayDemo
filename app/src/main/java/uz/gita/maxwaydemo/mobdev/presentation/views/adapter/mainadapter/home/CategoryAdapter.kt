package uz.gita.maxwaydemo.mobdev.presentation.views.adapter.mainadapter.home

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import uz.gita.maxwaydemo.mobdev.data.model.mainmodel.home.CategoryModel
import uz.gita.maxwaydemo.mobdev.databinding.CollItemBinding

class CategoryAdapter : RecyclerView.Adapter<CategoryAdapter.ViewHolder>() {

    private var listener: ((id: Long, isSelected: Boolean) -> Unit)? = null
    private var categories = ArrayList<CategoryModel>()

    fun setListener(block: (Long, Boolean) -> Unit) {
        listener = block
    }

    fun submitList(list: List<CategoryModel>) {
        categories.clear()
        categories.addAll(list)
        notifyDataSetChanged()
    }

    inner class ViewHolder(private val binding: CollItemBinding) :
        RecyclerView.ViewHolder(binding.root) {

        init {}

        fun bind() = with(binding) {
            categoryName.text = categories[absoluteAdapterPosition].name
        }
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): CategoryAdapter.ViewHolder {
        return ViewHolder(
            CollItemBinding.inflate(
                LayoutInflater.from(parent.context),
                parent,
                false
            )
        )
    }

    override fun onBindViewHolder(holder: CategoryAdapter.ViewHolder, position: Int) {
        holder.bind()
    }

    override fun getItemCount(): Int {
        return categories.size
    }

}