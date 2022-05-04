package uz.gita.maxwaydemo.mobdev.data.model.mainmodel.home

data class FoodsModel(
    val categoryID: Long? = 0,
    val cost: Long? = 0,
    val description: String? = "",
    val id: Long? = 0,
    val image: String? = "",
    val name: String? = ""
) {
    fun hasNull(): Boolean {
        if (
            (categoryID == null) ||
            (cost == null) ||
            (description == null) ||
            (id == null) ||
            (image == null) ||
            (name == null)
        )
            return true
        return false
    }
}
