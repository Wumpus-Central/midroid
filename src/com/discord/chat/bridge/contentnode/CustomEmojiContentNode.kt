package com.discord.chat.bridge.contentnode

import dn.f
import dn.n
import gn.b2
import gn.g0
import gn.h
import gn.x0
import gn.g0.a
import kotlin.jvm.internal.q
import kotlinx.serialization.KSerializer
import kotlinx.serialization.descriptors.SerialDescriptor
import kotlinx.serialization.encoding.CompositeEncoder
import kotlinx.serialization.encoding.Decoder
import kotlinx.serialization.encoding.Encoder
import kotlinx.serialization.encoding.c
import kotlinx.serialization.internal.PluginGeneratedSerialDescriptor

@f
public data class CustomEmojiContentNode(id: Long, alt: String, src: String, frozenSrc: String, jumboable: Boolean = false) : EmojiContentNode {
   public final val alt: String
   public final val frozenSrc: String
   public final val id: Long
   public open val jumboable: Boolean
   public final val src: String

   init {
      q.h(var3, "alt");
      q.h(var4, "src");
      q.h(var5, "frozenSrc");
      super(null);
      this.id = var1;
      this.alt = var3;
      this.src = var4;
      this.frozenSrc = var5;
      this.jumboable = var6;
   }

   public operator fun component1(): Long {
      return this.id;
   }

   public operator fun component2(): String {
      return this.alt;
   }

   public operator fun component3(): String {
      return this.src;
   }

   public operator fun component4(): String {
      return this.frozenSrc;
   }

   public operator fun component5(): Boolean {
      return this.jumboable;
   }

   public fun copy(id: Long = var0.id, alt: String = var0.alt, src: String = var0.src, frozenSrc: String = var0.frozenSrc, jumboable: Boolean = var0.jumboable): CustomEmojiContentNode {
      q.h(var3, "alt");
      q.h(var4, "src");
      q.h(var5, "frozenSrc");
      return new CustomEmojiContentNode(var1, var3, var4, var5, var6);
   }

   public override operator fun equals(other: Any?): Boolean {
      if (this === var1) {
         return true;
      } else if (var1 !is CustomEmojiContentNode) {
         return false;
      } else {
         var1 = var1;
         if (this.id != var1.id) {
            return false;
         } else if (!q.c(this.alt, var1.alt)) {
            return false;
         } else if (!q.c(this.src, var1.src)) {
            return false;
         } else if (!q.c(this.frozenSrc, var1.frozenSrc)) {
            return false;
         } else {
            return this.jumboable == var1.jumboable;
         }
      }
   }

   public override fun hashCode(): Int {
      return (((java.lang.Long.hashCode(this.id) * 31 + this.alt.hashCode()) * 31 + this.src.hashCode()) * 31 + this.frozenSrc.hashCode()) * 31
         + java.lang.Boolean.hashCode(this.jumboable);
   }

   public override fun toString(): String {
      val var2: Long = this.id;
      val var6: java.lang.String = this.alt;
      val var5: java.lang.String = this.src;
      val var7: java.lang.String = this.frozenSrc;
      val var1: Boolean = this.jumboable;
      val var4: StringBuilder = new StringBuilder();
      var4.append("CustomEmojiContentNode(id=");
      var4.append(var2);
      var4.append(", alt=");
      var4.append(var6);
      var4.append(", src=");
      var4.append(var5);
      var4.append(", frozenSrc=");
      var4.append(var7);
      var4.append(", jumboable=");
      var4.append(var1);
      var4.append(")");
      return var4.toString();
   }

   public object `$serializer` : g0 {
      public open val descriptor: SerialDescriptor
         public open get() {
            return descriptor;
         }


      @JvmStatic
      fun {
         val var0: CustomEmojiContentNode.$serializer = new CustomEmojiContentNode.$serializer();
         INSTANCE = var0;
         val var1: PluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("customEmoji", var0, 5);
         var1.l("id", false);
         var1.l("alt", false);
         var1.l("src", false);
         var1.l("frozenSrc", false);
         var1.l("jumboable", true);
         descriptor = var1;
      }

      public open fun childSerializers(): Array<KSerializer<*>> {
         return new KSerializer[]{x0.a, b2.a, b2.a, b2.a, h.a};
      }

      public open fun deserialize(decoder: Decoder): CustomEmojiContentNode {
         q.h(var1, "decoder");
         val var11: SerialDescriptor = this.getDescriptor();
         val var12: c = var1.b(var11);
         var var2: Int;
         var var5: Boolean;
         var var6: Long;
         var var9: java.lang.String;
         val var13: java.lang.String;
         var var15: java.lang.String;
         if (var12.p()) {
            var6 = var12.f(var11, 0);
            var15 = var12.m(var11, 1);
            val var10: java.lang.String = var12.m(var11, 2);
            var13 = var12.m(var11, 3);
            var5 = var12.C(var11, 4);
            var2 = 31;
            var9 = var15;
            var15 = var10;
         } else {
            var9 = null;
            var var14: java.lang.String = null;
            var var3: Boolean = true;
            var2 = 0;
            var6 = 0L;
            var15 = null;
            var5 = false;

            while (var3) {
               val var4: Int = var12.o(var11);
               if (var4 != -1) {
                  if (var4 != 0) {
                     if (var4 != 1) {
                        if (var4 != 2) {
                           if (var4 != 3) {
                              if (var4 != 4) {
                                 throw new n(var4);
                              }

                              var5 = var12.C(var11, 4);
                              var2 |= 16;
                           } else {
                              var15 = var12.m(var11, 3);
                              var2 |= 8;
                           }
                        } else {
                           var14 = var12.m(var11, 2);
                           var2 |= 4;
                        }
                     } else {
                        var9 = var12.m(var11, 1);
                        var2 |= 2;
                     }
                  } else {
                     var6 = var12.f(var11, 0);
                     var2 |= 1;
                  }
               } else {
                  var3 = false;
               }
            }

            var13 = var15;
            var15 = var14;
         }

         var12.c(var11);
         return new CustomEmojiContentNode(var2, var6, var9, var15, var13, var5, null);
      }

      public open fun serialize(encoder: Encoder, value: CustomEmojiContentNode) {
         q.h(var1, "encoder");
         q.h(var2, "value");
         val var3: SerialDescriptor = this.getDescriptor();
         val var4: CompositeEncoder = var1.b(var3);
         CustomEmojiContentNode.write$Self$chat_release(var2, var4, var3);
         var4.c(var3);
      }

      fun typeParametersSerializers(): Array<KSerializer> {
         return a.a(this);
      }
   }

   public companion object {
      public fun serializer(): KSerializer<CustomEmojiContentNode> {
         return CustomEmojiContentNode.$serializer.INSTANCE;
      }
   }
}
