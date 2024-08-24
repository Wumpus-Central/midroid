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
import xk.f0
import xk.f0.a

@f
public data class LoadingAction(type: LoadingActionType) {
   public final val type: LoadingActionType

   init {
      r.h(var1, "type");
      super();
      this.type = var1;
   }

   @JvmStatic
   public fun `write$Self`(self: LoadingAction, output: CompositeEncoder, serialDesc: SerialDescriptor) {
      r.h(var0, "self");
      r.h(var1, "output");
      r.h(var2, "serialDesc");
      var1.y(var2, 0, LoadingActionType.Companion.serializer(), var0.type);
   }

   public operator fun component1(): LoadingActionType {
      return this.type;
   }

   public fun copy(type: LoadingActionType = var0.type): LoadingAction {
      r.h(var1, "type");
      return new LoadingAction(var1);
   }

   public override operator fun equals(other: Any?): Boolean {
      if (this === var1) {
         return true;
      } else if (var1 !is LoadingAction) {
         return false;
      } else {
         return this.type === (var1 as LoadingAction).type;
      }
   }

   public override fun hashCode(): Int {
      return this.type.hashCode();
   }

   public override fun toString(): String {
      val var1: LoadingActionType = this.type;
      val var2: StringBuilder = new StringBuilder();
      var2.append("LoadingAction(type=");
      var2.append(var1);
      var2.append(")");
      return var2.toString();
   }

   public object `$serializer` : f0<LoadingAction> {
      public open val descriptor: SerialDescriptor
         public open get() {
            return descriptor;
         }


      @JvmStatic
      fun {
         val var0: LoadingAction.$serializer = new LoadingAction.$serializer();
         INSTANCE = var0;
         val var1: PluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("com.discord.chat.bridge.row.LoadingAction", var0, 1);
         var1.l("type", false);
         descriptor = var1;
      }

      public open fun childSerializers(): Array<KSerializer<*>> {
         return new KSerializer[]{LoadingActionType.Companion.serializer()};
      }

      public open fun deserialize(decoder: Decoder): LoadingAction {
         r.h(var1, "decoder");
         val var6: SerialDescriptor = this.getDescriptor();
         val var7: c = var1.b(var6);
         val var5: Boolean = var7.p();
         var var2: Int = 1;
         var var3: Boolean = true;
         var var8: Any;
         if (var5) {
            var8 = var7.y(var6, 0, LoadingActionType.Companion.serializer(), null);
         } else {
            var2 = 0;
            var8 = null;

            while (var3) {
               val var4: Int = var7.o(var6);
               if (var4 != -1) {
                  if (var4 != 0) {
                     throw new n(var4);
                  }

                  var8 = var7.y(var6, 0, LoadingActionType.Companion.serializer(), var8);
                  var2 |= 1;
               } else {
                  var3 = false;
               }
            }
         }

         var7.c(var6);
         return new LoadingAction(var2, var8 as LoadingActionType, null);
      }

      public open fun serialize(encoder: Encoder, value: LoadingAction) {
         r.h(var1, "encoder");
         r.h(var2, "value");
         val var3: SerialDescriptor = this.getDescriptor();
         val var4: CompositeEncoder = var1.b(var3);
         LoadingAction.write$Self(var2, var4, var3);
         var4.c(var3);
      }

      fun typeParametersSerializers(): Array<KSerializer<?>> {
         return a.a(this);
      }
   }

   public companion object {
      public fun serializer(): KSerializer<LoadingAction> {
         return LoadingAction.$serializer.INSTANCE;
      }
   }
}
