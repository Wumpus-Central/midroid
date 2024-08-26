package com.discord.chat.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.viewbinding.ViewBinding;
import com.discord.chat.R;
import com.facebook.drawee.view.SimpleDraweeView;
import n1.a;

public final class MessageAltRemixTagViewBinding implements ViewBinding {
   public final TextView altRemixTag;
   public final ConstraintLayout layout;
   public final SimpleDraweeView remixIcon;
   private final View rootView;

   private MessageAltRemixTagViewBinding(View var1, TextView var2, ConstraintLayout var3, SimpleDraweeView var4) {
      this.rootView = var1;
      this.altRemixTag = var2;
      this.layout = var3;
      this.remixIcon = var4;
   }

   public static MessageAltRemixTagViewBinding bind(View var0) {
      int var1 = R.id.alt_remix_tag;
      TextView var3 = (TextView)a.a(var0, var1);
      if (var3 != null) {
         var1 = R.id.layout;
         ConstraintLayout var2 = (ConstraintLayout)a.a(var0, var1);
         if (var2 != null) {
            var1 = R.id.remix_icon;
            SimpleDraweeView var4 = (SimpleDraweeView)a.a(var0, var1);
            if (var4 != null) {
               return new MessageAltRemixTagViewBinding(var0, var3, var2, var4);
            }
         }
      }

      throw new NullPointerException("Missing required view with ID: ".concat(var0.getResources().getResourceName(var1)));
   }

   public static MessageAltRemixTagViewBinding inflate(LayoutInflater var0, ViewGroup var1) {
      if (var1 != null) {
         var0.inflate(R.layout.message_alt_remix_tag_view, var1);
         return bind(var1);
      } else {
         throw new NullPointerException("parent");
      }
   }

   public View getRoot() {
      return this.rootView;
   }
}
