package com.discord.chat.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.viewbinding.ViewBinding;
import com.discord.chat.R;
import com.discord.chat.presentation.list.messagebundling.MessageBundleRecyclerView;
import com.discord.chat.presentation.message.MessageFrameFeedHeaderView;
import f3.a;

public final class MessageBundleViewBinding implements ViewBinding {
   public final MessageBundleRecyclerView chatListView;
   public final MessageFrameFeedHeaderView messageFrameHeader;
   private final View rootView;

   private MessageBundleViewBinding(View var1, MessageBundleRecyclerView var2, MessageFrameFeedHeaderView var3) {
      this.rootView = var1;
      this.chatListView = var2;
      this.messageFrameHeader = var3;
   }

   public static MessageBundleViewBinding bind(View var0) {
      int var1 = R.id.chat_list_view;
      MessageBundleRecyclerView var3 = (MessageBundleRecyclerView)a.a(var0, var1);
      if (var3 != null) {
         var1 = R.id.message_frame_header;
         MessageFrameFeedHeaderView var2 = (MessageFrameFeedHeaderView)a.a(var0, var1);
         if (var2 != null) {
            return new MessageBundleViewBinding(var0, var3, var2);
         }
      }

      throw new NullPointerException("Missing required view with ID: ".concat(var0.getResources().getResourceName(var1)));
   }

   public static MessageBundleViewBinding inflate(LayoutInflater var0, ViewGroup var1) {
      if (var1 != null) {
         var0.inflate(R.layout.message_bundle_view, var1);
         return bind(var1);
      } else {
         throw new NullPointerException("parent");
      }
   }

   @Override
   public View getRoot() {
      return this.rootView;
   }
}
