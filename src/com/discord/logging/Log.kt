package com.discord.logging

import kotlin.jvm.internal.q
import kotlin.reflect.KClass
import timber.log.a
import timber.log.a.b

public object Log {
   @JvmStatic
   fun {
      a.a.c(new LoggingTree());
   }

   public fun d(tag: String, message: String, exception: Throwable? = null) {
      q.h(var1, "tag");
      q.h(var2, "message");
      val var4: b = a.a;
      a.a.f(var1);
      var4.d(var3, var2, new Object[0]);
   }

   public fun d(tag: KClass<*>, message: String, exception: Throwable? = null) {
      q.h(var1, "tag");
      q.h(var2, "message");
      val var4: java.lang.String = xj.a.b(var1).getSimpleName();
      q.g(var4, "getSimpleName(...)");
      this.d(var4, var2, var3);
   }

   public fun e(tag: String, message: String, exception: Throwable? = null) {
      q.h(var1, "tag");
      q.h(var2, "message");
      val var4: b = a.a;
      a.a.f(var1);
      var4.e(var3, var2, new Object[0]);
   }

   public fun e(tag: KClass<*>, message: String, exception: Throwable? = null) {
      q.h(var1, "tag");
      q.h(var2, "message");
      val var4: java.lang.String = xj.a.b(var1).getSimpleName();
      q.g(var4, "getSimpleName(...)");
      this.e(var4, var2, var3);
   }

   public fun i(tag: String, message: String, exception: Throwable? = null) {
      q.h(var1, "tag");
      q.h(var2, "message");
      val var4: b = a.a;
      a.a.f(var1);
      var4.i(var3, var2, new Object[0]);
   }

   public fun i(tag: KClass<*>, message: String, exception: Throwable? = null) {
      q.h(var1, "tag");
      q.h(var2, "message");
      val var4: java.lang.String = xj.a.b(var1).getSimpleName();
      q.g(var4, "getSimpleName(...)");
      this.i(var4, var2, var3);
   }

   public fun w(tag: String, message: String, exception: Throwable? = null) {
      q.h(var1, "tag");
      q.h(var2, "message");
      val var4: b = a.a;
      a.a.f(var1);
      var4.w(var3, var2, new Object[0]);
   }

   public fun w(tag: KClass<*>, message: String, exception: Throwable? = null) {
      q.h(var1, "tag");
      q.h(var2, "message");
      val var4: java.lang.String = xj.a.b(var1).getSimpleName();
      q.g(var4, "getSimpleName(...)");
      this.w(var4, var2, var3);
   }
}
