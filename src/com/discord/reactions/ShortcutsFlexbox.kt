package com.discord.reactions

import android.content.Context
import android.util.AttributeSet
import android.view.View
import android.view.View.OnClickListener
import com.discord.misc.utilities.size.SizeUtilsKt
import com.discord.react_gesture_handler.nested_touch.NestedScrollOnTouchUtilsKt
import com.discord.reactions.ReactionView.Reaction
import com.discord.reactions.ReactionView.ReactionsTheme
import com.discord.theme.DiscordTheme
import com.discord.theme.ThemeManager
import com.google.android.flexbox.FlexboxLayout
import kotlin.jvm.functions.Function1
import kotlin.jvm.internal.SourceDebugExtension

@SourceDebugExtension(["SMAP\nShortcutsFlexbox.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ShortcutsFlexbox.kt\ncom/discord/reactions/ShortcutsFlexbox\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n+ 3 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,155:1\n1872#2,3:156\n1#3:159\n*S KotlinDebug\n*F\n+ 1 ShortcutsFlexbox.kt\ncom/discord/reactions/ShortcutsFlexbox\n*L\n86#1:156,3\n*E\n"])
public class ShortcutsFlexbox  public constructor(context: Context, attrs: AttributeSet? = null) : FlexboxLayout(var1, var2) {
   private final val addReactionView: AddReactionView
   private final val shortcutsView: FlexboxLayout

   fun ShortcutsFlexbox(var1: Context) {
      this(var1, null, 2, null);
   }

   init {
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
      val var4: ReactionView = new ReactionView(var2, null, 2, null);
      this.addView(var4, var1);
      val var3: android.view.ViewGroup.LayoutParams = var4.getLayoutParams();
      val var5: FlexboxLayout.LayoutParams = var3 as FlexboxLayout.LayoutParams;
      (var3 as FlexboxLayout.LayoutParams).setMargins(0, 0, SizeUtilsKt.getDpToPx(4), SizeUtilsKt.getDpToPx(4));
      var4.setLayoutParams(var5);
      return var4;
   }

   private fun getOrCreateReactionView(index: Int): ReactionView {
      if (var1 < this.getChildCount() - 1) {
         val var2: View = this.getChildAt(var1);
         val var4: ReactionView = var2 as ReactionView;
         val var3: android.view.ViewGroup.LayoutParams = (var2 as ReactionView).getLayoutParams();
         var4.setLayoutParams(var3 as FlexboxLayout.LayoutParams);
         var4.setVisibility(0);
         return var4;
      } else {
         return this.createAndAddReactionView(this.getChildCount() - 1);
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
   fun `setReactions$lambda$1`(var0: ReactionView.Reaction): Unit {
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
      val var2: android.view.ViewGroup.LayoutParams = var1.getLayoutParams();
      val var3: FlexboxLayout.LayoutParams = var2 as FlexboxLayout.LayoutParams;
      (var2 as FlexboxLayout.LayoutParams).setMargins(0, 0, SizeUtilsKt.getDpToPx(6), SizeUtilsKt.getDpToPx(4));
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
      val var13: ThemeManager = ThemeManager.INSTANCE;
      val var12: DiscordTheme = ThemeManager.INSTANCE.getThemeOverride();
      var13.setThemeOverride(var9);
      var1 = ShortcutsFlexboxKt.separateAndSortDuplicateReactions(var1);
      val var18: java.util.Iterator = var1.iterator();

      for (int var10 = 0; var18.hasNext(); var10++) {
         var var21: ReactionView = (ReactionView)var18.next();
         if (var10 < 0) {
            CollectionsKt.v();
         }

         val var14: ReactionView.Reaction = var21 as ReactionView.Reaction;
         var21 = this.getOrCreateReactionView(var10);
         var21.setReaction(var14, var5);
         NestedScrollOnTouchUtilsKt.setOnClickListenerNested$default(var21, false, new f(var7, var14), 1, null);
         NestedScrollOnTouchUtilsKt.setOnLongClickListenerNested$default(var21, false, new g(var8, var14), 1, null);
      }

      this.hideRemainingReactionsInRow(var1.size());
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
