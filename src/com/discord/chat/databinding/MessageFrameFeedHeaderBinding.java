package com.discord.chat.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.viewbinding.ViewBinding;
import com.discord.chat.R;
import com.discord.overlapping_circles.OverlappingCirclesView;
import com.facebook.drawee.view.SimpleDraweeView;
import y0.a;

public final class MessageFrameFeedHeaderBinding implements ViewBinding {
   @NonNull
   public final SimpleDraweeView feedChannelIcon;
   @NonNull
   public final TextView feedChannelText;
   @NonNull
   public final TextView feedReplyCount;
   @NonNull
   public final SimpleDraweeView feedReplyIcon;
   @NonNull
   public final OverlappingCirclesView feedReplyParticipants;
   @NonNull
   private final View rootView;

   private MessageFrameFeedHeaderBinding(
      @NonNull View var1,
      @NonNull SimpleDraweeView var2,
      @NonNull TextView var3,
      @NonNull TextView var4,
      @NonNull SimpleDraweeView var5,
      @NonNull OverlappingCirclesView var6
   ) {
      this.rootView = var1;
      this.feedChannelIcon = var2;
      this.feedChannelText = var3;
      this.feedReplyCount = var4;
      this.feedReplyIcon = var5;
      this.feedReplyParticipants = var6;
   }

   @NonNull
   public static MessageFrameFeedHeaderBinding bind(@NonNull View var0) {
      int var1 = R.id.feed_channel_icon;
      SimpleDraweeView var4 = (SimpleDraweeView)a.a(var0, var1);
      if (var4 != null) {
         var1 = R.id.feed_channel_text;
         TextView var2 = (TextView)a.a(var0, var1);
         if (var2 != null) {
            var1 = R.id.feed_reply_count;
            TextView var3 = (TextView)a.a(var0, var1);
            if (var3 != null) {
               var1 = R.id.feed_reply_icon;
               SimpleDraweeView var6 = (SimpleDraweeView)a.a(var0, var1);
               if (var6 != null) {
                  var1 = R.id.feed_reply_participants;
                  OverlappingCirclesView var5 = (OverlappingCirclesView)a.a(var0, var1);
                  if (var5 != null) {
                     return new MessageFrameFeedHeaderBinding(var0, var4, var2, var3, var6, var5);
                  }
               }
            }
         }
      }

      throw new NullPointerException("Missing required view with ID: ".concat(var0.getResources().getResourceName(var1)));
   }

   @NonNull
   public static MessageFrameFeedHeaderBinding inflate(@NonNull LayoutInflater var0, @NonNull ViewGroup var1) {
      if (var1 != null) {
         var0.inflate(R.layout.message_frame_feed_header, var1);
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
