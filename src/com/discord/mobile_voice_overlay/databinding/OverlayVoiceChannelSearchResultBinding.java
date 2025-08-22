package com.discord.mobile_voice_overlay.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.viewbinding.ViewBinding;
import com.discord.mobile_voice_overlay.R;
import y0.a;

public final class OverlayVoiceChannelSearchResultBinding implements ViewBinding {
   @NonNull
   public final TextView categoryName;
   @NonNull
   public final TextView channelName;
   @NonNull
   public final ConstraintLayout container;
   @NonNull
   public final TextView guildName;
   @NonNull
   private final ConstraintLayout rootView;

   private OverlayVoiceChannelSearchResultBinding(
      @NonNull ConstraintLayout var1, @NonNull TextView var2, @NonNull TextView var3, @NonNull ConstraintLayout var4, @NonNull TextView var5
   ) {
      this.rootView = var1;
      this.categoryName = var2;
      this.channelName = var3;
      this.container = var4;
      this.guildName = var5;
   }

   @NonNull
   public static OverlayVoiceChannelSearchResultBinding bind(@NonNull View var0) {
      int var1 = R.id.category_name;
      TextView var3 = (TextView)a.a(var0, var1);
      if (var3 != null) {
         var1 = R.id.channel_name;
         TextView var5 = (TextView)a.a(var0, var1);
         if (var5 != null) {
            ConstraintLayout var2 = (ConstraintLayout)var0;
            var1 = R.id.guild_name;
            TextView var4 = (TextView)a.a(var0, var1);
            if (var4 != null) {
               return new OverlayVoiceChannelSearchResultBinding(var2, var3, var5, var2, var4);
            }
         }
      }

      throw new NullPointerException("Missing required view with ID: ".concat(var0.getResources().getResourceName(var1)));
   }

   @NonNull
   public static OverlayVoiceChannelSearchResultBinding inflate(@NonNull LayoutInflater var0) {
      return inflate(var0, null, false);
   }

   @NonNull
   public static OverlayVoiceChannelSearchResultBinding inflate(@NonNull LayoutInflater var0, ViewGroup var1, boolean var2) {
      View var3 = var0.inflate(R.layout.overlay_voice_channel_search_result, var1, false);
      if (var2) {
         var1.addView(var3);
      }

      return bind(var3);
   }

   @NonNull
   public ConstraintLayout getRoot() {
      return this.rootView;
   }
}
