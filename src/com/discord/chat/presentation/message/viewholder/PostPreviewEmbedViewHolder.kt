package com.discord.chat.presentation.message.viewholder

import android.view.View
import com.discord.chat.bridge.postpreviewembed.PostPreviewEmbed
import com.discord.chat.bridge.spoiler.SpoilerConfig
import com.discord.chat.bridge.structurabletext.StructurableText
import com.discord.chat.presentation.message.view.PostPreviewEmbedView
import com.discord.primitives.ChannelId
import com.discord.primitives.GuildId
import com.discord.primitives.MessageId
import kotlin.jvm.functions.Function4

public class PostPreviewEmbedViewHolder(postPreviewEmbedView: PostPreviewEmbedView) : MessagePartViewHolder {
   private final val postPreviewEmbedView: PostPreviewEmbedView

   init {
      kotlin.jvm.internal.q.h(var1, "postPreviewEmbedView");
      super(var1, null);
      this.postPreviewEmbedView = var1;
   }

   @JvmStatic
   fun `bind$lambda$0`(var0: Function4, var1: PostPreviewEmbed, var2: View) {
      kotlin.jvm.internal.q.h(var0, "$onTapPostPreviewEmbed");
      kotlin.jvm.internal.q.h(var1, "$postPreviewEmbed");
      var0.invoke(
         GuildId.box-impl(var1.getGuildId-fYKD8eg()),
         ChannelId.box-impl(var1.getParentChannelId-o4g7jtM()),
         ChannelId.box-impl(var1.getThreadId-o4g7jtM()),
         MessageId.box-impl(var1.getMessageId-3Eiw7ao())
      );
   }

   public fun bind(postPreviewEmbed: PostPreviewEmbed, onTapPostPreviewEmbed: (GuildId, ChannelId, ChannelId, MessageId) -> Unit, spoilerConfig: SpoilerConfig?) {
      kotlin.jvm.internal.q.h(var1, "postPreviewEmbed");
      kotlin.jvm.internal.q.h(var2, "onTapPostPreviewEmbed");
      val var11: PostPreviewEmbedView = this.postPreviewEmbedView;
      val var15: java.lang.String = var1.getTitle();
      val var7: java.lang.String = var1.getSubtitle();
      val var13: java.lang.String = var1.getCtaText();
      val var4: Int = var1.getCtaButtonColor();
      val var10: java.lang.String = var1.getCoverImage();
      val var12: java.lang.String = var1.getBlurredCoverImage();
      val var8: java.lang.String = var1.getMessageId-3Eiw7ao();
      val var14: StructurableText = var1.getFooter();
      val var9: java.lang.String = var1.getCoverImageOverlayText();
      val var16: java.lang.String = var1.getBackgroundImage();
      val var18: q = new q(var2, var1);
      val var6: Boolean = var1.getShouldSpoiler();
      val var17: java.lang.Boolean = var1.getObscureAwaitingScan();
      val var5: Boolean;
      if (var17 != null) {
         var5 = var17;
      } else {
         var5 = false;
      }

      var11.setPostPreviewEmbed-6_IDHbM(var15, var7, var13, var4, var14, var8, var10, var12, var9, var16, var18, var6, var5, var3);
   }
}
