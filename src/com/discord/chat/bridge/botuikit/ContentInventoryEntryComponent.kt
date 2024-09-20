package com.discord.chat.bridge.botuikit

import fl.f
import fl.n
import gl.a
import il.b2
import il.g0
import il.n0
import kotlin.jvm.internal.q
import kotlinx.serialization.KSerializer
import kotlinx.serialization.descriptors.SerialDescriptor
import kotlinx.serialization.encoding.CompositeEncoder
import kotlinx.serialization.encoding.Decoder
import kotlinx.serialization.encoding.Encoder
import kotlinx.serialization.encoding.c
import kotlinx.serialization.internal.PluginGeneratedSerialDescriptor

@f
public data class ContentInventoryEntryComponent(type: Int, id: String, contentInventoryEntry: ContentInventoryEntry? = null) : Component {
   public final val contentInventoryEntry: ContentInventoryEntry?
   public open val id: String
   public open val type: Int

   init {
      q.h(var2, "id");
      super(null);
      this.type = var1;
      this.id = var2;
      this.contentInventoryEntry = var3;
   }

   public operator fun component1(): Int {
      return this.type;
   }

   public operator fun component2(): String {
      return this.id;
   }

   public operator fun component3(): ContentInventoryEntry? {
      return this.contentInventoryEntry;
   }

   public fun copy(type: Int = var0.type, id: String = var0.id, contentInventoryEntry: ContentInventoryEntry? = var0.contentInventoryEntry): ContentInventoryEntryComponent {
      q.h(var2, "id");
      return new ContentInventoryEntryComponent(var1, var2, var3);
   }

   public override operator fun equals(other: Any?): Boolean {
      if (this === var1) {
         return true;
      } else if (var1 !is ContentInventoryEntryComponent) {
         return false;
      } else {
         var1 = var1;
         if (this.type != var1.type) {
            return false;
         } else if (!q.c(this.id, var1.id)) {
            return false;
         } else {
            return q.c(this.contentInventoryEntry, var1.contentInventoryEntry);
         }
      }
   }

   public override fun hashCode(): Int {
      val var3: Int = Integer.hashCode(this.type);
      val var2: Int = this.id.hashCode();
      val var1: Int;
      if (this.contentInventoryEntry == null) {
         var1 = 0;
      } else {
         var1 = this.contentInventoryEntry.hashCode();
      }

      return (var3 * 31 + var2) * 31 + var1;
   }

   public override fun toString(): String {
      val var1: Int = this.type;
      val var3: java.lang.String = this.id;
      val var4: ContentInventoryEntry = this.contentInventoryEntry;
      val var2: StringBuilder = new StringBuilder();
      var2.append("ContentInventoryEntryComponent(type=");
      var2.append(var1);
      var2.append(", id=");
      var2.append(var3);
      var2.append(", contentInventoryEntry=");
      var2.append(var4);
      var2.append(")");
      return var2.toString();
   }

   public object `$serializer` : g0 {
      public open val descriptor: SerialDescriptor
         public open get() {
            return descriptor;
         }


      @JvmStatic
      fun {
         val var0: ContentInventoryEntryComponent.$serializer = new ContentInventoryEntryComponent.$serializer();
         INSTANCE = var0;
         val var1: PluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("16", var0, 3);
         var1.l("type", false);
         var1.l("id", false);
         var1.l("contentInventoryEntry", true);
         descriptor = var1;
      }

      public open fun childSerializers(): Array<KSerializer<*>> {
         return new KSerializer[]{n0.a, b2.a, a.u(ContentInventoryEntry.$serializer.INSTANCE)};
      }

      public open fun deserialize(decoder: Decoder): ContentInventoryEntryComponent {
         q.h(var1, "decoder");
         val var7: SerialDescriptor = this.getDescriptor();
         val var8: c = var1.c(var7);
         var var3: Int;
         val var4: Int;
         var var6: java.lang.String;
         var var9: ContentInventoryEntry;
         if (var8.y()) {
            val var2: Int = var8.k(var7, 0);
            var6 = var8.t(var7, 1);
            var9 = var8.v(var7, 2, ContentInventoryEntry.$serializer.INSTANCE, null) as ContentInventoryEntry;
            var4 = 7;
            var3 = var2;
         } else {
            var var11: Boolean = true;
            var3 = 0;
            var6 = null;
            var9 = null;
            var var10: Int = 0;

            while (var11) {
               val var5: Int = var8.x(var7);
               if (var5 != -1) {
                  if (var5 != 0) {
                     if (var5 != 1) {
                        if (var5 != 2) {
                           throw new n(var5);
                        }

                        var9 = var8.v(var7, 2, ContentInventoryEntry.$serializer.INSTANCE, var9) as ContentInventoryEntry;
                        var10 |= 4;
                     } else {
                        var6 = var8.t(var7, 1);
                        var10 |= 2;
                     }
                  } else {
                     var3 = var8.k(var7, 0);
                     var10 |= 1;
                  }
               } else {
                  var11 = false;
               }
            }

            var4 = var10;
         }

         var8.b(var7);
         return new ContentInventoryEntryComponent(var4, var3, var6, var9, null);
      }

      public open fun serialize(encoder: Encoder, value: ContentInventoryEntryComponent) {
         q.h(var1, "encoder");
         q.h(var2, "value");
         val var3: SerialDescriptor = this.getDescriptor();
         val var4: CompositeEncoder = var1.c(var3);
         ContentInventoryEntryComponent.write$Self$chat_release(var2, var4, var3);
         var4.b(var3);
      }

      fun typeParametersSerializers(): Array<KSerializer> {
         return il.g0.a.a(this);
      }
   }

   public companion object {
      public fun serializer(): KSerializer<ContentInventoryEntryComponent> {
         return ContentInventoryEntryComponent.$serializer.INSTANCE;
      }
   }
}
