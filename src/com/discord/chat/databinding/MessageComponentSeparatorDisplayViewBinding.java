package com.discord.chat.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.viewbinding.ViewBinding;
import com.discord.chat.R;
import com.discord.chat.presentation.message.view.botuikit.components.SeparatorDisplayComponentView;
import f3.a;

public final class MessageComponentSeparatorDisplayViewBinding implements ViewBinding {
   public final View divider;
   private final SeparatorDisplayComponentView rootView;

   private MessageComponentSeparatorDisplayViewBinding(SeparatorDisplayComponentView var1, View var2) {
      this.rootView = var1;
      this.divider = var2;
   }

   public static MessageComponentSeparatorDisplayViewBinding bind(View var0) {
      int var1 = R.id.divider;
      View var2 = a.a(var0, var1);
      if (var2 != null) {
         return new MessageComponentSeparatorDisplayViewBinding((SeparatorDisplayComponentView)var0, var2);
      } else {
         throw new NullPointerException("Missing required view with ID: ".concat(var0.getResources().getResourceName(var1)));
      }
   }

   public static MessageComponentSeparatorDisplayViewBinding inflate(LayoutInflater var0) {
      return inflate(var0, null, false);
   }

   public static MessageComponentSeparatorDisplayViewBinding inflate(LayoutInflater var0, ViewGroup var1, boolean var2) {
      View var3 = var0.inflate(R.layout.message_component_separator_display_view, var1, false);
      if (var2) {
         var1.addView(var3);
      }

      return bind(var3);
   }

   public SeparatorDisplayComponentView getRoot() {
      return this.rootView;
   }
}
