package com.discord.chat.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.viewbinding.ViewBinding;
import com.discord.chat.R;
import com.facebook.drawee.view.SimpleDraweeView;
import y0.a;

public final class RoleSubscriptionPurchaseViewBinding implements ViewBinding {
   @NonNull
   public final View roleSubscriptionBadgeDummyView;
   @NonNull
   public final SimpleDraweeView roleSubscriptionPurchaseBadge;
   @NonNull
   public final SimpleDraweeView roleSubscriptionPurchaseCardBg;
   @NonNull
   public final SimpleDraweeView roleSubscriptionPurchaseLanyard;
   @NonNull
   public final SimpleDraweeView roleSubscriptionPurchaserAvatar;
   @NonNull
   public final TextView roleSubscriptionPurchaserUsername;
   @NonNull
   public final TextView roleSubscriptionWelcome;
   @NonNull
   private final View rootView;

   private RoleSubscriptionPurchaseViewBinding(
      @NonNull View var1,
      @NonNull View var2,
      @NonNull SimpleDraweeView var3,
      @NonNull SimpleDraweeView var4,
      @NonNull SimpleDraweeView var5,
      @NonNull SimpleDraweeView var6,
      @NonNull TextView var7,
      @NonNull TextView var8
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

   @NonNull
   public static RoleSubscriptionPurchaseViewBinding bind(@NonNull View var0) {
      int var1 = R.id.role_subscription_badge_dummy_view;
      View var3 = a.a(var0, var1);
      if (var3 != null) {
         var1 = R.id.role_subscription_purchase_badge;
         SimpleDraweeView var4 = (SimpleDraweeView)a.a(var0, var1);
         if (var4 != null) {
            var1 = R.id.role_subscription_purchase_card_bg;
            SimpleDraweeView var8 = (SimpleDraweeView)a.a(var0, var1);
            if (var8 != null) {
               var1 = R.id.role_subscription_purchase_lanyard;
               SimpleDraweeView var5 = (SimpleDraweeView)a.a(var0, var1);
               if (var5 != null) {
                  var1 = R.id.role_subscription_purchaser_avatar;
                  SimpleDraweeView var6 = (SimpleDraweeView)a.a(var0, var1);
                  if (var6 != null) {
                     var1 = R.id.role_subscription_purchaser_username;
                     TextView var2 = (TextView)a.a(var0, var1);
                     if (var2 != null) {
                        var1 = R.id.role_subscription_welcome;
                        TextView var7 = (TextView)a.a(var0, var1);
                        if (var7 != null) {
                           return new RoleSubscriptionPurchaseViewBinding(var0, var3, var4, var8, var5, var6, var2, var7);
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
   public static RoleSubscriptionPurchaseViewBinding inflate(@NonNull LayoutInflater var0, @NonNull ViewGroup var1) {
      if (var1 != null) {
         var0.inflate(R.layout.role_subscription_purchase_view, var1);
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
