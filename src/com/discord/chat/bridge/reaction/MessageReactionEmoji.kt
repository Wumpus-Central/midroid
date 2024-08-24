package com.discord.chat.bridge.reaction

import com.discord.emoji.RenderableEmoji
import com.discord.reactions.ReactionView.Emoji
import com.discord.reactions.ReactionView.Emoji.DefaultImpls
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
public data class MessageReactionEmoji(name: String? = null, src: String, displayName: String, id: String? = null, animated: Boolean? = null) : Emoji {
   public open val animated: Boolean?
   public open val displayName: String
   public open val id: String?
   public open val name: String?
   public open val src: String

   init {
      r.h(var2, "src");
      r.h(var3, "displayName");
      super();
      this.name = var1;
      this.src = var2;
      this.displayName = var3;
      this.id = var4;
      this.animated = var5;
   }

   @JvmStatic
   public fun `write$Self`(self: MessageReactionEmoji, output: CompositeEncoder, serialDesc: SerialDescriptor) {
      r.h(var0, "self");
      r.h(var1, "output");
      r.h(var2, "serialDesc");
      var var3: Boolean;
      if (!var1.A(var2, 0) && var0.getName() == null) {
         var3 = false;
      } else {
         var3 = true;
      }

      if (var3) {
         var1.m(var2, 0, a2.a, var0.getName());
      }

      var1.z(var2, 1, var0.getSrc());
      var1.z(var2, 2, var0.getDisplayName());
      if (!var1.A(var2, 3) && var0.getId() == null) {
         var3 = false;
      } else {
         var3 = true;
      }

      if (var3) {
         var1.m(var2, 3, a2.a, var0.getId());
      }

      label32: {
         if (!var1.A(var2, 4)) {
            var3 = false;
            if (var0.getAnimated() == null) {
               break label32;
            }
         }

         var3 = true;
      }

      if (var3) {
         var1.m(var2, 4, h.a, var0.getAnimated());
      }
   }

   public operator fun component1(): String? {
      return this.getName();
   }

   public operator fun component2(): String {
      return this.getSrc();
   }

   public operator fun component3(): String {
      return this.getDisplayName();
   }

   public operator fun component4(): String? {
      return this.getId();
   }

   public operator fun component5(): Boolean? {
      return this.getAnimated();
   }

   public fun copy(
      name: String? = var0.getName(),
      src: String = var0.getSrc(),
      displayName: String = var0.getDisplayName(),
      id: String? = var0.getId(),
      animated: Boolean? = var0.getAnimated()
   ): MessageReactionEmoji {
      r.h(var2, "src");
      r.h(var3, "displayName");
      return new MessageReactionEmoji(var1, var2, var3, var4, var5);
   }

   public override operator fun equals(other: Any?): Boolean {
      if (this === var1) {
         return true;
      } else if (var1 !is MessageReactionEmoji) {
         return false;
      } else {
         var1 = var1;
         if (!r.c(this.getName(), var1.getName())) {
            return false;
         } else if (!r.c(this.getSrc(), var1.getSrc())) {
            return false;
         } else if (!r.c(this.getDisplayName(), var1.getDisplayName())) {
            return false;
         } else if (!r.c(this.getId(), var1.getId())) {
            return false;
         } else {
            return r.c(this.getAnimated(), var1.getAnimated());
         }
      }
   }

   fun getEmojiId(): java.lang.String {
      return DefaultImpls.getEmojiId(this);
   }

   fun getShouldAnimate(): Boolean {
      return DefaultImpls.getShouldAnimate(this);
   }

   public override fun hashCode(): Int {
      val var6: java.lang.String = this.getName();
      var var3: Int = 0;
      val var1: Int;
      if (var6 == null) {
         var1 = 0;
      } else {
         var1 = this.getName().hashCode();
      }

      val var4: Int = this.getSrc().hashCode();
      val var5: Int = this.getDisplayName().hashCode();
      val var2: Int;
      if (this.getId() == null) {
         var2 = 0;
      } else {
         var2 = this.getId().hashCode();
      }

      if (this.getAnimated() != null) {
         var3 = this.getAnimated().hashCode();
      }

      return (((var1 * 31 + var4) * 31 + var5) * 31 + var2) * 31 + var3;
   }

   fun renderable(): RenderableEmoji {
      return DefaultImpls.renderable(this);
   }

   public override fun toString(): String {
      val var3: java.lang.String = this.getName();
      val var5: java.lang.String = this.getSrc();
      val var2: java.lang.String = this.getDisplayName();
      val var6: java.lang.String = this.getId();
      val var1: java.lang.Boolean = this.getAnimated();
      val var4: StringBuilder = new StringBuilder();
      var4.append("MessageReactionEmoji(name=");
      var4.append(var3);
      var4.append(", src=");
      var4.append(var5);
      var4.append(", displayName=");
      var4.append(var2);
      var4.append(", id=");
      var4.append(var6);
      var4.append(", animated=");
      var4.append(var1);
      var4.append(")");
      return var4.toString();
   }

   public object `$serializer` : f0<MessageReactionEmoji> {
      public open val descriptor: SerialDescriptor
         public open get() {
            return descriptor;
         }


      @JvmStatic
      fun {
         val var0: MessageReactionEmoji.$serializer = new MessageReactionEmoji.$serializer();
         INSTANCE = var0;
         val var1: PluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("com.discord.chat.bridge.reaction.MessageReactionEmoji", var0, 5);
         var1.l("name", true);
         var1.l("src", false);
         var1.l("displayName", false);
         var1.l("id", true);
         var1.l("animated", true);
         descriptor = var1;
      }

      public open fun childSerializers(): Array<KSerializer<*>> {
         val var1: a2 = a2.a;
         return new KSerializer[]{a.u(a2.a), var1, var1, a.u(var1), a.u(h.a)};
      }

      public open fun deserialize(decoder: Decoder): MessageReactionEmoji {
         r.h(var1, "decoder");
         val var12: SerialDescriptor = this.getDescriptor();
         val var13: c = var1.b(var12);
         val var5: Boolean = var13.p();
         var var9: Any = null;
         var var2: Int;
         var var7: Any;
         var var8: java.lang.String;
         val var14: java.lang.String;
         var var16: Any;
         if (var5) {
            var16 = a2.a;
            var9 = var13.n(var12, 0, a2.a, null);
            var8 = var13.m(var12, 1);
            var14 = var13.m(var12, 2);
            var16 = var13.n(var12, 3, (DeserializationStrategy)var16, null);
            var7 = var13.n(var12, 4, h.a, null);
            var2 = 31;
         } else {
            var var3: Boolean = true;
            var2 = 0;
            var7 = null;
            var8 = null;
            var16 = null;
            var var15: Any = null;

            while (var3) {
               val var4: Int = var13.o(var12);
               if (var4 != -1) {
                  if (var4 != 0) {
                     if (var4 != 1) {
                        if (var4 != 2) {
                           if (var4 != 3) {
                              if (var4 != 4) {
                                 throw new n(var4);
                              }

                              var15 = var13.n(var12, 4, h.a, var15);
                              var2 |= 16;
                           } else {
                              var16 = var13.n(var12, 3, a2.a, var16);
                              var2 |= 8;
                           }
                        } else {
                           var8 = var13.m(var12, 2);
                           var2 |= 4;
                        }
                     } else {
                        var7 = var13.m(var12, 1);
                        var2 |= 2;
                     }
                  } else {
                     var9 = var13.n(var12, 0, a2.a, var9);
                     var2 |= 1;
                  }
               } else {
                  var3 = false;
               }
            }

            var8 = (java.lang.String)var7;
            var14 = var8;
            var7 = var15;
         }

         var13.c(var12);
         return new MessageReactionEmoji(var2, var9 as java.lang.String, var8, var14, var16 as java.lang.String, var7 as java.lang.Boolean, null);
      }

      public open fun serialize(encoder: Encoder, value: MessageReactionEmoji) {
         r.h(var1, "encoder");
         r.h(var2, "value");
         val var3: SerialDescriptor = this.getDescriptor();
         val var4: CompositeEncoder = var1.b(var3);
         MessageReactionEmoji.write$Self(var2, var4, var3);
         var4.c(var3);
      }

      fun typeParametersSerializers(): Array<KSerializer<?>> {
         return xk.f0.a.a(this);
      }
   }

   public companion object {
      public fun serializer(): KSerializer<MessageReactionEmoji> {
         return MessageReactionEmoji.$serializer.INSTANCE;
      }
   }
}
