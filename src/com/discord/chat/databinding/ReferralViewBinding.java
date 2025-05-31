package com.discord.chat.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.constraintlayout.widget.Barrier;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.viewbinding.ViewBinding;
import com.discord.chat.R;
import com.discord.core.DCDButton;
import com.facebook.drawee.span.SimpleDraweeSpanTextView;
import com.facebook.drawee.view.SimpleDraweeView;
import t0.a;

public final class ReferralViewBinding implements ViewBinding {
   public final DCDButton acceptButton;
   public final ConstraintLayout content;
   public final TextView footer;
   public final TextView imageCopy;
   public final SimpleDraweeView nitroLogoBanner;
   public final SimpleDraweeView nitroTicket;
   private final LinearLayout rootView;
   public final SimpleDraweeSpanTextView subtitle;
   public final TextView title;
   public final TextView trialInfo;
   public final Barrier trialInfoTop;

   private ReferralViewBinding(
      LinearLayout var1,
      DCDButton var2,
      ConstraintLayout var3,
      TextView var4,
      TextView var5,
      SimpleDraweeView var6,
      SimpleDraweeView var7,
      SimpleDraweeSpanTextView var8,
      TextView var9,
      TextView var10,
      Barrier var11
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

   public static ReferralViewBinding bind(View var0) {
      int var1 = R.id.acceptButton;
      DCDButton var11 = (DCDButton)a.a(var0, var1);
      if (var11 != null) {
         var1 = R.id.content;
         ConstraintLayout var2 = (ConstraintLayout)a.a(var0, var1);
         if (var2 != null) {
            var1 = R.id.footer;
            TextView var6 = (TextView)a.a(var0, var1);
            if (var6 != null) {
               var1 = R.id.imageCopy;
               TextView var7 = (TextView)a.a(var0, var1);
               if (var7 != null) {
                  var1 = R.id.nitroLogoBanner;
                  SimpleDraweeView var4 = (SimpleDraweeView)a.a(var0, var1);
                  if (var4 != null) {
                     var1 = R.id.nitroTicket;
                     SimpleDraweeView var9 = (SimpleDraweeView)a.a(var0, var1);
                     if (var9 != null) {
                        var1 = R.id.subtitle;
                        SimpleDraweeSpanTextView var10 = (SimpleDraweeSpanTextView)a.a(var0, var1);
                        if (var10 != null) {
                           var1 = R.id.title;
                           TextView var8 = (TextView)a.a(var0, var1);
                           if (var8 != null) {
                              var1 = R.id.trialInfo;
                              TextView var5 = (TextView)a.a(var0, var1);
                              if (var5 != null) {
                                 var1 = R.id.trial_info_top;
                                 Barrier var3 = (Barrier)a.a(var0, var1);
                                 if (var3 != null) {
                                    return new ReferralViewBinding((LinearLayout)var0, var11, var2, var6, var7, var4, var9, var10, var8, var5, var3);
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

   public static ReferralViewBinding inflate(LayoutInflater var0) {
      return inflate(var0, null, false);
   }

   public static ReferralViewBinding inflate(LayoutInflater var0, ViewGroup var1, boolean var2) {
      View var3 = var0.inflate(R.layout.referral_view, var1, false);
      if (var2) {
         var1.addView(var3);
      }

      return bind(var3);
   }

   public LinearLayout getRoot() {
      return this.rootView;
   }
}
