package com.discord.mobile_voice_overlay.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.cardview.widget.CardView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.viewbinding.ViewBinding;
import com.discord.mobile_voice_overlay.R;
import com.facebook.drawee.view.SimpleDraweeView;
import y0.a;

public final class ViewOverlayMenuBinding implements ViewBinding {
   @NonNull
   public final SimpleDraweeView disconnectBtn;
   @NonNull
   public final CardView menuBottom;
   @NonNull
   public final CardView menuTop;
   @NonNull
   public final ConstraintLayout menuTopStatusContainer;
   @NonNull
   public final SimpleDraweeView muteToggle;
   @NonNull
   public final TextView overlayChannelName;
   @NonNull
   public final TextView overlayGuildName;
   @NonNull
   public final TextView overlayInviteLink;
   @NonNull
   public final SimpleDraweeView overlayNetworkIcon;
   @NonNull
   public final TextView overlayOpenApp;
   @NonNull
   public final TextView overlaySwitchChannels;
   @NonNull
   private final View rootView;

   private ViewOverlayMenuBinding(
      @NonNull View var1,
      @NonNull SimpleDraweeView var2,
      @NonNull CardView var3,
      @NonNull CardView var4,
      @NonNull ConstraintLayout var5,
      @NonNull SimpleDraweeView var6,
      @NonNull TextView var7,
      @NonNull TextView var8,
      @NonNull TextView var9,
      @NonNull SimpleDraweeView var10,
      @NonNull TextView var11,
      @NonNull TextView var12
   ) {
      this.rootView = var1;
      this.disconnectBtn = var2;
      this.menuBottom = var3;
      this.menuTop = var4;
      this.menuTopStatusContainer = var5;
      this.muteToggle = var6;
      this.overlayChannelName = var7;
      this.overlayGuildName = var8;
      this.overlayInviteLink = var9;
      this.overlayNetworkIcon = var10;
      this.overlayOpenApp = var11;
      this.overlaySwitchChannels = var12;
   }

   @NonNull
   public static ViewOverlayMenuBinding bind(@NonNull View var0) {
      int var1 = R.id.disconnect_btn;
      SimpleDraweeView var8 = (SimpleDraweeView)a.a(var0, var1);
      if (var8 != null) {
         var1 = R.id.menu_bottom;
         CardView var7 = (CardView)a.a(var0, var1);
         if (var7 != null) {
            var1 = R.id.menu_top;
            CardView var4 = (CardView)a.a(var0, var1);
            if (var4 != null) {
               var1 = R.id.menu_top_status_container;
               ConstraintLayout var5 = (ConstraintLayout)a.a(var0, var1);
               if (var5 != null) {
                  var1 = R.id.mute_toggle;
                  SimpleDraweeView var9 = (SimpleDraweeView)a.a(var0, var1);
                  if (var9 != null) {
                     var1 = R.id.overlay_channel_name;
                     TextView var6 = (TextView)a.a(var0, var1);
                     if (var6 != null) {
                        var1 = R.id.overlay_guild_name;
                        TextView var11 = (TextView)a.a(var0, var1);
                        if (var11 != null) {
                           var1 = R.id.overlay_invite_link;
                           TextView var12 = (TextView)a.a(var0, var1);
                           if (var12 != null) {
                              var1 = R.id.overlay_network_icon;
                              SimpleDraweeView var3 = (SimpleDraweeView)a.a(var0, var1);
                              if (var3 != null) {
                                 var1 = R.id.overlay_open_app;
                                 TextView var2 = (TextView)a.a(var0, var1);
                                 if (var2 != null) {
                                    var1 = R.id.overlay_switch_channels;
                                    TextView var10 = (TextView)a.a(var0, var1);
                                    if (var10 != null) {
                                       return new ViewOverlayMenuBinding(var0, var8, var7, var4, var5, var9, var6, var11, var12, var3, var2, var10);
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
   public static ViewOverlayMenuBinding inflate(@NonNull LayoutInflater var0, @NonNull ViewGroup var1) {
      if (var1 != null) {
         var0.inflate(R.layout.view_overlay_menu, var1);
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
