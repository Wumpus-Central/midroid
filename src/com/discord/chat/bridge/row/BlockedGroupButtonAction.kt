package com.discord.chat.bridge.row

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
import xk.f0.a

@f
public data class BlockedGroupButtonAction(type: String, context: String) {
   public final val context: String
   public final val type: String

   init {
      r.h(var1, "type");
      r.h(var2, "context");
      super();
      this.type = var1;
      this.context = var2;
   }

   @JvmStatic
   public fun `write$Self`(self: BlockedGroupButtonAction, output: CompositeEncoder, serialDesc: SerialDescriptor) {
      r.h(var0, "self");
      r.h(var1, "output");
      r.h(var2, "serialDesc");
      var1.z(var2, 0, var0.type);
      var1.z(var2, 1, var0.context);
   }

   public operator fun component1(): String {
      return this.type;
   }

   public operator fun component2(): String {
      return this.context;
   }

   public fun copy(type: String = var0.type, context: String = var0.context): BlockedGroupButtonAction {
      r.h(var1, "type");
      r.h(var2, "context");
      return new BlockedGroupButtonAction(var1, var2);
   }

   public override operator fun equals(other: Any?): Boolean {
      if (this === var1) {
         return true;
      } else if (var1 !is BlockedGroupButtonAction) {
         return false;
      } else {
         var1 = var1;
         if (!r.c(this.type, var1.type)) {
            return false;
         } else {
            return r.c(this.context, var1.context);
         }
      }
   }

   public override fun hashCode(): Int {
      return this.type.hashCode() * 31 + this.context.hashCode();
   }

   public override fun toString(): String {
      val var1: java.lang.String = this.type;
      val var3: java.lang.String = this.context;
      val var2: StringBuilder = new StringBuilder();
      var2.append("BlockedGroupButtonAction(type=");
      var2.append(var1);
      var2.append(", context=");
      var2.append(var3);
      var2.append(")");
      return var2.toString();
   }

   public object `$serializer` : f0<BlockedGroupButtonAction> {
      public open val descriptor: SerialDescriptor
         public open get() {
            return descriptor;
         }


      @JvmStatic
      fun {
         val var0: BlockedGroupButtonAction.$serializer = new BlockedGroupButtonAction.$serializer();
         INSTANCE = var0;
         val var1: PluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("com.discord.chat.bridge.row.BlockedGroupButtonAction", var0, 2);
         var1.l("type", false);
         var1.l("context", false);
         descriptor = var1;
      }

      public open fun childSerializers(): Array<KSerializer<*>> {
         return new KSerializer[]{a2.a, a2.a};
      }

      public open fun deserialize(decoder: Decoder): BlockedGroupButtonAction {
         r.h(var1, "decoder");
         val var6: SerialDescriptor = this.getDescriptor();
         val var7: c = var1.b(var6);
         var var2: Int;
         var var5: java.lang.String;
         var var8: java.lang.String;
         if (var7.p()) {
            var8 = var7.m(var6, 0);
            var5 = var7.m(var6, 1);
            var2 = 3;
         } else {
            var var3: Boolean = true;
            var2 = 0;
            var8 = null;
            var5 = null;

            while (var3) {
               val var4: Int = var7.o(var6);
               if (var4 != -1) {
                  if (var4 != 0) {
                     if (var4 != 1) {
                        throw new n(var4);
                     }

                     var5 = var7.m(var6, 1);
                     var2 |= 2;
                  } else {
                     var8 = var7.m(var6, 0);
                     var2 |= 1;
                  }
               } else {
                  var3 = false;
               }
            }
         }

         var7.c(var6);
         return new BlockedGroupButtonAction(var2, var8, var5, null);
      }

      public open fun serialize(encoder: Encoder, value: BlockedGroupButtonAction) {
         r.h(var1, "encoder");
         r.h(var2, "value");
         val var3: SerialDescriptor = this.getDescriptor();
         val var4: CompositeEncoder = var1.b(var3);
         BlockedGroupButtonAction.write$Self(var2, var4, var3);
         var4.c(var3);
      }

      fun typeParametersSerializers(): Array<KSerializer<?>> {
         return a.a(this);
      }
   }

   public companion object {
      public fun serializer(): KSerializer<BlockedGroupButtonAction> {
         return BlockedGroupButtonAction.$serializer.INSTANCE;
      }
   }
}
