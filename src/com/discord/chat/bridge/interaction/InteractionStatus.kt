package com.discord.chat.bridge.interaction

import com.discord.chat.bridge.structurabletext.StructurableText
import com.discord.chat.bridge.structurabletext.StructurableTextSerializer
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
public data class InteractionStatus(state: InteractionStatusViewState, text: StructurableText) {
   public final val state: InteractionStatusViewState
   public final val text: StructurableText

   init {
      r.h(var1, "state");
      r.h(var2, "text");
      super();
      this.state = var1;
      this.text = var2;
   }

   @JvmStatic
   public fun `write$Self`(self: InteractionStatus, output: CompositeEncoder, serialDesc: SerialDescriptor) {
      r.h(var0, "self");
      r.h(var1, "output");
      r.h(var2, "serialDesc");
      var1.y(var2, 0, InteractionStatusViewState.Serializer.INSTANCE, var0.state);
      var1.y(var2, 1, StructurableTextSerializer.INSTANCE, var0.text);
   }

   public operator fun component1(): InteractionStatusViewState {
      return this.state;
   }

   public operator fun component2(): StructurableText {
      return this.text;
   }

   public fun copy(state: InteractionStatusViewState = var0.state, text: StructurableText = var0.text): InteractionStatus {
      r.h(var1, "state");
      r.h(var2, "text");
      return new InteractionStatus(var1, var2);
   }

   public override operator fun equals(other: Any?): Boolean {
      if (this === var1) {
         return true;
      } else if (var1 !is InteractionStatus) {
         return false;
      } else {
         var1 = var1;
         if (this.state != var1.state) {
            return false;
         } else {
            return r.c(this.text, var1.text);
         }
      }
   }

   public override fun hashCode(): Int {
      return this.state.hashCode() * 31 + this.text.hashCode();
   }

   public fun isFailed(): Boolean {
      val var1: Boolean;
      if (this.state === InteractionStatusViewState.FAILED) {
         var1 = true;
      } else {
         var1 = false;
      }

      return var1;
   }

   public fun isLoading(): Boolean {
      val var1: Boolean;
      if (this.state === InteractionStatusViewState.LOADING) {
         var1 = true;
      } else {
         var1 = false;
      }

      return var1;
   }

   public override fun toString(): String {
      val var2: InteractionStatusViewState = this.state;
      val var3: StructurableText = this.text;
      val var1: StringBuilder = new StringBuilder();
      var1.append("InteractionStatus(state=");
      var1.append(var2);
      var1.append(", text=");
      var1.append(var3);
      var1.append(")");
      return var1.toString();
   }

   public object `$serializer` : f0<InteractionStatus> {
      public open val descriptor: SerialDescriptor
         public open get() {
            return descriptor;
         }


      @JvmStatic
      fun {
         val var0: InteractionStatus.$serializer = new InteractionStatus.$serializer();
         INSTANCE = var0;
         val var1: PluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("com.discord.chat.bridge.interaction.InteractionStatus", var0, 2);
         var1.l("state", false);
         var1.l("text", false);
         descriptor = var1;
      }

      public open fun childSerializers(): Array<KSerializer<*>> {
         return new KSerializer[]{InteractionStatusViewState.Serializer.INSTANCE, StructurableTextSerializer.INSTANCE};
      }

      public open fun deserialize(decoder: Decoder): InteractionStatus {
         r.h(var1, "decoder");
         val var6: SerialDescriptor = this.getDescriptor();
         val var7: c = var1.b(var6);
         var var2: Int;
         var var5: Any;
         var var8: Any;
         if (var7.p()) {
            var8 = var7.y(var6, 0, InteractionStatusViewState.Serializer.INSTANCE, null);
            var5 = var7.y(var6, 1, StructurableTextSerializer.INSTANCE, null);
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

                     var5 = var7.y(var6, 1, StructurableTextSerializer.INSTANCE, var5);
                     var2 |= 2;
                  } else {
                     var8 = var7.y(var6, 0, InteractionStatusViewState.Serializer.INSTANCE, var8);
                     var2 |= 1;
                  }
               } else {
                  var3 = false;
               }
            }
         }

         var7.c(var6);
         return new InteractionStatus(var2, var8 as InteractionStatusViewState, var5 as StructurableText, null);
      }

      public open fun serialize(encoder: Encoder, value: InteractionStatus) {
         r.h(var1, "encoder");
         r.h(var2, "value");
         val var3: SerialDescriptor = this.getDescriptor();
         val var4: CompositeEncoder = var1.b(var3);
         InteractionStatus.write$Self(var2, var4, var3);
         var4.c(var3);
      }

      fun typeParametersSerializers(): Array<KSerializer<?>> {
         return a.a(this);
      }
   }

   public companion object {
      public fun serializer(): KSerializer<InteractionStatus> {
         return InteractionStatus.$serializer.INSTANCE;
      }
   }
}
