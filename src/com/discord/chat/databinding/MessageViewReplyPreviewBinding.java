package com.discord.chat.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.viewbinding.ViewBinding;
import com.discord.channel_spine.ChannelSpineView;
import com.discord.chat.R;
import com.discord.chat.presentation.message.ClanTagChipletView;
import com.discord.chat.presentation.message.MessageTagView;
import com.discord.chat.presentation.message.RoleDotView;
import com.discord.chat.presentation.message.view.MessageContentView;
import com.facebook.drawee.view.SimpleDraweeView;

public final class MessageViewReplyPreviewBinding implements ViewBinding {
   @NonNull
   public final SimpleDraweeView replyAuthorAvatar;
   @NonNull
   public final TextView replyAuthorName;
   @NonNull
   public final SimpleDraweeView replyIcon;
   @NonNull
   public final SimpleDraweeView replyLeadingIcon;
   @NonNull
   public final LinearLayout replyLeadingViews;
   @NonNull
   public final MessageTagView replyMessageTagView;
   @NonNull
   public final RoleDotView replyRoleDot;
   @NonNull
   public final ChannelSpineView replySpline;
   @NonNull
   public final MessageContentView replyText;
   @NonNull
   public final SimpleDraweeView replyTrailingIcon;
   @NonNull
   private final View rootView;
   @NonNull
   public final ClanTagChipletView tagChiplet;

   private MessageViewReplyPreviewBinding(
      @NonNull View var1,
      @NonNull SimpleDraweeView var2,
      @NonNull TextView var3,
      @NonNull SimpleDraweeView var4,
      @NonNull SimpleDraweeView var5,
      @NonNull LinearLayout var6,
      @NonNull MessageTagView var7,
      @NonNull RoleDotView var8,
      @NonNull ChannelSpineView var9,
      @NonNull MessageContentView var10,
      @NonNull SimpleDraweeView var11,
      @NonNull ClanTagChipletView var12
   ) {
      this.rootView = var1;
      this.replyAuthorAvatar = var2;
      this.replyAuthorName = var3;
      this.replyIcon = var4;
      this.replyLeadingIcon = var5;
      this.replyLeadingViews = var6;
      this.replyMessageTagView = var7;
      this.replyRoleDot = var8;
      this.replySpline = var9;
      this.replyText = var10;
      this.replyTrailingIcon = var11;
      this.tagChiplet = var12;
   }

   @NonNull
   public static MessageViewReplyPreviewBinding bind(@NonNull View var0) {
      int var1 = R.id.reply_author_avatar;
      SimpleDraweeView var4 = (SimpleDraweeView)k5.a.a(var0, var1);
      if (var4 != null) {
         var1 = R.id.reply_author_name;
         TextView var7 = (TextView)k5.a.a(var0, var1);
         if (var7 != null) {
            var1 = R.id.reply_icon;
            SimpleDraweeView var6 = (SimpleDraweeView)k5.a.a(var0, var1);
            if (var6 != null) {
               var1 = R.id.reply_leading_icon;
               SimpleDraweeView var10 = (SimpleDraweeView)k5.a.a(var0, var1);
               if (var10 != null) {
                  var1 = R.id.reply_leading_views;
                  LinearLayout var5 = (LinearLayout)k5.a.a(var0, var1);
                  if (var5 != null) {
                     var1 = R.id.reply_message_tag_view;
                     MessageTagView var2 = (MessageTagView)k5.a.a(var0, var1);
                     if (var2 != null) {
                        var1 = R.id.reply_role_dot;
                        RoleDotView var8 = (RoleDotView)k5.a.a(var0, var1);
                        if (var8 != null) {
                           var1 = R.id.reply_spline;
                           ChannelSpineView var3 = (ChannelSpineView)k5.a.a(var0, var1);
                           if (var3 != null) {
                              var1 = R.id.reply_text;
                              MessageContentView var9 = (MessageContentView)k5.a.a(var0, var1);
                              if (var9 != null) {
                                 var1 = R.id.reply_trailing_icon;
                                 SimpleDraweeView var11 = (SimpleDraweeView)k5.a.a(var0, var1);
                                 if (var11 != null) {
                                    var1 = R.id.tag_chiplet;
                                    ClanTagChipletView var12 = (ClanTagChipletView)k5.a.a(var0, var1);
                                    if (var12 != null) {
                                       return new MessageViewReplyPreviewBinding(var0, var4, var7, var6, var10, var5, var2, var8, var3, var9, var11, var12);
                                    }
                                 }
                              }
                           }
                        }
                     }
                  }
               }
            }
         }
      }

      throw new NullPointerException("Missing required view with ID: ".concat(var0.getResources().getResourceName(var1)));
   }

   @NonNull
   public static MessageViewReplyPreviewBinding inflate(@NonNull LayoutInflater var0, @NonNull ViewGroup var1) {
      if (var1 != null) {
         var0.inflate(R.layout.message_view_reply_preview, var1);
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
