package com.discord.chat.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;
import androidx.viewbinding.ViewBinding;
import com.discord.chat.R;

public final class MessageComponentMediaGalleryDisplayViewBinding implements ViewBinding {
   @NonNull
   public final RecyclerView mosaic;
   @NonNull
   private final View rootView;

   private MessageComponentMediaGalleryDisplayViewBinding(@NonNull View var1, @NonNull RecyclerView var2) {
      this.rootView = var1;
      this.mosaic = var2;
   }

   @NonNull
   public static MessageComponentMediaGalleryDisplayViewBinding bind(@NonNull View var0) {
      int var1 = R.id.mosaic;
      RecyclerView var2 = (RecyclerView)k5.a.a(var0, var1);
      if (var2 != null) {
         return new MessageComponentMediaGalleryDisplayViewBinding(var0, var2);
      } else {
         throw new NullPointerException("Missing required view with ID: ".concat(var0.getResources().getResourceName(var1)));
      }
   }

   @NonNull
   public static MessageComponentMediaGalleryDisplayViewBinding inflate(@NonNull LayoutInflater var0, @NonNull ViewGroup var1) {
      if (var1 != null) {
         var0.inflate(R.layout.message_component_media_gallery_display_view, var1);
         return bind(var1);
      } else {
         throw new NullPointerException("parent");
      }
   }

   @NonNull
   @Override
   public View getRoot() {
      return this.rootView;
   }
}
