package com.discord.chat.reactevents

import Ka.f
import R8.s
import com.discord.react.utilities.NativeMapExtensionsKt
import com.discord.reactevents.ReactEvent
import com.facebook.react.bridge.WritableMap
import kotlin.jvm.internal.q
import kotlinx.serialization.KSerializer

@f
internal data class LongPressAttachmentLinkData(attachmentUrl: String? = null, attachmentName: String? = null) : ReactEvent {
   public final val attachmentUrl: String?
   public final val attachmentName: String?

   fun LongPressAttachmentLinkData() {
      this(null, null, 3, null);
   }

   init {
      this.attachmentUrl = var1;
      this.attachmentName = var2;
   }

   public operator fun component1(): String? {
      return this.attachmentUrl;
   }

   public operator fun component2(): String? {
      return this.attachmentName;
   }

   public fun copy(attachmentUrl: String? = var0.attachmentUrl, attachmentName: String? = var0.attachmentName): LongPressAttachmentLinkData {
      return new LongPressAttachmentLinkData(var1, var2);
   }

   public override operator fun equals(other: Any?): Boolean {
      if (this === var1) {
         return true;
      } else if (var1 !is LongPressAttachmentLinkData) {
         return false;
      } else {
         var1 = var1;
         if (!q.c(this.attachmentUrl, var1.attachmentUrl)) {
            return false;
         } else {
            return q.c(this.attachmentName, var1.attachmentName);
         }
      }
   }

   public override fun hashCode(): Int {
      var var2: Int = 0;
      val var1: Int;
      if (this.attachmentUrl == null) {
         var1 = 0;
      } else {
         var1 = this.attachmentUrl.hashCode();
      }

      if (this.attachmentName != null) {
         var2 = this.attachmentName.hashCode();
      }

      return var1 * 31 + var2;
   }

   public override fun serialize(): WritableMap {
      return NativeMapExtensionsKt.nativeMapOf(
         s.a("data", NativeMapExtensionsKt.nativeMapOf(s.a("attachmentUrl", this.attachmentUrl), s.a("attachmentName", this.attachmentName)))
      );
   }

   public override fun toString(): String {
      val var1: java.lang.String = this.attachmentUrl;
      val var3: java.lang.String = this.attachmentName;
      val var2: StringBuilder = new StringBuilder();
      var2.append("LongPressAttachmentLinkData(attachmentUrl=");
      var2.append(var1);
      var2.append(", attachmentName=");
      var2.append(var3);
      var2.append(")");
      return var2.toString();
   }

   public companion object {
      public fun serializer(): KSerializer<LongPressAttachmentLinkData> {
         return LongPressAttachmentLinkData.$serializer.INSTANCE;
      }
   }
}
