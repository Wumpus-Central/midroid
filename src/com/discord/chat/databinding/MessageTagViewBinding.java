package com.discord.chat.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.viewbinding.ViewBinding;
import com.discord.chat.R;
import com.facebook.drawee.view.SimpleDraweeView;
import o1.a;

public final class MessageTagViewBinding implements ViewBinding {
   public final ConstraintLayout layout;
   private final View rootView;
   public final TextView tag;
   public final SimpleDraweeView verifiedBotIcon;

   private MessageTagViewBinding(View var1, ConstraintLayout var2, TextView var3, SimpleDraweeView var4) {
      this.rootView = var1;
      this.layout = var2;
      this.tag = var3;
      this.verifiedBotIcon = var4;
   }

   public static MessageTagViewBinding bind(View var0) {
      int var1 = R.id.layout;
      ConstraintLayout var2 = (ConstraintLayout)a.a(var0, var1);
      if (var2 != null) {
         var1 = R.id.tag;
         TextView var3 = (TextView)a.a(var0, var1);
         if (var3 != null) {
            var1 = R.id.verified_bot_icon;
            SimpleDraweeView var4 = (SimpleDraweeView)a.a(var0, var1);
            if (var4 != null) {
               return new MessageTagViewBinding(var0, var2, var3, var4);
            }
         }
      }

      throw new NullPointerException("Missing required view with ID: ".concat(var0.getResources().getResourceName(var1)));
   }

   public static MessageTagViewBinding inflate(LayoutInflater var0, ViewGroup var1) {
      if (var1 != null) {
         var0.inflate(R.layout.message_tag_view, var1);
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
