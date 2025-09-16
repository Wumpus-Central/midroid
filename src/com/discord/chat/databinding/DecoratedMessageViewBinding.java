package com.discord.chat.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.annotation.NonNull;
import androidx.viewbinding.ViewBinding;
import com.discord.chat.R;
import com.discord.chat.presentation.message.MessageView;
import y0.a;

public final class DecoratedMessageViewBinding implements ViewBinding {
   @NonNull
   public final MessageView messageView;
   @NonNull
   private final View rootView;

   private DecoratedMessageViewBinding(@NonNull View var1, @NonNull MessageView var2) {
      this.rootView = var1;
      this.messageView = var2;
   }

   @NonNull
   public static DecoratedMessageViewBinding bind(@NonNull View var0) {
      int var1 = R.id.message_view;
      MessageView var2 = (MessageView)a.a(var0, var1);
      if (var2 != null) {
         return new DecoratedMessageViewBinding(var0, var2);
      } else {
         throw new NullPointerException("Missing required view with ID: ".concat(var0.getResources().getResourceName(var1)));
      }
   }

   @NonNull
   public static DecoratedMessageViewBinding inflate(@NonNull LayoutInflater var0, @NonNull ViewGroup var1) {
      if (var1 != null) {
         var0.inflate(R.layout.decorated_message_view, var1);
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
