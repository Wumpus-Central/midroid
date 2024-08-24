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
public data class BlockedGroupButton(action: BlockedGroupButtonAction) {
   public final val action: BlockedGroupButtonAction

   init {
      r.h(var1, "action");
      super();
      this.action = var1;
   }

   @JvmStatic
   public fun `write$Self`(self: BlockedGroupButton, output: CompositeEncoder, serialDesc: SerialDescriptor) {
      r.h(var0, "self");
      r.h(var1, "output");
      r.h(var2, "serialDesc");
      var1.y(var2, 0, BlockedGroupButtonAction.$serializer.INSTANCE, var0.action);
   }

   public operator fun component1(): BlockedGroupButtonAction {
      return this.action;
   }

   public fun copy(action: BlockedGroupButtonAction = var0.action): BlockedGroupButton {
      r.h(var1, "action");
      return new BlockedGroupButton(var1);
   }

   public override operator fun equals(other: Any?): Boolean {
      if (this === var1) {
         return true;
      } else if (var1 !is BlockedGroupButton) {
         return false;
      } else {
         return r.c(this.action, (var1 as BlockedGroupButton).action);
      }
   }

   public override fun hashCode(): Int {
      return this.action.hashCode();
   }

   public override fun toString(): String {
      val var1: BlockedGroupButtonAction = this.action;
      val var2: StringBuilder = new StringBuilder();
      var2.append("BlockedGroupButton(action=");
      var2.append(var1);
      var2.append(")");
      return var2.toString();
   }

   public object `$serializer` : f0<BlockedGroupButton> {
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
         r.h(var1, "decoder");
         val var6: SerialDescriptor = this.getDescriptor();
         val var7: c = var1.b(var6);
         val var5: Boolean = var7.p();
         var var2: Int = 1;
         var var3: Boolean = true;
         var var8: Any;
         if (var5) {
            var8 = var7.y(var6, 0, BlockedGroupButtonAction.$serializer.INSTANCE, null);
         } else {
            var2 = 0;
            var8 = null;

            while (var3) {
               val var4: Int = var7.o(var6);
               if (var4 != -1) {
                  if (var4 != 0) {
                     throw new n(var4);
                  }

                  var8 = var7.y(var6, 0, BlockedGroupButtonAction.$serializer.INSTANCE, var8);
                  var2 |= 1;
               } else {
                  var3 = false;
               }
            }
         }

         var7.c(var6);
         return new BlockedGroupButton(var2, var8 as BlockedGroupButtonAction, null);
      }

      public open fun serialize(encoder: Encoder, value: BlockedGroupButton) {
         r.h(var1, "encoder");
         r.h(var2, "value");
         val var3: SerialDescriptor = this.getDescriptor();
         val var4: CompositeEncoder = var1.b(var3);
         BlockedGroupButton.write$Self(var2, var4, var3);
         var4.c(var3);
      }

      fun typeParametersSerializers(): Array<KSerializer<?>> {
         return a.a(this);
      }
   }

   public companion object {
      public fun serializer(): KSerializer<BlockedGroupButton> {
         return BlockedGroupButton.$serializer.INSTANCE;
      }
   }
}
