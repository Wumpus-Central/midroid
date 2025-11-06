package com.discord.react_asset_fetcher

import android.content.Context
import android.content.res.Resources
import android.graphics.Bitmap
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
import gu.m0
import java.net.HttpURLConnection
import java.net.URL
import java.net.URLConnection
import kotlin.coroutines.Continuation
import kotlin.coroutines.CoroutineContext
import kotlin.jvm.functions.Function2
import kotlinx.coroutines.CoroutineScope
import ot.b

public fun Context.getReactImageUrl(assetUrl: String): String {
   val var2: java.lang.String = new ImageSource(var0, var1, 0.0, 0.0, null, false, 60, null).getUri().toString();
   return var2;
}

public fun Context.inflateUrl(url: String?): String? {
   if (var1 == null) {
      return null;
   } else {
      return if (URLUtil.isNetworkUrl(var1)) var1 else getReactImageUrl(var0, var1);
   }
}

public fun SimpleDraweeView.setOptionalReactImageUrl(url: String?) {
   if (var1 != null && !StringsKt.i0(var1)) {
      var0.setVisibility(0);
      setReactImageUrl(var0, var1);
   } else {
      var0.setVisibility(8);
      var0.setImageURI(null);
   }
}

public fun SimpleDraweeView.setReactAsset(asset: ReactAsset) {
   val var2: Context = var0.getContext();
   setReactImageUrl(var0, var1.getUri(var2));
}

public fun MaterialButton.setReactIcon(assetUrl: String, iconSize: Int) {
   var0.setIconSize(var2);
   val var3: ShapeDrawable = new ShapeDrawable(new RectShape());
   var3.getPaint().setColor(0);
   var0.setIcon(var3);
   gu.g.d(CoroutineViewUtilsKt.getAttachedScope(var0), null, null, new Function2<CoroutineScope, Continuation<? super Unit>, Object>(var0, var1, null) {
      final java.lang.String $assetUrl;
      final MaterialButton $this_setReactIcon;
      Object L$0;
      int label;

      {
         super(2, var3);
         this.$this_setReactIcon = var1;
         this.$assetUrl = var2x;
      }

      public final Continuation<Unit> create(Object var1, Continuation<?> var2) {
         return new <anonymous constructor>(this.$this_setReactIcon, this.$assetUrl, var2);
      }

      public final Object invoke(CoroutineScope var1, Continuation<? super Unit> var2x) {
         return (this.create(var1, var2x) as <unrepresentable>).invokeSuspend(Unit.a);
      }

      public final Object invokeSuspend(Object var1) {
         var var4: MaterialButton = (MaterialButton)b.f();
         var var3: Any;
         if (this.label != 0) {
            if (this.label != 1) {
               throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }

            var4 = this.L$0 as MaterialButton;
            kotlin.c.b(var1);
            var3 = var1;
         } else {
            kotlin.c.b(var1);
            var1 = this.$this_setReactIcon;
            var3 = m0.b();
            val var5: Function2 = new Function2<CoroutineScope, Continuation<? super Drawable>, Object>(this.$this_setReactIcon, this.$assetUrl, null) {
               final java.lang.String $assetUrl;
               final MaterialButton $this_setReactIcon;
               int label;

               {
                  super(2, var3x);
                  this.$this_setReactIcon = var1;
                  this.$assetUrl = var2x;
               }

               public final Continuation<Unit> create(Object var1, Continuation<?> var2) {
                  return new <anonymous constructor>(this.$this_setReactIcon, this.$assetUrl, var2);
               }

               public final Object invoke(CoroutineScope var1, Continuation<? super Drawable> var2x) {
                  return (this.create(var1, var2x) as <unrepresentable>).invokeSuspend(Unit.a);
               }

               public final Object invokeSuspend(Object var1) {
                  b.f();
                  if (this.label == 0) {
                     kotlin.c.b(var1);
                     var1 = this.$this_setReactIcon.getContext();
                     val var2x: ImageSource = new ImageSource(var1, this.$assetUrl, 0.0, 0.0, null, false, 60, null);
                     val var5: MaterialButton = this.$this_setReactIcon;
                     if (var2x.isResource()) {
                        val var3: ResourceDrawableIdHelper = ResourceDrawableIdHelper.Companion.getInstance();
                        var1 = var5.getContext();
                        val var9: Drawable = var3.getResourceDrawable(var1, var2x.getSource());
                        return var9;
                     } else if (var2x.getUri().getScheme() == "file") {
                        val var7: Drawable = Drawable.createFromPath(var2x.getUri().getPath());
                        return var7;
                     } else {
                        val var10: URLConnection = new URL(var2x.getSource()).openConnection();
                        val var11: HttpURLConnection = var10 as HttpURLConnection;
                        (var10 as HttpURLConnection).connect();
                        val var12: Bitmap = BitmapFactory.decodeStream(var11.getInputStream());
                        val var6: Resources = var5.getResources();
                        return new BitmapDrawable(var6, var12);
                     }
                  } else {
                     throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                  }
               }
            };
            this.L$0 = var1;
            this.label = 1;
            var3 = gu.g.g((CoroutineContext)var3, var5, this);
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
   val var2: Context = var0.getContext();
   var0.setImageURI(getReactImageUrl(var2, var1));
}
