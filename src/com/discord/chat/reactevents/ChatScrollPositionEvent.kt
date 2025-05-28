package com.discord.chat.reactevents

import Ka.f
import com.discord.reactevents.ReactEvent
import com.facebook.react.bridge.WritableMap
import kotlin.jvm.internal.q
import kotlinx.serialization.KSerializer

@f
internal data class ChatScrollPositionEvent(isAtBottom: Boolean,
      isNearBottom: Boolean,
      isNearTop: Boolean,
      dragging: Boolean,
      decelerating: Boolean,
      shouldShowJumpToPresent: Boolean,
      isFirstMessageVisible: Boolean,
      firstVisibleMessageIndex: Int,
      firstVisibleMessagePercentVisible: Double?,
      lastVisibleMessageIndex: Int,
      lastVisibleMessagePercentVisible: Double?,
      changesetUpdateId: Int
   ) :
   ReactEvent {
   public final val isAtBottom: Boolean
   public final val isNearBottom: Boolean
   public final val isNearTop: Boolean
   public final val dragging: Boolean
   public final val decelerating: Boolean
   public final val shouldShowJumpToPresent: Boolean
   public final val isFirstMessageVisible: Boolean
   public final val firstVisibleMessageIndex: Int
   public final val firstVisibleMessagePercentVisible: Double?
   public final val lastVisibleMessageIndex: Int
   public final val lastVisibleMessagePercentVisible: Double?
   public final val changesetUpdateId: Int

   init {
      super();
      this.isAtBottom = var1;
      this.isNearBottom = var2;
      this.isNearTop = var3;
      this.dragging = var4;
      this.decelerating = var5;
      this.shouldShowJumpToPresent = var6;
      this.isFirstMessageVisible = var7;
      this.firstVisibleMessageIndex = var8;
      this.firstVisibleMessagePercentVisible = var9;
      this.lastVisibleMessageIndex = var10;
      this.lastVisibleMessagePercentVisible = var11;
      this.changesetUpdateId = var12;
   }

   public operator fun component1(): Boolean {
      return this.isAtBottom;
   }

   public operator fun component10(): Int {
      return this.lastVisibleMessageIndex;
   }

   public operator fun component11(): Double? {
      return this.lastVisibleMessagePercentVisible;
   }

   public operator fun component12(): Int {
      return this.changesetUpdateId;
   }

   public operator fun component2(): Boolean {
      return this.isNearBottom;
   }

   public operator fun component3(): Boolean {
      return this.isNearTop;
   }

   public operator fun component4(): Boolean {
      return this.dragging;
   }

   public operator fun component5(): Boolean {
      return this.decelerating;
   }

   public operator fun component6(): Boolean {
      return this.shouldShowJumpToPresent;
   }

   public operator fun component7(): Boolean {
      return this.isFirstMessageVisible;
   }

   public operator fun component8(): Int {
      return this.firstVisibleMessageIndex;
   }

   public operator fun component9(): Double? {
      return this.firstVisibleMessagePercentVisible;
   }

   public fun copy(
      isAtBottom: Boolean = var0.isAtBottom,
      isNearBottom: Boolean = var0.isNearBottom,
      isNearTop: Boolean = var0.isNearTop,
      dragging: Boolean = var0.dragging,
      decelerating: Boolean = var0.decelerating,
      shouldShowJumpToPresent: Boolean = var0.shouldShowJumpToPresent,
      isFirstMessageVisible: Boolean = var0.isFirstMessageVisible,
      firstVisibleMessageIndex: Int = var0.firstVisibleMessageIndex,
      firstVisibleMessagePercentVisible: Double? = var0.firstVisibleMessagePercentVisible,
      lastVisibleMessageIndex: Int = var0.lastVisibleMessageIndex,
      lastVisibleMessagePercentVisible: Double? = var0.lastVisibleMessagePercentVisible,
      changesetUpdateId: Int = var0.changesetUpdateId
   ): ChatScrollPositionEvent {
      return new ChatScrollPositionEvent(var1, var2, var3, var4, var5, var6, var7, var8, var9, var10, var11, var12);
   }

   public override operator fun equals(other: Any?): Boolean {
      if (this === var1) {
         return true;
      } else if (var1 !is ChatScrollPositionEvent) {
         return false;
      } else {
         var1 = var1;
         if (this.isAtBottom != var1.isAtBottom) {
            return false;
         } else if (this.isNearBottom != var1.isNearBottom) {
            return false;
         } else if (this.isNearTop != var1.isNearTop) {
            return false;
         } else if (this.dragging != var1.dragging) {
            return false;
         } else if (this.decelerating != var1.decelerating) {
            return false;
         } else if (this.shouldShowJumpToPresent != var1.shouldShowJumpToPresent) {
            return false;
         } else if (this.isFirstMessageVisible != var1.isFirstMessageVisible) {
            return false;
         } else if (this.firstVisibleMessageIndex != var1.firstVisibleMessageIndex) {
            return false;
         } else if (!q.c(this.firstVisibleMessagePercentVisible, var1.firstVisibleMessagePercentVisible)) {
            return false;
         } else if (this.lastVisibleMessageIndex != var1.lastVisibleMessageIndex) {
            return false;
         } else if (!q.c(this.lastVisibleMessagePercentVisible, var1.lastVisibleMessagePercentVisible)) {
            return false;
         } else {
            return this.changesetUpdateId == var1.changesetUpdateId;
         }
      }
   }

   public override fun hashCode(): Int {
      val var4: Int = java.lang.Boolean.hashCode(this.isAtBottom);
      val var5: Int = java.lang.Boolean.hashCode(this.isNearBottom);
      val var3: Int = java.lang.Boolean.hashCode(this.isNearTop);
      val var7: Int = java.lang.Boolean.hashCode(this.dragging);
      val var6: Int = java.lang.Boolean.hashCode(this.decelerating);
      val var10: Int = java.lang.Boolean.hashCode(this.shouldShowJumpToPresent);
      val var9: Int = java.lang.Boolean.hashCode(this.isFirstMessageVisible);
      val var8: Int = Integer.hashCode(this.firstVisibleMessageIndex);
      var var2: Int = 0;
      val var1: Int;
      if (this.firstVisibleMessagePercentVisible == null) {
         var1 = 0;
      } else {
         var1 = this.firstVisibleMessagePercentVisible.hashCode();
      }

      val var11: Int = Integer.hashCode(this.lastVisibleMessageIndex);
      if (this.lastVisibleMessagePercentVisible != null) {
         var2 = this.lastVisibleMessagePercentVisible.hashCode();
      }

      return ((((((((((var4 * 31 + var5) * 31 + var3) * 31 + var7) * 31 + var6) * 31 + var10) * 31 + var9) * 31 + var8) * 31 + var1) * 31 + var11) * 31 + var2)
            * 31
         + Integer.hashCode(this.changesetUpdateId);
   }

   override fun serialize(): WritableMap {
      return ReactEvent.DefaultImpls.serialize(this);
   }

   public override fun toString(): String {
      val var10: Boolean = this.isAtBottom;
      val var4: Boolean = this.isNearBottom;
      val var5: Boolean = this.isNearTop;
      val var9: Boolean = this.dragging;
      val var8: Boolean = this.decelerating;
      val var6: Boolean = this.shouldShowJumpToPresent;
      val var7: Boolean = this.isFirstMessageVisible;
      val var1: Int = this.firstVisibleMessageIndex;
      val var11: java.lang.Double = this.firstVisibleMessagePercentVisible;
      val var3: Int = this.lastVisibleMessageIndex;
      val var13: java.lang.Double = this.lastVisibleMessagePercentVisible;
      val var2: Int = this.changesetUpdateId;
      val var12: StringBuilder = new StringBuilder();
      var12.append("ChatScrollPositionEvent(isAtBottom=");
      var12.append(var10);
      var12.append(", isNearBottom=");
      var12.append(var4);
      var12.append(", isNearTop=");
      var12.append(var5);
      var12.append(", dragging=");
      var12.append(var9);
      var12.append(", decelerating=");
      var12.append(var8);
      var12.append(", shouldShowJumpToPresent=");
      var12.append(var6);
      var12.append(", isFirstMessageVisible=");
      var12.append(var7);
      var12.append(", firstVisibleMessageIndex=");
      var12.append(var1);
      var12.append(", firstVisibleMessagePercentVisible=");
      var12.append(var11);
      var12.append(", lastVisibleMessageIndex=");
      var12.append(var3);
      var12.append(", lastVisibleMessagePercentVisible=");
      var12.append(var13);
      var12.append(", changesetUpdateId=");
      var12.append(var2);
      var12.append(")");
      return var12.toString();
   }

   public companion object {
      public fun serializer(): KSerializer<ChatScrollPositionEvent> {
         return ChatScrollPositionEvent.$serializer.INSTANCE;
      }
   }
}
