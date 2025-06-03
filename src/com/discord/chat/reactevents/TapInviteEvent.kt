package com.discord.chat.reactevents

import Ka.f
import com.discord.reactevents.ReactEvent
import com.facebook.react.bridge.WritableMap
import kotlin.jvm.internal.q
import kotlinx.serialization.KSerializer

@f
public data class TapInviteEvent(messageId: String, index: Int, primary: Boolean?, secondary: Boolean?) : ReactEvent {
   public final val messageId: String
   public final val index: Int
   public final val primary: Boolean?
   public final val secondary: Boolean?

   init {
      q.h(var1, "messageId");
      super();
      this.messageId = var1;
      this.index = var2;
      this.primary = var3;
      this.secondary = var4;
   }

   public operator fun component1(): String {
      return this.messageId;
   }

   public operator fun component2(): Int {
      return this.index;
   }

   public operator fun component3(): Boolean? {
      return this.primary;
   }

   public operator fun component4(): Boolean? {
      return this.secondary;
   }

   public fun copy(messageId: String = var0.messageId, index: Int = var0.index, primary: Boolean? = var0.primary, secondary: Boolean? = var0.secondary): TapInviteEvent {
      q.h(var1, "messageId");
      return new TapInviteEvent(var1, var2, var3, var4);
   }

   public override operator fun equals(other: Any?): Boolean {
      if (this === var1) {
         return true;
      } else if (var1 !is TapInviteEvent) {
         return false;
      } else {
         var1 = var1;
         if (!q.c(this.messageId, var1.messageId)) {
            return false;
         } else if (this.index != var1.index) {
            return false;
         } else if (!q.c(this.primary, var1.primary)) {
            return false;
         } else {
            return q.c(this.secondary, var1.secondary);
         }
      }
   }

   public override fun hashCode(): Int {
      val var3: Int = this.messageId.hashCode();
      val var4: Int = Integer.hashCode(this.index);
      var var2: Int = 0;
      val var1: Int;
      if (this.primary == null) {
         var1 = 0;
      } else {
         var1 = this.primary.hashCode();
      }

      if (this.secondary != null) {
         var2 = this.secondary.hashCode();
      }

      return ((var3 * 31 + var4) * 31 + var1) * 31 + var2;
   }

   override fun serialize(): WritableMap {
      return ReactEvent.DefaultImpls.serialize(this);
   }

   public override fun toString(): String {
      val var2: java.lang.String = this.messageId;
      val var1: Int = this.index;
      val var3: java.lang.Boolean = this.primary;
      val var5: java.lang.Boolean = this.secondary;
      val var4: StringBuilder = new StringBuilder();
      var4.append("TapInviteEvent(messageId=");
      var4.append(var2);
      var4.append(", index=");
      var4.append(var1);
      var4.append(", primary=");
      var4.append(var3);
      var4.append(", secondary=");
      var4.append(var5);
      var4.append(")");
      return var4.toString();
   }

   public companion object {
      public fun serializer(): KSerializer<TapInviteEvent> {
         return TapInviteEvent.$serializer.INSTANCE;
      }
   }
}
