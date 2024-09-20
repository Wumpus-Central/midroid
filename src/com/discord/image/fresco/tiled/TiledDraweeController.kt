package com.discord.image.fresco.tiled

import android.content.res.Resources
import android.graphics.Shader.TileMode
import android.graphics.drawable.Animatable
import android.view.MotionEvent
import com.facebook.common.references.CloseableReference
import com.facebook.drawee.generic.GenericDraweeHierarchy
import com.facebook.drawee.interfaces.DraweeController
import com.facebook.drawee.interfaces.DraweeHierarchy
import i6.e
import kotlin.jvm.functions.Function2
import kotlin.jvm.internal.q
import kotlinx.coroutines.CompletableJob
import kotlinx.coroutines.CoroutineScope
import kotlinx.coroutines.g
import kotlinx.coroutines.v
import vk.f
import vk.j1
import vk.k0

public class TiledDraweeController(resources: Resources, url: String, tileMode: TileMode = TileMode.REPEAT) : DraweeController {
   private final val resources: Resources
   private final val url: String
   private final val tileMode: TileMode
   private final val job: CompletableJob
   private final val scope: CoroutineScope
   private final var myImageReference: CloseableReference<e>?
   private final var hierarchy: GenericDraweeHierarchy?
   private final var contentDescription: String?

   init {
      q.h(var1, "resources");
      q.h(var2, "url");
      q.h(var3, "tileMode");
      super();
      this.resources = var1;
      this.url = var2;
      this.tileMode = var3;
      val var4: CompletableJob = j1.b(null, 1, null);
      this.job = var4;
      this.scope = g.a(var4.Q(k0.c().Z1()));
   }

   private fun load() {
      f.d(
         this.scope,
         null,
         null,
         new Function2(this, null)// $VF: Couldn't be decompiled
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
      label27: {
         val var2: Boolean = var1 is TiledDraweeController;
         var var4: java.lang.String = null;
         val var5: TiledDraweeController;
         if (var2) {
            var5 = var1 as TiledDraweeController;
         } else {
            var5 = null;
         }

         if (var5 != null) {
            var4 = var5.url;
         }

         return q.c(var4, this.url) && this.myImageReference != null && this.myImageReference.i1();
      }
   }

   public open fun onAttach() {
      this.load();
   }

   public open fun onDetach() {
      if (this.hierarchy != null) {
         this.hierarchy.a();
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
