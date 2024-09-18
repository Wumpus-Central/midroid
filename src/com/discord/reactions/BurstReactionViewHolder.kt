package com.discord.reactions

import android.view.View
import androidx.recyclerview.widget.RecyclerView
import com.discord.react_gesture_handler.nested_touch.NestedScrollOnTouchUtilsKt
import com.discord.reactions.ReactionView.Reaction
import kotlin.jvm.functions.Function1
import kotlin.jvm.internal.q

internal class BurstReactionViewHolder(reactionView: BurstReactionView) : RecyclerView.ViewHolder {
   private final val reactionView: BurstReactionView

   init {
      q.h(var1, "reactionView");
      super(var1);
      this.reactionView = var1;
   }

   @JvmStatic
   fun `bind$lambda$2$lambda$0`(var0: Function1, var1: ReactionView.Reaction, var2: View) {
      q.h(var0, "$onReactionClick");
      q.h(var1, "$reaction");
      var0.invoke(var1);
   }

   @JvmStatic
   fun `bind$lambda$2$lambda$1`(var0: Function1, var1: ReactionView.Reaction, var2: View): Boolean {
      q.h(var0, "$onReactionLongPress");
      q.h(var1, "$reaction");
      var0.invoke(var1);
      return true;
   }

   public fun bind(reaction: Reaction, onReactionClick: (Reaction) -> Unit, onReactionLongPress: (Reaction) -> Unit) {
      q.h(var1, "reaction");
      q.h(var2, "onReactionClick");
      q.h(var3, "onReactionLongPress");
      val var4: BurstReactionView = this.reactionView;
      this.reactionView.setReaction(var1);
      NestedScrollOnTouchUtilsKt.setOnClickListenerNested$default(var4, false, new a(var2, var1), 1, null);
      NestedScrollOnTouchUtilsKt.setOnLongClickListenerNested$default(var4, false, new b(var3, var1), 1, null);
   }
}
