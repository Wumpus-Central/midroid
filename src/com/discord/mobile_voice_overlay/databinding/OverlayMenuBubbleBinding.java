package com.discord.mobile_voice_overlay.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import androidx.viewbinding.ViewBinding;
import com.discord.mobile_voice_overlay.R;
import com.discord.mobile_voice_overlay.views.OverlayMenuView;
import n1.a;

public final class OverlayMenuBubbleBinding implements ViewBinding {
   public final LinearLayout overlayHeader;
   public final View overlayLinkedAnchorView;
   public final TextView overlayMembersOverflowText;
   public final RecyclerView overlayMembersRecycler;
   public final OverlayMenuView overlayMenu;
   private final LinearLayout rootView;

   private OverlayMenuBubbleBinding(LinearLayout var1, LinearLayout var2, View var3, TextView var4, RecyclerView var5, OverlayMenuView var6) {
      this.rootView = var1;
      this.overlayHeader = var2;
      this.overlayLinkedAnchorView = var3;
      this.overlayMembersOverflowText = var4;
      this.overlayMembersRecycler = var5;
      this.overlayMenu = var6;
   }

   public static OverlayMenuBubbleBinding bind(View var0) {
      int var1 = R.id.overlay_header;
      LinearLayout var2 = (LinearLayout)a.a(var0, var1);
      if (var2 != null) {
         var1 = R.id.overlay_linked_anchor_view;
         View var5 = a.a(var0, var1);
         if (var5 != null) {
            var1 = R.id.overlay_members_overflow_text;
            TextView var3 = (TextView)a.a(var0, var1);
            if (var3 != null) {
               var1 = R.id.overlay_members_recycler;
               RecyclerView var4 = (RecyclerView)a.a(var0, var1);
               if (var4 != null) {
                  var1 = R.id.overlay_menu;
                  OverlayMenuView var6 = (OverlayMenuView)a.a(var0, var1);
                  if (var6 != null) {
                     return new OverlayMenuBubbleBinding((LinearLayout)var0, var2, var5, var3, var4, var6);
                  }
               }
            }
         }
      }

      throw new NullPointerException("Missing required view with ID: ".concat(var0.getResources().getResourceName(var1)));
   }

   public static OverlayMenuBubbleBinding inflate(LayoutInflater var0) {
      return inflate(var0, null, false);
   }

   public static OverlayMenuBubbleBinding inflate(LayoutInflater var0, ViewGroup var1, boolean var2) {
      View var3 = var0.inflate(R.layout.overlay_menu_bubble, var1, false);
      if (var2) {
         var1.addView(var3);
      }

      return bind(var3);
   }

   public LinearLayout getRoot() {
      return this.rootView;
   }
}
