package com.discord.chat.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewStub;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.constraintlayout.widget.Barrier;
import androidx.viewbinding.ViewBinding;
import com.discord.chat.R;
import com.discord.chat.presentation.list.MaskedShadowView;
import com.discord.chat.presentation.message.ClanTagChipletView;
import com.discord.chat.presentation.message.ConnectionsRoleTagView;
import com.discord.chat.presentation.message.GameIconView;
import com.discord.chat.presentation.message.MessageAccessoriesView;
import com.discord.chat.presentation.message.MessageFrameHeaderView;
import com.discord.chat.presentation.message.MessageTagView;
import com.discord.chat.presentation.message.RoleDotView;
import com.discord.chat.presentation.message.RoleIconView;
import com.facebook.drawee.view.SimpleDraweeView;

public final class MessageViewBinding implements ViewBinding {
   @NonNull
   public final MessageAccessoriesView accessoriesView;
   @NonNull
   public final SimpleDraweeView authorAvatar;
   @NonNull
   public final SimpleDraweeView authorAvatarDecoration;
   @NonNull
   public final TextView authorName;
   @NonNull
   public final ClanTagChipletView clanTagChiplet;
   @NonNull
   public final ConnectionsRoleTagView connectionsRoleTag;
   @NonNull
   public final GameIconView gameIcon;
   @NonNull
   public final SimpleDraweeView guildCommunicationDisabledIcon;
   @NonNull
   public final LinearLayout header;
   @NonNull
   public final MessageFrameHeaderView messageFrameHeader;
   @NonNull
   public final Barrier messageHeaderBarrier;
   @NonNull
   public final View messageHeaderDivider;
   @NonNull
   public final MessageTagView messageTagView;
   @NonNull
   public final ViewStub replyPreviewView;
   @NonNull
   public final RoleDotView roleDot;
   @NonNull
   public final RoleIconView roleIcon;
   @NonNull
   private final View rootView;
   @NonNull
   public final MaskedShadowView shadowView;
   @NonNull
   public final SimpleDraweeView suppressNotificationsIcon;
   @NonNull
   public final ViewStub threadStarterHeaderView;
   @NonNull
   public final TextView timestamp;

   private MessageViewBinding(
      @NonNull View var1,
      @NonNull MessageAccessoriesView var2,
      @NonNull SimpleDraweeView var3,
      @NonNull SimpleDraweeView var4,
      @NonNull TextView var5,
      @NonNull ClanTagChipletView var6,
      @NonNull ConnectionsRoleTagView var7,
      @NonNull GameIconView var8,
      @NonNull SimpleDraweeView var9,
      @NonNull LinearLayout var10,
      @NonNull MessageFrameHeaderView var11,
      @NonNull Barrier var12,
      @NonNull View var13,
      @NonNull MessageTagView var14,
      @NonNull ViewStub var15,
      @NonNull RoleDotView var16,
      @NonNull RoleIconView var17,
      @NonNull MaskedShadowView var18,
      @NonNull SimpleDraweeView var19,
      @NonNull ViewStub var20,
      @NonNull TextView var21
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
      this.messageFrameHeader = var11;
      this.messageHeaderBarrier = var12;
      this.messageHeaderDivider = var13;
      this.messageTagView = var14;
      this.replyPreviewView = var15;
      this.roleDot = var16;
      this.roleIcon = var17;
      this.shadowView = var18;
      this.suppressNotificationsIcon = var19;
      this.threadStarterHeaderView = var20;
      this.timestamp = var21;
   }

   @NonNull
   public static MessageViewBinding bind(@NonNull View var0) {
      int var1 = R.id.accessories_view;
      MessageAccessoriesView var10 = (MessageAccessoriesView)k5.a.a(var0, var1);
      if (var10 != null) {
         var1 = R.id.author_avatar;
         SimpleDraweeView var9 = (SimpleDraweeView)k5.a.a(var0, var1);
         if (var9 != null) {
            var1 = R.id.author_avatar_decoration;
            SimpleDraweeView var13 = (SimpleDraweeView)k5.a.a(var0, var1);
            if (var13 != null) {
               var1 = R.id.author_name;
               TextView var11 = (TextView)k5.a.a(var0, var1);
               if (var11 != null) {
                  var1 = R.id.clan_tag_chiplet;
                  ClanTagChipletView var14 = (ClanTagChipletView)k5.a.a(var0, var1);
                  if (var14 != null) {
                     var1 = R.id.connections_role_tag;
                     ConnectionsRoleTagView var3 = (ConnectionsRoleTagView)k5.a.a(var0, var1);
                     if (var3 != null) {
                        var1 = R.id.game_icon;
                        GameIconView var2 = (GameIconView)k5.a.a(var0, var1);
                        if (var2 != null) {
                           var1 = R.id.guild_communication_disabled_icon;
                           SimpleDraweeView var8 = (SimpleDraweeView)k5.a.a(var0, var1);
                           if (var8 != null) {
                              var1 = R.id.header;
                              LinearLayout var18 = (LinearLayout)k5.a.a(var0, var1);
                              if (var18 != null) {
                                 var1 = R.id.message_frame_header;
                                 MessageFrameHeaderView var5 = (MessageFrameHeaderView)k5.a.a(var0, var1);
                                 if (var5 != null) {
                                    var1 = R.id.message_header_barrier;
                                    Barrier var12 = (Barrier)k5.a.a(var0, var1);
                                    if (var12 != null) {
                                       var1 = R.id.message_header_divider;
                                       View var19 = k5.a.a(var0, var1);
                                       if (var19 != null) {
                                          var1 = R.id.message_tag_view;
                                          MessageTagView var21 = (MessageTagView)k5.a.a(var0, var1);
                                          if (var21 != null) {
                                             var1 = R.id.reply_preview_view;
                                             ViewStub var17 = (ViewStub)k5.a.a(var0, var1);
                                             if (var17 != null) {
                                                var1 = R.id.role_dot;
                                                RoleDotView var20 = (RoleDotView)k5.a.a(var0, var1);
                                                if (var20 != null) {
                                                   var1 = R.id.role_icon;
                                                   RoleIconView var4 = (RoleIconView)k5.a.a(var0, var1);
                                                   if (var4 != null) {
                                                      var1 = R.id.shadow_view;
                                                      MaskedShadowView var6 = (MaskedShadowView)k5.a.a(var0, var1);
                                                      if (var6 != null) {
                                                         var1 = R.id.suppress_notifications_icon;
                                                         SimpleDraweeView var16 = (SimpleDraweeView)k5.a.a(var0, var1);
                                                         if (var16 != null) {
                                                            var1 = R.id.thread_starter_header_view;
                                                            ViewStub var7 = (ViewStub)k5.a.a(var0, var1);
                                                            if (var7 != null) {
                                                               var1 = R.id.timestamp;
                                                               TextView var15 = (TextView)k5.a.a(var0, var1);
                                                               if (var15 != null) {
                                                                  return new MessageViewBinding(
                                                                     var0,
                                                                     var10,
                                                                     var9,
                                                                     var13,
                                                                     var11,
                                                                     var14,
                                                                     var3,
                                                                     var2,
                                                                     var8,
                                                                     var18,
                                                                     var5,
                                                                     var12,
                                                                     var19,
                                                                     var21,
                                                                     var17,
                                                                     var20,
                                                                     var4,
                                                                     var6,
                                                                     var16,
                                                                     var7,
                                                                     var15
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

      throw new NullPointerException("Missing required view with ID: ".concat(var0.getResources().getResourceName(var1)));
   }

   @NonNull
   public static MessageViewBinding inflate(@NonNull LayoutInflater var0, @NonNull ViewGroup var1) {
      if (var1 != null) {
         var0.inflate(R.layout.message_view, var1);
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
