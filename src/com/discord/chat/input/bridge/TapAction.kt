package com.discord.chat.input.bridge

import kotlin.jvm.internal.r
import kotlinx.serialization.KSerializer
import sb.g

@g
public data class TapAction(action: String, channelId: String, optionName: String) {
   public final val action: String
   public final val channelId: String
   public final val optionName: String

   init {
      r.h(var1, "action");
      r.h(var2, "channelId");
      r.h(var3, "optionName");
      super();
      this.action = var1;
      this.channelId = var2;
      this.optionName = var3;
   }

   public operator fun component1(): String {
      return this.action;
   }

   public operator fun component2(): String {
      return this.channelId;
   }

   public operator fun component3(): String {
      return this.optionName;
   }

   public fun copy(action: String = var0.action, channelId: String = var0.channelId, optionName: String = var0.optionName): TapAction {
      r.h(var1, "action");
      r.h(var2, "channelId");
      r.h(var3, "optionName");
      return new TapAction(var1, var2, var3);
   }

   public override operator fun equals(other: Any?): Boolean {
      if (this === var1) {
         return true;
      } else if (var1 !is TapAction) {
         return false;
      } else {
         var1 = var1;
         if (!r.c(this.action, var1.action)) {
            return false;
         } else if (!r.c(this.channelId, var1.channelId)) {
            return false;
         } else {
            return r.c(this.optionName, var1.optionName);
         }
      }
   }

   public override fun hashCode(): Int {
      return (this.action.hashCode() * 31 + this.channelId.hashCode()) * 31 + this.optionName.hashCode();
   }

   public override fun toString(): String {
      val var4: java.lang.String = this.action;
      val var2: java.lang.String = this.channelId;
      val var1: java.lang.String = this.optionName;
      val var3: StringBuilder = new StringBuilder();
      var3.append("TapAction(action=");
      var3.append(var4);
      var3.append(", channelId=");
      var3.append(var2);
      var3.append(", optionName=");
      var3.append(var1);
      var3.append(")");
      return var3.toString();
   }

   public companion object {
      public fun serializer(): KSerializer<TapAction> {
         return TapAction.$serializer.INSTANCE;
      }
   }
}
