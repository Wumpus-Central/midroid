package com.discord.chat.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.constraintlayout.widget.Guideline;
import androidx.viewbinding.ViewBinding;
import com.discord.chat.R;
import com.discord.chat.presentation.message.ConnectionsRoleTagView;
import com.discord.chat.presentation.message.RoleIconView;
import com.discord.chat.presentation.message.view.FlaggedMessageEmbedFooterView;
import com.discord.chat.presentation.message.view.MessageContentView;
import com.facebook.drawee.view.SimpleDraweeView;
import n1.a;

public final class FlaggedMessageEmbedViewBinding implements ViewBinding {
   public final SimpleDraweeView authorAvatar;
   public final TextView authorName;
   public final ConnectionsRoleTagView connectionsRoleTag;
   public final FlaggedMessageEmbedFooterView contentFooterView;
   public final MessageContentView contentView;
   public final SimpleDraweeView guildCommunicationDisabledIcon;
   public final Guideline messageEndGuideline;
   public final Guideline messageStartGuideline;
   public final RoleIconView roleIcon;
   private final View rootView;

   private FlaggedMessageEmbedViewBinding(
      View var1,
      SimpleDraweeView var2,
      TextView var3,
      ConnectionsRoleTagView var4,
      FlaggedMessageEmbedFooterView var5,
      MessageContentView var6,
      SimpleDraweeView var7,
      Guideline var8,
      Guideline var9,
      RoleIconView var10
   ) {
      this.rootView = var1;
      this.authorAvatar = var2;
      this.authorName = var3;
      this.connectionsRoleTag = var4;
      this.contentFooterView = var5;
      this.contentView = var6;
      this.guildCommunicationDisabledIcon = var7;
      this.messageEndGuideline = var8;
      this.messageStartGuideline = var9;
      this.roleIcon = var10;
   }

   public static FlaggedMessageEmbedViewBinding bind(View var0) {
      int var1 = R.id.author_avatar;
      SimpleDraweeView var3 = (SimpleDraweeView)a.a(var0, var1);
      if (var3 != null) {
         var1 = R.id.author_name;
         TextView var6 = (TextView)a.a(var0, var1);
         if (var6 != null) {
            var1 = R.id.connections_role_tag;
            ConnectionsRoleTagView var8 = (ConnectionsRoleTagView)a.a(var0, var1);
            if (var8 != null) {
               var1 = R.id.content_footer_view;
               FlaggedMessageEmbedFooterView var10 = (FlaggedMessageEmbedFooterView)a.a(var0, var1);
               if (var10 != null) {
                  var1 = R.id.content_view;
                  MessageContentView var7 = (MessageContentView)a.a(var0, var1);
                  if (var7 != null) {
                     var1 = R.id.guild_communication_disabled_icon;
                     SimpleDraweeView var2 = (SimpleDraweeView)a.a(var0, var1);
                     if (var2 != null) {
                        var1 = R.id.message_end_guideline;
                        Guideline var4 = (Guideline)a.a(var0, var1);
                        if (var4 != null) {
                           var1 = R.id.message_start_guideline;
                           Guideline var5 = (Guideline)a.a(var0, var1);
                           if (var5 != null) {
                              var1 = R.id.role_icon;
                              RoleIconView var9 = (RoleIconView)a.a(var0, var1);
                              if (var9 != null) {
                                 return new FlaggedMessageEmbedViewBinding(var0, var3, var6, var8, var10, var7, var2, var4, var5, var9);
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

   public static FlaggedMessageEmbedViewBinding inflate(LayoutInflater var0, ViewGroup var1) {
      if (var1 != null) {
         var0.inflate(R.layout.flagged_message_embed_view, var1);
         return bind(var1);
      } else {
         throw new NullPointerException("parent");
      }
   }

   public View getRoot() {
      return this.rootView;
   }
}
