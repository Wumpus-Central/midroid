package com.discord.chat.bridge.botuikit

import kotlin.jvm.internal.r
import kotlinx.serialization.KSerializer
import kotlinx.serialization.descriptors.SerialDescriptor
import kotlinx.serialization.encoding.CompositeEncoder
import kotlinx.serialization.encoding.Decoder
import kotlinx.serialization.encoding.Encoder
import kotlinx.serialization.encoding.c
import kotlinx.serialization.internal.PluginGeneratedSerialDescriptor
import uk.f
import uk.n
import vk.a
import xk.a2
import xk.f0
import xk.m0

@f
public data class ContentInventoryEntryComponent(type: Int, id: String, contentInventoryEntry: ContentInventoryEntry? = null) : Component {
   public final val contentInventoryEntry: ContentInventoryEntry?
   public open val id: String
   public open val type: Int

   init {
      r.h(var2, "id");
      super(null);
      this.type = var1;
      this.id = var2;
      this.contentInventoryEntry = var3;
   }

   @JvmStatic
   public fun `write$Self`(self: ContentInventoryEntryComponent, output: CompositeEncoder, serialDesc: SerialDescriptor) {
      r.h(var0, "self");
      r.h(var1, "output");
      r.h(var2, "serialDesc");
      val var4: Int = var0.getType();
      var var3: Boolean = false;
      var1.w(var2, 0, var4);
      var1.z(var2, 1, var0.getId());
      if (var1.A(var2, 2) || var0.contentInventoryEntry != null) {
         var3 = true;
      }

      if (var3) {
         var1.m(var2, 2, ContentInventoryEntry.$serializer.INSTANCE, var0.contentInventoryEntry);
      }
   }

   public operator fun component1(): Int {
      return this.getType();
   }

   public operator fun component2(): String {
      return this.getId();
   }

   public operator fun component3(): ContentInventoryEntry? {
      return this.contentInventoryEntry;
   }

   public fun copy(type: Int = var0.getType(), id: String = var0.getId(), contentInventoryEntry: ContentInventoryEntry? = var0.contentInventoryEntry): ContentInventoryEntryComponent {
      r.h(var2, "id");
      return new ContentInventoryEntryComponent(var1, var2, var3);
   }

   public override operator fun equals(other: Any?): Boolean {
      if (this === var1) {
         return true;
      } else if (var1 !is ContentInventoryEntryComponent) {
         return false;
      } else {
         var1 = var1;
         if (this.getType() != var1.getType()) {
            return false;
         } else if (!r.c(this.getId(), var1.getId())) {
            return false;
         } else {
            return r.c(this.contentInventoryEntry, var1.contentInventoryEntry);
         }
      }
   }

   public override fun hashCode(): Int {
      val var3: Int = Integer.hashCode(this.getType());
      val var2: Int = this.getId().hashCode();
      val var1: Int;
      if (this.contentInventoryEntry == null) {
         var1 = 0;
      } else {
         var1 = this.contentInventoryEntry.hashCode();
      }

      return (var3 * 31 + var2) * 31 + var1;
   }

   public override fun toString(): String {
      val var1: Int = this.getType();
      val var2: java.lang.String = this.getId();
      val var4: ContentInventoryEntry = this.contentInventoryEntry;
      val var3: StringBuilder = new StringBuilder();
      var3.append("ContentInventoryEntryComponent(type=");
      var3.append(var1);
      var3.append(", id=");
      var3.append(var2);
      var3.append(", contentInventoryEntry=");
      var3.append(var4);
      var3.append(")");
      return var3.toString();
   }

   public object `$serializer` : f0<ContentInventoryEntryComponent> {
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
         return new KSerializer[]{m0.a, a2.a, a.u(ContentInventoryEntry.$serializer.INSTANCE)};
      }

      public open fun deserialize(decoder: Decoder): ContentInventoryEntryComponent {
         r.h(var1, "decoder");
         val var8: SerialDescriptor = this.getDescriptor();
         val var9: c = var1.b(var8);
         var var2: Int;
         var var3: Int;
         var var6: Any;
         val var7: java.lang.String;
         if (var9.p()) {
            var3 = var9.i(var8, 0);
            val var10: java.lang.String = var9.m(var8, 1);
            var6 = var9.n(var8, 2, ContentInventoryEntry.$serializer.INSTANCE, null);
            var2 = 7;
            var7 = var10;
         } else {
            var var4: Boolean = true;
            var3 = 0;
            var6 = null;
            var var11: Any = null;
            var2 = 0;

            while (var4) {
               val var5: Int = var9.o(var8);
               if (var5 != -1) {
                  if (var5 != 0) {
                     if (var5 != 1) {
                        if (var5 != 2) {
                           throw new n(var5);
                        }

                        var11 = var9.n(var8, 2, ContentInventoryEntry.$serializer.INSTANCE, var11);
                        var2 |= 4;
                     } else {
                        var6 = var9.m(var8, 1);
                        var2 |= 2;
                     }
                  } else {
                     var3 = var9.i(var8, 0);
                     var2 |= 1;
                  }
               } else {
                  var4 = false;
               }
            }

            var7 = (java.lang.String)var6;
            var6 = var11;
         }

         var9.c(var8);
         return new ContentInventoryEntryComponent(var2, var3, var7, var6 as ContentInventoryEntry, null);
      }

      public open fun serialize(encoder: Encoder, value: ContentInventoryEntryComponent) {
         r.h(var1, "encoder");
         r.h(var2, "value");
         val var3: SerialDescriptor = this.getDescriptor();
         val var4: CompositeEncoder = var1.b(var3);
         ContentInventoryEntryComponent.write$Self(var2, var4, var3);
         var4.c(var3);
      }

      fun typeParametersSerializers(): Array<KSerializer<?>> {
         return xk.f0.a.a(this);
      }
   }

   public companion object {
      public fun serializer(): KSerializer<ContentInventoryEntryComponent> {
         return ContentInventoryEntryComponent.$serializer.INSTANCE;
      }
   }
}
