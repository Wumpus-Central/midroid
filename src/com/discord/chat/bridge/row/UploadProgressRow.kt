package com.discord.chat.bridge.row

import com.discord.chat.bridge.ChangeType
import com.discord.chat.bridge.Message
import kotlin.jvm.internal.q
import kotlinx.serialization.KSerializer
import sb.f

@f
public data class UploadProgressRow(index: Int, changeType: ChangeType, message: Message, fileId: String) : Row {
   public open val index: Int
   public open val changeType: ChangeType
   public final val message: Message
   public final val fileId: String

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
      val var2: ChangeType = this.changeType;
      val var5: Message = this.message;
      val var3: java.lang.String = this.fileId;
      val var4: StringBuilder = new StringBuilder();
      var4.append("UploadProgressRow(index=");
      var4.append(var1);
      var4.append(", changeType=");
      var4.append(var2);
      var4.append(", message=");
      var4.append(var5);
      var4.append(", fileId=");
      var4.append(var3);
      var4.append(")");
      return var4.toString();
   }

   public companion object {
      public fun serializer(): KSerializer<UploadProgressRow> {
         return UploadProgressRow.$serializer.INSTANCE;
      }
   }
}
