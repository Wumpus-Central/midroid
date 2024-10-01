package com.discord.chat.presentation.message.viewholder

import android.view.View.OnClickListener
import com.discord.chat.bridge.reaction.MessageReaction
import com.discord.chat.bridge.reaction.ReactionsTheme
import com.discord.reactions.ReactionView
import com.discord.reactions.ReactionsFlexbox
import com.discord.reactions.ReactionView.Reaction
import com.discord.theme.DiscordTheme
import kotlin.jvm.functions.Function1

public class ReactionsViewHolder(reactionsView: ReactionsFlexbox) : MessagePartViewHolder {
   private final val reactionsView: ReactionsFlexbox

   init {
      kotlin.jvm.internal.q.h(var1, "reactionsView");
      super(var1, null);
      this.reactionsView = var1;
   }

   public fun bind(
      reactions: List<MessageReaction>,
      canAddNewReactions: Boolean,
      canAddNewBurstReactions: Boolean,
      addReactionLabel: String,
      addNewReactionAccessibilityLabel: String,
      addNewBurstReactionAccessibilityLabel: String,
      reactionsTheme: ReactionsTheme?,
      onAddReactionClick: OnClickListener,
      onAddBurstReactionClick: OnClickListener,
      onReactionClick: (Reaction) -> Unit,
      onReactionLongPress: (Reaction) -> Unit,
      theme: DiscordTheme? = null
   ) {
      kotlin.jvm.internal.q.h(var1, "reactions");
      kotlin.jvm.internal.q.h(var4, "addReactionLabel");
      kotlin.jvm.internal.q.h(var5, "addNewReactionAccessibilityLabel");
      kotlin.jvm.internal.q.h(var6, "addNewBurstReactionAccessibilityLabel");
      kotlin.jvm.internal.q.h(var8, "onAddReactionClick");
      kotlin.jvm.internal.q.h(var9, "onAddBurstReactionClick");
      kotlin.jvm.internal.q.h(var10, "onReactionClick");
      kotlin.jvm.internal.q.h(var11, "onReactionLongPress");
      this.reactionsView.setReactions(var1, var2, var3, var4, var5, var6, var7, var8, var9, new Function1(var10) {
         final Function1 $onReactionClick;

         {
            super(1);
            this.$onReactionClick = var1;
         }

         public final void invoke(ReactionView.Reaction var1) {
            kotlin.jvm.internal.q.h(var1, "reaction");
            this.$onReactionClick.invoke(var1);
         }
      }, new Function1(var11) {
         final Function1 $onReactionLongPress;

         {
            super(1);
            this.$onReactionLongPress = var1;
         }

         public final void invoke(ReactionView.Reaction var1) {
            kotlin.jvm.internal.q.h(var1, "reaction");
            this.$onReactionLongPress.invoke(var1);
         }
      }, var12);
   }
}
