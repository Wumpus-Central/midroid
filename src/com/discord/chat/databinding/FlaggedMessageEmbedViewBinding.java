package com.discord.chat.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.constraintlayout.widget.Guideline;
import androidx.viewbinding.ViewBinding;
import com.discord.chat.R;
import com.discord.chat.presentation.message.ConnectionsRoleTagView;
import com.discord.chat.presentation.message.RoleIconView;
import com.discord.chat.presentation.message.view.FlaggedMessageEmbedFooterView;
import com.discord.chat.presentation.message.view.MessageContentView;
import com.facebook.drawee.view.SimpleDraweeView;
import y0.a;

public final class FlaggedMessageEmbedViewBinding implements ViewBinding {
   @NonNull
   public final SimpleDraweeView authorAvatar;
   @NonNull
   public final TextView authorName;
   @NonNull
   public final ConnectionsRoleTagView connectionsRoleTag;
   @NonNull
   public final FlaggedMessageEmbedFooterView contentFooterView;
   @NonNull
   public final MessageContentView contentView;
   @NonNull
   public final SimpleDraweeView guildCommunicationDisabledIcon;
   @NonNull
   public final Guideline messageEndGuideline;
   @NonNull
   public final Guideline messageStartGuideline;
   @NonNull
   public final RoleIconView roleIcon;
   @NonNull
   private final View rootView;

   private FlaggedMessageEmbedViewBinding(
      @NonNull View var1,
      @NonNull SimpleDraweeView var2,
      @NonNull TextView var3,
      @NonNull ConnectionsRoleTagView var4,
      @NonNull FlaggedMessageEmbedFooterView var5,
      @NonNull MessageContentView var6,
      @NonNull SimpleDraweeView var7,
      @NonNull Guideline var8,
      @NonNull Guideline var9,
      @NonNull RoleIconView var10
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

   @NonNull
   public static FlaggedMessageEmbedViewBinding bind(@NonNull View var0) {
      int var1 = R.id.author_avatar;
      SimpleDraweeView var4 = (SimpleDraweeView)a.a(var0, var1);
      if (var4 != null) {
         var1 = R.id.author_name;
         TextView var8 = (TextView)a.a(var0, var1);
         if (var8 != null) {
            var1 = R.id.connections_role_tag;
            ConnectionsRoleTagView var3 = (ConnectionsRoleTagView)a.a(var0, var1);
            if (var3 != null) {
               var1 = R.id.content_footer_view;
               FlaggedMessageEmbedFooterView var5 = (FlaggedMessageEmbedFooterView)a.a(var0, var1);
               if (var5 != null) {
                  var1 = R.id.content_view;
                  MessageContentView var7 = (MessageContentView)a.a(var0, var1);
                  if (var7 != null) {
                     var1 = R.id.guild_communication_disabled_icon;
                     SimpleDraweeView var2 = (SimpleDraweeView)a.a(var0, var1);
                     if (var2 != null) {
                        var1 = R.id.message_end_guideline;
                        Guideline var6 = (Guideline)a.a(var0, var1);
                        if (var6 != null) {
                           var1 = R.id.message_start_guideline;
                           Guideline var10 = (Guideline)a.a(var0, var1);
                           if (var10 != null) {
                              var1 = R.id.role_icon;
                              RoleIconView var9 = (RoleIconView)a.a(var0, var1);
                              if (var9 != null) {
                                 return new FlaggedMessageEmbedViewBinding(var0, var4, var8, var3, var5, var7, var2, var6, var10, var9);
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
   public static FlaggedMessageEmbedViewBinding inflate(@NonNull LayoutInflater var0, @NonNull ViewGroup var1) {
      if (var1 != null) {
         var0.inflate(R.layout.flagged_message_embed_view, var1);
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
