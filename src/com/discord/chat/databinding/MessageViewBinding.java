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
import com.discord.chat.presentation.message.MessageAltRemixTagView;
import com.discord.chat.presentation.message.MessageFrameHeaderView;
import com.discord.chat.presentation.message.MessageTagView;
import com.discord.chat.presentation.message.RoleDotView;
import com.discord.chat.presentation.message.RoleIconView;
import com.facebook.drawee.view.SimpleDraweeView;
import y0.a;

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
   public final MessageAltRemixTagView messageAltRemixTagView;
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
      @NonNull MessageAltRemixTagView var11,
      @NonNull MessageFrameHeaderView var12,
      @NonNull Barrier var13,
      @NonNull View var14,
      @NonNull MessageTagView var15,
      @NonNull ViewStub var16,
      @NonNull RoleDotView var17,
      @NonNull RoleIconView var18,
      @NonNull MaskedShadowView var19,
      @NonNull SimpleDraweeView var20,
      @NonNull ViewStub var21,
      @NonNull TextView var22
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
      this.messageAltRemixTagView = var11;
      this.messageFrameHeader = var12;
      this.messageHeaderBarrier = var13;
      this.messageHeaderDivider = var14;
      this.messageTagView = var15;
      this.replyPreviewView = var16;
      this.roleDot = var17;
      this.roleIcon = var18;
      this.shadowView = var19;
      this.suppressNotificationsIcon = var20;
      this.threadStarterHeaderView = var21;
      this.timestamp = var22;
   }

   @NonNull
   public static MessageViewBinding bind(@NonNull View var0) {
      int var1 = R.id.accessories_view;
      MessageAccessoriesView var19 = (MessageAccessoriesView)a.a(var0, var1);
      if (var19 != null) {
         var1 = R.id.author_avatar;
         SimpleDraweeView var20 = (SimpleDraweeView)a.a(var0, var1);
         if (var20 != null) {
            var1 = R.id.author_avatar_decoration;
            SimpleDraweeView var21 = (SimpleDraweeView)a.a(var0, var1);
            if (var21 != null) {
               var1 = R.id.author_name;
               TextView var18 = (TextView)a.a(var0, var1);
               if (var18 != null) {
                  var1 = R.id.clan_tag_chiplet;
                  ClanTagChipletView var6 = (ClanTagChipletView)a.a(var0, var1);
                  if (var6 != null) {
                     var1 = R.id.connections_role_tag;
                     ConnectionsRoleTagView var13 = (ConnectionsRoleTagView)a.a(var0, var1);
                     if (var13 != null) {
                        var1 = R.id.game_icon;
                        GameIconView var14 = (GameIconView)a.a(var0, var1);
                        if (var14 != null) {
                           var1 = R.id.guild_communication_disabled_icon;
                           SimpleDraweeView var8 = (SimpleDraweeView)a.a(var0, var1);
                           if (var8 != null) {
                              var1 = R.id.header;
                              LinearLayout var15 = (LinearLayout)a.a(var0, var1);
                              if (var15 != null) {
                                 var1 = R.id.message_alt_remix_tag_view;
                                 MessageAltRemixTagView var5 = (MessageAltRemixTagView)a.a(var0, var1);
                                 if (var5 != null) {
                                    var1 = R.id.message_frame_header;
                                    MessageFrameHeaderView var12 = (MessageFrameHeaderView)a.a(var0, var1);
                                    if (var12 != null) {
                                       var1 = R.id.message_header_barrier;
                                       Barrier var2 = (Barrier)a.a(var0, var1);
                                       if (var2 != null) {
                                          var1 = R.id.message_header_divider;
                                          View var7 = a.a(var0, var1);
                                          if (var7 != null) {
                                             var1 = R.id.message_tag_view;
                                             MessageTagView var16 = (MessageTagView)a.a(var0, var1);
                                             if (var16 != null) {
                                                var1 = R.id.reply_preview_view;
                                                ViewStub var4 = (ViewStub)a.a(var0, var1);
                                                if (var4 != null) {
                                                   var1 = R.id.role_dot;
                                                   RoleDotView var22 = (RoleDotView)a.a(var0, var1);
                                                   if (var22 != null) {
                                                      var1 = R.id.role_icon;
                                                      RoleIconView var9 = (RoleIconView)a.a(var0, var1);
                                                      if (var9 != null) {
                                                         var1 = R.id.shadow_view;
                                                         MaskedShadowView var11 = (MaskedShadowView)a.a(var0, var1);
                                                         if (var11 != null) {
                                                            var1 = R.id.suppress_notifications_icon;
                                                            SimpleDraweeView var10 = (SimpleDraweeView)a.a(var0, var1);
                                                            if (var10 != null) {
                                                               var1 = R.id.thread_starter_header_view;
                                                               ViewStub var17 = (ViewStub)a.a(var0, var1);
                                                               if (var17 != null) {
                                                                  var1 = R.id.timestamp;
                                                                  TextView var3 = (TextView)a.a(var0, var1);
                                                                  if (var3 != null) {
                                                                     return new MessageViewBinding(
                                                                        var0,
                                                                        var19,
                                                                        var20,
                                                                        var21,
                                                                        var18,
                                                                        var6,
                                                                        var13,
                                                                        var14,
                                                                        var8,
                                                                        var15,
                                                                        var5,
                                                                        var12,
                                                                        var2,
                                                                        var7,
                                                                        var16,
                                                                        var4,
                                                                        var22,
                                                                        var9,
                                                                        var11,
                                                                        var10,
                                                                        var17,
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
