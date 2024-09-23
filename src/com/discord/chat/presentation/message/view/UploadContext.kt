package com.discord.chat.presentation.message.view

public data class UploadContext(uploaderId: String, uploadItemId: String) {
   public final val uploadItemId: String
   public final val uploaderId: String

   init {
      kotlin.jvm.internal.q.h(var1, "uploaderId");
      kotlin.jvm.internal.q.h(var2, "uploadItemId");
      super();
      this.uploaderId = var1;
      this.uploadItemId = var2;
   }

   public operator fun component1(): String {
      return this.uploaderId;
   }

   public operator fun component2(): String {
      return this.uploadItemId;
   }

   public fun copy(uploaderId: String = var0.uploaderId, uploadItemId: String = var0.uploadItemId): UploadContext {
      kotlin.jvm.internal.q.h(var1, "uploaderId");
      kotlin.jvm.internal.q.h(var2, "uploadItemId");
      return new UploadContext(var1, var2);
   }

   public override operator fun equals(other: Any?): Boolean {
      if (this === var1) {
         return true;
      } else if (var1 !is UploadContext) {
         return false;
      } else {
         var1 = var1;
         if (!kotlin.jvm.internal.q.c(this.uploaderId, var1.uploaderId)) {
            return false;
         } else {
            return kotlin.jvm.internal.q.c(this.uploadItemId, var1.uploadItemId);
         }
      }
   }

   public override fun hashCode(): Int {
      return this.uploaderId.hashCode() * 31 + this.uploadItemId.hashCode();
   }

   public override fun toString(): String {
      val var2: java.lang.String = this.uploaderId;
      val var3: java.lang.String = this.uploadItemId;
      val var1: StringBuilder = new StringBuilder();
      var1.append("UploadContext(uploaderId=");
      var1.append(var2);
      var1.append(", uploadItemId=");
      var1.append(var3);
      var1.append(")");
      return var1.toString();
   }
}
