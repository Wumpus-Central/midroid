package com.discord.chat.bridge.row

import cl.f
import cl.n
import com.discord.chat.bridge.ChangeType
import fl.g0
import fl.h
import fl.n0
import fl.g0.a
import kotlin.jvm.internal.q
import kotlinx.serialization.KSerializer
import kotlinx.serialization.descriptors.SerialDescriptor
import kotlinx.serialization.encoding.CompositeEncoder
import kotlinx.serialization.encoding.Decoder
import kotlinx.serialization.encoding.Encoder
import kotlinx.serialization.encoding.c
import kotlinx.serialization.internal.PluginGeneratedSerialDescriptor

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
      val var4: ChangeType = this.changeType;
      val var3: LoadMoreButton = this.button;
      val var2: Boolean = this.isLoading;
      val var5: StringBuilder = new StringBuilder();
      var5.append("LoadingRow(index=");
      var5.append(var1);
      var5.append(", changeType=");
      var5.append(var4);
      var5.append(", button=");
      var5.append(var3);
      var5.append(", isLoading=");
      var5.append(var2);
      var5.append(")");
      return var5.toString();
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
         var1.l("index", false);
         var1.l("changeType", false);
         var1.l("button", false);
         var1.l("isLoading", false);
         descriptor = var1;
      }

      public open fun childSerializers(): Array<KSerializer<*>> {
         return new KSerializer[]{n0.a, ChangeType.Serializer.INSTANCE, LoadMoreButton.$serializer.INSTANCE, h.a};
      }

      public open fun deserialize(decoder: Decoder): LoadingRow {
         q.h(var1, "decoder");
         val var8: SerialDescriptor = this.getDescriptor();
         val var9: c = var1.c(var8);
         var var3: Int;
         var var4: Int;
         val var5: Int;
         var var7: ChangeType;
         var var10: LoadMoreButton;
         if (var9.y()) {
            val var2: Int = var9.k(var8, 0);
            var7 = var9.m(var8, 1, ChangeType.Serializer.INSTANCE, null) as ChangeType;
            var10 = var9.m(var8, 2, LoadMoreButton.$serializer.INSTANCE, null) as LoadMoreButton;
            var3 = var9.s(var8, 3);
            var4 = 15;
            var5 = var2;
         } else {
            var var13: Boolean = true;
            var4 = 0;
            var var11: Int = 0;
            var7 = null;
            var10 = null;
            var3 = 0;

            while (var13) {
               val var6: Int = var9.x(var8);
               if (var6 != -1) {
                  if (var6 != 0) {
                     if (var6 != 1) {
                        if (var6 != 2) {
                           if (var6 != 3) {
                              throw new n(var6);
                           }

                           var3 = var9.s(var8, 3);
                           var11 |= 8;
                        } else {
                           var10 = var9.m(var8, 2, LoadMoreButton.$serializer.INSTANCE, var10) as LoadMoreButton;
                           var11 |= 4;
                        }
                     } else {
                        var7 = var9.m(var8, 1, ChangeType.Serializer.INSTANCE, var7) as ChangeType;
                        var11 |= 2;
                     }
                  } else {
                     var4 = var9.k(var8, 0);
                     var11 |= 1;
                  }
               } else {
                  var13 = false;
               }
            }

            var5 = var4;
            var4 = var11;
         }

         var9.b(var8);
         return new LoadingRow(var4, var5, var7, var10, (boolean)var3, null);
      }

      public open fun serialize(encoder: Encoder, value: LoadingRow) {
         q.h(var1, "encoder");
         q.h(var2, "value");
         val var3: SerialDescriptor = this.getDescriptor();
         val var4: CompositeEncoder = var1.c(var3);
         LoadingRow.write$Self$chat_release(var2, var4, var3);
         var4.b(var3);
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
