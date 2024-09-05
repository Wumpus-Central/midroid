package com.discord.chat.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.viewbinding.ViewBinding;
import com.discord.channel_spine.ChannelSpineView;
import com.discord.chat.R;
import com.discord.chat.presentation.message.ClanTagChipletView;
import com.discord.chat.presentation.message.MessageTagView;
import com.discord.chat.presentation.message.RoleDotView;
import com.discord.chat.presentation.message.view.MessageContentView;
import com.facebook.drawee.view.SimpleDraweeView;
import f3.a;

public final class MessageViewReplyPreviewBinding implements ViewBinding {
   public final SimpleDraweeView replyAuthorAvatar;
   public final TextView replyAuthorName;
   public final SimpleDraweeView replyIcon;
   public final SimpleDraweeView replyLeadingIcon;
   public final LinearLayout replyLeadingViews;
   public final MessageTagView replyMessageTagView;
   public final RoleDotView replyRoleDot;
   public final ChannelSpineView replySpline;
   public final MessageContentView replyText;
   public final SimpleDraweeView replyTrailingIcon;
   private final View rootView;
   public final ClanTagChipletView tagChiplet;

   private MessageViewReplyPreviewBinding(
      View var1,
      SimpleDraweeView var2,
      TextView var3,
      SimpleDraweeView var4,
      SimpleDraweeView var5,
      LinearLayout var6,
      MessageTagView var7,
      RoleDotView var8,
      ChannelSpineView var9,
      MessageContentView var10,
      SimpleDraweeView var11,
      ClanTagChipletView var12
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

   public static MessageViewReplyPreviewBinding bind(View var0) {
      int var1 = R.id.reply_author_avatar;
      SimpleDraweeView var9 = (SimpleDraweeView)a.a(var0, var1);
      if (var9 != null) {
         var1 = R.id.reply_author_name;
         TextView var10 = (TextView)a.a(var0, var1);
         if (var10 != null) {
            var1 = R.id.reply_icon;
            SimpleDraweeView var3 = (SimpleDraweeView)a.a(var0, var1);
            if (var3 != null) {
               var1 = R.id.reply_leading_icon;
               SimpleDraweeView var11 = (SimpleDraweeView)a.a(var0, var1);
               if (var11 != null) {
                  var1 = R.id.reply_leading_views;
                  LinearLayout var5 = (LinearLayout)a.a(var0, var1);
                  if (var5 != null) {
                     var1 = R.id.reply_message_tag_view;
                     MessageTagView var7 = (MessageTagView)a.a(var0, var1);
                     if (var7 != null) {
                        var1 = R.id.reply_role_dot;
                        RoleDotView var2 = (RoleDotView)a.a(var0, var1);
                        if (var2 != null) {
                           var1 = R.id.reply_spline;
                           ChannelSpineView var4 = (ChannelSpineView)a.a(var0, var1);
                           if (var4 != null) {
                              var1 = R.id.reply_text;
                              MessageContentView var12 = (MessageContentView)a.a(var0, var1);
                              if (var12 != null) {
                                 var1 = R.id.reply_trailing_icon;
                                 SimpleDraweeView var6 = (SimpleDraweeView)a.a(var0, var1);
                                 if (var6 != null) {
                                    var1 = R.id.tag_chiplet;
                                    ClanTagChipletView var8 = (ClanTagChipletView)a.a(var0, var1);
                                    if (var8 != null) {
                                       return new MessageViewReplyPreviewBinding(var0, var9, var10, var3, var11, var5, var7, var2, var4, var12, var6, var8);
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

   public static MessageViewReplyPreviewBinding inflate(LayoutInflater var0, ViewGroup var1) {
      if (var1 != null) {
         var0.inflate(R.layout.message_view_reply_preview, var1);
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
