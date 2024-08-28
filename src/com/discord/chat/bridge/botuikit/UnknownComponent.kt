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
import xk.a2
import xk.f0
import xk.m0
import xk.f0.a

@f
public data class UnknownComponent(type: Int = 0, id: String = "-1") : Component {
   public open val id: String
   public open val type: Int

   fun UnknownComponent() {
      this(0, null, 3, null);
   }

   init {
      r.h(var2, "id");
      super(null);
      this.type = var1;
      this.id = var2;
   }

   @JvmStatic
   public fun `write$Self`(self: UnknownComponent, output: CompositeEncoder, serialDesc: SerialDescriptor) {
      r.h(var0, "self");
      r.h(var1, "output");
      r.h(var2, "serialDesc");
      var var3: Boolean;
      if (!var1.A(var2, 0) && var0.getType() == 0) {
         var3 = false;
      } else {
         var3 = true;
      }

      if (var3) {
         var1.w(var2, 0, var0.getType());
      }

      label24: {
         if (!var1.A(var2, 1)) {
            var3 = false;
            if (r.c(var0.getId(), "-1")) {
               break label24;
            }
         }

         var3 = true;
      }

      if (var3) {
         var1.z(var2, 1, var0.getId());
      }
   }

   public operator fun component1(): Int {
      return this.getType();
   }

   public operator fun component2(): String {
      return this.getId();
   }

   public fun copy(type: Int = var0.getType(), id: String = var0.getId()): UnknownComponent {
      r.h(var2, "id");
      return new UnknownComponent(var1, var2);
   }

   public override operator fun equals(other: Any?): Boolean {
      if (this === var1) {
         return true;
      } else if (var1 !is UnknownComponent) {
         return false;
      } else {
         var1 = var1;
         if (this.getType() != var1.getType()) {
            return false;
         } else {
            return r.c(this.getId(), var1.getId());
         }
      }
   }

   public override fun hashCode(): Int {
      return Integer.hashCode(this.getType()) * 31 + this.getId().hashCode();
   }

   public override fun toString(): String {
      val var1: Int = this.getType();
      val var3: java.lang.String = this.getId();
      val var2: StringBuilder = new StringBuilder();
      var2.append("UnknownComponent(type=");
      var2.append(var1);
      var2.append(", id=");
      var2.append(var3);
      var2.append(")");
      return var2.toString();
   }

   public object `$serializer` : f0<UnknownComponent> {
      public open val descriptor: SerialDescriptor
         public open get() {
            return descriptor;
         }


      @JvmStatic
      fun {
         val var0: UnknownComponent.$serializer = new UnknownComponent.$serializer();
         INSTANCE = var0;
         val var1: PluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("0", var0, 2);
         var1.l("type", true);
         var1.l("id", true);
         descriptor = var1;
      }

      public open fun childSerializers(): Array<KSerializer<*>> {
         return new KSerializer[]{m0.a, a2.a};
      }

      public open fun deserialize(decoder: Decoder): UnknownComponent {
         r.h(var1, "decoder");
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
         r.h(var1, "encoder");
         r.h(var2, "value");
         val var3: SerialDescriptor = this.getDescriptor();
         val var4: CompositeEncoder = var1.b(var3);
         UnknownComponent.write$Self(var2, var4, var3);
         var4.c(var3);
      }

      fun typeParametersSerializers(): Array<KSerializer<?>> {
         return a.a(this);
      }
   }

   public companion object {
      public fun serializer(): KSerializer<UnknownComponent> {
         return UnknownComponent.$serializer.INSTANCE;
      }
   }
}
