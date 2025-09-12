package com.discord.mobile_voice_overlay.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.EditText;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.cardview.widget.CardView;
import androidx.recyclerview.widget.RecyclerView;
import androidx.viewbinding.ViewBinding;
import com.discord.mobile_voice_overlay.R;
import com.facebook.drawee.view.SimpleDraweeView;
import y0.a;

public final class OverlayVoiceChannelSelectorBinding implements ViewBinding {
   @NonNull
   public final TextView channelSelect;
   @NonNull
   public final SimpleDraweeView close;
   @NonNull
   public final CardView dialogCard;
   @NonNull
   public final TextView emptyResults;
   @NonNull
   public final LinearLayout menuContainer;
   @NonNull
   public final EditText overlayChannelSearch;
   @NonNull
   public final RecyclerView resultsRv;
   @NonNull
   private final CardView rootView;

   private OverlayVoiceChannelSelectorBinding(
      @NonNull CardView var1,
      @NonNull TextView var2,
      @NonNull SimpleDraweeView var3,
      @NonNull CardView var4,
      @NonNull TextView var5,
      @NonNull LinearLayout var6,
      @NonNull EditText var7,
      @NonNull RecyclerView var8
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

   @NonNull
   public static OverlayVoiceChannelSelectorBinding bind(@NonNull View var0) {
      int var1 = R.id.channel_select;
      TextView var8 = (TextView)a.a(var0, var1);
      if (var8 != null) {
         var1 = R.id.close;
         SimpleDraweeView var3 = (SimpleDraweeView)a.a(var0, var1);
         if (var3 != null) {
            CardView var4 = (CardView)var0;
            var1 = R.id.empty_results;
            TextView var2 = (TextView)a.a(var0, var1);
            if (var2 != null) {
               var1 = R.id.menu_container;
               LinearLayout var5 = (LinearLayout)a.a(var0, var1);
               if (var5 != null) {
                  var1 = R.id.overlay_channel_search;
                  EditText var6 = (EditText)a.a(var0, var1);
                  if (var6 != null) {
                     var1 = R.id.results_rv;
                     RecyclerView var7 = (RecyclerView)a.a(var0, var1);
                     if (var7 != null) {
                        return new OverlayVoiceChannelSelectorBinding(var4, var8, var3, var4, var2, var5, var6, var7);
                     }
                  }
               }
            }
         }
      }

      throw new NullPointerException("Missing required view with ID: ".concat(var0.getResources().getResourceName(var1)));
   }

   @NonNull
   public static OverlayVoiceChannelSelectorBinding inflate(@NonNull LayoutInflater var0) {
      return inflate(var0, null, false);
   }

   @NonNull
   public static OverlayVoiceChannelSelectorBinding inflate(@NonNull LayoutInflater var0, ViewGroup var1, boolean var2) {
      View var3 = var0.inflate(R.layout.overlay_voice_channel_selector, var1, false);
      if (var2) {
         var1.addView(var3);
      }

      return bind(var3);
   }

   @NonNull
   public CardView getRoot() {
      return this.rootView;
   }
}
