package com.discord.chat.reactevents

import com.discord.reactevents.ReactEvent
import com.discord.reactevents.ReactEvent.DefaultImpls
import com.facebook.react.bridge.WritableMap
import kotlinx.serialization.KSerializer
import qc.m

@m
public data class TapCancelUploadItemData(uploaderId: String, itemId: String) : ReactEvent {
   public final val uploaderId: String
   public final val itemId: String

   init {
      super();
      this.uploaderId = var1;
      this.itemId = var2;
   }

   public operator fun component1(): String {
      return this.uploaderId;
   }

   public operator fun component2(): String {
      return this.itemId;
   }

   public fun copy(uploaderId: String = var0.uploaderId, itemId: String = var0.itemId): TapCancelUploadItemData {
      return new TapCancelUploadItemData(var1, var2);
   }

   public override operator fun equals(other: Any?): Boolean {
      if (this === var1) {
         return true;
      } else if (var1 !is TapCancelUploadItemData) {
         return false;
      } else {
         var1 = var1;
         if (!(this.uploaderId == var1.uploaderId)) {
            return false;
         } else {
            return this.itemId == var1.itemId;
         }
      }
   }

   public override fun hashCode(): Int {
      return this.uploaderId.hashCode() * 31 + this.itemId.hashCode();
   }

   fun serialize(): WritableMap {
      return DefaultImpls.serialize(this);
   }

   public override fun toString(): String {
      val var1: java.lang.String = this.uploaderId;
      val var2: java.lang.String = this.itemId;
      val var3: StringBuilder = new StringBuilder();
      var3.append("TapCancelUploadItemData(uploaderId=");
      var3.append(var1);
      var3.append(", itemId=");
      var3.append(var2);
      var3.append(")");
      return var3.toString();
   }

   public companion object {
      public fun serializer(): KSerializer<TapCancelUploadItemData> {
         return TapCancelUploadItemData.$serializer.INSTANCE;
      }
   }
}
