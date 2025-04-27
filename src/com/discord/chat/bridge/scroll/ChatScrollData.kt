package com.discord.chat.bridge.scroll

import ca.f
import ca.n
import da.a
import fa.G
import fa.N
import fa.h
import kotlin.jvm.internal.q
import kotlinx.serialization.KSerializer
import kotlinx.serialization.descriptors.SerialDescriptor
import kotlinx.serialization.encoding.CompositeEncoder
import kotlinx.serialization.encoding.Decoder
import kotlinx.serialization.encoding.Encoder
import kotlinx.serialization.encoding.c
import kotlinx.serialization.internal.PluginGeneratedSerialDescriptor

@f
public data class ChatScrollData(type: ChatScrollType, index: Int, animate: Boolean = false, highlight: Boolean = false, position: Int? = null) {
   public final val animate: Boolean
   public final val highlight: Boolean
   public final val index: Int
   public final val position: Int?
   public final val type: ChatScrollType

   init {
      q.h(var1, "type");
      super();
      this.type = var1;
      this.index = var2;
      this.animate = var3;
      this.highlight = var4;
      this.position = var5;
   }

   public operator fun component1(): ChatScrollType {
      return this.type;
   }

   public operator fun component2(): Int {
      return this.index;
   }

   public operator fun component3(): Boolean {
      return this.animate;
   }

   public operator fun component4(): Boolean {
      return this.highlight;
   }

   public operator fun component5(): Int? {
      return this.position;
   }

   public fun copy(
      type: ChatScrollType = var0.type,
      index: Int = var0.index,
      animate: Boolean = var0.animate,
      highlight: Boolean = var0.highlight,
      position: Int? = var0.position
   ): ChatScrollData {
      q.h(var1, "type");
      return new ChatScrollData(var1, var2, var3, var4, var5);
   }

   public override operator fun equals(other: Any?): Boolean {
      if (this === var1) {
         return true;
      } else if (var1 !is ChatScrollData) {
         return false;
      } else {
         var1 = var1;
         if (this.type != var1.type) {
            return false;
         } else if (this.index != var1.index) {
            return false;
         } else if (this.animate != var1.animate) {
            return false;
         } else if (this.highlight != var1.highlight) {
            return false;
         } else {
            return q.c(this.position, var1.position);
         }
      }
   }

   public override fun hashCode(): Int {
      val var4: Int = this.type.hashCode();
      val var5: Int = Integer.hashCode(this.index);
      val var3: Int = java.lang.Boolean.hashCode(this.animate);
      val var2: Int = java.lang.Boolean.hashCode(this.highlight);
      val var1: Int;
      if (this.position == null) {
         var1 = 0;
      } else {
         var1 = this.position.hashCode();
      }

      return (((var4 * 31 + var5) * 31 + var3) * 31 + var2) * 31 + var1;
   }

   public override fun toString(): String {
      val var5: ChatScrollType = this.type;
      val var1: Int = this.index;
      val var2: Boolean = this.animate;
      val var3: Boolean = this.highlight;
      val var6: Int = this.position;
      val var4: StringBuilder = new StringBuilder();
      var4.append("ChatScrollData(type=");
      var4.append(var5);
      var4.append(", index=");
      var4.append(var1);
      var4.append(", animate=");
      var4.append(var2);
      var4.append(", highlight=");
      var4.append(var3);
      var4.append(", position=");
      var4.append(var6);
      var4.append(")");
      return var4.toString();
   }

   public object `$serializer` : G {
      public open val descriptor: SerialDescriptor
         public open get() {
            return descriptor;
         }


      @JvmStatic
      fun {
         val var0: ChatScrollData.$serializer = new ChatScrollData.$serializer();
         INSTANCE = var0;
         val var1: PluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("com.discord.chat.bridge.scroll.ChatScrollData", var0, 5);
         var1.l("type", false);
         var1.l("index", false);
         var1.l("animate", true);
         var1.l("highlight", true);
         var1.l("position", true);
         descriptor = var1;
      }

      public open fun childSerializers(): Array<KSerializer<*>> {
         return new KSerializer[]{ChatScrollType.Serializer.INSTANCE, N.a, h.a, h.a, a.u(N.a)};
      }

      public open fun deserialize(decoder: Decoder): ChatScrollData {
         q.h(var1, "decoder");
         val var10: SerialDescriptor = this.getDescriptor();
         val var11: c = var1.c(var10);
         var var3: Int;
         var var4: Int;
         val var5: Int;
         var var7: Boolean;
         val var9: ChatScrollType;
         var var13: Int;
         if (var11.y()) {
            val var12: ChatScrollType = var11.m(var10, 0, ChatScrollType.Serializer.INSTANCE, null) as ChatScrollType;
            var3 = var11.k(var10, 1);
            val var2: Byte = var11.s(var10, 2);
            var7 = var11.s(var10, 3);
            val var8: Int = var11.v(var10, 4, N.a, null) as Int;
            var5 = 31;
            var9 = var12;
            var4 = var2;
            var13 = var8;
         } else {
            var var15: Boolean = true;
            var7 = false;
            var3 = 0;
            var var14: Int = 0;
            var var16: ChatScrollType = null;
            var13 = null;
            var4 = 0;

            while (var15) {
               val var6: Int = var11.x(var10);
               if (var6 != -1) {
                  if (var6 != 0) {
                     if (var6 != 1) {
                        if (var6 != 2) {
                           if (var6 != 3) {
                              if (var6 != 4) {
                                 throw new n(var6);
                              }

                              var13 = var11.v(var10, 4, N.a, var13) as Int;
                              var14 |= 16;
                           } else {
                              var7 = var11.s(var10, 3);
                              var14 |= 8;
                           }
                        } else {
                           var4 = var11.s(var10, 2);
                           var14 |= 4;
                        }
                     } else {
                        var3 = var11.k(var10, 1);
                        var14 |= 2;
                     }
                  } else {
                     var16 = var11.m(var10, 0, ChatScrollType.Serializer.INSTANCE, var16) as ChatScrollType;
                     var14 |= 1;
                  }
               } else {
                  var15 = false;
               }
            }

            var9 = var16;
            var5 = var14;
         }

         var11.b(var10);
         return new ChatScrollData(var5, var9, var3, (boolean)var4, var7, var13, null);
      }

      public open fun serialize(encoder: Encoder, value: ChatScrollData) {
         q.h(var1, "encoder");
         q.h(var2, "value");
         val var3: SerialDescriptor = this.getDescriptor();
         val var4: CompositeEncoder = var1.c(var3);
         ChatScrollData.write$Self$chat_release(var2, var4, var3);
         var4.b(var3);
      }

      fun typeParametersSerializers(): Array<KSerializer> {
         return fa.G.a.a(this);
      }
   }

   public companion object {
      public fun serializer(): KSerializer<ChatScrollData> {
         return ChatScrollData.$serializer.INSTANCE;
      }
   }
}
