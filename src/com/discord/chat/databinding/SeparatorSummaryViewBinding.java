package com.discord.chat.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.TextView;
import androidx.constraintlayout.widget.Barrier;
import androidx.constraintlayout.widget.Guideline;
import androidx.viewbinding.ViewBinding;
import com.discord.chat.R;
import com.facebook.drawee.view.SimpleDraweeView;
import n1.a;

public final class SeparatorSummaryViewBinding implements ViewBinding {
   public final Guideline bottomGuideline;
   public final FrameLayout buttonWrapper;
   public final SimpleDraweeView icon;
   public final SimpleDraweeView indicatorBottom;
   public final Barrier indicatorEndBarrier;
   public final SimpleDraweeView indicatorTop;
   public final SimpleDraweeView jumpButton;
   public final TextView middleText;
   public final SimpleDraweeView moreButton;
   public final View rightBar;
   private final View rootView;
   public final Guideline topGuideline;

   private SeparatorSummaryViewBinding(
      View var1,
      Guideline var2,
      FrameLayout var3,
      SimpleDraweeView var4,
      SimpleDraweeView var5,
      Barrier var6,
      SimpleDraweeView var7,
      SimpleDraweeView var8,
      TextView var9,
      SimpleDraweeView var10,
      View var11,
      Guideline var12
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

   public static SeparatorSummaryViewBinding bind(View var0) {
      int var1 = R.id.bottom_guideline;
      Guideline var4 = (Guideline)a.a(var0, var1);
      if (var4 != null) {
         var1 = R.id.button_wrapper;
         FrameLayout var2 = (FrameLayout)a.a(var0, var1);
         if (var2 != null) {
            var1 = R.id.icon;
            SimpleDraweeView var5 = (SimpleDraweeView)a.a(var0, var1);
            if (var5 != null) {
               var1 = R.id.indicator_bottom;
               SimpleDraweeView var9 = (SimpleDraweeView)a.a(var0, var1);
               if (var9 != null) {
                  var1 = R.id.indicator_end_barrier;
                  Barrier var12 = (Barrier)a.a(var0, var1);
                  if (var12 != null) {
                     var1 = R.id.indicator_top;
                     SimpleDraweeView var6 = (SimpleDraweeView)a.a(var0, var1);
                     if (var6 != null) {
                        var1 = R.id.jump_button;
                        SimpleDraweeView var7 = (SimpleDraweeView)a.a(var0, var1);
                        if (var7 != null) {
                           var1 = R.id.middle_text;
                           TextView var3 = (TextView)a.a(var0, var1);
                           if (var3 != null) {
                              var1 = R.id.more_button;
                              SimpleDraweeView var8 = (SimpleDraweeView)a.a(var0, var1);
                              if (var8 != null) {
                                 var1 = R.id.right_bar;
                                 View var11 = a.a(var0, var1);
                                 if (var11 != null) {
                                    var1 = R.id.top_guideline;
                                    Guideline var10 = (Guideline)a.a(var0, var1);
                                    if (var10 != null) {
                                       return new SeparatorSummaryViewBinding(var0, var4, var2, var5, var9, var12, var6, var7, var3, var8, var11, var10);
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

   public static SeparatorSummaryViewBinding inflate(LayoutInflater var0, ViewGroup var1) {
      if (var1 != null) {
         var0.inflate(R.layout.separator_summary_view, var1);
         return bind(var1);
      } else {
         throw new NullPointerException("parent");
      }
   }

   public View getRoot() {
      return this.rootView;
   }
}
