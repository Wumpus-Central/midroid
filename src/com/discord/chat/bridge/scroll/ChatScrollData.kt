package com.discord.chat.bridge.scroll

import kotlinx.serialization.KSerializer
import pc.m

@m
public data class ChatScrollData(type: ChatScrollType, index: Int, animate: Boolean = false, highlight: Boolean = false, position: Int? = null) {
   public final val type: ChatScrollType
   public final val index: Int
   public final val animate: Boolean
   public final val highlight: Boolean
   public final val position: Int?

   init {
      super();
      this.type = var1;
      this.index = var2;
      this.animate = var3;
      this.highlight = var4;
      this.position = var5;
   }

   public operator fun component1(): ChatScrollType {
      return this.type;
   }

   public operator fun component2(): Int {
      return this.index;
   }

   public operator fun component3(): Boolean {
      return this.animate;
   }

   public operator fun component4(): Boolean {
      return this.highlight;
   }

   public operator fun component5(): Int? {
      return this.position;
   }

   public fun copy(
      type: ChatScrollType = var0.type,
      index: Int = var0.index,
      animate: Boolean = var0.animate,
      highlight: Boolean = var0.highlight,
      position: Int? = var0.position
   ): ChatScrollData {
      return new ChatScrollData(var1, var2, var3, var4, var5);
   }

   public override operator fun equals(other: Any?): Boolean {
      if (this === var1) {
         return true;
      } else if (var1 !is ChatScrollData) {
         return false;
      } else {
         var1 = var1;
         if (this.type != var1.type) {
            return false;
         } else if (this.index != var1.index) {
            return false;
         } else if (this.animate != var1.animate) {
            return false;
         } else if (this.highlight != var1.highlight) {
            return false;
         } else {
            return this.position == var1.position;
         }
      }
   }

   public override fun hashCode(): Int {
      val var5: Int = this.type.hashCode();
      val var2: Int = Integer.hashCode(this.index);
      val var3: Int = java.lang.Boolean.hashCode(this.animate);
      val var4: Int = java.lang.Boolean.hashCode(this.highlight);
      val var1: Int;
      if (this.position == null) {
         var1 = 0;
      } else {
         var1 = this.position.hashCode();
      }

      return (((var5 * 31 + var2) * 31 + var3) * 31 + var4) * 31 + var1;
   }

   public override fun toString(): String {
      val var6: ChatScrollType = this.type;
      val var1: Int = this.index;
      val var3: Boolean = this.animate;
      val var2: Boolean = this.highlight;
      val var4: Int = this.position;
      val var5: StringBuilder = new StringBuilder();
      var5.append("ChatScrollData(type=");
      var5.append(var6);
      var5.append(", index=");
      var5.append(var1);
      var5.append(", animate=");
      var5.append(var3);
      var5.append(", highlight=");
      var5.append(var2);
      var5.append(", position=");
      var5.append(var4);
      var5.append(")");
      return var5.toString();
   }

   public companion object {
      public fun serializer(): KSerializer<ChatScrollData> {
         return ChatScrollData.$serializer.INSTANCE;
      }
   }
}
