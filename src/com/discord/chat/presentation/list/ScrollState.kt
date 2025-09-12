package com.discord.chat.presentation.list

public data class ScrollState(isDragging: Boolean,
   isSettling: Boolean,
   isNearBottom: Boolean,
   isAtBottom: Boolean,
   isNearTop: Boolean,
   isAtTop: Boolean,
   scrollDirection: ScrollDirection?,
   isFirstMessageVisible: Boolean,
   firstVisibleMessageIndex: Int,
   firstVisibleMessagePercentVisible: Double?,
   lastVisibleMessageIndex: Int,
   lastVisibleMessagePercentVisible: Double?
) {
   public final val isDragging: Boolean
   public final val isSettling: Boolean
   public final val isNearBottom: Boolean
   public final val isAtBottom: Boolean
   public final val isNearTop: Boolean
   public final val isAtTop: Boolean
   public final val scrollDirection: ScrollDirection?
   public final val isFirstMessageVisible: Boolean
   public final val firstVisibleMessageIndex: Int
   public final val firstVisibleMessagePercentVisible: Double?
   public final val lastVisibleMessageIndex: Int
   public final val lastVisibleMessagePercentVisible: Double?

   init {
      this.isDragging = var1;
      this.isSettling = var2;
      this.isNearBottom = var3;
      this.isAtBottom = var4;
      this.isNearTop = var5;
      this.isAtTop = var6;
      this.scrollDirection = var7;
      this.isFirstMessageVisible = var8;
      this.firstVisibleMessageIndex = var9;
      this.firstVisibleMessagePercentVisible = var10;
      this.lastVisibleMessageIndex = var11;
      this.lastVisibleMessagePercentVisible = var12;
   }

   public operator fun component1(): Boolean {
      return this.isDragging;
   }

   public operator fun component10(): Double? {
      return this.firstVisibleMessagePercentVisible;
   }

   public operator fun component11(): Int {
      return this.lastVisibleMessageIndex;
   }

   public operator fun component12(): Double? {
      return this.lastVisibleMessagePercentVisible;
   }

   public operator fun component2(): Boolean {
      return this.isSettling;
   }

   public operator fun component3(): Boolean {
      return this.isNearBottom;
   }

   public operator fun component4(): Boolean {
      return this.isAtBottom;
   }

   public operator fun component5(): Boolean {
      return this.isNearTop;
   }

   public operator fun component6(): Boolean {
      return this.isAtTop;
   }

   public operator fun component7(): ScrollDirection? {
      return this.scrollDirection;
   }

   public operator fun component8(): Boolean {
      return this.isFirstMessageVisible;
   }

   public operator fun component9(): Int {
      return this.firstVisibleMessageIndex;
   }

   public fun copy(
      isDragging: Boolean = var0.isDragging,
      isSettling: Boolean = var0.isSettling,
      isNearBottom: Boolean = var0.isNearBottom,
      isAtBottom: Boolean = var0.isAtBottom,
      isNearTop: Boolean = var0.isNearTop,
      isAtTop: Boolean = var0.isAtTop,
      scrollDirection: ScrollDirection? = var0.scrollDirection,
      isFirstMessageVisible: Boolean = var0.isFirstMessageVisible,
      firstVisibleMessageIndex: Int = var0.firstVisibleMessageIndex,
      firstVisibleMessagePercentVisible: Double? = var0.firstVisibleMessagePercentVisible,
      lastVisibleMessageIndex: Int = var0.lastVisibleMessageIndex,
      lastVisibleMessagePercentVisible: Double? = var0.lastVisibleMessagePercentVisible
   ): ScrollState {
      return new ScrollState(var1, var2, var3, var4, var5, var6, var7, var8, var9, var10, var11, var12);
   }

   public override operator fun equals(other: Any?): Boolean {
      if (this === var1) {
         return true;
      } else if (var1 !is ScrollState) {
         return false;
      } else {
         var1 = var1;
         if (this.isDragging != var1.isDragging) {
            return false;
         } else if (this.isSettling != var1.isSettling) {
            return false;
         } else if (this.isNearBottom != var1.isNearBottom) {
            return false;
         } else if (this.isAtBottom != var1.isAtBottom) {
            return false;
         } else if (this.isNearTop != var1.isNearTop) {
            return false;
         } else if (this.isAtTop != var1.isAtTop) {
            return false;
         } else if (this.scrollDirection != var1.scrollDirection) {
            return false;
         } else if (this.isFirstMessageVisible != var1.isFirstMessageVisible) {
            return false;
         } else if (this.firstVisibleMessageIndex != var1.firstVisibleMessageIndex) {
            return false;
         } else if (!(this.firstVisibleMessagePercentVisible == var1.firstVisibleMessagePercentVisible)) {
            return false;
         } else if (this.lastVisibleMessageIndex != var1.lastVisibleMessageIndex) {
            return false;
         } else {
            return this.lastVisibleMessagePercentVisible == var1.lastVisibleMessagePercentVisible;
         }
      }
   }

   public override fun hashCode(): Int {
      val var9: Int = java.lang.Boolean.hashCode(this.isDragging);
      val var5: Int = java.lang.Boolean.hashCode(this.isSettling);
      val var7: Int = java.lang.Boolean.hashCode(this.isNearBottom);
      val var4: Int = java.lang.Boolean.hashCode(this.isAtBottom);
      val var8: Int = java.lang.Boolean.hashCode(this.isNearTop);
      val var6: Int = java.lang.Boolean.hashCode(this.isAtTop);
      var var3: Int = 0;
      val var1: Int;
      if (this.scrollDirection == null) {
         var1 = 0;
      } else {
         var1 = this.scrollDirection.hashCode();
      }

      val var11: Int = java.lang.Boolean.hashCode(this.isFirstMessageVisible);
      val var10: Int = Integer.hashCode(this.firstVisibleMessageIndex);
      val var2: Int;
      if (this.firstVisibleMessagePercentVisible == null) {
         var2 = 0;
      } else {
         var2 = this.firstVisibleMessagePercentVisible.hashCode();
      }

      val var12: Int = Integer.hashCode(this.lastVisibleMessageIndex);
      if (this.lastVisibleMessagePercentVisible != null) {
         var3 = this.lastVisibleMessagePercentVisible.hashCode();
      }

      return ((((((((((var9 * 31 + var5) * 31 + var7) * 31 + var4) * 31 + var8) * 31 + var6) * 31 + var1) * 31 + var11) * 31 + var10) * 31 + var2) * 31 + var12)
            * 31
         + var3;
   }

   public override fun toString(): String {
      val var9: Boolean = this.isDragging;
      val var8: Boolean = this.isSettling;
      val var4: Boolean = this.isNearBottom;
      val var5: Boolean = this.isAtBottom;
      val var6: Boolean = this.isNearTop;
      val var7: Boolean = this.isAtTop;
      val var10: ScrollDirection = this.scrollDirection;
      val var3: Boolean = this.isFirstMessageVisible;
      val var2: Int = this.firstVisibleMessageIndex;
      val var12: java.lang.Double = this.firstVisibleMessagePercentVisible;
      val var1: Int = this.lastVisibleMessageIndex;
      val var11: java.lang.Double = this.lastVisibleMessagePercentVisible;
      val var13: StringBuilder = new StringBuilder();
      var13.append("ScrollState(isDragging=");
      var13.append(var9);
      var13.append(", isSettling=");
      var13.append(var8);
      var13.append(", isNearBottom=");
      var13.append(var4);
      var13.append(", isAtBottom=");
      var13.append(var5);
      var13.append(", isNearTop=");
      var13.append(var6);
      var13.append(", isAtTop=");
      var13.append(var7);
      var13.append(", scrollDirection=");
      var13.append(var10);
      var13.append(", isFirstMessageVisible=");
      var13.append(var3);
      var13.append(", firstVisibleMessageIndex=");
      var13.append(var2);
      var13.append(", firstVisibleMessagePercentVisible=");
      var13.append(var12);
      var13.append(", lastVisibleMessageIndex=");
      var13.append(var1);
      var13.append(", lastVisibleMessagePercentVisible=");
      var13.append(var11);
      var13.append(")");
      return var13.toString();
   }
}
