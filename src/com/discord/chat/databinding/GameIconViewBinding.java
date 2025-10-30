package com.discord.chat.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.annotation.NonNull;
import androidx.viewbinding.ViewBinding;
import com.discord.chat.R;
import com.facebook.drawee.view.SimpleDraweeView;
import e4.a;

public final class GameIconViewBinding implements ViewBinding {
   @NonNull
   public final SimpleDraweeView gameControllerIcon;
   @NonNull
   private final View rootView;

   private GameIconViewBinding(@NonNull View var1, @NonNull SimpleDraweeView var2) {
      this.rootView = var1;
      this.gameControllerIcon = var2;
   }

   @NonNull
   public static GameIconViewBinding bind(@NonNull View var0) {
      int var1 = R.id.game_controller_icon;
      SimpleDraweeView var2 = (SimpleDraweeView)a.a(var0, var1);
      if (var2 != null) {
         return new GameIconViewBinding(var0, var2);
      } else {
         throw new NullPointerException("Missing required view with ID: ".concat(var0.getResources().getResourceName(var1)));
      }
   }

   @NonNull
   public static GameIconViewBinding inflate(@NonNull LayoutInflater var0, @NonNull ViewGroup var1) {
      if (var1 != null) {
         var0.inflate(R.layout.game_icon_view, var1);
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
