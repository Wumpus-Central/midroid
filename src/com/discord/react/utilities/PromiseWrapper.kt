package com.discord.react.utilities

import com.facebook.react.bridge.Promise
import com.facebook.react.bridge.WritableMap

public class PromiseWrapper(promise: Promise,
      resolveTransform: (Any?) -> Any? = new b(),
      rejectTransform: (com.discord.react.utilities.PromiseWrapper.Rejection) -> com.discord.react.utilities.PromiseWrapper.Rejection = new c()
   ) :
   Promise {
   private final val promise: Promise
   private final val resolveTransform: (Any?) -> Any?
   private final val rejectTransform: (com.discord.react.utilities.PromiseWrapper.Rejection) -> com.discord.react.utilities.PromiseWrapper.Rejection

   init {
      this.promise = var1;
      this.resolveTransform = var2;
      this.rejectTransform = var3;
   }

   @JvmStatic
   fun `_init_$lambda$0`(var0: Any): Any {
      return var0;
   }

   @JvmStatic
   fun `_init_$lambda$1`(var0: PromiseWrapper.Rejection): PromiseWrapper.Rejection {
      return var0;
   }

   public override fun reject(message: String) {
      val var2: PromiseWrapper.Rejection = this.rejectTransform.invoke(new PromiseWrapper.Rejection(null, var1, null, null)) as PromiseWrapper.Rejection;
      val var4: Promise = this.promise;
      val var5: java.lang.String = var2.getMessage();
      var4.reject(var5);
   }

   public override fun reject(code: String, userInfo: WritableMap) {
      val var3: PromiseWrapper.Rejection = this.rejectTransform.invoke(new PromiseWrapper.Rejection(var1, null, null, var2)) as PromiseWrapper.Rejection;
      val var5: Promise = this.promise;
      val var6: java.lang.String = var3.getCode();
      val var7: WritableMap = var3.getUserInfo();
      var5.reject(var6, var7);
   }

   public override fun reject(code: String, message: String?) {
      val var3: PromiseWrapper.Rejection = this.rejectTransform.invoke(new PromiseWrapper.Rejection(var1, var2, null, null)) as PromiseWrapper.Rejection;
      val var5: Promise = this.promise;
      var2 = var3.getCode();
      var5.reject(var2, var3.getMessage());
   }

   public override fun reject(code: String, message: String?, userInfo: WritableMap) {
      val var4: PromiseWrapper.Rejection = this.rejectTransform.invoke(new PromiseWrapper.Rejection(null, var2, null, var3)) as PromiseWrapper.Rejection;
      val var8: Promise = this.promise;
      var2 = var4.getCode();
      var1 = var4.getMessage();
      val var9: WritableMap = var4.getUserInfo();
      var8.reject(var2, var1, var9);
   }

   public override fun reject(code: String, message: String?, throwable: Throwable?) {
      val var7: PromiseWrapper.Rejection = this.rejectTransform.invoke(new PromiseWrapper.Rejection(var1, var2, var3, null)) as PromiseWrapper.Rejection;
      val var6: Promise = this.promise;
      var1 = var7.getCode();
      var6.reject(var1, var7.getMessage(), var7.getThrowable());
   }

   public override fun reject(code: String?, message: String?, throwable: Throwable?, userInfo: WritableMap?) {
      val var6: PromiseWrapper.Rejection = this.rejectTransform.invoke(new PromiseWrapper.Rejection(var1, var2, var3, var4)) as PromiseWrapper.Rejection;
      this.promise.reject(var6.getCode(), var6.getMessage(), var6.getThrowable(), var6.getUserInfo());
   }

   public override fun reject(code: String, throwable: Throwable?) {
      val var3: PromiseWrapper.Rejection = this.rejectTransform.invoke(new PromiseWrapper.Rejection(var1, null, var2, null)) as PromiseWrapper.Rejection;
      val var6: Promise = this.promise;
      var1 = var3.getCode();
      var6.reject(var1, var3.getThrowable());
   }

   public override fun reject(code: String, throwable: Throwable?, userInfo: WritableMap) {
      val var4: PromiseWrapper.Rejection = this.rejectTransform.invoke(new PromiseWrapper.Rejection(var1, null, var2, var3)) as PromiseWrapper.Rejection;
      val var8: Promise = this.promise;
      val var7: java.lang.String = var4.getCode();
      val var6: java.lang.Throwable = var4.getThrowable();
      val var9: WritableMap = var4.getUserInfo();
      var8.reject(var7, var6, var9);
   }

   public override fun reject(throwable: Throwable) {
      val var2: PromiseWrapper.Rejection = this.rejectTransform.invoke(new PromiseWrapper.Rejection(null, null, var1, null)) as PromiseWrapper.Rejection;
      val var4: Promise = this.promise;
      val var5: java.lang.Throwable = var2.getThrowable();
      var4.reject(var5);
   }

   public override fun reject(throwable: Throwable, userInfo: WritableMap) {
      val var3: PromiseWrapper.Rejection = this.rejectTransform.invoke(new PromiseWrapper.Rejection(null, null, var1, var2)) as PromiseWrapper.Rejection;
      val var5: Promise = this.promise;
      val var6: java.lang.Throwable = var3.getThrowable();
      val var7: WritableMap = var3.getUserInfo();
      var5.reject(var6, var7);
   }

   public override fun resolve(value: Any?) {
      this.promise.resolve(this.resolveTransform.invoke(var1));
   }

   public data class Rejection(code: String?, message: String?, throwable: Throwable?, userInfo: WritableMap?) {
      public final val code: String?
      public final val message: String?
      public final val throwable: Throwable?
      public final val userInfo: WritableMap?

      init {
         this.code = var1;
         this.message = var2;
         this.throwable = var3;
         this.userInfo = var4;
      }

      public operator fun component1(): String? {
         return this.code;
      }

      public operator fun component2(): String? {
         return this.message;
      }

      public operator fun component3(): Throwable? {
         return this.throwable;
      }

      public operator fun component4(): WritableMap? {
         return this.userInfo;
      }

      public fun copy(
         code: String? = var0.code,
         message: String? = var0.message,
         throwable: Throwable? = var0.throwable,
         userInfo: WritableMap? = var0.userInfo
      ): com.discord.react.utilities.PromiseWrapper.Rejection {
         return new PromiseWrapper.Rejection(var1, var2, var3, var4);
      }

      public override operator fun equals(other: Any?): Boolean {
         if (this === var1) {
            return true;
         } else if (var1 !is PromiseWrapper.Rejection) {
            return false;
         } else {
            var1 = var1;
            if (!(this.code == var1.code)) {
               return false;
            } else if (!(this.message == var1.message)) {
               return false;
            } else if (!(this.throwable == var1.throwable)) {
               return false;
            } else {
               return this.userInfo == var1.userInfo;
            }
         }
      }

      public override fun hashCode(): Int {
         var var4: Int = 0;
         val var1: Int;
         if (this.code == null) {
            var1 = 0;
         } else {
            var1 = this.code.hashCode();
         }

         val var2: Int;
         if (this.message == null) {
            var2 = 0;
         } else {
            var2 = this.message.hashCode();
         }

         val var3: Int;
         if (this.throwable == null) {
            var3 = 0;
         } else {
            var3 = this.throwable.hashCode();
         }

         if (this.userInfo != null) {
            var4 = this.userInfo.hashCode();
         }

         return ((var1 * 31 + var2) * 31 + var3) * 31 + var4;
      }

      public override fun toString(): String {
         val var1: java.lang.String = this.code;
         val var3: java.lang.String = this.message;
         val var4: java.lang.Throwable = this.throwable;
         val var5: WritableMap = this.userInfo;
         val var2: StringBuilder = new StringBuilder();
         var2.append("Rejection(code=");
         var2.append(var1);
         var2.append(", message=");
         var2.append(var3);
         var2.append(", throwable=");
         var2.append(var4);
         var2.append(", userInfo=");
         var2.append(var5);
         var2.append(")");
         return var2.toString();
      }
   }
}
