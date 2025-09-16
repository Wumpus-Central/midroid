package com.discord.chat.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.constraintlayout.widget.Barrier;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.viewbinding.ViewBinding;
import com.discord.chat.R;
import com.discord.chat.presentation.message.view.MessageContentView;
import com.discord.core.DCDButton;
import com.discord.overlapping_circles.OverlappingCirclesView;
import com.facebook.drawee.view.SimpleDraweeView;
import y0.a;

public final class EmbeddedActivityInviteViewBinding implements ViewBinding {
   @NonNull
   public final Barrier barrierFooter;
   @NonNull
   public final ConstraintLayout itemBottomContainer;
   @NonNull
   public final TextView itemHeader;
   @NonNull
   public final SimpleDraweeView itemHero;
   @NonNull
   public final MessageContentView itemSubtitle;
   @NonNull
   public final TextView itemTitle;
   @NonNull
   public final DCDButton launchButton;
   @NonNull
   public final TextView noParticipantsText;
   @NonNull
   public final OverlappingCirclesView participants;
   @NonNull
   public final FrameLayout participantsContainer;
   @NonNull
   private final View rootView;
   @NonNull
   public final SimpleDraweeView subtitleIcon;
   @NonNull
   public final Barrier subtitleTopBarrier;

   private EmbeddedActivityInviteViewBinding(
      @NonNull View var1,
      @NonNull Barrier var2,
      @NonNull ConstraintLayout var3,
      @NonNull TextView var4,
      @NonNull SimpleDraweeView var5,
      @NonNull MessageContentView var6,
      @NonNull TextView var7,
      @NonNull DCDButton var8,
      @NonNull TextView var9,
      @NonNull OverlappingCirclesView var10,
      @NonNull FrameLayout var11,
      @NonNull SimpleDraweeView var12,
      @NonNull Barrier var13
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

   @NonNull
   public static EmbeddedActivityInviteViewBinding bind(@NonNull View var0) {
      int var1 = R.id.barrier_footer;
      Barrier var12 = (Barrier)a.a(var0, var1);
      if (var12 != null) {
         var1 = R.id.item_bottom_container;
         ConstraintLayout var10 = (ConstraintLayout)a.a(var0, var1);
         if (var10 != null) {
            var1 = R.id.item_header;
            TextView var3 = (TextView)a.a(var0, var1);
            if (var3 != null) {
               var1 = R.id.item_hero;
               SimpleDraweeView var2 = (SimpleDraweeView)a.a(var0, var1);
               if (var2 != null) {
                  var1 = R.id.item_subtitle;
                  MessageContentView var7 = (MessageContentView)a.a(var0, var1);
                  if (var7 != null) {
                     var1 = R.id.item_title;
                     TextView var4 = (TextView)a.a(var0, var1);
                     if (var4 != null) {
                        var1 = R.id.launch_button;
                        DCDButton var6 = (DCDButton)a.a(var0, var1);
                        if (var6 != null) {
                           var1 = R.id.no_participants_text;
                           TextView var8 = (TextView)a.a(var0, var1);
                           if (var8 != null) {
                              var1 = R.id.participants;
                              OverlappingCirclesView var5 = (OverlappingCirclesView)a.a(var0, var1);
                              if (var5 != null) {
                                 var1 = R.id.participants_container;
                                 FrameLayout var13 = (FrameLayout)a.a(var0, var1);
                                 if (var13 != null) {
                                    var1 = R.id.subtitle_icon;
                                    SimpleDraweeView var9 = (SimpleDraweeView)a.a(var0, var1);
                                    if (var9 != null) {
                                       var1 = R.id.subtitle_top_barrier;
                                       Barrier var11 = (Barrier)a.a(var0, var1);
                                       if (var11 != null) {
                                          return new EmbeddedActivityInviteViewBinding(
                                             var0, var12, var10, var3, var2, var7, var4, var6, var8, var5, var13, var9, var11
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

   @NonNull
   public static EmbeddedActivityInviteViewBinding inflate(@NonNull LayoutInflater var0, @NonNull ViewGroup var1) {
      if (var1 != null) {
         var0.inflate(R.layout.embedded_activity_invite_view, var1);
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
