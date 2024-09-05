package com.discord.chat.bridge.row

import kotlin.jvm.internal.q
import kotlinx.serialization.DeserializationStrategy
import kotlinx.serialization.KSerializer
import kotlinx.serialization.descriptors.SerialDescriptor
import kotlinx.serialization.encoding.CompositeEncoder
import kotlinx.serialization.encoding.Decoder
import kotlinx.serialization.encoding.Encoder
import kotlinx.serialization.encoding.c
import kotlinx.serialization.internal.PluginGeneratedSerialDescriptor
import nn.f
import nn.n
import on.a
import qn.b2
import qn.g0
import qn.n0

@f
public data class LoadMoreButton(action: LoadingAction, text: String, backgroundColor: Int, cornerRadius: Int? = null, color: Int? = null) {
   public final val action: LoadingAction
   public final val backgroundColor: Int
   public final val color: Int?
   public final val cornerRadius: Int?
   public final val text: String

   init {
      q.h(var1, "action");
      q.h(var2, "text");
      super();
      this.action = var1;
      this.text = var2;
      this.backgroundColor = var3;
      this.cornerRadius = var4;
      this.color = var5;
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
      q.h(var1, "action");
      q.h(var2, "text");
      return new LoadMoreButton(var1, var2, var3, var4, var5);
   }

   public override operator fun equals(other: Any?): Boolean {
      if (this === var1) {
         return true;
      } else if (var1 !is LoadMoreButton) {
         return false;
      } else {
         var1 = var1;
         if (!q.c(this.action, var1.action)) {
            return false;
         } else if (!q.c(this.text, var1.text)) {
            return false;
         } else if (this.backgroundColor != var1.backgroundColor) {
            return false;
         } else if (!q.c(this.cornerRadius, var1.cornerRadius)) {
            return false;
         } else {
            return q.c(this.color, var1.color);
         }
      }
   }

   public override fun hashCode(): Int {
      val var4: Int = this.action.hashCode();
      val var5: Int = this.text.hashCode();
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

      return (((var4 * 31 + var5) * 31 + var3) * 31 + var1) * 31 + var2;
   }

   public override fun toString(): String {
      val var2: LoadingAction = this.action;
      val var3: java.lang.String = this.text;
      val var1: Int = this.backgroundColor;
      val var6: Int = this.cornerRadius;
      val var5: Int = this.color;
      val var4: StringBuilder = new StringBuilder();
      var4.append("LoadMoreButton(action=");
      var4.append(var2);
      var4.append(", text=");
      var4.append(var3);
      var4.append(", backgroundColor=");
      var4.append(var1);
      var4.append(", cornerRadius=");
      var4.append(var6);
      var4.append(", color=");
      var4.append(var5);
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
         val var0: LoadMoreButton.$serializer = new LoadMoreButton.$serializer();
         INSTANCE = var0;
         val var1: PluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("com.discord.chat.bridge.row.LoadMoreButton", var0, 5);
         var1.c("action", false);
         var1.c("text", false);
         var1.c("backgroundColor", false);
         var1.c("cornerRadius", true);
         var1.c("color", true);
         descriptor = var1;
      }

      public open fun childSerializers(): Array<KSerializer<*>> {
         val var1: n0 = n0.a;
         return new KSerializer[]{LoadingAction.$serializer.INSTANCE, b2.a, n0.a, a.u(n0.a), a.u(var1)};
      }

      public open fun deserialize(decoder: Decoder): LoadMoreButton {
         q.h(var1, "decoder");
         val var10: SerialDescriptor = this.getDescriptor();
         val var11: c = var1.b(var10);
         var var2: Int;
         var var3: Int;
         var var7: java.lang.String;
         var var8: LoadingAction;
         var var12: Any;
         var var14: Any;
         if (var11.p()) {
            var8 = var11.y(var10, 0, LoadingAction.$serializer.INSTANCE, null) as LoadingAction;
            var7 = var11.m(var10, 1);
            var3 = var11.i(var10, 2);
            var14 = n0.a;
            var12 = var11.n(var10, 3, n0.a, null) as Int;
            var14 = var11.n(var10, 4, (DeserializationStrategy)var14, null) as Int;
            var2 = 31;
         } else {
            var var4: Boolean = true;
            var3 = 0;
            var8 = null;
            var7 = null;
            var14 = null;
            var12 = null;
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

                              var12 = var11.n(var10, 4, n0.a, var12) as Int;
                              var2 |= 16;
                           } else {
                              var14 = var11.n(var10, 3, n0.a, var14) as Int;
                              var2 |= 8;
                           }
                        } else {
                           var3 = var11.i(var10, 2);
                           var2 |= 4;
                        }
                     } else {
                        var7 = var11.m(var10, 1);
                        var2 |= 2;
                     }
                  } else {
                     var8 = var11.y(var10, 0, LoadingAction.$serializer.INSTANCE, var8) as LoadingAction;
                     var2 |= 1;
                  }
               } else {
                  var4 = false;
               }
            }

            var14 = var12;
            var12 = var14;
         }

         var11.c(var10);
         return new LoadMoreButton(var2, var8, var7, var3, (Integer)var12, (Integer)var14, null);
      }

      public open fun serialize(encoder: Encoder, value: LoadMoreButton) {
         q.h(var1, "encoder");
         q.h(var2, "value");
         val var3: SerialDescriptor = this.getDescriptor();
         val var4: CompositeEncoder = var1.b(var3);
         LoadMoreButton.write$Self$chat_release(var2, var4, var3);
         var4.c(var3);
      }

      fun typeParametersSerializers(): Array<KSerializer> {
         return qn.g0.a.a(this);
      }
   }

   public companion object {
      public fun serializer(): KSerializer<LoadMoreButton> {
         return LoadMoreButton.$serializer.INSTANCE;
      }
   }
}
