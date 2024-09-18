package com.discord.chat.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;
import androidx.viewbinding.ViewBinding;
import com.discord.chat.R;
import com.discord.chat.presentation.message.view.InlineForwardButtonView;
import n1.a;

public final class AttachmentMediaMosaicContainerViewBinding implements ViewBinding {
   public final InlineForwardButtonView forward;
   public final RecyclerView mosaic;
   private final View rootView;

   private AttachmentMediaMosaicContainerViewBinding(View var1, InlineForwardButtonView var2, RecyclerView var3) {
      this.rootView = var1;
      this.forward = var2;
      this.mosaic = var3;
   }

   public static AttachmentMediaMosaicContainerViewBinding bind(View var0) {
      int var1 = R.id.forward;
      InlineForwardButtonView var3 = (InlineForwardButtonView)a.a(var0, var1);
      if (var3 != null) {
         var1 = R.id.mosaic;
         RecyclerView var2 = (RecyclerView)a.a(var0, var1);
         if (var2 != null) {
            return new AttachmentMediaMosaicContainerViewBinding(var0, var3, var2);
         }
      }

      throw new NullPointerException("Missing required view with ID: ".concat(var0.getResources().getResourceName(var1)));
   }

   public static AttachmentMediaMosaicContainerViewBinding inflate(LayoutInflater var0, ViewGroup var1) {
      if (var1 != null) {
         var0.inflate(R.layout.attachment_media_mosaic_container_view, var1);
         return bind(var1);
      } else {
         throw new NullPointerException("parent");
      }
   }

   @Override
   public View getRoot() {
      return this.rootView;
   }
}
