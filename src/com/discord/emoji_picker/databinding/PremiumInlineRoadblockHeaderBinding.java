package com.discord.emoji_picker.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import androidx.annotation.NonNull;
import androidx.viewbinding.ViewBinding;
import com.discord.emoji_picker.R;
import y0.a;

public final class PremiumInlineRoadblockHeaderBinding implements ViewBinding {
   @NonNull
   public final View gradient;
   @NonNull
   public final View gradientDivider;
   @NonNull
   public final FrameLayout gradientIcon;
   @NonNull
   public final LinearLayout gradients;
   @NonNull
   private final RelativeLayout rootView;

   private PremiumInlineRoadblockHeaderBinding(
      @NonNull RelativeLayout var1, @NonNull View var2, @NonNull View var3, @NonNull FrameLayout var4, @NonNull LinearLayout var5
   ) {
      this.rootView = var1;
      this.gradient = var2;
      this.gradientDivider = var3;
      this.gradientIcon = var4;
      this.gradients = var5;
   }

   @NonNull
   public static PremiumInlineRoadblockHeaderBinding bind(@NonNull View var0) {
      int var1 = R.id.gradient;
      View var3 = a.a(var0, var1);
      if (var3 != null) {
         var1 = R.id.gradient_divider;
         View var4 = a.a(var0, var1);
         if (var4 != null) {
            var1 = R.id.gradient_icon;
            FrameLayout var2 = (FrameLayout)a.a(var0, var1);
            if (var2 != null) {
               var1 = R.id.gradients;
               LinearLayout var5 = (LinearLayout)a.a(var0, var1);
               if (var5 != null) {
                  return new PremiumInlineRoadblockHeaderBinding((RelativeLayout)var0, var3, var4, var2, var5);
               }
            }
         }
      }

      throw new NullPointerException("Missing required view with ID: ".concat(var0.getResources().getResourceName(var1)));
   }

   @NonNull
   public static PremiumInlineRoadblockHeaderBinding inflate(@NonNull LayoutInflater var0) {
      return inflate(var0, null, false);
   }

   @NonNull
   public static PremiumInlineRoadblockHeaderBinding inflate(@NonNull LayoutInflater var0, ViewGroup var1, boolean var2) {
      View var3 = var0.inflate(R.layout.premium_inline_roadblock_header, var1, false);
      if (var2) {
         var1.addView(var3);
      }

      return bind(var3);
   }

   @NonNull
   public RelativeLayout getRoot() {
      return this.rootView;
   }
}
