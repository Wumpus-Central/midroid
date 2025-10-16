package com.discord.chat.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.constraintlayout.widget.Barrier;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.viewbinding.ViewBinding;
import com.discord.chat.R;
import com.discord.core.DCDButton;
import com.facebook.drawee.span.SimpleDraweeSpanTextView;
import com.facebook.drawee.view.SimpleDraweeView;
import y0.a;

public final class ReferralViewBinding implements ViewBinding {
   @NonNull
   public final DCDButton acceptButton;
   @NonNull
   public final ConstraintLayout content;
   @NonNull
   public final TextView footer;
   @NonNull
   public final TextView imageCopy;
   @NonNull
   public final SimpleDraweeView nitroLogoBanner;
   @NonNull
   public final SimpleDraweeView nitroTicket;
   @NonNull
   private final LinearLayout rootView;
   @NonNull
   public final SimpleDraweeSpanTextView subtitle;
   @NonNull
   public final TextView title;
   @NonNull
   public final TextView trialInfo;
   @NonNull
   public final Barrier trialInfoTop;

   private ReferralViewBinding(
      @NonNull LinearLayout var1,
      @NonNull DCDButton var2,
      @NonNull ConstraintLayout var3,
      @NonNull TextView var4,
      @NonNull TextView var5,
      @NonNull SimpleDraweeView var6,
      @NonNull SimpleDraweeView var7,
      @NonNull SimpleDraweeSpanTextView var8,
      @NonNull TextView var9,
      @NonNull TextView var10,
      @NonNull Barrier var11
   ) {
      this.rootView = var1;
      this.acceptButton = var2;
      this.content = var3;
      this.footer = var4;
      this.imageCopy = var5;
      this.nitroLogoBanner = var6;
      this.nitroTicket = var7;
      this.subtitle = var8;
      this.title = var9;
      this.trialInfo = var10;
      this.trialInfoTop = var11;
   }

   @NonNull
   public static ReferralViewBinding bind(@NonNull View var0) {
      int var1 = R.id.acceptButton;
      DCDButton var9 = (DCDButton)a.a(var0, var1);
      if (var9 != null) {
         var1 = R.id.content;
         ConstraintLayout var6 = (ConstraintLayout)a.a(var0, var1);
         if (var6 != null) {
            var1 = R.id.footer;
            TextView var4 = (TextView)a.a(var0, var1);
            if (var4 != null) {
               var1 = R.id.imageCopy;
               TextView var10 = (TextView)a.a(var0, var1);
               if (var10 != null) {
                  var1 = R.id.nitroLogoBanner;
                  SimpleDraweeView var2 = (SimpleDraweeView)a.a(var0, var1);
                  if (var2 != null) {
                     var1 = R.id.nitroTicket;
                     SimpleDraweeView var5 = (SimpleDraweeView)a.a(var0, var1);
                     if (var5 != null) {
                        var1 = R.id.subtitle;
                        SimpleDraweeSpanTextView var11 = (SimpleDraweeSpanTextView)a.a(var0, var1);
                        if (var11 != null) {
                           var1 = R.id.title;
                           TextView var7 = (TextView)a.a(var0, var1);
                           if (var7 != null) {
                              var1 = R.id.trialInfo;
                              TextView var8 = (TextView)a.a(var0, var1);
                              if (var8 != null) {
                                 var1 = R.id.trial_info_top;
                                 Barrier var3 = (Barrier)a.a(var0, var1);
                                 if (var3 != null) {
                                    return new ReferralViewBinding((LinearLayout)var0, var9, var6, var4, var10, var2, var5, var11, var7, var8, var3);
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
   public static ReferralViewBinding inflate(@NonNull LayoutInflater var0) {
      return inflate(var0, null, false);
   }

   @NonNull
   public static ReferralViewBinding inflate(@NonNull LayoutInflater var0, ViewGroup var1, boolean var2) {
      View var3 = var0.inflate(R.layout.referral_view, var1, false);
      if (var2) {
         var1.addView(var3);
      }

      return bind(var3);
   }

   @NonNull
   public LinearLayout getRoot() {
      return this.rootView;
   }
}
