package com.discord.chat.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.viewbinding.ViewBinding;
import com.discord.chat.R;
import com.discord.chat.presentation.message.view.botuikit.components.ContentInventoryComponentView;
import com.facebook.drawee.view.SimpleDraweeView;
import n1.a;

public final class MessageComponentContentInventoryViewBinding implements ViewBinding {
   public final SimpleDraweeView contentInventoryComponentAvatarImage;
   public final SimpleDraweeView contentInventoryComponentBadgeIcon;
   public final SimpleDraweeView contentInventoryComponentMediaImage;
   public final SimpleDraweeView contentInventoryComponentPlatformIcon;
   public final TextView contentInventoryComponentSubtitle;
   public final TextView contentInventoryComponentTitle;
   public final TextView contentInventoryComponentUsername;
   private final ContentInventoryComponentView rootView;

   private MessageComponentContentInventoryViewBinding(
      ContentInventoryComponentView var1,
      SimpleDraweeView var2,
      SimpleDraweeView var3,
      SimpleDraweeView var4,
      SimpleDraweeView var5,
      TextView var6,
      TextView var7,
      TextView var8
   ) {
      this.rootView = var1;
      this.contentInventoryComponentAvatarImage = var2;
      this.contentInventoryComponentBadgeIcon = var3;
      this.contentInventoryComponentMediaImage = var4;
      this.contentInventoryComponentPlatformIcon = var5;
      this.contentInventoryComponentSubtitle = var6;
      this.contentInventoryComponentTitle = var7;
      this.contentInventoryComponentUsername = var8;
   }

   public static MessageComponentContentInventoryViewBinding bind(View var0) {
      int var1 = R.id.content_inventory_component_avatar_image;
      SimpleDraweeView var8 = (SimpleDraweeView)a.a(var0, var1);
      if (var8 != null) {
         var1 = R.id.content_inventory_component_badge_icon;
         SimpleDraweeView var6 = (SimpleDraweeView)a.a(var0, var1);
         if (var6 != null) {
            var1 = R.id.content_inventory_component_media_image;
            SimpleDraweeView var2 = (SimpleDraweeView)a.a(var0, var1);
            if (var2 != null) {
               var1 = R.id.content_inventory_component_platform_icon;
               SimpleDraweeView var3 = (SimpleDraweeView)a.a(var0, var1);
               if (var3 != null) {
                  var1 = R.id.content_inventory_component_subtitle;
                  TextView var4 = (TextView)a.a(var0, var1);
                  if (var4 != null) {
                     var1 = R.id.content_inventory_component_title;
                     TextView var5 = (TextView)a.a(var0, var1);
                     if (var5 != null) {
                        var1 = R.id.content_inventory_component_username;
                        TextView var7 = (TextView)a.a(var0, var1);
                        if (var7 != null) {
                           return new MessageComponentContentInventoryViewBinding((ContentInventoryComponentView)var0, var8, var6, var2, var3, var4, var5, var7);
                        }
                     }
                  }
               }
            }
         }
      }

      throw new NullPointerException("Missing required view with ID: ".concat(var0.getResources().getResourceName(var1)));
   }

   public static MessageComponentContentInventoryViewBinding inflate(LayoutInflater var0) {
      return inflate(var0, null, false);
   }

   public static MessageComponentContentInventoryViewBinding inflate(LayoutInflater var0, ViewGroup var1, boolean var2) {
      View var3 = var0.inflate(R.layout.message_component_content_inventory_view, var1, false);
      if (var2) {
         var1.addView(var3);
      }

      return bind(var3);
   }

   public ContentInventoryComponentView getRoot() {
      return this.rootView;
   }
}
