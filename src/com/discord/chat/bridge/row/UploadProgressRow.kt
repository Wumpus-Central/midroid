package com.discord.chat.bridge.row

import com.discord.chat.bridge.ChangeType
import com.discord.chat.bridge.Message
import dn.f
import dn.n
import gn.b2
import gn.g0
import gn.n0
import gn.g0.a
import kotlin.jvm.internal.q
import kotlinx.serialization.KSerializer
import kotlinx.serialization.descriptors.SerialDescriptor
import kotlinx.serialization.encoding.CompositeEncoder
import kotlinx.serialization.encoding.Decoder
import kotlinx.serialization.encoding.Encoder
import kotlinx.serialization.encoding.c
import kotlinx.serialization.internal.PluginGeneratedSerialDescriptor

@f
public data class UploadProgressRow(index: Int, changeType: ChangeType, message: Message, fileId: String) : Row {
   public open val changeType: ChangeType
   public final val fileId: String
   public open val index: Int
   public final val message: Message

   init {
      q.h(var2, "changeType");
      q.h(var3, "message");
      q.h(var4, "fileId");
      super(null);
      this.index = var1;
      this.changeType = var2;
      this.message = var3;
      this.fileId = var4;
   }

   public operator fun component1(): Int {
      return this.index;
   }

   public operator fun component2(): ChangeType {
      return this.changeType;
   }

   public operator fun component3(): Message {
      return this.message;
   }

   public operator fun component4(): String {
      return this.fileId;
   }

   public fun copy(index: Int = var0.index, changeType: ChangeType = var0.changeType, message: Message = var0.message, fileId: String = var0.fileId): UploadProgressRow {
      q.h(var2, "changeType");
      q.h(var3, "message");
      q.h(var4, "fileId");
      return new UploadProgressRow(var1, var2, var3, var4);
   }

   public override operator fun equals(other: Any?): Boolean {
      if (this === var1) {
         return true;
      } else if (var1 !is UploadProgressRow) {
         return false;
      } else {
         var1 = var1;
         if (this.index != var1.index) {
            return false;
         } else if (this.changeType != var1.changeType) {
            return false;
         } else if (!q.c(this.message, var1.message)) {
            return false;
         } else {
            return q.c(this.fileId, var1.fileId);
         }
      }
   }

   public override fun hashCode(): Int {
      return ((Integer.hashCode(this.index) * 31 + this.changeType.hashCode()) * 31 + this.message.hashCode()) * 31 + this.fileId.hashCode();
   }

   public override fun toString(): String {
      val var1: Int = this.index;
      val var4: ChangeType = this.changeType;
      val var2: Message = this.message;
      val var5: java.lang.String = this.fileId;
      val var3: StringBuilder = new StringBuilder();
      var3.append("UploadProgressRow(index=");
      var3.append(var1);
      var3.append(", changeType=");
      var3.append(var4);
      var3.append(", message=");
      var3.append(var2);
      var3.append(", fileId=");
      var3.append(var5);
      var3.append(")");
      return var3.toString();
   }

   public object `$serializer` : g0 {
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
         return new KSerializer[]{n0.a, ChangeType.Serializer.INSTANCE, Message.$serializer.INSTANCE, b2.a};
      }

      public open fun deserialize(decoder: Decoder): UploadProgressRow {
         q.h(var1, "decoder");
         val var8: SerialDescriptor = this.getDescriptor();
         val var9: c = var1.b(var8);
         var var3: Int;
         val var4: Int;
         var var6: Message;
         var var7: ChangeType;
         var var10: Any;
         if (var9.p()) {
            val var2: Int = var9.i(var8, 0);
            var7 = var9.y(var8, 1, ChangeType.Serializer.INSTANCE, null) as ChangeType;
            var6 = var9.y(var8, 2, Message.$serializer.INSTANCE, null) as Message;
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
                           var6 = var9.y(var8, 2, Message.$serializer.INSTANCE, var6) as Message;
                           var11 |= 4;
                        }
                     } else {
                        var7 = var9.y(var8, 1, ChangeType.Serializer.INSTANCE, var7) as ChangeType;
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
         return new UploadProgressRow(var3, var4, var7, var6, (java.lang.String)var10, null);
      }

      public open fun serialize(encoder: Encoder, value: UploadProgressRow) {
         q.h(var1, "encoder");
         q.h(var2, "value");
         val var3: SerialDescriptor = this.getDescriptor();
         val var4: CompositeEncoder = var1.b(var3);
         UploadProgressRow.write$Self$chat_release(var2, var4, var3);
         var4.c(var3);
      }

      fun typeParametersSerializers(): Array<KSerializer> {
         return a.a(this);
      }
   }

   public companion object {
      public fun serializer(): KSerializer<UploadProgressRow> {
         return UploadProgressRow.$serializer.INSTANCE;
      }
   }
}
