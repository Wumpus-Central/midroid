package com.discord.chat.presentation.message.view

import android.content.Context
import android.util.AttributeSet
import android.view.LayoutInflater
import android.widget.TextView
import androidx.constraintlayout.widget.ConstraintLayout
import com.discord.chat.bridge.codedlinks.AppMessageEmbedImpl
import com.discord.chat.databinding.AppMessageEmbedViewBinding
import com.discord.chat.presentation.events.ChatEventHandler
import com.discord.overlapping_circles.OverlappingCirclesView
import com.discord.overlapping_circles.OverlappingItem
import java.util.ArrayList

public class ActivityInstanceEmbedView  public constructor(context: Context, attrs: AttributeSet? = null, defStyleAttr: Int = 0) : ConstraintLayout {
   private final var binding: AppMessageEmbedViewBinding
   private final val appMessageEmbedView: AppMessageEmbedView

   fun ActivityInstanceEmbedView(var1: Context) {
      kotlin.jvm.internal.q.h(var1, "context");
      this(var1, null, 0, 6, null);
   }

   fun ActivityInstanceEmbedView(var1: Context, var2: AttributeSet) {
      kotlin.jvm.internal.q.h(var1, "context");
      this(var1, var2, 0, 4, null);
   }

   init {
      kotlin.jvm.internal.q.h(var1, "context");
      super(var1, var2, var3);
      val var4: AppMessageEmbedViewBinding = AppMessageEmbedViewBinding.inflate(LayoutInflater.from(var1), this);
      kotlin.jvm.internal.q.g(var4, "inflate(...)");
      this.binding = var4;
      val var5: AppMessageEmbedView = new AppMessageEmbedView(var1, var2, var3);
      this.appMessageEmbedView = var5;
      var5.setView(this.binding);
      this.binding.header.setMaxLines(2);
      var5.setDefaultBackground(this);
   }

   public fun initAppMessageEmbed(data: AppMessageEmbedImpl, eventHandler: ChatEventHandler, constrainedWidth: Int) {
      kotlin.jvm.internal.q.h(var1, "data");
      kotlin.jvm.internal.q.h(var2, "eventHandler");
      this.appMessageEmbedView.initView(var1, var2, var3);
      this.appMessageEmbedView.setBackgroundGradient(this, var1);
   }

   public fun setParticipantAvatarUris(avatarUris: List<String>) {
      kotlin.jvm.internal.q.h(var1, "avatarUris");
      val var3: Boolean = var1.isEmpty();
      var var4: OverlappingCirclesView = this.binding.participants;
      kotlin.jvm.internal.q.g(this.binding.participants, "participants");
      val var2: Byte;
      if (!var3) {
         var2 = 0;
      } else {
         var2 = 8;
      }

      var4.setVisibility(var2);
      var4 = this.binding.participants;
      val var5: ArrayList = new ArrayList(kotlin.collections.i.v(var1, 10));
      val var6: java.util.Iterator = var1.iterator();

      while (var6.hasNext()) {
         var5.add(new OverlappingItem(var6.next() as java.lang.String));
      }

      var4.setItems(var5);
   }

   public fun setParticipantText(text: String) {
      kotlin.jvm.internal.q.h(var1, "text");
      val var2: TextView = this.binding.participantsText;
      kotlin.jvm.internal.q.g(this.binding.participantsText, "participantsText");
      var2.setVisibility(0);
      this.binding.participantsText.setText(var1);
   }
}
