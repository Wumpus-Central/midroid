package com.discord.chat.bridge.contentnode

import kotlin.jvm.internal.q
import kotlinx.serialization.KSerializer
import kotlinx.serialization.descriptors.SerialDescriptor
import kotlinx.serialization.encoding.CompositeEncoder
import kotlinx.serialization.encoding.Decoder
import kotlinx.serialization.encoding.Encoder
import kotlinx.serialization.encoding.c
import kotlinx.serialization.internal.PluginGeneratedSerialDescriptor
import vk.f
import vk.n
import yk.b2
import yk.g0
import yk.h
import yk.x0
import yk.g0.a

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
      val var5: java.lang.String = this.alt;
      val var6: java.lang.String = this.src;
      val var4: java.lang.String = this.frozenSrc;
      val var1: Boolean = this.jumboable;
      val var7: StringBuilder = new StringBuilder();
      var7.append("CustomEmojiContentNode(id=");
      var7.append(var2);
      var7.append(", alt=");
      var7.append(var5);
      var7.append(", src=");
      var7.append(var6);
      var7.append(", frozenSrc=");
      var7.append(var4);
      var7.append(", jumboable=");
      var7.append(var1);
      var7.append(")");
      return var7.toString();
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
         val var12: c = var1.c(var11);
         var var2: Int;
         var var5: Long;
         var var7: Boolean;
         var var8: java.lang.String;
         val var10: java.lang.String;
         val var13: java.lang.String;
         if (var12.y()) {
            var5 = var12.h(var11, 0);
            var8 = var12.t(var11, 1);
            var10 = var12.t(var11, 2);
            var13 = var12.t(var11, 3);
            var7 = var12.s(var11, 4);
            var2 = 31;
         } else {
            var var9: java.lang.String = null;
            var var14: java.lang.String = null;
            var var3: Boolean = true;
            var2 = 0;
            var5 = 0L;
            var8 = null;
            var7 = false;

            while (var3) {
               val var4: Int = var12.x(var11);
               if (var4 != -1) {
                  if (var4 != 0) {
                     if (var4 != 1) {
                        if (var4 != 2) {
                           if (var4 != 3) {
                              if (var4 != 4) {
                                 throw new n(var4);
                              }

                              var7 = var12.s(var11, 4);
                              var2 |= 16;
                           } else {
                              var8 = var12.t(var11, 3);
                              var2 |= 8;
                           }
                        } else {
                           var14 = var12.t(var11, 2);
                           var2 |= 4;
                        }
                     } else {
                        var9 = var12.t(var11, 1);
                        var2 |= 2;
                     }
                  } else {
                     var5 = var12.h(var11, 0);
                     var2 |= 1;
                  }
               } else {
                  var3 = false;
               }
            }

            var10 = var14;
            var13 = var8;
            var8 = var9;
         }

         var12.b(var11);
         return new CustomEmojiContentNode(var2, var5, var8, var10, var13, var7, null);
      }

      public open fun serialize(encoder: Encoder, value: CustomEmojiContentNode) {
         q.h(var1, "encoder");
         q.h(var2, "value");
         val var3: SerialDescriptor = this.getDescriptor();
         val var4: CompositeEncoder = var1.c(var3);
         CustomEmojiContentNode.write$Self$chat_release(var2, var4, var3);
         var4.b(var3);
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
