package com.discord.chat.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.annotation.NonNull;
import androidx.viewbinding.ViewBinding;
import com.discord.chat.R;
import e4.a;

public final class MessageComponentSeparatorDisplayViewBinding implements ViewBinding {
   @NonNull
   public final View divider;
   @NonNull
   private final View rootView;

   private MessageComponentSeparatorDisplayViewBinding(@NonNull View var1, @NonNull View var2) {
      this.rootView = var1;
      this.divider = var2;
   }

   @NonNull
   public static MessageComponentSeparatorDisplayViewBinding bind(@NonNull View var0) {
      int var1 = R.id.divider;
      View var2 = a.a(var0, var1);
      if (var2 != null) {
         return new MessageComponentSeparatorDisplayViewBinding(var0, var2);
      } else {
         throw new NullPointerException("Missing required view with ID: ".concat(var0.getResources().getResourceName(var1)));
      }
   }

   @NonNull
   public static MessageComponentSeparatorDisplayViewBinding inflate(@NonNull LayoutInflater var0, @NonNull ViewGroup var1) {
      if (var1 != null) {
         var0.inflate(R.layout.message_component_separator_display_view, var1);
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
