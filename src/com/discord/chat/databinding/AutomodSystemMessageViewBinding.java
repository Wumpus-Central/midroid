package com.discord.chat.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.constraintlayout.helper.widget.Flow;
import androidx.constraintlayout.widget.Barrier;
import androidx.constraintlayout.widget.Guideline;
import androidx.viewbinding.ViewBinding;
import com.discord.chat.R;
import com.discord.chat.presentation.message.MessageAccessoriesView;
import com.discord.chat.presentation.message.MessageTagView;
import com.discord.chat.presentation.message.MessageViewReplyPreview;
import com.discord.chat.presentation.message.ThreadStarterMessageHeaderView;
import com.facebook.drawee.view.SimpleDraweeView;
import n1.a;

public final class AutomodSystemMessageViewBinding implements ViewBinding {
   public final MessageAccessoriesView accessoriesView;
   public final SimpleDraweeView authorAvatar;
   public final TextView authorName;
   public final TextView automodMessageChannel;
   public final TextView automodMessageContextHeader;
   public final SimpleDraweeView guildCommunicationDisabledIcon;
   public final Flow headerSection;
   public final Guideline messageEndGuideline;
   public final Barrier messageHeaderBarrier;
   public final View messageHeaderDivider;
   public final TextView messageHeaderSubtitle;
   public final TextView messageHeaderTitle;
   public final MessageTagView messageTagView;
   public final MessageViewReplyPreview replyPreview;
   private final View rootView;
   public final ThreadStarterMessageHeaderView threadStarterHeader;
   public final TextView timestamp;

   private AutomodSystemMessageViewBinding(
      View var1,
      MessageAccessoriesView var2,
      SimpleDraweeView var3,
      TextView var4,
      TextView var5,
      TextView var6,
      SimpleDraweeView var7,
      Flow var8,
      Guideline var9,
      Barrier var10,
      View var11,
      TextView var12,
      TextView var13,
      MessageTagView var14,
      MessageViewReplyPreview var15,
      ThreadStarterMessageHeaderView var16,
      TextView var17
   ) {
      this.rootView = var1;
      this.accessoriesView = var2;
      this.authorAvatar = var3;
      this.authorName = var4;
      this.automodMessageChannel = var5;
      this.automodMessageContextHeader = var6;
      this.guildCommunicationDisabledIcon = var7;
      this.headerSection = var8;
      this.messageEndGuideline = var9;
      this.messageHeaderBarrier = var10;
      this.messageHeaderDivider = var11;
      this.messageHeaderSubtitle = var12;
      this.messageHeaderTitle = var13;
      this.messageTagView = var14;
      this.replyPreview = var15;
      this.threadStarterHeader = var16;
      this.timestamp = var17;
   }

   public static AutomodSystemMessageViewBinding bind(View var0) {
      int var1 = R.id.accessories_view;
      MessageAccessoriesView var17 = (MessageAccessoriesView)a.a(var0, var1);
      if (var17 != null) {
         var1 = R.id.author_avatar;
         SimpleDraweeView var14 = (SimpleDraweeView)a.a(var0, var1);
         if (var14 != null) {
            var1 = R.id.author_name;
            TextView var15 = (TextView)a.a(var0, var1);
            if (var15 != null) {
               var1 = R.id.automod_message_channel;
               TextView var16 = (TextView)a.a(var0, var1);
               if (var16 != null) {
                  var1 = R.id.automod_message_context_header;
                  TextView var5 = (TextView)a.a(var0, var1);
                  if (var5 != null) {
                     var1 = R.id.guild_communication_disabled_icon;
                     SimpleDraweeView var4 = (SimpleDraweeView)a.a(var0, var1);
                     if (var4 != null) {
                        var1 = R.id.header_section;
                        Flow var9 = (Flow)a.a(var0, var1);
                        if (var9 != null) {
                           var1 = R.id.message_end_guideline;
                           Guideline var2 = (Guideline)a.a(var0, var1);
                           if (var2 != null) {
                              var1 = R.id.message_header_barrier;
                              Barrier var10 = (Barrier)a.a(var0, var1);
                              if (var10 != null) {
                                 var1 = R.id.message_header_divider;
                                 View var7 = a.a(var0, var1);
                                 if (var7 != null) {
                                    var1 = R.id.message_header_subtitle;
                                    TextView var6 = (TextView)a.a(var0, var1);
                                    if (var6 != null) {
                                       var1 = R.id.message_header_title;
                                       TextView var11 = (TextView)a.a(var0, var1);
                                       if (var11 != null) {
                                          var1 = R.id.message_tag_view;
                                          MessageTagView var13 = (MessageTagView)a.a(var0, var1);
                                          if (var13 != null) {
                                             var1 = R.id.reply_preview;
                                             MessageViewReplyPreview var8 = (MessageViewReplyPreview)a.a(var0, var1);
                                             if (var8 != null) {
                                                var1 = R.id.thread_starter_header;
                                                ThreadStarterMessageHeaderView var12 = (ThreadStarterMessageHeaderView)a.a(var0, var1);
                                                if (var12 != null) {
                                                   var1 = R.id.timestamp;
                                                   TextView var3 = (TextView)a.a(var0, var1);
                                                   if (var3 != null) {
                                                      return new AutomodSystemMessageViewBinding(
                                                         var0,
                                                         var17,
                                                         var14,
                                                         var15,
                                                         var16,
                                                         var5,
                                                         var4,
                                                         var9,
                                                         var2,
                                                         var10,
                                                         var7,
                                                         var6,
                                                         var11,
                                                         var13,
                                                         var8,
                                                         var12,
                                                         var3
                                                      );
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
                  }
               }
            }
         }
      }

      throw new NullPointerException("Missing required view with ID: ".concat(var0.getResources().getResourceName(var1)));
   }

   public static AutomodSystemMessageViewBinding inflate(LayoutInflater var0, ViewGroup var1) {
      if (var1 != null) {
         var0.inflate(R.layout.automod_system_message_view, var1);
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
