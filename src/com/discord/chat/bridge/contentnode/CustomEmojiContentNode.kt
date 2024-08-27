package com.discord.chat.bridge.contentnode

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
import xk.a2
import xk.f0
import xk.h
import xk.w0
import xk.f0.a

@f
public data class CustomEmojiContentNode(id: Long, alt: String, src: String, frozenSrc: String, jumboable: Boolean = false) : EmojiContentNode {
   public final val alt: String
   public final val frozenSrc: String
   public final val id: Long
   public open val jumboable: Boolean
   public final val src: String

   init {
      r.h(var3, "alt");
      r.h(var4, "src");
      r.h(var5, "frozenSrc");
      super(null);
      this.id = var1;
      this.alt = var3;
      this.src = var4;
      this.frozenSrc = var5;
      this.jumboable = var6;
   }

   @JvmStatic
   public fun `write$Self`(self: CustomEmojiContentNode, output: CompositeEncoder, serialDesc: SerialDescriptor) {
      r.h(var0, "self");
      r.h(var1, "output");
      r.h(var2, "serialDesc");
      EmojiContentNode.write$Self(var0, var1, var2);
      var var3: Boolean = false;
      var1.E(var2, 0, var0.id);
      var1.z(var2, 1, var0.alt);
      var1.z(var2, 2, var0.src);
      var1.z(var2, 3, var0.frozenSrc);
      if (var1.A(var2, 4) || var0.getJumboable()) {
         var3 = true;
      }

      if (var3) {
         var1.x(var2, 4, var0.getJumboable());
      }
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
      return this.getJumboable();
   }

   public fun copy(
      id: Long = var0.id,
      alt: String = var0.alt,
      src: String = var0.src,
      frozenSrc: String = var0.frozenSrc,
      jumboable: Boolean = var0.getJumboable()
   ): CustomEmojiContentNode {
      r.h(var3, "alt");
      r.h(var4, "src");
      r.h(var5, "frozenSrc");
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
         } else if (!r.c(this.alt, var1.alt)) {
            return false;
         } else if (!r.c(this.src, var1.src)) {
            return false;
         } else if (!r.c(this.frozenSrc, var1.frozenSrc)) {
            return false;
         } else {
            return this.getJumboable() == var1.getJumboable();
         }
      }
   }

   public override fun hashCode(): Int {
      val var6: Int = java.lang.Long.hashCode(this.id);
      val var3: Int = this.alt.hashCode();
      val var5: Int = this.src.hashCode();
      val var4: Int = this.frozenSrc.hashCode();
      val var2: Byte = this.getJumboable();
      var var1: Byte = var2;
      if (var2 != 0) {
         var1 = 1;
      }

      return (((var6 * 31 + var3) * 31 + var5) * 31 + var4) * 31 + var1;
   }

   public override fun toString(): String {
      val var2: Long = this.id;
      val var5: java.lang.String = this.alt;
      val var4: java.lang.String = this.src;
      val var7: java.lang.String = this.frozenSrc;
      val var1: Boolean = this.getJumboable();
      val var6: StringBuilder = new StringBuilder();
      var6.append("CustomEmojiContentNode(id=");
      var6.append(var2);
      var6.append(", alt=");
      var6.append(var5);
      var6.append(", src=");
      var6.append(var4);
      var6.append(", frozenSrc=");
      var6.append(var7);
      var6.append(", jumboable=");
      var6.append(var1);
      var6.append(")");
      return var6.toString();
   }

   public object `$serializer` : f0<CustomEmojiContentNode> {
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
         return new KSerializer[]{w0.a, a2.a, a2.a, a2.a, h.a};
      }

      public open fun deserialize(decoder: Decoder): CustomEmojiContentNode {
         r.h(var1, "decoder");
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

            var15 = var14;
            var13 = var15;
         }

         var12.c(var11);
         return new CustomEmojiContentNode(var2, var6, var9, var15, var13, var5, null);
      }

      public open fun serialize(encoder: Encoder, value: CustomEmojiContentNode) {
         r.h(var1, "encoder");
         r.h(var2, "value");
         val var3: SerialDescriptor = this.getDescriptor();
         val var4: CompositeEncoder = var1.b(var3);
         CustomEmojiContentNode.write$Self(var2, var4, var3);
         var4.c(var3);
      }

      fun typeParametersSerializers(): Array<KSerializer<?>> {
         return a.a(this);
      }
   }

   public companion object {
      public fun serializer(): KSerializer<CustomEmojiContentNode> {
         return CustomEmojiContentNode.$serializer.INSTANCE;
      }
   }
}
