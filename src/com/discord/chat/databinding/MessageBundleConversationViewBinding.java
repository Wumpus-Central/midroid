package com.discord.chat.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.constraintlayout.widget.Barrier;
import androidx.viewbinding.ViewBinding;
import com.discord.chat.R;
import com.discord.chat.presentation.message.view.MessageContentView;
import com.discord.reactions.ReactionsView;
import com.facebook.drawee.view.SimpleDraweeView;
import n1.a;

public final class MessageBundleConversationViewBinding implements ViewBinding {
   public final Barrier barrier;
   public final ReactionsView reactionsView;
   public final SimpleDraweeView replyAuthorAvatar;
   public final TextView replyAuthorName;
   public final MessageContentView replyText;
   private final View rootView;

   private MessageBundleConversationViewBinding(View var1, Barrier var2, ReactionsView var3, SimpleDraweeView var4, TextView var5, MessageContentView var6) {
      this.rootView = var1;
      this.barrier = var2;
      this.reactionsView = var3;
      this.replyAuthorAvatar = var4;
      this.replyAuthorName = var5;
      this.replyText = var6;
   }

   public static MessageBundleConversationViewBinding bind(View var0) {
      int var1 = R.id.barrier;
      Barrier var4 = (Barrier)a.a(var0, var1);
      if (var4 != null) {
         var1 = R.id.reactions_view;
         ReactionsView var5 = (ReactionsView)a.a(var0, var1);
         if (var5 != null) {
            var1 = R.id.reply_author_avatar;
            SimpleDraweeView var2 = (SimpleDraweeView)a.a(var0, var1);
            if (var2 != null) {
               var1 = R.id.reply_author_name;
               TextView var3 = (TextView)a.a(var0, var1);
               if (var3 != null) {
                  var1 = R.id.reply_text;
                  MessageContentView var6 = (MessageContentView)a.a(var0, var1);
                  if (var6 != null) {
                     return new MessageBundleConversationViewBinding(var0, var4, var5, var2, var3, var6);
                  }
               }
            }
         }
      }

      throw new NullPointerException("Missing required view with ID: ".concat(var0.getResources().getResourceName(var1)));
   }

   public static MessageBundleConversationViewBinding inflate(LayoutInflater var0, ViewGroup var1) {
      if (var1 != null) {
         var0.inflate(R.layout.message_bundle_conversation_view, var1);
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
