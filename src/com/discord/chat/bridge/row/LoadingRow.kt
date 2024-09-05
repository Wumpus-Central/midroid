package com.discord.chat.bridge.row

import com.discord.chat.bridge.ChangeType
import kotlin.jvm.internal.q
import kotlinx.serialization.KSerializer
import kotlinx.serialization.descriptors.SerialDescriptor
import kotlinx.serialization.encoding.CompositeEncoder
import kotlinx.serialization.encoding.Decoder
import kotlinx.serialization.encoding.Encoder
import kotlinx.serialization.encoding.c
import kotlinx.serialization.internal.PluginGeneratedSerialDescriptor
import nn.f
import nn.n
import qn.g0
import qn.h
import qn.n0
import qn.g0.a

@f
public data class LoadingRow(index: Int, changeType: ChangeType, button: LoadMoreButton, isLoading: Boolean) : Row {
   public final val button: LoadMoreButton
   public open val changeType: ChangeType
   public open val index: Int
   public final val isLoading: Boolean

   init {
      q.h(var2, "changeType");
      q.h(var3, "button");
      super(null);
      this.index = var1;
      this.changeType = var2;
      this.button = var3;
      this.isLoading = var4;
   }

   public operator fun component1(): Int {
      return this.index;
   }

   public operator fun component2(): ChangeType {
      return this.changeType;
   }

   public operator fun component3(): LoadMoreButton {
      return this.button;
   }

   public operator fun component4(): Boolean {
      return this.isLoading;
   }

   public fun copy(index: Int = var0.index, changeType: ChangeType = var0.changeType, button: LoadMoreButton = var0.button, isLoading: Boolean = var0.isLoading): LoadingRow {
      q.h(var2, "changeType");
      q.h(var3, "button");
      return new LoadingRow(var1, var2, var3, var4);
   }

   public override operator fun equals(other: Any?): Boolean {
      if (this === var1) {
         return true;
      } else if (var1 !is LoadingRow) {
         return false;
      } else {
         var1 = var1;
         if (this.index != var1.index) {
            return false;
         } else if (this.changeType != var1.changeType) {
            return false;
         } else if (!q.c(this.button, var1.button)) {
            return false;
         } else {
            return this.isLoading == var1.isLoading;
         }
      }
   }

   public override fun hashCode(): Int {
      return ((Integer.hashCode(this.index) * 31 + this.changeType.hashCode()) * 31 + this.button.hashCode()) * 31 + java.lang.Boolean.hashCode(this.isLoading);
   }

   public override fun toString(): String {
      val var1: Int = this.index;
      val var3: ChangeType = this.changeType;
      val var5: LoadMoreButton = this.button;
      val var2: Boolean = this.isLoading;
      val var4: StringBuilder = new StringBuilder();
      var4.append("LoadingRow(index=");
      var4.append(var1);
      var4.append(", changeType=");
      var4.append(var3);
      var4.append(", button=");
      var4.append(var5);
      var4.append(", isLoading=");
      var4.append(var2);
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
         val var0: LoadingRow.$serializer = new LoadingRow.$serializer();
         INSTANCE = var0;
         val var1: PluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("4", var0, 4);
         var1.c("index", false);
         var1.c("changeType", false);
         var1.c("button", false);
         var1.c("isLoading", false);
         descriptor = var1;
      }

      public open fun childSerializers(): Array<KSerializer<*>> {
         return new KSerializer[]{n0.a, ChangeType.Serializer.INSTANCE, LoadMoreButton.$serializer.INSTANCE, h.a};
      }

      public open fun deserialize(decoder: Decoder): LoadingRow {
         q.h(var1, "decoder");
         val var8: SerialDescriptor = this.getDescriptor();
         val var9: c = var1.b(var8);
         var var4: Int;
         val var5: Int;
         var var7: ChangeType;
         var var10: LoadMoreButton;
         var var11: Int;
         if (var9.p()) {
            var11 = var9.i(var8, 0);
            var7 = var9.y(var8, 1, ChangeType.Serializer.INSTANCE, null) as ChangeType;
            var10 = var9.y(var8, 2, LoadMoreButton.$serializer.INSTANCE, null) as LoadMoreButton;
            val var3: Byte = var9.C(var8, 3);
            var5 = 15;
            var4 = var11;
            var11 = var3;
         } else {
            var var15: Boolean = true;
            var4 = 0;
            var11 = 0;
            var7 = null;
            var10 = null;
            var var13: Int = 0;

            while (var15) {
               val var6: Int = var9.o(var8);
               if (var6 != -1) {
                  if (var6 != 0) {
                     if (var6 != 1) {
                        if (var6 != 2) {
                           if (var6 != 3) {
                              throw new n(var6);
                           }

                           var13 = var9.C(var8, 3);
                           var11 |= 8;
                        } else {
                           var10 = var9.y(var8, 2, LoadMoreButton.$serializer.INSTANCE, var10) as LoadMoreButton;
                           var11 |= 4;
                        }
                     } else {
                        var7 = var9.y(var8, 1, ChangeType.Serializer.INSTANCE, var7) as ChangeType;
                        var11 |= 2;
                     }
                  } else {
                     var4 = var9.i(var8, 0);
                     var11 |= 1;
                  }
               } else {
                  var15 = false;
               }
            }

            var11 = var13;
            var5 = var11;
         }

         var9.c(var8);
         return new LoadingRow(var5, var4, var7, var10, (boolean)var11, null);
      }

      public open fun serialize(encoder: Encoder, value: LoadingRow) {
         q.h(var1, "encoder");
         q.h(var2, "value");
         val var3: SerialDescriptor = this.getDescriptor();
         val var4: CompositeEncoder = var1.b(var3);
         LoadingRow.write$Self$chat_release(var2, var4, var3);
         var4.c(var3);
      }

      fun typeParametersSerializers(): Array<KSerializer> {
         return a.a(this);
      }
   }

   public companion object {
      public fun serializer(): KSerializer<LoadingRow> {
         return LoadingRow.$serializer.INSTANCE;
      }
   }
}
