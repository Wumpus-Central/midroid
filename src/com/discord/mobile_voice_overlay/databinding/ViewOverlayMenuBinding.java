package com.discord.mobile_voice_overlay.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.cardview.widget.CardView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.viewbinding.ViewBinding;
import com.discord.mobile_voice_overlay.R;
import com.facebook.drawee.view.SimpleDraweeView;
import n1.a;

public final class ViewOverlayMenuBinding implements ViewBinding {
   public final SimpleDraweeView disconnectBtn;
   public final CardView menuBottom;
   public final CardView menuTop;
   public final ConstraintLayout menuTopStatusContainer;
   public final SimpleDraweeView muteToggle;
   public final TextView overlayChannelName;
   public final TextView overlayGuildName;
   public final TextView overlayInviteLink;
   public final SimpleDraweeView overlayNetworkIcon;
   public final TextView overlayOpenApp;
   public final TextView overlaySwitchChannels;
   private final View rootView;

   private ViewOverlayMenuBinding(
      View var1,
      SimpleDraweeView var2,
      CardView var3,
      CardView var4,
      ConstraintLayout var5,
      SimpleDraweeView var6,
      TextView var7,
      TextView var8,
      TextView var9,
      SimpleDraweeView var10,
      TextView var11,
      TextView var12
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

   public static ViewOverlayMenuBinding bind(View var0) {
      int var1 = R.id.disconnect_btn;
      SimpleDraweeView var4 = (SimpleDraweeView)a.a(var0, var1);
      if (var4 != null) {
         var1 = R.id.menu_bottom;
         CardView var3 = (CardView)a.a(var0, var1);
         if (var3 != null) {
            var1 = R.id.menu_top;
            CardView var2 = (CardView)a.a(var0, var1);
            if (var2 != null) {
               var1 = R.id.menu_top_status_container;
               ConstraintLayout var6 = (ConstraintLayout)a.a(var0, var1);
               if (var6 != null) {
                  var1 = R.id.mute_toggle;
                  SimpleDraweeView var8 = (SimpleDraweeView)a.a(var0, var1);
                  if (var8 != null) {
                     var1 = R.id.overlay_channel_name;
                     TextView var12 = (TextView)a.a(var0, var1);
                     if (var12 != null) {
                        var1 = R.id.overlay_guild_name;
                        TextView var11 = (TextView)a.a(var0, var1);
                        if (var11 != null) {
                           var1 = R.id.overlay_invite_link;
                           TextView var7 = (TextView)a.a(var0, var1);
                           if (var7 != null) {
                              var1 = R.id.overlay_network_icon;
                              SimpleDraweeView var5 = (SimpleDraweeView)a.a(var0, var1);
                              if (var5 != null) {
                                 var1 = R.id.overlay_open_app;
                                 TextView var10 = (TextView)a.a(var0, var1);
                                 if (var10 != null) {
                                    var1 = R.id.overlay_switch_channels;
                                    TextView var9 = (TextView)a.a(var0, var1);
                                    if (var9 != null) {
                                       return new ViewOverlayMenuBinding(var0, var4, var3, var2, var6, var8, var12, var11, var7, var5, var10, var9);
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

   public static ViewOverlayMenuBinding inflate(LayoutInflater var0, ViewGroup var1) {
      if (var1 != null) {
         var0.inflate(R.layout.view_overlay_menu, var1);
         return bind(var1);
      } else {
         throw new NullPointerException("parent");
      }
   }

   @Override
   public View getRoot() {
      return this.rootView;
   }
}
