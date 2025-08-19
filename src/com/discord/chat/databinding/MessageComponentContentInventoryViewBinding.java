package com.discord.chat.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.viewbinding.ViewBinding;
import com.discord.chat.R;
import com.discord.chat.presentation.message.view.botuikit.components.ContentInventoryComponentView;
import com.facebook.drawee.view.SimpleDraweeView;
import y0.a;

public final class MessageComponentContentInventoryViewBinding implements ViewBinding {
   @NonNull
   public final SimpleDraweeView contentInventoryComponentAvatarImage;
   @NonNull
   public final SimpleDraweeView contentInventoryComponentBadgeIcon;
   @NonNull
   public final SimpleDraweeView contentInventoryComponentMediaImage;
   @NonNull
   public final SimpleDraweeView contentInventoryComponentPlatformIcon;
   @NonNull
   public final TextView contentInventoryComponentSubtitle;
   @NonNull
   public final TextView contentInventoryComponentTitle;
   @NonNull
   public final TextView contentInventoryComponentUsername;
   @NonNull
   private final ContentInventoryComponentView rootView;

   private MessageComponentContentInventoryViewBinding(
      @NonNull ContentInventoryComponentView var1,
      @NonNull SimpleDraweeView var2,
      @NonNull SimpleDraweeView var3,
      @NonNull SimpleDraweeView var4,
      @NonNull SimpleDraweeView var5,
      @NonNull TextView var6,
      @NonNull TextView var7,
      @NonNull TextView var8
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

   @NonNull
   public static MessageComponentContentInventoryViewBinding bind(@NonNull View var0) {
      int var1 = R.id.content_inventory_component_avatar_image;
      SimpleDraweeView var5 = (SimpleDraweeView)a.a(var0, var1);
      if (var5 != null) {
         var1 = R.id.content_inventory_component_badge_icon;
         SimpleDraweeView var4 = (SimpleDraweeView)a.a(var0, var1);
         if (var4 != null) {
            var1 = R.id.content_inventory_component_media_image;
            SimpleDraweeView var8 = (SimpleDraweeView)a.a(var0, var1);
            if (var8 != null) {
               var1 = R.id.content_inventory_component_platform_icon;
               SimpleDraweeView var2 = (SimpleDraweeView)a.a(var0, var1);
               if (var2 != null) {
                  var1 = R.id.content_inventory_component_subtitle;
                  TextView var7 = (TextView)a.a(var0, var1);
                  if (var7 != null) {
                     var1 = R.id.content_inventory_component_title;
                     TextView var6 = (TextView)a.a(var0, var1);
                     if (var6 != null) {
                        var1 = R.id.content_inventory_component_username;
                        TextView var3 = (TextView)a.a(var0, var1);
                        if (var3 != null) {
                           return new MessageComponentContentInventoryViewBinding((ContentInventoryComponentView)var0, var5, var4, var8, var2, var7, var6, var3);
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
   public static MessageComponentContentInventoryViewBinding inflate(@NonNull LayoutInflater var0) {
      return inflate(var0, null, false);
   }

   @NonNull
   public static MessageComponentContentInventoryViewBinding inflate(@NonNull LayoutInflater var0, ViewGroup var1, boolean var2) {
      View var3 = var0.inflate(R.layout.message_component_content_inventory_view, var1, false);
      if (var2) {
         var1.addView(var3);
      }

      return bind(var3);
   }

   @NonNull
   public ContentInventoryComponentView getRoot() {
      return this.rootView;
   }
}
