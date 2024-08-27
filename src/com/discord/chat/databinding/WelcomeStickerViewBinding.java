package com.discord.chat.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.viewbinding.ViewBinding;
import com.discord.chat.R;
import com.discord.sticker.StickerView;
import n1.a;

public final class WelcomeStickerViewBinding implements ViewBinding {
   private final View rootView;
   public final StickerView stickerView;
   public final TextView welcomeReplyText;

   private WelcomeStickerViewBinding(View var1, StickerView var2, TextView var3) {
      this.rootView = var1;
      this.stickerView = var2;
      this.welcomeReplyText = var3;
   }

   public static WelcomeStickerViewBinding bind(View var0) {
      int var1 = R.id.sticker_view;
      StickerView var2 = (StickerView)a.a(var0, var1);
      if (var2 != null) {
         var1 = R.id.welcome_reply_text;
         TextView var3 = (TextView)a.a(var0, var1);
         if (var3 != null) {
            return new WelcomeStickerViewBinding(var0, var2, var3);
         }
      }

      throw new NullPointerException("Missing required view with ID: ".concat(var0.getResources().getResourceName(var1)));
   }

   public static WelcomeStickerViewBinding inflate(LayoutInflater var0, ViewGroup var1) {
      if (var1 != null) {
         var0.inflate(R.layout.welcome_sticker_view, var1);
         return bind(var1);
      } else {
         throw new NullPointerException("parent");
      }
   }

   public View getRoot() {
      return this.rootView;
   }
}
