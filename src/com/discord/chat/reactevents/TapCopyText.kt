package com.discord.chat.reactevents

import com.discord.react.utilities.NativeMapExtensionsKt
import com.discord.reactevents.ReactEvent
import com.facebook.react.bridge.WritableNativeMap
import kotlin.jvm.internal.r
import kotlinx.serialization.KSerializer
import sb.g
import z9.s

@g
internal data class TapCopyText(text: CharSequence) : ReactEvent {
   public final val text: CharSequence

   init {
      r.h(var1, "text");
      super();
      this.text = var1;
   }

   public operator fun component1(): CharSequence {
      return this.text;
   }

   public fun copy(text: CharSequence = var0.text): TapCopyText {
      r.h(var1, "text");
      return new TapCopyText(var1);
   }

   public override operator fun equals(other: Any?): Boolean {
      if (this === var1) {
         return true;
      } else if (var1 !is TapCopyText) {
         return false;
      } else {
         return r.c(this.text, (var1 as TapCopyText).text);
      }
   }

   public override fun hashCode(): Int {
      return this.text.hashCode();
   }

   public open fun serialize(): WritableNativeMap {
      return NativeMapExtensionsKt.nativeMapOf(s.a("text", this.text.toString()));
   }

   public override fun toString(): String {
      val var2: java.lang.CharSequence = this.text;
      val var1: StringBuilder = new StringBuilder();
      var1.append("TapCopyText(text=");
      var1.append((Object)var2);
      var1.append(")");
      return var1.toString();
   }

   public companion object {
      public fun serializer(): KSerializer<TapCopyText> {
         return TapCopyText.$serializer.INSTANCE;
      }
   }
}
