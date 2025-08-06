package com.discord.chat.reactevents

import B9.s
import com.discord.chat.bridge.contentnode.InlineCodeContentNode
import com.discord.react.utilities.NativeMapExtensionsKt
import com.discord.reactevents.ReactEvent
import com.facebook.react.bridge.WritableMap
import kotlin.jvm.internal.r
import kotlinx.serialization.KSerializer
import ub.g

@g
public data class TapInlineCodeEvent(content: String) : ReactEvent {
   public final val content: String

   public constructor(node: InlineCodeContentNode) : r.h(var1, "node") {
      this(var1.getContent());
   }

   init {
      r.h(var1, "content");
      super();
      this.content = var1;
   }

   public operator fun component1(): String {
      return this.content;
   }

   public fun copy(content: String = var0.content): TapInlineCodeEvent {
      r.h(var1, "content");
      return new TapInlineCodeEvent(var1);
   }

   public override operator fun equals(other: Any?): Boolean {
      if (this === var1) {
         return true;
      } else if (var1 !is TapInlineCodeEvent) {
         return false;
      } else {
         return r.c(this.content, (var1 as TapInlineCodeEvent).content);
      }
   }

   public override fun hashCode(): Int {
      return this.content.hashCode();
   }

   public override fun serialize(): WritableMap {
      return NativeMapExtensionsKt.nativeMapOf(s.a("node", NativeMapExtensionsKt.nativeMapOf(s.a("content", this.content))));
   }

   public override fun toString(): String {
      val var2: java.lang.String = this.content;
      val var1: StringBuilder = new StringBuilder();
      var1.append("TapInlineCodeEvent(content=");
      var1.append(var2);
      var1.append(")");
      return var1.toString();
   }

   public companion object {
      public fun serializer(): KSerializer<TapInlineCodeEvent> {
         return TapInlineCodeEvent.$serializer.INSTANCE;
      }
   }
}
