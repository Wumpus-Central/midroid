package com.discord.segmented.control.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import androidx.cardview.widget.CardView;
import androidx.viewbinding.ViewBinding;
import com.discord.segmented.control.R;
import f3.a;

public final class SegmentedControlBinding implements ViewBinding {
   public final CardView rootCardView;
   private final CardView rootView;
   public final LinearLayout segmentContainer;
   public final CardView selectedSegmentBg;

   private SegmentedControlBinding(CardView var1, CardView var2, LinearLayout var3, CardView var4) {
      this.rootView = var1;
      this.rootCardView = var2;
      this.segmentContainer = var3;
      this.selectedSegmentBg = var4;
   }

   public static SegmentedControlBinding bind(View var0) {
      CardView var2 = (CardView)var0;
      int var1 = R.id.segmentContainer;
      LinearLayout var4 = (LinearLayout)a.a(var0, var1);
      if (var4 != null) {
         var1 = R.id.selectedSegmentBg;
         CardView var3 = (CardView)a.a(var0, var1);
         if (var3 != null) {
            return new SegmentedControlBinding(var2, var2, var4, var3);
         }
      }

      throw new NullPointerException("Missing required view with ID: ".concat(var0.getResources().getResourceName(var1)));
   }

   public static SegmentedControlBinding inflate(LayoutInflater var0) {
      return inflate(var0, null, false);
   }

   public static SegmentedControlBinding inflate(LayoutInflater var0, ViewGroup var1, boolean var2) {
      View var3 = var0.inflate(R.layout.segmented_control, var1, false);
      if (var2) {
         var1.addView(var3);
      }

      return bind(var3);
   }

   public CardView getRoot() {
      return this.rootView;
   }
}
