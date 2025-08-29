package com.discord.chat.input.bridge

import kotlinx.serialization.KSerializer
import nb.g

@g
public data class TapAction(action: String, channelId: String, optionName: String) {
   public final val action: String
   public final val channelId: String
   public final val optionName: String

   init {
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
      return new TapAction(var1, var2, var3);
   }

   public override operator fun equals(other: Any?): Boolean {
      if (this === var1) {
         return true;
      } else if (var1 !is TapAction) {
         return false;
      } else {
         var1 = var1;
         if (!(this.action == var1.action)) {
            return false;
         } else if (!(this.channelId == var1.channelId)) {
            return false;
         } else {
            return this.optionName == var1.optionName;
         }
      }
   }

   public override fun hashCode(): Int {
      return (this.action.hashCode() * 31 + this.channelId.hashCode()) * 31 + this.optionName.hashCode();
   }

   public override fun toString(): String {
      val var2: java.lang.String = this.action;
      val var3: java.lang.String = this.channelId;
      val var1: java.lang.String = this.optionName;
      val var4: StringBuilder = new StringBuilder();
      var4.append("TapAction(action=");
      var4.append(var2);
      var4.append(", channelId=");
      var4.append(var3);
      var4.append(", optionName=");
      var4.append(var1);
      var4.append(")");
      return var4.toString();
   }

   public companion object {
      public fun serializer(): KSerializer<TapAction> {
         return TapAction.$serializer.INSTANCE;
      }
   }
}
