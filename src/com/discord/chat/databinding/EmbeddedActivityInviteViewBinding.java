package com.discord.chat.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.TextView;
import androidx.constraintlayout.widget.Barrier;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.viewbinding.ViewBinding;
import com.discord.chat.R;
import com.discord.chat.presentation.message.view.MessageContentView;
import com.discord.core.DCDButton;
import com.discord.overlapping_circles.OverlappingCirclesView;
import com.facebook.drawee.view.SimpleDraweeView;
import n1.a;

public final class EmbeddedActivityInviteViewBinding implements ViewBinding {
   public final Barrier barrierFooter;
   public final ConstraintLayout itemBottomContainer;
   public final TextView itemHeader;
   public final SimpleDraweeView itemHero;
   public final MessageContentView itemSubtitle;
   public final TextView itemTitle;
   public final DCDButton launchButton;
   public final TextView noParticipantsText;
   public final OverlappingCirclesView participants;
   public final FrameLayout participantsContainer;
   private final View rootView;
   public final SimpleDraweeView subtitleIcon;
   public final Barrier subtitleTopBarrier;

   private EmbeddedActivityInviteViewBinding(
      View var1,
      Barrier var2,
      ConstraintLayout var3,
      TextView var4,
      SimpleDraweeView var5,
      MessageContentView var6,
      TextView var7,
      DCDButton var8,
      TextView var9,
      OverlappingCirclesView var10,
      FrameLayout var11,
      SimpleDraweeView var12,
      Barrier var13
   ) {
      this.rootView = var1;
      this.barrierFooter = var2;
      this.itemBottomContainer = var3;
      this.itemHeader = var4;
      this.itemHero = var5;
      this.itemSubtitle = var6;
      this.itemTitle = var7;
      this.launchButton = var8;
      this.noParticipantsText = var9;
      this.participants = var10;
      this.participantsContainer = var11;
      this.subtitleIcon = var12;
      this.subtitleTopBarrier = var13;
   }

   public static EmbeddedActivityInviteViewBinding bind(View var0) {
      int var1 = R.id.barrier_footer;
      Barrier var13 = (Barrier)a.a(var0, var1);
      if (var13 != null) {
         var1 = R.id.item_bottom_container;
         ConstraintLayout var2 = (ConstraintLayout)a.a(var0, var1);
         if (var2 != null) {
            var1 = R.id.item_header;
            TextView var6 = (TextView)a.a(var0, var1);
            if (var6 != null) {
               var1 = R.id.item_hero;
               SimpleDraweeView var7 = (SimpleDraweeView)a.a(var0, var1);
               if (var7 != null) {
                  var1 = R.id.item_subtitle;
                  MessageContentView var3 = (MessageContentView)a.a(var0, var1);
                  if (var3 != null) {
                     var1 = R.id.item_title;
                     TextView var11 = (TextView)a.a(var0, var1);
                     if (var11 != null) {
                        var1 = R.id.launch_button;
                        DCDButton var10 = (DCDButton)a.a(var0, var1);
                        if (var10 != null) {
                           var1 = R.id.no_participants_text;
                           TextView var9 = (TextView)a.a(var0, var1);
                           if (var9 != null) {
                              var1 = R.id.participants;
                              OverlappingCirclesView var8 = (OverlappingCirclesView)a.a(var0, var1);
                              if (var8 != null) {
                                 var1 = R.id.participants_container;
                                 FrameLayout var4 = (FrameLayout)a.a(var0, var1);
                                 if (var4 != null) {
                                    var1 = R.id.subtitle_icon;
                                    SimpleDraweeView var5 = (SimpleDraweeView)a.a(var0, var1);
                                    if (var5 != null) {
                                       var1 = R.id.subtitle_top_barrier;
                                       Barrier var12 = (Barrier)a.a(var0, var1);
                                       if (var12 != null) {
                                          return new EmbeddedActivityInviteViewBinding(
                                             var0, var13, var2, var6, var7, var3, var11, var10, var9, var8, var4, var5, var12
                                          );
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
      }

      throw new NullPointerException("Missing required view with ID: ".concat(var0.getResources().getResourceName(var1)));
   }

   public static EmbeddedActivityInviteViewBinding inflate(LayoutInflater var0, ViewGroup var1) {
      if (var1 != null) {
         var0.inflate(R.layout.embedded_activity_invite_view, var1);
         return bind(var1);
      } else {
         throw new NullPointerException("parent");
      }
   }

   public View getRoot() {
      return this.rootView;
   }
}
