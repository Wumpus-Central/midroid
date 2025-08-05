package com.discord.react.utilities

import com.facebook.react.bridge.Promise
import com.facebook.react.bridge.WritableMap
import kotlin.jvm.internal.r

public class PromiseWrapper(promise: Promise,
      resolveTransform: (Any?) -> Any? = new b(),
      rejectTransform: (com.discord.react.utilities.PromiseWrapper.Rejection) -> com.discord.react.utilities.PromiseWrapper.Rejection = new c()
   ) :
   Promise {
   private final val promise: Promise
   private final val resolveTransform: (Any?) -> Any?
   private final val rejectTransform: (com.discord.react.utilities.PromiseWrapper.Rejection) -> com.discord.react.utilities.PromiseWrapper.Rejection

   init {
      r.h(var1, "promise");
      r.h(var2, "resolveTransform");
      r.h(var3, "rejectTransform");
      super();
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
      r.h(var0, "it");
      return var0;
   }

   public open fun reject(message: String) {
      r.h(var1, "message");
      val var2: PromiseWrapper.Rejection = this.rejectTransform.invoke(new PromiseWrapper.Rejection(null, var1, null, null)) as PromiseWrapper.Rejection;
      val var4: Promise = this.promise;
      val var5: java.lang.String = var2.getMessage();
      r.e(var5);
      var4.reject(var5);
   }

   public open fun reject(code: String, userInfo: WritableMap) {
      r.h(var1, "code");
      r.h(var2, "userInfo");
      val var3: PromiseWrapper.Rejection = this.rejectTransform.invoke(new PromiseWrapper.Rejection(var1, null, null, var2)) as PromiseWrapper.Rejection;
      val var5: Promise = this.promise;
      val var6: java.lang.String = var3.getCode();
      r.e(var6);
      val var7: WritableMap = var3.getUserInfo();
      r.e(var7);
      var5.reject(var6, var7);
   }

   public open fun reject(code: String, message: String?) {
      r.h(var1, "code");
      val var5: PromiseWrapper.Rejection = this.rejectTransform.invoke(new PromiseWrapper.Rejection(var1, var2, null, null)) as PromiseWrapper.Rejection;
      val var3: Promise = this.promise;
      var2 = var5.getCode();
      r.e(var2);
      var3.reject(var2, var5.getMessage());
   }

   public open fun reject(code: String, message: String?, userInfo: WritableMap) {
      r.h(var1, "code");
      r.h(var3, "userInfo");
      val var4: PromiseWrapper.Rejection = this.rejectTransform.invoke(new PromiseWrapper.Rejection(null, var2, null, var3)) as PromiseWrapper.Rejection;
      val var6: Promise = this.promise;
      val var8: java.lang.String = var4.getCode();
      r.e(var8);
      var2 = var4.getMessage();
      val var9: WritableMap = var4.getUserInfo();
      r.e(var9);
      var6.reject(var8, var2, var9);
   }

   public open fun reject(code: String, message: String?, throwable: Throwable?) {
      r.h(var1, "code");
      val var5: PromiseWrapper.Rejection = this.rejectTransform.invoke(new PromiseWrapper.Rejection(var1, var2, var3, null)) as PromiseWrapper.Rejection;
      val var6: Promise = this.promise;
      val var7: java.lang.String = var5.getCode();
      r.e(var7);
      var6.reject(var7, var5.getMessage(), var5.getThrowable());
   }

   public open fun reject(code: String?, message: String?, throwable: Throwable?, userInfo: WritableMap?) {
      val var6: PromiseWrapper.Rejection = this.rejectTransform.invoke(new PromiseWrapper.Rejection(var1, var2, var3, var4)) as PromiseWrapper.Rejection;
      this.promise.reject(var6.getCode(), var6.getMessage(), var6.getThrowable(), var6.getUserInfo());
   }

   public open fun reject(code: String, throwable: Throwable?) {
      r.h(var1, "code");
      val var6: PromiseWrapper.Rejection = this.rejectTransform.invoke(new PromiseWrapper.Rejection(var1, null, var2, null)) as PromiseWrapper.Rejection;
      val var3: Promise = this.promise;
      var1 = var6.getCode();
      r.e(var1);
      var3.reject(var1, var6.getThrowable());
   }

   public open fun reject(code: String, throwable: Throwable?, userInfo: WritableMap) {
      r.h(var1, "code");
      r.h(var3, "userInfo");
      val var4: PromiseWrapper.Rejection = this.rejectTransform.invoke(new PromiseWrapper.Rejection(var1, null, var2, var3)) as PromiseWrapper.Rejection;
      val var6: Promise = this.promise;
      val var7: java.lang.String = var4.getCode();
      r.e(var7);
      val var8: java.lang.Throwable = var4.getThrowable();
      val var9: WritableMap = var4.getUserInfo();
      r.e(var9);
      var6.reject(var7, var8, var9);
   }

   public open fun reject(throwable: Throwable) {
      r.h(var1, "throwable");
      val var2: PromiseWrapper.Rejection = this.rejectTransform.invoke(new PromiseWrapper.Rejection(null, null, var1, null)) as PromiseWrapper.Rejection;
      val var4: Promise = this.promise;
      val var5: java.lang.Throwable = var2.getThrowable();
      r.e(var5);
      var4.reject(var5);
   }

   public open fun reject(throwable: Throwable, userInfo: WritableMap) {
      r.h(var1, "throwable");
      r.h(var2, "userInfo");
      val var3: PromiseWrapper.Rejection = this.rejectTransform.invoke(new PromiseWrapper.Rejection(null, null, var1, var2)) as PromiseWrapper.Rejection;
      val var5: Promise = this.promise;
      val var6: java.lang.Throwable = var3.getThrowable();
      r.e(var6);
      val var7: WritableMap = var3.getUserInfo();
      r.e(var7);
      var5.reject(var6, var7);
   }

   public open fun resolve(value: Any?) {
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
            if (!r.c(this.code, var1.code)) {
               return false;
            } else if (!r.c(this.message, var1.message)) {
               return false;
            } else if (!r.c(this.throwable, var1.throwable)) {
               return false;
            } else {
               return r.c(this.userInfo, var1.userInfo);
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
         val var4: java.lang.String = this.message;
         val var2: java.lang.Throwable = this.throwable;
         val var3: WritableMap = this.userInfo;
         val var5: StringBuilder = new StringBuilder();
         var5.append("Rejection(code=");
         var5.append(var1);
         var5.append(", message=");
         var5.append(var4);
         var5.append(", throwable=");
         var5.append(var2);
         var5.append(", userInfo=");
         var5.append(var3);
         var5.append(")");
         return var5.toString();
      }
   }
}
