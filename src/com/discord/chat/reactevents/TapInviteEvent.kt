package com.discord.chat.reactevents

import com.discord.reactevents.ReactEvent
import com.facebook.react.bridge.WritableMap
import kotlin.jvm.internal.r
import kotlinx.serialization.KSerializer
import sb.g

@g
public data class TapInviteEvent(messageId: String, index: Int, primary: Boolean?, secondary: Boolean?) : ReactEvent {
   public final val messageId: String
   public final val index: Int
   public final val primary: Boolean?
   public final val secondary: Boolean?

   init {
      r.h(var1, "messageId");
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
      r.h(var1, "messageId");
      return new TapInviteEvent(var1, var2, var3, var4);
   }

   public override operator fun equals(other: Any?): Boolean {
      if (this === var1) {
         return true;
      } else if (var1 !is TapInviteEvent) {
         return false;
      } else {
         var1 = var1;
         if (!r.c(this.messageId, var1.messageId)) {
            return false;
         } else if (this.index != var1.index) {
            return false;
         } else if (!r.c(this.primary, var1.primary)) {
            return false;
         } else {
            return r.c(this.secondary, var1.secondary);
         }
      }
   }

   public override fun hashCode(): Int {
      val var4: Int = this.messageId.hashCode();
      val var3: Int = Integer.hashCode(this.index);
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

      return ((var4 * 31 + var3) * 31 + var1) * 31 + var2;
   }

   override fun serialize(): WritableMap {
      return ReactEvent.DefaultImpls.serialize(this);
   }

   public override fun toString(): String {
      val var2: java.lang.String = this.messageId;
      val var1: Int = this.index;
      val var5: java.lang.Boolean = this.primary;
      val var4: java.lang.Boolean = this.secondary;
      val var3: StringBuilder = new StringBuilder();
      var3.append("TapInviteEvent(messageId=");
      var3.append(var2);
      var3.append(", index=");
      var3.append(var1);
      var3.append(", primary=");
      var3.append(var5);
      var3.append(", secondary=");
      var3.append(var4);
      var3.append(")");
      return var3.toString();
   }

   public companion object {
      public fun serializer(): KSerializer<TapInviteEvent> {
         return TapInviteEvent.$serializer.INSTANCE;
      }
   }
}
