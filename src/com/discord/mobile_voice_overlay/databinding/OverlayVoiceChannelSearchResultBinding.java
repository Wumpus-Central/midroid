package com.discord.mobile_voice_overlay.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.viewbinding.ViewBinding;
import com.discord.mobile_voice_overlay.R;
import n1.a;

public final class OverlayVoiceChannelSearchResultBinding implements ViewBinding {
   public final TextView categoryName;
   public final TextView channelName;
   public final ConstraintLayout container;
   public final TextView guildName;
   private final ConstraintLayout rootView;

   private OverlayVoiceChannelSearchResultBinding(ConstraintLayout var1, TextView var2, TextView var3, ConstraintLayout var4, TextView var5) {
      this.rootView = var1;
      this.categoryName = var2;
      this.channelName = var3;
      this.container = var4;
      this.guildName = var5;
   }

   public static OverlayVoiceChannelSearchResultBinding bind(View var0) {
      int var1 = R.id.category_name;
      TextView var4 = (TextView)a.a(var0, var1);
      if (var4 != null) {
         var1 = R.id.channel_name;
         TextView var5 = (TextView)a.a(var0, var1);
         if (var5 != null) {
            ConstraintLayout var2 = (ConstraintLayout)var0;
            var1 = R.id.guild_name;
            TextView var3 = (TextView)a.a(var0, var1);
            if (var3 != null) {
               return new OverlayVoiceChannelSearchResultBinding(var2, var4, var5, var2, var3);
            }
         }
      }

      throw new NullPointerException("Missing required view with ID: ".concat(var0.getResources().getResourceName(var1)));
   }

   public static OverlayVoiceChannelSearchResultBinding inflate(LayoutInflater var0) {
      return inflate(var0, null, false);
   }

   public static OverlayVoiceChannelSearchResultBinding inflate(LayoutInflater var0, ViewGroup var1, boolean var2) {
      View var3 = var0.inflate(R.layout.overlay_voice_channel_search_result, var1, false);
      if (var2) {
         var1.addView(var3);
      }

      return bind(var3);
   }

   public ConstraintLayout getRoot() {
      return this.rootView;
   }
}
