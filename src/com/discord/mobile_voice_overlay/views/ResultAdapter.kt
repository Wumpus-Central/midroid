package com.discord.mobile_voice_overlay.views

import android.annotation.SuppressLint
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView.Adapter
import com.discord.mobile_voice_overlay.MobileVoiceOverlaySelectorResult
import com.discord.primitives.ChannelId

private class ResultAdapter(onChannelSelected: (ChannelId) -> Unit) : Adapter {
   private final val onChannelSelected: (ChannelId) -> Unit
   private final var results: List<MobileVoiceOverlaySelectorResult>

   init {
      this.onChannelSelected = var1;
      this.results = CollectionsKt.l();
   }

   public open fun getItemCount(): Int {
      return this.results.size();
   }

   public open fun onBindViewHolder(holder: ResultViewHolder, position: Int) {
      var1.bind(this.results.get(var2));
   }

   public open fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ResultViewHolder {
      return new ResultViewHolder(var1, this.onChannelSelected, null, 4, null);
   }

   @SuppressLint(["NotifyDataSetChanged"])
   public fun setResults(results: List<MobileVoiceOverlaySelectorResult>) {
      this.results = var1;
      this.notifyDataSetChanged();
   }
}
