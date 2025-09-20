package com.discord.chat.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.constraintlayout.widget.Barrier;
import androidx.constraintlayout.widget.Guideline;
import androidx.viewbinding.ViewBinding;
import com.discord.chat.R;
import com.facebook.drawee.view.SimpleDraweeView;
import y0.a;

public final class SeparatorSummaryViewBinding implements ViewBinding {
   @NonNull
   public final Guideline bottomGuideline;
   @NonNull
   public final FrameLayout buttonWrapper;
   @NonNull
   public final SimpleDraweeView icon;
   @NonNull
   public final SimpleDraweeView indicatorBottom;
   @NonNull
   public final Barrier indicatorEndBarrier;
   @NonNull
   public final SimpleDraweeView indicatorTop;
   @NonNull
   public final SimpleDraweeView jumpButton;
   @NonNull
   public final TextView middleText;
   @NonNull
   public final SimpleDraweeView moreButton;
   @NonNull
   public final View rightBar;
   @NonNull
   private final View rootView;
   @NonNull
   public final Guideline topGuideline;

   private SeparatorSummaryViewBinding(
      @NonNull View var1,
      @NonNull Guideline var2,
      @NonNull FrameLayout var3,
      @NonNull SimpleDraweeView var4,
      @NonNull SimpleDraweeView var5,
      @NonNull Barrier var6,
      @NonNull SimpleDraweeView var7,
      @NonNull SimpleDraweeView var8,
      @NonNull TextView var9,
      @NonNull SimpleDraweeView var10,
      @NonNull View var11,
      @NonNull Guideline var12
   ) {
      this.rootView = var1;
      this.bottomGuideline = var2;
      this.buttonWrapper = var3;
      this.icon = var4;
      this.indicatorBottom = var5;
      this.indicatorEndBarrier = var6;
      this.indicatorTop = var7;
      this.jumpButton = var8;
      this.middleText = var9;
      this.moreButton = var10;
      this.rightBar = var11;
      this.topGuideline = var12;
   }

   @NonNull
   public static SeparatorSummaryViewBinding bind(@NonNull View var0) {
      int var1 = R.id.bottom_guideline;
      Guideline var12 = (Guideline)a.a(var0, var1);
      if (var12 != null) {
         var1 = R.id.button_wrapper;
         FrameLayout var10 = (FrameLayout)a.a(var0, var1);
         if (var10 != null) {
            var1 = R.id.icon;
            SimpleDraweeView var2 = (SimpleDraweeView)a.a(var0, var1);
            if (var2 != null) {
               var1 = R.id.indicator_bottom;
               SimpleDraweeView var6 = (SimpleDraweeView)a.a(var0, var1);
               if (var6 != null) {
                  var1 = R.id.indicator_end_barrier;
                  Barrier var4 = (Barrier)a.a(var0, var1);
                  if (var4 != null) {
                     var1 = R.id.indicator_top;
                     SimpleDraweeView var8 = (SimpleDraweeView)a.a(var0, var1);
                     if (var8 != null) {
                        var1 = R.id.jump_button;
                        SimpleDraweeView var3 = (SimpleDraweeView)a.a(var0, var1);
                        if (var3 != null) {
                           var1 = R.id.middle_text;
                           TextView var11 = (TextView)a.a(var0, var1);
                           if (var11 != null) {
                              var1 = R.id.more_button;
                              SimpleDraweeView var9 = (SimpleDraweeView)a.a(var0, var1);
                              if (var9 != null) {
                                 var1 = R.id.right_bar;
                                 View var7 = a.a(var0, var1);
                                 if (var7 != null) {
                                    var1 = R.id.top_guideline;
                                    Guideline var5 = (Guideline)a.a(var0, var1);
                                    if (var5 != null) {
                                       return new SeparatorSummaryViewBinding(var0, var12, var10, var2, var6, var4, var8, var3, var11, var9, var7, var5);
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
      }

      throw new NullPointerException("Missing required view with ID: ".concat(var0.getResources().getResourceName(var1)));
   }

   @NonNull
   public static SeparatorSummaryViewBinding inflate(@NonNull LayoutInflater var0, @NonNull ViewGroup var1) {
      if (var1 != null) {
         var0.inflate(R.layout.separator_summary_view, var1);
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
