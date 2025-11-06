package com.discord.thumbhash

import android.content.res.Resources
import android.graphics.Bitmap
import android.graphics.drawable.BitmapDrawable
import android.graphics.drawable.Drawable
import android.util.Base64
import com.discord.image.fresco.listeners.ControllerListener
import com.discord.misc.utilities.coroutines.CoroutineViewUtilsKt
import com.facebook.drawee.generic.GenericDraweeHierarchy
import com.facebook.drawee.view.SimpleDraweeView
import gu.m0
import kotlin.coroutines.Continuation
import kotlin.jvm.functions.Function2
import kotlinx.coroutines.CoroutineDispatcher
import kotlinx.coroutines.CoroutineScope
import ot.b

public class ThumbhashPlaceholderControllerListener(draweeView: SimpleDraweeView, background: Drawable, placeholder: String?, placeholderVersion: Int?)
   : ControllerListener {
   private final val draweeView: SimpleDraweeView
   private final val background: Drawable
   private final val placeholder: String?
   private final val placeholderVersion: Int?

   init {
      this.draweeView = var1;
      this.background = var2;
      this.placeholder = var3;
      this.placeholderVersion = var4;
   }

   public override fun onFailure(id: String?, throwable: Throwable?) {
      (this.draweeView.getHierarchy() as GenericDraweeHierarchy).u(this.background);
   }

   public override fun onSubmit(id: String?, callerContext: Any?) {
      (this.draweeView.getHierarchy() as GenericDraweeHierarchy).z(null);
      if (!Companion.canDisplay(this.placeholder, this.placeholderVersion)) {
         (this.draweeView.getHierarchy() as GenericDraweeHierarchy).u(this.background);
      } else {
         (this.draweeView.getHierarchy() as GenericDraweeHierarchy).u(null);
         gu.g.d(
            CoroutineViewUtilsKt.getAttachedScope(this.draweeView),
            null,
            null,
            new Function2<CoroutineScope, Continuation<? super Unit>, Object>(this, null) {
               private Object L$0;
               int label;
               final ThumbhashPlaceholderControllerListener this$0;

               {
                  super(2, var2x);
                  this.this$0 = var1;
               }

               public final Continuation<Unit> create(Object var1, Continuation<?> var2) {
                  val var3: Function2 = new <anonymous constructor>(this.this$0, var2);
                  var3.L$0 = var1;
                  return var3;
               }

               public final Object invoke(CoroutineScope var1, Continuation<? super Unit> var2x) {
                  return (this.create(var1, var2x) as <unrepresentable>).invokeSuspend(Unit.a);
               }

               public final Object invokeSuspend(Object var1) {
                  var var3x: Any = b.f();
                  var var4: Any;
                  if (this.label != 0) {
                     if (this.label != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                     }

                     var3x = this.L$0 as CoroutineScope;
                     kotlin.c.b(var1);
                     var4 = var1;
                  } else {
                     kotlin.c.b(var1);
                     var1 = this.L$0 as CoroutineScope;
                     val var5: CoroutineDispatcher = m0.a();
                     var4 = new Function2<CoroutineScope, Continuation<? super Bitmap>, Object>(this.this$0, null) {
                        int label;
                        final ThumbhashPlaceholderControllerListener this$0;

                        {
                           super(2, var2x);
                           this.this$0 = var1;
                        }

                        public final Continuation<Unit> create(Object var1, Continuation<?> var2) {
                           return new <anonymous constructor>(this.this$0, var2);
                        }

                        public final Object invoke(CoroutineScope var1, Continuation<? super Bitmap> var2x) {
                           return (this.create(var1, var2x) as <unrepresentable>).invokeSuspend(Unit.a);
                        }

                        public final Object invokeSuspend(Object var1) {
                           b.f();
                           if (this.label == 0) {
                              kotlin.c.b(var1);
                              return ThumbhashUtils.thumbHashToRGBA(
                                 Base64.decode(ThumbhashPlaceholderControllerListener.access$getPlaceholder$p(this.this$0), 0)
                              );
                           } else {
                              throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                           }
                        }
                     };
                     this.L$0 = var1;
                     this.label = 1;
                     var4 = gu.g.g(var5, (Function2)var4, this);
                     if (var4 === var3x) {
                        return var3x;
                     }

                     var3x = var1;
                  }

                  val var7: Bitmap = var4 as Bitmap;
                  if (!kotlinx.coroutines.i.i((CoroutineScope)var3x)) {
                     return Unit.a;
                  } else {
                     var3x = ThumbhashPlaceholderControllerListener.access$getDraweeView$p(this.this$0).getContext().getResources();
                     (ThumbhashPlaceholderControllerListener.access$getDraweeView$p(this.this$0).getHierarchy() as GenericDraweeHierarchy)
                        .z(new BitmapDrawable((Resources)var3x, var7));
                     return Unit.a;
                  }
               }
            },
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
