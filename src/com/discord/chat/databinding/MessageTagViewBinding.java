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

public final class MessageTagViewBinding implements ViewBinding {
   @NonNull
   public final ConstraintLayout layout;
   @NonNull
   private final View rootView;
   @NonNull
   public final TextView tag;
   @NonNull
   public final SimpleDraweeView verifiedBotIcon;

   private MessageTagViewBinding(@NonNull View var1, @NonNull ConstraintLayout var2, @NonNull TextView var3, @NonNull SimpleDraweeView var4) {
      this.rootView = var1;
      this.layout = var2;
      this.tag = var3;
      this.verifiedBotIcon = var4;
   }

   @NonNull
   public static MessageTagViewBinding bind(@NonNull View var0) {
      int var1 = R.id.layout;
      ConstraintLayout var4 = (ConstraintLayout)a.a(var0, var1);
      if (var4 != null) {
         var1 = R.id.tag;
         TextView var3 = (TextView)a.a(var0, var1);
         if (var3 != null) {
            var1 = R.id.verified_bot_icon;
            SimpleDraweeView var2 = (SimpleDraweeView)a.a(var0, var1);
            if (var2 != null) {
               return new MessageTagViewBinding(var0, var4, var3, var2);
            }
         }
      }

      throw new NullPointerException("Missing required view with ID: ".concat(var0.getResources().getResourceName(var1)));
   }

   @NonNull
   public static MessageTagViewBinding inflate(@NonNull LayoutInflater var0, @NonNull ViewGroup var1) {
      if (var1 != null) {
         var0.inflate(R.layout.message_tag_view, var1);
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
