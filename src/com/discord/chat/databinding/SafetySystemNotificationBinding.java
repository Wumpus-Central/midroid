package com.discord.chat.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.viewbinding.ViewBinding;
import com.discord.chat.R;
import com.facebook.drawee.view.SimpleDraweeView;
import n1.a;

public final class SafetySystemNotificationBinding implements ViewBinding {
   public final TextView description;
   public final LinearLayout footer;
   public final SimpleDraweeView icon;
   public final TextView primaryCta;
   private final View rootView;
   public final TextView secondaryCta;
   public final TextView separator;
   public final TextView subtitleText;
   public final TextView title;
   public final LinearLayout titleContainer;

   private SafetySystemNotificationBinding(
      View var1,
      TextView var2,
      LinearLayout var3,
      SimpleDraweeView var4,
      TextView var5,
      TextView var6,
      TextView var7,
      TextView var8,
      TextView var9,
      LinearLayout var10
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

   public static SafetySystemNotificationBinding bind(View var0) {
      int var1 = R.id.description;
      TextView var2 = (TextView)a.a(var0, var1);
      if (var2 != null) {
         var1 = R.id.footer;
         LinearLayout var10 = (LinearLayout)a.a(var0, var1);
         if (var10 != null) {
            var1 = R.id.icon;
            SimpleDraweeView var8 = (SimpleDraweeView)a.a(var0, var1);
            if (var8 != null) {
               var1 = R.id.primary_cta;
               TextView var3 = (TextView)a.a(var0, var1);
               if (var3 != null) {
                  var1 = R.id.secondary_cta;
                  TextView var6 = (TextView)a.a(var0, var1);
                  if (var6 != null) {
                     var1 = R.id.separator;
                     TextView var4 = (TextView)a.a(var0, var1);
                     if (var4 != null) {
                        var1 = R.id.subtitle_text;
                        TextView var9 = (TextView)a.a(var0, var1);
                        if (var9 != null) {
                           var1 = R.id.title;
                           TextView var7 = (TextView)a.a(var0, var1);
                           if (var7 != null) {
                              var1 = R.id.title_container;
                              LinearLayout var5 = (LinearLayout)a.a(var0, var1);
                              if (var5 != null) {
                                 return new SafetySystemNotificationBinding(var0, var2, var10, var8, var3, var6, var4, var9, var7, var5);
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

   public static SafetySystemNotificationBinding inflate(LayoutInflater var0, ViewGroup var1) {
      if (var1 != null) {
         var0.inflate(R.layout.safety_system_notification, var1);
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
