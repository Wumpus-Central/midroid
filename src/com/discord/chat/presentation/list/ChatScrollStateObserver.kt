package com.discord.chat.presentation.list

import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import kotlin.enums.EnumEntries
import kotlin.jvm.internal.q

public class ChatScrollStateObserver(scrollStateUpdated: (ScrollState) -> Unit) : RecyclerView.OnScrollListener {
   private final var isWatching: Boolean
   private final var scrollState: ScrollState?
   private final var scrollStateInt: Int
   private final val scrollStateUpdated: (ScrollState) -> Unit

   init {
      q.h(var1, "scrollStateUpdated");
      super();
      this.scrollStateUpdated = var1;
   }

   private fun computeScrollState(
      recyclerView: RecyclerView,
      scrollStateInt: Int,
      scrollAmountY: Int,
      emitMode: com.discord.chat.presentation.list.ChatScrollStateObserver.EmitMode
   ) {
      if (this.isWatching) {
         this.scrollStateInt = var2;
         val var18: RecyclerView.LayoutManager = var1.getLayoutManager();
         q.f(var18, "null cannot be cast to non-null type androidx.recyclerview.widget.LinearLayoutManager");
         val var26: LinearLayoutManager = var18 as LinearLayoutManager;
         val var17: Boolean = (var18 as LinearLayoutManager).getReverseLayout();
         val var6: Int = (var18 as LinearLayoutManager).findFirstVisibleItemPosition();
         var var10: Boolean;
         if (var6 == 0) {
            var10 = true;
         } else {
            var10 = false;
         }

         var var21: Byte;
         if (var17) {
            var21 = 5;
         } else {
            var21 = 15;
         }

         val var11: Boolean;
         if (var6 <= var21) {
            var11 = true;
         } else {
            var11 = false;
         }

         val var9: Int = var26.getItemCount() - 1;
         val var8: Int = var26.findLastCompletelyVisibleItemPosition();
         val var7: Int = var26.findLastVisibleItemPosition();
         val var12: Boolean;
         if (var8 == var9 && var8 >= 0) {
            var12 = true;
         } else {
            var12 = false;
         }

         if (var17) {
            var21 = (byte)15;
         } else {
            var21 = (byte)5;
         }

         val var13: Boolean;
         if (kotlin.ranges.f.c(var9 - var21, 0) <= var8 && var8 <= var9) {
            var13 = true;
         } else {
            var13 = false;
         }

         val var14: Boolean;
         if (this.scrollStateInt == 1) {
            var14 = true;
         } else {
            var14 = false;
         }

         val var15: Boolean;
         if (this.scrollStateInt == 2) {
            var15 = true;
         } else {
            var15 = false;
         }

         val var27: ScrollDirection;
         if (var3 < 0) {
            var27 = ScrollDirection.UP;
         } else if (var3 > 0) {
            var27 = ScrollDirection.DOWN;
         } else {
            var27 = null;
         }

         val var19: RecyclerView.Adapter = var1.getAdapter();
         q.f(var19, "null cannot be cast to non-null type com.discord.chat.presentation.list.ChannelChatListAdapter");
         var21 = (var19 as ChannelChatListAdapter).getFirstMessageItemPosition();
         val var16: Boolean;
         if (var6 <= var21 && var21 <= var8) {
            var16 = true;
         } else {
            var16 = false;
         }

         val var20: ScrollState;
         if (var17) {
            var20 = new ScrollState(var14, var15, var11, var10, var13, var12, var27, var16, var7, var6);
         } else {
            var20 = new ScrollState(var14, var15, var13, var12, var11, var10, var27, var16, var6, var7);
         }

         var10 = q.c(this.scrollState, var20);
         this.scrollState = var20;
         if (var4 === ChatScrollStateObserver.EmitMode.YES || var4 === ChatScrollStateObserver.EmitMode.IF_CHANGED && var10 xor true) {
            this.scrollStateUpdated.invoke(var20);
         }
      }
   }

   public fun getScrollState(): ScrollState? {
      return this.scrollState;
   }

   public override fun onScrollStateChanged(recyclerView: RecyclerView, newState: Int) {
      q.h(var1, "recyclerView");
      this.computeScrollState(var1, var2, 0, ChatScrollStateObserver.EmitMode.IF_CHANGED);
   }

   public override fun onScrolled(recyclerView: RecyclerView, dx: Int, dy: Int) {
      q.h(var1, "recyclerView");
      this.computeScrollState(var1, this.scrollStateInt, var3, ChatScrollStateObserver.EmitMode.IF_CHANGED);
   }

   public fun startWatching(recyclerView: RecyclerView, emitMode: com.discord.chat.presentation.list.ChatScrollStateObserver.EmitMode) {
      q.h(var1, "recyclerView");
      q.h(var2, "emitMode");
      this.isWatching = true;
      this.computeScrollState(var1, this.scrollStateInt, 0, var2);
   }

   public fun stopWatching() {
      this.isWatching = false;
   }

   public enum class EmitMode {
      IF_CHANGED,
      NO,
      YES      @JvmStatic
      private EnumEntries $ENTRIES;
      @JvmStatic
      private ChatScrollStateObserver.EmitMode[] $VALUES;

      @JvmStatic
      fun {
         val var0: Array<ChatScrollStateObserver.EmitMode> = $values();
         $VALUES = var0;
         $ENTRIES = rh.a.a(var0);
      }

      @JvmStatic
      fun getEntries(): EnumEntries {
         return $ENTRIES;
      }
   }

   private object Thresholds {
      public const val NEAR_BOTTOM: Int = 5
      public const val NEAR_TOP: Int = 15
   }
}
