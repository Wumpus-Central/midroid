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
   lastVisibleMessageIndex: Int
) {
   public final val firstVisibleMessageIndex: Int
   public final val isAtBottom: Boolean
   public final val isAtTop: Boolean
   public final val isDragging: Boolean
   public final val isFirstMessageVisible: Boolean
   public final val isNearBottom: Boolean
   public final val isNearTop: Boolean
   public final val isSettling: Boolean
   public final val lastVisibleMessageIndex: Int
   public final val scrollDirection: ScrollDirection?

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
      this.lastVisibleMessageIndex = var10;
   }

   public operator fun component1(): Boolean {
      return this.isDragging;
   }

   public operator fun component10(): Int {
      return this.lastVisibleMessageIndex;
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
      lastVisibleMessageIndex: Int = var0.lastVisibleMessageIndex
   ): ScrollState {
      return new ScrollState(var1, var2, var3, var4, var5, var6, var7, var8, var9, var10);
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
         } else {
            return this.lastVisibleMessageIndex == var1.lastVisibleMessageIndex;
         }
      }
   }

   public override fun hashCode(): Int {
      val var5: Int = java.lang.Boolean.hashCode(this.isDragging);
      val var7: Int = java.lang.Boolean.hashCode(this.isSettling);
      val var6: Int = java.lang.Boolean.hashCode(this.isNearBottom);
      val var3: Int = java.lang.Boolean.hashCode(this.isAtBottom);
      val var2: Int = java.lang.Boolean.hashCode(this.isNearTop);
      val var4: Int = java.lang.Boolean.hashCode(this.isAtTop);
      val var1: Int;
      if (this.scrollDirection == null) {
         var1 = 0;
      } else {
         var1 = this.scrollDirection.hashCode();
      }

      return (
               (
                        ((((((var5 * 31 + var7) * 31 + var6) * 31 + var3) * 31 + var2) * 31 + var4) * 31 + var1) * 31
                           + java.lang.Boolean.hashCode(this.isFirstMessageVisible)
                     )
                     * 31
                  + Integer.hashCode(this.firstVisibleMessageIndex)
            )
            * 31
         + Integer.hashCode(this.lastVisibleMessageIndex);
   }

   public override fun toString(): String {
      val var6: Boolean = this.isDragging;
      val var8: Boolean = this.isSettling;
      val var7: Boolean = this.isNearBottom;
      val var3: Boolean = this.isAtBottom;
      val var5: Boolean = this.isNearTop;
      val var4: Boolean = this.isAtTop;
      val var11: ScrollDirection = this.scrollDirection;
      val var9: Boolean = this.isFirstMessageVisible;
      val var1: Int = this.firstVisibleMessageIndex;
      val var2: Int = this.lastVisibleMessageIndex;
      val var10: StringBuilder = new StringBuilder();
      var10.append("ScrollState(isDragging=");
      var10.append(var6);
      var10.append(", isSettling=");
      var10.append(var8);
      var10.append(", isNearBottom=");
      var10.append(var7);
      var10.append(", isAtBottom=");
      var10.append(var3);
      var10.append(", isNearTop=");
      var10.append(var5);
      var10.append(", isAtTop=");
      var10.append(var4);
      var10.append(", scrollDirection=");
      var10.append(var11);
      var10.append(", isFirstMessageVisible=");
      var10.append(var9);
      var10.append(", firstVisibleMessageIndex=");
      var10.append(var1);
      var10.append(", lastVisibleMessageIndex=");
      var10.append(var2);
      var10.append(")");
      return var10.toString();
   }
}
