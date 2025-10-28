package com.discord.chat.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.viewbinding.ViewBinding;
import com.discord.chat.R;
import com.facebook.drawee.view.SimpleDraweeView;
import y0.a;

public final class MessageAltRemixTagViewBinding implements ViewBinding {
   @NonNull
   public final TextView altRemixTag;
   @NonNull
   public final ConstraintLayout layout;
   @NonNull
   public final SimpleDraweeView remixIcon;
   @NonNull
   private final View rootView;

   private MessageAltRemixTagViewBinding(@NonNull View var1, @NonNull TextView var2, @NonNull ConstraintLayout var3, @NonNull SimpleDraweeView var4) {
      this.rootView = var1;
      this.altRemixTag = var2;
      this.layout = var3;
      this.remixIcon = var4;
   }

   @NonNull
   public static MessageAltRemixTagViewBinding bind(@NonNull View var0) {
      int var1 = R.id.alt_remix_tag;
      TextView var2 = (TextView)a.a(var0, var1);
      if (var2 != null) {
         var1 = R.id.layout;
         ConstraintLayout var4 = (ConstraintLayout)a.a(var0, var1);
         if (var4 != null) {
            var1 = R.id.remix_icon;
            SimpleDraweeView var3 = (SimpleDraweeView)a.a(var0, var1);
            if (var3 != null) {
               return new MessageAltRemixTagViewBinding(var0, var2, var4, var3);
            }
         }
      }

      throw new NullPointerException("Missing required view with ID: ".concat(var0.getResources().getResourceName(var1)));
   }

   @NonNull
   public static MessageAltRemixTagViewBinding inflate(@NonNull LayoutInflater var0, @NonNull ViewGroup var1) {
      if (var1 != null) {
         var0.inflate(R.layout.message_alt_remix_tag_view, var1);
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
