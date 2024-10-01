package com.discord.reactions

import android.content.Context
import android.util.AttributeSet
import android.view.View
import android.view.View.OnClickListener
import android.view.ViewGroup.LayoutParams
import com.discord.misc.utilities.size.SizeUtilsKt
import com.discord.react_gesture_handler.nested_touch.NestedScrollOnTouchUtilsKt
import com.discord.reactions.ReactionView.Reaction
import com.discord.reactions.ReactionView.ReactionsTheme
import com.discord.theme.DiscordTheme
import com.discord.theme.ThemeManager
import com.google.android.flexbox.FlexboxLayout
import kotlin.jvm.functions.Function1
import kotlin.jvm.internal.q

public class ReactionsFlexbox  public constructor(context: Context, attrs: AttributeSet? = null) : FlexboxLayout {
   public final val addBurstReactionView: AddReactionView
   public final val addReactionView: AddReactionView

   fun ReactionsFlexbox(var1: Context) {
      q.h(var1, "context");
      this(var1, null, 2, null);
   }

   init {
      q.h(var1, "context");
      super(var1, var2);
      this.addReactionView = new AddReactionView(var1, null, 2, null);
      this.addBurstReactionView = new AddReactionView(var1, null, 2, null);
      this.setFlexDirection(0);
      this.setFlexWrap(1);
      this.setJustifyContent(0);

      for (int var3 = 0; var3 < 10; var3++) {
         this.addView(this.createReactionView());
      }

      this.addView(this.addReactionView);
      this.addView(this.addBurstReactionView);
      this.setPadding(0, 0, 0, SizeUtilsKt.getDpToPx(-4));
   }

   private fun createReactionView(): ReactionView {
      val var1: Context = this.getContext();
      q.g(var1, "getContext(...)");
      return new ReactionView(var1, null, 2, null);
   }

   private fun getOrCreateReactionView(index: Int): ReactionView {
      val var4: ReactionView;
      if (var1 < this.getChildCount() - 2) {
         val var2: View = this.getChildAt(var1);
         q.f(var2, "null cannot be cast to non-null type com.discord.reactions.ReactionView");
         var4 = var2 as ReactionView;
         (var2 as ReactionView).setVisibility(0);
      } else {
         var4 = this.createReactionView();
         this.addView(var4, this.getChildCount() - 2);
         val var3: LayoutParams = var4.getLayoutParams();
         q.f(var3, "null cannot be cast to non-null type com.google.android.flexbox.FlexboxLayout.LayoutParams");
         val var5: com.google.android.flexbox.FlexboxLayout.LayoutParams = var3 as com.google.android.flexbox.FlexboxLayout.LayoutParams;
         (var3 as com.google.android.flexbox.FlexboxLayout.LayoutParams).setMargins(0, 0, SizeUtilsKt.getDpToPx(4), SizeUtilsKt.getDpToPx(4));
         var4.setLayoutParams(var5);
      }

      return var4;
   }

   private fun hideRemainingReactionsInRow(startIndex: Int) {
      val var2: Int = this.getChildCount();

      while (var1 < var2 - 2) {
         this.getChildAt(var1).setVisibility(8);
         var1++;
      }
   }

   @JvmStatic
   fun `setReactions$lambda$0`(var0: View) {
   }

   @JvmStatic
   fun `setReactions$lambda$1`(var0: View) {
   }

   @JvmStatic
   fun `setReactions$lambda$4$lambda$2`(var0: Function1, var1: ReactionView.Reaction, var2: View) {
      q.h(var0, "$onReactionClick");
      q.h(var1, "$reaction");
      var0.invoke(var1);
   }

   @JvmStatic
   fun `setReactions$lambda$4$lambda$3`(var0: Function1, var1: ReactionView.Reaction, var2: View): Boolean {
      q.h(var0, "$onReactionLongPress");
      q.h(var1, "$reaction");
      var0.invoke(var1);
      return true;
   }

   public fun setReactions(
      reactions: List<Reaction>,
      canAddNewReactions: Boolean,
      canAddNewBurstReactions: Boolean,
      addReactionLabel: String,
      addNewReactionAccessibilityLabel: String,
      addNewBurstReactionAccessibilityLabel: String,
      reactionsTheme: ReactionsTheme?,
      onAddReactionClick: OnClickListener = new c(),
      onAddBurstReactionClick: OnClickListener = new d(),
      onReactionClick: (Reaction) -> Unit,
      onReactionLongPress: (Reaction) -> Unit = <unrepresentable>.INSTANCE,
      theme: DiscordTheme? = null
   ) {
      q.h(var1, "reactions");
      q.h(var4, "addReactionLabel");
      q.h(var5, "addNewReactionAccessibilityLabel");
      q.h(var6, "addNewBurstReactionAccessibilityLabel");
      q.h(var8, "onAddReactionClick");
      q.h(var9, "onAddBurstReactionClick");
      q.h(var10, "onReactionClick");
      q.h(var11, "onReactionLongPress");
      val var15: ThemeManager = ThemeManager.INSTANCE;
      val var14: DiscordTheme = ThemeManager.INSTANCE.getThemeOverride();
      var15.setThemeOverride(var12);
      val var20: java.util.List = ReactionsFlexboxKt.separateAndSortDuplicateReactions(var1);
      val var17: java.util.Iterator = var20.iterator();

      for (int var13 = 0; var17.hasNext(); var13++) {
         var var23: ReactionView = (ReactionView)var17.next();
         if (var13 < 0) {
            i.u();
         }

         val var16: ReactionView.Reaction = var23 as ReactionView.Reaction;
         var23 = this.getOrCreateReactionView(var13);
         var23.setReaction(var16, var7);
         NestedScrollOnTouchUtilsKt.setOnClickListenerNested$default(var23, false, new e(var10, var16), 1, null);
         NestedScrollOnTouchUtilsKt.setOnLongClickListenerNested$default(var23, false, new f(var11, var16), 1, null);
      }

      this.hideRemainingReactionsInRow(var20.size());
      if (var2) {
         this.addReactionView.configure(var4, var7, false);
         this.addReactionView.setContentDescription(var5);
         NestedScrollOnTouchUtilsKt.setOnClickListenerNested$default(this.addReactionView, false, var8, 1, null);
         if (var3) {
            this.addBurstReactionView.configure(var4, var7, true);
            this.addBurstReactionView.setContentDescription(var6);
            NestedScrollOnTouchUtilsKt.setOnClickListenerNested$default(this.addBurstReactionView, false, var9, 1, null);
         }
      }

      var var21: Byte;
      if (var2) {
         var21 = 0;
      } else {
         var21 = 8;
      }

      this.addReactionView.setVisibility(var21);
      if (var3) {
         var21 = 0;
      } else {
         var21 = 8;
      }

      this.addBurstReactionView.setVisibility(var21);
      ThemeManager.INSTANCE.setThemeOverride(var14);
   }
}
