package com.discord.image.fresco.tiled

import android.content.res.Resources
import android.graphics.Shader.TileMode
import android.graphics.drawable.Animatable
import android.view.MotionEvent
import com.facebook.common.references.CloseableReference
import com.facebook.drawee.generic.GenericDraweeHierarchy
import com.facebook.drawee.interfaces.DraweeController
import com.facebook.drawee.interfaces.DraweeHierarchy
import kk.f
import kk.m1
import kk.n0
import kotlin.coroutines.Continuation
import kotlin.jvm.functions.Function2
import kotlin.jvm.internal.r
import kotlinx.coroutines.CompletableJob
import kotlinx.coroutines.CoroutineScope
import kotlinx.coroutines.g
import kotlinx.coroutines.v
import u5.c

public class TiledDraweeController(resources: Resources, url: String, tileMode: TileMode = TileMode.REPEAT) : DraweeController {
   private final val resources: Resources
   private final val url: String
   private final val tileMode: TileMode
   private final val job: CompletableJob
   private final val scope: CoroutineScope
   private final var myImageReference: CloseableReference<c>?
   private final var hierarchy: GenericDraweeHierarchy?
   private final var contentDescription: String?

   init {
      r.h(var1, "resources");
      r.h(var2, "url");
      r.h(var3, "tileMode");
      super();
      this.resources = var1;
      this.url = var2;
      this.tileMode = var3;
      val var4: CompletableJob = m1.b(null, 1, null);
      this.job = var4;
      this.scope = g.a(var4.N0(n0.c().I1()));
   }

   private fun load() {
      f.d(
         this.scope,
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

   public open fun getAnimatable(): Animatable {
      throw new UnsupportedOperationException();
   }

   public open fun getContentDescription(): String? {
      return this.contentDescription;
   }

   public open fun getHierarchy(): DraweeHierarchy? {
      return this.hierarchy;
   }

   public open fun isSameImageRequest(other: DraweeController?): Boolean {
      var var3: Boolean = var1 is TiledDraweeController;
      var var6: java.lang.String = null;
      val var7: TiledDraweeController;
      if (var3) {
         var7 = var1 as TiledDraweeController;
      } else {
         var7 = null;
      }

      if (var7 != null) {
         var6 = var7.url;
      }

      val var5: Boolean = r.c(var6, this.url);
      var3 = false;
      if (var5) {
         val var2: Boolean;
         if (this.myImageReference != null && this.myImageReference.r0()) {
            var2 = true;
         } else {
            var2 = false;
         }

         var3 = false;
         if (var2) {
            var3 = true;
         }
      }

      return var3;
   }

   public open fun onAttach() {
      this.load();
   }

   public open fun onDetach() {
      if (this.hierarchy != null) {
         this.hierarchy.reset();
      }

      if (this.myImageReference != null) {
         this.myImageReference.close();
      }

      this.myImageReference = null;
      v.i(this.job, null, 1, null);
   }

   public open fun onTouchEvent(event: MotionEvent?): Boolean {
      return false;
   }

   public open fun onViewportVisibilityHint(isVisibleInViewportHint: Boolean) {
   }

   public open fun setContentDescription(contentDescription: String?) {
      this.contentDescription = var1;
   }

   public open fun setHierarchy(hierarchy: DraweeHierarchy?) {
      val var2: GenericDraweeHierarchy;
      if (var1 != null) {
         var2 = var1 as GenericDraweeHierarchy;
      } else {
         var2 = null;
      }

      this.hierarchy = var2;
   }
}
