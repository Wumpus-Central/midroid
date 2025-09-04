package com.discord.chat.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import androidx.annotation.NonNull;
import androidx.viewbinding.ViewBinding;
import com.discord.chat.R;
import com.discord.chat.presentation.message.view.SpoilerView;
import y0.a;

public final class MessageComponentContainerViewBinding implements ViewBinding {
   @NonNull
   public final View accentBorder;
   @NonNull
   public final LinearLayout childrenViews;
   @NonNull
   private final View rootView;
   @NonNull
   public final SpoilerView spoiler;

   private MessageComponentContainerViewBinding(@NonNull View var1, @NonNull View var2, @NonNull LinearLayout var3, @NonNull SpoilerView var4) {
      this.rootView = var1;
      this.accentBorder = var2;
      this.childrenViews = var3;
      this.spoiler = var4;
   }

   @NonNull
   public static MessageComponentContainerViewBinding bind(@NonNull View var0) {
      int var1 = R.id.accent_border;
      View var4 = a.a(var0, var1);
      if (var4 != null) {
         var1 = R.id.children_views;
         LinearLayout var2 = (LinearLayout)a.a(var0, var1);
         if (var2 != null) {
            var1 = R.id.spoiler;
            SpoilerView var3 = (SpoilerView)a.a(var0, var1);
            if (var3 != null) {
               return new MessageComponentContainerViewBinding(var0, var4, var2, var3);
            }
         }
      }

      throw new NullPointerException("Missing required view with ID: ".concat(var0.getResources().getResourceName(var1)));
   }

   @NonNull
   public static MessageComponentContainerViewBinding inflate(@NonNull LayoutInflater var0, @NonNull ViewGroup var1) {
      if (var1 != null) {
         var0.inflate(R.layout.message_component_container_view, var1);
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
