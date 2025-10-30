package com.discord.chat.reactevents

import com.discord.react.utilities.NativeMapExtensionsKt
import com.discord.reactevents.ReactEvent
import com.facebook.react.bridge.WritableMap
import fm.v
import kotlinx.serialization.KSerializer
import tp.m

@m
internal data class TapAttachmentLinkData(attachmentUrl: String? = null) : ReactEvent {
   public final val attachmentUrl: String?

   fun TapAttachmentLinkData() {
      this(null, 1, null);
   }

   init {
      this.attachmentUrl = var1;
   }

   public operator fun component1(): String? {
      return this.attachmentUrl;
   }

   public fun copy(attachmentUrl: String? = var0.attachmentUrl): TapAttachmentLinkData {
      return new TapAttachmentLinkData(var1);
   }

   public override operator fun equals(other: Any?): Boolean {
      if (this === var1) {
         return true;
      } else if (var1 !is TapAttachmentLinkData) {
         return false;
      } else {
         return this.attachmentUrl == (var1 as TapAttachmentLinkData).attachmentUrl;
      }
   }

   public override fun hashCode(): Int {
      return if (this.attachmentUrl == null) 0 else this.attachmentUrl.hashCode();
   }

   public open fun serialize(): WritableMap {
      return NativeMapExtensionsKt.nativeMapOf(new Pair[]{v.a("data", NativeMapExtensionsKt.nativeMapOf(new Pair[]{v.a("attachmentUrl", this.attachmentUrl)}))});
   }

   public override fun toString(): String {
      val var1: java.lang.String = this.attachmentUrl;
      val var2: StringBuilder = new StringBuilder();
      var2.append("TapAttachmentLinkData(attachmentUrl=");
      var2.append(var1);
      var2.append(")");
      return var2.toString();
   }

   public companion object {
      public fun serializer(): KSerializer<TapAttachmentLinkData> {
         return TapAttachmentLinkData.$serializer.INSTANCE;
      }
   }
}
