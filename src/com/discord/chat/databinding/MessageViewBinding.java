package com.discord.chat.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewStub;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.constraintlayout.widget.Barrier;
import androidx.viewbinding.ViewBinding;
import com.discord.chat.R;
import com.discord.chat.presentation.list.MaskedShadowView;
import com.discord.chat.presentation.message.ClanTagChipletView;
import com.discord.chat.presentation.message.ConnectionsRoleTagView;
import com.discord.chat.presentation.message.GameIconView;
import com.discord.chat.presentation.message.MessageAccessoriesView;
import com.discord.chat.presentation.message.MessageAltRemixTagView;
import com.discord.chat.presentation.message.MessageFrameHeaderView;
import com.discord.chat.presentation.message.MessageTagView;
import com.discord.chat.presentation.message.RoleDotView;
import com.discord.chat.presentation.message.RoleIconView;
import com.facebook.drawee.view.SimpleDraweeView;
import o1.a;

public final class MessageViewBinding implements ViewBinding {
   public final MessageAccessoriesView accessoriesView;
   public final SimpleDraweeView authorAvatar;
   public final SimpleDraweeView authorAvatarDecoration;
   public final TextView authorName;
   public final ClanTagChipletView clanTagChiplet;
   public final ConnectionsRoleTagView connectionsRoleTag;
   public final GameIconView gameIcon;
   public final SimpleDraweeView guildCommunicationDisabledIcon;
   public final LinearLayout header;
   public final ViewStub highlightHeaderView;
   public final MessageAltRemixTagView messageAltRemixTagView;
   public final MessageFrameHeaderView messageFrameHeader;
   public final Barrier messageHeaderBarrier;
   public final View messageHeaderDivider;
   public final MessageTagView messageTagView;
   public final ViewStub replyPreviewView;
   public final RoleDotView roleDot;
   public final RoleIconView roleIcon;
   private final View rootView;
   public final MaskedShadowView shadowView;
   public final SimpleDraweeView suppressNotificationsIcon;
   public final ViewStub threadStarterHeaderView;
   public final TextView timestamp;

   private MessageViewBinding(
      View var1,
      MessageAccessoriesView var2,
      SimpleDraweeView var3,
      SimpleDraweeView var4,
      TextView var5,
      ClanTagChipletView var6,
      ConnectionsRoleTagView var7,
      GameIconView var8,
      SimpleDraweeView var9,
      LinearLayout var10,
      ViewStub var11,
      MessageAltRemixTagView var12,
      MessageFrameHeaderView var13,
      Barrier var14,
      View var15,
      MessageTagView var16,
      ViewStub var17,
      RoleDotView var18,
      RoleIconView var19,
      MaskedShadowView var20,
      SimpleDraweeView var21,
      ViewStub var22,
      TextView var23
   ) {
      this.rootView = var1;
      this.accessoriesView = var2;
      this.authorAvatar = var3;
      this.authorAvatarDecoration = var4;
      this.authorName = var5;
      this.clanTagChiplet = var6;
      this.connectionsRoleTag = var7;
      this.gameIcon = var8;
      this.guildCommunicationDisabledIcon = var9;
      this.header = var10;
      this.highlightHeaderView = var11;
      this.messageAltRemixTagView = var12;
      this.messageFrameHeader = var13;
      this.messageHeaderBarrier = var14;
      this.messageHeaderDivider = var15;
      this.messageTagView = var16;
      this.replyPreviewView = var17;
      this.roleDot = var18;
      this.roleIcon = var19;
      this.shadowView = var20;
      this.suppressNotificationsIcon = var21;
      this.threadStarterHeaderView = var22;
      this.timestamp = var23;
   }

   public static MessageViewBinding bind(View var0) {
      int var1 = R.id.accessories_view;
      MessageAccessoriesView var9 = (MessageAccessoriesView)a.a(var0, var1);
      if (var9 != null) {
         var1 = R.id.author_avatar;
         SimpleDraweeView var15 = (SimpleDraweeView)a.a(var0, var1);
         if (var15 != null) {
            var1 = R.id.author_avatar_decoration;
            SimpleDraweeView var2 = (SimpleDraweeView)a.a(var0, var1);
            if (var2 != null) {
               var1 = R.id.author_name;
               TextView var4 = (TextView)a.a(var0, var1);
               if (var4 != null) {
                  var1 = R.id.clan_tag_chiplet;
                  ClanTagChipletView var6 = (ClanTagChipletView)a.a(var0, var1);
                  if (var6 != null) {
                     var1 = R.id.connections_role_tag;
                     ConnectionsRoleTagView var20 = (ConnectionsRoleTagView)a.a(var0, var1);
                     if (var20 != null) {
                        var1 = R.id.game_icon;
                        GameIconView var16 = (GameIconView)a.a(var0, var1);
                        if (var16 != null) {
                           var1 = R.id.guild_communication_disabled_icon;
                           SimpleDraweeView var19 = (SimpleDraweeView)a.a(var0, var1);
                           if (var19 != null) {
                              var1 = R.id.header;
                              LinearLayout var13 = (LinearLayout)a.a(var0, var1);
                              if (var13 != null) {
                                 var1 = R.id.highlight_header_view;
                                 ViewStub var12 = (ViewStub)a.a(var0, var1);
                                 if (var12 != null) {
                                    var1 = R.id.message_alt_remix_tag_view;
                                    MessageAltRemixTagView var14 = (MessageAltRemixTagView)a.a(var0, var1);
                                    if (var14 != null) {
                                       var1 = R.id.message_frame_header;
                                       MessageFrameHeaderView var7 = (MessageFrameHeaderView)a.a(var0, var1);
                                       if (var7 != null) {
                                          var1 = R.id.message_header_barrier;
                                          Barrier var23 = (Barrier)a.a(var0, var1);
                                          if (var23 != null) {
                                             var1 = R.id.message_header_divider;
                                             View var5 = a.a(var0, var1);
                                             if (var5 != null) {
                                                var1 = R.id.message_tag_view;
                                                MessageTagView var22 = (MessageTagView)a.a(var0, var1);
                                                if (var22 != null) {
                                                   var1 = R.id.reply_preview_view;
                                                   ViewStub var8 = (ViewStub)a.a(var0, var1);
                                                   if (var8 != null) {
                                                      var1 = R.id.role_dot;
                                                      RoleDotView var10 = (RoleDotView)a.a(var0, var1);
                                                      if (var10 != null) {
                                                         var1 = R.id.role_icon;
                                                         RoleIconView var21 = (RoleIconView)a.a(var0, var1);
                                                         if (var21 != null) {
                                                            var1 = R.id.shadow_view;
                                                            MaskedShadowView var11 = (MaskedShadowView)a.a(var0, var1);
                                                            if (var11 != null) {
                                                               var1 = R.id.suppress_notifications_icon;
                                                               SimpleDraweeView var3 = (SimpleDraweeView)a.a(var0, var1);
                                                               if (var3 != null) {
                                                                  var1 = R.id.thread_starter_header_view;
                                                                  ViewStub var17 = (ViewStub)a.a(var0, var1);
                                                                  if (var17 != null) {
                                                                     var1 = R.id.timestamp;
                                                                     TextView var18 = (TextView)a.a(var0, var1);
                                                                     if (var18 != null) {
                                                                        return new MessageViewBinding(
                                                                           var0,
                                                                           var9,
                                                                           var15,
                                                                           var2,
                                                                           var4,
                                                                           var6,
                                                                           var20,
                                                                           var16,
                                                                           var19,
                                                                           var13,
                                                                           var12,
                                                                           var14,
                                                                           var7,
                                                                           var23,
                                                                           var5,
                                                                           var22,
                                                                           var8,
                                                                           var10,
                                                                           var21,
                                                                           var11,
                                                                           var3,
                                                                           var17,
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

   @Override
   public View getRoot() {
      return this.rootView;
   }
}
