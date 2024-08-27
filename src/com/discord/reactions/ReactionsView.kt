package com.discord.reactions

import android.content.Context
import android.util.AttributeSet
import android.view.View
import android.view.View.OnClickListener
import androidx.recyclerview.widget.DefaultItemAnimator
import androidx.recyclerview.widget.RecyclerView
import androidx.recyclerview.widget.RecyclerView.ItemAnimator
import androidx.recyclerview.widget.RecyclerView.RecycledViewPool
import com.discord.misc.utilities.size.SizeUtilsKt
import com.discord.reactions.ReactionView.Reaction
import com.discord.reactions.ReactionView.ReactionsTheme
import com.discord.recycler_view.decorations.HorizontalSpacingItemDecoration
import com.discord.recycler_view.decorations.VerticalSpacingItemDecoration
import com.discord.theme.DiscordTheme
import kotlin.jvm.internal.r

public class ReactionsView  public constructor(context: Context, attrs: AttributeSet? = null) : RecyclerView {
   private final val adapter: ReactionsViewAdapter

   fun ReactionsView(var1: Context) {
      r.h(var1, "context");
      this(var1, null, 2, null);
   }

   init {
      r.h(var1, "context");
      super(var1, var2);
      val var4: ReactionsFlexboxLayoutManager = new ReactionsFlexboxLayoutManager(var1);
      var4.setRecycleChildrenOnDetach(false);
      this.setLayoutManager(var4);
      val var5: ReactionsViewAdapter = new ReactionsViewAdapter(REACTION_HEIGHT);
      this.adapter = var5;
      this.setAdapter(var5);
      val var3: Int = SizeUtilsKt.getDpToPx(4);
      this.addItemDecoration(new HorizontalSpacingItemDecoration(var3));
      this.addItemDecoration(new VerticalSpacingItemDecoration(var3, 0, var3, false, 10, null));
      val var8: ItemAnimator = this.getItemAnimator();
      var var6: DefaultItemAnimator = null;
      if (var8 != null) {
         var var7: ItemAnimator = var8;
         if (var8 !is DefaultItemAnimator) {
            var7 = null;
         }

         var6 = var7 as DefaultItemAnimator;
      }

      r.e(var6);
      var6.setSupportsChangeAnimations(false);
   }

   @JvmStatic
   fun `setReactions$lambda$1`(var0: View) {
   }

   @JvmStatic
   fun `setReactions$lambda$2`(var0: View) {
   }

   public fun setReactions(
      messageId: String,
      reactions: List<Reaction>,
      canAddNewReactions: Boolean,
      canAddNewBurstReactions: Boolean,
      addReactionLabel: String,
      addNewReactionAccessibilityLabel: String,
      addNewBurstReactionAccessibilityLabel: String,
      reactionsTheme: ReactionsTheme?,
      onAddReactionClick: OnClickListener = new e(),
      onAddBurstReactionClick: OnClickListener = new f(),
      onReactionClick: (Reaction) -> Unit,
      onReactionLongPress: (Reaction) -> Unit = <unrepresentable>.INSTANCE,
      theme: DiscordTheme? = null,
      areChatAnimationsEnabled: Boolean = false
   ) {
      r.h(var1, "messageId");
      r.h(var2, "reactions");
      r.h(var5, "addReactionLabel");
      r.h(var6, "addNewReactionAccessibilityLabel");
      r.h(var7, "addNewBurstReactionAccessibilityLabel");
      r.h(var9, "onAddReactionClick");
      r.h(var10, "onAddBurstReactionClick");
      r.h(var11, "onReactionClick");
      r.h(var12, "onReactionLongPress");
      this.adapter
         .setReactions(
            var1, ReactionsViewKt.separateAndSortDuplicateReactions(var2), var3, var4, var5, var6, var7, var8, var9, var10, var11, var12, var13, var14
         );
   }

   public fun setViewPool(viewPool: RecycledViewPool) {
      r.h(var1, "viewPool");
      this.setRecycledViewPool(var1);
   }

   public companion object {
      private final val REACTION_HEIGHT: Int
   }
}
