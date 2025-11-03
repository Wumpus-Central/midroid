package com.discord.image.fresco.tiled

import android.content.res.Resources
import android.graphics.Shader.TileMode
import android.graphics.drawable.Animatable
import android.view.MotionEvent
import com.facebook.common.references.CloseableReference
import com.facebook.drawee.generic.GenericDraweeHierarchy
import com.facebook.drawee.interfaces.DraweeController
import com.facebook.drawee.interfaces.DraweeHierarchy
import gu.g
import gu.j1
import gu.m0
import kotlin.coroutines.Continuation
import kotlin.jvm.functions.Function2
import kotlin.jvm.internal.SourceDebugExtension
import kotlinx.coroutines.CompletableJob
import kotlinx.coroutines.CoroutineScope
import kotlinx.coroutines.i
import kotlinx.coroutines.z
import xb.e

@SourceDebugExtension(["SMAP\nTiledDraweeController.kt\nKotlin\n*S Kotlin\n*F\n+ 1 TiledDraweeController.kt\ncom/discord/image/fresco/tiled/TiledDraweeController\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,107:1\n1#2:108\n*E\n"])
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
      this.resources = var1;
      this.url = var2;
      this.tileMode = var3;
      val var4: CompletableJob = j1.b(null, 1, null);
      this.job = var4;
      this.scope = i.a(var4.Q0(m0.c().a2()));
   }

   private fun load() {
      g.d(
         this.scope,
         null,
         null,
         new Function2<CoroutineScope, Continuation<? super Unit>, Object>(this, null)// $VF: Couldn't be decompiled
   // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
   // java.lang.NullPointerException: Cannot invoke "org.jetbrains.java.decompiler.modules.decompiler.stats.Statement.getVarDefinitions()" because "stat" is null
   //   at org.jetbrains.java.decompiler.modules.decompiler.vars.VarDefinitionHelper.iterateClashingNames(VarDefinitionHelper.java:1468)
   //   at org.jetbrains.java.decompiler.modules.decompiler.vars.VarDefinitionHelper.iterateClashingExprent(VarDefinitionHelper.java:1679)
   //   at org.jetbrains.java.decompiler.modules.decompiler.vars.VarDefinitionHelper.iterateClashingNames(VarDefinitionHelper.java:1496)
   //   at org.jetbrains.java.decompiler.modules.decompiler.vars.VarDefinitionHelper.iterateClashingNames(VarDefinitionHelper.java:1545)
   //   at org.jetbrains.java.decompiler.modules.decompiler.vars.VarDefinitionHelper.remapClashingNames(VarDefinitionHelper.java:1458)
   //   at org.jetbrains.java.decompiler.modules.decompiler.vars.VarProcessor.rerunClashing(VarProcessor.java:99)
   //   at org.jetbrains.java.decompiler.main.ClassWriter.invokeProcessors(ClassWriter.java:118)
   //   at org.jetbrains.java.decompiler.main.ClassWriter.writeClass(ClassWriter.java:352)
   //   at org.jetbrains.java.decompiler.modules.decompiler.exps.NewExprent.toJava(NewExprent.java:407)
   //   at org.jetbrains.java.decompiler.modules.decompiler.ExprProcessor.getCastedExprent(ExprProcessor.java:1014)
   //   at org.jetbrains.java.decompiler.modules.decompiler.exps.InvocationExprent.appendParamList(InvocationExprent.java:1153)
   //   at org.jetbrains.java.decompiler.modules.decompiler.exps.InvocationExprent.toJava(InvocationExprent.java:904)
   //   at org.jetbrains.java.decompiler.modules.decompiler.ExprProcessor.listToJava(ExprProcessor.java:891)
   //   at org.jetbrains.java.decompiler.modules.decompiler.stats.BasicBlockStatement.toJava(BasicBlockStatement.java:91)
   //   at org.jetbrains.java.decompiler.modules.decompiler.stats.RootStatement.toJava(RootStatement.java:36)
   ,
         3,
         null
      );
   }

   public override fun getAnimatable(): Animatable {
      throw new UnsupportedOperationException();
   }

   public open fun getContentDescription(): String? {
      return this.contentDescription;
   }

   public override fun getHierarchy(): DraweeHierarchy? {
      return this.hierarchy;
   }

   public override fun isSameImageRequest(other: DraweeController?): Boolean {
      label22: {
         val var2: Boolean = var1 is TiledDraweeController;
         var var3: java.lang.String = null;
         val var4: TiledDraweeController;
         if (var2) {
            var4 = var1 as TiledDraweeController;
         } else {
            var4 = null;
         }

         if (var4 != null) {
            var3 = var4.url;
         }

         return var3 == this.url && this.myImageReference != null && this.myImageReference.B0();
      }
   }

   public override fun onAttach() {
      this.load();
   }

   public override fun onDetach() {
      if (this.hierarchy != null) {
         this.hierarchy.reset();
      }

      if (this.myImageReference != null) {
         this.myImageReference.close();
      }

      this.myImageReference = null;
      z.i(this.job, null, 1, null);
   }

   public override fun onTouchEvent(event: MotionEvent?): Boolean {
      return false;
   }

   public open fun onViewportVisibilityHint(isVisibleInViewportHint: Boolean) {
   }

   public open fun setContentDescription(contentDescription: String?) {
      this.contentDescription = var1;
   }

   public override fun setHierarchy(hierarchy: DraweeHierarchy?) {
      val var2: GenericDraweeHierarchy;
      if (var1 != null) {
         var2 = var1 as GenericDraweeHierarchy;
      } else {
         var2 = null;
      }

      this.hierarchy = var2;
   }
}
