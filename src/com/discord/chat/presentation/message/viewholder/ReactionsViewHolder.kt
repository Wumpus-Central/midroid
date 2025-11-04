package com.discord.chat.presentation.message.viewholder

import android.view.View.OnClickListener
import com.discord.chat.bridge.reaction.MessageReaction
import com.discord.chat.bridge.reaction.ReactionsTheme
import com.discord.reactions.ReactionView
import com.discord.reactions.ShortcutsFlexbox
import com.discord.reactions.ReactionView.Reaction
import com.discord.theme.DiscordTheme
import kotlin.jvm.functions.Function1

public class ReactionsViewHolder(reactionsView: ShortcutsFlexbox) : MessagePartViewHolder(var1) {
   private final val reactionsView: ShortcutsFlexbox

   init {
      this.reactionsView = var1;
   }

   @JvmStatic
   fun `bind$lambda$0`(var0: Function1, var1: ReactionView.Reaction): Unit {
      var0.invoke(var1);
      return Unit.a;
   }

   @JvmStatic
   fun `bind$lambda$1`(var0: Function1, var1: ReactionView.Reaction): Unit {
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
      theme: DiscordTheme? = null
   ) {
      this.reactionsView.setReactions(var1, var2, var3, var4, var5, var6, new g0(var7), new h0(var8), var9);
   }
}
