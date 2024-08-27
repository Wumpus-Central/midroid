package com.discord.chat.bridge.polls

import com.discord.emoji.RenderableEmoji
import com.discord.emoji.RenderableEmoji.CustomWithEmojiId
import kotlin.jvm.internal.r
import kotlinx.serialization.DeserializationStrategy
import kotlinx.serialization.KSerializer
import kotlinx.serialization.descriptors.SerialDescriptor
import kotlinx.serialization.encoding.CompositeEncoder
import kotlinx.serialization.encoding.Decoder
import kotlinx.serialization.encoding.Encoder
import kotlinx.serialization.encoding.c
import kotlinx.serialization.internal.PluginGeneratedSerialDescriptor
import uk.f
import uk.n
import vk.a
import xk.a2
import xk.f0
import xk.h

@f
public data class PollMediaEmoji(id: String?, name: String, displayName: String? = null, animated: Boolean = false) {
   public final val animated: Boolean
   public final val displayName: String?
   public final val id: String?
   public final val name: String

   init {
      r.h(var2, "name");
      super();
      this.id = var1;
      this.name = var2;
      this.displayName = var3;
      this.animated = var4;
   }

   @JvmStatic
   public fun `write$Self`(self: PollMediaEmoji, output: CompositeEncoder, serialDesc: SerialDescriptor) {
      r.h(var0, "self");
      r.h(var1, "output");
      r.h(var2, "serialDesc");
      val var5: a2 = a2.a;
      var1.m(var2, 0, a2.a, var0.id);
      var1.z(var2, 1, var0.name);
      var var3: Boolean;
      if (!var1.A(var2, 2) && var0.displayName == null) {
         var3 = false;
      } else {
         var3 = true;
      }

      if (var3) {
         var1.m(var2, 2, var5, var0.displayName);
      }

      label24: {
         if (!var1.A(var2, 3)) {
            var3 = false;
            if (!var0.animated) {
               break label24;
            }
         }

         var3 = true;
      }

      if (var3) {
         var1.x(var2, 3, var0.animated);
      }
   }

   public operator fun component1(): String? {
      return this.id;
   }

   public operator fun component2(): String {
      return this.name;
   }

   public operator fun component3(): String? {
      return this.displayName;
   }

   public operator fun component4(): Boolean {
      return this.animated;
   }

   public fun copy(id: String? = var0.id, name: String = var0.name, displayName: String? = var0.displayName, animated: Boolean = var0.animated): PollMediaEmoji {
      r.h(var2, "name");
      return new PollMediaEmoji(var1, var2, var3, var4);
   }

   public override operator fun equals(other: Any?): Boolean {
      if (this === var1) {
         return true;
      } else if (var1 !is PollMediaEmoji) {
         return false;
      } else {
         var1 = var1;
         if (!r.c(this.id, var1.id)) {
            return false;
         } else if (!r.c(this.name, var1.name)) {
            return false;
         } else if (!r.c(this.displayName, var1.displayName)) {
            return false;
         } else {
            return this.animated == var1.animated;
         }
      }
   }

   public override fun hashCode(): Int {
      var var2: Int = 0;
      val var1: Int;
      if (this.id == null) {
         var1 = 0;
      } else {
         var1 = this.id.hashCode();
      }

      val var5: Int = this.name.hashCode();
      if (this.displayName != null) {
         var2 = this.displayName.hashCode();
      }

      var var3: Byte = this.animated;
      if (this.animated != 0) {
         var3 = 1;
      }

      return ((var1 * 31 + var5) * 31 + var2) * 31 + var3;
   }

   public fun renderable(): RenderableEmoji {
      if (this.id != null) {
         val var7: java.lang.Long = kotlin.text.f.o(this.id);
         if (var7 != null) {
            val var1: Long = var7.longValue();
            var var8: java.lang.String = this.displayName;
            if (this.displayName == null) {
               var8 = this.name;
            }

            val var9: CustomWithEmojiId = RenderableEmoji.Companion.customWithEmojiId(var1, this.animated, var8);
            if (var9 != null) {
               return var9;
            }
         }
      }

      return RenderableEmoji.Companion.unicode(this.name);
   }

   public override fun toString(): String {
      val var5: java.lang.String = this.id;
      val var4: java.lang.String = this.name;
      val var3: java.lang.String = this.displayName;
      val var1: Boolean = this.animated;
      val var2: StringBuilder = new StringBuilder();
      var2.append("PollMediaEmoji(id=");
      var2.append(var5);
      var2.append(", name=");
      var2.append(var4);
      var2.append(", displayName=");
      var2.append(var3);
      var2.append(", animated=");
      var2.append(var1);
      var2.append(")");
      return var2.toString();
   }

   public object `$serializer` : f0<PollMediaEmoji> {
      public open val descriptor: SerialDescriptor
         public open get() {
            return descriptor;
         }


      @JvmStatic
      fun {
         val var0: PollMediaEmoji.$serializer = new PollMediaEmoji.$serializer();
         INSTANCE = var0;
         val var1: PluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("com.discord.chat.bridge.polls.PollMediaEmoji", var0, 4);
         var1.l("id", false);
         var1.l("name", false);
         var1.l("displayName", true);
         var1.l("animated", true);
         descriptor = var1;
      }

      public open fun childSerializers(): Array<KSerializer<*>> {
         val var1: a2 = a2.a;
         return new KSerializer[]{a.u(a2.a), var1, a.u(var1), h.a};
      }

      public open fun deserialize(decoder: Decoder): PollMediaEmoji {
         r.h(var1, "decoder");
         val var8: SerialDescriptor = this.getDescriptor();
         val var9: c = var1.b(var8);
         var var2: Int;
         var var5: Boolean;
         var var6: java.lang.String;
         var var7: Any;
         var var11: Any;
         if (var9.p()) {
            var11 = a2.a;
            var7 = var9.n(var8, 0, a2.a, null);
            var6 = var9.m(var8, 1);
            var11 = var9.n(var8, 2, (DeserializationStrategy)var11, null);
            var5 = var9.C(var8, 3);
            var2 = 15;
         } else {
            var var3: Boolean = true;
            var5 = false;
            var7 = null;
            var6 = null;
            var11 = null;
            var2 = 0;

            while (var3) {
               val var4: Int = var9.o(var8);
               if (var4 != -1) {
                  if (var4 != 0) {
                     if (var4 != 1) {
                        if (var4 != 2) {
                           if (var4 != 3) {
                              throw new n(var4);
                           }

                           var5 = var9.C(var8, 3);
                           var2 |= 8;
                        } else {
                           var11 = var9.n(var8, 2, a2.a, var11);
                           var2 |= 4;
                        }
                     } else {
                        var6 = var9.m(var8, 1);
                        var2 |= 2;
                     }
                  } else {
                     var7 = var9.n(var8, 0, a2.a, var7);
                     var2 |= 1;
                  }
               } else {
                  var3 = false;
               }
            }
         }

         var9.c(var8);
         return new PollMediaEmoji(var2, var7 as java.lang.String, var6, var11 as java.lang.String, var5, null);
      }

      public open fun serialize(encoder: Encoder, value: PollMediaEmoji) {
         r.h(var1, "encoder");
         r.h(var2, "value");
         val var3: SerialDescriptor = this.getDescriptor();
         val var4: CompositeEncoder = var1.b(var3);
         PollMediaEmoji.write$Self(var2, var4, var3);
         var4.c(var3);
      }

      fun typeParametersSerializers(): Array<KSerializer<?>> {
         return xk.f0.a.a(this);
      }
   }

   public companion object {
      public fun serializer(): KSerializer<PollMediaEmoji> {
         return PollMediaEmoji.$serializer.INSTANCE;
      }
   }
}
