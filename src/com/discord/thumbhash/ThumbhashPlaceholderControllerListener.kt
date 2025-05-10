package com.discord.thumbhash

import X9.K
import X9.f
import android.graphics.Bitmap
import android.graphics.drawable.BitmapDrawable
import android.graphics.drawable.Drawable
import android.util.Base64
import com.discord.image.fresco.listeners.ControllerListener
import com.discord.misc.utilities.coroutines.CoroutineViewUtilsKt
import com.facebook.drawee.generic.GenericDraweeHierarchy
import com.facebook.drawee.view.SimpleDraweeView
import kotlin.coroutines.Continuation
import kotlin.jvm.functions.Function2
import kotlin.jvm.internal.q
import kotlinx.coroutines.CoroutineDispatcher
import kotlinx.coroutines.CoroutineScope
import kotlinx.coroutines.g
import o8.s
import v8.b

public class ThumbhashPlaceholderControllerListener(draweeView: SimpleDraweeView, background: Drawable, placeholder: String?, placeholderVersion: Int?)
   : ControllerListener {
   private final val background: Drawable
   private final val draweeView: SimpleDraweeView
   private final val placeholder: String?
   private final val placeholderVersion: Int?

   init {
      q.h(var1, "draweeView");
      q.h(var2, "background");
      super();
      this.draweeView = var1;
      this.background = var2;
      this.placeholder = var3;
      this.placeholderVersion = var4;
   }

   public override fun onFailure(id: String?, throwable: Throwable?) {
      (this.draweeView.getHierarchy() as GenericDraweeHierarchy).v(this.background);
   }

   public override fun onSubmit(id: String?, callerContext: Any?) {
      (this.draweeView.getHierarchy() as GenericDraweeHierarchy).A(null);
      if (!Companion.canDisplay(this.placeholder, this.placeholderVersion)) {
         (this.draweeView.getHierarchy() as GenericDraweeHierarchy).v(this.background);
      } else {
         (this.draweeView.getHierarchy() as GenericDraweeHierarchy).v(null);
         f.d(
            CoroutineViewUtilsKt.getAttachedScope(this.draweeView),
            null,
            null,
            new Function2(this, null) {
               private Object L$0;
               int label;
               final ThumbhashPlaceholderControllerListener this$0;

               {
                  super(2, var2x);
                  this.this$0 = var1;
               }

               public final Continuation create(Object var1, Continuation var2) {
                  val var3: Function2 = new <anonymous constructor>(this.this$0, var2);
                  var3.L$0 = var1;
                  return var3;
               }

               public final Object invoke(CoroutineScope var1, Continuation var2x) {
                  return (this.create(var1, var2x) as <unrepresentable>).invokeSuspend(Unit.a);
               }

               public final Object invokeSuspend(Object var1) {
                  val var4: Any = b.e();
                  val var3x: CoroutineScope;
                  if (this.label != 0) {
                     if (this.label != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                     }

                     var3x = this.L$0 as CoroutineScope;
                     s.b(var1);
                  } else {
                     s.b(var1);
                     var3x = this.L$0 as CoroutineScope;
                     var1 = K.a();
                     val var5: Function2 = new Function2(this.this$0, null) {
                        int label;
                        final ThumbhashPlaceholderControllerListener this$0;

                        {
                           super(2, var2x);
                           this.this$0 = var1;
                        }

                        public final Continuation create(Object var1, Continuation var2) {
                           return new <anonymous constructor>(this.this$0, var2);
                        }

                        public final Object invoke(CoroutineScope var1, Continuation var2x) {
                           return (this.create(var1, var2x) as <unrepresentable>).invokeSuspend(Unit.a);
                        }

                        public final Object invokeSuspend(Object var1) {
                           b.e();
                           if (this.label == 0) {
                              s.b(var1);
                              return ThumbhashUtils.thumbHashToRGBA(
                                 Base64.decode(ThumbhashPlaceholderControllerListener.access$getPlaceholder$p(this.this$0), 0)
                              );
                           } else {
                              throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                           }
                        }
                     };
                     this.L$0 = var3x;
                     this.label = 1;
                     var1 = (CoroutineDispatcher)f.g(var1, var5, this);
                     if (var1 === var4) {
                        return var4;
                     }
                  }

                  val var7: Bitmap = var1 as Bitmap;
                  if (!g.i(var3x)) {
                     return Unit.a;
                  } else {
                     (ThumbhashPlaceholderControllerListener.access$getDraweeView$p(this.this$0).getHierarchy() as GenericDraweeHierarchy)
                        .A(new BitmapDrawable(ThumbhashPlaceholderControllerListener.access$getDraweeView$p(this.this$0).getContext().getResources(), var7));
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
