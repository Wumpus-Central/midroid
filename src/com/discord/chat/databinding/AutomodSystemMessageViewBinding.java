package com.discord.chat.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.annotation.NonNull;
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
import x1.a;

public final class AutomodSystemMessageViewBinding implements ViewBinding {
   @NonNull
   public final MessageAccessoriesView accessoriesView;
   @NonNull
   public final SimpleDraweeView authorAvatar;
   @NonNull
   public final TextView authorName;
   @NonNull
   public final TextView automodMessageChannel;
   @NonNull
   public final TextView automodMessageContextHeader;
   @NonNull
   public final SimpleDraweeView guildCommunicationDisabledIcon;
   @NonNull
   public final Flow headerSection;
   @NonNull
   public final Guideline messageEndGuideline;
   @NonNull
   public final Barrier messageHeaderBarrier;
   @NonNull
   public final View messageHeaderDivider;
   @NonNull
   public final TextView messageHeaderSubtitle;
   @NonNull
   public final TextView messageHeaderTitle;
   @NonNull
   public final MessageTagView messageTagView;
   @NonNull
   public final MessageViewReplyPreview replyPreview;
   @NonNull
   private final View rootView;
   @NonNull
   public final ThreadStarterMessageHeaderView threadStarterHeader;
   @NonNull
   public final TextView timestamp;

   private AutomodSystemMessageViewBinding(
      @NonNull View var1,
      @NonNull MessageAccessoriesView var2,
      @NonNull SimpleDraweeView var3,
      @NonNull TextView var4,
      @NonNull TextView var5,
      @NonNull TextView var6,
      @NonNull SimpleDraweeView var7,
      @NonNull Flow var8,
      @NonNull Guideline var9,
      @NonNull Barrier var10,
      @NonNull View var11,
      @NonNull TextView var12,
      @NonNull TextView var13,
      @NonNull MessageTagView var14,
      @NonNull MessageViewReplyPreview var15,
      @NonNull ThreadStarterMessageHeaderView var16,
      @NonNull TextView var17
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

   @NonNull
   public static AutomodSystemMessageViewBinding bind(@NonNull View var0) {
      int var1 = R.id.accessories_view;
      MessageAccessoriesView var6 = (MessageAccessoriesView)a.a(var0, var1);
      if (var6 != null) {
         var1 = R.id.author_avatar;
         SimpleDraweeView var5 = (SimpleDraweeView)a.a(var0, var1);
         if (var5 != null) {
            var1 = R.id.author_name;
            TextView var2 = (TextView)a.a(var0, var1);
            if (var2 != null) {
               var1 = R.id.automod_message_channel;
               TextView var15 = (TextView)a.a(var0, var1);
               if (var15 != null) {
                  var1 = R.id.automod_message_context_header;
                  TextView var17 = (TextView)a.a(var0, var1);
                  if (var17 != null) {
                     var1 = R.id.guild_communication_disabled_icon;
                     SimpleDraweeView var12 = (SimpleDraweeView)a.a(var0, var1);
                     if (var12 != null) {
                        var1 = R.id.header_section;
                        Flow var8 = (Flow)a.a(var0, var1);
                        if (var8 != null) {
                           var1 = R.id.message_end_guideline;
                           Guideline var16 = (Guideline)a.a(var0, var1);
                           if (var16 != null) {
                              var1 = R.id.message_header_barrier;
                              Barrier var14 = (Barrier)a.a(var0, var1);
                              if (var14 != null) {
                                 var1 = R.id.message_header_divider;
                                 View var10 = a.a(var0, var1);
                                 if (var10 != null) {
                                    var1 = R.id.message_header_subtitle;
                                    TextView var9 = (TextView)a.a(var0, var1);
                                    if (var9 != null) {
                                       var1 = R.id.message_header_title;
                                       TextView var7 = (TextView)a.a(var0, var1);
                                       if (var7 != null) {
                                          var1 = R.id.message_tag_view;
                                          MessageTagView var11 = (MessageTagView)a.a(var0, var1);
                                          if (var11 != null) {
                                             var1 = R.id.reply_preview;
                                             MessageViewReplyPreview var3 = (MessageViewReplyPreview)a.a(var0, var1);
                                             if (var3 != null) {
                                                var1 = R.id.thread_starter_header;
                                                ThreadStarterMessageHeaderView var4 = (ThreadStarterMessageHeaderView)a.a(var0, var1);
                                                if (var4 != null) {
                                                   var1 = R.id.timestamp;
                                                   TextView var13 = (TextView)a.a(var0, var1);
                                                   if (var13 != null) {
                                                      return new AutomodSystemMessageViewBinding(
                                                         var0,
                                                         var6,
                                                         var5,
                                                         var2,
                                                         var15,
                                                         var17,
                                                         var12,
                                                         var8,
                                                         var16,
                                                         var14,
                                                         var10,
                                                         var9,
                                                         var7,
                                                         var11,
                                                         var3,
                                                         var4,
                                                         var13
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

   @NonNull
   public static AutomodSystemMessageViewBinding inflate(@NonNull LayoutInflater var0, @NonNull ViewGroup var1) {
      if (var1 != null) {
         var0.inflate(R.layout.automod_system_message_view, var1);
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
