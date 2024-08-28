package com.discord.simpleast.code

import com.discord.simpleast.core.node.StyleNode.SpanProvider
import kotlin.jvm.internal.q

public data class CodeStyleProviders<R>(defaultStyleProvider: SpanProvider<Any> = CodeStyleProvidersKt.access$emptyProvider(),
   commentStyleProvider: SpanProvider<Any> = CodeStyleProvidersKt.access$emptyProvider(),
   literalStyleProvider: SpanProvider<Any> = CodeStyleProvidersKt.access$emptyProvider(),
   keywordStyleProvider: SpanProvider<Any> = CodeStyleProvidersKt.access$emptyProvider(),
   identifierStyleProvider: SpanProvider<Any> = CodeStyleProvidersKt.access$emptyProvider(),
   typesStyleProvider: SpanProvider<Any> = CodeStyleProvidersKt.access$emptyProvider(),
   genericsStyleProvider: SpanProvider<Any> = CodeStyleProvidersKt.access$emptyProvider(),
   paramsStyleProvider: SpanProvider<Any> = CodeStyleProvidersKt.access$emptyProvider()
) {
   public final val commentStyleProvider: SpanProvider<Any>
   public final val defaultStyleProvider: SpanProvider<Any>
   public final val genericsStyleProvider: SpanProvider<Any>
   public final val identifierStyleProvider: SpanProvider<Any>
   public final val keywordStyleProvider: SpanProvider<Any>
   public final val literalStyleProvider: SpanProvider<Any>
   public final val paramsStyleProvider: SpanProvider<Any>
   public final val typesStyleProvider: SpanProvider<Any>

   fun CodeStyleProviders() {
      this(null, null, null, null, null, null, null, null, 255, null);
   }

   init {
      q.h(var1, "defaultStyleProvider");
      q.h(var2, "commentStyleProvider");
      q.h(var3, "literalStyleProvider");
      q.h(var4, "keywordStyleProvider");
      q.h(var5, "identifierStyleProvider");
      q.h(var6, "typesStyleProvider");
      q.h(var7, "genericsStyleProvider");
      q.h(var8, "paramsStyleProvider");
      super();
      this.defaultStyleProvider = var1;
      this.commentStyleProvider = var2;
      this.literalStyleProvider = var3;
      this.keywordStyleProvider = var4;
      this.identifierStyleProvider = var5;
      this.typesStyleProvider = var6;
      this.genericsStyleProvider = var7;
      this.paramsStyleProvider = var8;
   }

   public operator fun component1(): SpanProvider<Any> {
      return this.defaultStyleProvider;
   }

   public operator fun component2(): SpanProvider<Any> {
      return this.commentStyleProvider;
   }

   public operator fun component3(): SpanProvider<Any> {
      return this.literalStyleProvider;
   }

   public operator fun component4(): SpanProvider<Any> {
      return this.keywordStyleProvider;
   }

   public operator fun component5(): SpanProvider<Any> {
      return this.identifierStyleProvider;
   }

   public operator fun component6(): SpanProvider<Any> {
      return this.typesStyleProvider;
   }

   public operator fun component7(): SpanProvider<Any> {
      return this.genericsStyleProvider;
   }

   public operator fun component8(): SpanProvider<Any> {
      return this.paramsStyleProvider;
   }

   public fun copy(
      defaultStyleProvider: SpanProvider<Any> = var0.defaultStyleProvider,
      commentStyleProvider: SpanProvider<Any> = var0.commentStyleProvider,
      literalStyleProvider: SpanProvider<Any> = var0.literalStyleProvider,
      keywordStyleProvider: SpanProvider<Any> = var0.keywordStyleProvider,
      identifierStyleProvider: SpanProvider<Any> = var0.identifierStyleProvider,
      typesStyleProvider: SpanProvider<Any> = var0.typesStyleProvider,
      genericsStyleProvider: SpanProvider<Any> = var0.genericsStyleProvider,
      paramsStyleProvider: SpanProvider<Any> = var0.paramsStyleProvider
   ): CodeStyleProviders<Any> {
      q.h(var1, "defaultStyleProvider");
      q.h(var2, "commentStyleProvider");
      q.h(var3, "literalStyleProvider");
      q.h(var4, "keywordStyleProvider");
      q.h(var5, "identifierStyleProvider");
      q.h(var6, "typesStyleProvider");
      q.h(var7, "genericsStyleProvider");
      q.h(var8, "paramsStyleProvider");
      return new CodeStyleProviders<>(var1, var2, var3, var4, var5, var6, var7, var8);
   }

   public override operator fun equals(other: Any?): Boolean {
      if (this != var1) {
         if (var1 !is CodeStyleProviders) {
            return false;
         }

         if (!q.c(this.defaultStyleProvider, (var1 as CodeStyleProviders).defaultStyleProvider)
            || !q.c(this.commentStyleProvider, (var1 as CodeStyleProviders).commentStyleProvider)
            || !q.c(this.literalStyleProvider, (var1 as CodeStyleProviders).literalStyleProvider)
            || !q.c(this.keywordStyleProvider, (var1 as CodeStyleProviders).keywordStyleProvider)
            || !q.c(this.identifierStyleProvider, (var1 as CodeStyleProviders).identifierStyleProvider)
            || !q.c(this.typesStyleProvider, (var1 as CodeStyleProviders).typesStyleProvider)
            || !q.c(this.genericsStyleProvider, (var1 as CodeStyleProviders).genericsStyleProvider)
            || !q.c(this.paramsStyleProvider, (var1 as CodeStyleProviders).paramsStyleProvider)) {
            return false;
         }
      }

      return true;
   }

   public override fun hashCode(): Int {
      var var8: Int = 0;
      val var1: Int;
      if (this.defaultStyleProvider != null) {
         var1 = this.defaultStyleProvider.hashCode();
      } else {
         var1 = 0;
      }

      val var2: Int;
      if (this.commentStyleProvider != null) {
         var2 = this.commentStyleProvider.hashCode();
      } else {
         var2 = 0;
      }

      val var3: Int;
      if (this.literalStyleProvider != null) {
         var3 = this.literalStyleProvider.hashCode();
      } else {
         var3 = 0;
      }

      val var4: Int;
      if (this.keywordStyleProvider != null) {
         var4 = this.keywordStyleProvider.hashCode();
      } else {
         var4 = 0;
      }

      val var5: Int;
      if (this.identifierStyleProvider != null) {
         var5 = this.identifierStyleProvider.hashCode();
      } else {
         var5 = 0;
      }

      val var6: Int;
      if (this.typesStyleProvider != null) {
         var6 = this.typesStyleProvider.hashCode();
      } else {
         var6 = 0;
      }

      val var7: Int;
      if (this.genericsStyleProvider != null) {
         var7 = this.genericsStyleProvider.hashCode();
      } else {
         var7 = 0;
      }

      if (this.paramsStyleProvider != null) {
         var8 = this.paramsStyleProvider.hashCode();
      }

      return ((((((var1 * 31 + var2) * 31 + var3) * 31 + var4) * 31 + var5) * 31 + var6) * 31 + var7) * 31 + var8;
   }

   public override fun toString(): String {
      val var1: StringBuilder = new StringBuilder();
      var1.append("CodeStyleProviders(defaultStyleProvider=");
      var1.append(this.defaultStyleProvider);
      var1.append(", commentStyleProvider=");
      var1.append(this.commentStyleProvider);
      var1.append(", literalStyleProvider=");
      var1.append(this.literalStyleProvider);
      var1.append(", keywordStyleProvider=");
      var1.append(this.keywordStyleProvider);
      var1.append(", identifierStyleProvider=");
      var1.append(this.identifierStyleProvider);
      var1.append(", typesStyleProvider=");
      var1.append(this.typesStyleProvider);
      var1.append(", genericsStyleProvider=");
      var1.append(this.genericsStyleProvider);
      var1.append(", paramsStyleProvider=");
      var1.append(this.paramsStyleProvider);
      var1.append(")");
      return var1.toString();
   }
}
