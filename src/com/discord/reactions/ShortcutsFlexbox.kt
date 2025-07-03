package com.discord.reactions

import android.content.Context
import android.util.AttributeSet
import android.view.View
import android.view.View.OnClickListener
import android.view.ViewGroup.LayoutParams
import com.discord.misc.utilities.size.SizeUtilsKt
import com.discord.react_asset_fetcher.ReactAsset
import com.discord.react_gesture_handler.nested_touch.NestedScrollOnTouchUtilsKt
import com.discord.reactions.ReactionView.Reaction
import com.discord.reactions.ReactionView.ReactionsTheme
import com.discord.theme.DiscordTheme
import com.discord.theme.ThemeManager
import com.google.android.flexbox.FlexboxLayout
import kotlin.jvm.functions.Function1
import kotlin.jvm.internal.r

public class ShortcutsFlexbox  public constructor(context: Context, attrs: AttributeSet? = null) : FlexboxLayout {
   private final val addReactionView: AddReactionView
   private final val addBurstReactionView: AddReactionView
   private final val shortcutsView: FlexboxLayout
   private final val replyView: AddReactionView
   private final val forwardView: AddReactionView
   private final val threadView: AddReactionView

   fun ShortcutsFlexbox(var1: Context) {
      r.h(var1, "context");
      this(var1, null, 2, null);
   }

   init {
      r.h(var1, "context");
      super(var1, var2);
      this.addReactionView = new AddReactionView(var1, null, 2, null);
      this.addBurstReactionView = new AddReactionView(var1, null, 2, null);
      this.shortcutsView = new FlexboxLayout(var1);
      this.replyView = new AddReactionView(var1, null, 2, null);
      this.forwardView = new AddReactionView(var1, null, 2, null);
      this.threadView = new AddReactionView(var1, null, 2, null);
      this.setFlexDirection(0);
      this.setFlexWrap(1);
      this.setJustifyContent(0);

      for (int var3 = 0; var3 < 10; var3++) {
         this.createAndAddReactionView(var3, false, false, 10);
      }

      this.addView(this.shortcutsView);
      this.shortcutsView.setFlexDirection(0);
      this.shortcutsView.setFlexWrap(0);
      this.shortcutsView.setJustifyContent(0);
      this.replyView.setVisibility(0);
      this.forwardView.setVisibility(0);
      this.threadView.setVisibility(0);
      this.shortcutsView.addView(this.addReactionView);
      this.shortcutsView.addView(this.addBurstReactionView);
      this.shortcutsView.addView(this.replyView);
      this.shortcutsView.addView(this.forwardView);
      this.shortcutsView.addView(this.threadView);
   }

   private fun createAndAddReactionView(index: Int, shortcutsEnabled: Boolean, nonReactionShortcutsVisible: Boolean, processedReactionsCount: Int): ReactionView {
      val var5: Context = this.getContext();
      r.g(var5, "getContext(...)");
      val var9: ReactionView = new ReactionView(var5, null, 2, null);
      this.addView(var9, var1);
      var var7: Byte;
      if (var1 == var4 - 1 && var3) {
         var7 = 12;
      } else {
         var7 = 6;
      }

      var7 = SizeUtilsKt.getDpToPx(var7);
      val var6: LayoutParams = var9.getLayoutParams();
      r.f(var6, "null cannot be cast to non-null type com.google.android.flexbox.FlexboxLayout.LayoutParams");
      val var10: com.google.android.flexbox.FlexboxLayout.LayoutParams = var6 as com.google.android.flexbox.FlexboxLayout.LayoutParams;
      if (!var2) {
         var7 = SizeUtilsKt.getDpToPx(4);
      }

      var10.setMargins(0, 0, var7, SizeUtilsKt.getDpToPx(4));
      var9.setLayoutParams(var10);
      return var9;
   }

   private fun getOrCreateReactionView(index: Int, shortcutsEnabled: Boolean, nonReactionShortcutsVisible: Boolean, processedReactionsCount: Int): ReactionView {
      val var12: ReactionView;
      if (var1 < this.getChildCount() - 1) {
         val var7: View = this.getChildAt(var1);
         r.f(var7, "null cannot be cast to non-null type com.discord.reactions.ReactionView");
         var12 = var7 as ReactionView;
         val var8: LayoutParams = (var7 as ReactionView).getLayoutParams();
         r.f(var8, "null cannot be cast to non-null type com.google.android.flexbox.FlexboxLayout.LayoutParams");
         val var13: com.google.android.flexbox.FlexboxLayout.LayoutParams = var8 as com.google.android.flexbox.FlexboxLayout.LayoutParams;
         if (var2) {
            var var9: Boolean;
            if (var1 == var4 - 1 && var3) {
               var9 = 1;
            } else {
               var9 = 0;
            }

            if (var9) {
               var9 = 12;
            } else {
               var9 = 6;
            }

            var13.setMargins(0, 0, SizeUtilsKt.getDpToPx((int)var9), SizeUtilsKt.getDpToPx(4));
         }

         var12.setLayoutParams(var13);
         var12.setVisibility(0);
      } else {
         var12 = this.createAndAddReactionView(this.getChildCount() - 1, var2, var3, var4);
      }

      return var12;
   }

   private fun handleAnimation(shortcutView: AddReactionView, shouldShowShortcut: Boolean) {
      if (!var2) {
         var1.setVisibility(8);
      } else if (var1.getVisibility() != 0) {
         var1.animateIn();
      }
   }

   private fun hideRemainingReactionsInRow(startIndex: Int) {
      val var2: Int = this.getChildCount();

      while (var1 < var2 - 1) {
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
   fun `setReactions$lambda$2`(var0: ReactionView.Reaction): Unit {
      r.h(var0, "<unused var>");
      return Unit.a;
   }

   @JvmStatic
   fun `setReactions$lambda$3`(var0: View) {
   }

   @JvmStatic
   fun `setReactions$lambda$4`(var0: View) {
   }

   @JvmStatic
   fun `setReactions$lambda$5`(var0: View) {
   }

   @JvmStatic
   fun `setReactions$lambda$8$lambda$6`(var0: Function1, var1: ReactionView.Reaction, var2: View) {
      var0.invoke(var1);
   }

   @JvmStatic
   fun `setReactions$lambda$8$lambda$7`(var0: Function1, var1: ReactionView.Reaction, var2: View): Boolean {
      var0.invoke(var1);
      return true;
   }

   private fun setShortcutMargins(shortcutView: AddReactionView) {
      val var2: LayoutParams = var1.getLayoutParams();
      r.f(var2, "null cannot be cast to non-null type com.google.android.flexbox.FlexboxLayout.LayoutParams");
      val var3: com.google.android.flexbox.FlexboxLayout.LayoutParams = var2 as com.google.android.flexbox.FlexboxLayout.LayoutParams;
      (var2 as com.google.android.flexbox.FlexboxLayout.LayoutParams).setMargins(0, 0, SizeUtilsKt.getDpToPx(6), SizeUtilsKt.getDpToPx(4));
      var1.setLayoutParams(var3);
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
      onReactionLongPress: (Reaction) -> Unit = new e(),
      theme: DiscordTheme? = null,
      showReactionShortcut: Boolean = false,
      showReplyShortcut: Boolean = false,
      showForwardShortcut: Boolean = false,
      showThreadShortcut: Boolean = ...,
      shortcutsEnabled: Boolean = ...,
      onReplyClick: OnClickListener = ...,
      onForwardClick: OnClickListener = ...,
      onThreadClick: OnClickListener = ...,
      replyAccessibilityLabel: String? = ...,
      forwardAccessibilityLabel: String? = ...,
      threadAccessibilityLabel: String? = null
   ) {
      r.h(var1, "reactions");
      r.h(var4, "addReactionLabel");
      r.h(var5, "addNewReactionAccessibilityLabel");
      r.h(var6, "addNewBurstReactionAccessibilityLabel");
      r.h(var8, "onAddReactionClick");
      r.h(var9, "onAddBurstReactionClick");
      r.h(var10, "onReactionClick");
      r.h(var11, "onReactionLongPress");
      r.h(var18, "onReplyClick");
      r.h(var19, "onForwardClick");
      r.h(var20, "onThreadClick");
      val var29: ThemeManager = ThemeManager.INSTANCE;
      val var28: DiscordTheme = ThemeManager.INSTANCE.getThemeOverride();
      var29.setThemeOverride(var12);
      var1 = ShortcutsFlexboxKt.separateAndSortDuplicateReactions(var1);
      val var27: Boolean;
      if (!var14 && !var15 && !var16) {
         var27 = false;
      } else {
         var27 = true;
      }

      val var36: java.util.Iterator = var1.iterator();

      for (int var24 = 0; var36.hasNext(); var24++) {
         var var41: Any = var36.next();
         if (var24 < 0) {
            kotlin.collections.i.u();
         }

         var41 = var41 as ReactionView.Reaction;
         val var30: ReactionView = this.getOrCreateReactionView(var24, var17, var27, var1.size());
         var30.setReaction((ReactionView.Reaction)var41, var7);
         NestedScrollOnTouchUtilsKt.setOnClickListenerNested$default(var30, false, new i(var10, (ReactionView.Reaction)var41), 1, null);
         NestedScrollOnTouchUtilsKt.setOnLongClickListenerNested$default(var30, false, new j(var11, (ReactionView.Reaction)var41), 1, null);
      }

      this.hideRemainingReactionsInRow(var1.size());
      var var37: Boolean;
      if (!var2 && !var13) {
         var37 = 0;
      } else {
         var37 = 1;
      }

      if (var37) {
         AddReactionView.configure$default(this.addReactionView, var4, var7, false, null, 8, null);
         this.addReactionView.setContentDescription(var5);
         NestedScrollOnTouchUtilsKt.setOnClickListenerNested$default(this.addReactionView, false, var8, 1, null);
         this.setShortcutMargins(this.addReactionView);
         if (var3) {
            AddReactionView.configure$default(this.addBurstReactionView, var4, var7, true, null, 8, null);
            this.addBurstReactionView.setContentDescription(var6);
            NestedScrollOnTouchUtilsKt.setOnClickListenerNested$default(this.addBurstReactionView, false, var9, 1, null);
            this.setShortcutMargins(this.addBurstReactionView);
         }
      }

      if (var14) {
         this.replyView.configure("", null, false, ReactAsset.Reply);
         this.setShortcutMargins(this.replyView);
         NestedScrollOnTouchUtilsKt.setOnClickListenerNested$default(this.replyView, false, var18, 1, null);
         this.replyView.setContentDescription(var21);
      }

      if (var15) {
         this.forwardView.configure("", null, false, ReactAsset.ArrowAngleRightUpIcon);
         this.setShortcutMargins(this.forwardView);
         NestedScrollOnTouchUtilsKt.setOnClickListenerNested$default(this.forwardView, false, var19, 1, null);
         this.forwardView.setContentDescription(var22);
      }

      if (var16) {
         this.threadView.configure("", null, false, ReactAsset.Thread);
         this.setShortcutMargins(this.threadView);
         NestedScrollOnTouchUtilsKt.setOnClickListenerNested$default(this.threadView, false, var20, 1, null);
         this.threadView.setContentDescription(var23);
      }

      var var25: Boolean;
      if (!var37 && !var3) {
         var25 = 0;
      } else {
         var25 = 1;
      }

      if (!var27 && !var25) {
         var25 = 8;
      } else {
         var25 = 0;
      }

      this.shortcutsView.setVisibility(var25);
      if (var37) {
         var37 = 0;
      } else {
         var37 = 8;
      }

      this.addReactionView.setVisibility(var37);
      var37 = 8;
      if (var3) {
         var37 = 0;
      }

      this.addBurstReactionView.setVisibility(var37);
      this.handleAnimation(this.replyView, var14);
      this.handleAnimation(this.forwardView, var15);
      this.handleAnimation(this.threadView, var16);
      ThemeManager.INSTANCE.setThemeOverride(var28);
   }
}
