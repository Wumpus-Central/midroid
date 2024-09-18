package com.discord.chat.bridge.interaction

import bl.g0
import bl.g0.a
import com.discord.chat.bridge.structurabletext.StructurableText
import com.discord.chat.bridge.structurabletext.StructurableTextSerializer
import kotlin.jvm.internal.q
import kotlinx.serialization.KSerializer
import kotlinx.serialization.descriptors.SerialDescriptor
import kotlinx.serialization.encoding.CompositeEncoder
import kotlinx.serialization.encoding.Decoder
import kotlinx.serialization.encoding.Encoder
import kotlinx.serialization.encoding.c
import kotlinx.serialization.internal.PluginGeneratedSerialDescriptor
import yk.f
import yk.n

@f
public data class InteractionStatus(state: InteractionStatusViewState, text: StructurableText) {
   public final val state: InteractionStatusViewState
   public final val text: StructurableText

   init {
      q.h(var1, "state");
      q.h(var2, "text");
      super();
      this.state = var1;
      this.text = var2;
   }

   public operator fun component1(): InteractionStatusViewState {
      return this.state;
   }

   public operator fun component2(): StructurableText {
      return this.text;
   }

   public fun copy(state: InteractionStatusViewState = var0.state, text: StructurableText = var0.text): InteractionStatus {
      q.h(var1, "state");
      q.h(var2, "text");
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
            return q.c(this.text, var1.text);
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
      val var1: InteractionStatusViewState = this.state;
      val var2: StructurableText = this.text;
      val var3: StringBuilder = new StringBuilder();
      var3.append("InteractionStatus(state=");
      var3.append(var1);
      var3.append(", text=");
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
         q.h(var1, "decoder");
         val var6: SerialDescriptor = this.getDescriptor();
         val var7: c = var1.c(var6);
         var var2: Int;
         var var5: StructurableText;
         var var8: InteractionStatusViewState;
         if (var7.y()) {
            var8 = var7.m(var6, 0, InteractionStatusViewState.Serializer.INSTANCE, null) as InteractionStatusViewState;
            var5 = var7.m(var6, 1, StructurableTextSerializer.INSTANCE, null) as StructurableText;
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

                     var5 = var7.m(var6, 1, StructurableTextSerializer.INSTANCE, var5) as StructurableText;
                     var2 |= 2;
                  } else {
                     var8 = var7.m(var6, 0, InteractionStatusViewState.Serializer.INSTANCE, var8) as InteractionStatusViewState;
                     var2 |= 1;
                  }
               } else {
                  var3 = false;
               }
            }
         }

         var7.b(var6);
         return new InteractionStatus(var2, var8, var5, null);
      }

      public open fun serialize(encoder: Encoder, value: InteractionStatus) {
         q.h(var1, "encoder");
         q.h(var2, "value");
         val var3: SerialDescriptor = this.getDescriptor();
         val var4: CompositeEncoder = var1.c(var3);
         InteractionStatus.write$Self$chat_release(var2, var4, var3);
         var4.b(var3);
      }

      fun typeParametersSerializers(): Array<KSerializer> {
         return a.a(this);
      }
   }

   public companion object {
      public fun serializer(): KSerializer<InteractionStatus> {
         return InteractionStatus.$serializer.INSTANCE;
      }
   }
}
