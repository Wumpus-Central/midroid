package com.discord.mobile_voice_overlay.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;
import androidx.viewbinding.ViewBinding;
import com.discord.mobile_voice_overlay.R;
import com.discord.mobile_voice_overlay.views.OverlayMenuView;
import y0.a;

public final class OverlayMenuBubbleBinding implements ViewBinding {
   @NonNull
   public final LinearLayout overlayHeader;
   @NonNull
   public final View overlayLinkedAnchorView;
   @NonNull
   public final TextView overlayMembersOverflowText;
   @NonNull
   public final RecyclerView overlayMembersRecycler;
   @NonNull
   public final OverlayMenuView overlayMenu;
   @NonNull
   private final LinearLayout rootView;

   private OverlayMenuBubbleBinding(
      @NonNull LinearLayout var1,
      @NonNull LinearLayout var2,
      @NonNull View var3,
      @NonNull TextView var4,
      @NonNull RecyclerView var5,
      @NonNull OverlayMenuView var6
   ) {
      this.rootView = var1;
      this.overlayHeader = var2;
      this.overlayLinkedAnchorView = var3;
      this.overlayMembersOverflowText = var4;
      this.overlayMembersRecycler = var5;
      this.overlayMenu = var6;
   }

   @NonNull
   public static OverlayMenuBubbleBinding bind(@NonNull View var0) {
      int var1 = R.id.overlay_header;
      LinearLayout var2 = (LinearLayout)a.a(var0, var1);
      if (var2 != null) {
         var1 = R.id.overlay_linked_anchor_view;
         View var4 = a.a(var0, var1);
         if (var4 != null) {
            var1 = R.id.overlay_members_overflow_text;
            TextView var5 = (TextView)a.a(var0, var1);
            if (var5 != null) {
               var1 = R.id.overlay_members_recycler;
               RecyclerView var3 = (RecyclerView)a.a(var0, var1);
               if (var3 != null) {
                  var1 = R.id.overlay_menu;
                  OverlayMenuView var6 = (OverlayMenuView)a.a(var0, var1);
                  if (var6 != null) {
                     return new OverlayMenuBubbleBinding((LinearLayout)var0, var2, var4, var5, var3, var6);
                  }
               }
            }
         }
      }

      throw new NullPointerException("Missing required view with ID: ".concat(var0.getResources().getResourceName(var1)));
   }

   @NonNull
   public static OverlayMenuBubbleBinding inflate(@NonNull LayoutInflater var0) {
      return inflate(var0, null, false);
   }

   @NonNull
   public static OverlayMenuBubbleBinding inflate(@NonNull LayoutInflater var0, ViewGroup var1, boolean var2) {
      View var3 = var0.inflate(R.layout.overlay_menu_bubble, var1, false);
      if (var2) {
         var1.addView(var3);
      }

      return bind(var3);
   }

   @NonNull
   public LinearLayout getRoot() {
      return this.rootView;
   }
}
