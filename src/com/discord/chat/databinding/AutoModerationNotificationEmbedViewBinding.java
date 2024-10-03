package com.discord.chat.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.viewbinding.ViewBinding;
import com.discord.chat.R;
import com.discord.core.DCDButton;
import com.facebook.drawee.view.SimpleDraweeView;
import o1.a;

public final class AutoModerationNotificationEmbedViewBinding implements ViewBinding {
   public final LinearLayout actions;
   public final DCDButton actionsButton;
   public final TextView body;
   public final DCDButton feedbackButton;
   public final TextView header;
   public final SimpleDraweeView headerIcon;
   private final View rootView;
   public final ImageView separatorDot;
   public final ImageView subtitleDivider;
   public final TextView subtitleLeft;
   public final TextView subtitleLeftAuthor;
   public final SimpleDraweeView subtitleLeftAvatar;
   public final LinearLayout subtitleLeftWrapper;
   public final TextView subtitleRight;
   public final LinearLayout subtitlesWrapper;

   private AutoModerationNotificationEmbedViewBinding(
      View var1,
      LinearLayout var2,
      DCDButton var3,
      TextView var4,
      DCDButton var5,
      TextView var6,
      SimpleDraweeView var7,
      ImageView var8,
      ImageView var9,
      TextView var10,
      TextView var11,
      SimpleDraweeView var12,
      LinearLayout var13,
      TextView var14,
      LinearLayout var15
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

   public static AutoModerationNotificationEmbedViewBinding bind(View var0) {
      int var1 = R.id.actions;
      LinearLayout var11 = (LinearLayout)a.a(var0, var1);
      if (var11 != null) {
         var1 = R.id.actions_button;
         DCDButton var4 = (DCDButton)a.a(var0, var1);
         if (var4 != null) {
            var1 = R.id.body;
            TextView var14 = (TextView)a.a(var0, var1);
            if (var14 != null) {
               var1 = R.id.feedback_button;
               DCDButton var8 = (DCDButton)a.a(var0, var1);
               if (var8 != null) {
                  var1 = R.id.header;
                  TextView var2 = (TextView)a.a(var0, var1);
                  if (var2 != null) {
                     var1 = R.id.header_icon;
                     SimpleDraweeView var12 = (SimpleDraweeView)a.a(var0, var1);
                     if (var12 != null) {
                        var1 = R.id.separator_dot;
                        ImageView var3 = (ImageView)a.a(var0, var1);
                        if (var3 != null) {
                           var1 = R.id.subtitle_divider;
                           ImageView var5 = (ImageView)a.a(var0, var1);
                           if (var5 != null) {
                              var1 = R.id.subtitle_left;
                              TextView var9 = (TextView)a.a(var0, var1);
                              if (var9 != null) {
                                 var1 = R.id.subtitle_left_author;
                                 TextView var10 = (TextView)a.a(var0, var1);
                                 if (var10 != null) {
                                    var1 = R.id.subtitle_left_avatar;
                                    SimpleDraweeView var13 = (SimpleDraweeView)a.a(var0, var1);
                                    if (var13 != null) {
                                       var1 = R.id.subtitle_left_wrapper;
                                       LinearLayout var15 = (LinearLayout)a.a(var0, var1);
                                       if (var15 != null) {
                                          var1 = R.id.subtitle_right;
                                          TextView var7 = (TextView)a.a(var0, var1);
                                          if (var7 != null) {
                                             var1 = R.id.subtitles_wrapper;
                                             LinearLayout var6 = (LinearLayout)a.a(var0, var1);
                                             if (var6 != null) {
                                                return new AutoModerationNotificationEmbedViewBinding(
                                                   var0, var11, var4, var14, var8, var2, var12, var3, var5, var9, var10, var13, var15, var7, var6
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

   public static AutoModerationNotificationEmbedViewBinding inflate(LayoutInflater var0, ViewGroup var1) {
      if (var1 != null) {
         var0.inflate(R.layout.auto_moderation_notification_embed_view, var1);
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
