package com.discord.chat.reactevents

import com.discord.react.utilities.NativeMapExtensionsKt
import com.discord.reactevents.ReactEvent
import com.facebook.react.bridge.WritableNativeMap
import kotlin.jvm.internal.q
import kotlinx.serialization.KSerializer
import mb.f
import t9.s

@f
internal data class TapCopyText(text: CharSequence) : ReactEvent {
   public final val text: CharSequence

   init {
      q.h(var1, "text");
      super();
      this.text = var1;
   }

   public operator fun component1(): CharSequence {
      return this.text;
   }

   public fun copy(text: CharSequence = var0.text): TapCopyText {
      q.h(var1, "text");
      return new TapCopyText(var1);
   }

   public override operator fun equals(other: Any?): Boolean {
      if (this === var1) {
         return true;
      } else if (var1 !is TapCopyText) {
         return false;
      } else {
         return q.c(this.text, (var1 as TapCopyText).text);
      }
   }

   public override fun hashCode(): Int {
      return this.text.hashCode();
   }

   public open fun serialize(): WritableNativeMap {
      return NativeMapExtensionsKt.nativeMapOf(s.a("text", this.text.toString()));
   }

   public override fun toString(): String {
      val var1: java.lang.CharSequence = this.text;
      val var2: StringBuilder = new StringBuilder();
      var2.append("TapCopyText(text=");
      var2.append((Object)var1);
      var2.append(")");
      return var2.toString();
   }

   public companion object {
      public fun serializer(): KSerializer<TapCopyText> {
         return TapCopyText.$serializer.INSTANCE;
      }
   }
}
