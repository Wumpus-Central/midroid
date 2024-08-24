package com.discord.chat.input.bridge

import com.discord.span.utilities.common.BackgroundStyle
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
import vk.a
import xk.f0
import xk.m0

@f
public data class ChatInputNodeStyle(fontSize: Int? = null, color: Int, backgroundStyle: BackgroundStyle?, fontWeight: ChatInputNodeFontWeight? = null) {
   public final val backgroundStyle: BackgroundStyle?
   public final val color: Int
   public final val fontSize: Int?
   public final val fontWeight: ChatInputNodeFontWeight?

   init {
      super();
      this.fontSize = var1;
      this.color = var2;
      this.backgroundStyle = var3;
      this.fontWeight = var4;
   }

   @JvmStatic
   public fun `write$Self`(self: ChatInputNodeStyle, output: CompositeEncoder, serialDesc: SerialDescriptor) {
      r.h(var0, "self");
      r.h(var1, "output");
      r.h(var2, "serialDesc");
      var var3: Boolean;
      if (!var1.A(var2, 0) && var0.fontSize == null) {
         var3 = false;
      } else {
         var3 = true;
      }

      if (var3) {
         var1.m(var2, 0, m0.a, var0.fontSize);
      }

      label24: {
         var1.w(var2, 1, var0.color);
         var1.m(var2, 2, com.discord.span.utilities.common.BackgroundStyle..serializer.INSTANCE, var0.backgroundStyle);
         if (!var1.A(var2, 3)) {
            var3 = false;
            if (var0.fontWeight == null) {
               break label24;
            }
         }

         var3 = true;
      }

      if (var3) {
         var1.m(var2, 3, ChatInputNodeFontWeight.Companion.serializer(), var0.fontWeight);
      }
   }

   public operator fun component1(): Int? {
      return this.fontSize;
   }

   public operator fun component2(): Int {
      return this.color;
   }

   public operator fun component3(): BackgroundStyle? {
      return this.backgroundStyle;
   }

   public operator fun component4(): ChatInputNodeFontWeight? {
      return this.fontWeight;
   }

   public fun copy(
      fontSize: Int? = var0.fontSize,
      color: Int = var0.color,
      backgroundStyle: BackgroundStyle? = var0.backgroundStyle,
      fontWeight: ChatInputNodeFontWeight? = var0.fontWeight
   ): ChatInputNodeStyle {
      return new ChatInputNodeStyle(var1, var2, var3, var4);
   }

   public override operator fun equals(other: Any?): Boolean {
      if (this === var1) {
         return true;
      } else if (var1 !is ChatInputNodeStyle) {
         return false;
      } else {
         var1 = var1;
         if (!r.c(this.fontSize, var1.fontSize)) {
            return false;
         } else if (this.color != var1.color) {
            return false;
         } else if (!r.c(this.backgroundStyle, var1.backgroundStyle)) {
            return false;
         } else {
            return this.fontWeight === var1.fontWeight;
         }
      }
   }

   public override fun hashCode(): Int {
      var var3: Int = 0;
      val var1: Int;
      if (this.fontSize == null) {
         var1 = 0;
      } else {
         var1 = this.fontSize.hashCode();
      }

      val var4: Int = Integer.hashCode(this.color);
      val var2: Int;
      if (this.backgroundStyle == null) {
         var2 = 0;
      } else {
         var2 = this.backgroundStyle.hashCode();
      }

      if (this.fontWeight != null) {
         var3 = this.fontWeight.hashCode();
      }

      return ((var1 * 31 + var4) * 31 + var2) * 31 + var3;
   }

   public override fun toString(): String {
      val var2: Int = this.fontSize;
      val var1: Int = this.color;
      val var4: BackgroundStyle = this.backgroundStyle;
      val var3: ChatInputNodeFontWeight = this.fontWeight;
      val var5: StringBuilder = new StringBuilder();
      var5.append("ChatInputNodeStyle(fontSize=");
      var5.append(var2);
      var5.append(", color=");
      var5.append(var1);
      var5.append(", backgroundStyle=");
      var5.append(var4);
      var5.append(", fontWeight=");
      var5.append(var3);
      var5.append(")");
      return var5.toString();
   }

   public object `$serializer` : f0<ChatInputNodeStyle> {
      public open val descriptor: SerialDescriptor
         public open get() {
            return descriptor;
         }


      @JvmStatic
      fun {
         val var0: ChatInputNodeStyle.$serializer = new ChatInputNodeStyle.$serializer();
         INSTANCE = var0;
         val var1: PluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("com.discord.chat.input.bridge.ChatInputNodeStyle", var0, 4);
         var1.l("fontSize", true);
         var1.l("color", false);
         var1.l("backgroundStyle", false);
         var1.l("fontWeight", true);
         descriptor = var1;
      }

      public open fun childSerializers(): Array<KSerializer<*>> {
         val var1: m0 = m0.a;
         return new KSerializer[]{
            a.u(m0.a), var1, a.u(com.discord.span.utilities.common.BackgroundStyle..serializer.INSTANCE), a.u(ChatInputNodeFontWeight.Companion.serializer())
         };
      }

      public open fun deserialize(decoder: Decoder): ChatInputNodeStyle {
         r.h(var1, "decoder");
         val var8: SerialDescriptor = this.getDescriptor();
         val var9: c = var1.b(var8);
         var var2: Int;
         var var3: Int;
         var var6: Any;
         var var7: Any;
         var var10: Any;
         if (var9.p()) {
            var6 = var9.n(var8, 0, m0.a, null);
            var3 = var9.i(var8, 1);
            var7 = var9.n(var8, 2, com.discord.span.utilities.common.BackgroundStyle..serializer.INSTANCE, null);
            var10 = var9.n(var8, 3, ChatInputNodeFontWeight.Companion.serializer(), null);
            var2 = 15;
         } else {
            var var4: Boolean = true;
            var3 = 0;
            var6 = null;
            var7 = null;
            var10 = null;
            var2 = 0;

            while (var4) {
               val var5: Int = var9.o(var8);
               if (var5 != -1) {
                  if (var5 != 0) {
                     if (var5 != 1) {
                        if (var5 != 2) {
                           if (var5 != 3) {
                              throw new n(var5);
                           }

                           var10 = var9.n(var8, 3, ChatInputNodeFontWeight.Companion.serializer(), var10);
                           var2 |= 8;
                        } else {
                           var7 = var9.n(var8, 2, com.discord.span.utilities.common.BackgroundStyle..serializer.INSTANCE, var7);
                           var2 |= 4;
                        }
                     } else {
                        var3 = var9.i(var8, 1);
                        var2 |= 2;
                     }
                  } else {
                     var6 = var9.n(var8, 0, m0.a, var6);
                     var2 |= 1;
                  }
               } else {
                  var4 = false;
               }
            }
         }

         var9.c(var8);
         return new ChatInputNodeStyle(var2, var6 as Integer, var3, var7 as BackgroundStyle, var10 as ChatInputNodeFontWeight, null);
      }

      public open fun serialize(encoder: Encoder, value: ChatInputNodeStyle) {
         r.h(var1, "encoder");
         r.h(var2, "value");
         val var3: SerialDescriptor = this.getDescriptor();
         val var4: CompositeEncoder = var1.b(var3);
         ChatInputNodeStyle.write$Self(var2, var4, var3);
         var4.c(var3);
      }

      fun typeParametersSerializers(): Array<KSerializer<?>> {
         return xk.f0.a.a(this);
      }
   }

   public companion object {
      public fun serializer(): KSerializer<ChatInputNodeStyle> {
         return ChatInputNodeStyle.$serializer.INSTANCE;
      }
   }
}
