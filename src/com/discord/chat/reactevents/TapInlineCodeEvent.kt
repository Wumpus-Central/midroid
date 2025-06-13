package com.discord.chat.reactevents

import com.discord.chat.bridge.contentnode.InlineCodeContentNode
import com.discord.react.utilities.NativeMapExtensionsKt
import com.discord.reactevents.ReactEvent
import com.facebook.react.bridge.WritableMap
import kotlin.jvm.internal.q
import kotlinx.serialization.KSerializer
import mb.f
import t9.s

@f
public data class TapInlineCodeEvent(content: String) : ReactEvent {
   public final val content: String

   public constructor(node: InlineCodeContentNode) : q.h(var1, "node") {
      this(var1.getContent());
   }

   init {
      q.h(var1, "content");
      super();
      this.content = var1;
   }

   public operator fun component1(): String {
      return this.content;
   }

   public fun copy(content: String = var0.content): TapInlineCodeEvent {
      q.h(var1, "content");
      return new TapInlineCodeEvent(var1);
   }

   public override operator fun equals(other: Any?): Boolean {
      if (this === var1) {
         return true;
      } else if (var1 !is TapInlineCodeEvent) {
         return false;
      } else {
         return q.c(this.content, (var1 as TapInlineCodeEvent).content);
      }
   }

   public override fun hashCode(): Int {
      return this.content.hashCode();
   }

   public override fun serialize(): WritableMap {
      return NativeMapExtensionsKt.nativeMapOf(s.a("node", NativeMapExtensionsKt.nativeMapOf(s.a("content", this.content))));
   }

   public override fun toString(): String {
      val var1: java.lang.String = this.content;
      val var2: StringBuilder = new StringBuilder();
      var2.append("TapInlineCodeEvent(content=");
      var2.append(var1);
      var2.append(")");
      return var2.toString();
   }

   public companion object {
      public fun serializer(): KSerializer<TapInlineCodeEvent> {
         return TapInlineCodeEvent.$serializer.INSTANCE;
      }
   }
}
