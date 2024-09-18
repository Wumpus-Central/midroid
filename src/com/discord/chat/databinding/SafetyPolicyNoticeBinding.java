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

public final class SafetyPolicyNoticeBinding implements ViewBinding {
   public final TextView description;
   public final LinearLayout footer;
   public final SimpleDraweeView icon;
   public final TextView learnMore;
   private final View rootView;
   public final TextView subtitleText;
   public final TextView title;

   private SafetyPolicyNoticeBinding(View var1, TextView var2, LinearLayout var3, SimpleDraweeView var4, TextView var5, TextView var6, TextView var7) {
      this.rootView = var1;
      this.description = var2;
      this.footer = var3;
      this.icon = var4;
      this.learnMore = var5;
      this.subtitleText = var6;
      this.title = var7;
   }

   public static SafetyPolicyNoticeBinding bind(View var0) {
      int var1 = R.id.description;
      TextView var2 = (TextView)a.a(var0, var1);
      if (var2 != null) {
         var1 = R.id.footer;
         LinearLayout var5 = (LinearLayout)a.a(var0, var1);
         if (var5 != null) {
            var1 = R.id.icon;
            SimpleDraweeView var3 = (SimpleDraweeView)a.a(var0, var1);
            if (var3 != null) {
               var1 = R.id.learn_more;
               TextView var7 = (TextView)a.a(var0, var1);
               if (var7 != null) {
                  var1 = R.id.subtitle_text;
                  TextView var4 = (TextView)a.a(var0, var1);
                  if (var4 != null) {
                     var1 = R.id.title;
                     TextView var6 = (TextView)a.a(var0, var1);
                     if (var6 != null) {
                        return new SafetyPolicyNoticeBinding(var0, var2, var5, var3, var7, var4, var6);
                     }
                  }
               }
            }
         }
      }

      throw new NullPointerException("Missing required view with ID: ".concat(var0.getResources().getResourceName(var1)));
   }

   public static SafetyPolicyNoticeBinding inflate(LayoutInflater var0, ViewGroup var1) {
      if (var1 != null) {
         var0.inflate(R.layout.safety_policy_notice, var1);
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
