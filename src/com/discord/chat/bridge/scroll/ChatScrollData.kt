package com.discord.chat.bridge.scroll

import Y9.f
import Y9.n
import Z9.a
import ba.G
import ba.N
import ba.h
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
      val var5: Int = this.type.hashCode();
      val var4: Int = Integer.hashCode(this.index);
      val var3: Int = java.lang.Boolean.hashCode(this.animate);
      val var2: Int = java.lang.Boolean.hashCode(this.highlight);
      val var1: Int;
      if (this.position == null) {
         var1 = 0;
      } else {
         var1 = this.position.hashCode();
      }

      return (((var5 * 31 + var4) * 31 + var3) * 31 + var2) * 31 + var1;
   }

   public override fun toString(): String {
      val var5: ChatScrollType = this.type;
      val var1: Int = this.index;
      val var2: Boolean = this.animate;
      val var3: Boolean = this.highlight;
      val var4: Int = this.position;
      val var6: StringBuilder = new StringBuilder();
      var6.append("ChatScrollData(type=");
      var6.append(var5);
      var6.append(", index=");
      var6.append(var1);
      var6.append(", animate=");
      var6.append(var2);
      var6.append(", highlight=");
      var6.append(var3);
      var6.append(", position=");
      var6.append(var4);
      var6.append(")");
      return var6.toString();
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
         var var2: Int;
         var var3: Int;
         var var4: Int;
         var var7: Boolean;
         var var8: ChatScrollType;
         var var13: Int;
         if (var11.y()) {
            val var12: ChatScrollType = var11.m(var10, 0, ChatScrollType.Serializer.INSTANCE, null) as ChatScrollType;
            var3 = var11.k(var10, 1);
            var2 = var11.s(var10, 2);
            var7 = var11.s(var10, 3);
            val var9: Int = var11.v(var10, 4, N.a, null) as Int;
            var4 = 31;
            var8 = var12;
            var13 = var9;
         } else {
            var var5: Boolean = true;
            var7 = false;
            var3 = 0;
            var2 = 0;
            var8 = null;
            var13 = null;
            var4 = 0;

            while (var5) {
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
                              var2 |= 16;
                           } else {
                              var7 = var11.s(var10, 3);
                              var2 |= 8;
                           }
                        } else {
                           var4 = var11.s(var10, 2);
                           var2 |= 4;
                        }
                     } else {
                        var3 = var11.k(var10, 1);
                        var2 |= 2;
                     }
                  } else {
                     var8 = var11.m(var10, 0, ChatScrollType.Serializer.INSTANCE, var8) as ChatScrollType;
                     var2 |= 1;
                  }
               } else {
                  var5 = false;
               }
            }

            var4 = var2;
            var2 = var4;
         }

         var11.b(var10);
         return new ChatScrollData(var4, var8, var3, (boolean)var2, var7, var13, null);
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
         return ba.G.a.a(this);
      }
   }

   public companion object {
      public fun serializer(): KSerializer<ChatScrollData> {
         return ChatScrollData.$serializer.INSTANCE;
      }
   }
}
