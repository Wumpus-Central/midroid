package com.discord.mobile_voice_overlay.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.EditText;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.cardview.widget.CardView;
import androidx.recyclerview.widget.RecyclerView;
import androidx.viewbinding.ViewBinding;
import com.discord.mobile_voice_overlay.R;
import com.facebook.drawee.view.SimpleDraweeView;
import v2.a;

public final class OverlayVoiceChannelSelectorBinding implements ViewBinding {
   public final TextView channelSelect;
   public final SimpleDraweeView close;
   public final CardView dialogCard;
   public final TextView emptyResults;
   public final LinearLayout menuContainer;
   public final EditText overlayChannelSearch;
   public final RecyclerView resultsRv;
   private final CardView rootView;

   private OverlayVoiceChannelSelectorBinding(
      CardView var1, TextView var2, SimpleDraweeView var3, CardView var4, TextView var5, LinearLayout var6, EditText var7, RecyclerView var8
   ) {
      this.rootView = var1;
      this.channelSelect = var2;
      this.close = var3;
      this.dialogCard = var4;
      this.emptyResults = var5;
      this.menuContainer = var6;
      this.overlayChannelSearch = var7;
      this.resultsRv = var8;
   }

   public static OverlayVoiceChannelSelectorBinding bind(View var0) {
      int var1 = R.id.channel_select;
      TextView var7 = (TextView)a.a(var0, var1);
      if (var7 != null) {
         var1 = R.id.close;
         SimpleDraweeView var3 = (SimpleDraweeView)a.a(var0, var1);
         if (var3 != null) {
            CardView var2 = (CardView)var0;
            var1 = R.id.empty_results;
            TextView var5 = (TextView)a.a(var0, var1);
            if (var5 != null) {
               var1 = R.id.menu_container;
               LinearLayout var4 = (LinearLayout)a.a(var0, var1);
               if (var4 != null) {
                  var1 = R.id.overlay_channel_search;
                  EditText var8 = (EditText)a.a(var0, var1);
                  if (var8 != null) {
                     var1 = R.id.results_rv;
                     RecyclerView var6 = (RecyclerView)a.a(var0, var1);
                     if (var6 != null) {
                        return new OverlayVoiceChannelSelectorBinding(var2, var7, var3, var2, var5, var4, var8, var6);
                     }
                  }
               }
            }
         }
      }

      throw new NullPointerException("Missing required view with ID: ".concat(var0.getResources().getResourceName(var1)));
   }

   public static OverlayVoiceChannelSelectorBinding inflate(LayoutInflater var0) {
      return inflate(var0, null, false);
   }

   public static OverlayVoiceChannelSelectorBinding inflate(LayoutInflater var0, ViewGroup var1, boolean var2) {
      View var3 = var0.inflate(R.layout.overlay_voice_channel_selector, var1, false);
      if (var2) {
         var1.addView(var3);
      }

      return bind(var3);
   }

   public CardView getRoot() {
      return this.rootView;
   }
}
