package com.discord.emoji_picker.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import androidx.viewbinding.ViewBinding;
import com.discord.emoji_picker.R;
import n1.a;

public final class PremiumInlineRoadblockHeaderBinding implements ViewBinding {
   public final View gradient;
   public final View gradientDivider;
   public final FrameLayout gradientIcon;
   public final LinearLayout gradients;
   private final RelativeLayout rootView;

   private PremiumInlineRoadblockHeaderBinding(RelativeLayout var1, View var2, View var3, FrameLayout var4, LinearLayout var5) {
      this.rootView = var1;
      this.gradient = var2;
      this.gradientDivider = var3;
      this.gradientIcon = var4;
      this.gradients = var5;
   }

   public static PremiumInlineRoadblockHeaderBinding bind(View var0) {
      int var1 = R.id.gradient;
      View var3 = a.a(var0, var1);
      if (var3 != null) {
         var1 = R.id.gradient_divider;
         View var5 = a.a(var0, var1);
         if (var5 != null) {
            var1 = R.id.gradient_icon;
            FrameLayout var2 = (FrameLayout)a.a(var0, var1);
            if (var2 != null) {
               var1 = R.id.gradients;
               LinearLayout var4 = (LinearLayout)a.a(var0, var1);
               if (var4 != null) {
                  return new PremiumInlineRoadblockHeaderBinding((RelativeLayout)var0, var3, var5, var2, var4);
               }
            }
         }
      }

      throw new NullPointerException("Missing required view with ID: ".concat(var0.getResources().getResourceName(var1)));
   }

   public static PremiumInlineRoadblockHeaderBinding inflate(LayoutInflater var0) {
      return inflate(var0, null, false);
   }

   public static PremiumInlineRoadblockHeaderBinding inflate(LayoutInflater var0, ViewGroup var1, boolean var2) {
      View var3 = var0.inflate(R.layout.premium_inline_roadblock_header, var1, false);
      if (var2) {
         var1.addView(var3);
      }

      return bind(var3);
   }

   public RelativeLayout getRoot() {
      return this.rootView;
   }
}
