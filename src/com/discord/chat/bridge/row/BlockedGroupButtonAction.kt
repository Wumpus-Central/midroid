package com.discord.chat.bridge.row

import cl.f
import cl.n
import fl.b2
import fl.g0
import fl.g0.a
import kotlin.jvm.internal.q
import kotlinx.serialization.KSerializer
import kotlinx.serialization.descriptors.SerialDescriptor
import kotlinx.serialization.encoding.CompositeEncoder
import kotlinx.serialization.encoding.Decoder
import kotlinx.serialization.encoding.Encoder
import kotlinx.serialization.encoding.c
import kotlinx.serialization.internal.PluginGeneratedSerialDescriptor

@f
public data class BlockedGroupButtonAction(type: String, context: String) {
   public final val context: String
   public final val type: String

   init {
      q.h(var1, "type");
      q.h(var2, "context");
      super();
      this.type = var1;
      this.context = var2;
   }

   public operator fun component1(): String {
      return this.type;
   }

   public operator fun component2(): String {
      return this.context;
   }

   public fun copy(type: String = var0.type, context: String = var0.context): BlockedGroupButtonAction {
      q.h(var1, "type");
      q.h(var2, "context");
      return new BlockedGroupButtonAction(var1, var2);
   }

   public override operator fun equals(other: Any?): Boolean {
      if (this === var1) {
         return true;
      } else if (var1 !is BlockedGroupButtonAction) {
         return false;
      } else {
         var1 = var1;
         if (!q.c(this.type, var1.type)) {
            return false;
         } else {
            return q.c(this.context, var1.context);
         }
      }
   }

   public override fun hashCode(): Int {
      return this.type.hashCode() * 31 + this.context.hashCode();
   }

   public override fun toString(): String {
      val var2: java.lang.String = this.type;
      val var3: java.lang.String = this.context;
      val var1: StringBuilder = new StringBuilder();
      var1.append("BlockedGroupButtonAction(type=");
      var1.append(var2);
      var1.append(", context=");
      var1.append(var3);
      var1.append(")");
      return var1.toString();
   }

   public object `$serializer` : g0 {
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
         return new KSerializer[]{b2.a, b2.a};
      }

      public open fun deserialize(decoder: Decoder): BlockedGroupButtonAction {
         q.h(var1, "decoder");
         val var6: SerialDescriptor = this.getDescriptor();
         val var7: c = var1.c(var6);
         var var2: Int;
         var var5: java.lang.String;
         var var8: java.lang.String;
         if (var7.y()) {
            var8 = var7.t(var6, 0);
            var5 = var7.t(var6, 1);
            var2 = 3;
         } else {
            var var3: Boolean = true;
            var2 = 0;
            var8 = null;
            var5 = null;

            while (var3) {
               val var4: Int = var7.x(var6);
               if (var4 != -1) {
                  if (var4 != 0) {
                     if (var4 != 1) {
                        throw new n(var4);
                     }

                     var5 = var7.t(var6, 1);
                     var2 |= 2;
                  } else {
                     var8 = var7.t(var6, 0);
                     var2 |= 1;
                  }
               } else {
                  var3 = false;
               }
            }
         }

         var7.b(var6);
         return new BlockedGroupButtonAction(var2, var8, var5, null);
      }

      public open fun serialize(encoder: Encoder, value: BlockedGroupButtonAction) {
         q.h(var1, "encoder");
         q.h(var2, "value");
         val var3: SerialDescriptor = this.getDescriptor();
         val var4: CompositeEncoder = var1.c(var3);
         BlockedGroupButtonAction.write$Self$chat_release(var2, var4, var3);
         var4.b(var3);
      }

      fun typeParametersSerializers(): Array<KSerializer> {
         return a.a(this);
      }
   }

   public companion object {
      public fun serializer(): KSerializer<BlockedGroupButtonAction> {
         return BlockedGroupButtonAction.$serializer.INSTANCE;
      }
   }
}
