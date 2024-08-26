package com.discord.chat.bridge.row

import com.discord.chat.bridge.ChangeType
import com.discord.chat.bridge.Message
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
import xk.a2
import xk.f0
import xk.m0
import xk.f0.a

@f
public data class UploadProgressRow(index: Int, changeType: ChangeType, message: Message, fileId: String) : Row {
   public open val changeType: ChangeType
   public final val fileId: String
   public open val index: Int
   public final val message: Message

   init {
      r.h(var2, "changeType");
      r.h(var3, "message");
      r.h(var4, "fileId");
      super(null);
      this.index = var1;
      this.changeType = var2;
      this.message = var3;
      this.fileId = var4;
   }

   @JvmStatic
   public fun `write$Self`(self: UploadProgressRow, output: CompositeEncoder, serialDesc: SerialDescriptor) {
      r.h(var0, "self");
      r.h(var1, "output");
      r.h(var2, "serialDesc");
      var1.w(var2, 0, var0.getIndex());
      var1.y(var2, 1, ChangeType.Serializer.INSTANCE, var0.getChangeType());
      var1.y(var2, 2, Message.$serializer.INSTANCE, var0.message);
      var1.z(var2, 3, var0.fileId);
   }

   public operator fun component1(): Int {
      return this.getIndex();
   }

   public operator fun component2(): ChangeType {
      return this.getChangeType();
   }

   public operator fun component3(): Message {
      return this.message;
   }

   public operator fun component4(): String {
      return this.fileId;
   }

   public fun copy(index: Int = var0.getIndex(), changeType: ChangeType = var0.getChangeType(), message: Message = var0.message, fileId: String = var0.fileId): UploadProgressRow {
      r.h(var2, "changeType");
      r.h(var3, "message");
      r.h(var4, "fileId");
      return new UploadProgressRow(var1, var2, var3, var4);
   }

   public override operator fun equals(other: Any?): Boolean {
      if (this === var1) {
         return true;
      } else if (var1 !is UploadProgressRow) {
         return false;
      } else {
         var1 = var1;
         if (this.getIndex() != var1.getIndex()) {
            return false;
         } else if (this.getChangeType() != var1.getChangeType()) {
            return false;
         } else if (!r.c(this.message, var1.message)) {
            return false;
         } else {
            return r.c(this.fileId, var1.fileId);
         }
      }
   }

   public override fun hashCode(): Int {
      return ((Integer.hashCode(this.getIndex()) * 31 + this.getChangeType().hashCode()) * 31 + this.message.hashCode()) * 31 + this.fileId.hashCode();
   }

   public override fun toString(): String {
      val var1: Int = this.getIndex();
      val var2: ChangeType = this.getChangeType();
      val var3: Message = this.message;
      val var4: java.lang.String = this.fileId;
      val var5: StringBuilder = new StringBuilder();
      var5.append("UploadProgressRow(index=");
      var5.append(var1);
      var5.append(", changeType=");
      var5.append(var2);
      var5.append(", message=");
      var5.append(var3);
      var5.append(", fileId=");
      var5.append(var4);
      var5.append(")");
      return var5.toString();
   }

   public object `$serializer` : f0<UploadProgressRow> {
      public open val descriptor: SerialDescriptor
         public open get() {
            return descriptor;
         }


      @JvmStatic
      fun {
         val var0: UploadProgressRow.$serializer = new UploadProgressRow.$serializer();
         INSTANCE = var0;
         val var1: PluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("3", var0, 4);
         var1.l("index", false);
         var1.l("changeType", false);
         var1.l("message", false);
         var1.l("fileId", false);
         descriptor = var1;
      }

      public open fun childSerializers(): Array<KSerializer<*>> {
         return new KSerializer[]{m0.a, ChangeType.Serializer.INSTANCE, Message.$serializer.INSTANCE, a2.a};
      }

      public open fun deserialize(decoder: Decoder): UploadProgressRow {
         r.h(var1, "decoder");
         val var8: SerialDescriptor = this.getDescriptor();
         val var9: c = var1.b(var8);
         var var3: Int;
         val var4: Int;
         var var6: Any;
         var var7: Any;
         var var10: Any;
         if (var9.p()) {
            val var2: Int = var9.i(var8, 0);
            var7 = var9.y(var8, 1, ChangeType.Serializer.INSTANCE, null);
            var6 = var9.y(var8, 2, Message.$serializer.INSTANCE, null);
            var10 = var9.m(var8, 3);
            var3 = 15;
            var4 = var2;
         } else {
            var var13: Boolean = true;
            var3 = 0;
            var7 = null;
            var6 = null;
            var10 = null;
            var var11: Int = 0;

            while (var13) {
               val var5: Int = var9.o(var8);
               if (var5 != -1) {
                  if (var5 != 0) {
                     if (var5 != 1) {
                        if (var5 != 2) {
                           if (var5 != 3) {
                              throw new n(var5);
                           }

                           var10 = var9.m(var8, 3);
                           var11 |= 8;
                        } else {
                           var6 = var9.y(var8, 2, Message.$serializer.INSTANCE, var6);
                           var11 |= 4;
                        }
                     } else {
                        var7 = var9.y(var8, 1, ChangeType.Serializer.INSTANCE, var7);
                        var11 |= 2;
                     }
                  } else {
                     var3 = var9.i(var8, 0);
                     var11 |= 1;
                  }
               } else {
                  var13 = false;
               }
            }

            var4 = var3;
            var3 = var11;
         }

         var9.c(var8);
         return new UploadProgressRow(var3, var4, var7 as ChangeType, var6 as Message, (java.lang.String)var10, null);
      }

      public open fun serialize(encoder: Encoder, value: UploadProgressRow) {
         r.h(var1, "encoder");
         r.h(var2, "value");
         val var3: SerialDescriptor = this.getDescriptor();
         val var4: CompositeEncoder = var1.b(var3);
         UploadProgressRow.write$Self(var2, var4, var3);
         var4.c(var3);
      }

      fun typeParametersSerializers(): Array<KSerializer<?>> {
         return a.a(this);
      }
   }

   public companion object {
      public fun serializer(): KSerializer<UploadProgressRow> {
         return UploadProgressRow.$serializer.INSTANCE;
      }
   }
}
