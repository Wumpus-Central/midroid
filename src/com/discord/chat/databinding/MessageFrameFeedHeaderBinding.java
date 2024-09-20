package com.discord.chat.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.viewbinding.ViewBinding;
import com.discord.chat.R;
import com.discord.overlapping_circles.OverlappingCirclesView;
import com.facebook.drawee.view.SimpleDraweeView;
import n1.a;

public final class MessageFrameFeedHeaderBinding implements ViewBinding {
   public final SimpleDraweeView feedChannelIcon;
   public final TextView feedChannelText;
   public final TextView feedReplyCount;
   public final SimpleDraweeView feedReplyIcon;
   public final OverlappingCirclesView feedReplyParticipants;
   private final View rootView;

   private MessageFrameFeedHeaderBinding(View var1, SimpleDraweeView var2, TextView var3, TextView var4, SimpleDraweeView var5, OverlappingCirclesView var6) {
      this.rootView = var1;
      this.feedChannelIcon = var2;
      this.feedChannelText = var3;
      this.feedReplyCount = var4;
      this.feedReplyIcon = var5;
      this.feedReplyParticipants = var6;
   }

   public static MessageFrameFeedHeaderBinding bind(View var0) {
      int var1 = R.id.feed_channel_icon;
      SimpleDraweeView var6 = (SimpleDraweeView)a.a(var0, var1);
      if (var6 != null) {
         var1 = R.id.feed_channel_text;
         TextView var5 = (TextView)a.a(var0, var1);
         if (var5 != null) {
            var1 = R.id.feed_reply_count;
            TextView var2 = (TextView)a.a(var0, var1);
            if (var2 != null) {
               var1 = R.id.feed_reply_icon;
               SimpleDraweeView var3 = (SimpleDraweeView)a.a(var0, var1);
               if (var3 != null) {
                  var1 = R.id.feed_reply_participants;
                  OverlappingCirclesView var4 = (OverlappingCirclesView)a.a(var0, var1);
                  if (var4 != null) {
                     return new MessageFrameFeedHeaderBinding(var0, var6, var5, var2, var3, var4);
                  }
               }
            }
         }
      }

      throw new NullPointerException("Missing required view with ID: ".concat(var0.getResources().getResourceName(var1)));
   }

   public static MessageFrameFeedHeaderBinding inflate(LayoutInflater var0, ViewGroup var1) {
      if (var1 != null) {
         var0.inflate(R.layout.message_frame_feed_header, var1);
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
