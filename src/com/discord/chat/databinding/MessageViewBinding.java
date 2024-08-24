package com.discord.chat.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.constraintlayout.widget.Barrier;
import androidx.constraintlayout.widget.Guideline;
import androidx.viewbinding.ViewBinding;
import com.discord.chat.R;
import com.discord.chat.presentation.list.MaskedShadowView;
import com.discord.chat.presentation.message.ClanTagChipletView;
import com.discord.chat.presentation.message.ConnectionsRoleTagView;
import com.discord.chat.presentation.message.MessageAccessoriesView;
import com.discord.chat.presentation.message.MessageAltRemixTagView;
import com.discord.chat.presentation.message.MessageFrameHeaderView;
import com.discord.chat.presentation.message.MessageHighlightHeader;
import com.discord.chat.presentation.message.MessageTagView;
import com.discord.chat.presentation.message.MessageViewReplyPreview;
import com.discord.chat.presentation.message.RoleDotView;
import com.discord.chat.presentation.message.RoleIconView;
import com.discord.chat.presentation.message.ThreadStarterMessageHeaderView;
import com.facebook.drawee.view.SimpleDraweeView;
import n1.a;

public final class MessageViewBinding implements ViewBinding {
   public final MessageAccessoriesView accessoriesView;
   public final SimpleDraweeView authorAvatar;
   public final SimpleDraweeView authorAvatarDecoration;
   public final TextView authorName;
   public final ClanTagChipletView clanTagChiplet;
   public final ConnectionsRoleTagView connectionsRoleTag;
   public final SimpleDraweeView guildCommunicationDisabledIcon;
   public final MessageHighlightHeader highlightHeader;
   public final MessageAltRemixTagView messageAltRemixTagView;
   public final Guideline messageEndGuideline;
   public final MessageFrameHeaderView messageFrameHeader;
   public final Barrier messageHeaderBarrier;
   public final View messageHeaderDivider;
   public final MessageTagView messageTagView;
   public final MessageViewReplyPreview replyPreview;
   public final RoleDotView roleDot;
   public final RoleIconView roleIcon;
   private final View rootView;
   public final MaskedShadowView shadowView;
   public final SimpleDraweeView suppressNotificationsIcon;
   public final ThreadStarterMessageHeaderView threadStarterHeader;
   public final TextView timestamp;

   private MessageViewBinding(
      View var1,
      MessageAccessoriesView var2,
      SimpleDraweeView var3,
      SimpleDraweeView var4,
      TextView var5,
      ClanTagChipletView var6,
      ConnectionsRoleTagView var7,
      SimpleDraweeView var8,
      MessageHighlightHeader var9,
      MessageAltRemixTagView var10,
      Guideline var11,
      MessageFrameHeaderView var12,
      Barrier var13,
      View var14,
      MessageTagView var15,
      MessageViewReplyPreview var16,
      RoleDotView var17,
      RoleIconView var18,
      MaskedShadowView var19,
      SimpleDraweeView var20,
      ThreadStarterMessageHeaderView var21,
      TextView var22
   ) {
      this.rootView = var1;
      this.accessoriesView = var2;
      this.authorAvatar = var3;
      this.authorAvatarDecoration = var4;
      this.authorName = var5;
      this.clanTagChiplet = var6;
      this.connectionsRoleTag = var7;
      this.guildCommunicationDisabledIcon = var8;
      this.highlightHeader = var9;
      this.messageAltRemixTagView = var10;
      this.messageEndGuideline = var11;
      this.messageFrameHeader = var12;
      this.messageHeaderBarrier = var13;
      this.messageHeaderDivider = var14;
      this.messageTagView = var15;
      this.replyPreview = var16;
      this.roleDot = var17;
      this.roleIcon = var18;
      this.shadowView = var19;
      this.suppressNotificationsIcon = var20;
      this.threadStarterHeader = var21;
      this.timestamp = var22;
   }

   public static MessageViewBinding bind(View var0) {
      int var1 = R.id.accessories_view;
      MessageAccessoriesView var11 = (MessageAccessoriesView)a.a(var0, var1);
      if (var11 != null) {
         var1 = R.id.author_avatar;
         SimpleDraweeView var2 = (SimpleDraweeView)a.a(var0, var1);
         if (var2 != null) {
            var1 = R.id.author_avatar_decoration;
            SimpleDraweeView var17 = (SimpleDraweeView)a.a(var0, var1);
            if (var17 != null) {
               var1 = R.id.author_name;
               TextView var7 = (TextView)a.a(var0, var1);
               if (var7 != null) {
                  var1 = R.id.clan_tag_chiplet;
                  ClanTagChipletView var6 = (ClanTagChipletView)a.a(var0, var1);
                  if (var6 != null) {
                     var1 = R.id.connections_role_tag;
                     ConnectionsRoleTagView var13 = (ConnectionsRoleTagView)a.a(var0, var1);
                     if (var13 != null) {
                        var1 = R.id.guild_communication_disabled_icon;
                        SimpleDraweeView var21 = (SimpleDraweeView)a.a(var0, var1);
                        if (var21 != null) {
                           var1 = R.id.highlight_header;
                           MessageHighlightHeader var22 = (MessageHighlightHeader)a.a(var0, var1);
                           if (var22 != null) {
                              var1 = R.id.message_alt_remix_tag_view;
                              MessageAltRemixTagView var15 = (MessageAltRemixTagView)a.a(var0, var1);
                              if (var15 != null) {
                                 var1 = R.id.message_end_guideline;
                                 Guideline var16 = (Guideline)a.a(var0, var1);
                                 if (var16 != null) {
                                    var1 = R.id.message_frame_header;
                                    MessageFrameHeaderView var3 = (MessageFrameHeaderView)a.a(var0, var1);
                                    if (var3 != null) {
                                       var1 = R.id.message_header_barrier;
                                       Barrier var20 = (Barrier)a.a(var0, var1);
                                       if (var20 != null) {
                                          var1 = R.id.message_header_divider;
                                          View var4 = a.a(var0, var1);
                                          if (var4 != null) {
                                             var1 = R.id.message_tag_view;
                                             MessageTagView var10 = (MessageTagView)a.a(var0, var1);
                                             if (var10 != null) {
                                                var1 = R.id.reply_preview;
                                                MessageViewReplyPreview var8 = (MessageViewReplyPreview)a.a(var0, var1);
                                                if (var8 != null) {
                                                   var1 = R.id.role_dot;
                                                   RoleDotView var14 = (RoleDotView)a.a(var0, var1);
                                                   if (var14 != null) {
                                                      var1 = R.id.role_icon;
                                                      RoleIconView var12 = (RoleIconView)a.a(var0, var1);
                                                      if (var12 != null) {
                                                         var1 = R.id.shadow_view;
                                                         MaskedShadowView var9 = (MaskedShadowView)a.a(var0, var1);
                                                         if (var9 != null) {
                                                            var1 = R.id.suppress_notifications_icon;
                                                            SimpleDraweeView var5 = (SimpleDraweeView)a.a(var0, var1);
                                                            if (var5 != null) {
                                                               var1 = R.id.thread_starter_header;
                                                               ThreadStarterMessageHeaderView var19 = (ThreadStarterMessageHeaderView)a.a(var0, var1);
                                                               if (var19 != null) {
                                                                  var1 = R.id.timestamp;
                                                                  TextView var18 = (TextView)a.a(var0, var1);
                                                                  if (var18 != null) {
                                                                     return new MessageViewBinding(
                                                                        var0,
                                                                        var11,
                                                                        var2,
                                                                        var17,
                                                                        var7,
                                                                        var6,
                                                                        var13,
                                                                        var21,
                                                                        var22,
                                                                        var15,
                                                                        var16,
                                                                        var3,
                                                                        var20,
                                                                        var4,
                                                                        var10,
                                                                        var8,
                                                                        var14,
                                                                        var12,
                                                                        var9,
                                                                        var5,
                                                                        var19,
                                                                        var18
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
                  }
               }
            }
         }
      }

      throw new NullPointerException("Missing required view with ID: ".concat(var0.getResources().getResourceName(var1)));
   }

   public static MessageViewBinding inflate(LayoutInflater var0, ViewGroup var1) {
      if (var1 != null) {
         var0.inflate(R.layout.message_view, var1);
         return bind(var1);
      } else {
         throw new NullPointerException("parent");
      }
   }

   public View getRoot() {
      return this.rootView;
   }
}
