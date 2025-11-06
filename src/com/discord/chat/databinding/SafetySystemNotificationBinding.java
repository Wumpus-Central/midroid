package com.discord.chat.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.viewbinding.ViewBinding;
import com.discord.chat.R;
import com.facebook.drawee.view.SimpleDraweeView;

public final class SafetySystemNotificationBinding implements ViewBinding {
   @NonNull
   public final TextView description;
   @NonNull
   public final LinearLayout footer;
   @NonNull
   public final SimpleDraweeView icon;
   @NonNull
   public final TextView primaryCta;
   @NonNull
   private final View rootView;
   @NonNull
   public final TextView secondaryCta;
   @NonNull
   public final TextView separator;
   @NonNull
   public final TextView subtitleText;
   @NonNull
   public final TextView title;
   @NonNull
   public final LinearLayout titleContainer;

   private SafetySystemNotificationBinding(
      @NonNull View var1,
      @NonNull TextView var2,
      @NonNull LinearLayout var3,
      @NonNull SimpleDraweeView var4,
      @NonNull TextView var5,
      @NonNull TextView var6,
      @NonNull TextView var7,
      @NonNull TextView var8,
      @NonNull TextView var9,
      @NonNull LinearLayout var10
   ) {
      this.rootView = var1;
      this.description = var2;
      this.footer = var3;
      this.icon = var4;
      this.primaryCta = var5;
      this.secondaryCta = var6;
      this.separator = var7;
      this.subtitleText = var8;
      this.title = var9;
      this.titleContainer = var10;
   }

   @NonNull
   public static SafetySystemNotificationBinding bind(@NonNull View var0) {
      int var1 = R.id.description;
      TextView var10 = (TextView)k5.a.a(var0, var1);
      if (var10 != null) {
         var1 = R.id.footer;
         LinearLayout var4 = (LinearLayout)k5.a.a(var0, var1);
         if (var4 != null) {
            var1 = R.id.icon;
            SimpleDraweeView var6 = (SimpleDraweeView)k5.a.a(var0, var1);
            if (var6 != null) {
               var1 = R.id.primary_cta;
               TextView var9 = (TextView)k5.a.a(var0, var1);
               if (var9 != null) {
                  var1 = R.id.secondary_cta;
                  TextView var7 = (TextView)k5.a.a(var0, var1);
                  if (var7 != null) {
                     var1 = R.id.separator;
                     TextView var8 = (TextView)k5.a.a(var0, var1);
                     if (var8 != null) {
                        var1 = R.id.subtitle_text;
                        TextView var5 = (TextView)k5.a.a(var0, var1);
                        if (var5 != null) {
                           var1 = R.id.title;
                           TextView var2 = (TextView)k5.a.a(var0, var1);
                           if (var2 != null) {
                              var1 = R.id.title_container;
                              LinearLayout var3 = (LinearLayout)k5.a.a(var0, var1);
                              if (var3 != null) {
                                 return new SafetySystemNotificationBinding(var0, var10, var4, var6, var9, var7, var8, var5, var2, var3);
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
   public static SafetySystemNotificationBinding inflate(@NonNull LayoutInflater var0, @NonNull ViewGroup var1) {
      if (var1 != null) {
         var0.inflate(R.layout.safety_system_notification, var1);
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
