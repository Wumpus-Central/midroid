package com.discord.chat.bridge.row

import cl.f
import cl.n
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
public data class BlockedGroupButton(action: BlockedGroupButtonAction) {
   public final val action: BlockedGroupButtonAction

   init {
      q.h(var1, "action");
      super();
      this.action = var1;
   }

   public operator fun component1(): BlockedGroupButtonAction {
      return this.action;
   }

   public fun copy(action: BlockedGroupButtonAction = var0.action): BlockedGroupButton {
      q.h(var1, "action");
      return new BlockedGroupButton(var1);
   }

   public override operator fun equals(other: Any?): Boolean {
      if (this === var1) {
         return true;
      } else if (var1 !is BlockedGroupButton) {
         return false;
      } else {
         return q.c(this.action, (var1 as BlockedGroupButton).action);
      }
   }

   public override fun hashCode(): Int {
      return this.action.hashCode();
   }

   public override fun toString(): String {
      val var2: BlockedGroupButtonAction = this.action;
      val var1: StringBuilder = new StringBuilder();
      var1.append("BlockedGroupButton(action=");
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
         val var0: BlockedGroupButton.$serializer = new BlockedGroupButton.$serializer();
         INSTANCE = var0;
         val var1: PluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("com.discord.chat.bridge.row.BlockedGroupButton", var0, 1);
         var1.l("action", false);
         descriptor = var1;
      }

      public open fun childSerializers(): Array<KSerializer<*>> {
         return new KSerializer[]{BlockedGroupButtonAction.$serializer.INSTANCE};
      }

      public open fun deserialize(decoder: Decoder): BlockedGroupButton {
         q.h(var1, "decoder");
         val var6: SerialDescriptor = this.getDescriptor();
         val var7: c = var1.c(var6);
         val var5: Boolean = var7.y();
         var var2: Int = 1;
         var var3: Boolean = true;
         var var8: BlockedGroupButtonAction;
         if (var5) {
            var8 = var7.m(var6, 0, BlockedGroupButtonAction.$serializer.INSTANCE, null) as BlockedGroupButtonAction;
         } else {
            var2 = 0;
            var8 = null;

            while (var3) {
               val var4: Int = var7.x(var6);
               if (var4 != -1) {
                  if (var4 != 0) {
                     throw new n(var4);
                  }

                  var8 = var7.m(var6, 0, BlockedGroupButtonAction.$serializer.INSTANCE, var8) as BlockedGroupButtonAction;
                  var2 |= 1;
               } else {
                  var3 = false;
               }
            }
         }

         var7.b(var6);
         return new BlockedGroupButton(var2, var8, null);
      }

      public open fun serialize(encoder: Encoder, value: BlockedGroupButton) {
         q.h(var1, "encoder");
         q.h(var2, "value");
         val var3: SerialDescriptor = this.getDescriptor();
         val var4: CompositeEncoder = var1.c(var3);
         BlockedGroupButton.write$Self$chat_release(var2, var4, var3);
         var4.b(var3);
      }

      fun typeParametersSerializers(): Array<KSerializer> {
         return a.a(this);
      }
   }

   public companion object {
      public fun serializer(): KSerializer<BlockedGroupButton> {
         return BlockedGroupButton.$serializer.INSTANCE;
      }
   }
}
