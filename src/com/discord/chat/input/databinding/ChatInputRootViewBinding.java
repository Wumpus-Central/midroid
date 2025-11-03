package com.discord.chat.input.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.annotation.NonNull;
import androidx.viewbinding.ViewBinding;
import com.discord.chat.input.R;
import com.discord.chat.input.views.DCDChatInput;

public final class ChatInputRootViewBinding implements ViewBinding {
   @NonNull
   public final DCDChatInput chatInputEditText;
   @NonNull
   private final View rootView;

   private ChatInputRootViewBinding(@NonNull View var1, @NonNull DCDChatInput var2) {
      this.rootView = var1;
      this.chatInputEditText = var2;
   }

   @NonNull
   public static ChatInputRootViewBinding bind(@NonNull View var0) {
      int var1 = R.id.chat_input_edit_text;
      DCDChatInput var2 = (DCDChatInput)k5.a.a(var0, var1);
      if (var2 != null) {
         return new ChatInputRootViewBinding(var0, var2);
      } else {
         throw new NullPointerException("Missing required view with ID: ".concat(var0.getResources().getResourceName(var1)));
      }
   }

   @NonNull
   public static ChatInputRootViewBinding inflate(@NonNull LayoutInflater var0, @NonNull ViewGroup var1) {
      if (var1 != null) {
         var0.inflate(R.layout.chat_input_root_view, var1);
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
