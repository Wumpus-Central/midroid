package com.discord.mobile_voice_overlay.views

import android.annotation.SuppressLint
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.discord.mobile_voice_overlay.MobileVoiceOverlaySelectorResult
import com.discord.primitives.ChannelId
import kotlin.jvm.internal.q

private class ResultAdapter(onChannelSelected: (ChannelId) -> Unit) : RecyclerView.Adapter {
   private final val onChannelSelected: (ChannelId) -> Unit
   private final var results: List<MobileVoiceOverlaySelectorResult>

   init {
      q.h(var1, "onChannelSelected");
      super();
      this.onChannelSelected = var1;
      this.results = i.j();
   }

   public override fun getItemCount(): Int {
      return this.results.size();
   }

   public open fun onBindViewHolder(holder: ResultViewHolder, position: Int) {
      q.h(var1, "holder");
      var1.bind(this.results.get(var2));
   }

   public open fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ResultViewHolder {
      q.h(var1, "parent");
      return new ResultViewHolder(var1, this.onChannelSelected, null, 4, null);
   }

   @SuppressLint(["NotifyDataSetChanged"])
   public fun setResults(results: List<MobileVoiceOverlaySelectorResult>) {
      q.h(var1, "results");
      this.results = var1;
      this.notifyDataSetChanged();
   }
}
