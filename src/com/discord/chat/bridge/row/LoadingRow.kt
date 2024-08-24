package com.discord.chat.bridge.row

import com.discord.chat.bridge.ChangeType
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
import xk.f0
import xk.h
import xk.m0
import xk.f0.a

@f
public data class LoadingRow(index: Int, changeType: ChangeType, button: LoadMoreButton, isLoading: Boolean) : Row {
   public final val button: LoadMoreButton
   public open val changeType: ChangeType
   public open val index: Int
   public final val isLoading: Boolean

   init {
      r.h(var2, "changeType");
      r.h(var3, "button");
      super(null);
      this.index = var1;
      this.changeType = var2;
      this.button = var3;
      this.isLoading = var4;
   }

   @JvmStatic
   public fun `write$Self`(self: LoadingRow, output: CompositeEncoder, serialDesc: SerialDescriptor) {
      r.h(var0, "self");
      r.h(var1, "output");
      r.h(var2, "serialDesc");
      var1.w(var2, 0, var0.getIndex());
      var1.y(var2, 1, ChangeType.Serializer.INSTANCE, var0.getChangeType());
      var1.y(var2, 2, LoadMoreButton.$serializer.INSTANCE, var0.button);
      var1.x(var2, 3, var0.isLoading);
   }

   public operator fun component1(): Int {
      return this.getIndex();
   }

   public operator fun component2(): ChangeType {
      return this.getChangeType();
   }

   public operator fun component3(): LoadMoreButton {
      return this.button;
   }

   public operator fun component4(): Boolean {
      return this.isLoading;
   }

   public fun copy(
      index: Int = var0.getIndex(),
      changeType: ChangeType = var0.getChangeType(),
      button: LoadMoreButton = var0.button,
      isLoading: Boolean = var0.isLoading
   ): LoadingRow {
      r.h(var2, "changeType");
      r.h(var3, "button");
      return new LoadingRow(var1, var2, var3, var4);
   }

   public override operator fun equals(other: Any?): Boolean {
      if (this === var1) {
         return true;
      } else if (var1 !is LoadingRow) {
         return false;
      } else {
         var1 = var1;
         if (this.getIndex() != var1.getIndex()) {
            return false;
         } else if (this.getChangeType() != var1.getChangeType()) {
            return false;
         } else if (!r.c(this.button, var1.button)) {
            return false;
         } else {
            return this.isLoading == var1.isLoading;
         }
      }
   }

   public override fun hashCode(): Int {
      val var4: Int = Integer.hashCode(this.getIndex());
      val var5: Int = this.getChangeType().hashCode();
      val var3: Int = this.button.hashCode();
      var var1: Byte = this.isLoading;
      if (this.isLoading != 0) {
         var1 = 1;
      }

      return ((var4 * 31 + var5) * 31 + var3) * 31 + var1;
   }

   public override fun toString(): String {
      val var1: Int = this.getIndex();
      val var4: ChangeType = this.getChangeType();
      val var5: LoadMoreButton = this.button;
      val var2: Boolean = this.isLoading;
      val var3: StringBuilder = new StringBuilder();
      var3.append("LoadingRow(index=");
      var3.append(var1);
      var3.append(", changeType=");
      var3.append(var4);
      var3.append(", button=");
      var3.append(var5);
      var3.append(", isLoading=");
      var3.append(var2);
      var3.append(")");
      return var3.toString();
   }

   public object `$serializer` : f0<LoadingRow> {
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
         return new KSerializer[]{m0.a, ChangeType.Serializer.INSTANCE, LoadMoreButton.$serializer.INSTANCE, h.a};
      }

      public open fun deserialize(decoder: Decoder): LoadingRow {
         r.h(var1, "decoder");
         val var8: SerialDescriptor = this.getDescriptor();
         val var9: c = var1.b(var8);
         var var3: Int;
         var var4: Int;
         val var5: Int;
         var var7: Any;
         var var10: Any;
         if (var9.p()) {
            var4 = var9.i(var8, 0);
            var7 = var9.y(var8, 1, ChangeType.Serializer.INSTANCE, null);
            var10 = var9.y(var8, 2, LoadMoreButton.$serializer.INSTANCE, null);
            val var2: Byte = var9.C(var8, 3);
            var3 = 15;
            var5 = var2;
         } else {
            var var13: Boolean = true;
            var4 = 0;
            var var11: Int = 0;
            var7 = null;
            var10 = null;
            var3 = 0;

            while (var13) {
               val var6: Int = var9.o(var8);
               if (var6 != -1) {
                  if (var6 != 0) {
                     if (var6 != 1) {
                        if (var6 != 2) {
                           if (var6 != 3) {
                              throw new n(var6);
                           }

                           var3 = var9.C(var8, 3);
                           var11 |= 8;
                        } else {
                           var10 = var9.y(var8, 2, LoadMoreButton.$serializer.INSTANCE, var10);
                           var11 |= 4;
                        }
                     } else {
                        var7 = var9.y(var8, 1, ChangeType.Serializer.INSTANCE, var7);
                        var11 |= 2;
                     }
                  } else {
                     var4 = var9.i(var8, 0);
                     var11 |= 1;
                  }
               } else {
                  var13 = false;
               }
            }

            var5 = var3;
            var3 = var11;
         }

         var9.c(var8);
         return new LoadingRow(var3, var4, var7 as ChangeType, var10 as LoadMoreButton, (boolean)var5, null);
      }

      public open fun serialize(encoder: Encoder, value: LoadingRow) {
         r.h(var1, "encoder");
         r.h(var2, "value");
         val var3: SerialDescriptor = this.getDescriptor();
         val var4: CompositeEncoder = var1.b(var3);
         LoadingRow.write$Self(var2, var4, var3);
         var4.c(var3);
      }

      fun typeParametersSerializers(): Array<KSerializer<?>> {
         return a.a(this);
      }
   }

   public companion object {
      public fun serializer(): KSerializer<LoadingRow> {
         return LoadingRow.$serializer.INSTANCE;
      }
   }
}
