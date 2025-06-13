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
      val var10: PostPreviewEmbedView = this.postPreviewEmbedView;
      val var18: java.lang.String = var1.getTitle();
      val var12: java.lang.String = var1.getSubtitle();
      val var14: java.lang.String = var1.getCtaText();
      val var4: Int = var1.getCtaButtonColor();
      val var13: java.lang.String = var1.getCoverImage();
      val var17: java.lang.String = var1.getBlurredCoverImage();
      val var9: java.lang.String = var1.getMessageId-3Eiw7ao();
      val var11: StructurableText = var1.getFooter();
      val var16: java.lang.String = var1.getCoverImageOverlayText();
      val var15: java.lang.String = var1.getBackgroundImage();
      val var21: D = new D(var2, var1);
      val var8: Boolean = var1.getShouldSpoiler();
      var var19: java.lang.Boolean = var1.getObscureAwaitingScan();
      val var5: Boolean;
      if (var19 != null) {
         var5 = var19;
      } else {
         var5 = false;
      }

      var19 = var1.getObscureHideControls();
      val var6: Boolean;
      if (var19 != null) {
         var6 = var19;
      } else {
         var6 = false;
      }

      val var20: java.lang.Boolean = var1.getObscureIsOpaque();
      val var7: Boolean;
      if (var20 != null) {
         var7 = var20;
      } else {
         var7 = false;
      }

      var10.setPostPreviewEmbed-4itWklQ(var18, var12, var14, var4, var11, var9, var13, var17, var16, var15, var21, var8, var5, var6, var7, var3);
   }
}
