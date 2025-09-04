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
import y0.a;

public final class SafetyPolicyNoticeBinding implements ViewBinding {
   @NonNull
   public final TextView description;
   @NonNull
   public final LinearLayout footer;
   @NonNull
   public final SimpleDraweeView icon;
   @NonNull
   public final TextView learnMore;
   @NonNull
   private final View rootView;
   @NonNull
   public final TextView subtitleText;
   @NonNull
   public final TextView title;

   private SafetyPolicyNoticeBinding(
      @NonNull View var1,
      @NonNull TextView var2,
      @NonNull LinearLayout var3,
      @NonNull SimpleDraweeView var4,
      @NonNull TextView var5,
      @NonNull TextView var6,
      @NonNull TextView var7
   ) {
      this.rootView = var1;
      this.description = var2;
      this.footer = var3;
      this.icon = var4;
      this.learnMore = var5;
      this.subtitleText = var6;
      this.title = var7;
   }

   @NonNull
   public static SafetyPolicyNoticeBinding bind(@NonNull View var0) {
      int var1 = R.id.description;
      TextView var5 = (TextView)a.a(var0, var1);
      if (var5 != null) {
         var1 = R.id.footer;
         LinearLayout var4 = (LinearLayout)a.a(var0, var1);
         if (var4 != null) {
            var1 = R.id.icon;
            SimpleDraweeView var7 = (SimpleDraweeView)a.a(var0, var1);
            if (var7 != null) {
               var1 = R.id.learn_more;
               TextView var6 = (TextView)a.a(var0, var1);
               if (var6 != null) {
                  var1 = R.id.subtitle_text;
                  TextView var2 = (TextView)a.a(var0, var1);
                  if (var2 != null) {
                     var1 = R.id.title;
                     TextView var3 = (TextView)a.a(var0, var1);
                     if (var3 != null) {
                        return new SafetyPolicyNoticeBinding(var0, var5, var4, var7, var6, var2, var3);
                     }
                  }
               }
            }
         }
      }

      throw new NullPointerException("Missing required view with ID: ".concat(var0.getResources().getResourceName(var1)));
   }

   @NonNull
   public static SafetyPolicyNoticeBinding inflate(@NonNull LayoutInflater var0, @NonNull ViewGroup var1) {
      if (var1 != null) {
         var0.inflate(R.layout.safety_policy_notice, var1);
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
