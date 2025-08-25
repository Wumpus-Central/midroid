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
import kotlin.jvm.internal.SourceDebugExtension

@SourceDebugExtension(["SMAP\nActivityInstanceEmbedView.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ActivityInstanceEmbedView.kt\ncom/discord/chat/presentation/message/view/ActivityInstanceEmbedView\n+ 2 View.kt\nandroidx/core/view/ViewKt\n+ 3 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,57:1\n257#2,2:58\n257#2,2:64\n1557#3:60\n1628#3,3:61\n*S KotlinDebug\n*F\n+ 1 ActivityInstanceEmbedView.kt\ncom/discord/chat/presentation/message/view/ActivityInstanceEmbedView\n*L\n46#1:58,2\n53#1:64,2\n48#1:60\n48#1:61,3\n*E\n"])
public class ActivityInstanceEmbedView  public constructor(context: Context, attrs: AttributeSet? = null, defStyleAttr: Int = 0) : ConstraintLayout(
      var1, var2, var3
   ) {
   private final var binding: AppMessageEmbedViewBinding
   private final val appMessageEmbedView: AppMessageEmbedView

   fun ActivityInstanceEmbedView(var1: Context) {
      this(var1, null, 0, 6, null);
   }

   fun ActivityInstanceEmbedView(var1: Context, var2: AttributeSet) {
      this(var1, var2, 0, 4, null);
   }

   init {
      val var4: AppMessageEmbedViewBinding = AppMessageEmbedViewBinding.inflate(LayoutInflater.from(var1), this);
      this.binding = var4;
      val var5: AppMessageEmbedView = new AppMessageEmbedView(var1, var2, var3);
      this.appMessageEmbedView = var5;
      var5.setView(this.binding);
      this.binding.header.setMaxLines(2);
      var5.setDefaultBackground(this);
   }

   public fun initAppMessageEmbed(data: AppMessageEmbedImpl, eventHandler: ChatEventHandler, constrainedWidth: Int) {
      this.appMessageEmbedView.initView(var1, var2, var3);
      this.appMessageEmbedView.setBackgroundGradient(this, var1);
   }

   public fun setParticipantAvatarUris(avatarUris: List<String>) {
      val var3: Boolean = var1.isEmpty();
      var var4: OverlappingCirclesView = this.binding.participants;
      val var2: Byte;
      if (!var3) {
         var2 = 0;
      } else {
         var2 = 8;
      }

      var4.setVisibility(var2);
      var4 = this.binding.participants;
      val var5: ArrayList = new ArrayList(CollectionsKt.v(var1, 10));
      val var6: java.util.Iterator = var1.iterator();

      while (var6.hasNext()) {
         var5.add(new OverlappingItem(var6.next() as java.lang.String));
      }

      var4.setItems(var5);
   }

   public fun setParticipantText(text: String) {
      val var2: TextView = this.binding.participantsText;
      var2.setVisibility(0);
      this.binding.participantsText.setText(var1);
   }
}
