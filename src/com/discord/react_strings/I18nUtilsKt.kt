package com.discord.react_strings

import android.content.Context
import android.widget.ImageView
import android.widget.TextView
import kotlin.jvm.functions.Function1
import kotlin.jvm.functions.Function3
import kotlin.jvm.internal.r

public fun ImageView.i18nContentDescription(i18nMessage: I18nMessage, initializer: (RenderContext) -> Unit = <unrepresentable>.INSTANCE) {
   r.h(var0, "<this>");
   r.h(var1, "i18nMessage");
   r.h(var2, "initializer");
   val var3: Context = var0.getContext();
   r.g(var3, "context");
   var0.setContentDescription(i18nFormat(var3, var1, var2));
}

public fun TextView.i18nContentDescription(i18nMessage: I18nMessage, initializer: (RenderContext) -> Unit = <unrepresentable>.INSTANCE) {
   r.h(var0, "<this>");
   r.h(var1, "i18nMessage");
   r.h(var2, "initializer");
   val var3: Context = var0.getContext();
   r.g(var3, "context");
   var0.setContentDescription(i18nFormat(var3, var1, var2));
}

@JvmSynthetic
fun `i18nContentDescription$default`(var0: ImageView, var1: I18nMessage, var2: Function1, var3: Int, var4: Any) {
   if ((var3 and 2) != 0) {
      var2 = <unrepresentable>.INSTANCE;
   }

   i18nContentDescription(var0, var1, (Function1<? super RenderContext, Unit>)var2);
}

@JvmSynthetic
fun `i18nContentDescription$default`(var0: TextView, var1: I18nMessage, var2: Function1, var3: Int, var4: Any) {
   if ((var3 and 2) != 0) {
      var2 = <unrepresentable>.INSTANCE;
   }

   i18nContentDescription(var0, var1, (Function1<? super RenderContext, Unit>)var2);
}

public fun Context.i18nFormat(i18nMessage: I18nMessage, initializer: (RenderContext) -> Unit = <unrepresentable>.INSTANCE): CharSequence {
   r.h(var0, "<this>");
   r.h(var1, "i18nMessage");
   r.h(var2, "initializer");
   val var3: RenderContext = new RenderContext();
   var2.invoke(var3);
   return RenderContext.Argument.INSTANCE
      .replace(var1.format$react_strings_release(var0), new Function3<java.lang.String, java.lang.String, java.lang.Boolean, java.lang.CharSequence>(var3) {
         final RenderContext $messageRenderContext;

         {
            super(3);
            this.$messageRenderContext = var1;
         }

         public final java.lang.CharSequence invoke(java.lang.String var1, java.lang.String var2, boolean var3) {
            r.h(var1, "argName");
            var2 = this.$messageRenderContext.getArgs().get(var1);
            if (var2 != null) {
               var1 = var2;
            }

            return var1;
         }
      });
}

@JvmSynthetic
fun `i18nFormat$default`(var0: Context, var1: I18nMessage, var2: Function1, var3: Int, var4: Any): java.lang.CharSequence {
   if ((var3 and 2) != 0) {
      var2 = <unrepresentable>.INSTANCE;
   }

   return i18nFormat(var0, var1, (Function1<? super RenderContext, Unit>)var2);
}

public fun TextView.i18nSetText(i18nMessage: I18nMessage, initializer: (RenderContext) -> Unit = <unrepresentable>.INSTANCE) {
   r.h(var0, "<this>");
   r.h(var1, "i18nMessage");
   r.h(var2, "initializer");
   val var3: Context = var0.getContext();
   r.g(var3, "context");
   var0.setText(i18nFormat(var3, var1, var2));
}

@JvmSynthetic
fun `i18nSetText$default`(var0: TextView, var1: I18nMessage, var2: Function1, var3: Int, var4: Any) {
   if ((var3 and 2) != 0) {
      var2 = <unrepresentable>.INSTANCE;
   }

   i18nSetText(var0, var1, (Function1<? super RenderContext, Unit>)var2);
}
