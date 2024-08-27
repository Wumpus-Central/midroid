package com.discord.chat.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.constraintlayout.widget.Barrier;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.viewbinding.ViewBinding;
import com.discord.chat.R;
import com.discord.core.DCDButton;
import com.discord.overlapping_circles.OverlappingCirclesView;
import com.facebook.drawee.view.SimpleDraweeView;
import n1.a;

public final class ActivityBookmarkViewBinding implements ViewBinding {
   public final Barrier barrierFooter;
   public final SimpleDraweeView icon;
   public final ConstraintLayout itemBottomContainer;
   public final TextView itemDescription;
   public final TextView itemHeader;
   public final SimpleDraweeView itemHero;
   public final DCDButton launchButton;
   public final OverlappingCirclesView participants;
   public final FrameLayout participantsContainer;
   public final TextView participantsInfo;
   public final LinearLayout participantsInfoContainer;
   private final View rootView;

   private ActivityBookmarkViewBinding(
      View var1,
      Barrier var2,
      SimpleDraweeView var3,
      ConstraintLayout var4,
      TextView var5,
      TextView var6,
      SimpleDraweeView var7,
      DCDButton var8,
      OverlappingCirclesView var9,
      FrameLayout var10,
      TextView var11,
      LinearLayout var12
   ) {
      this.rootView = var1;
      this.barrierFooter = var2;
      this.icon = var3;
      this.itemBottomContainer = var4;
      this.itemDescription = var5;
      this.itemHeader = var6;
      this.itemHero = var7;
      this.launchButton = var8;
      this.participants = var9;
      this.participantsContainer = var10;
      this.participantsInfo = var11;
      this.participantsInfoContainer = var12;
   }

   public static ActivityBookmarkViewBinding bind(View var0) {
      int var1 = R.id.barrier_footer;
      Barrier var5 = (Barrier)a.a(var0, var1);
      if (var5 != null) {
         var1 = R.id.icon;
         SimpleDraweeView var6 = (SimpleDraweeView)a.a(var0, var1);
         if (var6 != null) {
            var1 = R.id.item_bottom_container;
            ConstraintLayout var7 = (ConstraintLayout)a.a(var0, var1);
            if (var7 != null) {
               var1 = R.id.item_description;
               TextView var8 = (TextView)a.a(var0, var1);
               if (var8 != null) {
                  var1 = R.id.item_header;
                  TextView var10 = (TextView)a.a(var0, var1);
                  if (var10 != null) {
                     var1 = R.id.item_hero;
                     SimpleDraweeView var9 = (SimpleDraweeView)a.a(var0, var1);
                     if (var9 != null) {
                        var1 = R.id.launch_button;
                        DCDButton var11 = (DCDButton)a.a(var0, var1);
                        if (var11 != null) {
                           var1 = R.id.participants;
                           OverlappingCirclesView var2 = (OverlappingCirclesView)a.a(var0, var1);
                           if (var2 != null) {
                              var1 = R.id.participants_container;
                              FrameLayout var12 = (FrameLayout)a.a(var0, var1);
                              if (var12 != null) {
                                 var1 = R.id.participants_info;
                                 TextView var3 = (TextView)a.a(var0, var1);
                                 if (var3 != null) {
                                    var1 = R.id.participants_info_container;
                                    LinearLayout var4 = (LinearLayout)a.a(var0, var1);
                                    if (var4 != null) {
                                       return new ActivityBookmarkViewBinding(var0, var5, var6, var7, var8, var10, var9, var11, var2, var12, var3, var4);
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

   public static ActivityBookmarkViewBinding inflate(LayoutInflater var0, ViewGroup var1) {
      if (var1 != null) {
         var0.inflate(R.layout.activity_bookmark_view, var1);
         return bind(var1);
      } else {
         throw new NullPointerException("parent");
      }
   }

   public View getRoot() {
      return this.rootView;
   }
}
