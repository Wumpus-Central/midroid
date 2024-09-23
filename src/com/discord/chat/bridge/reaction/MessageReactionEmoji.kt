package com.discord.chat.bridge.reaction

import al.b2
import al.g0
import al.h
import com.discord.emoji.RenderableEmoji
import com.discord.reactions.ReactionView
import kotlin.jvm.internal.q
import kotlinx.serialization.KSerializer
import kotlinx.serialization.descriptors.SerialDescriptor
import kotlinx.serialization.encoding.CompositeEncoder
import kotlinx.serialization.encoding.Decoder
import kotlinx.serialization.encoding.Encoder
import kotlinx.serialization.encoding.c
import kotlinx.serialization.internal.PluginGeneratedSerialDescriptor
import xk.f
import xk.n
import yk.a

@f
public data class MessageReactionEmoji(name: String? = null, src: String, displayName: String, id: String? = null, animated: Boolean? = null) :
   ReactionView.Emoji {
   public open val animated: Boolean?
   public open val displayName: String
   public open val id: String?
   public open val name: String?
   public open val src: String

   init {
      q.h(var2, "src");
      q.h(var3, "displayName");
      super();
      this.name = var1;
      this.src = var2;
      this.displayName = var3;
      this.id = var4;
      this.animated = var5;
   }

   public operator fun component1(): String? {
      return this.name;
   }

   public operator fun component2(): String {
      return this.src;
   }

   public operator fun component3(): String {
      return this.displayName;
   }

   public operator fun component4(): String? {
      return this.id;
   }

   public operator fun component5(): Boolean? {
      return this.animated;
   }

   public fun copy(
      name: String? = var0.name,
      src: String = var0.src,
      displayName: String = var0.displayName,
      id: String? = var0.id,
      animated: Boolean? = var0.animated
   ): MessageReactionEmoji {
      q.h(var2, "src");
      q.h(var3, "displayName");
      return new MessageReactionEmoji(var1, var2, var3, var4, var5);
   }

   public override operator fun equals(other: Any?): Boolean {
      if (this === var1) {
         return true;
      } else if (var1 !is MessageReactionEmoji) {
         return false;
      } else {
         var1 = var1;
         if (!q.c(this.name, var1.name)) {
            return false;
         } else if (!q.c(this.src, var1.src)) {
            return false;
         } else if (!q.c(this.displayName, var1.displayName)) {
            return false;
         } else if (!q.c(this.id, var1.id)) {
            return false;
         } else {
            return q.c(this.animated, var1.animated);
         }
      }
   }

   override fun getEmojiId(): java.lang.String {
      return ReactionView.Emoji.DefaultImpls.getEmojiId(this);
   }

   override fun getShouldAnimate(): Boolean {
      return ReactionView.Emoji.DefaultImpls.getShouldAnimate(this);
   }

   public override fun hashCode(): Int {
      var var3: Int = 0;
      val var1: Int;
      if (this.name == null) {
         var1 = 0;
      } else {
         var1 = this.name.hashCode();
      }

      val var4: Int = this.src.hashCode();
      val var5: Int = this.displayName.hashCode();
      val var2: Int;
      if (this.id == null) {
         var2 = 0;
      } else {
         var2 = this.id.hashCode();
      }

      if (this.animated != null) {
         var3 = this.animated.hashCode();
      }

      return (((var1 * 31 + var4) * 31 + var5) * 31 + var2) * 31 + var3;
   }

   override fun renderable(): RenderableEmoji {
      return ReactionView.Emoji.DefaultImpls.renderable(this);
   }

   public override fun toString(): String {
      val var3: java.lang.String = this.name;
      val var1: java.lang.String = this.src;
      val var4: java.lang.String = this.displayName;
      val var5: java.lang.String = this.id;
      val var2: java.lang.Boolean = this.animated;
      val var6: StringBuilder = new StringBuilder();
      var6.append("MessageReactionEmoji(name=");
      var6.append(var3);
      var6.append(", src=");
      var6.append(var1);
      var6.append(", displayName=");
      var6.append(var4);
      var6.append(", id=");
      var6.append(var5);
      var6.append(", animated=");
      var6.append(var2);
      var6.append(")");
      return var6.toString();
   }

   public object `$serializer` : g0 {
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
         val var1: b2 = b2.a;
         return new KSerializer[]{a.u(b2.a), var1, var1, a.u(var1), a.u(h.a)};
      }

      public open fun deserialize(decoder: Decoder): MessageReactionEmoji {
         q.h(var1, "decoder");
         val var11: SerialDescriptor = this.getDescriptor();
         val var12: c = var1.c(var11);
         val var5: Boolean = var12.y();
         var var9: java.lang.String = null;
         var var2: Int;
         var var6: Any;
         var var7: java.lang.String;
         var var8: java.lang.String;
         val var14: java.lang.String;
         if (var5) {
            val var13: b2 = b2.a;
            var9 = var12.v(var11, 0, b2.a, null) as java.lang.String;
            var8 = var12.t(var11, 1);
            var7 = var12.t(var11, 2);
            var14 = var12.v(var11, 3, var13, null) as java.lang.String;
            var6 = var12.v(var11, 4, h.a, null) as java.lang.Boolean;
            var2 = 31;
         } else {
            var var3: Boolean = true;
            var2 = 0;
            var8 = null;
            var7 = null;
            var6 = null;
            var var15: Any = null;

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

                              var15 = var12.v(var11, 4, h.a, var15) as java.lang.Boolean;
                              var2 |= 16;
                           } else {
                              var6 = var12.v(var11, 3, b2.a, var6) as java.lang.String;
                              var2 |= 8;
                           }
                        } else {
                           var7 = var12.t(var11, 2);
                           var2 |= 4;
                        }
                     } else {
                        var8 = var12.t(var11, 1);
                        var2 |= 2;
                     }
                  } else {
                     var9 = var12.v(var11, 0, b2.a, var9) as java.lang.String;
                     var2 |= 1;
                  }
               } else {
                  var3 = false;
               }
            }

            var6 = var15;
            var14 = (java.lang.String)var6;
         }

         var12.b(var11);
         return new MessageReactionEmoji(var2, var9, var8, var7, var14, (java.lang.Boolean)var6, null);
      }

      public open fun serialize(encoder: Encoder, value: MessageReactionEmoji) {
         q.h(var1, "encoder");
         q.h(var2, "value");
         val var3: SerialDescriptor = this.getDescriptor();
         val var4: CompositeEncoder = var1.c(var3);
         MessageReactionEmoji.write$Self$chat_release(var2, var4, var3);
         var4.b(var3);
      }

      fun typeParametersSerializers(): Array<KSerializer> {
         return al.g0.a.a(this);
      }
   }

   public companion object {
      public fun serializer(): KSerializer<MessageReactionEmoji> {
         return MessageReactionEmoji.$serializer.INSTANCE;
      }
   }
}
