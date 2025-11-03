package com.discord.chat.reactevents

import com.discord.chat.bridge.contentnode.InlineCodeContentNode
import com.discord.react.utilities.NativeMapExtensionsKt
import com.discord.reactevents.ReactEvent
import com.facebook.react.bridge.WritableMap
import ht.v
import kotlinx.serialization.KSerializer
import xu.m

@m
public data class TapInlineCodeEvent(content: String) : ReactEvent {
   public final val content: String

   public constructor(node: InlineCodeContentNode) : this(var1.getContent())
   init {
      super();
      this.content = var1;
   }

   public operator fun component1(): String {
      return this.content;
   }

   public fun copy(content: String = var0.content): TapInlineCodeEvent {
      return new TapInlineCodeEvent(var1);
   }

   public override operator fun equals(other: Any?): Boolean {
      if (this === var1) {
         return true;
      } else if (var1 !is TapInlineCodeEvent) {
         return false;
      } else {
         return this.content == (var1 as TapInlineCodeEvent).content;
      }
   }

   public override fun hashCode(): Int {
      return this.content.hashCode();
   }

   public override fun serialize(): WritableMap {
      return NativeMapExtensionsKt.nativeMapOf(v.a("node", NativeMapExtensionsKt.nativeMapOf(v.a("content", this.content))));
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
