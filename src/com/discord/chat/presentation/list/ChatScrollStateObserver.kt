package com.discord.chat.presentation.list

import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import androidx.recyclerview.widget.RecyclerView.Adapter
import androidx.recyclerview.widget.RecyclerView.LayoutManager
import androidx.recyclerview.widget.RecyclerView.OnScrollListener
import kotlin.jvm.internal.r
import vh.h

public class ChatScrollStateObserver(scrollStateUpdated: (ScrollState) -> Unit) : OnScrollListener {
   private final var isWatching: Boolean
   private final var scrollState: ScrollState?
   private final var scrollStateInt: Int
   private final val scrollStateUpdated: (ScrollState) -> Unit

   init {
      r.h(var1, "scrollStateUpdated");
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
         val var18: LayoutManager = var1.getLayoutManager();
         r.f(var18, "null cannot be cast to non-null type androidx.recyclerview.widget.LinearLayoutManager");
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

         var21 = (byte)5;
         if (var17) {
            var21 = (byte)15;
         }

         val var13: Boolean;
         if (h.c(var9 - var21, 0) <= var8 && var8 <= var9) {
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

         val var19: Adapter = var1.getAdapter();
         r.f(var19, "null cannot be cast to non-null type com.discord.chat.presentation.list.ChannelChatListAdapter");
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

         var10 = r.c(this.scrollState, var20);
         this.scrollState = var20;
         if (var4 === ChatScrollStateObserver.EmitMode.YES || var4 === ChatScrollStateObserver.EmitMode.IF_CHANGED && var10 xor true) {
            this.scrollStateUpdated.invoke(var20);
         }
      }
   }

   public fun getScrollState(): ScrollState? {
      return this.scrollState;
   }

   public open fun onScrollStateChanged(recyclerView: RecyclerView, newState: Int) {
      r.h(var1, "recyclerView");
      this.computeScrollState(var1, var2, 0, ChatScrollStateObserver.EmitMode.IF_CHANGED);
   }

   public open fun onScrolled(recyclerView: RecyclerView, dx: Int, dy: Int) {
      r.h(var1, "recyclerView");
      this.computeScrollState(var1, this.scrollStateInt, var3, ChatScrollStateObserver.EmitMode.IF_CHANGED);
   }

   public fun startWatching(recyclerView: RecyclerView, emitMode: com.discord.chat.presentation.list.ChatScrollStateObserver.EmitMode) {
      r.h(var1, "recyclerView");
      r.h(var2, "emitMode");
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
      private ChatScrollStateObserver.EmitMode[] $VALUES = $values();
   }

   private object Thresholds {
      public const val NEAR_BOTTOM: Int = 5
      public const val NEAR_TOP: Int = 15
   }
}
