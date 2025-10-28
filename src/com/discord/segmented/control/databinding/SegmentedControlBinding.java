package com.discord.segmented.control.databinding;

import E1.a;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import androidx.annotation.NonNull;
import androidx.cardview.widget.CardView;
import androidx.viewbinding.ViewBinding;
import com.discord.segmented.control.R;

public final class SegmentedControlBinding implements ViewBinding {
   @NonNull
   public final CardView rootCardView;
   @NonNull
   private final CardView rootView;
   @NonNull
   public final LinearLayout segmentContainer;
   @NonNull
   public final CardView selectedSegmentBg;

   private SegmentedControlBinding(@NonNull CardView var1, @NonNull CardView var2, @NonNull LinearLayout var3, @NonNull CardView var4) {
      this.rootView = var1;
      this.rootCardView = var2;
      this.segmentContainer = var3;
      this.selectedSegmentBg = var4;
   }

   @NonNull
   public static SegmentedControlBinding bind(@NonNull View var0) {
      CardView var2 = (CardView)var0;
      int var1 = R.id.segmentContainer;
      LinearLayout var3 = (LinearLayout)a.a(var0, var1);
      if (var3 != null) {
         var1 = R.id.selectedSegmentBg;
         CardView var4 = (CardView)a.a(var0, var1);
         if (var4 != null) {
            return new SegmentedControlBinding(var2, var2, var3, var4);
         }
      }

      throw new NullPointerException("Missing required view with ID: ".concat(var0.getResources().getResourceName(var1)));
   }

   @NonNull
   public static SegmentedControlBinding inflate(@NonNull LayoutInflater var0) {
      return inflate(var0, null, false);
   }

   @NonNull
   public static SegmentedControlBinding inflate(@NonNull LayoutInflater var0, ViewGroup var1, boolean var2) {
      View var3 = var0.inflate(R.layout.segmented_control, var1, false);
      if (var2) {
         var1.addView(var3);
      }

      return bind(var3);
   }

   @NonNull
   public CardView getRoot() {
      return this.rootView;
   }
}
