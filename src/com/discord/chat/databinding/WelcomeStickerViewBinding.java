package com.discord.chat.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.viewbinding.ViewBinding;
import com.discord.chat.R;
import com.discord.sticker.StickerView;

public final class WelcomeStickerViewBinding implements ViewBinding {
   @NonNull
   private final View rootView;
   @NonNull
   public final StickerView stickerView;
   @NonNull
   public final TextView welcomeReplyText;

   private WelcomeStickerViewBinding(@NonNull View var1, @NonNull StickerView var2, @NonNull TextView var3) {
      this.rootView = var1;
      this.stickerView = var2;
      this.welcomeReplyText = var3;
   }

   @NonNull
   public static WelcomeStickerViewBinding bind(@NonNull View var0) {
      int var1 = R.id.sticker_view;
      StickerView var3 = (StickerView)k5.a.a(var0, var1);
      if (var3 != null) {
         var1 = R.id.welcome_reply_text;
         TextView var2 = (TextView)k5.a.a(var0, var1);
         if (var2 != null) {
            return new WelcomeStickerViewBinding(var0, var3, var2);
         }
      }

      throw new NullPointerException("Missing required view with ID: ".concat(var0.getResources().getResourceName(var1)));
   }

   @NonNull
   public static WelcomeStickerViewBinding inflate(@NonNull LayoutInflater var0, @NonNull ViewGroup var1) {
      if (var1 != null) {
         var0.inflate(R.layout.welcome_sticker_view, var1);
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
