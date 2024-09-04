package com.discord.chat.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.viewbinding.ViewBinding;
import com.discord.chat.R;
import com.facebook.drawee.view.SimpleDraweeView;
import v2.a;

public final class ClanTagChipletViewBinding implements ViewBinding {
   public final SimpleDraweeView badge;
   public final LinearLayout container;
   private final View rootView;
   public final TextView tag;

   private ClanTagChipletViewBinding(View var1, SimpleDraweeView var2, LinearLayout var3, TextView var4) {
      this.rootView = var1;
      this.badge = var2;
      this.container = var3;
      this.tag = var4;
   }

   public static ClanTagChipletViewBinding bind(View var0) {
      int var1 = R.id.badge;
      SimpleDraweeView var2 = (SimpleDraweeView)a.a(var0, var1);
      if (var2 != null) {
         var1 = R.id.container;
         LinearLayout var3 = (LinearLayout)a.a(var0, var1);
         if (var3 != null) {
            var1 = R.id.tag;
            TextView var4 = (TextView)a.a(var0, var1);
            if (var4 != null) {
               return new ClanTagChipletViewBinding(var0, var2, var3, var4);
            }
         }
      }

      throw new NullPointerException("Missing required view with ID: ".concat(var0.getResources().getResourceName(var1)));
   }

   public static ClanTagChipletViewBinding inflate(LayoutInflater var0, ViewGroup var1) {
      if (var1 != null) {
         var0.inflate(R.layout.clan_tag_chiplet_view, var1);
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
