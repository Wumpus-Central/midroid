package com.discord.chat.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import androidx.viewbinding.ViewBinding;
import com.discord.chat.R;
import com.discord.chat.presentation.message.view.SpoilerView;
import t0.a;

public final class MessageComponentContainerViewBinding implements ViewBinding {
   public final View accentBorder;
   public final LinearLayout childrenViews;
   private final View rootView;
   public final SpoilerView spoiler;

   private MessageComponentContainerViewBinding(View var1, View var2, LinearLayout var3, SpoilerView var4) {
      this.rootView = var1;
      this.accentBorder = var2;
      this.childrenViews = var3;
      this.spoiler = var4;
   }

   public static MessageComponentContainerViewBinding bind(View var0) {
      int var1 = R.id.accent_border;
      View var3 = a.a(var0, var1);
      if (var3 != null) {
         var1 = R.id.children_views;
         LinearLayout var2 = (LinearLayout)a.a(var0, var1);
         if (var2 != null) {
            var1 = R.id.spoiler;
            SpoilerView var4 = (SpoilerView)a.a(var0, var1);
            if (var4 != null) {
               return new MessageComponentContainerViewBinding(var0, var3, var2, var4);
            }
         }
      }

      throw new NullPointerException("Missing required view with ID: ".concat(var0.getResources().getResourceName(var1)));
   }

   public static MessageComponentContainerViewBinding inflate(LayoutInflater var0, ViewGroup var1) {
      if (var1 != null) {
         var0.inflate(R.layout.message_component_container_view, var1);
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
