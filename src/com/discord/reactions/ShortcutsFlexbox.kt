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
import kotlin.jvm.internal.r

public class ShortcutsFlexbox  public constructor(context: Context, attrs: AttributeSet? = null) : FlexboxLayout {
   private final val addReactionView: AddReactionView
   private final val shortcutsView: FlexboxLayout

   fun ShortcutsFlexbox(var1: Context) {
      r.h(var1, "context");
      this(var1, null, 2, null);
   }

   init {
      r.h(var1, "context");
      super(var1, var2);
      this.addReactionView = new AddReactionView(var1, null, 2, null);
      this.shortcutsView = new FlexboxLayout(var1);
      this.setFlexDirection(0);
      this.setFlexWrap(1);
      this.setJustifyContent(0);

      for (int var3 = 0; var3 < 10; var3++) {
         this.createAndAddReactionView(var3);
      }

      this.addView(this.shortcutsView);
      this.shortcutsView.setFlexDirection(0);
      this.shortcutsView.setFlexWrap(0);
      this.shortcutsView.setJustifyContent(0);
      this.shortcutsView.addView(this.addReactionView);
   }

   private fun createAndAddReactionView(index: Int): ReactionView {
      val var2: Context = this.getContext();
      r.g(var2, "getContext(...)");
      val var4: ReactionView = new ReactionView(var2, null, 2, null);
      this.addView(var4, var1);
      val var3: LayoutParams = var4.getLayoutParams();
      r.f(var3, "null cannot be cast to non-null type com.google.android.flexbox.FlexboxLayout.LayoutParams");
      val var5: com.google.android.flexbox.FlexboxLayout.LayoutParams = var3 as com.google.android.flexbox.FlexboxLayout.LayoutParams;
      (var3 as com.google.android.flexbox.FlexboxLayout.LayoutParams).setMargins(0, 0, SizeUtilsKt.getDpToPx(4), SizeUtilsKt.getDpToPx(4));
      var4.setLayoutParams(var5);
      return var4;
   }

   private fun getOrCreateReactionView(index: Int): ReactionView {
      val var4: ReactionView;
      if (var1 < this.getChildCount() - 1) {
         val var2: View = this.getChildAt(var1);
         r.f(var2, "null cannot be cast to non-null type com.discord.reactions.ReactionView");
         var4 = var2 as ReactionView;
         val var3: LayoutParams = (var2 as ReactionView).getLayoutParams();
         r.f(var3, "null cannot be cast to non-null type com.google.android.flexbox.FlexboxLayout.LayoutParams");
         var4.setLayoutParams(var3 as com.google.android.flexbox.FlexboxLayout.LayoutParams);
         var4.setVisibility(0);
      } else {
         var4 = this.createAndAddReactionView(this.getChildCount() - 1);
      }

      return var4;
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
   fun `setReactions$lambda$1`(var0: ReactionView.Reaction): Unit {
      r.h(var0, "<unused var>");
      return Unit.a;
   }

   @JvmStatic
   fun `setReactions$lambda$4$lambda$2`(var0: Function1, var1: ReactionView.Reaction, var2: View) {
      var0.invoke(var1);
   }

   @JvmStatic
   fun `setReactions$lambda$4$lambda$3`(var0: Function1, var1: ReactionView.Reaction, var2: View): Boolean {
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
      addReactionLabel: String,
      addNewReactionAccessibilityLabel: String,
      reactionsTheme: ReactionsTheme?,
      onAddReactionClick: OnClickListener = new d(),
      onReactionClick: (Reaction) -> Unit,
      onReactionLongPress: (Reaction) -> Unit = new e(),
      theme: DiscordTheme? = null
   ) {
      r.h(var1, "reactions");
      r.h(var3, "addReactionLabel");
      r.h(var4, "addNewReactionAccessibilityLabel");
      r.h(var6, "onAddReactionClick");
      r.h(var7, "onReactionClick");
      r.h(var8, "onReactionLongPress");
      val var13: ThemeManager = ThemeManager.INSTANCE;
      val var12: DiscordTheme = ThemeManager.INSTANCE.getThemeOverride();
      var13.setThemeOverride(var9);
      val var18: java.util.List = ShortcutsFlexboxKt.separateAndSortDuplicateReactions(var1);
      val var15: java.util.Iterator = var18.iterator();

      for (int var10 = 0; var15.hasNext(); var10++) {
         var var21: ReactionView = (ReactionView)var15.next();
         if (var10 < 0) {
            i.u();
         }

         val var14: ReactionView.Reaction = var21 as ReactionView.Reaction;
         var21 = this.getOrCreateReactionView(var10);
         var21.setReaction(var14, var5);
         NestedScrollOnTouchUtilsKt.setOnClickListenerNested$default(var21, false, new f(var7, var14), 1, null);
         NestedScrollOnTouchUtilsKt.setOnLongClickListenerNested$default(var21, false, new g(var8, var14), 1, null);
      }

      this.hideRemainingReactionsInRow(var18.size());
      if (var2) {
         AddReactionView.configure$default(this.addReactionView, var3, var5, false, null, 8, null);
         this.addReactionView.setContentDescription(var4);
         NestedScrollOnTouchUtilsKt.setOnClickListenerNested$default(this.addReactionView, false, var6, 1, null);
         this.setShortcutMargins(this.addReactionView);
      }

      var var19: Byte;
      if (var2) {
         var19 = 0;
      } else {
         var19 = 8;
      }

      this.shortcutsView.setVisibility(var19);
      if (var2) {
         var19 = 0;
      } else {
         var19 = 8;
      }

      this.addReactionView.setVisibility(var19);
      ThemeManager.INSTANCE.setThemeOverride(var12);
   }
}
