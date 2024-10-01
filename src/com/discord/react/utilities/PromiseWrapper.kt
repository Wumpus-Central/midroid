package com.discord.react.utilities

import com.facebook.react.bridge.Promise
import com.facebook.react.bridge.WritableMap
import kotlin.jvm.internal.q

public class PromiseWrapper(promise: Promise,
      resolveTransform: (Any?) -> Any? = <unrepresentable>.INSTANCE,
      rejectTransform: (com.discord.react.utilities.PromiseWrapper.Rejection) -> com.discord.react.utilities.PromiseWrapper.Rejection = <unrepresentable>.INSTANCE
   ) :
   Promise {
   private final val promise: Promise
   private final val resolveTransform: (Any?) -> Any?
   private final val rejectTransform: (com.discord.react.utilities.PromiseWrapper.Rejection) -> com.discord.react.utilities.PromiseWrapper.Rejection

   init {
      q.h(var1, "promise");
      q.h(var2, "resolveTransform");
      q.h(var3, "rejectTransform");
      super();
      this.promise = var1;
      this.resolveTransform = var2;
      this.rejectTransform = var3;
   }

   public open fun reject(message: String?) {
      this.promise.reject((this.rejectTransform.invoke(new PromiseWrapper.Rejection(null, var1, null, null)) as PromiseWrapper.Rejection).getMessage());
   }

   public open fun reject(code: String?, userInfo: WritableMap) {
      q.h(var2, "userInfo");
      val var3: PromiseWrapper.Rejection = this.rejectTransform.invoke(new PromiseWrapper.Rejection(var1, null, null, var2)) as PromiseWrapper.Rejection;
      val var5: Promise = this.promise;
      val var6: java.lang.String = var3.getCode();
      val var7: WritableMap = var3.getUserInfo();
      q.e(var7);
      var5.reject(var6, var7);
   }

   public open fun reject(code: String?, message: String?) {
      val var4: PromiseWrapper.Rejection = this.rejectTransform.invoke(new PromiseWrapper.Rejection(var1, var2, null, null)) as PromiseWrapper.Rejection;
      this.promise.reject(var4.getCode(), var4.getMessage());
   }

   public open fun reject(code: String?, message: String?, userInfo: WritableMap) {
      q.h(var3, "userInfo");
      val var4: PromiseWrapper.Rejection = this.rejectTransform.invoke(new PromiseWrapper.Rejection(null, var2, null, var3)) as PromiseWrapper.Rejection;
      val var6: Promise = this.promise;
      var2 = var4.getCode();
      val var8: java.lang.String = var4.getMessage();
      val var9: WritableMap = var4.getUserInfo();
      q.e(var9);
      var6.reject(var2, var8, var9);
   }

   public open fun reject(code: String?, message: String?, throwable: Throwable?) {
      val var5: PromiseWrapper.Rejection = this.rejectTransform.invoke(new PromiseWrapper.Rejection(var1, var2, var3, null)) as PromiseWrapper.Rejection;
      this.promise.reject(var5.getCode(), var5.getMessage(), var5.getThrowable());
   }

   public open fun reject(code: String?, message: String?, throwable: Throwable?, userInfo: WritableMap?) {
      val var6: PromiseWrapper.Rejection = this.rejectTransform.invoke(new PromiseWrapper.Rejection(var1, var2, var3, var4)) as PromiseWrapper.Rejection;
      this.promise.reject(var6.getCode(), var6.getMessage(), var6.getThrowable(), var6.getUserInfo());
   }

   public open fun reject(code: String?, throwable: Throwable?) {
      val var4: PromiseWrapper.Rejection = this.rejectTransform.invoke(new PromiseWrapper.Rejection(var1, null, var2, null)) as PromiseWrapper.Rejection;
      this.promise.reject(var4.getCode(), var4.getThrowable());
   }

   public open fun reject(code: String?, throwable: Throwable?, userInfo: WritableMap?) {
      val var5: PromiseWrapper.Rejection = this.rejectTransform.invoke(new PromiseWrapper.Rejection(var1, null, var2, var3)) as PromiseWrapper.Rejection;
      this.promise.reject(var5.getCode(), var5.getThrowable(), var5.getUserInfo());
   }

   public open fun reject(throwable: Throwable?) {
      this.promise.reject((this.rejectTransform.invoke(new PromiseWrapper.Rejection(null, null, var1, null)) as PromiseWrapper.Rejection).getThrowable());
   }

   public open fun reject(throwable: Throwable?, userInfo: WritableMap?) {
      val var4: PromiseWrapper.Rejection = this.rejectTransform.invoke(new PromiseWrapper.Rejection(null, null, var1, var2)) as PromiseWrapper.Rejection;
      this.promise.reject(var4.getThrowable(), var4.getUserInfo());
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
            if (!q.c(this.code, var1.code)) {
               return false;
            } else if (!q.c(this.message, var1.message)) {
               return false;
            } else if (!q.c(this.throwable, var1.throwable)) {
               return false;
            } else {
               return q.c(this.userInfo, var1.userInfo);
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
         val var5: java.lang.String = this.code;
         val var3: java.lang.String = this.message;
         val var2: java.lang.Throwable = this.throwable;
         val var1: WritableMap = this.userInfo;
         val var4: StringBuilder = new StringBuilder();
         var4.append("Rejection(code=");
         var4.append(var5);
         var4.append(", message=");
         var4.append(var3);
         var4.append(", throwable=");
         var4.append(var2);
         var4.append(", userInfo=");
         var4.append(var1);
         var4.append(")");
         return var4.toString();
      }
   }
}
