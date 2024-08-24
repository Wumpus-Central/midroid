package com.discord.thumbhash

import android.graphics.drawable.Drawable
import com.discord.image.fresco.listeners.ControllerListener
import com.discord.misc.utilities.coroutines.CoroutineViewUtilsKt
import com.facebook.drawee.generic.GenericDraweeHierarchy
import com.facebook.drawee.view.SimpleDraweeView
import kk.f
import kotlin.coroutines.Continuation
import kotlin.jvm.functions.Function2
import kotlin.jvm.internal.r
import kotlinx.coroutines.CoroutineScope

public class ThumbhashPlaceholderControllerListener(draweeView: SimpleDraweeView, background: Drawable, placeholder: String?, placeholderVersion: Int?)
   : ControllerListener {
   private final val background: Drawable
   private final val draweeView: SimpleDraweeView
   private final val placeholder: String?
   private final val placeholderVersion: Int?

   init {
      r.h(var1, "draweeView");
      r.h(var2, "background");
      super();
      this.draweeView = var1;
      this.background = var2;
      this.placeholder = var3;
      this.placeholderVersion = var4;
   }

   public open fun onFailure(id: String?, throwable: Throwable?) {
      (this.draweeView.getHierarchy() as GenericDraweeHierarchy).u(this.background);
   }

   public open fun onSubmit(id: String?, callerContext: Any?) {
      (this.draweeView.getHierarchy() as GenericDraweeHierarchy).z(null);
      if (!Companion.canDisplay(this.placeholder, this.placeholderVersion)) {
         (this.draweeView.getHierarchy() as GenericDraweeHierarchy).u(this.background);
      } else {
         (this.draweeView.getHierarchy() as GenericDraweeHierarchy).u(null);
         f.d(
            CoroutineViewUtilsKt.getAttachedScope(this.draweeView),
            null,
            null,
            new Function2<CoroutineScope, Continuation<? super Unit>, Object>(this, null)// $VF: Couldn't be decompiled
   // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
   // java.lang.StackOverflowError
   //   at java.base/java.util.Objects.equals(Objects.java:64)
   //   at org.jetbrains.java.decompiler.modules.decompiler.vars.VarDefinitionHelper$VarInMethod.equals(VarDefinitionHelper.java:1403)
   ,
            3,
            null
         );
      }
   }

   public companion object {
      public fun canDisplay(placeholder: String?, placeholderVersion: Int?): Boolean {
         return var2 != null && var2 == 1 && var1 != null;
      }
   }
}
