package com.discord.chat.bridge.polls

import com.discord.emoji.RenderableEmoji
import dn.f
import dn.n
import en.a
import gn.b2
import gn.g0
import kotlin.jvm.internal.q
import kotlinx.serialization.KSerializer
import kotlinx.serialization.descriptors.SerialDescriptor
import kotlinx.serialization.encoding.CompositeEncoder
import kotlinx.serialization.encoding.Decoder
import kotlinx.serialization.encoding.Encoder
import kotlinx.serialization.encoding.c
import kotlinx.serialization.internal.PluginGeneratedSerialDescriptor

@f
public data class PollMediaEmoji(id: String?, name: String, displayName: String? = null, animated: Boolean = false) {
   public final val animated: Boolean
   public final val displayName: String?
   public final val id: String?
   public final val name: String

   init {
      q.h(var2, "name");
      super();
      this.id = var1;
      this.name = var2;
      this.displayName = var3;
      this.animated = var4;
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
      q.h(var2, "name");
      return new PollMediaEmoji(var1, var2, var3, var4);
   }

   public override operator fun equals(other: Any?): Boolean {
      if (this === var1) {
         return true;
      } else if (var1 !is PollMediaEmoji) {
         return false;
      } else {
         var1 = var1;
         if (!q.c(this.id, var1.id)) {
            return false;
         } else if (!q.c(this.name, var1.name)) {
            return false;
         } else if (!q.c(this.displayName, var1.displayName)) {
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

      val var3: Int = this.name.hashCode();
      if (this.displayName != null) {
         var2 = this.displayName.hashCode();
      }

      return ((var1 * 31 + var3) * 31 + var2) * 31 + java.lang.Boolean.hashCode(this.animated);
   }

   public fun renderable(): RenderableEmoji {
      if (this.id != null) {
         val var7: java.lang.Long = h.o(this.id);
         if (var7 != null) {
            val var2: Long = var7.longValue();
            var var8: java.lang.String = this.displayName;
            if (this.displayName == null) {
               var8 = this.name;
            }

            val var9: RenderableEmoji.CustomWithEmojiId = RenderableEmoji.Companion.customWithEmojiId(var2, this.animated, var8);
            if (var9 != null) {
               return var9;
            }
         }
      }

      return RenderableEmoji.Companion.unicode(this.name);
   }

   public override fun toString(): String {
      val var4: java.lang.String = this.id;
      val var5: java.lang.String = this.name;
      val var3: java.lang.String = this.displayName;
      val var1: Boolean = this.animated;
      val var2: StringBuilder = new StringBuilder();
      var2.append("PollMediaEmoji(id=");
      var2.append(var4);
      var2.append(", name=");
      var2.append(var5);
      var2.append(", displayName=");
      var2.append(var3);
      var2.append(", animated=");
      var2.append(var1);
      var2.append(")");
      return var2.toString();
   }

   public object `$serializer` : g0 {
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
         val var1: b2 = b2.a;
         return new KSerializer[]{a.u(b2.a), var1, a.u(var1), gn.h.a};
      }

      public open fun deserialize(decoder: Decoder): PollMediaEmoji {
         q.h(var1, "decoder");
         val var8: SerialDescriptor = this.getDescriptor();
         val var9: c = var1.b(var8);
         var var2: Int;
         var var5: Boolean;
         var var6: java.lang.String;
         var var7: java.lang.String;
         var var11: java.lang.String;
         if (var9.p()) {
            val var10: b2 = b2.a;
            var7 = var9.n(var8, 0, b2.a, null) as java.lang.String;
            var6 = var9.m(var8, 1);
            var11 = var9.n(var8, 2, var10, null) as java.lang.String;
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
                           var11 = var9.n(var8, 2, b2.a, var11) as java.lang.String;
                           var2 |= 4;
                        }
                     } else {
                        var6 = var9.m(var8, 1);
                        var2 |= 2;
                     }
                  } else {
                     var7 = var9.n(var8, 0, b2.a, var7) as java.lang.String;
                     var2 |= 1;
                  }
               } else {
                  var3 = false;
               }
            }
         }

         var9.c(var8);
         return new PollMediaEmoji(var2, var7, var6, var11, var5, null);
      }

      public open fun serialize(encoder: Encoder, value: PollMediaEmoji) {
         q.h(var1, "encoder");
         q.h(var2, "value");
         val var3: SerialDescriptor = this.getDescriptor();
         val var4: CompositeEncoder = var1.b(var3);
         PollMediaEmoji.write$Self$chat_release(var2, var4, var3);
         var4.c(var3);
      }

      fun typeParametersSerializers(): Array<KSerializer> {
         return gn.g0.a.a(this);
      }
   }

   public companion object {
      public fun serializer(): KSerializer<PollMediaEmoji> {
         return PollMediaEmoji.$serializer.INSTANCE;
      }
   }
}
