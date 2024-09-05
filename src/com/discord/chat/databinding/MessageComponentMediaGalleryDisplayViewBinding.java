package com.discord.chat.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;
import androidx.viewbinding.ViewBinding;
import com.discord.chat.R;
import com.discord.chat.presentation.message.view.botuikit.components.media_gallery.MediaGalleryDisplayComponentView;
import f3.a;

public final class MessageComponentMediaGalleryDisplayViewBinding implements ViewBinding {
   public final RecyclerView mosaic;
   private final MediaGalleryDisplayComponentView rootView;

   private MessageComponentMediaGalleryDisplayViewBinding(MediaGalleryDisplayComponentView var1, RecyclerView var2) {
      this.rootView = var1;
      this.mosaic = var2;
   }

   public static MessageComponentMediaGalleryDisplayViewBinding bind(View var0) {
      int var1 = R.id.mosaic;
      RecyclerView var2 = (RecyclerView)a.a(var0, var1);
      if (var2 != null) {
         return new MessageComponentMediaGalleryDisplayViewBinding((MediaGalleryDisplayComponentView)var0, var2);
      } else {
         throw new NullPointerException("Missing required view with ID: ".concat(var0.getResources().getResourceName(var1)));
      }
   }

   public static MessageComponentMediaGalleryDisplayViewBinding inflate(LayoutInflater var0) {
      return inflate(var0, null, false);
   }

   public static MessageComponentMediaGalleryDisplayViewBinding inflate(LayoutInflater var0, ViewGroup var1, boolean var2) {
      View var3 = var0.inflate(R.layout.message_component_media_gallery_display_view, var1, false);
      if (var2) {
         var1.addView(var3);
      }

      return bind(var3);
   }

   public MediaGalleryDisplayComponentView getRoot() {
      return this.rootView;
   }
}
