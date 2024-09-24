package com.discord.chat.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.viewbinding.ViewBinding;
import com.discord.chat.R;
import com.facebook.drawee.view.SimpleDraweeView;
import o1.a;

public final class GuildViewBinding implements ViewBinding {
   public final SimpleDraweeView guildAvatar;
   public final TextView guildText;
   private final View rootView;

   private GuildViewBinding(View var1, SimpleDraweeView var2, TextView var3) {
      this.rootView = var1;
      this.guildAvatar = var2;
      this.guildText = var3;
   }

   public static GuildViewBinding bind(View var0) {
      int var1 = R.id.guild_avatar;
      SimpleDraweeView var3 = (SimpleDraweeView)a.a(var0, var1);
      if (var3 != null) {
         var1 = R.id.guild_text;
         TextView var2 = (TextView)a.a(var0, var1);
         if (var2 != null) {
            return new GuildViewBinding(var0, var3, var2);
         }
      }

      throw new NullPointerException("Missing required view with ID: ".concat(var0.getResources().getResourceName(var1)));
   }

   public static GuildViewBinding inflate(LayoutInflater var0, ViewGroup var1) {
      if (var1 != null) {
         var0.inflate(R.layout.guild_view, var1);
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
