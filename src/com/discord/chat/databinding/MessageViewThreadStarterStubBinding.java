package com.discord.chat.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.annotation.NonNull;
import androidx.viewbinding.ViewBinding;
import com.discord.chat.R;
import com.discord.chat.presentation.message.ThreadStarterMessageHeaderView;

public final class MessageViewThreadStarterStubBinding implements ViewBinding {
   @NonNull
   private final ThreadStarterMessageHeaderView rootView;

   private MessageViewThreadStarterStubBinding(@NonNull ThreadStarterMessageHeaderView var1) {
      this.rootView = var1;
   }

   @NonNull
   public static MessageViewThreadStarterStubBinding bind(@NonNull View var0) {
      if (var0 != null) {
         return new MessageViewThreadStarterStubBinding((ThreadStarterMessageHeaderView)var0);
      } else {
         throw new NullPointerException("rootView");
      }
   }

   @NonNull
   public static MessageViewThreadStarterStubBinding inflate(@NonNull LayoutInflater var0) {
      return inflate(var0, null, false);
   }

   @NonNull
   public static MessageViewThreadStarterStubBinding inflate(@NonNull LayoutInflater var0, ViewGroup var1, boolean var2) {
      View var3 = var0.inflate(R.layout.message_view_thread_starter_stub, var1, false);
      if (var2) {
         var1.addView(var3);
      }

      return bind(var3);
   }

   @NonNull
   public ThreadStarterMessageHeaderView getRoot() {
      return this.rootView;
   }
}
