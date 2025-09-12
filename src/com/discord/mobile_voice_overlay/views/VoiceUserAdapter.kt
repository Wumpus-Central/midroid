package com.discord.mobile_voice_overlay.views

import android.annotation.SuppressLint
import android.content.Context
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView.Adapter
import com.discord.mobile_voice_overlay.MobileVoiceOverlayDataUser

private class VoiceUserAdapter : Adapter {
   private final var data: List<MobileVoiceOverlayDataUser> = CollectionsKt.k()

   public open fun getItemCount(): Int {
      return this.data.size();
   }

   public open fun onBindViewHolder(holder: VoiceUserViewHolder, position: Int) {
      var1.bind(this.data.get(var2));
   }

   public open fun onCreateViewHolder(parent: ViewGroup, viewType: Int): VoiceUserViewHolder {
      val var3: Context = var1.getContext();
      return new VoiceUserViewHolder(new OverlayVoiceBubble(var3));
   }

   @SuppressLint(["NotifyDataSetChanged"])
   public fun setData(data: List<MobileVoiceOverlayDataUser>) {
      this.data = var1;
      this.notifyDataSetChanged();
   }
}
