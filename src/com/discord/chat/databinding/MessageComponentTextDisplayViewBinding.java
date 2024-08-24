package com.discord.chat.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.viewbinding.ViewBinding;
import com.discord.chat.R;
import com.discord.chat.presentation.message.view.botuikit.components.TextDisplayComponentView;
import com.google.android.flexbox.FlexboxLayout;
import n1.a;

public final class MessageComponentTextDisplayViewBinding implements ViewBinding {
   private final TextDisplayComponentView rootView;
   public final FlexboxLayout textChildren;

   private MessageComponentTextDisplayViewBinding(TextDisplayComponentView var1, FlexboxLayout var2) {
      this.rootView = var1;
      this.textChildren = var2;
   }

   public static MessageComponentTextDisplayViewBinding bind(View var0) {
      int var1 = R.id.text_children;
      FlexboxLayout var2 = (FlexboxLayout)a.a(var0, var1);
      if (var2 != null) {
         return new MessageComponentTextDisplayViewBinding((TextDisplayComponentView)var0, var2);
      } else {
         throw new NullPointerException("Missing required view with ID: ".concat(var0.getResources().getResourceName(var1)));
      }
   }

   public static MessageComponentTextDisplayViewBinding inflate(LayoutInflater var0) {
      return inflate(var0, null, false);
   }

   public static MessageComponentTextDisplayViewBinding inflate(LayoutInflater var0, ViewGroup var1, boolean var2) {
      View var3 = var0.inflate(R.layout.message_component_text_display_view, var1, false);
      if (var2) {
         var1.addView(var3);
      }

      return bind(var3);
   }

   public TextDisplayComponentView getRoot() {
      return this.rootView;
   }
}
