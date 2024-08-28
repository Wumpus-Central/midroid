package com.discord.chat.presentation.message.viewholder

import android.view.View.OnClickListener
import androidx.recyclerview.widget.RecyclerView.RecycledViewPool
import com.discord.chat.bridge.reaction.MessageReaction
import com.discord.chat.bridge.reaction.ReactionsTheme
import com.discord.chat.presentation.root.ChatView
import com.discord.primitives.MessageId
import com.discord.reactions.ReactionsView
import com.discord.reactions.ReactionView.Reaction
import com.discord.theme.DiscordTheme
import kotlin.jvm.functions.Function1

public class ReactionsViewHolder(reactionsView: ReactionsView, recyclerViewPool: RecycledViewPool) : MessagePartViewHolder {
   private final val reactionsView: ReactionsView

   init {
      kotlin.jvm.internal.r.h(var1, "reactionsView");
      kotlin.jvm.internal.r.h(var2, "recyclerViewPool");
      super(var1, null);
      this.reactionsView = var1;
      var1.setViewPool(var2);
   }

   public fun bind(
      messageId: MessageId,
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
      theme: DiscordTheme? = ...
   ) {
      kotlin.jvm.internal.r.h(var1, "messageId");
      kotlin.jvm.internal.r.h(var2, "reactions");
      kotlin.jvm.internal.r.h(var5, "addReactionLabel");
      kotlin.jvm.internal.r.h(var6, "addNewReactionAccessibilityLabel");
      kotlin.jvm.internal.r.h(var7, "addNewBurstReactionAccessibilityLabel");
      kotlin.jvm.internal.r.h(var9, "onAddReactionClick");
      kotlin.jvm.internal.r.h(var10, "onAddBurstReactionClick");
      kotlin.jvm.internal.r.h(var11, "onReactionClick");
      kotlin.jvm.internal.r.h(var12, "onReactionLongPress");
      this.reactionsView.setReactions(var1, var2, var3, var4, var5, var6, var7, var8, var9, var10, new Function1<Reaction, Unit>(var11) {
         final Function1<Reaction, Unit> $onReactionClick;

         {
            super(1);
            this.$onReactionClick = var1;
         }

         public final void invoke(Reaction var1) {
            kotlin.jvm.internal.r.h(var1, "reaction");
            this.$onReactionClick.invoke(var1);
         }
      }, new Function1<Reaction, Unit>(var12) {
         final Function1<Reaction, Unit> $onReactionLongPress;

         {
            super(1);
            this.$onReactionLongPress = var1;
         }

         public final void invoke(Reaction var1) {
            kotlin.jvm.internal.r.h(var1, "reaction");
            this.$onReactionLongPress.invoke(var1);
         }
      }, var13, ChatView.Companion.getAreChatAnimationsEnabled());
   }
}
