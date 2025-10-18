package com.discord.chat.presentation.message.view.botuikit.react

import android.view.View
import com.discord.chat.bridge.contentnode.CommandMentionContentNode
import com.discord.chat.bridge.contentnode.EmojiContentNode
import com.discord.chat.bridge.contentnode.InlineCodeContentNode
import com.discord.chat.bridge.contentnode.LinkContentNode
import com.discord.chat.bridge.contentnode.SoundmojiContentNode
import com.discord.chat.presentation.message.view.botuikit.ComponentActionEventHandlers
import com.discord.chat.presentation.message.view.botuikit.GeneralEventHandlers
import com.discord.chat.presentation.message.view.botuikit.MarkdownTextRenderEventHandlers
import com.discord.chat.presentation.message.view.botuikit.MarkdownTextRenderOptions
import com.discord.chat.presentation.message.view.botuikit.MediaItemEventHandlers
import com.discord.primitives.UserId

public object ComponentContextDefaults {
   public final val GENERAL_HANDLERS: GeneralEventHandlers = new GeneralEventHandlers(new a(), new c())
   public final val MARKDOWN_OPTIONS: MarkdownTextRenderOptions = new MarkdownTextRenderOptions("", false, false, false, false)
   public final val MARKDOWN_HANDLERS: MarkdownTextRenderEventHandlers =
      new MarkdownTextRenderEventHandlers(
         new i(), new j(), new k(), new m(), new n(), new o(), new p(), new q(), new l(), new r(), new s(), new t(), new u(), new v()
      )
      public final val MEDIA_HANDLERS: MediaItemEventHandlers = new MediaItemEventHandlers(new w(), new x(), new y(), new b(), new d())
   public final val COMPONENT_HANDLERS: ComponentActionEventHandlers = new ComponentActionEventHandlers(new e(), new f(), new g(), new h())

   @JvmStatic
   fun `COMPONENT_HANDLERS$lambda$21`(var0: java.lang.String): Unit {
      throw new Da.q("onTapButtonActionComponent not implemented");
   }

   @JvmStatic
   fun `COMPONENT_HANDLERS$lambda$22`(var0: java.lang.String): Unit {
      throw new Da.q("onTapButtonLinkComponent not implemented");
   }

   @JvmStatic
   fun `COMPONENT_HANDLERS$lambda$23`(var0: java.lang.String): Unit {
      throw new Da.q("onTapSelectActionComponent not implemented");
   }

   @JvmStatic
   fun `COMPONENT_HANDLERS$lambda$24`(var0: UserId, var1: java.lang.String, var2: java.lang.String): Unit {
      throw new Da.q("onTapContentInventoryEntry not implemented");
   }

   @JvmStatic
   fun `GENERAL_HANDLERS$lambda$0`(var0: java.lang.String, var1: java.lang.String): Unit {
      throw new Da.q("onLinkClicked not implemented");
   }

   @JvmStatic
   fun `GENERAL_HANDLERS$lambda$1`(): Unit {
      throw new Da.q("onTapSpoiler not implemented");
   }

   @JvmStatic
   fun `MARKDOWN_HANDLERS$lambda$10`(var0: CommandMentionContentNode): Unit {
      throw new Da.q("onLongPressCommand not implemented");
   }

   @JvmStatic
   fun `MARKDOWN_HANDLERS$lambda$11`(): Unit {
      throw new Da.q("onTapSpoiler not implemented");
   }

   @JvmStatic
   fun `MARKDOWN_HANDLERS$lambda$12`(var0: java.lang.String): Unit {
      throw new Da.q("onTapTimestamp not implemented");
   }

   @JvmStatic
   fun `MARKDOWN_HANDLERS$lambda$13`(var0: InlineCodeContentNode): Unit {
      throw new Da.q("onTapInlineCode not implemented");
   }

   @JvmStatic
   fun `MARKDOWN_HANDLERS$lambda$14`(var0: EmojiContentNode): Unit {
      throw new Da.q("onTapEmoji not implemented");
   }

   @JvmStatic
   fun `MARKDOWN_HANDLERS$lambda$15`(var0: SoundmojiContentNode): Unit {
      throw new Da.q("onTapSoundmoji not implemented");
   }

   @JvmStatic
   fun `MARKDOWN_HANDLERS$lambda$2`(var0: LinkContentNode): Unit {
      throw new Da.q("onLinkClicked not implemented");
   }

   @JvmStatic
   fun `MARKDOWN_HANDLERS$lambda$3`(var0: LinkContentNode): Unit {
      throw new Da.q("onLinkLongClicked not implemented");
   }

   @JvmStatic
   fun `MARKDOWN_HANDLERS$lambda$4`(var0: java.lang.String, var1: java.lang.String, var2: java.lang.String): Unit {
      throw new Da.q("onTapChannel not implemented");
   }

   @JvmStatic
   fun `MARKDOWN_HANDLERS$lambda$5`(var0: java.lang.String, var1: java.lang.String, var2: java.lang.String, var3: java.lang.String): Unit {
      throw new Da.q("onLongPressChannel not implemented");
   }

   @JvmStatic
   fun `MARKDOWN_HANDLERS$lambda$6`(var0: java.lang.String): Unit {
      throw new Da.q("onTapAttachmentLink not implemented");
   }

   @JvmStatic
   fun `MARKDOWN_HANDLERS$lambda$7`(var0: java.lang.String, var1: java.lang.String): Unit {
      throw new Da.q("onLongPressAttachmentLink not implemented");
   }

   @JvmStatic
   fun `MARKDOWN_HANDLERS$lambda$8`(var0: java.lang.String, var1: java.lang.String, var2: java.lang.String, var3: java.lang.String): Unit {
      throw new Da.q("onTapMention not implemented");
   }

   @JvmStatic
   fun `MARKDOWN_HANDLERS$lambda$9`(var0: CommandMentionContentNode): Unit {
      throw new Da.q("onTapCommand not implemented");
   }

   @JvmStatic
   fun `MEDIA_HANDLERS$lambda$16`(var0: View, var1: java.lang.String, var2: Int, var3: java.lang.Double): Unit {
      throw new Da.q("onMediaItemClicked not implemented");
   }

   @JvmStatic
   fun `MEDIA_HANDLERS$lambda$17`(var0: java.lang.String, var1: Int): Unit {
      throw new Da.q("onMediaItemLongClicked not implemented");
   }

   @JvmStatic
   fun `MEDIA_HANDLERS$lambda$18`(): Unit {
      throw new Da.q("onMediaItemSpoilerClicked not implemented");
   }

   @JvmStatic
   fun `MEDIA_HANDLERS$lambda$19`(var0: java.lang.String): Unit {
      throw new Da.q("onMediaItemAltTextButtonClicked not implemented");
   }

   @JvmStatic
   fun `MEDIA_HANDLERS$lambda$20`(var0: Boolean): Unit {
      throw new Da.q("onMediaItemObscureToggle not implemented");
   }
}
