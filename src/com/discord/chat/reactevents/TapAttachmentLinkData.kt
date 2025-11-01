package com.discord.chat.reactevents

import com.discord.react.utilities.NativeMapExtensionsKt
import com.discord.reactevents.ReactEvent
import com.facebook.react.bridge.WritableMap
import ht.v
import kotlinx.serialization.KSerializer
import xu.m

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

   public override fun serialize(): WritableMap {
      return NativeMapExtensionsKt.nativeMapOf(v.a("data", NativeMapExtensionsKt.nativeMapOf(v.a("attachmentUrl", this.attachmentUrl))));
   }

   public override fun toString(): String {
      val var2: java.lang.String = this.attachmentUrl;
      val var1: StringBuilder = new StringBuilder();
      var1.append("TapAttachmentLinkData(attachmentUrl=");
      var1.append(var2);
      var1.append(")");
      return var1.toString();
   }

   public companion object {
      public fun serializer(): KSerializer<TapAttachmentLinkData> {
         return TapAttachmentLinkData.$serializer.INSTANCE;
      }
   }
}
