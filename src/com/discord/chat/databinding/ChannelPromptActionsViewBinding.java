package com.discord.chat.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.viewbinding.ViewBinding;
import com.discord.chat.R;
import com.discord.core.DCDButton;
import o1.a;

public final class ChannelPromptActionsViewBinding implements ViewBinding {
   public final DCDButton cameraButton;
   public final DCDButton emojiButton;
   public final DCDButton gamingStatsButton;
   public final DCDButton gifButton;
   private final View rootView;

   private ChannelPromptActionsViewBinding(View var1, DCDButton var2, DCDButton var3, DCDButton var4, DCDButton var5) {
      this.rootView = var1;
      this.cameraButton = var2;
      this.emojiButton = var3;
      this.gamingStatsButton = var4;
      this.gifButton = var5;
   }

   public static ChannelPromptActionsViewBinding bind(View var0) {
      int var1 = R.id.camera_button;
      DCDButton var5 = (DCDButton)a.a(var0, var1);
      if (var5 != null) {
         var1 = R.id.emoji_button;
         DCDButton var4 = (DCDButton)a.a(var0, var1);
         if (var4 != null) {
            var1 = R.id.gaming_stats_button;
            DCDButton var2 = (DCDButton)a.a(var0, var1);
            if (var2 != null) {
               var1 = R.id.gif_button;
               DCDButton var3 = (DCDButton)a.a(var0, var1);
               if (var3 != null) {
                  return new ChannelPromptActionsViewBinding(var0, var5, var4, var2, var3);
               }
            }
         }
      }

      throw new NullPointerException("Missing required view with ID: ".concat(var0.getResources().getResourceName(var1)));
   }

   public static ChannelPromptActionsViewBinding inflate(LayoutInflater var0, ViewGroup var1) {
      if (var1 != null) {
         var0.inflate(R.layout.channel_prompt_actions_view, var1);
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
