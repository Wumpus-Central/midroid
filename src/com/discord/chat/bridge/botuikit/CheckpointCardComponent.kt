package com.discord.chat.bridge.botuikit

import kotlinx.serialization.KSerializer
import xu.m

@m
public data class CheckpointCardComponent(type: Int, id: String, checkpointData: CheckpointDataV2025) : Component() {
   public open val type: Int
   public open val id: String
   public final val checkpointData: CheckpointDataV2025

   init {
      this.type = var1;
      this.id = var2;
      this.checkpointData = var3;
   }

   public operator fun component1(): Int {
      return this.type;
   }

   public operator fun component2(): String {
      return this.id;
   }

   public operator fun component3(): CheckpointDataV2025 {
      return this.checkpointData;
   }

   public fun copy(type: Int = var0.type, id: String = var0.id, checkpointData: CheckpointDataV2025 = var0.checkpointData): CheckpointCardComponent {
      return new CheckpointCardComponent(var1, var2, var3);
   }

   public override operator fun equals(other: Any?): Boolean {
      if (this === var1) {
         return true;
      } else if (var1 !is CheckpointCardComponent) {
         return false;
      } else {
         var1 = var1;
         if (this.type != var1.type) {
            return false;
         } else if (!(this.id == var1.id)) {
            return false;
         } else {
            return this.checkpointData == var1.checkpointData;
         }
      }
   }

   public override fun hashCode(): Int {
      return (Integer.hashCode(this.type) * 31 + this.id.hashCode()) * 31 + this.checkpointData.hashCode();
   }

   public override fun toString(): String {
      val var1: Int = this.type;
      val var3: java.lang.String = this.id;
      val var4: CheckpointDataV2025 = this.checkpointData;
      val var2: StringBuilder = new StringBuilder();
      var2.append("CheckpointCardComponent(type=");
      var2.append(var1);
      var2.append(", id=");
      var2.append(var3);
      var2.append(", checkpointData=");
      var2.append(var4);
      var2.append(")");
      return var2.toString();
   }

   public companion object {
      public fun serializer(): KSerializer<CheckpointCardComponent> {
         return CheckpointCardComponent.$serializer.INSTANCE;
      }
   }
}
