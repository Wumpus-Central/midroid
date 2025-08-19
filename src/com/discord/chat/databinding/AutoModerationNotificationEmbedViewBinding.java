package com.discord.chat.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.viewbinding.ViewBinding;
import com.discord.chat.R;
import com.discord.core.DCDButton;
import com.facebook.drawee.view.SimpleDraweeView;
import y0.a;

public final class AutoModerationNotificationEmbedViewBinding implements ViewBinding {
   @NonNull
   public final LinearLayout actions;
   @NonNull
   public final DCDButton actionsButton;
   @NonNull
   public final TextView body;
   @NonNull
   public final DCDButton feedbackButton;
   @NonNull
   public final TextView header;
   @NonNull
   public final SimpleDraweeView headerIcon;
   @NonNull
   private final View rootView;
   @NonNull
   public final ImageView separatorDot;
   @NonNull
   public final ImageView subtitleDivider;
   @NonNull
   public final TextView subtitleLeft;
   @NonNull
   public final TextView subtitleLeftAuthor;
   @NonNull
   public final SimpleDraweeView subtitleLeftAvatar;
   @NonNull
   public final LinearLayout subtitleLeftWrapper;
   @NonNull
   public final TextView subtitleRight;
   @NonNull
   public final LinearLayout subtitlesWrapper;

   private AutoModerationNotificationEmbedViewBinding(
      @NonNull View var1,
      @NonNull LinearLayout var2,
      @NonNull DCDButton var3,
      @NonNull TextView var4,
      @NonNull DCDButton var5,
      @NonNull TextView var6,
      @NonNull SimpleDraweeView var7,
      @NonNull ImageView var8,
      @NonNull ImageView var9,
      @NonNull TextView var10,
      @NonNull TextView var11,
      @NonNull SimpleDraweeView var12,
      @NonNull LinearLayout var13,
      @NonNull TextView var14,
      @NonNull LinearLayout var15
   ) {
      this.rootView = var1;
      this.actions = var2;
      this.actionsButton = var3;
      this.body = var4;
      this.feedbackButton = var5;
      this.header = var6;
      this.headerIcon = var7;
      this.separatorDot = var8;
      this.subtitleDivider = var9;
      this.subtitleLeft = var10;
      this.subtitleLeftAuthor = var11;
      this.subtitleLeftAvatar = var12;
      this.subtitleLeftWrapper = var13;
      this.subtitleRight = var14;
      this.subtitlesWrapper = var15;
   }

   @NonNull
   public static AutoModerationNotificationEmbedViewBinding bind(@NonNull View var0) {
      int var1 = R.id.actions;
      LinearLayout var12 = (LinearLayout)a.a(var0, var1);
      if (var12 != null) {
         var1 = R.id.actions_button;
         DCDButton var10 = (DCDButton)a.a(var0, var1);
         if (var10 != null) {
            var1 = R.id.body;
            TextView var14 = (TextView)a.a(var0, var1);
            if (var14 != null) {
               var1 = R.id.feedback_button;
               DCDButton var5 = (DCDButton)a.a(var0, var1);
               if (var5 != null) {
                  var1 = R.id.header;
                  TextView var2 = (TextView)a.a(var0, var1);
                  if (var2 != null) {
                     var1 = R.id.header_icon;
                     SimpleDraweeView var4 = (SimpleDraweeView)a.a(var0, var1);
                     if (var4 != null) {
                        var1 = R.id.separator_dot;
                        ImageView var6 = (ImageView)a.a(var0, var1);
                        if (var6 != null) {
                           var1 = R.id.subtitle_divider;
                           ImageView var15 = (ImageView)a.a(var0, var1);
                           if (var15 != null) {
                              var1 = R.id.subtitle_left;
                              TextView var13 = (TextView)a.a(var0, var1);
                              if (var13 != null) {
                                 var1 = R.id.subtitle_left_author;
                                 TextView var11 = (TextView)a.a(var0, var1);
                                 if (var11 != null) {
                                    var1 = R.id.subtitle_left_avatar;
                                    SimpleDraweeView var9 = (SimpleDraweeView)a.a(var0, var1);
                                    if (var9 != null) {
                                       var1 = R.id.subtitle_left_wrapper;
                                       LinearLayout var8 = (LinearLayout)a.a(var0, var1);
                                       if (var8 != null) {
                                          var1 = R.id.subtitle_right;
                                          TextView var7 = (TextView)a.a(var0, var1);
                                          if (var7 != null) {
                                             var1 = R.id.subtitles_wrapper;
                                             LinearLayout var3 = (LinearLayout)a.a(var0, var1);
                                             if (var3 != null) {
                                                return new AutoModerationNotificationEmbedViewBinding(
                                                   var0, var12, var10, var14, var5, var2, var4, var6, var15, var13, var11, var9, var8, var7, var3
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

      throw new NullPointerException("Missing required view with ID: ".concat(var0.getResources().getResourceName(var1)));
   }

   @NonNull
   public static AutoModerationNotificationEmbedViewBinding inflate(@NonNull LayoutInflater var0, @NonNull ViewGroup var1) {
      if (var1 != null) {
         var0.inflate(R.layout.auto_moderation_notification_embed_view, var1);
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
