package com.discord.chat.bridge.row

import cl.f
import cl.n
import dl.a
import fl.b2
import fl.g0
import fl.n0
import kotlin.jvm.internal.q
import kotlinx.serialization.DeserializationStrategy
import kotlinx.serialization.KSerializer
import kotlinx.serialization.descriptors.SerialDescriptor
import kotlinx.serialization.encoding.CompositeEncoder
import kotlinx.serialization.encoding.Decoder
import kotlinx.serialization.encoding.Encoder
import kotlinx.serialization.encoding.c
import kotlinx.serialization.internal.PluginGeneratedSerialDescriptor

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
      val var3: Int = this.action.hashCode();
      val var4: Int = this.text.hashCode();
      val var5: Int = Integer.hashCode(this.backgroundColor);
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

      return (((var3 * 31 + var4) * 31 + var5) * 31 + var1) * 31 + var2;
   }

   public override fun toString(): String {
      val var4: LoadingAction = this.action;
      val var3: java.lang.String = this.text;
      val var1: Int = this.backgroundColor;
      val var2: Int = this.cornerRadius;
      val var5: Int = this.color;
      val var6: StringBuilder = new StringBuilder();
      var6.append("LoadMoreButton(action=");
      var6.append(var4);
      var6.append(", text=");
      var6.append(var3);
      var6.append(", backgroundColor=");
      var6.append(var1);
      var6.append(", cornerRadius=");
      var6.append(var2);
      var6.append(", color=");
      var6.append(var5);
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
         val var2: n0 = n0.a;
         return new KSerializer[]{LoadingAction.$serializer.INSTANCE, b2.a, n0.a, a.u(n0.a), a.u(var2)};
      }

      public open fun deserialize(decoder: Decoder): LoadMoreButton {
         q.h(var1, "decoder");
         val var10: SerialDescriptor = this.getDescriptor();
         val var11: c = var1.c(var10);
         var var3: Int;
         val var4: Int;
         var var6: Any;
         var var8: LoadingAction;
         var var13: Any;
         var var17: java.lang.String;
         if (var11.y()) {
            val var7: LoadingAction = var11.m(var10, 0, LoadingAction.$serializer.INSTANCE, null) as LoadingAction;
            val var9: java.lang.String = var11.t(var10, 1);
            val var2: Int = var11.k(var10, 2);
            var13 = n0.a;
            var6 = var11.v(var10, 3, n0.a, null) as Int;
            var13 = var11.v(var10, 4, (DeserializationStrategy)var13, null) as Int;
            var3 = 31;
            var8 = var7;
            var17 = var9;
            var4 = var2;
         } else {
            var var16: Boolean = true;
            var3 = 0;
            var8 = null;
            var17 = null;
            var6 = null;
            var13 = null;
            var var14: Int = 0;

            while (var16) {
               val var5: Int = var11.x(var10);
               if (var5 != -1) {
                  if (var5 != 0) {
                     if (var5 != 1) {
                        if (var5 != 2) {
                           if (var5 != 3) {
                              if (var5 != 4) {
                                 throw new n(var5);
                              }

                              var13 = var11.v(var10, 4, n0.a, var13) as Int;
                              var14 |= 16;
                           } else {
                              var6 = var11.v(var10, 3, n0.a, var6) as Int;
                              var14 |= 8;
                           }
                        } else {
                           var3 = var11.k(var10, 2);
                           var14 |= 4;
                        }
                     } else {
                        var17 = var11.t(var10, 1);
                        var14 |= 2;
                     }
                  } else {
                     var8 = var11.m(var10, 0, LoadingAction.$serializer.INSTANCE, var8) as LoadingAction;
                     var14 |= 1;
                  }
               } else {
                  var16 = false;
               }
            }

            var4 = var3;
            var3 = var14;
         }

         var11.b(var10);
         return new LoadMoreButton(var3, var8, var17, var4, (Integer)var6, (Integer)var13, null);
      }

      public open fun serialize(encoder: Encoder, value: LoadMoreButton) {
         q.h(var1, "encoder");
         q.h(var2, "value");
         val var3: SerialDescriptor = this.getDescriptor();
         val var4: CompositeEncoder = var1.c(var3);
         LoadMoreButton.write$Self$chat_release(var2, var4, var3);
         var4.b(var3);
      }

      fun typeParametersSerializers(): Array<KSerializer> {
         return fl.g0.a.a(this);
      }
   }

   public companion object {
      public fun serializer(): KSerializer<LoadMoreButton> {
         return LoadMoreButton.$serializer.INSTANCE;
      }
   }
}
