package com.discord.chat.reactevents

import com.discord.reactevents.ReactEvent
import com.facebook.react.bridge.WritableMap
import kotlinx.serialization.KSerializer
import mb.g

@g
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
         } else if (!(this.firstVisibleMessagePercentVisible == var1.firstVisibleMessagePercentVisible)) {
            return false;
         } else if (this.lastVisibleMessageIndex != var1.lastVisibleMessageIndex) {
            return false;
         } else if (!(this.lastVisibleMessagePercentVisible == var1.lastVisibleMessagePercentVisible)) {
            return false;
         } else {
            return this.changesetUpdateId == var1.changesetUpdateId;
         }
      }
   }

   public override fun hashCode(): Int {
      val var8: Int = java.lang.Boolean.hashCode(this.isAtBottom);
      val var4: Int = java.lang.Boolean.hashCode(this.isNearBottom);
      val var6: Int = java.lang.Boolean.hashCode(this.isNearTop);
      val var7: Int = java.lang.Boolean.hashCode(this.dragging);
      val var9: Int = java.lang.Boolean.hashCode(this.decelerating);
      val var3: Int = java.lang.Boolean.hashCode(this.shouldShowJumpToPresent);
      val var5: Int = java.lang.Boolean.hashCode(this.isFirstMessageVisible);
      val var10: Int = Integer.hashCode(this.firstVisibleMessageIndex);
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

      return ((((((((((var8 * 31 + var4) * 31 + var6) * 31 + var7) * 31 + var9) * 31 + var3) * 31 + var5) * 31 + var10) * 31 + var1) * 31 + var11) * 31 + var2)
            * 31
         + Integer.hashCode(this.changesetUpdateId);
   }

   override fun serialize(): WritableMap {
      return ReactEvent.DefaultImpls.serialize(this);
   }

   public override fun toString(): String {
      val var7: Boolean = this.isAtBottom;
      val var6: Boolean = this.isNearBottom;
      val var4: Boolean = this.isNearTop;
      val var5: Boolean = this.dragging;
      val var10: Boolean = this.decelerating;
      val var8: Boolean = this.shouldShowJumpToPresent;
      val var9: Boolean = this.isFirstMessageVisible;
      val var1: Int = this.firstVisibleMessageIndex;
      val var13: java.lang.Double = this.firstVisibleMessagePercentVisible;
      val var3: Int = this.lastVisibleMessageIndex;
      val var12: java.lang.Double = this.lastVisibleMessagePercentVisible;
      val var2: Int = this.changesetUpdateId;
      val var11: StringBuilder = new StringBuilder();
      var11.append("ChatScrollPositionEvent(isAtBottom=");
      var11.append(var7);
      var11.append(", isNearBottom=");
      var11.append(var6);
      var11.append(", isNearTop=");
      var11.append(var4);
      var11.append(", dragging=");
      var11.append(var5);
      var11.append(", decelerating=");
      var11.append(var10);
      var11.append(", shouldShowJumpToPresent=");
      var11.append(var8);
      var11.append(", isFirstMessageVisible=");
      var11.append(var9);
      var11.append(", firstVisibleMessageIndex=");
      var11.append(var1);
      var11.append(", firstVisibleMessagePercentVisible=");
      var11.append(var13);
      var11.append(", lastVisibleMessageIndex=");
      var11.append(var3);
      var11.append(", lastVisibleMessagePercentVisible=");
      var11.append(var12);
      var11.append(", changesetUpdateId=");
      var11.append(var2);
      var11.append(")");
      return var11.toString();
   }

   public companion object {
      public fun serializer(): KSerializer<ChatScrollPositionEvent> {
         return ChatScrollPositionEvent.$serializer.INSTANCE;
      }
   }
}
