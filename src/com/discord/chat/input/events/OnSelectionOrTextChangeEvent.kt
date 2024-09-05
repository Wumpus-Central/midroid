package com.discord.chat.input.events

import com.discord.reactevents.ReactEvent
import com.discord.reactevents.ReactEvent.DefaultImpls
import com.facebook.react.bridge.WritableMap
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
internal data class OnSelectionOrTextChangeEvent(start: Int, end: Int, text: String, editId: String) : ReactEvent {
   public final val editId: String
   public final val end: Int
   public final val start: Int
   public final val text: String

   init {
      q.h(var3, "text");
      q.h(var4, "editId");
      super();
      this.start = var1;
      this.end = var2;
      this.text = var3;
      this.editId = var4;
   }

   public operator fun component1(): Int {
      return this.start;
   }

   public operator fun component2(): Int {
      return this.end;
   }

   public operator fun component3(): String {
      return this.text;
   }

   public operator fun component4(): String {
      return this.editId;
   }

   public fun copy(start: Int = var0.start, end: Int = var0.end, text: String = var0.text, editId: String = var0.editId): OnSelectionOrTextChangeEvent {
      q.h(var3, "text");
      q.h(var4, "editId");
      return new OnSelectionOrTextChangeEvent(var1, var2, var3, var4);
   }

   public override operator fun equals(other: Any?): Boolean {
      if (this === var1) {
         return true;
      } else if (var1 !is OnSelectionOrTextChangeEvent) {
         return false;
      } else {
         var1 = var1;
         if (this.start != var1.start) {
            return false;
         } else if (this.end != var1.end) {
            return false;
         } else if (!q.c(this.text, var1.text)) {
            return false;
         } else {
            return q.c(this.editId, var1.editId);
         }
      }
   }

   public override fun hashCode(): Int {
      return ((Integer.hashCode(this.start) * 31 + Integer.hashCode(this.end)) * 31 + this.text.hashCode()) * 31 + this.editId.hashCode();
   }

   fun serialize(): WritableMap {
      return DefaultImpls.serialize(this);
   }

   public override fun toString(): String {
      val var2: Int = this.start;
      val var1: Int = this.end;
      val var5: java.lang.String = this.text;
      val var4: java.lang.String = this.editId;
      val var3: StringBuilder = new StringBuilder();
      var3.append("OnSelectionOrTextChangeEvent(start=");
      var3.append(var2);
      var3.append(", end=");
      var3.append(var1);
      var3.append(", text=");
      var3.append(var5);
      var3.append(", editId=");
      var3.append(var4);
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
         val var0: OnSelectionOrTextChangeEvent.$serializer = new OnSelectionOrTextChangeEvent.$serializer();
         INSTANCE = var0;
         val var1: PluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("com.discord.chat.input.events.OnSelectionOrTextChangeEvent", var0, 4);
         var1.c("start", false);
         var1.c("end", false);
         var1.c("text", false);
         var1.c("editId", false);
         descriptor = var1;
      }

      public open fun childSerializers(): Array<KSerializer<*>> {
         return new KSerializer[]{n0.a, n0.a, b2.a, b2.a};
      }

      public open fun deserialize(decoder: Decoder): OnSelectionOrTextChangeEvent {
         q.h(var1, "decoder");
         val var9: SerialDescriptor = this.getDescriptor();
         val var10: c = var1.b(var9);
         var var4: Int;
         val var5: Int;
         val var8: java.lang.String;
         val var11: java.lang.String;
         var var14: Int;
         if (var10.p()) {
            var14 = var10.i(var9, 0);
            val var2: Int = var10.i(var9, 1);
            var8 = var10.m(var9, 2);
            var11 = var10.m(var9, 3);
            var4 = 15;
            var5 = var14;
            var14 = var2;
         } else {
            var var7: java.lang.String = null;
            var var12: java.lang.String = null;
            var var16: Boolean = true;
            var4 = 0;
            var14 = 0;
            var var13: Int = 0;

            while (var16) {
               val var6: Int = var10.o(var9);
               if (var6 != -1) {
                  if (var6 != 0) {
                     if (var6 != 1) {
                        if (var6 != 2) {
                           if (var6 != 3) {
                              throw new n(var6);
                           }

                           var7 = var10.m(var9, 3);
                           var13 |= 8;
                        } else {
                           var12 = var10.m(var9, 2);
                           var13 |= 4;
                        }
                     } else {
                        var14 = var10.i(var9, 1);
                        var13 |= 2;
                     }
                  } else {
                     var4 = var10.i(var9, 0);
                     var13 |= 1;
                  }
               } else {
                  var16 = false;
               }
            }

            var8 = var12;
            var11 = var7;
            var5 = var4;
            var4 = var13;
         }

         var10.c(var9);
         return new OnSelectionOrTextChangeEvent(var4, var5, var14, var8, var11, null);
      }

      public open fun serialize(encoder: Encoder, value: OnSelectionOrTextChangeEvent) {
         q.h(var1, "encoder");
         q.h(var2, "value");
         val var3: SerialDescriptor = this.getDescriptor();
         val var4: CompositeEncoder = var1.b(var3);
         OnSelectionOrTextChangeEvent.write$Self$chat_input_release(var2, var4, var3);
         var4.c(var3);
      }

      fun typeParametersSerializers(): Array<KSerializer> {
         return a.a(this);
      }
   }

   public companion object {
      public fun serializer(): KSerializer<OnSelectionOrTextChangeEvent> {
         return OnSelectionOrTextChangeEvent.$serializer.INSTANCE;
      }
   }
}
