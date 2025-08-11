package com.discord.chat.reactevents

import com.discord.reactevents.ReactEvent
import com.facebook.react.bridge.WritableMap
import kotlin.jvm.internal.r
import kotlinx.serialization.KSerializer
import tb.g

@g
internal data class FirstLayoutData(firstVisibleMessageIndex: Int,
      firstVisibleMessagePercentVisible: Double?,
      lastVisibleMessageIndex: Int,
      lastVisibleMessagePercentVisible: Double?
   ) :
   ReactEvent {
   public final val firstVisibleMessageIndex: Int
   public final val firstVisibleMessagePercentVisible: Double?
   public final val lastVisibleMessageIndex: Int
   public final val lastVisibleMessagePercentVisible: Double?

   init {
      super();
      this.firstVisibleMessageIndex = var1;
      this.firstVisibleMessagePercentVisible = var2;
      this.lastVisibleMessageIndex = var3;
      this.lastVisibleMessagePercentVisible = var4;
   }

   public operator fun component1(): Int {
      return this.firstVisibleMessageIndex;
   }

   public operator fun component2(): Double? {
      return this.firstVisibleMessagePercentVisible;
   }

   public operator fun component3(): Int {
      return this.lastVisibleMessageIndex;
   }

   public operator fun component4(): Double? {
      return this.lastVisibleMessagePercentVisible;
   }

   public fun copy(
      firstVisibleMessageIndex: Int = var0.firstVisibleMessageIndex,
      firstVisibleMessagePercentVisible: Double? = var0.firstVisibleMessagePercentVisible,
      lastVisibleMessageIndex: Int = var0.lastVisibleMessageIndex,
      lastVisibleMessagePercentVisible: Double? = var0.lastVisibleMessagePercentVisible
   ): FirstLayoutData {
      return new FirstLayoutData(var1, var2, var3, var4);
   }

   public override operator fun equals(other: Any?): Boolean {
      if (this === var1) {
         return true;
      } else if (var1 !is FirstLayoutData) {
         return false;
      } else {
         var1 = var1;
         if (this.firstVisibleMessageIndex != var1.firstVisibleMessageIndex) {
            return false;
         } else if (!r.c(this.firstVisibleMessagePercentVisible, var1.firstVisibleMessagePercentVisible)) {
            return false;
         } else if (this.lastVisibleMessageIndex != var1.lastVisibleMessageIndex) {
            return false;
         } else {
            return r.c(this.lastVisibleMessagePercentVisible, var1.lastVisibleMessagePercentVisible);
         }
      }
   }

   public override fun hashCode(): Int {
      val var3: Int = Integer.hashCode(this.firstVisibleMessageIndex);
      var var2: Int = 0;
      val var1: Int;
      if (this.firstVisibleMessagePercentVisible == null) {
         var1 = 0;
      } else {
         var1 = this.firstVisibleMessagePercentVisible.hashCode();
      }

      val var4: Int = Integer.hashCode(this.lastVisibleMessageIndex);
      if (this.lastVisibleMessagePercentVisible != null) {
         var2 = this.lastVisibleMessagePercentVisible.hashCode();
      }

      return ((var3 * 31 + var1) * 31 + var4) * 31 + var2;
   }

   override fun serialize(): WritableMap {
      return ReactEvent.DefaultImpls.serialize(this);
   }

   public override fun toString(): String {
      val var1: Int = this.firstVisibleMessageIndex;
      val var4: java.lang.Double = this.firstVisibleMessagePercentVisible;
      val var2: Int = this.lastVisibleMessageIndex;
      val var3: java.lang.Double = this.lastVisibleMessagePercentVisible;
      val var5: StringBuilder = new StringBuilder();
      var5.append("FirstLayoutData(firstVisibleMessageIndex=");
      var5.append(var1);
      var5.append(", firstVisibleMessagePercentVisible=");
      var5.append(var4);
      var5.append(", lastVisibleMessageIndex=");
      var5.append(var2);
      var5.append(", lastVisibleMessagePercentVisible=");
      var5.append(var3);
      var5.append(")");
      return var5.toString();
   }

   public companion object {
      public fun serializer(): KSerializer<FirstLayoutData> {
         return FirstLayoutData.$serializer.INSTANCE;
      }
   }
}
