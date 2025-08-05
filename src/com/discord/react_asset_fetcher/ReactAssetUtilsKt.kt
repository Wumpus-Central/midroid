package com.discord.react_asset_fetcher

import G9.b
import android.content.Context
import android.graphics.BitmapFactory
import android.graphics.drawable.BitmapDrawable
import android.graphics.drawable.Drawable
import android.graphics.drawable.ShapeDrawable
import android.graphics.drawable.shapes.RectShape
import android.webkit.URLUtil
import com.discord.misc.utilities.coroutines.CoroutineViewUtilsKt
import com.facebook.drawee.view.SimpleDraweeView
import com.facebook.react.views.imagehelper.ImageSource
import com.facebook.react.views.imagehelper.ResourceDrawableIdHelper
import com.google.android.material.button.MaterialButton
import ib.K
import ib.f
import java.net.HttpURLConnection
import java.net.URL
import java.net.URLConnection
import kotlin.coroutines.Continuation
import kotlin.jvm.functions.Function2
import kotlin.jvm.internal.r
import kotlinx.coroutines.CoroutineDispatcher
import kotlinx.coroutines.CoroutineScope

public fun Context.getReactImageUrl(assetUrl: String): String {
   r.h(var0, "<this>");
   r.h(var1, "assetUrl");
   val var2: java.lang.String = new ImageSource(var0, var1, 0.0, 0.0, null, false, 60, null).getUri().toString();
   r.g(var2, "toString(...)");
   return var2;
}

public fun Context.inflateUrl(url: String?): String? {
   r.h(var0, "<this>");
   if (var1 == null) {
      var1 = null;
   } else if (!URLUtil.isNetworkUrl(var1)) {
      var1 = getReactImageUrl(var0, var1);
   }

   return var1;
}

public fun SimpleDraweeView.setOptionalReactImageUrl(url: String?) {
   r.h(var0, "<this>");
   if (var1 != null && !h.c0(var1)) {
      var0.setVisibility(0);
      setReactImageUrl(var0, var1);
   } else {
      var0.setVisibility(8);
      var0.setImageURI(null);
   }
}

public fun SimpleDraweeView.setReactAsset(asset: ReactAsset) {
   r.h(var0, "<this>");
   r.h(var1, "asset");
   val var2: Context = var0.getContext();
   r.g(var2, "getContext(...)");
   setReactImageUrl(var0, var1.getUri(var2));
}

public fun MaterialButton.setReactIcon(assetUrl: String, iconSize: Int) {
   r.h(var0, "<this>");
   r.h(var1, "assetUrl");
   var0.setIconSize(var2);
   val var3: ShapeDrawable = new ShapeDrawable(new RectShape());
   var3.getPaint().setColor(0);
   var0.setIcon(var3);
   f.d(CoroutineViewUtilsKt.getAttachedScope(var0), null, null, new Function2(var0, var1, null) {
      final java.lang.String $assetUrl;
      final MaterialButton $this_setReactIcon;
      Object L$0;
      int label;

      {
         super(2, var3);
         this.$this_setReactIcon = var1;
         this.$assetUrl = var2x;
      }

      public final Continuation create(Object var1, Continuation var2) {
         return new <anonymous constructor>(this.$this_setReactIcon, this.$assetUrl, var2);
      }

      public final Object invoke(CoroutineScope var1, Continuation var2x) {
         return (this.create(var1, var2x) as <unrepresentable>).invokeSuspend(Unit.a);
      }

      public final Object invokeSuspend(Object var1) {
         var var4: MaterialButton = (MaterialButton)b.e();
         var var3: Any;
         if (this.label != 0) {
            if (this.label != 1) {
               throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }

            var4 = this.L$0 as MaterialButton;
            c.b(var1);
            var3 = var1;
         } else {
            c.b(var1);
            var1 = this.$this_setReactIcon;
            val var5: CoroutineDispatcher = K.b();
            var3 = new Function2(this.$this_setReactIcon, this.$assetUrl, null) {
               final java.lang.String $assetUrl;
               final MaterialButton $this_setReactIcon;
               int label;

               {
                  super(2, var3x);
                  this.$this_setReactIcon = var1;
                  this.$assetUrl = var2x;
               }

               public final Continuation create(Object var1, Continuation var2) {
                  return new <anonymous constructor>(this.$this_setReactIcon, this.$assetUrl, var2);
               }

               public final Object invoke(CoroutineScope var1, Continuation var2x) {
                  return (this.create(var1, var2x) as <unrepresentable>).invokeSuspend(Unit.a);
               }

               public final Object invokeSuspend(Object var1) {
                  b.e();
                  if (this.label == 0) {
                     c.b(var1);
                     var1 = this.$this_setReactIcon.getContext();
                     r.g(var1, "getContext(...)");
                     val var2x: ImageSource = new ImageSource(var1, this.$assetUrl, 0.0, 0.0, null, false, 60, null);
                     var1 = this.$this_setReactIcon;
                     if (var2x.isResource()) {
                        val var3: ResourceDrawableIdHelper = ResourceDrawableIdHelper.Companion.getInstance();
                        val var6: Context = var1.getContext();
                        r.g(var6, "getContext(...)");
                        var1 = var3.getResourceDrawable(var6, var2x.getSource());
                        r.e(var1);
                     } else if (r.c(var2x.getUri().getScheme(), "file")) {
                        var1 = Drawable.createFromPath(var2x.getUri().getPath());
                        r.e(var1);
                     } else {
                        val var8: URLConnection = new URL(var2x.getSource()).openConnection();
                        r.f(var8, "null cannot be cast to non-null type java.net.HttpURLConnection");
                        val var9: HttpURLConnection = var8 as HttpURLConnection;
                        (var8 as HttpURLConnection).connect();
                        var1 = new BitmapDrawable(var1.getResources(), BitmapFactory.decodeStream(var9.getInputStream()));
                     }

                     return var1;
                  } else {
                     throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                  }
               }
            };
            this.L$0 = var1;
            this.label = 1;
            var3 = f.g(var5, (Function2)var3, this);
            if (var3 === var4) {
               return var4;
            }

            var4 = var1;
         }

         var4.setIcon(var3 as Drawable);
         return Unit.a;
      }
   }, 3, null);
}

public fun SimpleDraweeView.setReactImageUrl(assetUrl: String) {
   r.h(var0, "<this>");
   r.h(var1, "assetUrl");
   val var2: Context = var0.getContext();
   r.g(var2, "getContext(...)");
   var0.setImageURI(getReactImageUrl(var2, var1));
}
