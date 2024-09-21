package com.discord.chat.bridge.row

import fl.f
import fl.n
import il.g0
import il.g0.a
import kotlin.jvm.internal.q
import kotlinx.serialization.KSerializer
import kotlinx.serialization.descriptors.SerialDescriptor
import kotlinx.serialization.encoding.CompositeEncoder
import kotlinx.serialization.encoding.Decoder
import kotlinx.serialization.encoding.Encoder
import kotlinx.serialization.encoding.c
import kotlinx.serialization.internal.PluginGeneratedSerialDescriptor

@f
public data class LoadingAction(type: LoadingActionType) {
   public final val type: LoadingActionType

   init {
      q.h(var1, "type");
      super();
      this.type = var1;
   }

   public operator fun component1(): LoadingActionType {
      return this.type;
   }

   public fun copy(type: LoadingActionType = var0.type): LoadingAction {
      q.h(var1, "type");
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
      val var2: LoadingActionType = this.type;
      val var1: StringBuilder = new StringBuilder();
      var1.append("LoadingAction(type=");
      var1.append(var2);
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
         val var0: LoadingAction.$serializer = new LoadingAction.$serializer();
         INSTANCE = var0;
         val var1: PluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("com.discord.chat.bridge.row.LoadingAction", var0, 1);
         var1.l("type", false);
         descriptor = var1;
      }

      public open fun childSerializers(): Array<KSerializer<*>> {
         return new KSerializer[]{LoadingAction.access$get$childSerializers$cp()[0]};
      }

      public open fun deserialize(decoder: Decoder): LoadingAction {
         q.h(var1, "decoder");
         val var6: SerialDescriptor = this.getDescriptor();
         val var7: c = var1.c(var6);
         val var8: Array<KSerializer> = LoadingAction.access$get$childSerializers$cp();
         val var5: Boolean = var7.y();
         var var2: Int = 1;
         var var3: Boolean = true;
         var var9: LoadingActionType;
         if (var5) {
            var9 = var7.m(var6, 0, var8[0], null) as LoadingActionType;
         } else {
            var2 = 0;
            var9 = null;

            while (var3) {
               val var4: Int = var7.x(var6);
               if (var4 != -1) {
                  if (var4 != 0) {
                     throw new n(var4);
                  }

                  var9 = var7.m(var6, 0, var8[0], var9) as LoadingActionType;
                  var2 |= 1;
               } else {
                  var3 = false;
               }
            }
         }

         var7.b(var6);
         return new LoadingAction(var2, var9, null);
      }

      public open fun serialize(encoder: Encoder, value: LoadingAction) {
         q.h(var1, "encoder");
         q.h(var2, "value");
         val var3: SerialDescriptor = this.getDescriptor();
         val var4: CompositeEncoder = var1.c(var3);
         LoadingAction.write$Self$chat_release(var2, var4, var3);
         var4.b(var3);
      }

      fun typeParametersSerializers(): Array<KSerializer> {
         return a.a(this);
      }
   }

   public companion object {
      public fun serializer(): KSerializer<LoadingAction> {
         return LoadingAction.$serializer.INSTANCE;
      }
   }
}
