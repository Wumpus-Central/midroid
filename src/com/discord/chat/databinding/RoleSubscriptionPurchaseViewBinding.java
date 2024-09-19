package com.discord.chat.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.viewbinding.ViewBinding;
import com.discord.chat.R;
import com.facebook.drawee.view.SimpleDraweeView;
import n1.a;

public final class RoleSubscriptionPurchaseViewBinding implements ViewBinding {
   public final View roleSubscriptionBadgeDummyView;
   public final SimpleDraweeView roleSubscriptionPurchaseBadge;
   public final SimpleDraweeView roleSubscriptionPurchaseCardBg;
   public final SimpleDraweeView roleSubscriptionPurchaseLanyard;
   public final SimpleDraweeView roleSubscriptionPurchaserAvatar;
   public final TextView roleSubscriptionPurchaserUsername;
   public final TextView roleSubscriptionWelcome;
   private final View rootView;

   private RoleSubscriptionPurchaseViewBinding(
      View var1, View var2, SimpleDraweeView var3, SimpleDraweeView var4, SimpleDraweeView var5, SimpleDraweeView var6, TextView var7, TextView var8
   ) {
      this.rootView = var1;
      this.roleSubscriptionBadgeDummyView = var2;
      this.roleSubscriptionPurchaseBadge = var3;
      this.roleSubscriptionPurchaseCardBg = var4;
      this.roleSubscriptionPurchaseLanyard = var5;
      this.roleSubscriptionPurchaserAvatar = var6;
      this.roleSubscriptionPurchaserUsername = var7;
      this.roleSubscriptionWelcome = var8;
   }

   public static RoleSubscriptionPurchaseViewBinding bind(View var0) {
      int var1 = R.id.role_subscription_badge_dummy_view;
      View var4 = a.a(var0, var1);
      if (var4 != null) {
         var1 = R.id.role_subscription_purchase_badge;
         SimpleDraweeView var8 = (SimpleDraweeView)a.a(var0, var1);
         if (var8 != null) {
            var1 = R.id.role_subscription_purchase_card_bg;
            SimpleDraweeView var3 = (SimpleDraweeView)a.a(var0, var1);
            if (var3 != null) {
               var1 = R.id.role_subscription_purchase_lanyard;
               SimpleDraweeView var6 = (SimpleDraweeView)a.a(var0, var1);
               if (var6 != null) {
                  var1 = R.id.role_subscription_purchaser_avatar;
                  SimpleDraweeView var2 = (SimpleDraweeView)a.a(var0, var1);
                  if (var2 != null) {
                     var1 = R.id.role_subscription_purchaser_username;
                     TextView var7 = (TextView)a.a(var0, var1);
                     if (var7 != null) {
                        var1 = R.id.role_subscription_welcome;
                        TextView var5 = (TextView)a.a(var0, var1);
                        if (var5 != null) {
                           return new RoleSubscriptionPurchaseViewBinding(var0, var4, var8, var3, var6, var2, var7, var5);
                        }
                     }
                  }
               }
            }
         }
      }

      throw new NullPointerException("Missing required view with ID: ".concat(var0.getResources().getResourceName(var1)));
   }

   public static RoleSubscriptionPurchaseViewBinding inflate(LayoutInflater var0, ViewGroup var1) {
      if (var1 != null) {
         var0.inflate(R.layout.role_subscription_purchase_view, var1);
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
