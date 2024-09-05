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
public data class UnknownComponent(type: Int = 0, id: String = "-1") : Component {
   public open val id: String
   public open val type: Int

   fun UnknownComponent() {
      this(0, null, 3, null);
   }

   init {
      q.h(var2, "id");
      super(null);
      this.type = var1;
      this.id = var2;
   }

   public operator fun component1(): Int {
      return this.type;
   }

   public operator fun component2(): String {
      return this.id;
   }

   public fun copy(type: Int = var0.type, id: String = var0.id): UnknownComponent {
      q.h(var2, "id");
      return new UnknownComponent(var1, var2);
   }

   public override operator fun equals(other: Any?): Boolean {
      if (this === var1) {
         return true;
      } else if (var1 !is UnknownComponent) {
         return false;
      } else {
         var1 = var1;
         if (this.type != var1.type) {
            return false;
         } else {
            return q.c(this.id, var1.id);
         }
      }
   }

   public override fun hashCode(): Int {
      return Integer.hashCode(this.type) * 31 + this.id.hashCode();
   }

   public override fun toString(): String {
      val var1: Int = this.type;
      val var2: java.lang.String = this.id;
      val var3: StringBuilder = new StringBuilder();
      var3.append("UnknownComponent(type=");
      var3.append(var1);
      var3.append(", id=");
      var3.append(var2);
      var3.append(")");
      return var3.toString();
   }

   public object `$serializer` : g0 {
      public open val descriptor: SerialDescriptor
         public open get() {
            return descriptor;
         }


      @JvmStatic
      fun {
         val var0: UnknownComponent.$serializer = new UnknownComponent.$serializer();
         INSTANCE = var0;
         val var1: PluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("0", var0, 2);
         var1.c("type", true);
         var1.c("id", true);
         descriptor = var1;
      }

      public open fun childSerializers(): Array<KSerializer<*>> {
         return new KSerializer[]{n0.a, b2.a};
      }

      public open fun deserialize(decoder: Decoder): UnknownComponent {
         q.h(var1, "decoder");
         val var6: SerialDescriptor = this.getDescriptor();
         val var7: c = var1.b(var6);
         var var2: Int;
         var var3: Int;
         var var8: java.lang.String;
         if (var7.p()) {
            var3 = var7.i(var6, 0);
            var8 = var7.m(var6, 1);
            var2 = 3;
         } else {
            var var4: Boolean = true;
            var3 = 0;
            var2 = 0;
            var8 = null;

            while (var4) {
               val var5: Int = var7.o(var6);
               if (var5 != -1) {
                  if (var5 != 0) {
                     if (var5 != 1) {
                        throw new n(var5);
                     }

                     var8 = var7.m(var6, 1);
                     var2 |= 2;
                  } else {
                     var3 = var7.i(var6, 0);
                     var2 |= 1;
                  }
               } else {
                  var4 = false;
               }
            }
         }

         var7.c(var6);
         return new UnknownComponent(var2, var3, var8, null);
      }

      public open fun serialize(encoder: Encoder, value: UnknownComponent) {
         q.h(var1, "encoder");
         q.h(var2, "value");
         val var3: SerialDescriptor = this.getDescriptor();
         val var4: CompositeEncoder = var1.b(var3);
         UnknownComponent.write$Self$chat_release(var2, var4, var3);
         var4.c(var3);
      }

      fun typeParametersSerializers(): Array<KSerializer> {
         return a.a(this);
      }
   }

   public companion object {
      public fun serializer(): KSerializer<UnknownComponent> {
         return UnknownComponent.$serializer.INSTANCE;
      }
   }
}
