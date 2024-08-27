package com.discord.chat.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.viewbinding.ViewBinding;
import com.discord.chat.R;
import com.discord.chat.presentation.message.MessageHighlightHeader;

public final class MessageViewHighlightHeaderStubBinding implements ViewBinding {
   private final MessageHighlightHeader rootView;

   private MessageViewHighlightHeaderStubBinding(MessageHighlightHeader var1) {
      this.rootView = var1;
   }

   public static MessageViewHighlightHeaderStubBinding bind(View var0) {
      if (var0 != null) {
         return new MessageViewHighlightHeaderStubBinding((MessageHighlightHeader)var0);
      } else {
         throw new NullPointerException("rootView");
      }
   }

   public static MessageViewHighlightHeaderStubBinding inflate(LayoutInflater var0) {
      return inflate(var0, null, false);
   }

   public static MessageViewHighlightHeaderStubBinding inflate(LayoutInflater var0, ViewGroup var1, boolean var2) {
      View var3 = var0.inflate(R.layout.message_view_highlight_header_stub, var1, false);
      if (var2) {
         var1.addView(var3);
      }

      return bind(var3);
   }

   public MessageHighlightHeader getRoot() {
      return this.rootView;
   }
}
