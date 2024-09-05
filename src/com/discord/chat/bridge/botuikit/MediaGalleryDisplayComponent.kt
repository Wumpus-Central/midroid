package com.discord.chat.bridge.botuikit

import kotlin.jvm.internal.q
import kotlinx.serialization.KSerializer
import kotlinx.serialization.descriptors.SerialDescriptor
import kotlinx.serialization.encoding.CompositeEncoder
import kotlinx.serialization.encoding.Decoder
import kotlinx.serialization.encoding.Encoder
import kotlinx.serialization.encoding.c
import kotlinx.serialization.internal.PluginGeneratedSerialDescriptor
import nn.f
import nn.n
import qn.b2
import qn.g0
import qn.n0
import qn.g0.a

@f
public data class MediaGalleryDisplayComponent(type: Int, id: String, items: List<MediaGalleryItem>) : Component {
   public open val id: String
   public final val items: List<MediaGalleryItem>
   public open val type: Int

   init {
      q.h(var2, "id");
      q.h(var3, "items");
      super(null);
      this.type = var1;
      this.id = var2;
      this.items = var3;
   }

   public operator fun component1(): Int {
      return this.type;
   }

   public operator fun component2(): String {
      return this.id;
   }

   public operator fun component3(): List<MediaGalleryItem> {
      return this.items;
   }

   public fun copy(type: Int = var0.type, id: String = var0.id, items: List<MediaGalleryItem> = var0.items): MediaGalleryDisplayComponent {
      q.h(var2, "id");
      q.h(var3, "items");
      return new MediaGalleryDisplayComponent(var1, var2, var3);
   }

   public override operator fun equals(other: Any?): Boolean {
      if (this === var1) {
         return true;
      } else if (var1 !is MediaGalleryDisplayComponent) {
         return false;
      } else {
         var1 = var1;
         if (this.type != var1.type) {
            return false;
         } else if (!q.c(this.id, var1.id)) {
            return false;
         } else {
            return q.c(this.items, var1.items);
         }
      }
   }

   public override fun hashCode(): Int {
      return (Integer.hashCode(this.type) * 31 + this.id.hashCode()) * 31 + this.items.hashCode();
   }

   public override fun toString(): String {
      val var1: Int = this.type;
      val var4: java.lang.String = this.id;
      val var3: java.util.List = this.items;
      val var2: StringBuilder = new StringBuilder();
      var2.append("MediaGalleryDisplayComponent(type=");
      var2.append(var1);
      var2.append(", id=");
      var2.append(var4);
      var2.append(", items=");
      var2.append(var3);
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
         val var0: MediaGalleryDisplayComponent.$serializer = new MediaGalleryDisplayComponent.$serializer();
         INSTANCE = var0;
         val var1: PluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("12", var0, 3);
         var1.c("type", false);
         var1.c("id", false);
         var1.c("items", false);
         descriptor = var1;
      }

      public open fun childSerializers(): Array<KSerializer<*>> {
         return new KSerializer[]{n0.a, b2.a, MediaGalleryDisplayComponent.access$get$childSerializers$cp()[2]};
      }

      public open fun deserialize(decoder: Decoder): MediaGalleryDisplayComponent {
         q.h(var1, "decoder");
         val var7: SerialDescriptor = this.getDescriptor();
         val var8: c = var1.b(var7);
         val var9: Array<KSerializer> = MediaGalleryDisplayComponent.access$get$childSerializers$cp();
         var var2: Int;
         var var3: Int;
         var var6: java.lang.String;
         var var10: java.util.List;
         if (var8.p()) {
            var2 = var8.i(var7, 0);
            var6 = var8.m(var7, 1);
            var10 = var8.y(var7, 2, var9[2], null) as java.util.List;
            var3 = 7;
         } else {
            var var4: Boolean = true;
            var3 = 0;
            var6 = null;
            var10 = null;
            var2 = 0;

            while (var4) {
               val var5: Int = var8.o(var7);
               if (var5 != -1) {
                  if (var5 != 0) {
                     if (var5 != 1) {
                        if (var5 != 2) {
                           throw new n(var5);
                        }

                        var10 = var8.y(var7, 2, var9[2], var10) as java.util.List;
                        var2 |= 4;
                     } else {
                        var6 = var8.m(var7, 1);
                        var2 |= 2;
                     }
                  } else {
                     var3 = var8.i(var7, 0);
                     var2 |= 1;
                  }
               } else {
                  var4 = false;
               }
            }

            var2 = var3;
            var3 = var2;
         }

         var8.c(var7);
         return new MediaGalleryDisplayComponent(var3, var2, var6, var10, null);
      }

      public open fun serialize(encoder: Encoder, value: MediaGalleryDisplayComponent) {
         q.h(var1, "encoder");
         q.h(var2, "value");
         val var3: SerialDescriptor = this.getDescriptor();
         val var4: CompositeEncoder = var1.b(var3);
         MediaGalleryDisplayComponent.write$Self$chat_release(var2, var4, var3);
         var4.c(var3);
      }

      fun typeParametersSerializers(): Array<KSerializer> {
         return a.a(this);
      }
   }

   public companion object {
      public fun serializer(): KSerializer<MediaGalleryDisplayComponent> {
         return MediaGalleryDisplayComponent.$serializer.INSTANCE;
      }
   }
}
