package com.discord.logging

import kotlin.jvm.internal.r
import kotlin.reflect.KClass
import timber.log.a

public object Log {
   @JvmStatic
   fun {
      a.a.a(new LoggingTree());
   }

   public fun d(tag: String, message: String, exception: Throwable? = null) {
      r.h(var1, "tag");
      r.h(var2, "message");
      val var4: a.b = a.a;
      a.a.b(var1);
      var4.d(var3, var2);
   }

   public fun d(tag: KClass<*>, message: String, exception: Throwable? = null) {
      r.h(var1, "tag");
      r.h(var2, "message");
      val var4: java.lang.String = ph.a.b(var1).getSimpleName();
      r.g(var4, "tag.java.simpleName");
      this.d(var4, var2, var3);
   }

   public fun e(tag: String, message: String, exception: Throwable? = null) {
      r.h(var1, "tag");
      r.h(var2, "message");
      val var4: a.b = a.a;
      a.a.b(var1);
      var4.e(var3, var2);
   }

   public fun e(tag: KClass<*>, message: String, exception: Throwable? = null) {
      r.h(var1, "tag");
      r.h(var2, "message");
      val var4: java.lang.String = ph.a.b(var1).getSimpleName();
      r.g(var4, "tag.java.simpleName");
      this.e(var4, var2, var3);
   }

   public fun i(tag: String, message: String, exception: Throwable? = null) {
      r.h(var1, "tag");
      r.h(var2, "message");
      val var4: a.b = a.a;
      a.a.b(var1);
      var4.i(var3, var2);
   }

   public fun i(tag: KClass<*>, message: String, exception: Throwable? = null) {
      r.h(var1, "tag");
      r.h(var2, "message");
      val var4: java.lang.String = ph.a.b(var1).getSimpleName();
      r.g(var4, "tag.java.simpleName");
      this.i(var4, var2, var3);
   }

   public fun w(tag: String, message: String, exception: Throwable? = null) {
      r.h(var1, "tag");
      r.h(var2, "message");
      val var4: a.b = a.a;
      a.a.b(var1);
      var4.w(var3, var2);
   }

   public fun w(tag: KClass<*>, message: String, exception: Throwable? = null) {
      r.h(var1, "tag");
      r.h(var2, "message");
      val var4: java.lang.String = ph.a.b(var1).getSimpleName();
      r.g(var4, "tag.java.simpleName");
      this.w(var4, var2, var3);
   }
}
