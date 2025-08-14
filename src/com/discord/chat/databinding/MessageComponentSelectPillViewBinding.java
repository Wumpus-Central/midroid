package com.discord.chat.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.annotation.NonNull;
import androidx.viewbinding.ViewBinding;
import com.discord.chat.R;
import com.google.android.material.textview.MaterialTextView;

public final class MessageComponentSelectPillViewBinding implements ViewBinding {
   @NonNull
   private final MaterialTextView rootView;

   private MessageComponentSelectPillViewBinding(@NonNull MaterialTextView var1) {
      this.rootView = var1;
   }

   @NonNull
   public static MessageComponentSelectPillViewBinding bind(@NonNull View var0) {
      if (var0 != null) {
         return new MessageComponentSelectPillViewBinding((MaterialTextView)var0);
      } else {
         throw new NullPointerException("rootView");
      }
   }

   @NonNull
   public static MessageComponentSelectPillViewBinding inflate(@NonNull LayoutInflater var0) {
      return inflate(var0, null, false);
   }

   @NonNull
   public static MessageComponentSelectPillViewBinding inflate(@NonNull LayoutInflater var0, ViewGroup var1, boolean var2) {
      View var3 = var0.inflate(R.layout.message_component_select_pill_view, var1, false);
      if (var2) {
         var1.addView(var3);
      }

      return bind(var3);
   }

   @NonNull
   public MaterialTextView getRoot() {
      return this.rootView;
   }
}
