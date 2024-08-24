package com.discord.mobile_voice_overlay.views

import android.annotation.SuppressLint
import android.content.Context
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView.Adapter
import com.discord.mobile_voice_overlay.MobileVoiceOverlayDataUser
import kotlin.jvm.internal.r

private class VoiceUserAdapter : Adapter<VoiceUserViewHolder> {
   private final var data: List<MobileVoiceOverlayDataUser> = kotlin.collections.h.i()

   public open fun getItemCount(): Int {
      return this.data.size();
   }

   public open fun onBindViewHolder(holder: VoiceUserViewHolder, position: Int) {
      r.h(var1, "holder");
      var1.bind(this.data.get(var2));
   }

   public open fun onCreateViewHolder(parent: ViewGroup, viewType: Int): VoiceUserViewHolder {
      r.h(var1, "parent");
      val var3: Context = var1.getContext();
      r.g(var3, "parent.context");
      return new VoiceUserViewHolder(new OverlayVoiceBubble(var3));
   }

   @SuppressLint(["NotifyDataSetChanged"])
   public fun setData(data: List<MobileVoiceOverlayDataUser>) {
      r.h(var1, "data");
      this.data = var1;
      this.notifyDataSetChanged();
   }
}
