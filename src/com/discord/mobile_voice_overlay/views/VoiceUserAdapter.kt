package com.discord.mobile_voice_overlay.views

import android.annotation.SuppressLint
import android.content.Context
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.discord.mobile_voice_overlay.MobileVoiceOverlayDataUser
import kotlin.jvm.internal.q

private class VoiceUserAdapter : RecyclerView.Adapter {
   private final var data: List<MobileVoiceOverlayDataUser> = i.k()

   public override fun getItemCount(): Int {
      return this.data.size();
   }

   public open fun onBindViewHolder(holder: VoiceUserViewHolder, position: Int) {
      q.h(var1, "holder");
      var1.bind(this.data.get(var2));
   }

   public open fun onCreateViewHolder(parent: ViewGroup, viewType: Int): VoiceUserViewHolder {
      q.h(var1, "parent");
      val var3: Context = var1.getContext();
      q.g(var3, "getContext(...)");
      return new VoiceUserViewHolder(new OverlayVoiceBubble(var3));
   }

   @SuppressLint(["NotifyDataSetChanged"])
   public fun setData(data: List<MobileVoiceOverlayDataUser>) {
      q.h(var1, "data");
      this.data = var1;
      this.notifyDataSetChanged();
   }
}
