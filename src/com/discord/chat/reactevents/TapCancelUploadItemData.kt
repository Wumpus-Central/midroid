package com.discord.chat.reactevents

import com.discord.reactevents.ReactEvent
import com.facebook.react.bridge.WritableMap
import kotlin.jvm.internal.r
import kotlinx.serialization.KSerializer
import sb.f

@f
public data class TapCancelUploadItemData(uploaderId: String, itemId: String) : ReactEvent {
   public final val uploaderId: String
   public final val itemId: String

   init {
      r.h(var1, "uploaderId");
      r.h(var2, "itemId");
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
      r.h(var1, "uploaderId");
      r.h(var2, "itemId");
      return new TapCancelUploadItemData(var1, var2);
   }

   public override operator fun equals(other: Any?): Boolean {
      if (this === var1) {
         return true;
      } else if (var1 !is TapCancelUploadItemData) {
         return false;
      } else {
         var1 = var1;
         if (!r.c(this.uploaderId, var1.uploaderId)) {
            return false;
         } else {
            return r.c(this.itemId, var1.itemId);
         }
      }
   }

   public override fun hashCode(): Int {
      return this.uploaderId.hashCode() * 31 + this.itemId.hashCode();
   }

   override fun serialize(): WritableMap {
      return ReactEvent.DefaultImpls.serialize(this);
   }

   public override fun toString(): String {
      val var3: java.lang.String = this.uploaderId;
      val var2: java.lang.String = this.itemId;
      val var1: StringBuilder = new StringBuilder();
      var1.append("TapCancelUploadItemData(uploaderId=");
      var1.append(var3);
      var1.append(", itemId=");
      var1.append(var2);
      var1.append(")");
      return var1.toString();
   }

   public companion object {
      public fun serializer(): KSerializer<TapCancelUploadItemData> {
         return TapCancelUploadItemData.$serializer.INSTANCE;
      }
   }
}
