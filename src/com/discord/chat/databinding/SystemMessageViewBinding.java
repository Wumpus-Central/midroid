package com.discord.chat.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.viewbinding.ViewBinding;
import com.discord.chat.R;
import com.discord.chat.presentation.message.MessageAccessoriesView;
import com.facebook.drawee.view.SimpleDraweeView;
import n1.a;

public final class SystemMessageViewBinding implements ViewBinding {
   public final MessageAccessoriesView accessoriesView;
   public final SimpleDraweeView icon;
   private final View rootView;

   private SystemMessageViewBinding(View var1, MessageAccessoriesView var2, SimpleDraweeView var3) {
      this.rootView = var1;
      this.accessoriesView = var2;
      this.icon = var3;
   }

   public static SystemMessageViewBinding bind(View var0) {
      int var1 = R.id.accessories_view;
      MessageAccessoriesView var3 = (MessageAccessoriesView)a.a(var0, var1);
      if (var3 != null) {
         var1 = R.id.icon;
         SimpleDraweeView var2 = (SimpleDraweeView)a.a(var0, var1);
         if (var2 != null) {
            return new SystemMessageViewBinding(var0, var3, var2);
         }
      }

      throw new NullPointerException("Missing required view with ID: ".concat(var0.getResources().getResourceName(var1)));
   }

   public static SystemMessageViewBinding inflate(LayoutInflater var0, ViewGroup var1) {
      if (var1 != null) {
         var0.inflate(R.layout.system_message_view, var1);
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
