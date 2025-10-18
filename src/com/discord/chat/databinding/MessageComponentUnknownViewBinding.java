package com.discord.chat.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.annotation.NonNull;
import androidx.viewbinding.ViewBinding;
import com.discord.chat.R;
import com.discord.chat.presentation.message.ErrorMessageView;
import x1.a;

public final class MessageComponentUnknownViewBinding implements ViewBinding {
   @NonNull
   public final ErrorMessageView errorMessageView;
   @NonNull
   private final View rootView;

   private MessageComponentUnknownViewBinding(@NonNull View var1, @NonNull ErrorMessageView var2) {
      this.rootView = var1;
      this.errorMessageView = var2;
   }

   @NonNull
   public static MessageComponentUnknownViewBinding bind(@NonNull View var0) {
      int var1 = R.id.error_message_view;
      ErrorMessageView var2 = (ErrorMessageView)a.a(var0, var1);
      if (var2 != null) {
         return new MessageComponentUnknownViewBinding(var0, var2);
      } else {
         throw new NullPointerException("Missing required view with ID: ".concat(var0.getResources().getResourceName(var1)));
      }
   }

   @NonNull
   public static MessageComponentUnknownViewBinding inflate(@NonNull LayoutInflater var0, @NonNull ViewGroup var1) {
      if (var1 != null) {
         var0.inflate(R.layout.message_component_unknown_view, var1);
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
