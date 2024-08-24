package com.discord.chat.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.viewbinding.ViewBinding;
import com.discord.chat.R;
import com.google.android.flexbox.FlexboxLayout;
import n1.a;

public final class MessageComponentsViewBinding implements ViewBinding {
   public final FlexboxLayout itemComponentsRoot;
   private final View rootView;

   private MessageComponentsViewBinding(View var1, FlexboxLayout var2) {
      this.rootView = var1;
      this.itemComponentsRoot = var2;
   }

   public static MessageComponentsViewBinding bind(View var0) {
      int var1 = R.id.item_components_root;
      FlexboxLayout var2 = (FlexboxLayout)a.a(var0, var1);
      if (var2 != null) {
         return new MessageComponentsViewBinding(var0, var2);
      } else {
         throw new NullPointerException("Missing required view with ID: ".concat(var0.getResources().getResourceName(var1)));
      }
   }

   public static MessageComponentsViewBinding inflate(LayoutInflater var0, ViewGroup var1) {
      if (var1 != null) {
         var0.inflate(R.layout.message_components_view, var1);
         return bind(var1);
      } else {
         throw new NullPointerException("parent");
      }
   }

   public View getRoot() {
      return this.rootView;
   }
}
