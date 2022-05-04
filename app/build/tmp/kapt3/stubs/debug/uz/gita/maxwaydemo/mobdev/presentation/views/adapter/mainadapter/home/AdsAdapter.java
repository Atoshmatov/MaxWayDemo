package uz.gita.maxwaydemo.mobdev.presentation.views.adapter.mainadapter.home;

import java.lang.System;

@kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u0012\u0012\u0004\u0012\u00020\u0002\u0012\b\u0012\u00060\u0003R\u00020\u00000\u0001:\u0002\u000e\u000fB\u0005\u00a2\u0006\u0002\u0010\u0004J\u001c\u0010\u0005\u001a\u00020\u00062\n\u0010\u0007\u001a\u00060\u0003R\u00020\u00002\u0006\u0010\b\u001a\u00020\tH\u0016J\u001c\u0010\n\u001a\u00060\u0003R\u00020\u00002\u0006\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\tH\u0016\u00a8\u0006\u0010"}, d2 = {"Luz/gita/maxwaydemo/mobdev/presentation/views/adapter/mainadapter/home/AdsAdapter;", "Landroidx/recyclerview/widget/ListAdapter;", "Luz/gita/maxwaydemo/mobdev/data/model/mainmodel/home/AdsModel;", "Luz/gita/maxwaydemo/mobdev/presentation/views/adapter/mainadapter/home/AdsAdapter$ViewHolder;", "()V", "onBindViewHolder", "", "holder", "position", "", "onCreateViewHolder", "parent", "Landroid/view/ViewGroup;", "viewType", "AdsModelDiffUtils", "ViewHolder", "app_debug"})
public final class AdsAdapter extends androidx.recyclerview.widget.ListAdapter<uz.gita.maxwaydemo.mobdev.data.model.mainmodel.home.AdsModel, uz.gita.maxwaydemo.mobdev.presentation.views.adapter.mainadapter.home.AdsAdapter.ViewHolder> {
    
    public AdsAdapter() {
        super(null);
    }
    
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public uz.gita.maxwaydemo.mobdev.presentation.views.adapter.mainadapter.home.AdsAdapter.ViewHolder onCreateViewHolder(@org.jetbrains.annotations.NotNull()
    android.view.ViewGroup parent, int viewType) {
        return null;
    }
    
    @java.lang.Override()
    public void onBindViewHolder(@org.jetbrains.annotations.NotNull()
    uz.gita.maxwaydemo.mobdev.presentation.views.adapter.mainadapter.home.AdsAdapter.ViewHolder holder, int position) {
    }
    
    @kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0004\b\u00c6\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0003J\u0018\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00022\u0006\u0010\u0007\u001a\u00020\u0002H\u0016J\u0018\u0010\b\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00022\u0006\u0010\u0007\u001a\u00020\u0002H\u0016\u00a8\u0006\t"}, d2 = {"Luz/gita/maxwaydemo/mobdev/presentation/views/adapter/mainadapter/home/AdsAdapter$AdsModelDiffUtils;", "Landroidx/recyclerview/widget/DiffUtil$ItemCallback;", "Luz/gita/maxwaydemo/mobdev/data/model/mainmodel/home/AdsModel;", "()V", "areContentsTheSame", "", "oldItem", "newItem", "areItemsTheSame", "app_debug"})
    public static final class AdsModelDiffUtils extends androidx.recyclerview.widget.DiffUtil.ItemCallback<uz.gita.maxwaydemo.mobdev.data.model.mainmodel.home.AdsModel> {
        @org.jetbrains.annotations.NotNull()
        public static final uz.gita.maxwaydemo.mobdev.presentation.views.adapter.mainadapter.home.AdsAdapter.AdsModelDiffUtils INSTANCE = null;
        
        private AdsModelDiffUtils() {
            super();
        }
        
        @java.lang.Override()
        public boolean areItemsTheSame(@org.jetbrains.annotations.NotNull()
        uz.gita.maxwaydemo.mobdev.data.model.mainmodel.home.AdsModel oldItem, @org.jetbrains.annotations.NotNull()
        uz.gita.maxwaydemo.mobdev.data.model.mainmodel.home.AdsModel newItem) {
            return false;
        }
        
        @java.lang.Override()
        public boolean areContentsTheSame(@org.jetbrains.annotations.NotNull()
        uz.gita.maxwaydemo.mobdev.data.model.mainmodel.home.AdsModel oldItem, @org.jetbrains.annotations.NotNull()
        uz.gita.maxwaydemo.mobdev.data.model.mainmodel.home.AdsModel newItem) {
            return false;
        }
    }
    
    @kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0086\u0004\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J\"\u0010\u0005\u001a\u001e\u0012\f\u0012\n \b*\u0004\u0018\u00010\u00070\u0007\u0012\f\u0012\n \b*\u0004\u0018\u00010\t0\t0\u0006R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\n"}, d2 = {"Luz/gita/maxwaydemo/mobdev/presentation/views/adapter/mainadapter/home/AdsAdapter$ViewHolder;", "Landroidx/recyclerview/widget/RecyclerView$ViewHolder;", "binding", "Luz/gita/maxwaydemo/mobdev/databinding/SlideItemBinding;", "(Luz/gita/maxwaydemo/mobdev/presentation/views/adapter/mainadapter/home/AdsAdapter;Luz/gita/maxwaydemo/mobdev/databinding/SlideItemBinding;)V", "bind", "Lcom/bumptech/glide/request/target/ViewTarget;", "Landroid/widget/ImageView;", "kotlin.jvm.PlatformType", "Landroid/graphics/drawable/Drawable;", "app_debug"})
    public final class ViewHolder extends androidx.recyclerview.widget.RecyclerView.ViewHolder {
        private final uz.gita.maxwaydemo.mobdev.databinding.SlideItemBinding binding = null;
        
        public ViewHolder(@org.jetbrains.annotations.NotNull()
        uz.gita.maxwaydemo.mobdev.databinding.SlideItemBinding binding) {
            super(null);
        }
        
        @org.jetbrains.annotations.NotNull()
        public final com.bumptech.glide.request.target.ViewTarget<android.widget.ImageView, android.graphics.drawable.Drawable> bind() {
            return null;
        }
    }
}