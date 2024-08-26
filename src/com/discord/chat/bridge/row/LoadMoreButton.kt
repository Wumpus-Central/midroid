package com.discord.chat.bridge.row

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
import xk.m0

@f
public data class LoadMoreButton(action: LoadingAction, text: String, backgroundColor: Int, cornerRadius: Int? = null, color: Int? = null) {
   public final val action: LoadingAction
   public final val backgroundColor: Int
   public final val color: Int?
   public final val cornerRadius: Int?
   public final val text: String

   init {
      r.h(var1, "action");
      r.h(var2, "text");
      super();
      this.action = var1;
      this.text = var2;
      this.backgroundColor = var3;
      this.cornerRadius = var4;
      this.color = var5;
   }

   @JvmStatic
   public fun `write$Self`(self: LoadMoreButton, output: CompositeEncoder, serialDesc: SerialDescriptor) {
      r.h(var0, "self");
      r.h(var1, "output");
      r.h(var2, "serialDesc");
      var1.y(var2, 0, LoadingAction.$serializer.INSTANCE, var0.action);
      var1.z(var2, 1, var0.text);
      var1.w(var2, 2, var0.backgroundColor);
      var var3: Boolean;
      if (!var1.A(var2, 3) && var0.cornerRadius == null) {
         var3 = false;
      } else {
         var3 = true;
      }

      if (var3) {
         var1.m(var2, 3, m0.a, var0.cornerRadius);
      }

      label24: {
         if (!var1.A(var2, 4)) {
            var3 = false;
            if (var0.color == null) {
               break label24;
            }
         }

         var3 = true;
      }

      if (var3) {
         var1.m(var2, 4, m0.a, var0.color);
      }
   }

   public operator fun component1(): LoadingAction {
      return this.action;
   }

   public operator fun component2(): String {
      return this.text;
   }

   public operator fun component3(): Int {
      return this.backgroundColor;
   }

   public operator fun component4(): Int? {
      return this.cornerRadius;
   }

   public operator fun component5(): Int? {
      return this.color;
   }

   public fun copy(
      action: LoadingAction = var0.action,
      text: String = var0.text,
      backgroundColor: Int = var0.backgroundColor,
      cornerRadius: Int? = var0.cornerRadius,
      color: Int? = var0.color
   ): LoadMoreButton {
      r.h(var1, "action");
      r.h(var2, "text");
      return new LoadMoreButton(var1, var2, var3, var4, var5);
   }

   public override operator fun equals(other: Any?): Boolean {
      if (this === var1) {
         return true;
      } else if (var1 !is LoadMoreButton) {
         return false;
      } else {
         var1 = var1;
         if (!r.c(this.action, var1.action)) {
            return false;
         } else if (!r.c(this.text, var1.text)) {
            return false;
         } else if (this.backgroundColor != var1.backgroundColor) {
            return false;
         } else if (!r.c(this.cornerRadius, var1.cornerRadius)) {
            return false;
         } else {
            return r.c(this.color, var1.color);
         }
      }
   }

   public override fun hashCode(): Int {
      val var5: Int = this.action.hashCode();
      val var4: Int = this.text.hashCode();
      val var3: Int = Integer.hashCode(this.backgroundColor);
      var var2: Int = 0;
      val var1: Int;
      if (this.cornerRadius == null) {
         var1 = 0;
      } else {
         var1 = this.cornerRadius.hashCode();
      }

      if (this.color != null) {
         var2 = this.color.hashCode();
      }

      return (((var5 * 31 + var4) * 31 + var3) * 31 + var1) * 31 + var2;
   }

   public override fun toString(): String {
      val var3: LoadingAction = this.action;
      val var5: java.lang.String = this.text;
      val var1: Int = this.backgroundColor;
      val var2: Int = this.cornerRadius;
      val var4: Int = this.color;
      val var6: StringBuilder = new StringBuilder();
      var6.append("LoadMoreButton(action=");
      var6.append(var3);
      var6.append(", text=");
      var6.append(var5);
      var6.append(", backgroundColor=");
      var6.append(var1);
      var6.append(", cornerRadius=");
      var6.append(var2);
      var6.append(", color=");
      var6.append(var4);
      var6.append(")");
      return var6.toString();
   }

   public object `$serializer` : f0<LoadMoreButton> {
      public open val descriptor: SerialDescriptor
         public open get() {
            return descriptor;
         }


      @JvmStatic
      fun {
         val var0: LoadMoreButton.$serializer = new LoadMoreButton.$serializer();
         INSTANCE = var0;
         val var1: PluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("com.discord.chat.bridge.row.LoadMoreButton", var0, 5);
         var1.l("action", false);
         var1.l("text", false);
         var1.l("backgroundColor", false);
         var1.l("cornerRadius", true);
         var1.l("color", true);
         descriptor = var1;
      }

      public open fun childSerializers(): Array<KSerializer<*>> {
         val var2: m0 = m0.a;
         return new KSerializer[]{LoadingAction.$serializer.INSTANCE, a2.a, m0.a, a.u(m0.a), a.u(var2)};
      }

      public open fun deserialize(decoder: Decoder): LoadMoreButton {
         r.h(var1, "decoder");
         val var10: SerialDescriptor = this.getDescriptor();
         val var11: c = var1.b(var10);
         var var2: Int;
         var var3: Int;
         var var6: Any;
         var var7: Any;
         val var12: java.lang.String;
         var var14: Any;
         if (var11.p()) {
            var7 = var11.y(var10, 0, LoadingAction.$serializer.INSTANCE, null);
            var12 = var11.m(var10, 1);
            var3 = var11.i(var10, 2);
            var14 = m0.a;
            var6 = var11.n(var10, 3, m0.a, null);
            var14 = var11.n(var10, 4, (DeserializationStrategy)var14, null);
            var2 = 31;
         } else {
            var var4: Boolean = true;
            var3 = 0;
            var7 = null;
            var14 = null;
            var6 = null;
            var var13: Any = null;
            var2 = 0;

            while (var4) {
               val var5: Int = var11.o(var10);
               if (var5 != -1) {
                  if (var5 != 0) {
                     if (var5 != 1) {
                        if (var5 != 2) {
                           if (var5 != 3) {
                              if (var5 != 4) {
                                 throw new n(var5);
                              }

                              var13 = var11.n(var10, 4, m0.a, var13);
                              var2 |= 16;
                           } else {
                              var6 = var11.n(var10, 3, m0.a, var6);
                              var2 |= 8;
                           }
                        } else {
                           var3 = var11.i(var10, 2);
                           var2 |= 4;
                        }
                     } else {
                        var14 = var11.m(var10, 1);
                        var2 |= 2;
                     }
                  } else {
                     var7 = var11.y(var10, 0, LoadingAction.$serializer.INSTANCE, var7);
                     var2 |= 1;
                  }
               } else {
                  var4 = false;
               }
            }

            var12 = (java.lang.String)var14;
            var14 = var13;
         }

         var11.c(var10);
         return new LoadMoreButton(var2, var7 as LoadingAction, var12, var3, var6 as Integer, var14 as Integer, null);
      }

      public open fun serialize(encoder: Encoder, value: LoadMoreButton) {
         r.h(var1, "encoder");
         r.h(var2, "value");
         val var3: SerialDescriptor = this.getDescriptor();
         val var4: CompositeEncoder = var1.b(var3);
         LoadMoreButton.write$Self(var2, var4, var3);
         var4.c(var3);
      }

      fun typeParametersSerializers(): Array<KSerializer<?>> {
         return xk.f0.a.a(this);
      }
   }

   public companion object {
      public fun serializer(): KSerializer<LoadMoreButton> {
         return LoadMoreButton.$serializer.INSTANCE;
      }
   }
}
