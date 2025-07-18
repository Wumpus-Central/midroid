package com.discord.chat.presentation.message.viewholder

import android.view.View.OnClickListener
import com.discord.chat.bridge.reaction.MessageReaction
import com.discord.chat.bridge.reaction.ReactionsTheme
import com.discord.reactions.ReactionView
import com.discord.reactions.ShortcutsFlexbox
import com.discord.reactions.ReactionView.Reaction
import com.discord.theme.DiscordTheme
import kotlin.jvm.functions.Function1

public class ReactionsViewHolder(reactionsView: ShortcutsFlexbox) : MessagePartViewHolder {
   private final val reactionsView: ShortcutsFlexbox

   init {
      kotlin.jvm.internal.r.h(var1, "reactionsView");
      super(var1, null);
      this.reactionsView = var1;
   }

   @JvmStatic
   fun `bind$lambda$0`(var0: Function1, var1: ReactionView.Reaction): Unit {
      kotlin.jvm.internal.r.h(var1, "reaction");
      var0.invoke(var1);
      return Unit.a;
   }

   @JvmStatic
   fun `bind$lambda$1`(var0: Function1, var1: ReactionView.Reaction): Unit {
      kotlin.jvm.internal.r.h(var1, "reaction");
      var0.invoke(var1);
      return Unit.a;
   }

   public fun bind(
      reactions: List<MessageReaction>,
      canAddNewReactions: Boolean,
      addReactionLabel: String,
      addNewReactionAccessibilityLabel: String,
      reactionsTheme: ReactionsTheme?,
      onAddReactionClick: OnClickListener,
      onReactionClick: (Reaction) -> Unit,
      onReactionLongPress: (Reaction) -> Unit,
      theme: DiscordTheme? = null,
      showReactionShortcut: Boolean = false,
      showReplyShortcut: Boolean = false,
      showForwardShortcut: Boolean = false,
      showThreadShortcut: Boolean = false,
      shortcutsEnabled: Boolean = false,
      onReplyClick: OnClickListener,
      onForwardClick: OnClickListener,
      onThreadClick: OnClickListener,
      replyAccessibilityLabel: String? = ...,
      forwardAccessibilityLabel: String? = ...,
      threadAccessibilityLabel: String? = null
   ) {
      kotlin.jvm.internal.r.h(var1, "reactions");
      kotlin.jvm.internal.r.h(var3, "addReactionLabel");
      kotlin.jvm.internal.r.h(var4, "addNewReactionAccessibilityLabel");
      kotlin.jvm.internal.r.h(var6, "onAddReactionClick");
      kotlin.jvm.internal.r.h(var7, "onReactionClick");
      kotlin.jvm.internal.r.h(var8, "onReactionLongPress");
      kotlin.jvm.internal.r.h(var15, "onReplyClick");
      kotlin.jvm.internal.r.h(var16, "onForwardClick");
      kotlin.jvm.internal.r.h(var17, "onThreadClick");
      this.reactionsView
         .setReactions(
            var1, var2, var3, var4, var5, var6, new E(var7), new F(var8), var9, var10, var11, var12, var13, var14, var15, var16, var17, var18, var19, var20
         );
   }
}
