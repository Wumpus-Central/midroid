package com.discord.media.utils

import android.annotation.SuppressLint
import android.content.ContentResolver
import android.content.Context
import android.graphics.Bitmap.CompressFormat
import android.net.Uri
import com.discord.crash_reporting.CrashReporting
import id.zelory.compressor.constraint.Compression
import java.io.File
import kh.s
import kh.w
import kotlin.coroutines.Continuation
import kotlin.coroutines.jvm.internal.d
import kotlin.jvm.functions.Function1
import kotlin.jvm.functions.Function2
import kotlin.jvm.internal.q
import lh.r
import sg.e
import sg.g
import sk.f
import sk.k0

public class MediaResolver(context: Context, onProgress: (Uri, Int) -> Unit) {
   private final val context: Context
   private final val onProgress: (Uri, Int) -> Unit
   private final val cacheDir: File

   private final val resolver: ContentResolver
      private final get() {
         val var1: ContentResolver = this.context.getContentResolver();
         q.g(var1, "getContentResolver(...)");
         return var1;
      }


   private final val requestId: String
      private final get() {
         val var2: java.lang.String = var1.toString();
         q.g(var2, "toString(...)");
         return var2;
      }


   init {
      q.h(var1, "context");
      q.h(var2, "onProgress");
      super();
      this.context = var1;
      this.onProgress = var2;
      this.cacheDir = var1.getCacheDir();
   }

   @SuppressLint(["UsableSpace"])
   private suspend fun checkFreeSpace() {
      val var2: Any = f.g(
         k0.b(),
         new Function2(this, null)// $VF: Couldn't be decompiled
   // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
   // java.lang.StackOverflowError
   //   at org.jetbrains.java.decompiler.modules.decompiler.exps.Exprent.getAllExprents(Exprent.java:130)
   //   at org.jetbrains.java.decompiler.modules.decompiler.exps.Exprent.getAllExprents(Exprent.java:119)
   //   at org.jetbrains.java.decompiler.modules.decompiler.vars.VarDefinitionHelper.iterateClashingNames(VarDefinitionHelper.java:1488)
   //   at org.jetbrains.java.decompiler.modules.decompiler.vars.VarDefinitionHelper.iterateClashingNames(VarDefinitionHelper.java:1541)
   //   at org.jetbrains.java.decompiler.modules.decompiler.vars.VarDefinitionHelper.iterateClashingExprent(VarDefinitionHelper.java:1672)
   //   at org.jetbrains.java.decompiler.modules.decompiler.vars.VarDefinitionHelper.iterateClashingNames(VarDefinitionHelper.java:1492)
   //   at org.jetbrains.java.decompiler.modules.decompiler.vars.VarDefinitionHelper.iterateClashingNames(VarDefinitionHelper.java:1541)
   //   at org.jetbrains.java.decompiler.modules.decompiler.vars.VarDefinitionHelper.iterateClashingExprent(VarDefinitionHelper.java:1672)
   //   at org.jetbrains.java.decompiler.modules.decompiler.vars.VarDefinitionHelper.iterateClashingNames(VarDefinitionHelper.java:1492)
   //   at org.jetbrains.java.decompiler.modules.decompiler.vars.VarDefinitionHelper.iterateClashingNames(VarDefinitionHelper.java:1541)
   //   at org.jetbrains.java.decompiler.modules.decompiler.vars.VarDefinitionHelper.iterateClashingExprent(VarDefinitionHelper.java:1672)
   //   at org.jetbrains.java.decompiler.modules.decompiler.vars.VarDefinitionHelper.iterateClashingNames(VarDefinitionHelper.java:1492)
   //   at org.jetbrains.java.decompiler.modules.decompiler.vars.VarDefinitionHelper.iterateClashingNames(VarDefinitionHelper.java:1541)
   //   at org.jetbrains.java.decompiler.modules.decompiler.vars.VarDefinitionHelper.iterateClashingExprent(VarDefinitionHelper.java:1672)
   //   at org.jetbrains.java.decompiler.modules.decompiler.vars.VarDefinitionHelper.iterateClashingNames(VarDefinitionHelper.java:1492)
   //   at org.jetbrains.java.decompiler.modules.decompiler.vars.VarDefinitionHelper.iterateClashingNames(VarDefinitionHelper.java:1541)
   //   at org.jetbrains.java.decompiler.modules.decompiler.vars.VarDefinitionHelper.iterateClashingExprent(VarDefinitionHelper.java:1672)
   //   at org.jetbrains.java.decompiler.modules.decompiler.vars.VarDefinitionHelper.iterateClashingNames(VarDefinitionHelper.java:1492)
   //   at org.jetbrains.java.decompiler.modules.decompiler.vars.VarDefinitionHelper.iterateClashingNames(VarDefinitionHelper.java:1541)
   //   at org.jetbrains.java.decompiler.modules.decompiler.vars.VarDefinitionHelper.iterateClashingExprent(VarDefinitionHelper.java:1672)
   //   at org.jetbrains.java.decompiler.modules.decompiler.vars.VarDefinitionHelper.iterateClashingNames(VarDefinitionHelper.java:1492)
   //   at org.jetbrains.java.decompiler.modules.decompiler.vars.VarDefinitionHelper.iterateClashingNames(VarDefinitionHelper.java:1541)
   //   at org.jetbrains.java.decompiler.modules.decompiler.vars.VarDefinitionHelper.iterateClashingExprent(VarDefinitionHelper.java:1672)
   //   at org.jetbrains.java.decompiler.modules.decompiler.vars.VarDefinitionHelper.iterateClashingNames(VarDefinitionHelper.java:1492)
   //   at org.jetbrains.java.decompiler.modules.decompiler.vars.VarDefinitionHelper.iterateClashingNames(VarDefinitionHelper.java:1541)
   //   at org.jetbrains.java.decompiler.modules.decompiler.vars.VarDefinitionHelper.iterateClashingExprent(VarDefinitionHelper.java:1672)
   //   at org.jetbrains.java.decompiler.modules.decompiler.vars.VarDefinitionHelper.iterateClashingNames(VarDefinitionHelper.java:1492)
   //   at org.jetbrains.java.decompiler.modules.decompiler.vars.VarDefinitionHelper.iterateClashingNames(VarDefinitionHelper.java:1541)
   //   at org.jetbrains.java.decompiler.modules.decompiler.vars.VarDefinitionHelper.iterateClashingExprent(VarDefinitionHelper.java:1672)
   //   at org.jetbrains.java.decompiler.modules.decompiler.vars.VarDefinitionHelper.iterateClashingNames(VarDefinitionHelper.java:1492)
   //   at org.jetbrains.java.decompiler.modules.decompiler.vars.VarDefinitionHelper.iterateClashingNames(VarDefinitionHelper.java:1541)
   //   at org.jetbrains.java.decompiler.modules.decompiler.vars.VarDefinitionHelper.iterateClashingExprent(VarDefinitionHelper.java:1672)
   //   at org.jetbrains.java.decompiler.modules.decompiler.vars.VarDefinitionHelper.iterateClashingNames(VarDefinitionHelper.java:1492)
   //   at org.jetbrains.java.decompiler.modules.decompiler.vars.VarDefinitionHelper.iterateClashingNames(VarDefinitionHelper.java:1541)
   //   at org.jetbrains.java.decompiler.modules.decompiler.vars.VarDefinitionHelper.iterateClashingExprent(VarDefinitionHelper.java:1672)
   //   at org.jetbrains.java.decompiler.modules.decompiler.vars.VarDefinitionHelper.iterateClashingNames(VarDefinitionHelper.java:1492)
   //   at org.jetbrains.java.decompiler.modules.decompiler.vars.VarDefinitionHelper.iterateClashingNames(VarDefinitionHelper.java:1541)
   //   at org.jetbrains.java.decompiler.modules.decompiler.vars.VarDefinitionHelper.iterateClashingExprent(VarDefinitionHelper.java:1672)
   //   at org.jetbrains.java.decompiler.modules.decompiler.vars.VarDefinitionHelper.iterateClashingNames(VarDefinitionHelper.java:1492)
   //   at org.jetbrains.java.decompiler.modules.decompiler.vars.VarDefinitionHelper.iterateClashingNames(VarDefinitionHelper.java:1541)
   //   at org.jetbrains.java.decompiler.modules.decompiler.vars.VarDefinitionHelper.iterateClashingExprent(VarDefinitionHelper.java:1672)
   //   at org.jetbrains.java.decompiler.modules.decompiler.vars.VarDefinitionHelper.iterateClashingNames(VarDefinitionHelper.java:1492)
   //   at org.jetbrains.java.decompiler.modules.decompiler.vars.VarDefinitionHelper.iterateClashingNames(VarDefinitionHelper.java:1541)
   //   at org.jetbrains.java.decompiler.modules.decompiler.vars.VarDefinitionHelper.iterateClashingExprent(VarDefinitionHelper.java:1672)
   //   at org.jetbrains.java.decompiler.modules.decompiler.vars.VarDefinitionHelper.iterateClashingNames(VarDefinitionHelper.java:1492)
   //   at org.jetbrains.java.decompiler.modules.decompiler.vars.VarDefinitionHelper.iterateClashingNames(VarDefinitionHelper.java:1541)
   //   at org.jetbrains.java.decompiler.modules.decompiler.vars.VarDefinitionHelper.iterateClashingExprent(VarDefinitionHelper.java:1672)
   //   at org.jetbrains.java.decompiler.modules.decompiler.vars.VarDefinitionHelper.iterateClashingNames(VarDefinitionHelper.java:1492)
   //   at org.jetbrains.java.decompiler.modules.decompiler.vars.VarDefinitionHelper.iterateClashingNames(VarDefinitionHelper.java:1541)
   //   at org.jetbrains.java.decompiler.modules.decompiler.vars.VarDefinitionHelper.iterateClashingExprent(VarDefinitionHelper.java:1672)
   //   at org.jetbrains.java.decompiler.modules.decompiler.vars.VarDefinitionHelper.iterateClashingNames(VarDefinitionHelper.java:1492)
   //   at org.jetbrains.java.decompiler.modules.decompiler.vars.VarDefinitionHelper.iterateClashingNames(VarDefinitionHelper.java:1541)
   //   at org.jetbrains.java.decompiler.modules.decompiler.vars.VarDefinitionHelper.iterateClashingExprent(VarDefinitionHelper.java:1672)
   //   at org.jetbrains.java.decompiler.modules.decompiler.vars.VarDefinitionHelper.iterateClashingNames(VarDefinitionHelper.java:1492)
   //   at org.jetbrains.java.decompiler.modules.decompiler.vars.VarDefinitionHelper.iterateClashingNames(VarDefinitionHelper.java:1541)
   //   at org.jetbrains.java.decompiler.modules.decompiler.vars.VarDefinitionHelper.iterateClashingExprent(VarDefinitionHelper.java:1672)
   //   at org.jetbrains.java.decompiler.modules.decompiler.vars.VarDefinitionHelper.iterateClashingNames(VarDefinitionHelper.java:1492)
   //   at org.jetbrains.java.decompiler.modules.decompiler.vars.VarDefinitionHelper.iterateClashingNames(VarDefinitionHelper.java:1541)
   //   at org.jetbrains.java.decompiler.modules.decompiler.vars.VarDefinitionHelper.iterateClashingExprent(VarDefinitionHelper.java:1672)
   //   at org.jetbrains.java.decompiler.modules.decompiler.vars.VarDefinitionHelper.iterateClashingNames(VarDefinitionHelper.java:1492)
   //   at org.jetbrains.java.decompiler.modules.decompiler.vars.VarDefinitionHelper.iterateClashingNames(VarDefinitionHelper.java:1541)
   //   at org.jetbrains.java.decompiler.modules.decompiler.vars.VarDefinitionHelper.iterateClashingExprent(VarDefinitionHelper.java:1672)
   //   at org.jetbrains.java.decompiler.modules.decompiler.vars.VarDefinitionHelper.iterateClashingNames(VarDefinitionHelper.java:1492)
   //   at org.jetbrains.java.decompiler.modules.decompiler.vars.VarDefinitionHelper.iterateClashingNames(VarDefinitionHelper.java:1541)
   //   at org.jetbrains.java.decompiler.modules.decompiler.vars.VarDefinitionHelper.iterateClashingExprent(VarDefinitionHelper.java:1672)
   //   at org.jetbrains.java.decompiler.modules.decompiler.vars.VarDefinitionHelper.iterateClashingNames(VarDefinitionHelper.java:1492)
   //   at org.jetbrains.java.decompiler.modules.decompiler.vars.VarDefinitionHelper.iterateClashingNames(VarDefinitionHelper.java:1541)
   //   at org.jetbrains.java.decompiler.modules.decompiler.vars.VarDefinitionHelper.iterateClashingExprent(VarDefinitionHelper.java:1672)
   //   at org.jetbrains.java.decompiler.modules.decompiler.vars.VarDefinitionHelper.iterateClashingNames(VarDefinitionHelper.java:1492)
   //   at org.jetbrains.java.decompiler.modules.decompiler.vars.VarDefinitionHelper.iterateClashingNames(VarDefinitionHelper.java:1541)
   //   at org.jetbrains.java.decompiler.modules.decompiler.vars.VarDefinitionHelper.iterateClashingExprent(VarDefinitionHelper.java:1672)
   //   at org.jetbrains.java.decompiler.modules.decompiler.vars.VarDefinitionHelper.iterateClashingNames(VarDefinitionHelper.java:1492)
   //   at org.jetbrains.java.decompiler.modules.decompiler.vars.VarDefinitionHelper.iterateClashingNames(VarDefinitionHelper.java:1541)
   //   at org.jetbrains.java.decompiler.modules.decompiler.vars.VarDefinitionHelper.iterateClashingExprent(VarDefinitionHelper.java:1672)
   //   at org.jetbrains.java.decompiler.modules.decompiler.vars.VarDefinitionHelper.iterateClashingNames(VarDefinitionHelper.java:1492)
   //   at org.jetbrains.java.decompiler.modules.decompiler.vars.VarDefinitionHelper.iterateClashingNames(VarDefinitionHelper.java:1541)
   //   at org.jetbrains.java.decompiler.modules.decompiler.vars.VarDefinitionHelper.iterateClashingExprent(VarDefinitionHelper.java:1672)
   //   at org.jetbrains.java.decompiler.modules.decompiler.vars.VarDefinitionHelper.iterateClashingNames(VarDefinitionHelper.java:1492)
   //   at org.jetbrains.java.decompiler.modules.decompiler.vars.VarDefinitionHelper.iterateClashingNames(VarDefinitionHelper.java:1541)
   //   at org.jetbrains.java.decompiler.modules.decompiler.vars.VarDefinitionHelper.iterateClashingExprent(VarDefinitionHelper.java:1672)
   //   at org.jetbrains.java.decompiler.modules.decompiler.vars.VarDefinitionHelper.iterateClashingNames(VarDefinitionHelper.java:1492)
   //   at org.jetbrains.java.decompiler.modules.decompiler.vars.VarDefinitionHelper.iterateClashingNames(VarDefinitionHelper.java:1541)
   //   at org.jetbrains.java.decompiler.modules.decompiler.vars.VarDefinitionHelper.iterateClashingExprent(VarDefinitionHelper.java:1672)
   //   at org.jetbrains.java.decompiler.modules.decompiler.vars.VarDefinitionHelper.iterateClashingNames(VarDefinitionHelper.java:1492)
   //   at org.jetbrains.java.decompiler.modules.decompiler.vars.VarDefinitionHelper.iterateClashingNames(VarDefinitionHelper.java:1541)
   //   at org.jetbrains.java.decompiler.modules.decompiler.vars.VarDefinitionHelper.iterateClashingExprent(VarDefinitionHelper.java:1672)
   //   at org.jetbrains.java.decompiler.modules.decompiler.vars.VarDefinitionHelper.iterateClashingNames(VarDefinitionHelper.java:1492)
   //   at org.jetbrains.java.decompiler.modules.decompiler.vars.VarDefinitionHelper.iterateClashingNames(VarDefinitionHelper.java:1541)
   //   at org.jetbrains.java.decompiler.modules.decompiler.vars.VarDefinitionHelper.iterateClashingExprent(VarDefinitionHelper.java:1672)
   //   at org.jetbrains.java.decompiler.modules.decompiler.vars.VarDefinitionHelper.iterateClashingNames(VarDefinitionHelper.java:1492)
   //   at org.jetbrains.java.decompiler.modules.decompiler.vars.VarDefinitionHelper.iterateClashingNames(VarDefinitionHelper.java:1541)
   //   at org.jetbrains.java.decompiler.modules.decompiler.vars.VarDefinitionHelper.iterateClashingExprent(VarDefinitionHelper.java:1672)
   //   at org.jetbrains.java.decompiler.modules.decompiler.vars.VarDefinitionHelper.iterateClashingNames(VarDefinitionHelper.java:1492)
   //   at org.jetbrains.java.decompiler.modules.decompiler.vars.VarDefinitionHelper.iterateClashingNames(VarDefinitionHelper.java:1541)
   //   at org.jetbrains.java.decompiler.modules.decompiler.vars.VarDefinitionHelper.iterateClashingExprent(VarDefinitionHelper.java:1672)
   //   at org.jetbrains.java.decompiler.modules.decompiler.vars.VarDefinitionHelper.iterateClashingNames(VarDefinitionHelper.java:1492)
   //   at org.jetbrains.java.decompiler.modules.decompiler.vars.VarDefinitionHelper.iterateClashingNames(VarDefinitionHelper.java:1541)
   //   at org.jetbrains.java.decompiler.modules.decompiler.vars.VarDefinitionHelper.iterateClashingExprent(VarDefinitionHelper.java:1672)
   //   at org.jetbrains.java.decompiler.modules.decompiler.vars.VarDefinitionHelper.iterateClashingNames(VarDefinitionHelper.java:1492)
   //   at org.jetbrains.java.decompiler.modules.decompiler.vars.VarDefinitionHelper.iterateClashingNames(VarDefinitionHelper.java:1541)
   //   at org.jetbrains.java.decompiler.modules.decompiler.vars.VarDefinitionHelper.iterateClashingExprent(VarDefinitionHelper.java:1672)
   //   at org.jetbrains.java.decompiler.modules.decompiler.vars.VarDefinitionHelper.iterateClashingNames(VarDefinitionHelper.java:1492)
   //   at org.jetbrains.java.decompiler.modules.decompiler.vars.VarDefinitionHelper.iterateClashingNames(VarDefinitionHelper.java:1541)
   //   at org.jetbrains.java.decompiler.modules.decompiler.vars.VarDefinitionHelper.iterateClashingExprent(VarDefinitionHelper.java:1672)
   //   at org.jetbrains.java.decompiler.modules.decompiler.vars.VarDefinitionHelper.iterateClashingNames(VarDefinitionHelper.java:1492)
   //   at org.jetbrains.java.decompiler.modules.decompiler.vars.VarDefinitionHelper.iterateClashingNames(VarDefinitionHelper.java:1541)
   //   at org.jetbrains.java.decompiler.modules.decompiler.vars.VarDefinitionHelper.iterateClashingExprent(VarDefinitionHelper.java:1672)
   //   at org.jetbrains.java.decompiler.modules.decompiler.vars.VarDefinitionHelper.iterateClashingNames(VarDefinitionHelper.java:1492)
   //   at org.jetbrains.java.decompiler.modules.decompiler.vars.VarDefinitionHelper.iterateClashingNames(VarDefinitionHelper.java:1541)
   //   at org.jetbrains.java.decompiler.modules.decompiler.vars.VarDefinitionHelper.iterateClashingExprent(VarDefinitionHelper.java:1672)
   //   at org.jetbrains.java.decompiler.modules.decompiler.vars.VarDefinitionHelper.iterateClashingNames(VarDefinitionHelper.java:1492)
   //   at org.jetbrains.java.decompiler.modules.decompiler.vars.VarDefinitionHelper.iterateClashingNames(VarDefinitionHelper.java:1541)
   //   at org.jetbrains.java.decompiler.modules.decompiler.vars.VarDefinitionHelper.iterateClashingExprent(VarDefinitionHelper.java:1672)
   //   at org.jetbrains.java.decompiler.modules.decompiler.vars.VarDefinitionHelper.iterateClashingNames(VarDefinitionHelper.java:1492)
   //   at org.jetbrains.java.decompiler.modules.decompiler.vars.VarDefinitionHelper.iterateClashingNames(VarDefinitionHelper.java:1541)
   //   at org.jetbrains.java.decompiler.modules.decompiler.vars.VarDefinitionHelper.iterateClashingExprent(VarDefinitionHelper.java:1672)
   //   at org.jetbrains.java.decompiler.modules.decompiler.vars.VarDefinitionHelper.iterateClashingNames(VarDefinitionHelper.java:1492)
   //   at org.jetbrains.java.decompiler.modules.decompiler.vars.VarDefinitionHelper.iterateClashingNames(VarDefinitionHelper.java:1541)
   //   at org.jetbrains.java.decompiler.modules.decompiler.vars.VarDefinitionHelper.iterateClashingExprent(VarDefinitionHelper.java:1672)
   //   at org.jetbrains.java.decompiler.modules.decompiler.vars.VarDefinitionHelper.iterateClashingNames(VarDefinitionHelper.java:1492)
   //   at org.jetbrains.java.decompiler.modules.decompiler.vars.VarDefinitionHelper.iterateClashingNames(VarDefinitionHelper.java:1541)
   //   at org.jetbrains.java.decompiler.modules.decompiler.vars.VarDefinitionHelper.iterateClashingExprent(VarDefinitionHelper.java:1672)
   //   at org.jetbrains.java.decompiler.modules.decompiler.vars.VarDefinitionHelper.iterateClashingNames(VarDefinitionHelper.java:1492)
   //   at org.jetbrains.java.decompiler.modules.decompiler.vars.VarDefinitionHelper.iterateClashingNames(VarDefinitionHelper.java:1541)
   //   at org.jetbrains.java.decompiler.modules.decompiler.vars.VarDefinitionHelper.iterateClashingExprent(VarDefinitionHelper.java:1672)
   //   at org.jetbrains.java.decompiler.modules.decompiler.vars.VarDefinitionHelper.iterateClashingNames(VarDefinitionHelper.java:1492)
   //   at org.jetbrains.java.decompiler.modules.decompiler.vars.VarDefinitionHelper.iterateClashingNames(VarDefinitionHelper.java:1541)
   //   at org.jetbrains.java.decompiler.modules.decompiler.vars.VarDefinitionHelper.iterateClashingExprent(VarDefinitionHelper.java:1672)
   //   at org.jetbrains.java.decompiler.modules.decompiler.vars.VarDefinitionHelper.iterateClashingNames(VarDefinitionHelper.java:1492)
   //   at org.jetbrains.java.decompiler.modules.decompiler.vars.VarDefinitionHelper.iterateClashingNames(VarDefinitionHelper.java:1541)
   //   at org.jetbrains.java.decompiler.modules.decompiler.vars.VarDefinitionHelper.iterateClashingExprent(VarDefinitionHelper.java:1672)
   //   at org.jetbrains.java.decompiler.modules.decompiler.vars.VarDefinitionHelper.iterateClashingNames(VarDefinitionHelper.java:1492)
   //   at org.jetbrains.java.decompiler.modules.decompiler.vars.VarDefinitionHelper.iterateClashingNames(VarDefinitionHelper.java:1541)
   //   at org.jetbrains.java.decompiler.modules.decompiler.vars.VarDefinitionHelper.iterateClashingExprent(VarDefinitionHelper.java:1672)
   //   at org.jetbrains.java.decompiler.modules.decompiler.vars.VarDefinitionHelper.iterateClashingNames(VarDefinitionHelper.java:1492)
   //   at org.jetbrains.java.decompiler.modules.decompiler.vars.VarDefinitionHelper.iterateClashingNames(VarDefinitionHelper.java:1541)
   //   at org.jetbrains.java.decompiler.modules.decompiler.vars.VarDefinitionHelper.iterateClashingExprent(VarDefinitionHelper.java:1672)
   //   at org.jetbrains.java.decompiler.modules.decompiler.vars.VarDefinitionHelper.iterateClashingNames(VarDefinitionHelper.java:1492)
   //   at org.jetbrains.java.decompiler.modules.decompiler.vars.VarDefinitionHelper.iterateClashingNames(VarDefinitionHelper.java:1541)
   //   at org.jetbrains.java.decompiler.modules.decompiler.vars.VarDefinitionHelper.iterateClashingExprent(VarDefinitionHelper.java:1672)
   //   at org.jetbrains.java.decompiler.modules.decompiler.vars.VarDefinitionHelper.iterateClashingNames(VarDefinitionHelper.java:1492)
   //   at org.jetbrains.java.decompiler.modules.decompiler.vars.VarDefinitionHelper.iterateClashingNames(VarDefinitionHelper.java:1541)
   //   at org.jetbrains.java.decompiler.modules.decompiler.vars.VarDefinitionHelper.iterateClashingExprent(VarDefinitionHelper.java:1672)
   //   at org.jetbrains.java.decompiler.modules.decompiler.vars.VarDefinitionHelper.iterateClashingNames(VarDefinitionHelper.java:1492)
   //   at org.jetbrains.java.decompiler.modules.decompiler.vars.VarDefinitionHelper.iterateClashingNames(VarDefinitionHelper.java:1541)
   //   at org.jetbrains.java.decompiler.modules.decompiler.vars.VarDefinitionHelper.iterateClashingExprent(VarDefinitionHelper.java:1672)
   //   at org.jetbrains.java.decompiler.modules.decompiler.vars.VarDefinitionHelper.iterateClashingNames(VarDefinitionHelper.java:1492)
   //   at org.jetbrains.java.decompiler.modules.decompiler.vars.VarDefinitionHelper.iterateClashingNames(VarDefinitionHelper.java:1541)
   //   at org.jetbrains.java.decompiler.modules.decompiler.vars.VarDefinitionHelper.iterateClashingExprent(VarDefinitionHelper.java:1672)
   //   at org.jetbrains.java.decompiler.modules.decompiler.vars.VarDefinitionHelper.iterateClashingNames(VarDefinitionHelper.java:1492)
   //   at org.jetbrains.java.decompiler.modules.decompiler.vars.VarDefinitionHelper.iterateClashingNames(VarDefinitionHelper.java:1541)
   //   at org.jetbrains.java.decompiler.modules.decompiler.vars.VarDefinitionHelper.iterateClashingExprent(VarDefinitionHelper.java:1672)
   //   at org.jetbrains.java.decompiler.modules.decompiler.vars.VarDefinitionHelper.iterateClashingNames(VarDefinitionHelper.java:1492)
   //   at org.jetbrains.java.decompiler.modules.decompiler.vars.VarDefinitionHelper.iterateClashingNames(VarDefinitionHelper.java:1541)
   //   at org.jetbrains.java.decompiler.modules.decompiler.vars.VarDefinitionHelper.iterateClashingExprent(VarDefinitionHelper.java:1672)
   //   at org.jetbrains.java.decompiler.modules.decompiler.vars.VarDefinitionHelper.iterateClashingNames(VarDefinitionHelper.java:1492)
   //   at org.jetbrains.java.decompiler.modules.decompiler.vars.VarDefinitionHelper.iterateClashingNames(VarDefinitionHelper.java:1541)
   //   at org.jetbrains.java.decompiler.modules.decompiler.vars.VarDefinitionHelper.iterateClashingExprent(VarDefinitionHelper.java:1672)
   //   at org.jetbrains.java.decompiler.modules.decompiler.vars.VarDefinitionHelper.iterateClashingNames(VarDefinitionHelper.java:1492)
   //   at org.jetbrains.java.decompiler.modules.decompiler.vars.VarDefinitionHelper.iterateClashingNames(VarDefinitionHelper.java:1541)
   //   at org.jetbrains.java.decompiler.modules.decompiler.vars.VarDefinitionHelper.iterateClashingExprent(VarDefinitionHelper.java:1672)
   //   at org.jetbrains.java.decompiler.modules.decompiler.vars.VarDefinitionHelper.iterateClashingNames(VarDefinitionHelper.java:1492)
   //   at org.jetbrains.java.decompiler.modules.decompiler.vars.VarDefinitionHelper.iterateClashingNames(VarDefinitionHelper.java:1541)
   //   at org.jetbrains.java.decompiler.modules.decompiler.vars.VarDefinitionHelper.iterateClashingExprent(VarDefinitionHelper.java:1672)
   //   at org.jetbrains.java.decompiler.modules.decompiler.vars.VarDefinitionHelper.iterateClashingNames(VarDefinitionHelper.java:1492)
   //   at org.jetbrains.java.decompiler.modules.decompiler.vars.VarDefinitionHelper.iterateClashingNames(VarDefinitionHelper.java:1541)
   //   at org.jetbrains.java.decompiler.modules.decompiler.vars.VarDefinitionHelper.iterateClashingExprent(VarDefinitionHelper.java:1672)
   //   at org.jetbrains.java.decompiler.modules.decompiler.vars.VarDefinitionHelper.iterateClashingNames(VarDefinitionHelper.java:1492)
   //   at org.jetbrains.java.decompiler.modules.decompiler.vars.VarDefinitionHelper.iterateClashingNames(VarDefinitionHelper.java:1541)
   //   at org.jetbrains.java.decompiler.modules.decompiler.vars.VarDefinitionHelper.iterateClashingExprent(VarDefinitionHelper.java:1672)
   //   at org.jetbrains.java.decompiler.modules.decompiler.vars.VarDefinitionHelper.iterateClashingNames(VarDefinitionHelper.java:1492)
   //   at org.jetbrains.java.decompiler.modules.decompiler.vars.VarDefinitionHelper.iterateClashingNames(VarDefinitionHelper.java:1541)
   //   at org.jetbrains.java.decompiler.modules.decompiler.vars.VarDefinitionHelper.iterateClashingExprent(VarDefinitionHelper.java:1672)
   //   at org.jetbrains.java.decompiler.modules.decompiler.vars.VarDefinitionHelper.iterateClashingNames(VarDefinitionHelper.java:1492)
   //   at org.jetbrains.java.decompiler.modules.decompiler.vars.VarDefinitionHelper.iterateClashingNames(VarDefinitionHelper.java:1541)
   //   at org.jetbrains.java.decompiler.modules.decompiler.vars.VarDefinitionHelper.iterateClashingExprent(VarDefinitionHelper.java:1672)
   //   at org.jetbrains.java.decompiler.modules.decompiler.vars.VarDefinitionHelper.iterateClashingNames(VarDefinitionHelper.java:1492)
   //   at org.jetbrains.java.decompiler.modules.decompiler.vars.VarDefinitionHelper.iterateClashingNames(VarDefinitionHelper.java:1541)
   //   at org.jetbrains.java.decompiler.modules.decompiler.vars.VarDefinitionHelper.iterateClashingExprent(VarDefinitionHelper.java:1672)
   //   at org.jetbrains.java.decompiler.modules.decompiler.vars.VarDefinitionHelper.iterateClashingNames(VarDefinitionHelper.java:1492)
   //   at org.jetbrains.java.decompiler.modules.decompiler.vars.VarDefinitionHelper.iterateClashingNames(VarDefinitionHelper.java:1541)
   //   at org.jetbrains.java.decompiler.modules.decompiler.vars.VarDefinitionHelper.iterateClashingExprent(VarDefinitionHelper.java:1672)
   //   at org.jetbrains.java.decompiler.modules.decompiler.vars.VarDefinitionHelper.iterateClashingNames(VarDefinitionHelper.java:1492)
   //   at org.jetbrains.java.decompiler.modules.decompiler.vars.VarDefinitionHelper.iterateClashingNames(VarDefinitionHelper.java:1541)
   //   at org.jetbrains.java.decompiler.modules.decompiler.vars.VarDefinitionHelper.iterateClashingExprent(VarDefinitionHelper.java:1672)
   //   at org.jetbrains.java.decompiler.modules.decompiler.vars.VarDefinitionHelper.iterateClashingNames(VarDefinitionHelper.java:1492)
   //   at org.jetbrains.java.decompiler.modules.decompiler.vars.VarDefinitionHelper.iterateClashingNames(VarDefinitionHelper.java:1541)
   //   at org.jetbrains.java.decompiler.modules.decompiler.vars.VarDefinitionHelper.iterateClashingExprent(VarDefinitionHelper.java:1672)
   //   at org.jetbrains.java.decompiler.modules.decompiler.vars.VarDefinitionHelper.iterateClashingNames(VarDefinitionHelper.java:1492)
   //   at org.jetbrains.java.decompiler.modules.decompiler.vars.VarDefinitionHelper.iterateClashingNames(VarDefinitionHelper.java:1541)
   //   at org.jetbrains.java.decompiler.modules.decompiler.vars.VarDefinitionHelper.iterateClashingExprent(VarDefinitionHelper.java:1672)
   //   at org.jetbrains.java.decompiler.modules.decompiler.vars.VarDefinitionHelper.iterateClashingNames(VarDefinitionHelper.java:1492)
   //   at org.jetbrains.java.decompiler.modules.decompiler.vars.VarDefinitionHelper.iterateClashingNames(VarDefinitionHelper.java:1541)
   //   at org.jetbrains.java.decompiler.modules.decompiler.vars.VarDefinitionHelper.iterateClashingExprent(VarDefinitionHelper.java:1672)
   //   at org.jetbrains.java.decompiler.modules.decompiler.vars.VarDefinitionHelper.iterateClashingNames(VarDefinitionHelper.java:1492)
   //   at org.jetbrains.java.decompiler.modules.decompiler.vars.VarDefinitionHelper.iterateClashingNames(VarDefinitionHelper.java:1541)
   //   at org.jetbrains.java.decompiler.modules.decompiler.vars.VarDefinitionHelper.iterateClashingExprent(VarDefinitionHelper.java:1672)
   //   at org.jetbrains.java.decompiler.modules.decompiler.vars.VarDefinitionHelper.iterateClashingNames(VarDefinitionHelper.java:1492)
   //   at org.jetbrains.java.decompiler.modules.decompiler.vars.VarDefinitionHelper.iterateClashingNames(VarDefinitionHelper.java:1541)
   //   at org.jetbrains.java.decompiler.modules.decompiler.vars.VarDefinitionHelper.iterateClashingExprent(VarDefinitionHelper.java:1672)
   //   at org.jetbrains.java.decompiler.modules.decompiler.vars.VarDefinitionHelper.iterateClashingNames(VarDefinitionHelper.java:1492)
   //   at org.jetbrains.java.decompiler.modules.decompiler.vars.VarDefinitionHelper.iterateClashingNames(VarDefinitionHelper.java:1541)
   //   at org.jetbrains.java.decompiler.modules.decompiler.vars.VarDefinitionHelper.iterateClashingExprent(VarDefinitionHelper.java:1672)
   //   at org.jetbrains.java.decompiler.modules.decompiler.vars.VarDefinitionHelper.iterateClashingNames(VarDefinitionHelper.java:1492)
   //   at org.jetbrains.java.decompiler.modules.decompiler.vars.VarDefinitionHelper.iterateClashingNames(VarDefinitionHelper.java:1541)
   //   at org.jetbrains.java.decompiler.modules.decompiler.vars.VarDefinitionHelper.iterateClashingExprent(VarDefinitionHelper.java:1672)
   //   at org.jetbrains.java.decompiler.modules.decompiler.vars.VarDefinitionHelper.iterateClashingNames(VarDefinitionHelper.java:1492)
   //   at org.jetbrains.java.decompiler.modules.decompiler.vars.VarDefinitionHelper.iterateClashingNames(VarDefinitionHelper.java:1541)
   //   at org.jetbrains.java.decompiler.modules.decompiler.vars.VarDefinitionHelper.iterateClashingExprent(VarDefinitionHelper.java:1672)
   //   at org.jetbrains.java.decompiler.modules.decompiler.vars.VarDefinitionHelper.iterateClashingNames(VarDefinitionHelper.java:1492)
   //   at org.jetbrains.java.decompiler.modules.decompiler.vars.VarDefinitionHelper.iterateClashingNames(VarDefinitionHelper.java:1541)
   //   at org.jetbrains.java.decompiler.modules.decompiler.vars.VarDefinitionHelper.iterateClashingExprent(VarDefinitionHelper.java:1672)
   //   at org.jetbrains.java.decompiler.modules.decompiler.vars.VarDefinitionHelper.iterateClashingNames(VarDefinitionHelper.java:1492)
   //   at org.jetbrains.java.decompiler.modules.decompiler.vars.VarDefinitionHelper.iterateClashingNames(VarDefinitionHelper.java:1541)
   //   at org.jetbrains.java.decompiler.modules.decompiler.vars.VarDefinitionHelper.iterateClashingExprent(VarDefinitionHelper.java:1672)
   //   at org.jetbrains.java.decompiler.modules.decompiler.vars.VarDefinitionHelper.iterateClashingNames(VarDefinitionHelper.java:1492)
   //   at org.jetbrains.java.decompiler.modules.decompiler.vars.VarDefinitionHelper.iterateClashingNames(VarDefinitionHelper.java:1541)
   //   at org.jetbrains.java.decompiler.modules.decompiler.vars.VarDefinitionHelper.iterateClashingExprent(VarDefinitionHelper.java:1672)
   //   at org.jetbrains.java.decompiler.modules.decompiler.vars.VarDefinitionHelper.iterateClashingNames(VarDefinitionHelper.java:1492)
   //   at org.jetbrains.java.decompiler.modules.decompiler.vars.VarDefinitionHelper.iterateClashingNames(VarDefinitionHelper.java:1541)
   //   at org.jetbrains.java.decompiler.modules.decompiler.vars.VarDefinitionHelper.iterateClashingExprent(VarDefinitionHelper.java:1672)
   //   at org.jetbrains.java.decompiler.modules.decompiler.vars.VarDefinitionHelper.iterateClashingNames(VarDefinitionHelper.java:1492)
   //   at org.jetbrains.java.decompiler.modules.decompiler.vars.VarDefinitionHelper.iterateClashingNames(VarDefinitionHelper.java:1541)
   //   at org.jetbrains.java.decompiler.modules.decompiler.vars.VarDefinitionHelper.iterateClashingExprent(VarDefinitionHelper.java:1672)
   //   at org.jetbrains.java.decompiler.modules.decompiler.vars.VarDefinitionHelper.iterateClashingNames(VarDefinitionHelper.java:1492)
   //   at org.jetbrains.java.decompiler.modules.decompiler.vars.VarDefinitionHelper.iterateClashingNames(VarDefinitionHelper.java:1541)
   //   at org.jetbrains.java.decompiler.modules.decompiler.vars.VarDefinitionHelper.iterateClashingExprent(VarDefinitionHelper.java:1672)
   //   at org.jetbrains.java.decompiler.modules.decompiler.vars.VarDefinitionHelper.iterateClashingNames(VarDefinitionHelper.java:1492)
   //   at org.jetbrains.java.decompiler.modules.decompiler.vars.VarDefinitionHelper.iterateClashingNames(VarDefinitionHelper.java:1541)
   //   at org.jetbrains.java.decompiler.modules.decompiler.vars.VarDefinitionHelper.iterateClashingExprent(VarDefinitionHelper.java:1672)
   //   at org.jetbrains.java.decompiler.modules.decompiler.vars.VarDefinitionHelper.iterateClashingNames(VarDefinitionHelper.java:1492)
   //   at org.jetbrains.java.decompiler.modules.decompiler.vars.VarDefinitionHelper.iterateClashingNames(VarDefinitionHelper.java:1541)
   //   at org.jetbrains.java.decompiler.modules.decompiler.vars.VarDefinitionHelper.iterateClashingExprent(VarDefinitionHelper.java:1672)
   //   at org.jetbrains.java.decompiler.modules.decompiler.vars.VarDefinitionHelper.iterateClashingNames(VarDefinitionHelper.java:1492)
   //   at org.jetbrains.java.decompiler.modules.decompiler.vars.VarDefinitionHelper.iterateClashingNames(VarDefinitionHelper.java:1541)
   //   at org.jetbrains.java.decompiler.modules.decompiler.vars.VarDefinitionHelper.iterateClashingExprent(VarDefinitionHelper.java:1672)
   //   at org.jetbrains.java.decompiler.modules.decompiler.vars.VarDefinitionHelper.iterateClashingNames(VarDefinitionHelper.java:1492)
   //   at org.jetbrains.java.decompiler.modules.decompiler.vars.VarDefinitionHelper.iterateClashingNames(VarDefinitionHelper.java:1541)
   //   at org.jetbrains.java.decompiler.modules.decompiler.vars.VarDefinitionHelper.iterateClashingExprent(VarDefinitionHelper.java:1672)
   //   at org.jetbrains.java.decompiler.modules.decompiler.vars.VarDefinitionHelper.iterateClashingNames(VarDefinitionHelper.java:1492)
   //   at org.jetbrains.java.decompiler.modules.decompiler.vars.VarDefinitionHelper.iterateClashingNames(VarDefinitionHelper.java:1541)
   //   at org.jetbrains.java.decompiler.modules.decompiler.vars.VarDefinitionHelper.iterateClashingExprent(VarDefinitionHelper.java:1672)
   //   at org.jetbrains.java.decompiler.modules.decompiler.vars.VarDefinitionHelper.iterateClashingNames(VarDefinitionHelper.java:1492)
   //   at org.jetbrains.java.decompiler.modules.decompiler.vars.VarDefinitionHelper.iterateClashingNames(VarDefinitionHelper.java:1541)
   //   at org.jetbrains.java.decompiler.modules.decompiler.vars.VarDefinitionHelper.iterateClashingExprent(VarDefinitionHelper.java:1672)
   //   at org.jetbrains.java.decompiler.modules.decompiler.vars.VarDefinitionHelper.iterateClashingNames(VarDefinitionHelper.java:1492)
   //   at org.jetbrains.java.decompiler.modules.decompiler.vars.VarDefinitionHelper.iterateClashingNames(VarDefinitionHelper.java:1541)
   //   at org.jetbrains.java.decompiler.modules.decompiler.vars.VarDefinitionHelper.iterateClashingExprent(VarDefinitionHelper.java:1672)
   //   at org.jetbrains.java.decompiler.modules.decompiler.vars.VarDefinitionHelper.iterateClashingNames(VarDefinitionHelper.java:1492)
   //   at org.jetbrains.java.decompiler.modules.decompiler.vars.VarDefinitionHelper.iterateClashingNames(VarDefinitionHelper.java:1541)
   //   at org.jetbrains.java.decompiler.modules.decompiler.vars.VarDefinitionHelper.iterateClashingExprent(VarDefinitionHelper.java:1672)
   //   at org.jetbrains.java.decompiler.modules.decompiler.vars.VarDefinitionHelper.iterateClashingNames(VarDefinitionHelper.java:1492)
   //   at org.jetbrains.java.decompiler.modules.decompiler.vars.VarDefinitionHelper.iterateClashingNames(VarDefinitionHelper.java:1541)
   //   at org.jetbrains.java.decompiler.modules.decompiler.vars.VarDefinitionHelper.iterateClashingExprent(VarDefinitionHelper.java:1672)
   //   at org.jetbrains.java.decompiler.modules.decompiler.vars.VarDefinitionHelper.iterateClashingNames(VarDefinitionHelper.java:1492)
   //   at org.jetbrains.java.decompiler.modules.decompiler.vars.VarDefinitionHelper.iterateClashingNames(VarDefinitionHelper.java:1541)
   //   at org.jetbrains.java.decompiler.modules.decompiler.vars.VarDefinitionHelper.iterateClashingExprent(VarDefinitionHelper.java:1672)
   //   at org.jetbrains.java.decompiler.modules.decompiler.vars.VarDefinitionHelper.iterateClashingNames(VarDefinitionHelper.java:1492)
   //   at org.jetbrains.java.decompiler.modules.decompiler.vars.VarDefinitionHelper.iterateClashingNames(VarDefinitionHelper.java:1541)
   //   at org.jetbrains.java.decompiler.modules.decompiler.vars.VarDefinitionHelper.iterateClashingExprent(VarDefinitionHelper.java:1672)
   //   at org.jetbrains.java.decompiler.modules.decompiler.vars.VarDefinitionHelper.iterateClashingNames(VarDefinitionHelper.java:1492)
   //   at org.jetbrains.java.decompiler.modules.decompiler.vars.VarDefinitionHelper.iterateClashingNames(VarDefinitionHelper.java:1541)
   //   at org.jetbrains.java.decompiler.modules.decompiler.vars.VarDefinitionHelper.iterateClashingExprent(VarDefinitionHelper.java:1672)
   //   at org.jetbrains.java.decompiler.modules.decompiler.vars.VarDefinitionHelper.iterateClashingNames(VarDefinitionHelper.java:1492)
   //   at org.jetbrains.java.decompiler.modules.decompiler.vars.VarDefinitionHelper.iterateClashingNames(VarDefinitionHelper.java:1541)
   //   at org.jetbrains.java.decompiler.modules.decompiler.vars.VarDefinitionHelper.iterateClashingExprent(VarDefinitionHelper.java:1672)
   //   at org.jetbrains.java.decompiler.modules.decompiler.vars.VarDefinitionHelper.iterateClashingNames(VarDefinitionHelper.java:1492)
   //   at org.jetbrains.java.decompiler.modules.decompiler.vars.VarDefinitionHelper.iterateClashingNames(VarDefinitionHelper.java:1541)
   //   at org.jetbrains.java.decompiler.modules.decompiler.vars.VarDefinitionHelper.iterateClashingExprent(VarDefinitionHelper.java:1672)
   //   at org.jetbrains.java.decompiler.modules.decompiler.vars.VarDefinitionHelper.iterateClashingNames(VarDefinitionHelper.java:1492)
   //   at org.jetbrains.java.decompiler.modules.decompiler.vars.VarDefinitionHelper.iterateClashingNames(VarDefinitionHelper.java:1541)
   //   at org.jetbrains.java.decompiler.modules.decompiler.vars.VarDefinitionHelper.iterateClashingExprent(VarDefinitionHelper.java:1672)
   //   at org.jetbrains.java.decompiler.modules.decompiler.vars.VarDefinitionHelper.iterateClashingNames(VarDefinitionHelper.java:1492)
   //   at org.jetbrains.java.decompiler.modules.decompiler.vars.VarDefinitionHelper.iterateClashingNames(VarDefinitionHelper.java:1541)
   //   at org.jetbrains.java.decompiler.modules.decompiler.vars.VarDefinitionHelper.iterateClashingExprent(VarDefinitionHelper.java:1672)
   //   at org.jetbrains.java.decompiler.modules.decompiler.vars.VarDefinitionHelper.iterateClashingNames(VarDefinitionHelper.java:1492)
   //   at org.jetbrains.java.decompiler.modules.decompiler.vars.VarDefinitionHelper.iterateClashingNames(VarDefinitionHelper.java:1541)
   //   at org.jetbrains.java.decompiler.modules.decompiler.vars.VarDefinitionHelper.iterateClashingExprent(VarDefinitionHelper.java:1672)
   //   at org.jetbrains.java.decompiler.modules.decompiler.vars.VarDefinitionHelper.iterateClashingNames(VarDefinitionHelper.java:1492)
   //   at org.jetbrains.java.decompiler.modules.decompiler.vars.VarDefinitionHelper.iterateClashingNames(VarDefinitionHelper.java:1541)
   //   at org.jetbrains.java.decompiler.modules.decompiler.vars.VarDefinitionHelper.iterateClashingExprent(VarDefinitionHelper.java:1672)
   //   at org.jetbrains.java.decompiler.modules.decompiler.vars.VarDefinitionHelper.iterateClashingNames(VarDefinitionHelper.java:1492)
   //   at org.jetbrains.java.decompiler.modules.decompiler.vars.VarDefinitionHelper.iterateClashingNames(VarDefinitionHelper.java:1541)
   //   at org.jetbrains.java.decompiler.modules.decompiler.vars.VarDefinitionHelper.iterateClashingExprent(VarDefinitionHelper.java:1672)
   //   at org.jetbrains.java.decompiler.modules.decompiler.vars.VarDefinitionHelper.iterateClashingNames(VarDefinitionHelper.java:1492)
   //   at org.jetbrains.java.decompiler.modules.decompiler.vars.VarDefinitionHelper.iterateClashingNames(VarDefinitionHelper.java:1541)
   //   at org.jetbrains.java.decompiler.modules.decompiler.vars.VarDefinitionHelper.iterateClashingExprent(VarDefinitionHelper.java:1672)
   //   at org.jetbrains.java.decompiler.modules.decompiler.vars.VarDefinitionHelper.iterateClashingNames(VarDefinitionHelper.java:1492)
   //   at org.jetbrains.java.decompiler.modules.decompiler.vars.VarDefinitionHelper.iterateClashingNames(VarDefinitionHelper.java:1541)
   //   at org.jetbrains.java.decompiler.modules.decompiler.vars.VarDefinitionHelper.iterateClashingExprent(VarDefinitionHelper.java:1672)
   //   at org.jetbrains.java.decompiler.modules.decompiler.vars.VarDefinitionHelper.iterateClashingNames(VarDefinitionHelper.java:1492)
   //   at org.jetbrains.java.decompiler.modules.decompiler.vars.VarDefinitionHelper.iterateClashingNames(VarDefinitionHelper.java:1541)
   //   at org.jetbrains.java.decompiler.modules.decompiler.vars.VarDefinitionHelper.iterateClashingExprent(VarDefinitionHelper.java:1672)
   //   at org.jetbrains.java.decompiler.modules.decompiler.vars.VarDefinitionHelper.iterateClashingNames(VarDefinitionHelper.java:1492)
   //   at org.jetbrains.java.decompiler.modules.decompiler.vars.VarDefinitionHelper.iterateClashingNames(VarDefinitionHelper.java:1541)
   //   at org.jetbrains.java.decompiler.modules.decompiler.vars.VarDefinitionHelper.iterateClashingExprent(VarDefinitionHelper.java:1672)
   //   at org.jetbrains.java.decompiler.modules.decompiler.vars.VarDefinitionHelper.iterateClashingNames(VarDefinitionHelper.java:1492)
   //   at org.jetbrains.java.decompiler.modules.decompiler.vars.VarDefinitionHelper.iterateClashingNames(VarDefinitionHelper.java:1541)
   //   at org.jetbrains.java.decompiler.modules.decompiler.vars.VarDefinitionHelper.iterateClashingExprent(VarDefinitionHelper.java:1672)
   //   at org.jetbrains.java.decompiler.modules.decompiler.vars.VarDefinitionHelper.iterateClashingNames(VarDefinitionHelper.java:1492)
   //   at org.jetbrains.java.decompiler.modules.decompiler.vars.VarDefinitionHelper.iterateClashingNames(VarDefinitionHelper.java:1541)
   //   at org.jetbrains.java.decompiler.modules.decompiler.vars.VarDefinitionHelper.iterateClashingExprent(VarDefinitionHelper.java:1672)
   //   at org.jetbrains.java.decompiler.modules.decompiler.vars.VarDefinitionHelper.iterateClashingNames(VarDefinitionHelper.java:1492)
   //   at org.jetbrains.java.decompiler.modules.decompiler.vars.VarDefinitionHelper.iterateClashingNames(VarDefinitionHelper.java:1541)
   //   at org.jetbrains.java.decompiler.modules.decompiler.vars.VarDefinitionHelper.iterateClashingExprent(VarDefinitionHelper.java:1672)
   //   at org.jetbrains.java.decompiler.modules.decompiler.vars.VarDefinitionHelper.iterateClashingNames(VarDefinitionHelper.java:1492)
   //   at org.jetbrains.java.decompiler.modules.decompiler.vars.VarDefinitionHelper.iterateClashingNames(VarDefinitionHelper.java:1541)
   //   at org.jetbrains.java.decompiler.modules.decompiler.vars.VarDefinitionHelper.iterateClashingExprent(VarDefinitionHelper.java:1672)
   //   at org.jetbrains.java.decompiler.modules.decompiler.vars.VarDefinitionHelper.iterateClashingNames(VarDefinitionHelper.java:1492)
   //   at org.jetbrains.java.decompiler.modules.decompiler.vars.VarDefinitionHelper.iterateClashingNames(VarDefinitionHelper.java:1541)
   //   at org.jetbrains.java.decompiler.modules.decompiler.vars.VarDefinitionHelper.iterateClashingExprent(VarDefinitionHelper.java:1672)
   //   at org.jetbrains.java.decompiler.modules.decompiler.vars.VarDefinitionHelper.iterateClashingNames(VarDefinitionHelper.java:1492)
   //   at org.jetbrains.java.decompiler.modules.decompiler.vars.VarDefinitionHelper.iterateClashingNames(VarDefinitionHelper.java:1541)
   //   at org.jetbrains.java.decompiler.modules.decompiler.vars.VarDefinitionHelper.iterateClashingExprent(VarDefinitionHelper.java:1672)
   //   at org.jetbrains.java.decompiler.modules.decompiler.vars.VarDefinitionHelper.iterateClashingNames(VarDefinitionHelper.java:1492)
   //   at org.jetbrains.java.decompiler.modules.decompiler.vars.VarDefinitionHelper.iterateClashingNames(VarDefinitionHelper.java:1541)
   //   at org.jetbrains.java.decompiler.modules.decompiler.vars.VarDefinitionHelper.iterateClashingExprent(VarDefinitionHelper.java:1672)
   //   at org.jetbrains.java.decompiler.modules.decompiler.vars.VarDefinitionHelper.iterateClashingNames(VarDefinitionHelper.java:1492)
   //   at org.jetbrains.java.decompiler.modules.decompiler.vars.VarDefinitionHelper.iterateClashingNames(VarDefinitionHelper.java:1541)
   //   at org.jetbrains.java.decompiler.modules.decompiler.vars.VarDefinitionHelper.iterateClashingExprent(VarDefinitionHelper.java:1672)
   //   at org.jetbrains.java.decompiler.modules.decompiler.vars.VarDefinitionHelper.iterateClashingNames(VarDefinitionHelper.java:1492)
   //   at org.jetbrains.java.decompiler.modules.decompiler.vars.VarDefinitionHelper.iterateClashingNames(VarDefinitionHelper.java:1541)
   //   at org.jetbrains.java.decompiler.modules.decompiler.vars.VarDefinitionHelper.iterateClashingExprent(VarDefinitionHelper.java:1672)
   //   at org.jetbrains.java.decompiler.modules.decompiler.vars.VarDefinitionHelper.iterateClashingNames(VarDefinitionHelper.java:1492)
   //   at org.jetbrains.java.decompiler.modules.decompiler.vars.VarDefinitionHelper.iterateClashingNames(VarDefinitionHelper.java:1541)
   //   at org.jetbrains.java.decompiler.modules.decompiler.vars.VarDefinitionHelper.iterateClashingExprent(VarDefinitionHelper.java:1672)
   //   at org.jetbrains.java.decompiler.modules.decompiler.vars.VarDefinitionHelper.iterateClashingNames(VarDefinitionHelper.java:1492)
   //   at org.jetbrains.java.decompiler.modules.decompiler.vars.VarDefinitionHelper.iterateClashingNames(VarDefinitionHelper.java:1541)
   //   at org.jetbrains.java.decompiler.modules.decompiler.vars.VarDefinitionHelper.iterateClashingExprent(VarDefinitionHelper.java:1672)
   //   at org.jetbrains.java.decompiler.modules.decompiler.vars.VarDefinitionHelper.iterateClashingNames(VarDefinitionHelper.java:1492)
   //   at org.jetbrains.java.decompiler.modules.decompiler.vars.VarDefinitionHelper.iterateClashingNames(VarDefinitionHelper.java:1541)
   //   at org.jetbrains.java.decompiler.modules.decompiler.vars.VarDefinitionHelper.iterateClashingExprent(VarDefinitionHelper.java:1672)
   //   at org.jetbrains.java.decompiler.modules.decompiler.vars.VarDefinitionHelper.iterateClashingNames(VarDefinitionHelper.java:1492)
   //   at org.jetbrains.java.decompiler.modules.decompiler.vars.VarDefinitionHelper.iterateClashingNames(VarDefinitionHelper.java:1541)
   //   at org.jetbrains.java.decompiler.modules.decompiler.vars.VarDefinitionHelper.iterateClashingExprent(VarDefinitionHelper.java:1672)
   //   at org.jetbrains.java.decompiler.modules.decompiler.vars.VarDefinitionHelper.iterateClashingNames(VarDefinitionHelper.java:1492)
   //   at org.jetbrains.java.decompiler.modules.decompiler.vars.VarDefinitionHelper.iterateClashingNames(VarDefinitionHelper.java:1541)
   //   at org.jetbrains.java.decompiler.modules.decompiler.vars.VarDefinitionHelper.iterateClashingExprent(VarDefinitionHelper.java:1672)
   //   at org.jetbrains.java.decompiler.modules.decompiler.vars.VarDefinitionHelper.iterateClashingNames(VarDefinitionHelper.java:1492)
   //   at org.jetbrains.java.decompiler.modules.decompiler.vars.VarDefinitionHelper.iterateClashingNames(VarDefinitionHelper.java:1541)
   //   at org.jetbrains.java.decompiler.modules.decompiler.vars.VarDefinitionHelper.iterateClashingExprent(VarDefinitionHelper.java:1672)
   //   at org.jetbrains.java.decompiler.modules.decompiler.vars.VarDefinitionHelper.iterateClashingNames(VarDefinitionHelper.java:1492)
   //   at org.jetbrains.java.decompiler.modules.decompiler.vars.VarDefinitionHelper.iterateClashingNames(VarDefinitionHelper.java:1541)
   //   at org.jetbrains.java.decompiler.modules.decompiler.vars.VarDefinitionHelper.iterateClashingExprent(VarDefinitionHelper.java:1672)
   //   at org.jetbrains.java.decompiler.modules.decompiler.vars.VarDefinitionHelper.iterateClashingNames(VarDefinitionHelper.java:1492)
   //   at org.jetbrains.java.decompiler.modules.decompiler.vars.VarDefinitionHelper.iterateClashingNames(VarDefinitionHelper.java:1541)
   //   at org.jetbrains.java.decompiler.modules.decompiler.vars.VarDefinitionHelper.iterateClashingExprent(VarDefinitionHelper.java:1672)
   //   at org.jetbrains.java.decompiler.modules.decompiler.vars.VarDefinitionHelper.iterateClashingNames(VarDefinitionHelper.java:1492)
   //   at org.jetbrains.java.decompiler.modules.decompiler.vars.VarDefinitionHelper.iterateClashingNames(VarDefinitionHelper.java:1541)
   //   at org.jetbrains.java.decompiler.modules.decompiler.vars.VarDefinitionHelper.iterateClashingExprent(VarDefinitionHelper.java:1672)
   //   at org.jetbrains.java.decompiler.modules.decompiler.vars.VarDefinitionHelper.iterateClashingNames(VarDefinitionHelper.java:1492)
   //   at org.jetbrains.java.decompiler.modules.decompiler.vars.VarDefinitionHelper.iterateClashingNames(VarDefinitionHelper.java:1541)
   //   at org.jetbrains.java.decompiler.modules.decompiler.vars.VarDefinitionHelper.iterateClashingExprent(VarDefinitionHelper.java:1672)
   //   at org.jetbrains.java.decompiler.modules.decompiler.vars.VarDefinitionHelper.iterateClashingNames(VarDefinitionHelper.java:1492)
   //   at org.jetbrains.java.decompiler.modules.decompiler.vars.VarDefinitionHelper.iterateClashingNames(VarDefinitionHelper.java:1541)
   //   at org.jetbrains.java.decompiler.modules.decompiler.vars.VarDefinitionHelper.iterateClashingExprent(VarDefinitionHelper.java:1672)
   //   at org.jetbrains.java.decompiler.modules.decompiler.vars.VarDefinitionHelper.iterateClashingNames(VarDefinitionHelper.java:1492)
   //   at org.jetbrains.java.decompiler.modules.decompiler.vars.VarDefinitionHelper.iterateClashingNames(VarDefinitionHelper.java:1541)
   //   at org.jetbrains.java.decompiler.modules.decompiler.vars.VarDefinitionHelper.iterateClashingExprent(VarDefinitionHelper.java:1672)
   //   at org.jetbrains.java.decompiler.modules.decompiler.vars.VarDefinitionHelper.iterateClashingNames(VarDefinitionHelper.java:1492)
   //   at org.jetbrains.java.decompiler.modules.decompiler.vars.VarDefinitionHelper.iterateClashingNames(VarDefinitionHelper.java:1541)
   //   at org.jetbrains.java.decompiler.modules.decompiler.vars.VarDefinitionHelper.iterateClashingExprent(VarDefinitionHelper.java:1672)
   //   at org.jetbrains.java.decompiler.modules.decompiler.vars.VarDefinitionHelper.iterateClashingNames(VarDefinitionHelper.java:1492)
   //   at org.jetbrains.java.decompiler.modules.decompiler.vars.VarDefinitionHelper.iterateClashingNames(VarDefinitionHelper.java:1541)
   //   at org.jetbrains.java.decompiler.modules.decompiler.vars.VarDefinitionHelper.iterateClashingExprent(VarDefinitionHelper.java:1672)
   //   at org.jetbrains.java.decompiler.modules.decompiler.vars.VarDefinitionHelper.iterateClashingNames(VarDefinitionHelper.java:1492)
   //   at org.jetbrains.java.decompiler.modules.decompiler.vars.VarDefinitionHelper.iterateClashingNames(VarDefinitionHelper.java:1541)
   //   at org.jetbrains.java.decompiler.modules.decompiler.vars.VarDefinitionHelper.iterateClashingExprent(VarDefinitionHelper.java:1672)
   //   at org.jetbrains.java.decompiler.modules.decompiler.vars.VarDefinitionHelper.iterateClashingNames(VarDefinitionHelper.java:1492)
   //   at org.jetbrains.java.decompiler.modules.decompiler.vars.VarDefinitionHelper.iterateClashingNames(VarDefinitionHelper.java:1541)
   //   at org.jetbrains.java.decompiler.modules.decompiler.vars.VarDefinitionHelper.iterateClashingExprent(VarDefinitionHelper.java:1672)
   //   at org.jetbrains.java.decompiler.modules.decompiler.vars.VarDefinitionHelper.iterateClashingNames(VarDefinitionHelper.java:1492)
   //   at org.jetbrains.java.decompiler.modules.decompiler.vars.VarDefinitionHelper.iterateClashingNames(VarDefinitionHelper.java:1541)
   //   at org.jetbrains.java.decompiler.modules.decompiler.vars.VarDefinitionHelper.iterateClashingExprent(VarDefinitionHelper.java:1672)
   //   at org.jetbrains.java.decompiler.modules.decompiler.vars.VarDefinitionHelper.iterateClashingNames(VarDefinitionHelper.java:1492)
   //   at org.jetbrains.java.decompiler.modules.decompiler.vars.VarDefinitionHelper.iterateClashingNames(VarDefinitionHelper.java:1541)
   //   at org.jetbrains.java.decompiler.modules.decompiler.vars.VarDefinitionHelper.iterateClashingExprent(VarDefinitionHelper.java:1672)
   //   at org.jetbrains.java.decompiler.modules.decompiler.vars.VarDefinitionHelper.iterateClashingNames(VarDefinitionHelper.java:1492)
   //   at org.jetbrains.java.decompiler.modules.decompiler.vars.VarDefinitionHelper.iterateClashingNames(VarDefinitionHelper.java:1541)
   //   at org.jetbrains.java.decompiler.modules.decompiler.vars.VarDefinitionHelper.iterateClashingExprent(VarDefinitionHelper.java:1672)
   //   at org.jetbrains.java.decompiler.modules.decompiler.vars.VarDefinitionHelper.iterateClashingNames(VarDefinitionHelper.java:1492)
   //   at org.jetbrains.java.decompiler.modules.decompiler.vars.VarDefinitionHelper.iterateClashingNames(VarDefinitionHelper.java:1541)
   //   at org.jetbrains.java.decompiler.modules.decompiler.vars.VarDefinitionHelper.iterateClashingExprent(VarDefinitionHelper.java:1672)
   //   at org.jetbrains.java.decompiler.modules.decompiler.vars.VarDefinitionHelper.iterateClashingNames(VarDefinitionHelper.java:1492)
   //   at org.jetbrains.java.decompiler.modules.decompiler.vars.VarDefinitionHelper.iterateClashingNames(VarDefinitionHelper.java:1541)
   //   at org.jetbrains.java.decompiler.modules.decompiler.vars.VarDefinitionHelper.iterateClashingExprent(VarDefinitionHelper.java:1672)
   //   at org.jetbrains.java.decompiler.modules.decompiler.vars.VarDefinitionHelper.iterateClashingNames(VarDefinitionHelper.java:1492)
   //   at org.jetbrains.java.decompiler.modules.decompiler.vars.VarDefinitionHelper.iterateClashingNames(VarDefinitionHelper.java:1541)
   //   at org.jetbrains.java.decompiler.modules.decompiler.vars.VarDefinitionHelper.iterateClashingExprent(VarDefinitionHelper.java:1672)
   //   at org.jetbrains.java.decompiler.modules.decompiler.vars.VarDefinitionHelper.iterateClashingNames(VarDefinitionHelper.java:1492)
   //   at org.jetbrains.java.decompiler.modules.decompiler.vars.VarDefinitionHelper.iterateClashingNames(VarDefinitionHelper.java:1541)
   //   at org.jetbrains.java.decompiler.modules.decompiler.vars.VarDefinitionHelper.iterateClashingExprent(VarDefinitionHelper.java:1672)
   //   at org.jetbrains.java.decompiler.modules.decompiler.vars.VarDefinitionHelper.iterateClashingNames(VarDefinitionHelper.java:1492)
   //   at org.jetbrains.java.decompiler.modules.decompiler.vars.VarDefinitionHelper.iterateClashingNames(VarDefinitionHelper.java:1541)
   //   at org.jetbrains.java.decompiler.modules.decompiler.vars.VarDefinitionHelper.iterateClashingExprent(VarDefinitionHelper.java:1672)
   //   at org.jetbrains.java.decompiler.modules.decompiler.vars.VarDefinitionHelper.iterateClashingNames(VarDefinitionHelper.java:1492)
   //   at org.jetbrains.java.decompiler.modules.decompiler.vars.VarDefinitionHelper.iterateClashingNames(VarDefinitionHelper.java:1541)
   //   at org.jetbrains.java.decompiler.modules.decompiler.vars.VarDefinitionHelper.iterateClashingExprent(VarDefinitionHelper.java:1672)
   //   at org.jetbrains.java.decompiler.modules.decompiler.vars.VarDefinitionHelper.iterateClashingNames(VarDefinitionHelper.java:1492)
   //   at org.jetbrains.java.decompiler.modules.decompiler.vars.VarDefinitionHelper.iterateClashingNames(VarDefinitionHelper.java:1541)
   //   at org.jetbrains.java.decompiler.modules.decompiler.vars.VarDefinitionHelper.iterateClashingExprent(VarDefinitionHelper.java:1672)
   //   at org.jetbrains.java.decompiler.modules.decompiler.vars.VarDefinitionHelper.iterateClashingNames(VarDefinitionHelper.java:1492)
   //   at org.jetbrains.java.decompiler.modules.decompiler.vars.VarDefinitionHelper.iterateClashingNames(VarDefinitionHelper.java:1541)
   //   at org.jetbrains.java.decompiler.modules.decompiler.vars.VarDefinitionHelper.iterateClashingExprent(VarDefinitionHelper.java:1672)
   //   at org.jetbrains.java.decompiler.modules.decompiler.vars.VarDefinitionHelper.iterateClashingNames(VarDefinitionHelper.java:1492)
   //   at org.jetbrains.java.decompiler.modules.decompiler.vars.VarDefinitionHelper.iterateClashingNames(VarDefinitionHelper.java:1541)
   //   at org.jetbrains.java.decompiler.modules.decompiler.vars.VarDefinitionHelper.iterateClashingExprent(VarDefinitionHelper.java:1672)
   //   at org.jetbrains.java.decompiler.modules.decompiler.vars.VarDefinitionHelper.iterateClashingNames(VarDefinitionHelper.java:1492)
   //   at org.jetbrains.java.decompiler.modules.decompiler.vars.VarDefinitionHelper.iterateClashingNames(VarDefinitionHelper.java:1541)
   //   at org.jetbrains.java.decompiler.modules.decompiler.vars.VarDefinitionHelper.iterateClashingExprent(VarDefinitionHelper.java:1672)
   //   at org.jetbrains.java.decompiler.modules.decompiler.vars.VarDefinitionHelper.iterateClashingNames(VarDefinitionHelper.java:1492)
   //   at org.jetbrains.java.decompiler.modules.decompiler.vars.VarDefinitionHelper.iterateClashingNames(VarDefinitionHelper.java:1541)
   //   at org.jetbrains.java.decompiler.modules.decompiler.vars.VarDefinitionHelper.iterateClashingExprent(VarDefinitionHelper.java:1672)
   //   at org.jetbrains.java.decompiler.modules.decompiler.vars.VarDefinitionHelper.iterateClashingNames(VarDefinitionHelper.java:1492)
   //   at org.jetbrains.java.decompiler.modules.decompiler.vars.VarDefinitionHelper.iterateClashingNames(VarDefinitionHelper.java:1541)
   //   at org.jetbrains.java.decompiler.modules.decompiler.vars.VarDefinitionHelper.iterateClashingExprent(VarDefinitionHelper.java:1672)
   //   at org.jetbrains.java.decompiler.modules.decompiler.vars.VarDefinitionHelper.iterateClashingNames(VarDefinitionHelper.java:1492)
   //   at org.jetbrains.java.decompiler.modules.decompiler.vars.VarDefinitionHelper.iterateClashingNames(VarDefinitionHelper.java:1541)
   //   at org.jetbrains.java.decompiler.modules.decompiler.vars.VarDefinitionHelper.iterateClashingExprent(VarDefinitionHelper.java:1672)
   //   at org.jetbrains.java.decompiler.modules.decompiler.vars.VarDefinitionHelper.iterateClashingNames(VarDefinitionHelper.java:1492)
   //   at org.jetbrains.java.decompiler.modules.decompiler.vars.VarDefinitionHelper.iterateClashingNames(VarDefinitionHelper.java:1541)
   //   at org.jetbrains.java.decompiler.modules.decompiler.vars.VarDefinitionHelper.iterateClashingExprent(VarDefinitionHelper.java:1672)
   //   at org.jetbrains.java.decompiler.modules.decompiler.vars.VarDefinitionHelper.iterateClashingNames(VarDefinitionHelper.java:1492)
   //   at org.jetbrains.java.decompiler.modules.decompiler.vars.VarDefinitionHelper.iterateClashingNames(VarDefinitionHelper.java:1541)
   //   at org.jetbrains.java.decompiler.modules.decompiler.vars.VarDefinitionHelper.iterateClashingExprent(VarDefinitionHelper.java:1672)
   //   at org.jetbrains.java.decompiler.modules.decompiler.vars.VarDefinitionHelper.iterateClashingNames(VarDefinitionHelper.java:1492)
   //   at org.jetbrains.java.decompiler.modules.decompiler.vars.VarDefinitionHelper.iterateClashingNames(VarDefinitionHelper.java:1541)
   //   at org.jetbrains.java.decompiler.modules.decompiler.vars.VarDefinitionHelper.iterateClashingExprent(VarDefinitionHelper.java:1672)
   //   at org.jetbrains.java.decompiler.modules.decompiler.vars.VarDefinitionHelper.iterateClashingNames(VarDefinitionHelper.java:1492)
   //   at org.jetbrains.java.decompiler.modules.decompiler.vars.VarDefinitionHelper.iterateClashingNames(VarDefinitionHelper.java:1541)
   //   at org.jetbrains.java.decompiler.modules.decompiler.vars.VarDefinitionHelper.iterateClashingExprent(VarDefinitionHelper.java:1672)
   //   at org.jetbrains.java.decompiler.modules.decompiler.vars.VarDefinitionHelper.iterateClashingNames(VarDefinitionHelper.java:1492)
   //   at org.jetbrains.java.decompiler.modules.decompiler.vars.VarDefinitionHelper.iterateClashingNames(VarDefinitionHelper.java:1541)
   //   at org.jetbrains.java.decompiler.modules.decompiler.vars.VarDefinitionHelper.iterateClashingExprent(VarDefinitionHelper.java:1672)
   //   at org.jetbrains.java.decompiler.modules.decompiler.vars.VarDefinitionHelper.iterateClashingNames(VarDefinitionHelper.java:1492)
   //   at org.jetbrains.java.decompiler.modules.decompiler.vars.VarDefinitionHelper.iterateClashingNames(VarDefinitionHelper.java:1541)
   //   at org.jetbrains.java.decompiler.modules.decompiler.vars.VarDefinitionHelper.iterateClashingExprent(VarDefinitionHelper.java:1672)
   //   at org.jetbrains.java.decompiler.modules.decompiler.vars.VarDefinitionHelper.iterateClashingNames(VarDefinitionHelper.java:1492)
   //   at org.jetbrains.java.decompiler.modules.decompiler.vars.VarDefinitionHelper.iterateClashingNames(VarDefinitionHelper.java:1541)
   //   at org.jetbrains.java.decompiler.modules.decompiler.vars.VarDefinitionHelper.iterateClashingExprent(VarDefinitionHelper.java:1672)
   //   at org.jetbrains.java.decompiler.modules.decompiler.vars.VarDefinitionHelper.iterateClashingNames(VarDefinitionHelper.java:1492)
   //   at org.jetbrains.java.decompiler.modules.decompiler.vars.VarDefinitionHelper.iterateClashingNames(VarDefinitionHelper.java:1541)
   //   at org.jetbrains.java.decompiler.modules.decompiler.vars.VarDefinitionHelper.iterateClashingExprent(VarDefinitionHelper.java:1672)
   //   at org.jetbrains.java.decompiler.modules.decompiler.vars.VarDefinitionHelper.iterateClashingNames(VarDefinitionHelper.java:1492)
   //   at org.jetbrains.java.decompiler.modules.decompiler.vars.VarDefinitionHelper.iterateClashingNames(VarDefinitionHelper.java:1541)
   //   at org.jetbrains.java.decompiler.modules.decompiler.vars.VarDefinitionHelper.iterateClashingExprent(VarDefinitionHelper.java:1672)
   //   at org.jetbrains.java.decompiler.modules.decompiler.vars.VarDefinitionHelper.iterateClashingNames(VarDefinitionHelper.java:1492)
   //   at org.jetbrains.java.decompiler.modules.decompiler.vars.VarDefinitionHelper.iterateClashingNames(VarDefinitionHelper.java:1541)
   //   at org.jetbrains.java.decompiler.modules.decompiler.vars.VarDefinitionHelper.iterateClashingExprent(VarDefinitionHelper.java:1672)
   //   at org.jetbrains.java.decompiler.modules.decompiler.vars.VarDefinitionHelper.iterateClashingNames(VarDefinitionHelper.java:1492)
   //   at org.jetbrains.java.decompiler.modules.decompiler.vars.VarDefinitionHelper.iterateClashingNames(VarDefinitionHelper.java:1541)
   //   at org.jetbrains.java.decompiler.modules.decompiler.vars.VarDefinitionHelper.iterateClashingExprent(VarDefinitionHelper.java:1672)
   //   at org.jetbrains.java.decompiler.modules.decompiler.vars.VarDefinitionHelper.iterateClashingNames(VarDefinitionHelper.java:1492)
   //   at org.jetbrains.java.decompiler.modules.decompiler.vars.VarDefinitionHelper.iterateClashingNames(VarDefinitionHelper.java:1541)
   //   at org.jetbrains.java.decompiler.modules.decompiler.vars.VarDefinitionHelper.iterateClashingExprent(VarDefinitionHelper.java:1672)
   //   at org.jetbrains.java.decompiler.modules.decompiler.vars.VarDefinitionHelper.iterateClashingNames(VarDefinitionHelper.java:1492)
   //   at org.jetbrains.java.decompiler.modules.decompiler.vars.VarDefinitionHelper.iterateClashingNames(VarDefinitionHelper.java:1541)
   //   at org.jetbrains.java.decompiler.modules.decompiler.vars.VarDefinitionHelper.iterateClashingExprent(VarDefinitionHelper.java:1672)
   //   at org.jetbrains.java.decompiler.modules.decompiler.vars.VarDefinitionHelper.iterateClashingNames(VarDefinitionHelper.java:1492)
   //   at org.jetbrains.java.decompiler.modules.decompiler.vars.VarDefinitionHelper.iterateClashingNames(VarDefinitionHelper.java:1541)
   //   at org.jetbrains.java.decompiler.modules.decompiler.vars.VarDefinitionHelper.iterateClashingExprent(VarDefinitionHelper.java:1672)
   //   at org.jetbrains.java.decompiler.modules.decompiler.vars.VarDefinitionHelper.iterateClashingNames(VarDefinitionHelper.java:1492)
   //   at org.jetbrains.java.decompiler.modules.decompiler.vars.VarDefinitionHelper.iterateClashingNames(VarDefinitionHelper.java:1541)
   //   at org.jetbrains.java.decompiler.modules.decompiler.vars.VarDefinitionHelper.iterateClashingExprent(VarDefinitionHelper.java:1672)
   //   at org.jetbrains.java.decompiler.modules.decompiler.vars.VarDefinitionHelper.iterateClashingNames(VarDefinitionHelper.java:1492)
   //   at org.jetbrains.java.decompiler.modules.decompiler.vars.VarDefinitionHelper.iterateClashingNames(VarDefinitionHelper.java:1541)
   //   at org.jetbrains.java.decompiler.modules.decompiler.vars.VarDefinitionHelper.iterateClashingExprent(VarDefinitionHelper.java:1672)
   //   at org.jetbrains.java.decompiler.modules.decompiler.vars.VarDefinitionHelper.iterateClashingNames(VarDefinitionHelper.java:1492)
   //   at org.jetbrains.java.decompiler.modules.decompiler.vars.VarDefinitionHelper.iterateClashingNames(VarDefinitionHelper.java:1541)
   //   at org.jetbrains.java.decompiler.modules.decompiler.vars.VarDefinitionHelper.iterateClashingExprent(VarDefinitionHelper.java:1672)
   //   at org.jetbrains.java.decompiler.modules.decompiler.vars.VarDefinitionHelper.iterateClashingNames(VarDefinitionHelper.java:1492)
   //   at org.jetbrains.java.decompiler.modules.decompiler.vars.VarDefinitionHelper.iterateClashingNames(VarDefinitionHelper.java:1541)
   //   at org.jetbrains.java.decompiler.modules.decompiler.vars.VarDefinitionHelper.iterateClashingExprent(VarDefinitionHelper.java:1672)
   //   at org.jetbrains.java.decompiler.modules.decompiler.vars.VarDefinitionHelper.iterateClashingNames(VarDefinitionHelper.java:1492)
   //   at org.jetbrains.java.decompiler.modules.decompiler.vars.VarDefinitionHelper.iterateClashingNames(VarDefinitionHelper.java:1541)
   //   at org.jetbrains.java.decompiler.modules.decompiler.vars.VarDefinitionHelper.iterateClashingExprent(VarDefinitionHelper.java:1672)
   //   at org.jetbrains.java.decompiler.modules.decompiler.vars.VarDefinitionHelper.iterateClashingNames(VarDefinitionHelper.java:1492)
   //   at org.jetbrains.java.decompiler.modules.decompiler.vars.VarDefinitionHelper.iterateClashingNames(VarDefinitionHelper.java:1541)
   //   at org.jetbrains.java.decompiler.modules.decompiler.vars.VarDefinitionHelper.iterateClashingExprent(VarDefinitionHelper.java:1672)
   //   at org.jetbrains.java.decompiler.modules.decompiler.vars.VarDefinitionHelper.iterateClashingNames(VarDefinitionHelper.java:1492)
   //   at org.jetbrains.java.decompiler.modules.decompiler.vars.VarDefinitionHelper.iterateClashingNames(VarDefinitionHelper.java:1541)
   //   at org.jetbrains.java.decompiler.modules.decompiler.vars.VarDefinitionHelper.iterateClashingExprent(VarDefinitionHelper.java:1672)
   //   at org.jetbrains.java.decompiler.modules.decompiler.vars.VarDefinitionHelper.iterateClashingNames(VarDefinitionHelper.java:1492)
   //   at org.jetbrains.java.decompiler.modules.decompiler.vars.VarDefinitionHelper.iterateClashingNames(VarDefinitionHelper.java:1541)
   //   at org.jetbrains.java.decompiler.modules.decompiler.vars.VarDefinitionHelper.iterateClashingExprent(VarDefinitionHelper.java:1672)
   //   at org.jetbrains.java.decompiler.modules.decompiler.vars.VarDefinitionHelper.iterateClashingNames(VarDefinitionHelper.java:1492)
   //   at org.jetbrains.java.decompiler.modules.decompiler.vars.VarDefinitionHelper.iterateClashingNames(VarDefinitionHelper.java:1541)
   //   at org.jetbrains.java.decompiler.modules.decompiler.vars.VarDefinitionHelper.iterateClashingExprent(VarDefinitionHelper.java:1672)
   //   at org.jetbrains.java.decompiler.modules.decompiler.vars.VarDefinitionHelper.iterateClashingNames(VarDefinitionHelper.java:1492)
   //   at org.jetbrains.java.decompiler.modules.decompiler.vars.VarDefinitionHelper.iterateClashingNames(VarDefinitionHelper.java:1541)
   //   at org.jetbrains.java.decompiler.modules.decompiler.vars.VarDefinitionHelper.iterateClashingExprent(VarDefinitionHelper.java:1672)
   //   at org.jetbrains.java.decompiler.modules.decompiler.vars.VarDefinitionHelper.iterateClashingNames(VarDefinitionHelper.java:1492)
   //   at org.jetbrains.java.decompiler.modules.decompiler.vars.VarDefinitionHelper.iterateClashingNames(VarDefinitionHelper.java:1541)
   //   at org.jetbrains.java.decompiler.modules.decompiler.vars.VarDefinitionHelper.iterateClashingExprent(VarDefinitionHelper.java:1672)
   //   at org.jetbrains.java.decompiler.modules.decompiler.vars.VarDefinitionHelper.iterateClashingNames(VarDefinitionHelper.java:1492)
   //   at org.jetbrains.java.decompiler.modules.decompiler.vars.VarDefinitionHelper.iterateClashingNames(VarDefinitionHelper.java:1541)
   //   at org.jetbrains.java.decompiler.modules.decompiler.vars.VarDefinitionHelper.iterateClashingExprent(VarDefinitionHelper.java:1672)
   //   at org.jetbrains.java.decompiler.modules.decompiler.vars.VarDefinitionHelper.iterateClashingNames(VarDefinitionHelper.java:1492)
   //   at org.jetbrains.java.decompiler.modules.decompiler.vars.VarDefinitionHelper.iterateClashingNames(VarDefinitionHelper.java:1541)
   //   at org.jetbrains.java.decompiler.modules.decompiler.vars.VarDefinitionHelper.iterateClashingExprent(VarDefinitionHelper.java:1672)
   //   at org.jetbrains.java.decompiler.modules.decompiler.vars.VarDefinitionHelper.iterateClashingNames(VarDefinitionHelper.java:1492)
   //   at org.jetbrains.java.decompiler.modules.decompiler.vars.VarDefinitionHelper.iterateClashingNames(VarDefinitionHelper.java:1541)
   //   at org.jetbrains.java.decompiler.modules.decompiler.vars.VarDefinitionHelper.iterateClashingExprent(VarDefinitionHelper.java:1672)
   //   at org.jetbrains.java.decompiler.modules.decompiler.vars.VarDefinitionHelper.iterateClashingNames(VarDefinitionHelper.java:1492)
   //   at org.jetbrains.java.decompiler.modules.decompiler.vars.VarDefinitionHelper.iterateClashingNames(VarDefinitionHelper.java:1541)
   //   at org.jetbrains.java.decompiler.modules.decompiler.vars.VarDefinitionHelper.iterateClashingExprent(VarDefinitionHelper.java:1672)
   //   at org.jetbrains.java.decompiler.modules.decompiler.vars.VarDefinitionHelper.iterateClashingNames(VarDefinitionHelper.java:1492)
   //   at org.jetbrains.java.decompiler.modules.decompiler.vars.VarDefinitionHelper.iterateClashingNames(VarDefinitionHelper.java:1541)
   //   at org.jetbrains.java.decompiler.modules.decompiler.vars.VarDefinitionHelper.iterateClashingExprent(VarDefinitionHelper.java:1672)
   //   at org.jetbrains.java.decompiler.modules.decompiler.vars.VarDefinitionHelper.iterateClashingNames(VarDefinitionHelper.java:1492)
   //   at org.jetbrains.java.decompiler.modules.decompiler.vars.VarDefinitionHelper.iterateClashingNames(VarDefinitionHelper.java:1541)
   //   at org.jetbrains.java.decompiler.modules.decompiler.vars.VarDefinitionHelper.iterateClashingExprent(VarDefinitionHelper.java:1672)
   //   at org.jetbrains.java.decompiler.modules.decompiler.vars.VarDefinitionHelper.iterateClashingNames(VarDefinitionHelper.java:1492)
   //   at org.jetbrains.java.decompiler.modules.decompiler.vars.VarDefinitionHelper.iterateClashingNames(VarDefinitionHelper.java:1541)
   //   at org.jetbrains.java.decompiler.modules.decompiler.vars.VarDefinitionHelper.iterateClashingExprent(VarDefinitionHelper.java:1672)
   //   at org.jetbrains.java.decompiler.modules.decompiler.vars.VarDefinitionHelper.iterateClashingNames(VarDefinitionHelper.java:1492)
   //   at org.jetbrains.java.decompiler.modules.decompiler.vars.VarDefinitionHelper.iterateClashingNames(VarDefinitionHelper.java:1541)
   //   at org.jetbrains.java.decompiler.modules.decompiler.vars.VarDefinitionHelper.iterateClashingExprent(VarDefinitionHelper.java:1672)
   //   at org.jetbrains.java.decompiler.modules.decompiler.vars.VarDefinitionHelper.iterateClashingNames(VarDefinitionHelper.java:1492)
   //   at org.jetbrains.java.decompiler.modules.decompiler.vars.VarDefinitionHelper.iterateClashingNames(VarDefinitionHelper.java:1541)
   //   at org.jetbrains.java.decompiler.modules.decompiler.vars.VarDefinitionHelper.iterateClashingExprent(VarDefinitionHelper.java:1672)
   //   at org.jetbrains.java.decompiler.modules.decompiler.vars.VarDefinitionHelper.iterateClashingNames(VarDefinitionHelper.java:1492)
   //   at org.jetbrains.java.decompiler.modules.decompiler.vars.VarDefinitionHelper.iterateClashingNames(VarDefinitionHelper.java:1541)
   //   at org.jetbrains.java.decompiler.modules.decompiler.vars.VarDefinitionHelper.iterateClashingExprent(VarDefinitionHelper.java:1672)
   //   at org.jetbrains.java.decompiler.modules.decompiler.vars.VarDefinitionHelper.iterateClashingNames(VarDefinitionHelper.java:1492)
   //   at org.jetbrains.java.decompiler.modules.decompiler.vars.VarDefinitionHelper.iterateClashingNames(VarDefinitionHelper.java:1541)
   //   at org.jetbrains.java.decompiler.modules.decompiler.vars.VarDefinitionHelper.iterateClashingExprent(VarDefinitionHelper.java:1672)
   //   at org.jetbrains.java.decompiler.modules.decompiler.vars.VarDefinitionHelper.iterateClashingNames(VarDefinitionHelper.java:1492)
   //   at org.jetbrains.java.decompiler.modules.decompiler.vars.VarDefinitionHelper.iterateClashingNames(VarDefinitionHelper.java:1541)
   //   at org.jetbrains.java.decompiler.modules.decompiler.vars.VarDefinitionHelper.iterateClashingExprent(VarDefinitionHelper.java:1672)
   //   at org.jetbrains.java.decompiler.modules.decompiler.vars.VarDefinitionHelper.iterateClashingNames(VarDefinitionHelper.java:1492)
   //   at org.jetbrains.java.decompiler.modules.decompiler.vars.VarDefinitionHelper.iterateClashingNames(VarDefinitionHelper.java:1541)
   //   at org.jetbrains.java.decompiler.modules.decompiler.vars.VarDefinitionHelper.iterateClashingExprent(VarDefinitionHelper.java:1672)
   //   at org.jetbrains.java.decompiler.modules.decompiler.vars.VarDefinitionHelper.iterateClashingNames(VarDefinitionHelper.java:1492)
   //   at org.jetbrains.java.decompiler.modules.decompiler.vars.VarDefinitionHelper.iterateClashingNames(VarDefinitionHelper.java:1541)
   //   at org.jetbrains.java.decompiler.modules.decompiler.vars.VarDefinitionHelper.iterateClashingExprent(VarDefinitionHelper.java:1672)
   //   at org.jetbrains.java.decompiler.modules.decompiler.vars.VarDefinitionHelper.iterateClashingNames(VarDefinitionHelper.java:1492)
   //   at org.jetbrains.java.decompiler.modules.decompiler.vars.VarDefinitionHelper.iterateClashingNames(VarDefinitionHelper.java:1541)
   //   at org.jetbrains.java.decompiler.modules.decompiler.vars.VarDefinitionHelper.iterateClashingExprent(VarDefinitionHelper.java:1672)
   //   at org.jetbrains.java.decompiler.modules.decompiler.vars.VarDefinitionHelper.iterateClashingNames(VarDefinitionHelper.java:1492)
   //   at org.jetbrains.java.decompiler.modules.decompiler.vars.VarDefinitionHelper.iterateClashingNames(VarDefinitionHelper.java:1541)
   //   at org.jetbrains.java.decompiler.modules.decompiler.vars.VarDefinitionHelper.iterateClashingExprent(VarDefinitionHelper.java:1672)
   //   at org.jetbrains.java.decompiler.modules.decompiler.vars.VarDefinitionHelper.iterateClashingNames(VarDefinitionHelper.java:1492)
   //   at org.jetbrains.java.decompiler.modules.decompiler.vars.VarDefinitionHelper.iterateClashingNames(VarDefinitionHelper.java:1541)
   //   at org.jetbrains.java.decompiler.modules.decompiler.vars.VarDefinitionHelper.iterateClashingExprent(VarDefinitionHelper.java:1672)
   //   at org.jetbrains.java.decompiler.modules.decompiler.vars.VarDefinitionHelper.iterateClashingNames(VarDefinitionHelper.java:1492)
   //   at org.jetbrains.java.decompiler.modules.decompiler.vars.VarDefinitionHelper.iterateClashingNames(VarDefinitionHelper.java:1541)
   //   at org.jetbrains.java.decompiler.modules.decompiler.vars.VarDefinitionHelper.iterateClashingExprent(VarDefinitionHelper.java:1672)
   //   at org.jetbrains.java.decompiler.modules.decompiler.vars.VarDefinitionHelper.iterateClashingNames(VarDefinitionHelper.java:1492)
   //   at org.jetbrains.java.decompiler.modules.decompiler.vars.VarDefinitionHelper.iterateClashingNames(VarDefinitionHelper.java:1541)
   //   at org.jetbrains.java.decompiler.modules.decompiler.vars.VarDefinitionHelper.iterateClashingExprent(VarDefinitionHelper.java:1672)
   //   at org.jetbrains.java.decompiler.modules.decompiler.vars.VarDefinitionHelper.iterateClashingNames(VarDefinitionHelper.java:1492)
   //   at org.jetbrains.java.decompiler.modules.decompiler.vars.VarDefinitionHelper.iterateClashingNames(VarDefinitionHelper.java:1541)
   //   at org.jetbrains.java.decompiler.modules.decompiler.vars.VarDefinitionHelper.iterateClashingExprent(VarDefinitionHelper.java:1672)
   //   at org.jetbrains.java.decompiler.modules.decompiler.vars.VarDefinitionHelper.iterateClashingNames(VarDefinitionHelper.java:1492)
   //   at org.jetbrains.java.decompiler.modules.decompiler.vars.VarDefinitionHelper.iterateClashingNames(VarDefinitionHelper.java:1541)
   //   at org.jetbrains.java.decompiler.modules.decompiler.vars.VarDefinitionHelper.iterateClashingExprent(VarDefinitionHelper.java:1672)
   //   at org.jetbrains.java.decompiler.modules.decompiler.vars.VarDefinitionHelper.iterateClashingNames(VarDefinitionHelper.java:1492)
   //   at org.jetbrains.java.decompiler.modules.decompiler.vars.VarDefinitionHelper.iterateClashingNames(VarDefinitionHelper.java:1541)
   //   at org.jetbrains.java.decompiler.modules.decompiler.vars.VarDefinitionHelper.iterateClashingExprent(VarDefinitionHelper.java:1672)
   //   at org.jetbrains.java.decompiler.modules.decompiler.vars.VarDefinitionHelper.iterateClashingNames(VarDefinitionHelper.java:1492)
   //   at org.jetbrains.java.decompiler.modules.decompiler.vars.VarDefinitionHelper.iterateClashingNames(VarDefinitionHelper.java:1541)
   //   at org.jetbrains.java.decompiler.modules.decompiler.vars.VarDefinitionHelper.iterateClashingExprent(VarDefinitionHelper.java:1672)
   //   at org.jetbrains.java.decompiler.modules.decompiler.vars.VarDefinitionHelper.iterateClashingNames(VarDefinitionHelper.java:1492)
   //   at org.jetbrains.java.decompiler.modules.decompiler.vars.VarDefinitionHelper.iterateClashingNames(VarDefinitionHelper.java:1541)
   //   at org.jetbrains.java.decompiler.modules.decompiler.vars.VarDefinitionHelper.iterateClashingExprent(VarDefinitionHelper.java:1672)
   //   at org.jetbrains.java.decompiler.modules.decompiler.vars.VarDefinitionHelper.iterateClashingNames(VarDefinitionHelper.java:1492)
   //   at org.jetbrains.java.decompiler.modules.decompiler.vars.VarDefinitionHelper.iterateClashingNames(VarDefinitionHelper.java:1541)
   //   at org.jetbrains.java.decompiler.modules.decompiler.vars.VarDefinitionHelper.iterateClashingExprent(VarDefinitionHelper.java:1672)
   //   at org.jetbrains.java.decompiler.modules.decompiler.vars.VarDefinitionHelper.iterateClashingNames(VarDefinitionHelper.java:1492)
   //   at org.jetbrains.java.decompiler.modules.decompiler.vars.VarDefinitionHelper.iterateClashingNames(VarDefinitionHelper.java:1541)
   //   at org.jetbrains.java.decompiler.modules.decompiler.vars.VarDefinitionHelper.iterateClashingExprent(VarDefinitionHelper.java:1672)
   //   at org.jetbrains.java.decompiler.modules.decompiler.vars.VarDefinitionHelper.iterateClashingNames(VarDefinitionHelper.java:1492)
   //   at org.jetbrains.java.decompiler.modules.decompiler.vars.VarDefinitionHelper.iterateClashingNames(VarDefinitionHelper.java:1541)
   //   at org.jetbrains.java.decompiler.modules.decompiler.vars.VarDefinitionHelper.iterateClashingExprent(VarDefinitionHelper.java:1672)
   //   at org.jetbrains.java.decompiler.modules.decompiler.vars.VarDefinitionHelper.iterateClashingNames(VarDefinitionHelper.java:1492)
   //   at org.jetbrains.java.decompiler.modules.decompiler.vars.VarDefinitionHelper.iterateClashingNames(VarDefinitionHelper.java:1541)
   //   at org.jetbrains.java.decompiler.modules.decompiler.vars.VarDefinitionHelper.iterateClashingExprent(VarDefinitionHelper.java:1672)
   //   at org.jetbrains.java.decompiler.modules.decompiler.vars.VarDefinitionHelper.iterateClashingNames(VarDefinitionHelper.java:1492)
   //   at org.jetbrains.java.decompiler.modules.decompiler.vars.VarDefinitionHelper.iterateClashingNames(VarDefinitionHelper.java:1541)
   //   at org.jetbrains.java.decompiler.modules.decompiler.vars.VarDefinitionHelper.iterateClashingExprent(VarDefinitionHelper.java:1672)
   //   at org.jetbrains.java.decompiler.modules.decompiler.vars.VarDefinitionHelper.iterateClashingNames(VarDefinitionHelper.java:1492)
   //   at org.jetbrains.java.decompiler.modules.decompiler.vars.VarDefinitionHelper.iterateClashingNames(VarDefinitionHelper.java:1541)
   //   at org.jetbrains.java.decompiler.modules.decompiler.vars.VarDefinitionHelper.iterateClashingExprent(VarDefinitionHelper.java:1672)
   //   at org.jetbrains.java.decompiler.modules.decompiler.vars.VarDefinitionHelper.iterateClashingNames(VarDefinitionHelper.java:1492)
   //   at org.jetbrains.java.decompiler.modules.decompiler.vars.VarDefinitionHelper.iterateClashingNames(VarDefinitionHelper.java:1541)
   //   at org.jetbrains.java.decompiler.modules.decompiler.vars.VarDefinitionHelper.iterateClashingExprent(VarDefinitionHelper.java:1672)
   //   at org.jetbrains.java.decompiler.modules.decompiler.vars.VarDefinitionHelper.iterateClashingNames(VarDefinitionHelper.java:1492)
   //   at org.jetbrains.java.decompiler.modules.decompiler.vars.VarDefinitionHelper.iterateClashingNames(VarDefinitionHelper.java:1541)
   //   at org.jetbrains.java.decompiler.modules.decompiler.vars.VarDefinitionHelper.iterateClashingExprent(VarDefinitionHelper.java:1672)
   //   at org.jetbrains.java.decompiler.modules.decompiler.vars.VarDefinitionHelper.iterateClashingNames(VarDefinitionHelper.java:1492)
   //   at org.jetbrains.java.decompiler.modules.decompiler.vars.VarDefinitionHelper.iterateClashingNames(VarDefinitionHelper.java:1541)
   //   at org.jetbrains.java.decompiler.modules.decompiler.vars.VarDefinitionHelper.iterateClashingExprent(VarDefinitionHelper.java:1672)
   //   at org.jetbrains.java.decompiler.modules.decompiler.vars.VarDefinitionHelper.iterateClashingNames(VarDefinitionHelper.java:1492)
   //   at org.jetbrains.java.decompiler.modules.decompiler.vars.VarDefinitionHelper.iterateClashingNames(VarDefinitionHelper.java:1541)
   //   at org.jetbrains.java.decompiler.modules.decompiler.vars.VarDefinitionHelper.iterateClashingExprent(VarDefinitionHelper.java:1672)
   //   at org.jetbrains.java.decompiler.modules.decompiler.vars.VarDefinitionHelper.iterateClashingNames(VarDefinitionHelper.java:1492)
   //   at org.jetbrains.java.decompiler.modules.decompiler.vars.VarDefinitionHelper.iterateClashingNames(VarDefinitionHelper.java:1541)
   //   at org.jetbrains.java.decompiler.modules.decompiler.vars.VarDefinitionHelper.iterateClashingExprent(VarDefinitionHelper.java:1672)
   //   at org.jetbrains.java.decompiler.modules.decompiler.vars.VarDefinitionHelper.iterateClashingNames(VarDefinitionHelper.java:1492)
   //   at org.jetbrains.java.decompiler.modules.decompiler.vars.VarDefinitionHelper.iterateClashingNames(VarDefinitionHelper.java:1541)
   //   at org.jetbrains.java.decompiler.modules.decompiler.vars.VarDefinitionHelper.iterateClashingExprent(VarDefinitionHelper.java:1672)
   //   at org.jetbrains.java.decompiler.modules.decompiler.vars.VarDefinitionHelper.iterateClashingNames(VarDefinitionHelper.java:1492)
   //   at org.jetbrains.java.decompiler.modules.decompiler.vars.VarDefinitionHelper.iterateClashingNames(VarDefinitionHelper.java:1541)
   //   at org.jetbrains.java.decompiler.modules.decompiler.vars.VarDefinitionHelper.iterateClashingExprent(VarDefinitionHelper.java:1672)
   //   at org.jetbrains.java.decompiler.modules.decompiler.vars.VarDefinitionHelper.iterateClashingNames(VarDefinitionHelper.java:1492)
   //   at org.jetbrains.java.decompiler.modules.decompiler.vars.VarDefinitionHelper.iterateClashingNames(VarDefinitionHelper.java:1541)
   //   at org.jetbrains.java.decompiler.modules.decompiler.vars.VarDefinitionHelper.iterateClashingExprent(VarDefinitionHelper.java:1672)
   //   at org.jetbrains.java.decompiler.modules.decompiler.vars.VarDefinitionHelper.iterateClashingNames(VarDefinitionHelper.java:1492)
   //   at org.jetbrains.java.decompiler.modules.decompiler.vars.VarDefinitionHelper.iterateClashingNames(VarDefinitionHelper.java:1541)
   //   at org.jetbrains.java.decompiler.modules.decompiler.vars.VarDefinitionHelper.iterateClashingExprent(VarDefinitionHelper.java:1672)
   //   at org.jetbrains.java.decompiler.modules.decompiler.vars.VarDefinitionHelper.iterateClashingNames(VarDefinitionHelper.java:1492)
   //   at org.jetbrains.java.decompiler.modules.decompiler.vars.VarDefinitionHelper.iterateClashingNames(VarDefinitionHelper.java:1541)
   //   at org.jetbrains.java.decompiler.modules.decompiler.vars.VarDefinitionHelper.iterateClashingExprent(VarDefinitionHelper.java:1672)
   //   at org.jetbrains.java.decompiler.modules.decompiler.vars.VarDefinitionHelper.iterateClashingNames(VarDefinitionHelper.java:1492)
   //   at org.jetbrains.java.decompiler.modules.decompiler.vars.VarDefinitionHelper.iterateClashingNames(VarDefinitionHelper.java:1541)
   //   at org.jetbrains.java.decompiler.modules.decompiler.vars.VarDefinitionHelper.iterateClashingExprent(VarDefinitionHelper.java:1672)
   //   at org.jetbrains.java.decompiler.modules.decompiler.vars.VarDefinitionHelper.iterateClashingNames(VarDefinitionHelper.java:1492)
   //   at org.jetbrains.java.decompiler.modules.decompiler.vars.VarDefinitionHelper.iterateClashingNames(VarDefinitionHelper.java:1541)
   //   at org.jetbrains.java.decompiler.modules.decompiler.vars.VarDefinitionHelper.iterateClashingExprent(VarDefinitionHelper.java:1672)
   //   at org.jetbrains.java.decompiler.modules.decompiler.vars.VarDefinitionHelper.iterateClashingNames(VarDefinitionHelper.java:1492)
   //   at org.jetbrains.java.decompiler.modules.decompiler.vars.VarDefinitionHelper.iterateClashingNames(VarDefinitionHelper.java:1541)
   //   at org.jetbrains.java.decompiler.modules.decompiler.vars.VarDefinitionHelper.iterateClashingExprent(VarDefinitionHelper.java:1672)
   //   at org.jetbrains.java.decompiler.modules.decompiler.vars.VarDefinitionHelper.iterateClashingNames(VarDefinitionHelper.java:1492)
   //   at org.jetbrains.java.decompiler.modules.decompiler.vars.VarDefinitionHelper.iterateClashingNames(VarDefinitionHelper.java:1541)
   //   at org.jetbrains.java.decompiler.modules.decompiler.vars.VarDefinitionHelper.iterateClashingExprent(VarDefinitionHelper.java:1672)
   //   at org.jetbrains.java.decompiler.modules.decompiler.vars.VarDefinitionHelper.iterateClashingNames(VarDefinitionHelper.java:1492)
   //   at org.jetbrains.java.decompiler.modules.decompiler.vars.VarDefinitionHelper.iterateClashingNames(VarDefinitionHelper.java:1541)
   //   at org.jetbrains.java.decompiler.modules.decompiler.vars.VarDefinitionHelper.iterateClashingExprent(VarDefinitionHelper.java:1672)
   //   at org.jetbrains.java.decompiler.modules.decompiler.vars.VarDefinitionHelper.iterateClashingNames(VarDefinitionHelper.java:1492)
   //   at org.jetbrains.java.decompiler.modules.decompiler.vars.VarDefinitionHelper.iterateClashingNames(VarDefinitionHelper.java:1541)
   //   at org.jetbrains.java.decompiler.modules.decompiler.vars.VarDefinitionHelper.iterateClashingExprent(VarDefinitionHelper.java:1672)
   //   at org.jetbrains.java.decompiler.modules.decompiler.vars.VarDefinitionHelper.iterateClashingNames(VarDefinitionHelper.java:1492)
   //   at org.jetbrains.java.decompiler.modules.decompiler.vars.VarDefinitionHelper.iterateClashingNames(VarDefinitionHelper.java:1541)
   //   at org.jetbrains.java.decompiler.modules.decompiler.vars.VarDefinitionHelper.iterateClashingExprent(VarDefinitionHelper.java:1672)
   //   at org.jetbrains.java.decompiler.modules.decompiler.vars.VarDefinitionHelper.iterateClashingNames(VarDefinitionHelper.java:1492)
   //   at org.jetbrains.java.decompiler.modules.decompiler.vars.VarDefinitionHelper.iterateClashingNames(VarDefinitionHelper.java:1541)
   //   at org.jetbrains.java.decompiler.modules.decompiler.vars.VarDefinitionHelper.iterateClashingExprent(VarDefinitionHelper.java:1672)
   //   at org.jetbrains.java.decompiler.modules.decompiler.vars.VarDefinitionHelper.iterateClashingNames(VarDefinitionHelper.java:1492)
   //   at org.jetbrains.java.decompiler.modules.decompiler.vars.VarDefinitionHelper.iterateClashingNames(VarDefinitionHelper.java:1541)
   //   at org.jetbrains.java.decompiler.modules.decompiler.vars.VarDefinitionHelper.iterateClashingExprent(VarDefinitionHelper.java:1672)
   //   at org.jetbrains.java.decompiler.modules.decompiler.vars.VarDefinitionHelper.iterateClashingNames(VarDefinitionHelper.java:1492)
   //   at org.jetbrains.java.decompiler.modules.decompiler.vars.VarDefinitionHelper.iterateClashingNames(VarDefinitionHelper.java:1541)
   //   at org.jetbrains.java.decompiler.modules.decompiler.vars.VarDefinitionHelper.iterateClashingExprent(VarDefinitionHelper.java:1672)
   //   at org.jetbrains.java.decompiler.modules.decompiler.vars.VarDefinitionHelper.iterateClashingNames(VarDefinitionHelper.java:1492)
   //   at org.jetbrains.java.decompiler.modules.decompiler.vars.VarDefinitionHelper.iterateClashingNames(VarDefinitionHelper.java:1541)
   //   at org.jetbrains.java.decompiler.modules.decompiler.vars.VarDefinitionHelper.iterateClashingExprent(VarDefinitionHelper.java:1672)
   //   at org.jetbrains.java.decompiler.modules.decompiler.vars.VarDefinitionHelper.iterateClashingNames(VarDefinitionHelper.java:1492)
   //   at org.jetbrains.java.decompiler.modules.decompiler.vars.VarDefinitionHelper.iterateClashingNames(VarDefinitionHelper.java:1541)
   //   at org.jetbrains.java.decompiler.modules.decompiler.vars.VarDefinitionHelper.iterateClashingExprent(VarDefinitionHelper.java:1672)
   //   at org.jetbrains.java.decompiler.modules.decompiler.vars.VarDefinitionHelper.iterateClashingNames(VarDefinitionHelper.java:1492)
   //   at org.jetbrains.java.decompiler.modules.decompiler.vars.VarDefinitionHelper.iterateClashingNames(VarDefinitionHelper.java:1541)
   //   at org.jetbrains.java.decompiler.modules.decompiler.vars.VarDefinitionHelper.iterateClashingExprent(VarDefinitionHelper.java:1672)
   //   at org.jetbrains.java.decompiler.modules.decompiler.vars.VarDefinitionHelper.iterateClashingNames(VarDefinitionHelper.java:1492)
   //   at org.jetbrains.java.decompiler.modules.decompiler.vars.VarDefinitionHelper.iterateClashingNames(VarDefinitionHelper.java:1541)
   //   at org.jetbrains.java.decompiler.modules.decompiler.vars.VarDefinitionHelper.iterateClashingExprent(VarDefinitionHelper.java:1672)
   //   at org.jetbrains.java.decompiler.modules.decompiler.vars.VarDefinitionHelper.iterateClashingNames(VarDefinitionHelper.java:1492)
   //   at org.jetbrains.java.decompiler.modules.decompiler.vars.VarDefinitionHelper.iterateClashingNames(VarDefinitionHelper.java:1541)
   //   at org.jetbrains.java.decompiler.modules.decompiler.vars.VarDefinitionHelper.iterateClashingExprent(VarDefinitionHelper.java:1672)
   //   at org.jetbrains.java.decompiler.modules.decompiler.vars.VarDefinitionHelper.iterateClashingNames(VarDefinitionHelper.java:1492)
   //   at org.jetbrains.java.decompiler.modules.decompiler.vars.VarDefinitionHelper.iterateClashingNames(VarDefinitionHelper.java:1541)
   //   at org.jetbrains.java.decompiler.modules.decompiler.vars.VarDefinitionHelper.iterateClashingExprent(VarDefinitionHelper.java:1672)
   //   at org.jetbrains.java.decompiler.modules.decompiler.vars.VarDefinitionHelper.iterateClashingNames(VarDefinitionHelper.java:1492)
   //   at org.jetbrains.java.decompiler.modules.decompiler.vars.VarDefinitionHelper.iterateClashingNames(VarDefinitionHelper.java:1541)
   //   at org.jetbrains.java.decompiler.modules.decompiler.vars.VarDefinitionHelper.iterateClashingExprent(VarDefinitionHelper.java:1672)
   //   at org.jetbrains.java.decompiler.modules.decompiler.vars.VarDefinitionHelper.iterateClashingNames(VarDefinitionHelper.java:1492)
   //   at org.jetbrains.java.decompiler.modules.decompiler.vars.VarDefinitionHelper.iterateClashingNames(VarDefinitionHelper.java:1541)
   //   at org.jetbrains.java.decompiler.modules.decompiler.vars.VarDefinitionHelper.iterateClashingExprent(VarDefinitionHelper.java:1672)
   //   at org.jetbrains.java.decompiler.modules.decompiler.vars.VarDefinitionHelper.iterateClashingNames(VarDefinitionHelper.java:1492)
   //   at org.jetbrains.java.decompiler.modules.decompiler.vars.VarDefinitionHelper.iterateClashingNames(VarDefinitionHelper.java:1541)
   //   at org.jetbrains.java.decompiler.modules.decompiler.vars.VarDefinitionHelper.iterateClashingExprent(VarDefinitionHelper.java:1672)
   //   at org.jetbrains.java.decompiler.modules.decompiler.vars.VarDefinitionHelper.iterateClashingNames(VarDefinitionHelper.java:1492)
   //   at org.jetbrains.java.decompiler.modules.decompiler.vars.VarDefinitionHelper.iterateClashingNames(VarDefinitionHelper.java:1541)
   //   at org.jetbrains.java.decompiler.modules.decompiler.vars.VarDefinitionHelper.iterateClashingExprent(VarDefinitionHelper.java:1672)
   //   at org.jetbrains.java.decompiler.modules.decompiler.vars.VarDefinitionHelper.iterateClashingNames(VarDefinitionHelper.java:1492)
   //   at org.jetbrains.java.decompiler.modules.decompiler.vars.VarDefinitionHelper.iterateClashingNames(VarDefinitionHelper.java:1541)
   //   at org.jetbrains.java.decompiler.modules.decompiler.vars.VarDefinitionHelper.iterateClashingExprent(VarDefinitionHelper.java:1672)
   //   at org.jetbrains.java.decompiler.modules.decompiler.vars.VarDefinitionHelper.iterateClashingNames(VarDefinitionHelper.java:1492)
   //   at org.jetbrains.java.decompiler.modules.decompiler.vars.VarDefinitionHelper.iterateClashingNames(VarDefinitionHelper.java:1541)
   //   at org.jetbrains.java.decompiler.modules.decompiler.vars.VarDefinitionHelper.iterateClashingExprent(VarDefinitionHelper.java:1672)
   //   at org.jetbrains.java.decompiler.modules.decompiler.vars.VarDefinitionHelper.iterateClashingNames(VarDefinitionHelper.java:1492)
   //   at org.jetbrains.java.decompiler.modules.decompiler.vars.VarDefinitionHelper.iterateClashingNames(VarDefinitionHelper.java:1541)
   //   at org.jetbrains.java.decompiler.modules.decompiler.vars.VarDefinitionHelper.iterateClashingExprent(VarDefinitionHelper.java:1672)
   //   at org.jetbrains.java.decompiler.modules.decompiler.vars.VarDefinitionHelper.iterateClashingNames(VarDefinitionHelper.java:1492)
   //   at org.jetbrains.java.decompiler.modules.decompiler.vars.VarDefinitionHelper.iterateClashingNames(VarDefinitionHelper.java:1541)
   //   at org.jetbrains.java.decompiler.modules.decompiler.vars.VarDefinitionHelper.iterateClashingExprent(VarDefinitionHelper.java:1672)
   //   at org.jetbrains.java.decompiler.modules.decompiler.vars.VarDefinitionHelper.iterateClashingNames(VarDefinitionHelper.java:1492)
   //   at org.jetbrains.java.decompiler.modules.decompiler.vars.VarDefinitionHelper.iterateClashingNames(VarDefinitionHelper.java:1541)
   //   at org.jetbrains.java.decompiler.modules.decompiler.vars.VarDefinitionHelper.iterateClashingExprent(VarDefinitionHelper.java:1672)
   //   at org.jetbrains.java.decompiler.modules.decompiler.vars.VarDefinitionHelper.iterateClashingNames(VarDefinitionHelper.java:1492)
   //   at org.jetbrains.java.decompiler.modules.decompiler.vars.VarDefinitionHelper.iterateClashingNames(VarDefinitionHelper.java:1541)
   //   at org.jetbrains.java.decompiler.modules.decompiler.vars.VarDefinitionHelper.iterateClashingExprent(VarDefinitionHelper.java:1672)
   //   at org.jetbrains.java.decompiler.modules.decompiler.vars.VarDefinitionHelper.iterateClashingNames(VarDefinitionHelper.java:1492)
   //   at org.jetbrains.java.decompiler.modules.decompiler.vars.VarDefinitionHelper.iterateClashingNames(VarDefinitionHelper.java:1541)
   //   at org.jetbrains.java.decompiler.modules.decompiler.vars.VarDefinitionHelper.iterateClashingExprent(VarDefinitionHelper.java:1672)
   //   at org.jetbrains.java.decompiler.modules.decompiler.vars.VarDefinitionHelper.iterateClashingNames(VarDefinitionHelper.java:1492)
   //   at org.jetbrains.java.decompiler.modules.decompiler.vars.VarDefinitionHelper.iterateClashingNames(VarDefinitionHelper.java:1541)
   //   at org.jetbrains.java.decompiler.modules.decompiler.vars.VarDefinitionHelper.iterateClashingExprent(VarDefinitionHelper.java:1672)
   //   at org.jetbrains.java.decompiler.modules.decompiler.vars.VarDefinitionHelper.iterateClashingNames(VarDefinitionHelper.java:1492)
   //   at org.jetbrains.java.decompiler.modules.decompiler.vars.VarDefinitionHelper.iterateClashingNames(VarDefinitionHelper.java:1541)
   //   at org.jetbrains.java.decompiler.modules.decompiler.vars.VarDefinitionHelper.iterateClashingExprent(VarDefinitionHelper.java:1672)
   //   at org.jetbrains.java.decompiler.modules.decompiler.vars.VarDefinitionHelper.iterateClashingNames(VarDefinitionHelper.java:1492)
   //   at org.jetbrains.java.decompiler.modules.decompiler.vars.VarDefinitionHelper.iterateClashingNames(VarDefinitionHelper.java:1541)
   //   at org.jetbrains.java.decompiler.modules.decompiler.vars.VarDefinitionHelper.iterateClashingExprent(VarDefinitionHelper.java:1672)
   //   at org.jetbrains.java.decompiler.modules.decompiler.vars.VarDefinitionHelper.iterateClashingNames(VarDefinitionHelper.java:1492)
   //   at org.jetbrains.java.decompiler.modules.decompiler.vars.VarDefinitionHelper.iterateClashingNames(VarDefinitionHelper.java:1541)
   //   at org.jetbrains.java.decompiler.modules.decompiler.vars.VarDefinitionHelper.iterateClashingExprent(VarDefinitionHelper.java:1672)
   //   at org.jetbrains.java.decompiler.modules.decompiler.vars.VarDefinitionHelper.iterateClashingNames(VarDefinitionHelper.java:1492)
   //   at org.jetbrains.java.decompiler.modules.decompiler.vars.VarDefinitionHelper.iterateClashingNames(VarDefinitionHelper.java:1541)
   //   at org.jetbrains.java.decompiler.modules.decompiler.vars.VarDefinitionHelper.iterateClashingExprent(VarDefinitionHelper.java:1672)
   //   at org.jetbrains.java.decompiler.modules.decompiler.vars.VarDefinitionHelper.iterateClashingNames(VarDefinitionHelper.java:1492)
   //   at org.jetbrains.java.decompiler.modules.decompiler.vars.VarDefinitionHelper.iterateClashingNames(VarDefinitionHelper.java:1541)
   //   at org.jetbrains.java.decompiler.modules.decompiler.vars.VarDefinitionHelper.iterateClashingExprent(VarDefinitionHelper.java:1672)
   //   at org.jetbrains.java.decompiler.modules.decompiler.vars.VarDefinitionHelper.iterateClashingNames(VarDefinitionHelper.java:1492)
   //   at org.jetbrains.java.decompiler.modules.decompiler.vars.VarDefinitionHelper.iterateClashingNames(VarDefinitionHelper.java:1541)
   //   at org.jetbrains.java.decompiler.modules.decompiler.vars.VarDefinitionHelper.iterateClashingExprent(VarDefinitionHelper.java:1672)
   //   at org.jetbrains.java.decompiler.modules.decompiler.vars.VarDefinitionHelper.iterateClashingNames(VarDefinitionHelper.java:1492)
   //   at org.jetbrains.java.decompiler.modules.decompiler.vars.VarDefinitionHelper.iterateClashingNames(VarDefinitionHelper.java:1541)
   //   at org.jetbrains.java.decompiler.modules.decompiler.vars.VarDefinitionHelper.iterateClashingExprent(VarDefinitionHelper.java:1672)
   //   at org.jetbrains.java.decompiler.modules.decompiler.vars.VarDefinitionHelper.iterateClashingNames(VarDefinitionHelper.java:1492)
   //   at org.jetbrains.java.decompiler.modules.decompiler.vars.VarDefinitionHelper.iterateClashingNames(VarDefinitionHelper.java:1541)
   //   at org.jetbrains.java.decompiler.modules.decompiler.vars.VarDefinitionHelper.iterateClashingExprent(VarDefinitionHelper.java:1672)
   //   at org.jetbrains.java.decompiler.modules.decompiler.vars.VarDefinitionHelper.iterateClashingNames(VarDefinitionHelper.java:1492)
   //   at org.jetbrains.java.decompiler.modules.decompiler.vars.VarDefinitionHelper.iterateClashingNames(VarDefinitionHelper.java:1541)
   //   at org.jetbrains.java.decompiler.modules.decompiler.vars.VarDefinitionHelper.iterateClashingExprent(VarDefinitionHelper.java:1672)
   //   at org.jetbrains.java.decompiler.modules.decompiler.vars.VarDefinitionHelper.iterateClashingNames(VarDefinitionHelper.java:1492)
   //   at org.jetbrains.java.decompiler.modules.decompiler.vars.VarDefinitionHelper.iterateClashingNames(VarDefinitionHelper.java:1541)
   //   at org.jetbrains.java.decompiler.modules.decompiler.vars.VarDefinitionHelper.iterateClashingExprent(VarDefinitionHelper.java:1672)
   //   at org.jetbrains.java.decompiler.modules.decompiler.vars.VarDefinitionHelper.iterateClashingNames(VarDefinitionHelper.java:1492)
   //   at org.jetbrains.java.decompiler.modules.decompiler.vars.VarDefinitionHelper.iterateClashingNames(VarDefinitionHelper.java:1541)
   //   at org.jetbrains.java.decompiler.modules.decompiler.vars.VarDefinitionHelper.iterateClashingExprent(VarDefinitionHelper.java:1672)
   //   at org.jetbrains.java.decompiler.modules.decompiler.vars.VarDefinitionHelper.iterateClashingNames(VarDefinitionHelper.java:1492)
   //   at org.jetbrains.java.decompiler.modules.decompiler.vars.VarDefinitionHelper.iterateClashingNames(VarDefinitionHelper.java:1541)
   //   at org.jetbrains.java.decompiler.modules.decompiler.vars.VarDefinitionHelper.iterateClashingExprent(VarDefinitionHelper.java:1672)
   //   at org.jetbrains.java.decompiler.modules.decompiler.vars.VarDefinitionHelper.iterateClashingNames(VarDefinitionHelper.java:1492)
   //   at org.jetbrains.java.decompiler.modules.decompiler.vars.VarDefinitionHelper.iterateClashingNames(VarDefinitionHelper.java:1541)
   //   at org.jetbrains.java.decompiler.modules.decompiler.vars.VarDefinitionHelper.iterateClashingExprent(VarDefinitionHelper.java:1672)
   //   at org.jetbrains.java.decompiler.modules.decompiler.vars.VarDefinitionHelper.iterateClashingNames(VarDefinitionHelper.java:1492)
   //   at org.jetbrains.java.decompiler.modules.decompiler.vars.VarDefinitionHelper.iterateClashingNames(VarDefinitionHelper.java:1541)
   //   at org.jetbrains.java.decompiler.modules.decompiler.vars.VarDefinitionHelper.iterateClashingExprent(VarDefinitionHelper.java:1672)
   //   at org.jetbrains.java.decompiler.modules.decompiler.vars.VarDefinitionHelper.iterateClashingNames(VarDefinitionHelper.java:1492)
   //   at org.jetbrains.java.decompiler.modules.decompiler.vars.VarDefinitionHelper.iterateClashingNames(VarDefinitionHelper.java:1541)
   //   at org.jetbrains.java.decompiler.modules.decompiler.vars.VarDefinitionHelper.iterateClashingExprent(VarDefinitionHelper.java:1672)
   //   at org.jetbrains.java.decompiler.modules.decompiler.vars.VarDefinitionHelper.iterateClashingNames(VarDefinitionHelper.java:1492)
   //   at org.jetbrains.java.decompiler.modules.decompiler.vars.VarDefinitionHelper.iterateClashingNames(VarDefinitionHelper.java:1541)
   //   at org.jetbrains.java.decompiler.modules.decompiler.vars.VarDefinitionHelper.iterateClashingExprent(VarDefinitionHelper.java:1672)
   //   at org.jetbrains.java.decompiler.modules.decompiler.vars.VarDefinitionHelper.iterateClashingNames(VarDefinitionHelper.java:1492)
   //   at org.jetbrains.java.decompiler.modules.decompiler.vars.VarDefinitionHelper.iterateClashingNames(VarDefinitionHelper.java:1541)
   //   at org.jetbrains.java.decompiler.modules.decompiler.vars.VarDefinitionHelper.iterateClashingExprent(VarDefinitionHelper.java:1672)
   //   at org.jetbrains.java.decompiler.modules.decompiler.vars.VarDefinitionHelper.iterateClashingNames(VarDefinitionHelper.java:1492)
   //   at org.jetbrains.java.decompiler.modules.decompiler.vars.VarDefinitionHelper.iterateClashingNames(VarDefinitionHelper.java:1541)
   //   at org.jetbrains.java.decompiler.modules.decompiler.vars.VarDefinitionHelper.iterateClashingExprent(VarDefinitionHelper.java:1672)
   //   at org.jetbrains.java.decompiler.modules.decompiler.vars.VarDefinitionHelper.iterateClashingNames(VarDefinitionHelper.java:1492)
   //   at org.jetbrains.java.decompiler.modules.decompiler.vars.VarDefinitionHelper.iterateClashingNames(VarDefinitionHelper.java:1541)
   //   at org.jetbrains.java.decompiler.modules.decompiler.vars.VarDefinitionHelper.iterateClashingExprent(VarDefinitionHelper.java:1672)
   //   at org.jetbrains.java.decompiler.modules.decompiler.vars.VarDefinitionHelper.iterateClashingNames(VarDefinitionHelper.java:1492)
   //   at org.jetbrains.java.decompiler.modules.decompiler.vars.VarDefinitionHelper.iterateClashingNames(VarDefinitionHelper.java:1541)
   //   at org.jetbrains.java.decompiler.modules.decompiler.vars.VarDefinitionHelper.iterateClashingExprent(VarDefinitionHelper.java:1672)
   //   at org.jetbrains.java.decompiler.modules.decompiler.vars.VarDefinitionHelper.iterateClashingNames(VarDefinitionHelper.java:1492)
   //   at org.jetbrains.java.decompiler.modules.decompiler.vars.VarDefinitionHelper.iterateClashingNames(VarDefinitionHelper.java:1541)
   //   at org.jetbrains.java.decompiler.modules.decompiler.vars.VarDefinitionHelper.iterateClashingExprent(VarDefinitionHelper.java:1672)
   //   at org.jetbrains.java.decompiler.modules.decompiler.vars.VarDefinitionHelper.iterateClashingNames(VarDefinitionHelper.java:1492)
   //   at org.jetbrains.java.decompiler.modules.decompiler.vars.VarDefinitionHelper.iterateClashingNames(VarDefinitionHelper.java:1541)
   //   at org.jetbrains.java.decompiler.modules.decompiler.vars.VarDefinitionHelper.iterateClashingExprent(VarDefinitionHelper.java:1672)
   //   at org.jetbrains.java.decompiler.modules.decompiler.vars.VarDefinitionHelper.iterateClashingNames(VarDefinitionHelper.java:1492)
   //   at org.jetbrains.java.decompiler.modules.decompiler.vars.VarDefinitionHelper.iterateClashingNames(VarDefinitionHelper.java:1541)
   //   at org.jetbrains.java.decompiler.modules.decompiler.vars.VarDefinitionHelper.iterateClashingExprent(VarDefinitionHelper.java:1672)
   //   at org.jetbrains.java.decompiler.modules.decompiler.vars.VarDefinitionHelper.iterateClashingNames(VarDefinitionHelper.java:1492)
   //   at org.jetbrains.java.decompiler.modules.decompiler.vars.VarDefinitionHelper.iterateClashingNames(VarDefinitionHelper.java:1541)
   //   at org.jetbrains.java.decompiler.modules.decompiler.vars.VarDefinitionHelper.iterateClashingExprent(VarDefinitionHelper.java:1672)
   //   at org.jetbrains.java.decompiler.modules.decompiler.vars.VarDefinitionHelper.iterateClashingNames(VarDefinitionHelper.java:1492)
   //   at org.jetbrains.java.decompiler.modules.decompiler.vars.VarDefinitionHelper.iterateClashingNames(VarDefinitionHelper.java:1541)
   //   at org.jetbrains.java.decompiler.modules.decompiler.vars.VarDefinitionHelper.iterateClashingExprent(VarDefinitionHelper.java:1672)
   //   at org.jetbrains.java.decompiler.modules.decompiler.vars.VarDefinitionHelper.iterateClashingNames(VarDefinitionHelper.java:1492)
   //   at org.jetbrains.java.decompiler.modules.decompiler.vars.VarDefinitionHelper.iterateClashingNames(VarDefinitionHelper.java:1541)
   //   at org.jetbrains.java.decompiler.modules.decompiler.vars.VarDefinitionHelper.iterateClashingExprent(VarDefinitionHelper.java:1672)
   //   at org.jetbrains.java.decompiler.modules.decompiler.vars.VarDefinitionHelper.iterateClashingNames(VarDefinitionHelper.java:1492)
   //   at org.jetbrains.java.decompiler.modules.decompiler.vars.VarDefinitionHelper.iterateClashingNames(VarDefinitionHelper.java:1541)
   //   at org.jetbrains.java.decompiler.modules.decompiler.vars.VarDefinitionHelper.iterateClashingExprent(VarDefinitionHelper.java:1672)
   //   at org.jetbrains.java.decompiler.modules.decompiler.vars.VarDefinitionHelper.iterateClashingNames(VarDefinitionHelper.java:1492)
   //   at org.jetbrains.java.decompiler.modules.decompiler.vars.VarDefinitionHelper.iterateClashingNames(VarDefinitionHelper.java:1541)
   //   at org.jetbrains.java.decompiler.modules.decompiler.vars.VarDefinitionHelper.iterateClashingExprent(VarDefinitionHelper.java:1672)
   //   at org.jetbrains.java.decompiler.modules.decompiler.vars.VarDefinitionHelper.iterateClashingNames(VarDefinitionHelper.java:1492)
   //   at org.jetbrains.java.decompiler.modules.decompiler.vars.VarDefinitionHelper.iterateClashingNames(VarDefinitionHelper.java:1541)
   //   at org.jetbrains.java.decompiler.modules.decompiler.vars.VarDefinitionHelper.iterateClashingExprent(VarDefinitionHelper.java:1672)
   //   at org.jetbrains.java.decompiler.modules.decompiler.vars.VarDefinitionHelper.iterateClashingNames(VarDefinitionHelper.java:1492)
   //   at org.jetbrains.java.decompiler.modules.decompiler.vars.VarDefinitionHelper.iterateClashingNames(VarDefinitionHelper.java:1541)
   //   at org.jetbrains.java.decompiler.modules.decompiler.vars.VarDefinitionHelper.iterateClashingExprent(VarDefinitionHelper.java:1672)
   //   at org.jetbrains.java.decompiler.modules.decompiler.vars.VarDefinitionHelper.iterateClashingNames(VarDefinitionHelper.java:1492)
   //   at org.jetbrains.java.decompiler.modules.decompiler.vars.VarDefinitionHelper.iterateClashingNames(VarDefinitionHelper.java:1541)
   //   at org.jetbrains.java.decompiler.modules.decompiler.vars.VarDefinitionHelper.iterateClashingExprent(VarDefinitionHelper.java:1672)
   //   at org.jetbrains.java.decompiler.modules.decompiler.vars.VarDefinitionHelper.iterateClashingNames(VarDefinitionHelper.java:1492)
   //   at org.jetbrains.java.decompiler.modules.decompiler.vars.VarDefinitionHelper.iterateClashingNames(VarDefinitionHelper.java:1541)
   //   at org.jetbrains.java.decompiler.modules.decompiler.vars.VarDefinitionHelper.iterateClashingExprent(VarDefinitionHelper.java:1672)
   //   at org.jetbrains.java.decompiler.modules.decompiler.vars.VarDefinitionHelper.iterateClashingNames(VarDefinitionHelper.java:1492)
   //   at org.jetbrains.java.decompiler.modules.decompiler.vars.VarDefinitionHelper.iterateClashingNames(VarDefinitionHelper.java:1541)
   //   at org.jetbrains.java.decompiler.modules.decompiler.vars.VarDefinitionHelper.iterateClashingExprent(VarDefinitionHelper.java:1672)
   //   at org.jetbrains.java.decompiler.modules.decompiler.vars.VarDefinitionHelper.iterateClashingNames(VarDefinitionHelper.java:1492)
   //   at org.jetbrains.java.decompiler.modules.decompiler.vars.VarDefinitionHelper.iterateClashingNames(VarDefinitionHelper.java:1541)
   //   at org.jetbrains.java.decompiler.modules.decompiler.vars.VarDefinitionHelper.iterateClashingExprent(VarDefinitionHelper.java:1672)
   //   at org.jetbrains.java.decompiler.modules.decompiler.vars.VarDefinitionHelper.iterateClashingNames(VarDefinitionHelper.java:1492)
   //   at org.jetbrains.java.decompiler.modules.decompiler.vars.VarDefinitionHelper.iterateClashingNames(VarDefinitionHelper.java:1541)
   //   at org.jetbrains.java.decompiler.modules.decompiler.vars.VarDefinitionHelper.iterateClashingExprent(VarDefinitionHelper.java:1672)
   //   at org.jetbrains.java.decompiler.modules.decompiler.vars.VarDefinitionHelper.iterateClashingNames(VarDefinitionHelper.java:1492)
   //   at org.jetbrains.java.decompiler.modules.decompiler.vars.VarDefinitionHelper.iterateClashingNames(VarDefinitionHelper.java:1541)
   //   at org.jetbrains.java.decompiler.modules.decompiler.vars.VarDefinitionHelper.iterateClashingExprent(VarDefinitionHelper.java:1672)
   //   at org.jetbrains.java.decompiler.modules.decompiler.vars.VarDefinitionHelper.iterateClashingNames(VarDefinitionHelper.java:1492)
   //   at org.jetbrains.java.decompiler.modules.decompiler.vars.VarDefinitionHelper.iterateClashingNames(VarDefinitionHelper.java:1541)
   //   at org.jetbrains.java.decompiler.modules.decompiler.vars.VarDefinitionHelper.iterateClashingExprent(VarDefinitionHelper.java:1672)
   //   at org.jetbrains.java.decompiler.modules.decompiler.vars.VarDefinitionHelper.iterateClashingNames(VarDefinitionHelper.java:1492)
   //   at org.jetbrains.java.decompiler.modules.decompiler.vars.VarDefinitionHelper.iterateClashingNames(VarDefinitionHelper.java:1541)
   //   at org.jetbrains.java.decompiler.modules.decompiler.vars.VarDefinitionHelper.iterateClashingExprent(VarDefinitionHelper.java:1672)
   //   at org.jetbrains.java.decompiler.modules.decompiler.vars.VarDefinitionHelper.iterateClashingNames(VarDefinitionHelper.java:1492)
   //   at org.jetbrains.java.decompiler.modules.decompiler.vars.VarDefinitionHelper.iterateClashingNames(VarDefinitionHelper.java:1541)
   //   at org.jetbrains.java.decompiler.modules.decompiler.vars.VarDefinitionHelper.iterateClashingExprent(VarDefinitionHelper.java:1672)
   //   at org.jetbrains.java.decompiler.modules.decompiler.vars.VarDefinitionHelper.iterateClashingNames(VarDefinitionHelper.java:1492)
   //   at org.jetbrains.java.decompiler.modules.decompiler.vars.VarDefinitionHelper.iterateClashingNames(VarDefinitionHelper.java:1541)
   //   at org.jetbrains.java.decompiler.modules.decompiler.vars.VarDefinitionHelper.iterateClashingExprent(VarDefinitionHelper.java:1672)
   //   at org.jetbrains.java.decompiler.modules.decompiler.vars.VarDefinitionHelper.iterateClashingNames(VarDefinitionHelper.java:1492)
   //   at org.jetbrains.java.decompiler.modules.decompiler.vars.VarDefinitionHelper.iterateClashingNames(VarDefinitionHelper.java:1541)
   //   at org.jetbrains.java.decompiler.modules.decompiler.vars.VarDefinitionHelper.iterateClashingExprent(VarDefinitionHelper.java:1672)
   //   at org.jetbrains.java.decompiler.modules.decompiler.vars.VarDefinitionHelper.iterateClashingNames(VarDefinitionHelper.java:1492)
   //   at org.jetbrains.java.decompiler.modules.decompiler.vars.VarDefinitionHelper.iterateClashingNames(VarDefinitionHelper.java:1541)
   //   at org.jetbrains.java.decompiler.modules.decompiler.vars.VarDefinitionHelper.iterateClashingExprent(VarDefinitionHelper.java:1672)
   //   at org.jetbrains.java.decompiler.modules.decompiler.vars.VarDefinitionHelper.iterateClashingNames(VarDefinitionHelper.java:1492)
   //   at org.jetbrains.java.decompiler.modules.decompiler.vars.VarDefinitionHelper.iterateClashingNames(VarDefinitionHelper.java:1541)
   //   at org.jetbrains.java.decompiler.modules.decompiler.vars.VarDefinitionHelper.iterateClashingExprent(VarDefinitionHelper.java:1672)
   //   at org.jetbrains.java.decompiler.modules.decompiler.vars.VarDefinitionHelper.iterateClashingNames(VarDefinitionHelper.java:1492)
   //   at org.jetbrains.java.decompiler.modules.decompiler.vars.VarDefinitionHelper.iterateClashingNames(VarDefinitionHelper.java:1541)
   //   at org.jetbrains.java.decompiler.modules.decompiler.vars.VarDefinitionHelper.iterateClashingExprent(VarDefinitionHelper.java:1672)
   //   at org.jetbrains.java.decompiler.modules.decompiler.vars.VarDefinitionHelper.iterateClashingNames(VarDefinitionHelper.java:1492)
   //   at org.jetbrains.java.decompiler.modules.decompiler.vars.VarDefinitionHelper.iterateClashingNames(VarDefinitionHelper.java:1541)
   //   at org.jetbrains.java.decompiler.modules.decompiler.vars.VarDefinitionHelper.iterateClashingExprent(VarDefinitionHelper.java:1672)
   //   at org.jetbrains.java.decompiler.modules.decompiler.vars.VarDefinitionHelper.iterateClashingNames(VarDefinitionHelper.java:1492)
   //   at org.jetbrains.java.decompiler.modules.decompiler.vars.VarDefinitionHelper.iterateClashingNames(VarDefinitionHelper.java:1541)
   //   at org.jetbrains.java.decompiler.modules.decompiler.vars.VarDefinitionHelper.iterateClashingExprent(VarDefinitionHelper.java:1672)
   //   at org.jetbrains.java.decompiler.modules.decompiler.vars.VarDefinitionHelper.iterateClashingNames(VarDefinitionHelper.java:1492)
   //   at org.jetbrains.java.decompiler.modules.decompiler.vars.VarDefinitionHelper.iterateClashingNames(VarDefinitionHelper.java:1541)
   //   at org.jetbrains.java.decompiler.modules.decompiler.vars.VarDefinitionHelper.iterateClashingExprent(VarDefinitionHelper.java:1672)
   //   at org.jetbrains.java.decompiler.modules.decompiler.vars.VarDefinitionHelper.iterateClashingNames(VarDefinitionHelper.java:1492)
   //   at org.jetbrains.java.decompiler.modules.decompiler.vars.VarDefinitionHelper.iterateClashingNames(VarDefinitionHelper.java:1541)
   //   at org.jetbrains.java.decompiler.modules.decompiler.vars.VarDefinitionHelper.iterateClashingExprent(VarDefinitionHelper.java:1672)
   //   at org.jetbrains.java.decompiler.modules.decompiler.vars.VarDefinitionHelper.iterateClashingNames(VarDefinitionHelper.java:1492)
   //   at org.jetbrains.java.decompiler.modules.decompiler.vars.VarDefinitionHelper.iterateClashingNames(VarDefinitionHelper.java:1541)
   //   at org.jetbrains.java.decompiler.modules.decompiler.vars.VarDefinitionHelper.iterateClashingExprent(VarDefinitionHelper.java:1672)
   //   at org.jetbrains.java.decompiler.modules.decompiler.vars.VarDefinitionHelper.iterateClashingNames(VarDefinitionHelper.java:1492)
   //   at org.jetbrains.java.decompiler.modules.decompiler.vars.VarDefinitionHelper.iterateClashingNames(VarDefinitionHelper.java:1541)
   //   at org.jetbrains.java.decompiler.modules.decompiler.vars.VarDefinitionHelper.iterateClashingExprent(VarDefinitionHelper.java:1672)
   //   at org.jetbrains.java.decompiler.modules.decompiler.vars.VarDefinitionHelper.iterateClashingNames(VarDefinitionHelper.java:1492)
   //   at org.jetbrains.java.decompiler.modules.decompiler.vars.VarDefinitionHelper.iterateClashingNames(VarDefinitionHelper.java:1541)
   //   at org.jetbrains.java.decompiler.modules.decompiler.vars.VarDefinitionHelper.iterateClashingExprent(VarDefinitionHelper.java:1672)
   //   at org.jetbrains.java.decompiler.modules.decompiler.vars.VarDefinitionHelper.iterateClashingNames(VarDefinitionHelper.java:1492)
   //   at org.jetbrains.java.decompiler.modules.decompiler.vars.VarDefinitionHelper.iterateClashingNames(VarDefinitionHelper.java:1541)
   //   at org.jetbrains.java.decompiler.modules.decompiler.vars.VarDefinitionHelper.iterateClashingExprent(VarDefinitionHelper.java:1672)
   //   at org.jetbrains.java.decompiler.modules.decompiler.vars.VarDefinitionHelper.iterateClashingNames(VarDefinitionHelper.java:1492)
   //   at org.jetbrains.java.decompiler.modules.decompiler.vars.VarDefinitionHelper.iterateClashingNames(VarDefinitionHelper.java:1541)
   //   at org.jetbrains.java.decompiler.modules.decompiler.vars.VarDefinitionHelper.iterateClashingExprent(VarDefinitionHelper.java:1672)
   //   at org.jetbrains.java.decompiler.modules.decompiler.vars.VarDefinitionHelper.iterateClashingNames(VarDefinitionHelper.java:1492)
   //   at org.jetbrains.java.decompiler.modules.decompiler.vars.VarDefinitionHelper.iterateClashingNames(VarDefinitionHelper.java:1541)
   //   at org.jetbrains.java.decompiler.modules.decompiler.vars.VarDefinitionHelper.iterateClashingExprent(VarDefinitionHelper.java:1672)
   //   at org.jetbrains.java.decompiler.modules.decompiler.vars.VarDefinitionHelper.iterateClashingNames(VarDefinitionHelper.java:1492)
   //   at org.jetbrains.java.decompiler.modules.decompiler.vars.VarDefinitionHelper.iterateClashingNames(VarDefinitionHelper.java:1541)
   //   at org.jetbrains.java.decompiler.modules.decompiler.vars.VarDefinitionHelper.iterateClashingExprent(VarDefinitionHelper.java:1672)
   //   at org.jetbrains.java.decompiler.modules.decompiler.vars.VarDefinitionHelper.iterateClashingNames(VarDefinitionHelper.java:1492)
   //   at org.jetbrains.java.decompiler.modules.decompiler.vars.VarDefinitionHelper.iterateClashingNames(VarDefinitionHelper.java:1541)
   //   at org.jetbrains.java.decompiler.modules.decompiler.vars.VarDefinitionHelper.iterateClashingExprent(VarDefinitionHelper.java:1672)
   //   at org.jetbrains.java.decompiler.modules.decompiler.vars.VarDefinitionHelper.iterateClashingNames(VarDefinitionHelper.java:1492)
   //   at org.jetbrains.java.decompiler.modules.decompiler.vars.VarDefinitionHelper.iterateClashingNames(VarDefinitionHelper.java:1541)
   //   at org.jetbrains.java.decompiler.modules.decompiler.vars.VarDefinitionHelper.iterateClashingExprent(VarDefinitionHelper.java:1672)
   //   at org.jetbrains.java.decompiler.modules.decompiler.vars.VarDefinitionHelper.iterateClashingNames(VarDefinitionHelper.java:1492)
   //   at org.jetbrains.java.decompiler.modules.decompiler.vars.VarDefinitionHelper.iterateClashingNames(VarDefinitionHelper.java:1541)
   //   at org.jetbrains.java.decompiler.modules.decompiler.vars.VarDefinitionHelper.iterateClashingExprent(VarDefinitionHelper.java:1672)
   //   at org.jetbrains.java.decompiler.modules.decompiler.vars.VarDefinitionHelper.iterateClashingNames(VarDefinitionHelper.java:1492)
   //   at org.jetbrains.java.decompiler.modules.decompiler.vars.VarDefinitionHelper.iterateClashingNames(VarDefinitionHelper.java:1541)
   //   at org.jetbrains.java.decompiler.modules.decompiler.vars.VarDefinitionHelper.iterateClashingExprent(VarDefinitionHelper.java:1672)
   //   at org.jetbrains.java.decompiler.modules.decompiler.vars.VarDefinitionHelper.iterateClashingNames(VarDefinitionHelper.java:1492)
   //   at org.jetbrains.java.decompiler.modules.decompiler.vars.VarDefinitionHelper.iterateClashingNames(VarDefinitionHelper.java:1541)
   //   at org.jetbrains.java.decompiler.modules.decompiler.vars.VarDefinitionHelper.iterateClashingExprent(VarDefinitionHelper.java:1672)
   //   at org.jetbrains.java.decompiler.modules.decompiler.vars.VarDefinitionHelper.iterateClashingNames(VarDefinitionHelper.java:1492)
   //   at org.jetbrains.java.decompiler.modules.decompiler.vars.VarDefinitionHelper.iterateClashingNames(VarDefinitionHelper.java:1541)
   //   at org.jetbrains.java.decompiler.modules.decompiler.vars.VarDefinitionHelper.iterateClashingExprent(VarDefinitionHelper.java:1672)
   //   at org.jetbrains.java.decompiler.modules.decompiler.vars.VarDefinitionHelper.iterateClashingNames(VarDefinitionHelper.java:1492)
   //   at org.jetbrains.java.decompiler.modules.decompiler.vars.VarDefinitionHelper.iterateClashingNames(VarDefinitionHelper.java:1541)
   //   at org.jetbrains.java.decompiler.modules.decompiler.vars.VarDefinitionHelper.iterateClashingExprent(VarDefinitionHelper.java:1672)
   //   at org.jetbrains.java.decompiler.modules.decompiler.vars.VarDefinitionHelper.iterateClashingNames(VarDefinitionHelper.java:1492)
   //   at org.jetbrains.java.decompiler.modules.decompiler.vars.VarDefinitionHelper.iterateClashingNames(VarDefinitionHelper.java:1541)
   //   at org.jetbrains.java.decompiler.modules.decompiler.vars.VarDefinitionHelper.iterateClashingExprent(VarDefinitionHelper.java:1672)
   //   at org.jetbrains.java.decompiler.modules.decompiler.vars.VarDefinitionHelper.iterateClashingNames(VarDefinitionHelper.java:1492)
   //   at org.jetbrains.java.decompiler.modules.decompiler.vars.VarDefinitionHelper.iterateClashingNames(VarDefinitionHelper.java:1541)
   //   at org.jetbrains.java.decompiler.modules.decompiler.vars.VarDefinitionHelper.iterateClashingExprent(VarDefinitionHelper.java:1672)
   //   at org.jetbrains.java.decompiler.modules.decompiler.vars.VarDefinitionHelper.iterateClashingNames(VarDefinitionHelper.java:1492)
   //   at org.jetbrains.java.decompiler.modules.decompiler.vars.VarDefinitionHelper.iterateClashingNames(VarDefinitionHelper.java:1541)
   //   at org.jetbrains.java.decompiler.modules.decompiler.vars.VarDefinitionHelper.iterateClashingExprent(VarDefinitionHelper.java:1672)
   //   at org.jetbrains.java.decompiler.modules.decompiler.vars.VarDefinitionHelper.iterateClashingNames(VarDefinitionHelper.java:1492)
   //   at org.jetbrains.java.decompiler.modules.decompiler.vars.VarDefinitionHelper.iterateClashingNames(VarDefinitionHelper.java:1541)
   //   at org.jetbrains.java.decompiler.modules.decompiler.vars.VarDefinitionHelper.iterateClashingExprent(VarDefinitionHelper.java:1672)
   //   at org.jetbrains.java.decompiler.modules.decompiler.vars.VarDefinitionHelper.iterateClashingNames(VarDefinitionHelper.java:1492)
   //   at org.jetbrains.java.decompiler.modules.decompiler.vars.VarDefinitionHelper.iterateClashingNames(VarDefinitionHelper.java:1541)
   //   at org.jetbrains.java.decompiler.modules.decompiler.vars.VarDefinitionHelper.iterateClashingExprent(VarDefinitionHelper.java:1672)
   //   at org.jetbrains.java.decompiler.modules.decompiler.vars.VarDefinitionHelper.iterateClashingNames(VarDefinitionHelper.java:1492)
   //   at org.jetbrains.java.decompiler.modules.decompiler.vars.VarDefinitionHelper.iterateClashingNames(VarDefinitionHelper.java:1541)
   //   at org.jetbrains.java.decompiler.modules.decompiler.vars.VarDefinitionHelper.iterateClashingExprent(VarDefinitionHelper.java:1672)
   //   at org.jetbrains.java.decompiler.modules.decompiler.vars.VarDefinitionHelper.iterateClashingNames(VarDefinitionHelper.java:1492)
   //   at org.jetbrains.java.decompiler.modules.decompiler.vars.VarDefinitionHelper.iterateClashingNames(VarDefinitionHelper.java:1541)
   //   at org.jetbrains.java.decompiler.modules.decompiler.vars.VarDefinitionHelper.iterateClashingExprent(VarDefinitionHelper.java:1672)
   //   at org.jetbrains.java.decompiler.modules.decompiler.vars.VarDefinitionHelper.iterateClashingNames(VarDefinitionHelper.java:1492)
   //   at org.jetbrains.java.decompiler.modules.decompiler.vars.VarDefinitionHelper.iterateClashingNames(VarDefinitionHelper.java:1541)
   //   at org.jetbrains.java.decompiler.modules.decompiler.vars.VarDefinitionHelper.iterateClashingExprent(VarDefinitionHelper.java:1672)
   //   at org.jetbrains.java.decompiler.modules.decompiler.vars.VarDefinitionHelper.iterateClashingNames(VarDefinitionHelper.java:1492)
   //   at org.jetbrains.java.decompiler.modules.decompiler.vars.VarDefinitionHelper.iterateClashingNames(VarDefinitionHelper.java:1541)
   //   at org.jetbrains.java.decompiler.modules.decompiler.vars.VarDefinitionHelper.iterateClashingExprent(VarDefinitionHelper.java:1672)
   //   at org.jetbrains.java.decompiler.modules.decompiler.vars.VarDefinitionHelper.iterateClashingNames(VarDefinitionHelper.java:1492)
   //   at org.jetbrains.java.decompiler.modules.decompiler.vars.VarDefinitionHelper.iterateClashingNames(VarDefinitionHelper.java:1541)
   //   at org.jetbrains.java.decompiler.modules.decompiler.vars.VarDefinitionHelper.iterateClashingExprent(VarDefinitionHelper.java:1672)
   //   at org.jetbrains.java.decompiler.modules.decompiler.vars.VarDefinitionHelper.iterateClashingNames(VarDefinitionHelper.java:1492)
   //   at org.jetbrains.java.decompiler.modules.decompiler.vars.VarDefinitionHelper.iterateClashingNames(VarDefinitionHelper.java:1541)
   //   at org.jetbrains.java.decompiler.modules.decompiler.vars.VarDefinitionHelper.iterateClashingExprent(VarDefinitionHelper.java:1672)
   //   at org.jetbrains.java.decompiler.modules.decompiler.vars.VarDefinitionHelper.iterateClashingNames(VarDefinitionHelper.java:1492)
   //   at org.jetbrains.java.decompiler.modules.decompiler.vars.VarDefinitionHelper.iterateClashingNames(VarDefinitionHelper.java:1541)
   //   at org.jetbrains.java.decompiler.modules.decompiler.vars.VarDefinitionHelper.iterateClashingExprent(VarDefinitionHelper.java:1672)
   //   at org.jetbrains.java.decompiler.modules.decompiler.vars.VarDefinitionHelper.iterateClashingNames(VarDefinitionHelper.java:1492)
   //   at org.jetbrains.java.decompiler.modules.decompiler.vars.VarDefinitionHelper.iterateClashingNames(VarDefinitionHelper.java:1541)
   //   at org.jetbrains.java.decompiler.modules.decompiler.vars.VarDefinitionHelper.iterateClashingExprent(VarDefinitionHelper.java:1672)
   //   at org.jetbrains.java.decompiler.modules.decompiler.vars.VarDefinitionHelper.iterateClashingNames(VarDefinitionHelper.java:1492)
   //   at org.jetbrains.java.decompiler.modules.decompiler.vars.VarDefinitionHelper.iterateClashingNames(VarDefinitionHelper.java:1541)
   //   at org.jetbrains.java.decompiler.modules.decompiler.vars.VarDefinitionHelper.iterateClashingExprent(VarDefinitionHelper.java:1672)
   //   at org.jetbrains.java.decompiler.modules.decompiler.vars.VarDefinitionHelper.iterateClashingNames(VarDefinitionHelper.java:1492)
   //   at org.jetbrains.java.decompiler.modules.decompiler.vars.VarDefinitionHelper.iterateClashingNames(VarDefinitionHelper.java:1541)
   //   at org.jetbrains.java.decompiler.modules.decompiler.vars.VarDefinitionHelper.iterateClashingExprent(VarDefinitionHelper.java:1672)
   //   at org.jetbrains.java.decompiler.modules.decompiler.vars.VarDefinitionHelper.iterateClashingNames(VarDefinitionHelper.java:1492)
   //   at org.jetbrains.java.decompiler.modules.decompiler.vars.VarDefinitionHelper.iterateClashingNames(VarDefinitionHelper.java:1541)
   //   at org.jetbrains.java.decompiler.modules.decompiler.vars.VarDefinitionHelper.iterateClashingExprent(VarDefinitionHelper.java:1672)
   //   at org.jetbrains.java.decompiler.modules.decompiler.vars.VarDefinitionHelper.iterateClashingNames(VarDefinitionHelper.java:1492)
   //   at org.jetbrains.java.decompiler.modules.decompiler.vars.VarDefinitionHelper.iterateClashingNames(VarDefinitionHelper.java:1541)
   //   at org.jetbrains.java.decompiler.modules.decompiler.vars.VarDefinitionHelper.iterateClashingExprent(VarDefinitionHelper.java:1672)
   //   at org.jetbrains.java.decompiler.modules.decompiler.vars.VarDefinitionHelper.iterateClashingNames(VarDefinitionHelper.java:1492)
   //   at org.jetbrains.java.decompiler.modules.decompiler.vars.VarDefinitionHelper.iterateClashingNames(VarDefinitionHelper.java:1541)
   //   at org.jetbrains.java.decompiler.modules.decompiler.vars.VarDefinitionHelper.iterateClashingExprent(VarDefinitionHelper.java:1672)
   //   at org.jetbrains.java.decompiler.modules.decompiler.vars.VarDefinitionHelper.iterateClashingNames(VarDefinitionHelper.java:1492)
   //   at org.jetbrains.java.decompiler.modules.decompiler.vars.VarDefinitionHelper.iterateClashingNames(VarDefinitionHelper.java:1541)
   //   at org.jetbrains.java.decompiler.modules.decompiler.vars.VarDefinitionHelper.iterateClashingExprent(VarDefinitionHelper.java:1672)
   //   at org.jetbrains.java.decompiler.modules.decompiler.vars.VarDefinitionHelper.iterateClashingNames(VarDefinitionHelper.java:1492)
   //   at org.jetbrains.java.decompiler.modules.decompiler.vars.VarDefinitionHelper.iterateClashingNames(VarDefinitionHelper.java:1541)
   //   at org.jetbrains.java.decompiler.modules.decompiler.vars.VarDefinitionHelper.iterateClashingExprent(VarDefinitionHelper.java:1672)
   //   at org.jetbrains.java.decompiler.modules.decompiler.vars.VarDefinitionHelper.iterateClashingNames(VarDefinitionHelper.java:1492)
   //   at org.jetbrains.java.decompiler.modules.decompiler.vars.VarDefinitionHelper.iterateClashingNames(VarDefinitionHelper.java:1541)
   //   at org.jetbrains.java.decompiler.modules.decompiler.vars.VarDefinitionHelper.iterateClashingExprent(VarDefinitionHelper.java:1672)
   //   at org.jetbrains.java.decompiler.modules.decompiler.vars.VarDefinitionHelper.iterateClashingNames(VarDefinitionHelper.java:1492)
   //   at org.jetbrains.java.decompiler.modules.decompiler.vars.VarDefinitionHelper.iterateClashingNames(VarDefinitionHelper.java:1541)
   //   at org.jetbrains.java.decompiler.modules.decompiler.vars.VarDefinitionHelper.iterateClashingExprent(VarDefinitionHelper.java:1672)
   //   at org.jetbrains.java.decompiler.modules.decompiler.vars.VarDefinitionHelper.iterateClashingNames(VarDefinitionHelper.java:1492)
   //   at org.jetbrains.java.decompiler.modules.decompiler.vars.VarDefinitionHelper.iterateClashingNames(VarDefinitionHelper.java:1541)
   //   at org.jetbrains.java.decompiler.modules.decompiler.vars.VarDefinitionHelper.iterateClashingExprent(VarDefinitionHelper.java:1672)
   //   at org.jetbrains.java.decompiler.modules.decompiler.vars.VarDefinitionHelper.iterateClashingNames(VarDefinitionHelper.java:1492)
   //   at org.jetbrains.java.decompiler.modules.decompiler.vars.VarDefinitionHelper.iterateClashingNames(VarDefinitionHelper.java:1541)
   //   at org.jetbrains.java.decompiler.modules.decompiler.vars.VarDefinitionHelper.iterateClashingExprent(VarDefinitionHelper.java:1672)
   //   at org.jetbrains.java.decompiler.modules.decompiler.vars.VarDefinitionHelper.iterateClashingNames(VarDefinitionHelper.java:1492)
   //   at org.jetbrains.java.decompiler.modules.decompiler.vars.VarDefinitionHelper.iterateClashingNames(VarDefinitionHelper.java:1541)
   //   at org.jetbrains.java.decompiler.modules.decompiler.vars.VarDefinitionHelper.iterateClashingExprent(VarDefinitionHelper.java:1672)
   //   at org.jetbrains.java.decompiler.modules.decompiler.vars.VarDefinitionHelper.iterateClashingNames(VarDefinitionHelper.java:1492)
   //   at org.jetbrains.java.decompiler.modules.decompiler.vars.VarDefinitionHelper.iterateClashingNames(VarDefinitionHelper.java:1541)
   //   at org.jetbrains.java.decompiler.modules.decompiler.vars.VarDefinitionHelper.iterateClashingExprent(VarDefinitionHelper.java:1672)
   //   at org.jetbrains.java.decompiler.modules.decompiler.vars.VarDefinitionHelper.iterateClashingNames(VarDefinitionHelper.java:1492)
   //   at org.jetbrains.java.decompiler.modules.decompiler.vars.VarDefinitionHelper.iterateClashingNames(VarDefinitionHelper.java:1541)
   //   at org.jetbrains.java.decompiler.modules.decompiler.vars.VarDefinitionHelper.iterateClashingExprent(VarDefinitionHelper.java:1672)
   //   at org.jetbrains.java.decompiler.modules.decompiler.vars.VarDefinitionHelper.iterateClashingNames(VarDefinitionHelper.java:1492)
   //   at org.jetbrains.java.decompiler.modules.decompiler.vars.VarDefinitionHelper.iterateClashingNames(VarDefinitionHelper.java:1541)
   //   at org.jetbrains.java.decompiler.modules.decompiler.vars.VarDefinitionHelper.iterateClashingExprent(VarDefinitionHelper.java:1672)
   //   at org.jetbrains.java.decompiler.modules.decompiler.vars.VarDefinitionHelper.iterateClashingNames(VarDefinitionHelper.java:1492)
   //   at org.jetbrains.java.decompiler.modules.decompiler.vars.VarDefinitionHelper.iterateClashingNames(VarDefinitionHelper.java:1541)
   //   at org.jetbrains.java.decompiler.modules.decompiler.vars.VarDefinitionHelper.iterateClashingExprent(VarDefinitionHelper.java:1672)
   //   at org.jetbrains.java.decompiler.modules.decompiler.vars.VarDefinitionHelper.iterateClashingNames(VarDefinitionHelper.java:1492)
   //   at org.jetbrains.java.decompiler.modules.decompiler.vars.VarDefinitionHelper.iterateClashingNames(VarDefinitionHelper.java:1541)
   //   at org.jetbrains.java.decompiler.modules.decompiler.vars.VarDefinitionHelper.iterateClashingExprent(VarDefinitionHelper.java:1672)
   //   at org.jetbrains.java.decompiler.modules.decompiler.vars.VarDefinitionHelper.iterateClashingNames(VarDefinitionHelper.java:1492)
   //   at org.jetbrains.java.decompiler.modules.decompiler.vars.VarDefinitionHelper.iterateClashingNames(VarDefinitionHelper.java:1541)
   //   at org.jetbrains.java.decompiler.modules.decompiler.vars.VarDefinitionHelper.iterateClashingExprent(VarDefinitionHelper.java:1672)
   //   at org.jetbrains.java.decompiler.modules.decompiler.vars.VarDefinitionHelper.iterateClashingNames(VarDefinitionHelper.java:1492)
   //   at org.jetbrains.java.decompiler.modules.decompiler.vars.VarDefinitionHelper.iterateClashingNames(VarDefinitionHelper.java:1541)
   //   at org.jetbrains.java.decompiler.modules.decompiler.vars.VarDefinitionHelper.iterateClashingExprent(VarDefinitionHelper.java:1672)
   //   at org.jetbrains.java.decompiler.modules.decompiler.vars.VarDefinitionHelper.iterateClashingNames(VarDefinitionHelper.java:1492)
   //   at org.jetbrains.java.decompiler.modules.decompiler.vars.VarDefinitionHelper.iterateClashingNames(VarDefinitionHelper.java:1541)
   //   at org.jetbrains.java.decompiler.modules.decompiler.vars.VarDefinitionHelper.iterateClashingExprent(VarDefinitionHelper.java:1672)
   //   at org.jetbrains.java.decompiler.modules.decompiler.vars.VarDefinitionHelper.iterateClashingNames(VarDefinitionHelper.java:1492)
   //   at org.jetbrains.java.decompiler.modules.decompiler.vars.VarDefinitionHelper.iterateClashingNames(VarDefinitionHelper.java:1541)
   //   at org.jetbrains.java.decompiler.modules.decompiler.vars.VarDefinitionHelper.iterateClashingExprent(VarDefinitionHelper.java:1672)
   //   at org.jetbrains.java.decompiler.modules.decompiler.vars.VarDefinitionHelper.iterateClashingNames(VarDefinitionHelper.java:1492)
   //   at org.jetbrains.java.decompiler.modules.decompiler.vars.VarDefinitionHelper.iterateClashingNames(VarDefinitionHelper.java:1541)
   //   at org.jetbrains.java.decompiler.modules.decompiler.vars.VarDefinitionHelper.iterateClashingExprent(VarDefinitionHelper.java:1672)
   //   at org.jetbrains.java.decompiler.modules.decompiler.vars.VarDefinitionHelper.iterateClashingNames(VarDefinitionHelper.java:1492)
   //   at org.jetbrains.java.decompiler.modules.decompiler.vars.VarDefinitionHelper.iterateClashingNames(VarDefinitionHelper.java:1541)
   //   at org.jetbrains.java.decompiler.modules.decompiler.vars.VarDefinitionHelper.iterateClashingExprent(VarDefinitionHelper.java:1672)
   //   at org.jetbrains.java.decompiler.modules.decompiler.vars.VarDefinitionHelper.iterateClashingNames(VarDefinitionHelper.java:1492)
   //   at org.jetbrains.java.decompiler.modules.decompiler.vars.VarDefinitionHelper.iterateClashingNames(VarDefinitionHelper.java:1541)
   //   at org.jetbrains.java.decompiler.modules.decompiler.vars.VarDefinitionHelper.iterateClashingExprent(VarDefinitionHelper.java:1672)
   //   at org.jetbrains.java.decompiler.modules.decompiler.vars.VarDefinitionHelper.iterateClashingNames(VarDefinitionHelper.java:1492)
   //   at org.jetbrains.java.decompiler.modules.decompiler.vars.VarDefinitionHelper.iterateClashingNames(VarDefinitionHelper.java:1541)
   //   at org.jetbrains.java.decompiler.modules.decompiler.vars.VarDefinitionHelper.iterateClashingExprent(VarDefinitionHelper.java:1672)
   //   at org.jetbrains.java.decompiler.modules.decompiler.vars.VarDefinitionHelper.iterateClashingNames(VarDefinitionHelper.java:1492)
   //   at org.jetbrains.java.decompiler.modules.decompiler.vars.VarDefinitionHelper.iterateClashingNames(VarDefinitionHelper.java:1541)
   //   at org.jetbrains.java.decompiler.modules.decompiler.vars.VarDefinitionHelper.iterateClashingExprent(VarDefinitionHelper.java:1672)
   //   at org.jetbrains.java.decompiler.modules.decompiler.vars.VarDefinitionHelper.iterateClashingNames(VarDefinitionHelper.java:1492)
   //   at org.jetbrains.java.decompiler.modules.decompiler.vars.VarDefinitionHelper.iterateClashingNames(VarDefinitionHelper.java:1541)
   //   at org.jetbrains.java.decompiler.modules.decompiler.vars.VarDefinitionHelper.iterateClashingExprent(VarDefinitionHelper.java:1672)
   //   at org.jetbrains.java.decompiler.modules.decompiler.vars.VarDefinitionHelper.iterateClashingNames(VarDefinitionHelper.java:1492)
   //   at org.jetbrains.java.decompiler.modules.decompiler.vars.VarDefinitionHelper.iterateClashingNames(VarDefinitionHelper.java:1541)
   //   at org.jetbrains.java.decompiler.modules.decompiler.vars.VarDefinitionHelper.iterateClashingExprent(VarDefinitionHelper.java:1672)
   //   at org.jetbrains.java.decompiler.modules.decompiler.vars.VarDefinitionHelper.iterateClashingNames(VarDefinitionHelper.java:1492)
   //   at org.jetbrains.java.decompiler.modules.decompiler.vars.VarDefinitionHelper.iterateClashingNames(VarDefinitionHelper.java:1541)
   //   at org.jetbrains.java.decompiler.modules.decompiler.vars.VarDefinitionHelper.iterateClashingExprent(VarDefinitionHelper.java:1672)
   //   at org.jetbrains.java.decompiler.modules.decompiler.vars.VarDefinitionHelper.iterateClashingNames(VarDefinitionHelper.java:1492)
   //   at org.jetbrains.java.decompiler.modules.decompiler.vars.VarDefinitionHelper.iterateClashingNames(VarDefinitionHelper.java:1541)
   //   at org.jetbrains.java.decompiler.modules.decompiler.vars.VarDefinitionHelper.iterateClashingExprent(VarDefinitionHelper.java:1672)
   //   at org.jetbrains.java.decompiler.modules.decompiler.vars.VarDefinitionHelper.iterateClashingNames(VarDefinitionHelper.java:1492)
   //   at org.jetbrains.java.decompiler.modules.decompiler.vars.VarDefinitionHelper.iterateClashingNames(VarDefinitionHelper.java:1541)
   //   at org.jetbrains.java.decompiler.modules.decompiler.vars.VarDefinitionHelper.iterateClashingExprent(VarDefinitionHelper.java:1672)
   //   at org.jetbrains.java.decompiler.modules.decompiler.vars.VarDefinitionHelper.iterateClashingNames(VarDefinitionHelper.java:1492)
   //   at org.jetbrains.java.decompiler.modules.decompiler.vars.VarDefinitionHelper.iterateClashingNames(VarDefinitionHelper.java:1541)
   //   at org.jetbrains.java.decompiler.modules.decompiler.vars.VarDefinitionHelper.iterateClashingExprent(VarDefinitionHelper.java:1672)
   //   at org.jetbrains.java.decompiler.modules.decompiler.vars.VarDefinitionHelper.iterateClashingNames(VarDefinitionHelper.java:1492)
   //   at org.jetbrains.java.decompiler.modules.decompiler.vars.VarDefinitionHelper.iterateClashingNames(VarDefinitionHelper.java:1541)
   //   at org.jetbrains.java.decompiler.modules.decompiler.vars.VarDefinitionHelper.iterateClashingExprent(VarDefinitionHelper.java:1672)
   //   at org.jetbrains.java.decompiler.modules.decompiler.vars.VarDefinitionHelper.iterateClashingNames(VarDefinitionHelper.java:1492)
   //   at org.jetbrains.java.decompiler.modules.decompiler.vars.VarDefinitionHelper.iterateClashingNames(VarDefinitionHelper.java:1541)
   ,
         var1
      );
      return if (var2 === qh.b.e()) var2 else Unit.a;
   }

   private suspend fun copyToFile(uri: Uri, targetFile: File? = ...): Uri {
      return f.g(
         k0.b(),
         new Function2(var2, this, var1, null)// $VF: Couldn't be decompiled
   // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
   // java.lang.StackOverflowError
   //   at org.jetbrains.java.decompiler.struct.gen.VarType.<init>(VarType.java:82)
   //   at org.jetbrains.java.decompiler.struct.gen.MethodDescriptor.parseDescriptor(MethodDescriptor.java:67)
   //   at org.jetbrains.java.decompiler.struct.gen.MethodDescriptor.parseDescriptor(MethodDescriptor.java:80)
   //   at org.jetbrains.java.decompiler.struct.StructMethod.methodDescriptor(StructMethod.java:371)
   //   at org.jetbrains.java.decompiler.modules.decompiler.vars.VarDefinitionHelper.iterateClashingExprent(VarDefinitionHelper.java:1649)
   //   at org.jetbrains.java.decompiler.modules.decompiler.vars.VarDefinitionHelper.iterateClashingNames(VarDefinitionHelper.java:1492)
   //   at org.jetbrains.java.decompiler.modules.decompiler.vars.VarDefinitionHelper.iterateClashingNames(VarDefinitionHelper.java:1541)
   //   at org.jetbrains.java.decompiler.modules.decompiler.vars.VarDefinitionHelper.iterateClashingExprent(VarDefinitionHelper.java:1672)
   //   at org.jetbrains.java.decompiler.modules.decompiler.vars.VarDefinitionHelper.iterateClashingNames(VarDefinitionHelper.java:1492)
   //   at org.jetbrains.java.decompiler.modules.decompiler.vars.VarDefinitionHelper.iterateClashingNames(VarDefinitionHelper.java:1541)
   //   at org.jetbrains.java.decompiler.modules.decompiler.vars.VarDefinitionHelper.iterateClashingExprent(VarDefinitionHelper.java:1672)
   //   at org.jetbrains.java.decompiler.modules.decompiler.vars.VarDefinitionHelper.iterateClashingNames(VarDefinitionHelper.java:1492)
   //   at org.jetbrains.java.decompiler.modules.decompiler.vars.VarDefinitionHelper.iterateClashingNames(VarDefinitionHelper.java:1541)
   //   at org.jetbrains.java.decompiler.modules.decompiler.vars.VarDefinitionHelper.iterateClashingExprent(VarDefinitionHelper.java:1672)
   //   at org.jetbrains.java.decompiler.modules.decompiler.vars.VarDefinitionHelper.iterateClashingNames(VarDefinitionHelper.java:1492)
   //   at org.jetbrains.java.decompiler.modules.decompiler.vars.VarDefinitionHelper.iterateClashingNames(VarDefinitionHelper.java:1541)
   //   at org.jetbrains.java.decompiler.modules.decompiler.vars.VarDefinitionHelper.iterateClashingExprent(VarDefinitionHelper.java:1672)
   //   at org.jetbrains.java.decompiler.modules.decompiler.vars.VarDefinitionHelper.iterateClashingNames(VarDefinitionHelper.java:1492)
   //   at org.jetbrains.java.decompiler.modules.decompiler.vars.VarDefinitionHelper.iterateClashingNames(VarDefinitionHelper.java:1541)
   //   at org.jetbrains.java.decompiler.modules.decompiler.vars.VarDefinitionHelper.iterateClashingExprent(VarDefinitionHelper.java:1672)
   //   at org.jetbrains.java.decompiler.modules.decompiler.vars.VarDefinitionHelper.iterateClashingNames(VarDefinitionHelper.java:1492)
   //   at org.jetbrains.java.decompiler.modules.decompiler.vars.VarDefinitionHelper.iterateClashingNames(VarDefinitionHelper.java:1541)
   //   at org.jetbrains.java.decompiler.modules.decompiler.vars.VarDefinitionHelper.iterateClashingExprent(VarDefinitionHelper.java:1672)
   //   at org.jetbrains.java.decompiler.modules.decompiler.vars.VarDefinitionHelper.iterateClashingNames(VarDefinitionHelper.java:1492)
   //   at org.jetbrains.java.decompiler.modules.decompiler.vars.VarDefinitionHelper.iterateClashingNames(VarDefinitionHelper.java:1541)
   //   at org.jetbrains.java.decompiler.modules.decompiler.vars.VarDefinitionHelper.iterateClashingExprent(VarDefinitionHelper.java:1672)
   //   at org.jetbrains.java.decompiler.modules.decompiler.vars.VarDefinitionHelper.iterateClashingNames(VarDefinitionHelper.java:1492)
   //   at org.jetbrains.java.decompiler.modules.decompiler.vars.VarDefinitionHelper.iterateClashingNames(VarDefinitionHelper.java:1541)
   //   at org.jetbrains.java.decompiler.modules.decompiler.vars.VarDefinitionHelper.iterateClashingExprent(VarDefinitionHelper.java:1672)
   //   at org.jetbrains.java.decompiler.modules.decompiler.vars.VarDefinitionHelper.iterateClashingNames(VarDefinitionHelper.java:1492)
   //   at org.jetbrains.java.decompiler.modules.decompiler.vars.VarDefinitionHelper.iterateClashingNames(VarDefinitionHelper.java:1541)
   //   at org.jetbrains.java.decompiler.modules.decompiler.vars.VarDefinitionHelper.iterateClashingExprent(VarDefinitionHelper.java:1672)
   //   at org.jetbrains.java.decompiler.modules.decompiler.vars.VarDefinitionHelper.iterateClashingNames(VarDefinitionHelper.java:1492)
   //   at org.jetbrains.java.decompiler.modules.decompiler.vars.VarDefinitionHelper.iterateClashingNames(VarDefinitionHelper.java:1541)
   //   at org.jetbrains.java.decompiler.modules.decompiler.vars.VarDefinitionHelper.iterateClashingExprent(VarDefinitionHelper.java:1672)
   //   at org.jetbrains.java.decompiler.modules.decompiler.vars.VarDefinitionHelper.iterateClashingNames(VarDefinitionHelper.java:1492)
   //   at org.jetbrains.java.decompiler.modules.decompiler.vars.VarDefinitionHelper.iterateClashingNames(VarDefinitionHelper.java:1541)
   //   at org.jetbrains.java.decompiler.modules.decompiler.vars.VarDefinitionHelper.iterateClashingExprent(VarDefinitionHelper.java:1672)
   //   at org.jetbrains.java.decompiler.modules.decompiler.vars.VarDefinitionHelper.iterateClashingNames(VarDefinitionHelper.java:1492)
   //   at org.jetbrains.java.decompiler.modules.decompiler.vars.VarDefinitionHelper.iterateClashingNames(VarDefinitionHelper.java:1541)
   //   at org.jetbrains.java.decompiler.modules.decompiler.vars.VarDefinitionHelper.iterateClashingExprent(VarDefinitionHelper.java:1672)
   //   at org.jetbrains.java.decompiler.modules.decompiler.vars.VarDefinitionHelper.iterateClashingNames(VarDefinitionHelper.java:1492)
   //   at org.jetbrains.java.decompiler.modules.decompiler.vars.VarDefinitionHelper.iterateClashingNames(VarDefinitionHelper.java:1541)
   //   at org.jetbrains.java.decompiler.modules.decompiler.vars.VarDefinitionHelper.iterateClashingExprent(VarDefinitionHelper.java:1672)
   //   at org.jetbrains.java.decompiler.modules.decompiler.vars.VarDefinitionHelper.iterateClashingNames(VarDefinitionHelper.java:1492)
   //   at org.jetbrains.java.decompiler.modules.decompiler.vars.VarDefinitionHelper.iterateClashingNames(VarDefinitionHelper.java:1541)
   //   at org.jetbrains.java.decompiler.modules.decompiler.vars.VarDefinitionHelper.iterateClashingExprent(VarDefinitionHelper.java:1672)
   //   at org.jetbrains.java.decompiler.modules.decompiler.vars.VarDefinitionHelper.iterateClashingNames(VarDefinitionHelper.java:1492)
   //   at org.jetbrains.java.decompiler.modules.decompiler.vars.VarDefinitionHelper.iterateClashingNames(VarDefinitionHelper.java:1541)
   //   at org.jetbrains.java.decompiler.modules.decompiler.vars.VarDefinitionHelper.iterateClashingExprent(VarDefinitionHelper.java:1672)
   //   at org.jetbrains.java.decompiler.modules.decompiler.vars.VarDefinitionHelper.iterateClashingNames(VarDefinitionHelper.java:1492)
   //   at org.jetbrains.java.decompiler.modules.decompiler.vars.VarDefinitionHelper.iterateClashingNames(VarDefinitionHelper.java:1541)
   //   at org.jetbrains.java.decompiler.modules.decompiler.vars.VarDefinitionHelper.iterateClashingExprent(VarDefinitionHelper.java:1672)
   //   at org.jetbrains.java.decompiler.modules.decompiler.vars.VarDefinitionHelper.iterateClashingNames(VarDefinitionHelper.java:1492)
   //   at org.jetbrains.java.decompiler.modules.decompiler.vars.VarDefinitionHelper.iterateClashingNames(VarDefinitionHelper.java:1541)
   //   at org.jetbrains.java.decompiler.modules.decompiler.vars.VarDefinitionHelper.iterateClashingExprent(VarDefinitionHelper.java:1672)
   //   at org.jetbrains.java.decompiler.modules.decompiler.vars.VarDefinitionHelper.iterateClashingNames(VarDefinitionHelper.java:1492)
   //   at org.jetbrains.java.decompiler.modules.decompiler.vars.VarDefinitionHelper.iterateClashingNames(VarDefinitionHelper.java:1541)
   //   at org.jetbrains.java.decompiler.modules.decompiler.vars.VarDefinitionHelper.iterateClashingExprent(VarDefinitionHelper.java:1672)
   //   at org.jetbrains.java.decompiler.modules.decompiler.vars.VarDefinitionHelper.iterateClashingNames(VarDefinitionHelper.java:1492)
   //   at org.jetbrains.java.decompiler.modules.decompiler.vars.VarDefinitionHelper.iterateClashingNames(VarDefinitionHelper.java:1541)
   //   at org.jetbrains.java.decompiler.modules.decompiler.vars.VarDefinitionHelper.iterateClashingExprent(VarDefinitionHelper.java:1672)
   //   at org.jetbrains.java.decompiler.modules.decompiler.vars.VarDefinitionHelper.iterateClashingNames(VarDefinitionHelper.java:1492)
   //   at org.jetbrains.java.decompiler.modules.decompiler.vars.VarDefinitionHelper.iterateClashingNames(VarDefinitionHelper.java:1541)
   //   at org.jetbrains.java.decompiler.modules.decompiler.vars.VarDefinitionHelper.iterateClashingExprent(VarDefinitionHelper.java:1672)
   //   at org.jetbrains.java.decompiler.modules.decompiler.vars.VarDefinitionHelper.iterateClashingNames(VarDefinitionHelper.java:1492)
   //   at org.jetbrains.java.decompiler.modules.decompiler.vars.VarDefinitionHelper.iterateClashingNames(VarDefinitionHelper.java:1541)
   //   at org.jetbrains.java.decompiler.modules.decompiler.vars.VarDefinitionHelper.iterateClashingExprent(VarDefinitionHelper.java:1672)
   //   at org.jetbrains.java.decompiler.modules.decompiler.vars.VarDefinitionHelper.iterateClashingNames(VarDefinitionHelper.java:1492)
   //   at org.jetbrains.java.decompiler.modules.decompiler.vars.VarDefinitionHelper.iterateClashingNames(VarDefinitionHelper.java:1541)
   //   at org.jetbrains.java.decompiler.modules.decompiler.vars.VarDefinitionHelper.iterateClashingExprent(VarDefinitionHelper.java:1672)
   //   at org.jetbrains.java.decompiler.modules.decompiler.vars.VarDefinitionHelper.iterateClashingNames(VarDefinitionHelper.java:1492)
   //   at org.jetbrains.java.decompiler.modules.decompiler.vars.VarDefinitionHelper.iterateClashingNames(VarDefinitionHelper.java:1541)
   //   at org.jetbrains.java.decompiler.modules.decompiler.vars.VarDefinitionHelper.iterateClashingExprent(VarDefinitionHelper.java:1672)
   //   at org.jetbrains.java.decompiler.modules.decompiler.vars.VarDefinitionHelper.iterateClashingNames(VarDefinitionHelper.java:1492)
   //   at org.jetbrains.java.decompiler.modules.decompiler.vars.VarDefinitionHelper.iterateClashingNames(VarDefinitionHelper.java:1541)
   //   at org.jetbrains.java.decompiler.modules.decompiler.vars.VarDefinitionHelper.iterateClashingExprent(VarDefinitionHelper.java:1672)
   //   at org.jetbrains.java.decompiler.modules.decompiler.vars.VarDefinitionHelper.iterateClashingNames(VarDefinitionHelper.java:1492)
   //   at org.jetbrains.java.decompiler.modules.decompiler.vars.VarDefinitionHelper.iterateClashingNames(VarDefinitionHelper.java:1541)
   //   at org.jetbrains.java.decompiler.modules.decompiler.vars.VarDefinitionHelper.iterateClashingExprent(VarDefinitionHelper.java:1672)
   //   at org.jetbrains.java.decompiler.modules.decompiler.vars.VarDefinitionHelper.iterateClashingNames(VarDefinitionHelper.java:1492)
   //   at org.jetbrains.java.decompiler.modules.decompiler.vars.VarDefinitionHelper.iterateClashingNames(VarDefinitionHelper.java:1541)
   //   at org.jetbrains.java.decompiler.modules.decompiler.vars.VarDefinitionHelper.iterateClashingExprent(VarDefinitionHelper.java:1672)
   //   at org.jetbrains.java.decompiler.modules.decompiler.vars.VarDefinitionHelper.iterateClashingNames(VarDefinitionHelper.java:1492)
   //   at org.jetbrains.java.decompiler.modules.decompiler.vars.VarDefinitionHelper.iterateClashingNames(VarDefinitionHelper.java:1541)
   //   at org.jetbrains.java.decompiler.modules.decompiler.vars.VarDefinitionHelper.iterateClashingExprent(VarDefinitionHelper.java:1672)
   //   at org.jetbrains.java.decompiler.modules.decompiler.vars.VarDefinitionHelper.iterateClashingNames(VarDefinitionHelper.java:1492)
   //   at org.jetbrains.java.decompiler.modules.decompiler.vars.VarDefinitionHelper.iterateClashingNames(VarDefinitionHelper.java:1541)
   //   at org.jetbrains.java.decompiler.modules.decompiler.vars.VarDefinitionHelper.iterateClashingExprent(VarDefinitionHelper.java:1672)
   //   at org.jetbrains.java.decompiler.modules.decompiler.vars.VarDefinitionHelper.iterateClashingNames(VarDefinitionHelper.java:1492)
   //   at org.jetbrains.java.decompiler.modules.decompiler.vars.VarDefinitionHelper.iterateClashingNames(VarDefinitionHelper.java:1541)
   //   at org.jetbrains.java.decompiler.modules.decompiler.vars.VarDefinitionHelper.iterateClashingExprent(VarDefinitionHelper.java:1672)
   //   at org.jetbrains.java.decompiler.modules.decompiler.vars.VarDefinitionHelper.iterateClashingNames(VarDefinitionHelper.java:1492)
   //   at org.jetbrains.java.decompiler.modules.decompiler.vars.VarDefinitionHelper.iterateClashingNames(VarDefinitionHelper.java:1541)
   //   at org.jetbrains.java.decompiler.modules.decompiler.vars.VarDefinitionHelper.iterateClashingExprent(VarDefinitionHelper.java:1672)
   //   at org.jetbrains.java.decompiler.modules.decompiler.vars.VarDefinitionHelper.iterateClashingNames(VarDefinitionHelper.java:1492)
   //   at org.jetbrains.java.decompiler.modules.decompiler.vars.VarDefinitionHelper.iterateClashingNames(VarDefinitionHelper.java:1541)
   //   at org.jetbrains.java.decompiler.modules.decompiler.vars.VarDefinitionHelper.iterateClashingExprent(VarDefinitionHelper.java:1672)
   //   at org.jetbrains.java.decompiler.modules.decompiler.vars.VarDefinitionHelper.iterateClashingNames(VarDefinitionHelper.java:1492)
   //   at org.jetbrains.java.decompiler.modules.decompiler.vars.VarDefinitionHelper.iterateClashingNames(VarDefinitionHelper.java:1541)
   //   at org.jetbrains.java.decompiler.modules.decompiler.vars.VarDefinitionHelper.iterateClashingExprent(VarDefinitionHelper.java:1672)
   //   at org.jetbrains.java.decompiler.modules.decompiler.vars.VarDefinitionHelper.iterateClashingNames(VarDefinitionHelper.java:1492)
   //   at org.jetbrains.java.decompiler.modules.decompiler.vars.VarDefinitionHelper.iterateClashingNames(VarDefinitionHelper.java:1541)
   //   at org.jetbrains.java.decompiler.modules.decompiler.vars.VarDefinitionHelper.iterateClashingExprent(VarDefinitionHelper.java:1672)
   //   at org.jetbrains.java.decompiler.modules.decompiler.vars.VarDefinitionHelper.iterateClashingNames(VarDefinitionHelper.java:1492)
   //   at org.jetbrains.java.decompiler.modules.decompiler.vars.VarDefinitionHelper.iterateClashingNames(VarDefinitionHelper.java:1541)
   //   at org.jetbrains.java.decompiler.modules.decompiler.vars.VarDefinitionHelper.iterateClashingExprent(VarDefinitionHelper.java:1672)
   //   at org.jetbrains.java.decompiler.modules.decompiler.vars.VarDefinitionHelper.iterateClashingNames(VarDefinitionHelper.java:1492)
   //   at org.jetbrains.java.decompiler.modules.decompiler.vars.VarDefinitionHelper.iterateClashingNames(VarDefinitionHelper.java:1541)
   //   at org.jetbrains.java.decompiler.modules.decompiler.vars.VarDefinitionHelper.iterateClashingExprent(VarDefinitionHelper.java:1672)
   //   at org.jetbrains.java.decompiler.modules.decompiler.vars.VarDefinitionHelper.iterateClashingNames(VarDefinitionHelper.java:1492)
   //   at org.jetbrains.java.decompiler.modules.decompiler.vars.VarDefinitionHelper.iterateClashingNames(VarDefinitionHelper.java:1541)
   //   at org.jetbrains.java.decompiler.modules.decompiler.vars.VarDefinitionHelper.iterateClashingExprent(VarDefinitionHelper.java:1672)
   //   at org.jetbrains.java.decompiler.modules.decompiler.vars.VarDefinitionHelper.iterateClashingNames(VarDefinitionHelper.java:1492)
   //   at org.jetbrains.java.decompiler.modules.decompiler.vars.VarDefinitionHelper.iterateClashingNames(VarDefinitionHelper.java:1541)
   //   at org.jetbrains.java.decompiler.modules.decompiler.vars.VarDefinitionHelper.iterateClashingExprent(VarDefinitionHelper.java:1672)
   //   at org.jetbrains.java.decompiler.modules.decompiler.vars.VarDefinitionHelper.iterateClashingNames(VarDefinitionHelper.java:1492)
   //   at org.jetbrains.java.decompiler.modules.decompiler.vars.VarDefinitionHelper.iterateClashingNames(VarDefinitionHelper.java:1541)
   //   at org.jetbrains.java.decompiler.modules.decompiler.vars.VarDefinitionHelper.iterateClashingExprent(VarDefinitionHelper.java:1672)
   //   at org.jetbrains.java.decompiler.modules.decompiler.vars.VarDefinitionHelper.iterateClashingNames(VarDefinitionHelper.java:1492)
   //   at org.jetbrains.java.decompiler.modules.decompiler.vars.VarDefinitionHelper.iterateClashingNames(VarDefinitionHelper.java:1541)
   //   at org.jetbrains.java.decompiler.modules.decompiler.vars.VarDefinitionHelper.iterateClashingExprent(VarDefinitionHelper.java:1672)
   //   at org.jetbrains.java.decompiler.modules.decompiler.vars.VarDefinitionHelper.iterateClashingNames(VarDefinitionHelper.java:1492)
   //   at org.jetbrains.java.decompiler.modules.decompiler.vars.VarDefinitionHelper.iterateClashingNames(VarDefinitionHelper.java:1541)
   //   at org.jetbrains.java.decompiler.modules.decompiler.vars.VarDefinitionHelper.iterateClashingExprent(VarDefinitionHelper.java:1672)
   //   at org.jetbrains.java.decompiler.modules.decompiler.vars.VarDefinitionHelper.iterateClashingNames(VarDefinitionHelper.java:1492)
   //   at org.jetbrains.java.decompiler.modules.decompiler.vars.VarDefinitionHelper.iterateClashingNames(VarDefinitionHelper.java:1541)
   //   at org.jetbrains.java.decompiler.modules.decompiler.vars.VarDefinitionHelper.iterateClashingExprent(VarDefinitionHelper.java:1672)
   //   at org.jetbrains.java.decompiler.modules.decompiler.vars.VarDefinitionHelper.iterateClashingNames(VarDefinitionHelper.java:1492)
   //   at org.jetbrains.java.decompiler.modules.decompiler.vars.VarDefinitionHelper.iterateClashingNames(VarDefinitionHelper.java:1541)
   //   at org.jetbrains.java.decompiler.modules.decompiler.vars.VarDefinitionHelper.iterateClashingExprent(VarDefinitionHelper.java:1672)
   //   at org.jetbrains.java.decompiler.modules.decompiler.vars.VarDefinitionHelper.iterateClashingNames(VarDefinitionHelper.java:1492)
   //   at org.jetbrains.java.decompiler.modules.decompiler.vars.VarDefinitionHelper.iterateClashingNames(VarDefinitionHelper.java:1541)
   //   at org.jetbrains.java.decompiler.modules.decompiler.vars.VarDefinitionHelper.iterateClashingExprent(VarDefinitionHelper.java:1672)
   //   at org.jetbrains.java.decompiler.modules.decompiler.vars.VarDefinitionHelper.iterateClashingNames(VarDefinitionHelper.java:1492)
   //   at org.jetbrains.java.decompiler.modules.decompiler.vars.VarDefinitionHelper.iterateClashingNames(VarDefinitionHelper.java:1541)
   //   at org.jetbrains.java.decompiler.modules.decompiler.vars.VarDefinitionHelper.iterateClashingExprent(VarDefinitionHelper.java:1672)
   //   at org.jetbrains.java.decompiler.modules.decompiler.vars.VarDefinitionHelper.iterateClashingNames(VarDefinitionHelper.java:1492)
   //   at org.jetbrains.java.decompiler.modules.decompiler.vars.VarDefinitionHelper.iterateClashingNames(VarDefinitionHelper.java:1541)
   //   at org.jetbrains.java.decompiler.modules.decompiler.vars.VarDefinitionHelper.iterateClashingExprent(VarDefinitionHelper.java:1672)
   //   at org.jetbrains.java.decompiler.modules.decompiler.vars.VarDefinitionHelper.iterateClashingNames(VarDefinitionHelper.java:1492)
   //   at org.jetbrains.java.decompiler.modules.decompiler.vars.VarDefinitionHelper.iterateClashingNames(VarDefinitionHelper.java:1541)
   //   at org.jetbrains.java.decompiler.modules.decompiler.vars.VarDefinitionHelper.iterateClashingExprent(VarDefinitionHelper.java:1672)
   //   at org.jetbrains.java.decompiler.modules.decompiler.vars.VarDefinitionHelper.iterateClashingNames(VarDefinitionHelper.java:1492)
   //   at org.jetbrains.java.decompiler.modules.decompiler.vars.VarDefinitionHelper.iterateClashingNames(VarDefinitionHelper.java:1541)
   //   at org.jetbrains.java.decompiler.modules.decompiler.vars.VarDefinitionHelper.iterateClashingExprent(VarDefinitionHelper.java:1672)
   //   at org.jetbrains.java.decompiler.modules.decompiler.vars.VarDefinitionHelper.iterateClashingNames(VarDefinitionHelper.java:1492)
   //   at org.jetbrains.java.decompiler.modules.decompiler.vars.VarDefinitionHelper.iterateClashingNames(VarDefinitionHelper.java:1541)
   //   at org.jetbrains.java.decompiler.modules.decompiler.vars.VarDefinitionHelper.iterateClashingExprent(VarDefinitionHelper.java:1672)
   //   at org.jetbrains.java.decompiler.modules.decompiler.vars.VarDefinitionHelper.iterateClashingNames(VarDefinitionHelper.java:1492)
   //   at org.jetbrains.java.decompiler.modules.decompiler.vars.VarDefinitionHelper.iterateClashingNames(VarDefinitionHelper.java:1541)
   //   at org.jetbrains.java.decompiler.modules.decompiler.vars.VarDefinitionHelper.iterateClashingExprent(VarDefinitionHelper.java:1672)
   //   at org.jetbrains.java.decompiler.modules.decompiler.vars.VarDefinitionHelper.iterateClashingNames(VarDefinitionHelper.java:1492)
   //   at org.jetbrains.java.decompiler.modules.decompiler.vars.VarDefinitionHelper.iterateClashingNames(VarDefinitionHelper.java:1541)
   //   at org.jetbrains.java.decompiler.modules.decompiler.vars.VarDefinitionHelper.iterateClashingExprent(VarDefinitionHelper.java:1672)
   //   at org.jetbrains.java.decompiler.modules.decompiler.vars.VarDefinitionHelper.iterateClashingNames(VarDefinitionHelper.java:1492)
   //   at org.jetbrains.java.decompiler.modules.decompiler.vars.VarDefinitionHelper.iterateClashingNames(VarDefinitionHelper.java:1541)
   //   at org.jetbrains.java.decompiler.modules.decompiler.vars.VarDefinitionHelper.iterateClashingExprent(VarDefinitionHelper.java:1672)
   //   at org.jetbrains.java.decompiler.modules.decompiler.vars.VarDefinitionHelper.iterateClashingNames(VarDefinitionHelper.java:1492)
   //   at org.jetbrains.java.decompiler.modules.decompiler.vars.VarDefinitionHelper.iterateClashingNames(VarDefinitionHelper.java:1541)
   //   at org.jetbrains.java.decompiler.modules.decompiler.vars.VarDefinitionHelper.iterateClashingExprent(VarDefinitionHelper.java:1672)
   //   at org.jetbrains.java.decompiler.modules.decompiler.vars.VarDefinitionHelper.iterateClashingNames(VarDefinitionHelper.java:1492)
   //   at org.jetbrains.java.decompiler.modules.decompiler.vars.VarDefinitionHelper.iterateClashingNames(VarDefinitionHelper.java:1541)
   //   at org.jetbrains.java.decompiler.modules.decompiler.vars.VarDefinitionHelper.iterateClashingExprent(VarDefinitionHelper.java:1672)
   //   at org.jetbrains.java.decompiler.modules.decompiler.vars.VarDefinitionHelper.iterateClashingNames(VarDefinitionHelper.java:1492)
   //   at org.jetbrains.java.decompiler.modules.decompiler.vars.VarDefinitionHelper.iterateClashingNames(VarDefinitionHelper.java:1541)
   //   at org.jetbrains.java.decompiler.modules.decompiler.vars.VarDefinitionHelper.iterateClashingExprent(VarDefinitionHelper.java:1672)
   //   at org.jetbrains.java.decompiler.modules.decompiler.vars.VarDefinitionHelper.iterateClashingNames(VarDefinitionHelper.java:1492)
   //   at org.jetbrains.java.decompiler.modules.decompiler.vars.VarDefinitionHelper.iterateClashingNames(VarDefinitionHelper.java:1541)
   //   at org.jetbrains.java.decompiler.modules.decompiler.vars.VarDefinitionHelper.iterateClashingExprent(VarDefinitionHelper.java:1672)
   //   at org.jetbrains.java.decompiler.modules.decompiler.vars.VarDefinitionHelper.iterateClashingNames(VarDefinitionHelper.java:1492)
   //   at org.jetbrains.java.decompiler.modules.decompiler.vars.VarDefinitionHelper.iterateClashingNames(VarDefinitionHelper.java:1541)
   //   at org.jetbrains.java.decompiler.modules.decompiler.vars.VarDefinitionHelper.iterateClashingExprent(VarDefinitionHelper.java:1672)
   //   at org.jetbrains.java.decompiler.modules.decompiler.vars.VarDefinitionHelper.iterateClashingNames(VarDefinitionHelper.java:1492)
   //   at org.jetbrains.java.decompiler.modules.decompiler.vars.VarDefinitionHelper.iterateClashingNames(VarDefinitionHelper.java:1541)
   //   at org.jetbrains.java.decompiler.modules.decompiler.vars.VarDefinitionHelper.iterateClashingExprent(VarDefinitionHelper.java:1672)
   //   at org.jetbrains.java.decompiler.modules.decompiler.vars.VarDefinitionHelper.iterateClashingNames(VarDefinitionHelper.java:1492)
   //   at org.jetbrains.java.decompiler.modules.decompiler.vars.VarDefinitionHelper.iterateClashingNames(VarDefinitionHelper.java:1541)
   //   at org.jetbrains.java.decompiler.modules.decompiler.vars.VarDefinitionHelper.iterateClashingExprent(VarDefinitionHelper.java:1672)
   //   at org.jetbrains.java.decompiler.modules.decompiler.vars.VarDefinitionHelper.iterateClashingNames(VarDefinitionHelper.java:1492)
   //   at org.jetbrains.java.decompiler.modules.decompiler.vars.VarDefinitionHelper.iterateClashingNames(VarDefinitionHelper.java:1541)
   //   at org.jetbrains.java.decompiler.modules.decompiler.vars.VarDefinitionHelper.iterateClashingExprent(VarDefinitionHelper.java:1672)
   //   at org.jetbrains.java.decompiler.modules.decompiler.vars.VarDefinitionHelper.iterateClashingNames(VarDefinitionHelper.java:1492)
   //   at org.jetbrains.java.decompiler.modules.decompiler.vars.VarDefinitionHelper.iterateClashingNames(VarDefinitionHelper.java:1541)
   //   at org.jetbrains.java.decompiler.modules.decompiler.vars.VarDefinitionHelper.iterateClashingExprent(VarDefinitionHelper.java:1672)
   //   at org.jetbrains.java.decompiler.modules.decompiler.vars.VarDefinitionHelper.iterateClashingNames(VarDefinitionHelper.java:1492)
   //   at org.jetbrains.java.decompiler.modules.decompiler.vars.VarDefinitionHelper.iterateClashingNames(VarDefinitionHelper.java:1541)
   //   at org.jetbrains.java.decompiler.modules.decompiler.vars.VarDefinitionHelper.iterateClashingExprent(VarDefinitionHelper.java:1672)
   //   at org.jetbrains.java.decompiler.modules.decompiler.vars.VarDefinitionHelper.iterateClashingNames(VarDefinitionHelper.java:1492)
   //   at org.jetbrains.java.decompiler.modules.decompiler.vars.VarDefinitionHelper.iterateClashingNames(VarDefinitionHelper.java:1541)
   //   at org.jetbrains.java.decompiler.modules.decompiler.vars.VarDefinitionHelper.iterateClashingExprent(VarDefinitionHelper.java:1672)
   //   at org.jetbrains.java.decompiler.modules.decompiler.vars.VarDefinitionHelper.iterateClashingNames(VarDefinitionHelper.java:1492)
   //   at org.jetbrains.java.decompiler.modules.decompiler.vars.VarDefinitionHelper.iterateClashingNames(VarDefinitionHelper.java:1541)
   //   at org.jetbrains.java.decompiler.modules.decompiler.vars.VarDefinitionHelper.iterateClashingExprent(VarDefinitionHelper.java:1672)
   //   at org.jetbrains.java.decompiler.modules.decompiler.vars.VarDefinitionHelper.iterateClashingNames(VarDefinitionHelper.java:1492)
   //   at org.jetbrains.java.decompiler.modules.decompiler.vars.VarDefinitionHelper.iterateClashingNames(VarDefinitionHelper.java:1541)
   //   at org.jetbrains.java.decompiler.modules.decompiler.vars.VarDefinitionHelper.iterateClashingExprent(VarDefinitionHelper.java:1672)
   //   at org.jetbrains.java.decompiler.modules.decompiler.vars.VarDefinitionHelper.iterateClashingNames(VarDefinitionHelper.java:1492)
   //   at org.jetbrains.java.decompiler.modules.decompiler.vars.VarDefinitionHelper.iterateClashingNames(VarDefinitionHelper.java:1541)
   //   at org.jetbrains.java.decompiler.modules.decompiler.vars.VarDefinitionHelper.iterateClashingExprent(VarDefinitionHelper.java:1672)
   //   at org.jetbrains.java.decompiler.modules.decompiler.vars.VarDefinitionHelper.iterateClashingNames(VarDefinitionHelper.java:1492)
   //   at org.jetbrains.java.decompiler.modules.decompiler.vars.VarDefinitionHelper.iterateClashingNames(VarDefinitionHelper.java:1541)
   //   at org.jetbrains.java.decompiler.modules.decompiler.vars.VarDefinitionHelper.iterateClashingExprent(VarDefinitionHelper.java:1672)
   //   at org.jetbrains.java.decompiler.modules.decompiler.vars.VarDefinitionHelper.iterateClashingNames(VarDefinitionHelper.java:1492)
   //   at org.jetbrains.java.decompiler.modules.decompiler.vars.VarDefinitionHelper.iterateClashingNames(VarDefinitionHelper.java:1541)
   //   at org.jetbrains.java.decompiler.modules.decompiler.vars.VarDefinitionHelper.iterateClashingExprent(VarDefinitionHelper.java:1672)
   //   at org.jetbrains.java.decompiler.modules.decompiler.vars.VarDefinitionHelper.iterateClashingNames(VarDefinitionHelper.java:1492)
   //   at org.jetbrains.java.decompiler.modules.decompiler.vars.VarDefinitionHelper.iterateClashingNames(VarDefinitionHelper.java:1541)
   //   at org.jetbrains.java.decompiler.modules.decompiler.vars.VarDefinitionHelper.iterateClashingExprent(VarDefinitionHelper.java:1672)
   //   at org.jetbrains.java.decompiler.modules.decompiler.vars.VarDefinitionHelper.iterateClashingNames(VarDefinitionHelper.java:1492)
   //   at org.jetbrains.java.decompiler.modules.decompiler.vars.VarDefinitionHelper.iterateClashingNames(VarDefinitionHelper.java:1541)
   //   at org.jetbrains.java.decompiler.modules.decompiler.vars.VarDefinitionHelper.iterateClashingExprent(VarDefinitionHelper.java:1672)
   //   at org.jetbrains.java.decompiler.modules.decompiler.vars.VarDefinitionHelper.iterateClashingNames(VarDefinitionHelper.java:1492)
   //   at org.jetbrains.java.decompiler.modules.decompiler.vars.VarDefinitionHelper.iterateClashingNames(VarDefinitionHelper.java:1541)
   //   at org.jetbrains.java.decompiler.modules.decompiler.vars.VarDefinitionHelper.iterateClashingExprent(VarDefinitionHelper.java:1672)
   //   at org.jetbrains.java.decompiler.modules.decompiler.vars.VarDefinitionHelper.iterateClashingNames(VarDefinitionHelper.java:1492)
   //   at org.jetbrains.java.decompiler.modules.decompiler.vars.VarDefinitionHelper.iterateClashingNames(VarDefinitionHelper.java:1541)
   //   at org.jetbrains.java.decompiler.modules.decompiler.vars.VarDefinitionHelper.iterateClashingExprent(VarDefinitionHelper.java:1672)
   //   at org.jetbrains.java.decompiler.modules.decompiler.vars.VarDefinitionHelper.iterateClashingNames(VarDefinitionHelper.java:1492)
   //   at org.jetbrains.java.decompiler.modules.decompiler.vars.VarDefinitionHelper.iterateClashingNames(VarDefinitionHelper.java:1541)
   //   at org.jetbrains.java.decompiler.modules.decompiler.vars.VarDefinitionHelper.iterateClashingExprent(VarDefinitionHelper.java:1672)
   //   at org.jetbrains.java.decompiler.modules.decompiler.vars.VarDefinitionHelper.iterateClashingNames(VarDefinitionHelper.java:1492)
   //   at org.jetbrains.java.decompiler.modules.decompiler.vars.VarDefinitionHelper.iterateClashingNames(VarDefinitionHelper.java:1541)
   //   at org.jetbrains.java.decompiler.modules.decompiler.vars.VarDefinitionHelper.iterateClashingExprent(VarDefinitionHelper.java:1672)
   //   at org.jetbrains.java.decompiler.modules.decompiler.vars.VarDefinitionHelper.iterateClashingNames(VarDefinitionHelper.java:1492)
   //   at org.jetbrains.java.decompiler.modules.decompiler.vars.VarDefinitionHelper.iterateClashingNames(VarDefinitionHelper.java:1541)
   //   at org.jetbrains.java.decompiler.modules.decompiler.vars.VarDefinitionHelper.iterateClashingExprent(VarDefinitionHelper.java:1672)
   //   at org.jetbrains.java.decompiler.modules.decompiler.vars.VarDefinitionHelper.iterateClashingNames(VarDefinitionHelper.java:1492)
   //   at org.jetbrains.java.decompiler.modules.decompiler.vars.VarDefinitionHelper.iterateClashingNames(VarDefinitionHelper.java:1541)
   //   at org.jetbrains.java.decompiler.modules.decompiler.vars.VarDefinitionHelper.iterateClashingExprent(VarDefinitionHelper.java:1672)
   //   at org.jetbrains.java.decompiler.modules.decompiler.vars.VarDefinitionHelper.iterateClashingNames(VarDefinitionHelper.java:1492)
   //   at org.jetbrains.java.decompiler.modules.decompiler.vars.VarDefinitionHelper.iterateClashingNames(VarDefinitionHelper.java:1541)
   //   at org.jetbrains.java.decompiler.modules.decompiler.vars.VarDefinitionHelper.iterateClashingExprent(VarDefinitionHelper.java:1672)
   //   at org.jetbrains.java.decompiler.modules.decompiler.vars.VarDefinitionHelper.iterateClashingNames(VarDefinitionHelper.java:1492)
   //   at org.jetbrains.java.decompiler.modules.decompiler.vars.VarDefinitionHelper.iterateClashingNames(VarDefinitionHelper.java:1541)
   //   at org.jetbrains.java.decompiler.modules.decompiler.vars.VarDefinitionHelper.iterateClashingExprent(VarDefinitionHelper.java:1672)
   //   at org.jetbrains.java.decompiler.modules.decompiler.vars.VarDefinitionHelper.iterateClashingNames(VarDefinitionHelper.java:1492)
   //   at org.jetbrains.java.decompiler.modules.decompiler.vars.VarDefinitionHelper.iterateClashingNames(VarDefinitionHelper.java:1541)
   //   at org.jetbrains.java.decompiler.modules.decompiler.vars.VarDefinitionHelper.iterateClashingExprent(VarDefinitionHelper.java:1672)
   //   at org.jetbrains.java.decompiler.modules.decompiler.vars.VarDefinitionHelper.iterateClashingNames(VarDefinitionHelper.java:1492)
   //   at org.jetbrains.java.decompiler.modules.decompiler.vars.VarDefinitionHelper.iterateClashingNames(VarDefinitionHelper.java:1541)
   //   at org.jetbrains.java.decompiler.modules.decompiler.vars.VarDefinitionHelper.iterateClashingExprent(VarDefinitionHelper.java:1672)
   //   at org.jetbrains.java.decompiler.modules.decompiler.vars.VarDefinitionHelper.iterateClashingNames(VarDefinitionHelper.java:1492)
   //   at org.jetbrains.java.decompiler.modules.decompiler.vars.VarDefinitionHelper.iterateClashingNames(VarDefinitionHelper.java:1541)
   //   at org.jetbrains.java.decompiler.modules.decompiler.vars.VarDefinitionHelper.iterateClashingExprent(VarDefinitionHelper.java:1672)
   //   at org.jetbrains.java.decompiler.modules.decompiler.vars.VarDefinitionHelper.iterateClashingNames(VarDefinitionHelper.java:1492)
   //   at org.jetbrains.java.decompiler.modules.decompiler.vars.VarDefinitionHelper.iterateClashingNames(VarDefinitionHelper.java:1541)
   //   at org.jetbrains.java.decompiler.modules.decompiler.vars.VarDefinitionHelper.iterateClashingExprent(VarDefinitionHelper.java:1672)
   //   at org.jetbrains.java.decompiler.modules.decompiler.vars.VarDefinitionHelper.iterateClashingNames(VarDefinitionHelper.java:1492)
   //   at org.jetbrains.java.decompiler.modules.decompiler.vars.VarDefinitionHelper.iterateClashingNames(VarDefinitionHelper.java:1541)
   //   at org.jetbrains.java.decompiler.modules.decompiler.vars.VarDefinitionHelper.iterateClashingExprent(VarDefinitionHelper.java:1672)
   //   at org.jetbrains.java.decompiler.modules.decompiler.vars.VarDefinitionHelper.iterateClashingNames(VarDefinitionHelper.java:1492)
   //   at org.jetbrains.java.decompiler.modules.decompiler.vars.VarDefinitionHelper.iterateClashingNames(VarDefinitionHelper.java:1541)
   //   at org.jetbrains.java.decompiler.modules.decompiler.vars.VarDefinitionHelper.iterateClashingExprent(VarDefinitionHelper.java:1672)
   //   at org.jetbrains.java.decompiler.modules.decompiler.vars.VarDefinitionHelper.iterateClashingNames(VarDefinitionHelper.java:1492)
   //   at org.jetbrains.java.decompiler.modules.decompiler.vars.VarDefinitionHelper.iterateClashingNames(VarDefinitionHelper.java:1541)
   //   at org.jetbrains.java.decompiler.modules.decompiler.vars.VarDefinitionHelper.iterateClashingExprent(VarDefinitionHelper.java:1672)
   //   at org.jetbrains.java.decompiler.modules.decompiler.vars.VarDefinitionHelper.iterateClashingNames(VarDefinitionHelper.java:1492)
   //   at org.jetbrains.java.decompiler.modules.decompiler.vars.VarDefinitionHelper.iterateClashingNames(VarDefinitionHelper.java:1541)
   //   at org.jetbrains.java.decompiler.modules.decompiler.vars.VarDefinitionHelper.iterateClashingExprent(VarDefinitionHelper.java:1672)
   //   at org.jetbrains.java.decompiler.modules.decompiler.vars.VarDefinitionHelper.iterateClashingNames(VarDefinitionHelper.java:1492)
   //   at org.jetbrains.java.decompiler.modules.decompiler.vars.VarDefinitionHelper.iterateClashingNames(VarDefinitionHelper.java:1541)
   //   at org.jetbrains.java.decompiler.modules.decompiler.vars.VarDefinitionHelper.iterateClashingExprent(VarDefinitionHelper.java:1672)
   //   at org.jetbrains.java.decompiler.modules.decompiler.vars.VarDefinitionHelper.iterateClashingNames(VarDefinitionHelper.java:1492)
   //   at org.jetbrains.java.decompiler.modules.decompiler.vars.VarDefinitionHelper.iterateClashingNames(VarDefinitionHelper.java:1541)
   //   at org.jetbrains.java.decompiler.modules.decompiler.vars.VarDefinitionHelper.iterateClashingExprent(VarDefinitionHelper.java:1672)
   //   at org.jetbrains.java.decompiler.modules.decompiler.vars.VarDefinitionHelper.iterateClashingNames(VarDefinitionHelper.java:1492)
   //   at org.jetbrains.java.decompiler.modules.decompiler.vars.VarDefinitionHelper.iterateClashingNames(VarDefinitionHelper.java:1541)
   //   at org.jetbrains.java.decompiler.modules.decompiler.vars.VarDefinitionHelper.iterateClashingExprent(VarDefinitionHelper.java:1672)
   //   at org.jetbrains.java.decompiler.modules.decompiler.vars.VarDefinitionHelper.iterateClashingNames(VarDefinitionHelper.java:1492)
   //   at org.jetbrains.java.decompiler.modules.decompiler.vars.VarDefinitionHelper.iterateClashingNames(VarDefinitionHelper.java:1541)
   //   at org.jetbrains.java.decompiler.modules.decompiler.vars.VarDefinitionHelper.iterateClashingExprent(VarDefinitionHelper.java:1672)
   //   at org.jetbrains.java.decompiler.modules.decompiler.vars.VarDefinitionHelper.iterateClashingNames(VarDefinitionHelper.java:1492)
   //   at org.jetbrains.java.decompiler.modules.decompiler.vars.VarDefinitionHelper.iterateClashingNames(VarDefinitionHelper.java:1541)
   //   at org.jetbrains.java.decompiler.modules.decompiler.vars.VarDefinitionHelper.iterateClashingExprent(VarDefinitionHelper.java:1672)
   //   at org.jetbrains.java.decompiler.modules.decompiler.vars.VarDefinitionHelper.iterateClashingNames(VarDefinitionHelper.java:1492)
   //   at org.jetbrains.java.decompiler.modules.decompiler.vars.VarDefinitionHelper.iterateClashingNames(VarDefinitionHelper.java:1541)
   //   at org.jetbrains.java.decompiler.modules.decompiler.vars.VarDefinitionHelper.iterateClashingExprent(VarDefinitionHelper.java:1672)
   //   at org.jetbrains.java.decompiler.modules.decompiler.vars.VarDefinitionHelper.iterateClashingNames(VarDefinitionHelper.java:1492)
   //   at org.jetbrains.java.decompiler.modules.decompiler.vars.VarDefinitionHelper.iterateClashingNames(VarDefinitionHelper.java:1541)
   //   at org.jetbrains.java.decompiler.modules.decompiler.vars.VarDefinitionHelper.iterateClashingExprent(VarDefinitionHelper.java:1672)
   //   at org.jetbrains.java.decompiler.modules.decompiler.vars.VarDefinitionHelper.iterateClashingNames(VarDefinitionHelper.java:1492)
   //   at org.jetbrains.java.decompiler.modules.decompiler.vars.VarDefinitionHelper.iterateClashingNames(VarDefinitionHelper.java:1541)
   //   at org.jetbrains.java.decompiler.modules.decompiler.vars.VarDefinitionHelper.iterateClashingExprent(VarDefinitionHelper.java:1672)
   //   at org.jetbrains.java.decompiler.modules.decompiler.vars.VarDefinitionHelper.iterateClashingNames(VarDefinitionHelper.java:1492)
   //   at org.jetbrains.java.decompiler.modules.decompiler.vars.VarDefinitionHelper.iterateClashingNames(VarDefinitionHelper.java:1541)
   //   at org.jetbrains.java.decompiler.modules.decompiler.vars.VarDefinitionHelper.iterateClashingExprent(VarDefinitionHelper.java:1672)
   //   at org.jetbrains.java.decompiler.modules.decompiler.vars.VarDefinitionHelper.iterateClashingNames(VarDefinitionHelper.java:1492)
   //   at org.jetbrains.java.decompiler.modules.decompiler.vars.VarDefinitionHelper.iterateClashingNames(VarDefinitionHelper.java:1541)
   //   at org.jetbrains.java.decompiler.modules.decompiler.vars.VarDefinitionHelper.iterateClashingExprent(VarDefinitionHelper.java:1672)
   //   at org.jetbrains.java.decompiler.modules.decompiler.vars.VarDefinitionHelper.iterateClashingNames(VarDefinitionHelper.java:1492)
   //   at org.jetbrains.java.decompiler.modules.decompiler.vars.VarDefinitionHelper.iterateClashingNames(VarDefinitionHelper.java:1541)
   //   at org.jetbrains.java.decompiler.modules.decompiler.vars.VarDefinitionHelper.iterateClashingExprent(VarDefinitionHelper.java:1672)
   //   at org.jetbrains.java.decompiler.modules.decompiler.vars.VarDefinitionHelper.iterateClashingNames(VarDefinitionHelper.java:1492)
   //   at org.jetbrains.java.decompiler.modules.decompiler.vars.VarDefinitionHelper.iterateClashingNames(VarDefinitionHelper.java:1541)
   //   at org.jetbrains.java.decompiler.modules.decompiler.vars.VarDefinitionHelper.iterateClashingExprent(VarDefinitionHelper.java:1672)
   //   at org.jetbrains.java.decompiler.modules.decompiler.vars.VarDefinitionHelper.iterateClashingNames(VarDefinitionHelper.java:1492)
   //   at org.jetbrains.java.decompiler.modules.decompiler.vars.VarDefinitionHelper.iterateClashingNames(VarDefinitionHelper.java:1541)
   //   at org.jetbrains.java.decompiler.modules.decompiler.vars.VarDefinitionHelper.iterateClashingExprent(VarDefinitionHelper.java:1672)
   //   at org.jetbrains.java.decompiler.modules.decompiler.vars.VarDefinitionHelper.iterateClashingNames(VarDefinitionHelper.java:1492)
   //   at org.jetbrains.java.decompiler.modules.decompiler.vars.VarDefinitionHelper.iterateClashingNames(VarDefinitionHelper.java:1541)
   //   at org.jetbrains.java.decompiler.modules.decompiler.vars.VarDefinitionHelper.iterateClashingExprent(VarDefinitionHelper.java:1672)
   //   at org.jetbrains.java.decompiler.modules.decompiler.vars.VarDefinitionHelper.iterateClashingNames(VarDefinitionHelper.java:1492)
   //   at org.jetbrains.java.decompiler.modules.decompiler.vars.VarDefinitionHelper.iterateClashingNames(VarDefinitionHelper.java:1541)
   //   at org.jetbrains.java.decompiler.modules.decompiler.vars.VarDefinitionHelper.iterateClashingExprent(VarDefinitionHelper.java:1672)
   //   at org.jetbrains.java.decompiler.modules.decompiler.vars.VarDefinitionHelper.iterateClashingNames(VarDefinitionHelper.java:1492)
   //   at org.jetbrains.java.decompiler.modules.decompiler.vars.VarDefinitionHelper.iterateClashingNames(VarDefinitionHelper.java:1541)
   //   at org.jetbrains.java.decompiler.modules.decompiler.vars.VarDefinitionHelper.iterateClashingExprent(VarDefinitionHelper.java:1672)
   //   at org.jetbrains.java.decompiler.modules.decompiler.vars.VarDefinitionHelper.iterateClashingNames(VarDefinitionHelper.java:1492)
   //   at org.jetbrains.java.decompiler.modules.decompiler.vars.VarDefinitionHelper.iterateClashingNames(VarDefinitionHelper.java:1541)
   //   at org.jetbrains.java.decompiler.modules.decompiler.vars.VarDefinitionHelper.iterateClashingExprent(VarDefinitionHelper.java:1672)
   //   at org.jetbrains.java.decompiler.modules.decompiler.vars.VarDefinitionHelper.iterateClashingNames(VarDefinitionHelper.java:1492)
   //   at org.jetbrains.java.decompiler.modules.decompiler.vars.VarDefinitionHelper.iterateClashingNames(VarDefinitionHelper.java:1541)
   //   at org.jetbrains.java.decompiler.modules.decompiler.vars.VarDefinitionHelper.iterateClashingExprent(VarDefinitionHelper.java:1672)
   //   at org.jetbrains.java.decompiler.modules.decompiler.vars.VarDefinitionHelper.iterateClashingNames(VarDefinitionHelper.java:1492)
   //   at org.jetbrains.java.decompiler.modules.decompiler.vars.VarDefinitionHelper.iterateClashingNames(VarDefinitionHelper.java:1541)
   //   at org.jetbrains.java.decompiler.modules.decompiler.vars.VarDefinitionHelper.iterateClashingExprent(VarDefinitionHelper.java:1672)
   //   at org.jetbrains.java.decompiler.modules.decompiler.vars.VarDefinitionHelper.iterateClashingNames(VarDefinitionHelper.java:1492)
   //   at org.jetbrains.java.decompiler.modules.decompiler.vars.VarDefinitionHelper.iterateClashingNames(VarDefinitionHelper.java:1541)
   //   at org.jetbrains.java.decompiler.modules.decompiler.vars.VarDefinitionHelper.iterateClashingExprent(VarDefinitionHelper.java:1672)
   //   at org.jetbrains.java.decompiler.modules.decompiler.vars.VarDefinitionHelper.iterateClashingNames(VarDefinitionHelper.java:1492)
   //   at org.jetbrains.java.decompiler.modules.decompiler.vars.VarDefinitionHelper.iterateClashingNames(VarDefinitionHelper.java:1541)
   //   at org.jetbrains.java.decompiler.modules.decompiler.vars.VarDefinitionHelper.iterateClashingExprent(VarDefinitionHelper.java:1672)
   //   at org.jetbrains.java.decompiler.modules.decompiler.vars.VarDefinitionHelper.iterateClashingNames(VarDefinitionHelper.java:1492)
   //   at org.jetbrains.java.decompiler.modules.decompiler.vars.VarDefinitionHelper.iterateClashingNames(VarDefinitionHelper.java:1541)
   //   at org.jetbrains.java.decompiler.modules.decompiler.vars.VarDefinitionHelper.iterateClashingExprent(VarDefinitionHelper.java:1672)
   //   at org.jetbrains.java.decompiler.modules.decompiler.vars.VarDefinitionHelper.iterateClashingNames(VarDefinitionHelper.java:1492)
   //   at org.jetbrains.java.decompiler.modules.decompiler.vars.VarDefinitionHelper.iterateClashingNames(VarDefinitionHelper.java:1541)
   //   at org.jetbrains.java.decompiler.modules.decompiler.vars.VarDefinitionHelper.iterateClashingExprent(VarDefinitionHelper.java:1672)
   //   at org.jetbrains.java.decompiler.modules.decompiler.vars.VarDefinitionHelper.iterateClashingNames(VarDefinitionHelper.java:1492)
   //   at org.jetbrains.java.decompiler.modules.decompiler.vars.VarDefinitionHelper.iterateClashingNames(VarDefinitionHelper.java:1541)
   //   at org.jetbrains.java.decompiler.modules.decompiler.vars.VarDefinitionHelper.iterateClashingExprent(VarDefinitionHelper.java:1672)
   //   at org.jetbrains.java.decompiler.modules.decompiler.vars.VarDefinitionHelper.iterateClashingNames(VarDefinitionHelper.java:1492)
   //   at org.jetbrains.java.decompiler.modules.decompiler.vars.VarDefinitionHelper.iterateClashingNames(VarDefinitionHelper.java:1541)
   //   at org.jetbrains.java.decompiler.modules.decompiler.vars.VarDefinitionHelper.iterateClashingExprent(VarDefinitionHelper.java:1672)
   //   at org.jetbrains.java.decompiler.modules.decompiler.vars.VarDefinitionHelper.iterateClashingNames(VarDefinitionHelper.java:1492)
   //   at org.jetbrains.java.decompiler.modules.decompiler.vars.VarDefinitionHelper.iterateClashingNames(VarDefinitionHelper.java:1541)
   //   at org.jetbrains.java.decompiler.modules.decompiler.vars.VarDefinitionHelper.iterateClashingExprent(VarDefinitionHelper.java:1672)
   //   at org.jetbrains.java.decompiler.modules.decompiler.vars.VarDefinitionHelper.iterateClashingNames(VarDefinitionHelper.java:1492)
   //   at org.jetbrains.java.decompiler.modules.decompiler.vars.VarDefinitionHelper.iterateClashingNames(VarDefinitionHelper.java:1541)
   //   at org.jetbrains.java.decompiler.modules.decompiler.vars.VarDefinitionHelper.iterateClashingExprent(VarDefinitionHelper.java:1672)
   //   at org.jetbrains.java.decompiler.modules.decompiler.vars.VarDefinitionHelper.iterateClashingNames(VarDefinitionHelper.java:1492)
   //   at org.jetbrains.java.decompiler.modules.decompiler.vars.VarDefinitionHelper.iterateClashingNames(VarDefinitionHelper.java:1541)
   //   at org.jetbrains.java.decompiler.modules.decompiler.vars.VarDefinitionHelper.iterateClashingExprent(VarDefinitionHelper.java:1672)
   //   at org.jetbrains.java.decompiler.modules.decompiler.vars.VarDefinitionHelper.iterateClashingNames(VarDefinitionHelper.java:1492)
   //   at org.jetbrains.java.decompiler.modules.decompiler.vars.VarDefinitionHelper.iterateClashingNames(VarDefinitionHelper.java:1541)
   //   at org.jetbrains.java.decompiler.modules.decompiler.vars.VarDefinitionHelper.iterateClashingExprent(VarDefinitionHelper.java:1672)
   //   at org.jetbrains.java.decompiler.modules.decompiler.vars.VarDefinitionHelper.iterateClashingNames(VarDefinitionHelper.java:1492)
   //   at org.jetbrains.java.decompiler.modules.decompiler.vars.VarDefinitionHelper.iterateClashingNames(VarDefinitionHelper.java:1541)
   //   at org.jetbrains.java.decompiler.modules.decompiler.vars.VarDefinitionHelper.iterateClashingExprent(VarDefinitionHelper.java:1672)
   //   at org.jetbrains.java.decompiler.modules.decompiler.vars.VarDefinitionHelper.iterateClashingNames(VarDefinitionHelper.java:1492)
   //   at org.jetbrains.java.decompiler.modules.decompiler.vars.VarDefinitionHelper.iterateClashingNames(VarDefinitionHelper.java:1541)
   //   at org.jetbrains.java.decompiler.modules.decompiler.vars.VarDefinitionHelper.iterateClashingExprent(VarDefinitionHelper.java:1672)
   //   at org.jetbrains.java.decompiler.modules.decompiler.vars.VarDefinitionHelper.iterateClashingNames(VarDefinitionHelper.java:1492)
   //   at org.jetbrains.java.decompiler.modules.decompiler.vars.VarDefinitionHelper.iterateClashingNames(VarDefinitionHelper.java:1541)
   //   at org.jetbrains.java.decompiler.modules.decompiler.vars.VarDefinitionHelper.iterateClashingExprent(VarDefinitionHelper.java:1672)
   //   at org.jetbrains.java.decompiler.modules.decompiler.vars.VarDefinitionHelper.iterateClashingNames(VarDefinitionHelper.java:1492)
   //   at org.jetbrains.java.decompiler.modules.decompiler.vars.VarDefinitionHelper.iterateClashingNames(VarDefinitionHelper.java:1541)
   //   at org.jetbrains.java.decompiler.modules.decompiler.vars.VarDefinitionHelper.iterateClashingExprent(VarDefinitionHelper.java:1672)
   //   at org.jetbrains.java.decompiler.modules.decompiler.vars.VarDefinitionHelper.iterateClashingNames(VarDefinitionHelper.java:1492)
   //   at org.jetbrains.java.decompiler.modules.decompiler.vars.VarDefinitionHelper.iterateClashingNames(VarDefinitionHelper.java:1541)
   //   at org.jetbrains.java.decompiler.modules.decompiler.vars.VarDefinitionHelper.iterateClashingExprent(VarDefinitionHelper.java:1672)
   //   at org.jetbrains.java.decompiler.modules.decompiler.vars.VarDefinitionHelper.iterateClashingNames(VarDefinitionHelper.java:1492)
   //   at org.jetbrains.java.decompiler.modules.decompiler.vars.VarDefinitionHelper.iterateClashingNames(VarDefinitionHelper.java:1541)
   //   at org.jetbrains.java.decompiler.modules.decompiler.vars.VarDefinitionHelper.iterateClashingExprent(VarDefinitionHelper.java:1672)
   //   at org.jetbrains.java.decompiler.modules.decompiler.vars.VarDefinitionHelper.iterateClashingNames(VarDefinitionHelper.java:1492)
   //   at org.jetbrains.java.decompiler.modules.decompiler.vars.VarDefinitionHelper.iterateClashingNames(VarDefinitionHelper.java:1541)
   //   at org.jetbrains.java.decompiler.modules.decompiler.vars.VarDefinitionHelper.iterateClashingExprent(VarDefinitionHelper.java:1672)
   //   at org.jetbrains.java.decompiler.modules.decompiler.vars.VarDefinitionHelper.iterateClashingNames(VarDefinitionHelper.java:1492)
   //   at org.jetbrains.java.decompiler.modules.decompiler.vars.VarDefinitionHelper.iterateClashingNames(VarDefinitionHelper.java:1541)
   //   at org.jetbrains.java.decompiler.modules.decompiler.vars.VarDefinitionHelper.iterateClashingExprent(VarDefinitionHelper.java:1672)
   //   at org.jetbrains.java.decompiler.modules.decompiler.vars.VarDefinitionHelper.iterateClashingNames(VarDefinitionHelper.java:1492)
   //   at org.jetbrains.java.decompiler.modules.decompiler.vars.VarDefinitionHelper.iterateClashingNames(VarDefinitionHelper.java:1541)
   //   at org.jetbrains.java.decompiler.modules.decompiler.vars.VarDefinitionHelper.iterateClashingExprent(VarDefinitionHelper.java:1672)
   //   at org.jetbrains.java.decompiler.modules.decompiler.vars.VarDefinitionHelper.iterateClashingNames(VarDefinitionHelper.java:1492)
   //   at org.jetbrains.java.decompiler.modules.decompiler.vars.VarDefinitionHelper.iterateClashingNames(VarDefinitionHelper.java:1541)
   //   at org.jetbrains.java.decompiler.modules.decompiler.vars.VarDefinitionHelper.iterateClashingExprent(VarDefinitionHelper.java:1672)
   //   at org.jetbrains.java.decompiler.modules.decompiler.vars.VarDefinitionHelper.iterateClashingNames(VarDefinitionHelper.java:1492)
   //   at org.jetbrains.java.decompiler.modules.decompiler.vars.VarDefinitionHelper.iterateClashingNames(VarDefinitionHelper.java:1541)
   //   at org.jetbrains.java.decompiler.modules.decompiler.vars.VarDefinitionHelper.iterateClashingExprent(VarDefinitionHelper.java:1672)
   //   at org.jetbrains.java.decompiler.modules.decompiler.vars.VarDefinitionHelper.iterateClashingNames(VarDefinitionHelper.java:1492)
   //   at org.jetbrains.java.decompiler.modules.decompiler.vars.VarDefinitionHelper.iterateClashingNames(VarDefinitionHelper.java:1541)
   //   at org.jetbrains.java.decompiler.modules.decompiler.vars.VarDefinitionHelper.iterateClashingExprent(VarDefinitionHelper.java:1672)
   //   at org.jetbrains.java.decompiler.modules.decompiler.vars.VarDefinitionHelper.iterateClashingNames(VarDefinitionHelper.java:1492)
   //   at org.jetbrains.java.decompiler.modules.decompiler.vars.VarDefinitionHelper.iterateClashingNames(VarDefinitionHelper.java:1541)
   //   at org.jetbrains.java.decompiler.modules.decompiler.vars.VarDefinitionHelper.iterateClashingExprent(VarDefinitionHelper.java:1672)
   //   at org.jetbrains.java.decompiler.modules.decompiler.vars.VarDefinitionHelper.iterateClashingNames(VarDefinitionHelper.java:1492)
   //   at org.jetbrains.java.decompiler.modules.decompiler.vars.VarDefinitionHelper.iterateClashingNames(VarDefinitionHelper.java:1541)
   //   at org.jetbrains.java.decompiler.modules.decompiler.vars.VarDefinitionHelper.iterateClashingExprent(VarDefinitionHelper.java:1672)
   //   at org.jetbrains.java.decompiler.modules.decompiler.vars.VarDefinitionHelper.iterateClashingNames(VarDefinitionHelper.java:1492)
   //   at org.jetbrains.java.decompiler.modules.decompiler.vars.VarDefinitionHelper.iterateClashingNames(VarDefinitionHelper.java:1541)
   //   at org.jetbrains.java.decompiler.modules.decompiler.vars.VarDefinitionHelper.iterateClashingExprent(VarDefinitionHelper.java:1672)
   //   at org.jetbrains.java.decompiler.modules.decompiler.vars.VarDefinitionHelper.iterateClashingNames(VarDefinitionHelper.java:1492)
   //   at org.jetbrains.java.decompiler.modules.decompiler.vars.VarDefinitionHelper.iterateClashingNames(VarDefinitionHelper.java:1541)
   //   at org.jetbrains.java.decompiler.modules.decompiler.vars.VarDefinitionHelper.iterateClashingExprent(VarDefinitionHelper.java:1672)
   //   at org.jetbrains.java.decompiler.modules.decompiler.vars.VarDefinitionHelper.iterateClashingNames(VarDefinitionHelper.java:1492)
   //   at org.jetbrains.java.decompiler.modules.decompiler.vars.VarDefinitionHelper.iterateClashingNames(VarDefinitionHelper.java:1541)
   //   at org.jetbrains.java.decompiler.modules.decompiler.vars.VarDefinitionHelper.iterateClashingExprent(VarDefinitionHelper.java:1672)
   //   at org.jetbrains.java.decompiler.modules.decompiler.vars.VarDefinitionHelper.iterateClashingNames(VarDefinitionHelper.java:1492)
   //   at org.jetbrains.java.decompiler.modules.decompiler.vars.VarDefinitionHelper.iterateClashingNames(VarDefinitionHelper.java:1541)
   //   at org.jetbrains.java.decompiler.modules.decompiler.vars.VarDefinitionHelper.iterateClashingExprent(VarDefinitionHelper.java:1672)
   //   at org.jetbrains.java.decompiler.modules.decompiler.vars.VarDefinitionHelper.iterateClashingNames(VarDefinitionHelper.java:1492)
   //   at org.jetbrains.java.decompiler.modules.decompiler.vars.VarDefinitionHelper.iterateClashingNames(VarDefinitionHelper.java:1541)
   //   at org.jetbrains.java.decompiler.modules.decompiler.vars.VarDefinitionHelper.iterateClashingExprent(VarDefinitionHelper.java:1672)
   //   at org.jetbrains.java.decompiler.modules.decompiler.vars.VarDefinitionHelper.iterateClashingNames(VarDefinitionHelper.java:1492)
   //   at org.jetbrains.java.decompiler.modules.decompiler.vars.VarDefinitionHelper.iterateClashingNames(VarDefinitionHelper.java:1541)
   //   at org.jetbrains.java.decompiler.modules.decompiler.vars.VarDefinitionHelper.iterateClashingExprent(VarDefinitionHelper.java:1672)
   //   at org.jetbrains.java.decompiler.modules.decompiler.vars.VarDefinitionHelper.iterateClashingNames(VarDefinitionHelper.java:1492)
   //   at org.jetbrains.java.decompiler.modules.decompiler.vars.VarDefinitionHelper.iterateClashingNames(VarDefinitionHelper.java:1541)
   //   at org.jetbrains.java.decompiler.modules.decompiler.vars.VarDefinitionHelper.iterateClashingExprent(VarDefinitionHelper.java:1672)
   //   at org.jetbrains.java.decompiler.modules.decompiler.vars.VarDefinitionHelper.iterateClashingNames(VarDefinitionHelper.java:1492)
   //   at org.jetbrains.java.decompiler.modules.decompiler.vars.VarDefinitionHelper.iterateClashingNames(VarDefinitionHelper.java:1541)
   //   at org.jetbrains.java.decompiler.modules.decompiler.vars.VarDefinitionHelper.iterateClashingExprent(VarDefinitionHelper.java:1672)
   //   at org.jetbrains.java.decompiler.modules.decompiler.vars.VarDefinitionHelper.iterateClashingNames(VarDefinitionHelper.java:1492)
   //   at org.jetbrains.java.decompiler.modules.decompiler.vars.VarDefinitionHelper.iterateClashingNames(VarDefinitionHelper.java:1541)
   //   at org.jetbrains.java.decompiler.modules.decompiler.vars.VarDefinitionHelper.iterateClashingExprent(VarDefinitionHelper.java:1672)
   //   at org.jetbrains.java.decompiler.modules.decompiler.vars.VarDefinitionHelper.iterateClashingNames(VarDefinitionHelper.java:1492)
   //   at org.jetbrains.java.decompiler.modules.decompiler.vars.VarDefinitionHelper.iterateClashingNames(VarDefinitionHelper.java:1541)
   //   at org.jetbrains.java.decompiler.modules.decompiler.vars.VarDefinitionHelper.iterateClashingExprent(VarDefinitionHelper.java:1672)
   //   at org.jetbrains.java.decompiler.modules.decompiler.vars.VarDefinitionHelper.iterateClashingNames(VarDefinitionHelper.java:1492)
   //   at org.jetbrains.java.decompiler.modules.decompiler.vars.VarDefinitionHelper.iterateClashingNames(VarDefinitionHelper.java:1541)
   //   at org.jetbrains.java.decompiler.modules.decompiler.vars.VarDefinitionHelper.iterateClashingExprent(VarDefinitionHelper.java:1672)
   //   at org.jetbrains.java.decompiler.modules.decompiler.vars.VarDefinitionHelper.iterateClashingNames(VarDefinitionHelper.java:1492)
   //   at org.jetbrains.java.decompiler.modules.decompiler.vars.VarDefinitionHelper.iterateClashingNames(VarDefinitionHelper.java:1541)
   //   at org.jetbrains.java.decompiler.modules.decompiler.vars.VarDefinitionHelper.iterateClashingExprent(VarDefinitionHelper.java:1672)
   //   at org.jetbrains.java.decompiler.modules.decompiler.vars.VarDefinitionHelper.iterateClashingNames(VarDefinitionHelper.java:1492)
   //   at org.jetbrains.java.decompiler.modules.decompiler.vars.VarDefinitionHelper.iterateClashingNames(VarDefinitionHelper.java:1541)
   //   at org.jetbrains.java.decompiler.modules.decompiler.vars.VarDefinitionHelper.iterateClashingExprent(VarDefinitionHelper.java:1672)
   //   at org.jetbrains.java.decompiler.modules.decompiler.vars.VarDefinitionHelper.iterateClashingNames(VarDefinitionHelper.java:1492)
   //   at org.jetbrains.java.decompiler.modules.decompiler.vars.VarDefinitionHelper.iterateClashingNames(VarDefinitionHelper.java:1541)
   //   at org.jetbrains.java.decompiler.modules.decompiler.vars.VarDefinitionHelper.iterateClashingExprent(VarDefinitionHelper.java:1672)
   //   at org.jetbrains.java.decompiler.modules.decompiler.vars.VarDefinitionHelper.iterateClashingNames(VarDefinitionHelper.java:1492)
   //   at org.jetbrains.java.decompiler.modules.decompiler.vars.VarDefinitionHelper.iterateClashingNames(VarDefinitionHelper.java:1541)
   //   at org.jetbrains.java.decompiler.modules.decompiler.vars.VarDefinitionHelper.iterateClashingExprent(VarDefinitionHelper.java:1672)
   //   at org.jetbrains.java.decompiler.modules.decompiler.vars.VarDefinitionHelper.iterateClashingNames(VarDefinitionHelper.java:1492)
   //   at org.jetbrains.java.decompiler.modules.decompiler.vars.VarDefinitionHelper.iterateClashingNames(VarDefinitionHelper.java:1541)
   //   at org.jetbrains.java.decompiler.modules.decompiler.vars.VarDefinitionHelper.iterateClashingExprent(VarDefinitionHelper.java:1672)
   //   at org.jetbrains.java.decompiler.modules.decompiler.vars.VarDefinitionHelper.iterateClashingNames(VarDefinitionHelper.java:1492)
   //   at org.jetbrains.java.decompiler.modules.decompiler.vars.VarDefinitionHelper.iterateClashingNames(VarDefinitionHelper.java:1541)
   //   at org.jetbrains.java.decompiler.modules.decompiler.vars.VarDefinitionHelper.iterateClashingExprent(VarDefinitionHelper.java:1672)
   //   at org.jetbrains.java.decompiler.modules.decompiler.vars.VarDefinitionHelper.iterateClashingNames(VarDefinitionHelper.java:1492)
   //   at org.jetbrains.java.decompiler.modules.decompiler.vars.VarDefinitionHelper.iterateClashingNames(VarDefinitionHelper.java:1541)
   //   at org.jetbrains.java.decompiler.modules.decompiler.vars.VarDefinitionHelper.iterateClashingExprent(VarDefinitionHelper.java:1672)
   //   at org.jetbrains.java.decompiler.modules.decompiler.vars.VarDefinitionHelper.iterateClashingNames(VarDefinitionHelper.java:1492)
   //   at org.jetbrains.java.decompiler.modules.decompiler.vars.VarDefinitionHelper.iterateClashingNames(VarDefinitionHelper.java:1541)
   //   at org.jetbrains.java.decompiler.modules.decompiler.vars.VarDefinitionHelper.iterateClashingExprent(VarDefinitionHelper.java:1672)
   //   at org.jetbrains.java.decompiler.modules.decompiler.vars.VarDefinitionHelper.iterateClashingNames(VarDefinitionHelper.java:1492)
   //   at org.jetbrains.java.decompiler.modules.decompiler.vars.VarDefinitionHelper.iterateClashingNames(VarDefinitionHelper.java:1541)
   //   at org.jetbrains.java.decompiler.modules.decompiler.vars.VarDefinitionHelper.iterateClashingExprent(VarDefinitionHelper.java:1672)
   //   at org.jetbrains.java.decompiler.modules.decompiler.vars.VarDefinitionHelper.iterateClashingNames(VarDefinitionHelper.java:1492)
   //   at org.jetbrains.java.decompiler.modules.decompiler.vars.VarDefinitionHelper.iterateClashingNames(VarDefinitionHelper.java:1541)
   //   at org.jetbrains.java.decompiler.modules.decompiler.vars.VarDefinitionHelper.iterateClashingExprent(VarDefinitionHelper.java:1672)
   //   at org.jetbrains.java.decompiler.modules.decompiler.vars.VarDefinitionHelper.iterateClashingNames(VarDefinitionHelper.java:1492)
   //   at org.jetbrains.java.decompiler.modules.decompiler.vars.VarDefinitionHelper.iterateClashingNames(VarDefinitionHelper.java:1541)
   //   at org.jetbrains.java.decompiler.modules.decompiler.vars.VarDefinitionHelper.iterateClashingExprent(VarDefinitionHelper.java:1672)
   //   at org.jetbrains.java.decompiler.modules.decompiler.vars.VarDefinitionHelper.iterateClashingNames(VarDefinitionHelper.java:1492)
   //   at org.jetbrains.java.decompiler.modules.decompiler.vars.VarDefinitionHelper.iterateClashingNames(VarDefinitionHelper.java:1541)
   //   at org.jetbrains.java.decompiler.modules.decompiler.vars.VarDefinitionHelper.iterateClashingExprent(VarDefinitionHelper.java:1672)
   //   at org.jetbrains.java.decompiler.modules.decompiler.vars.VarDefinitionHelper.iterateClashingNames(VarDefinitionHelper.java:1492)
   //   at org.jetbrains.java.decompiler.modules.decompiler.vars.VarDefinitionHelper.iterateClashingNames(VarDefinitionHelper.java:1541)
   //   at org.jetbrains.java.decompiler.modules.decompiler.vars.VarDefinitionHelper.iterateClashingExprent(VarDefinitionHelper.java:1672)
   //   at org.jetbrains.java.decompiler.modules.decompiler.vars.VarDefinitionHelper.iterateClashingNames(VarDefinitionHelper.java:1492)
   //   at org.jetbrains.java.decompiler.modules.decompiler.vars.VarDefinitionHelper.iterateClashingNames(VarDefinitionHelper.java:1541)
   //   at org.jetbrains.java.decompiler.modules.decompiler.vars.VarDefinitionHelper.iterateClashingExprent(VarDefinitionHelper.java:1672)
   //   at org.jetbrains.java.decompiler.modules.decompiler.vars.VarDefinitionHelper.iterateClashingNames(VarDefinitionHelper.java:1492)
   //   at org.jetbrains.java.decompiler.modules.decompiler.vars.VarDefinitionHelper.iterateClashingNames(VarDefinitionHelper.java:1541)
   //   at org.jetbrains.java.decompiler.modules.decompiler.vars.VarDefinitionHelper.iterateClashingExprent(VarDefinitionHelper.java:1672)
   //   at org.jetbrains.java.decompiler.modules.decompiler.vars.VarDefinitionHelper.iterateClashingNames(VarDefinitionHelper.java:1492)
   //   at org.jetbrains.java.decompiler.modules.decompiler.vars.VarDefinitionHelper.iterateClashingNames(VarDefinitionHelper.java:1541)
   //   at org.jetbrains.java.decompiler.modules.decompiler.vars.VarDefinitionHelper.iterateClashingExprent(VarDefinitionHelper.java:1672)
   //   at org.jetbrains.java.decompiler.modules.decompiler.vars.VarDefinitionHelper.iterateClashingNames(VarDefinitionHelper.java:1492)
   //   at org.jetbrains.java.decompiler.modules.decompiler.vars.VarDefinitionHelper.iterateClashingNames(VarDefinitionHelper.java:1541)
   //   at org.jetbrains.java.decompiler.modules.decompiler.vars.VarDefinitionHelper.iterateClashingExprent(VarDefinitionHelper.java:1672)
   //   at org.jetbrains.java.decompiler.modules.decompiler.vars.VarDefinitionHelper.iterateClashingNames(VarDefinitionHelper.java:1492)
   //   at org.jetbrains.java.decompiler.modules.decompiler.vars.VarDefinitionHelper.iterateClashingNames(VarDefinitionHelper.java:1541)
   //   at org.jetbrains.java.decompiler.modules.decompiler.vars.VarDefinitionHelper.iterateClashingExprent(VarDefinitionHelper.java:1672)
   //   at org.jetbrains.java.decompiler.modules.decompiler.vars.VarDefinitionHelper.iterateClashingNames(VarDefinitionHelper.java:1492)
   //   at org.jetbrains.java.decompiler.modules.decompiler.vars.VarDefinitionHelper.iterateClashingNames(VarDefinitionHelper.java:1541)
   //   at org.jetbrains.java.decompiler.modules.decompiler.vars.VarDefinitionHelper.iterateClashingExprent(VarDefinitionHelper.java:1672)
   //   at org.jetbrains.java.decompiler.modules.decompiler.vars.VarDefinitionHelper.iterateClashingNames(VarDefinitionHelper.java:1492)
   //   at org.jetbrains.java.decompiler.modules.decompiler.vars.VarDefinitionHelper.iterateClashingNames(VarDefinitionHelper.java:1541)
   //   at org.jetbrains.java.decompiler.modules.decompiler.vars.VarDefinitionHelper.iterateClashingExprent(VarDefinitionHelper.java:1672)
   //   at org.jetbrains.java.decompiler.modules.decompiler.vars.VarDefinitionHelper.iterateClashingNames(VarDefinitionHelper.java:1492)
   //   at org.jetbrains.java.decompiler.modules.decompiler.vars.VarDefinitionHelper.iterateClashingNames(VarDefinitionHelper.java:1541)
   //   at org.jetbrains.java.decompiler.modules.decompiler.vars.VarDefinitionHelper.iterateClashingExprent(VarDefinitionHelper.java:1672)
   //   at org.jetbrains.java.decompiler.modules.decompiler.vars.VarDefinitionHelper.iterateClashingNames(VarDefinitionHelper.java:1492)
   //   at org.jetbrains.java.decompiler.modules.decompiler.vars.VarDefinitionHelper.iterateClashingNames(VarDefinitionHelper.java:1541)
   //   at org.jetbrains.java.decompiler.modules.decompiler.vars.VarDefinitionHelper.iterateClashingExprent(VarDefinitionHelper.java:1672)
   //   at org.jetbrains.java.decompiler.modules.decompiler.vars.VarDefinitionHelper.iterateClashingNames(VarDefinitionHelper.java:1492)
   //   at org.jetbrains.java.decompiler.modules.decompiler.vars.VarDefinitionHelper.iterateClashingNames(VarDefinitionHelper.java:1541)
   //   at org.jetbrains.java.decompiler.modules.decompiler.vars.VarDefinitionHelper.iterateClashingExprent(VarDefinitionHelper.java:1672)
   //   at org.jetbrains.java.decompiler.modules.decompiler.vars.VarDefinitionHelper.iterateClashingNames(VarDefinitionHelper.java:1492)
   //   at org.jetbrains.java.decompiler.modules.decompiler.vars.VarDefinitionHelper.iterateClashingNames(VarDefinitionHelper.java:1541)
   //   at org.jetbrains.java.decompiler.modules.decompiler.vars.VarDefinitionHelper.iterateClashingExprent(VarDefinitionHelper.java:1672)
   //   at org.jetbrains.java.decompiler.modules.decompiler.vars.VarDefinitionHelper.iterateClashingNames(VarDefinitionHelper.java:1492)
   //   at org.jetbrains.java.decompiler.modules.decompiler.vars.VarDefinitionHelper.iterateClashingNames(VarDefinitionHelper.java:1541)
   //   at org.jetbrains.java.decompiler.modules.decompiler.vars.VarDefinitionHelper.iterateClashingExprent(VarDefinitionHelper.java:1672)
   //   at org.jetbrains.java.decompiler.modules.decompiler.vars.VarDefinitionHelper.iterateClashingNames(VarDefinitionHelper.java:1492)
   //   at org.jetbrains.java.decompiler.modules.decompiler.vars.VarDefinitionHelper.iterateClashingNames(VarDefinitionHelper.java:1541)
   //   at org.jetbrains.java.decompiler.modules.decompiler.vars.VarDefinitionHelper.iterateClashingExprent(VarDefinitionHelper.java:1672)
   //   at org.jetbrains.java.decompiler.modules.decompiler.vars.VarDefinitionHelper.iterateClashingNames(VarDefinitionHelper.java:1492)
   //   at org.jetbrains.java.decompiler.modules.decompiler.vars.VarDefinitionHelper.iterateClashingNames(VarDefinitionHelper.java:1541)
   //   at org.jetbrains.java.decompiler.modules.decompiler.vars.VarDefinitionHelper.iterateClashingExprent(VarDefinitionHelper.java:1672)
   //   at org.jetbrains.java.decompiler.modules.decompiler.vars.VarDefinitionHelper.iterateClashingNames(VarDefinitionHelper.java:1492)
   //   at org.jetbrains.java.decompiler.modules.decompiler.vars.VarDefinitionHelper.iterateClashingNames(VarDefinitionHelper.java:1541)
   //   at org.jetbrains.java.decompiler.modules.decompiler.vars.VarDefinitionHelper.iterateClashingExprent(VarDefinitionHelper.java:1672)
   //   at org.jetbrains.java.decompiler.modules.decompiler.vars.VarDefinitionHelper.iterateClashingNames(VarDefinitionHelper.java:1492)
   //   at org.jetbrains.java.decompiler.modules.decompiler.vars.VarDefinitionHelper.iterateClashingNames(VarDefinitionHelper.java:1541)
   //   at org.jetbrains.java.decompiler.modules.decompiler.vars.VarDefinitionHelper.iterateClashingExprent(VarDefinitionHelper.java:1672)
   //   at org.jetbrains.java.decompiler.modules.decompiler.vars.VarDefinitionHelper.iterateClashingNames(VarDefinitionHelper.java:1492)
   //   at org.jetbrains.java.decompiler.modules.decompiler.vars.VarDefinitionHelper.iterateClashingNames(VarDefinitionHelper.java:1541)
   //   at org.jetbrains.java.decompiler.modules.decompiler.vars.VarDefinitionHelper.iterateClashingExprent(VarDefinitionHelper.java:1672)
   //   at org.jetbrains.java.decompiler.modules.decompiler.vars.VarDefinitionHelper.iterateClashingNames(VarDefinitionHelper.java:1492)
   //   at org.jetbrains.java.decompiler.modules.decompiler.vars.VarDefinitionHelper.iterateClashingNames(VarDefinitionHelper.java:1541)
   //   at org.jetbrains.java.decompiler.modules.decompiler.vars.VarDefinitionHelper.iterateClashingExprent(VarDefinitionHelper.java:1672)
   //   at org.jetbrains.java.decompiler.modules.decompiler.vars.VarDefinitionHelper.iterateClashingNames(VarDefinitionHelper.java:1492)
   //   at org.jetbrains.java.decompiler.modules.decompiler.vars.VarDefinitionHelper.iterateClashingNames(VarDefinitionHelper.java:1541)
   //   at org.jetbrains.java.decompiler.modules.decompiler.vars.VarDefinitionHelper.iterateClashingExprent(VarDefinitionHelper.java:1672)
   //   at org.jetbrains.java.decompiler.modules.decompiler.vars.VarDefinitionHelper.iterateClashingNames(VarDefinitionHelper.java:1492)
   //   at org.jetbrains.java.decompiler.modules.decompiler.vars.VarDefinitionHelper.iterateClashingNames(VarDefinitionHelper.java:1541)
   //   at org.jetbrains.java.decompiler.modules.decompiler.vars.VarDefinitionHelper.iterateClashingExprent(VarDefinitionHelper.java:1672)
   //   at org.jetbrains.java.decompiler.modules.decompiler.vars.VarDefinitionHelper.iterateClashingNames(VarDefinitionHelper.java:1492)
   //   at org.jetbrains.java.decompiler.modules.decompiler.vars.VarDefinitionHelper.iterateClashingNames(VarDefinitionHelper.java:1541)
   //   at org.jetbrains.java.decompiler.modules.decompiler.vars.VarDefinitionHelper.iterateClashingExprent(VarDefinitionHelper.java:1672)
   //   at org.jetbrains.java.decompiler.modules.decompiler.vars.VarDefinitionHelper.iterateClashingNames(VarDefinitionHelper.java:1492)
   //   at org.jetbrains.java.decompiler.modules.decompiler.vars.VarDefinitionHelper.iterateClashingNames(VarDefinitionHelper.java:1541)
   //   at org.jetbrains.java.decompiler.modules.decompiler.vars.VarDefinitionHelper.iterateClashingExprent(VarDefinitionHelper.java:1672)
   //   at org.jetbrains.java.decompiler.modules.decompiler.vars.VarDefinitionHelper.iterateClashingNames(VarDefinitionHelper.java:1492)
   //   at org.jetbrains.java.decompiler.modules.decompiler.vars.VarDefinitionHelper.iterateClashingNames(VarDefinitionHelper.java:1541)
   //   at org.jetbrains.java.decompiler.modules.decompiler.vars.VarDefinitionHelper.iterateClashingExprent(VarDefinitionHelper.java:1672)
   //   at org.jetbrains.java.decompiler.modules.decompiler.vars.VarDefinitionHelper.iterateClashingNames(VarDefinitionHelper.java:1492)
   //   at org.jetbrains.java.decompiler.modules.decompiler.vars.VarDefinitionHelper.iterateClashingNames(VarDefinitionHelper.java:1541)
   //   at org.jetbrains.java.decompiler.modules.decompiler.vars.VarDefinitionHelper.iterateClashingExprent(VarDefinitionHelper.java:1672)
   //   at org.jetbrains.java.decompiler.modules.decompiler.vars.VarDefinitionHelper.iterateClashingNames(VarDefinitionHelper.java:1492)
   //   at org.jetbrains.java.decompiler.modules.decompiler.vars.VarDefinitionHelper.iterateClashingNames(VarDefinitionHelper.java:1541)
   //   at org.jetbrains.java.decompiler.modules.decompiler.vars.VarDefinitionHelper.iterateClashingExprent(VarDefinitionHelper.java:1672)
   //   at org.jetbrains.java.decompiler.modules.decompiler.vars.VarDefinitionHelper.iterateClashingNames(VarDefinitionHelper.java:1492)
   //   at org.jetbrains.java.decompiler.modules.decompiler.vars.VarDefinitionHelper.iterateClashingNames(VarDefinitionHelper.java:1541)
   //   at org.jetbrains.java.decompiler.modules.decompiler.vars.VarDefinitionHelper.iterateClashingExprent(VarDefinitionHelper.java:1672)
   //   at org.jetbrains.java.decompiler.modules.decompiler.vars.VarDefinitionHelper.iterateClashingNames(VarDefinitionHelper.java:1492)
   //   at org.jetbrains.java.decompiler.modules.decompiler.vars.VarDefinitionHelper.iterateClashingNames(VarDefinitionHelper.java:1541)
   //   at org.jetbrains.java.decompiler.modules.decompiler.vars.VarDefinitionHelper.iterateClashingExprent(VarDefinitionHelper.java:1672)
   //   at org.jetbrains.java.decompiler.modules.decompiler.vars.VarDefinitionHelper.iterateClashingNames(VarDefinitionHelper.java:1492)
   //   at org.jetbrains.java.decompiler.modules.decompiler.vars.VarDefinitionHelper.iterateClashingNames(VarDefinitionHelper.java:1541)
   //   at org.jetbrains.java.decompiler.modules.decompiler.vars.VarDefinitionHelper.iterateClashingExprent(VarDefinitionHelper.java:1672)
   //   at org.jetbrains.java.decompiler.modules.decompiler.vars.VarDefinitionHelper.iterateClashingNames(VarDefinitionHelper.java:1492)
   //   at org.jetbrains.java.decompiler.modules.decompiler.vars.VarDefinitionHelper.iterateClashingNames(VarDefinitionHelper.java:1541)
   //   at org.jetbrains.java.decompiler.modules.decompiler.vars.VarDefinitionHelper.iterateClashingExprent(VarDefinitionHelper.java:1672)
   //   at org.jetbrains.java.decompiler.modules.decompiler.vars.VarDefinitionHelper.iterateClashingNames(VarDefinitionHelper.java:1492)
   //   at org.jetbrains.java.decompiler.modules.decompiler.vars.VarDefinitionHelper.iterateClashingNames(VarDefinitionHelper.java:1541)
   //   at org.jetbrains.java.decompiler.modules.decompiler.vars.VarDefinitionHelper.iterateClashingExprent(VarDefinitionHelper.java:1672)
   //   at org.jetbrains.java.decompiler.modules.decompiler.vars.VarDefinitionHelper.iterateClashingNames(VarDefinitionHelper.java:1492)
   //   at org.jetbrains.java.decompiler.modules.decompiler.vars.VarDefinitionHelper.iterateClashingNames(VarDefinitionHelper.java:1541)
   //   at org.jetbrains.java.decompiler.modules.decompiler.vars.VarDefinitionHelper.iterateClashingExprent(VarDefinitionHelper.java:1672)
   //   at org.jetbrains.java.decompiler.modules.decompiler.vars.VarDefinitionHelper.iterateClashingNames(VarDefinitionHelper.java:1492)
   //   at org.jetbrains.java.decompiler.modules.decompiler.vars.VarDefinitionHelper.iterateClashingNames(VarDefinitionHelper.java:1541)
   //   at org.jetbrains.java.decompiler.modules.decompiler.vars.VarDefinitionHelper.iterateClashingExprent(VarDefinitionHelper.java:1672)
   //   at org.jetbrains.java.decompiler.modules.decompiler.vars.VarDefinitionHelper.iterateClashingNames(VarDefinitionHelper.java:1492)
   //   at org.jetbrains.java.decompiler.modules.decompiler.vars.VarDefinitionHelper.iterateClashingNames(VarDefinitionHelper.java:1541)
   //   at org.jetbrains.java.decompiler.modules.decompiler.vars.VarDefinitionHelper.iterateClashingExprent(VarDefinitionHelper.java:1672)
   //   at org.jetbrains.java.decompiler.modules.decompiler.vars.VarDefinitionHelper.iterateClashingNames(VarDefinitionHelper.java:1492)
   //   at org.jetbrains.java.decompiler.modules.decompiler.vars.VarDefinitionHelper.iterateClashingNames(VarDefinitionHelper.java:1541)
   //   at org.jetbrains.java.decompiler.modules.decompiler.vars.VarDefinitionHelper.iterateClashingExprent(VarDefinitionHelper.java:1672)
   //   at org.jetbrains.java.decompiler.modules.decompiler.vars.VarDefinitionHelper.iterateClashingNames(VarDefinitionHelper.java:1492)
   //   at org.jetbrains.java.decompiler.modules.decompiler.vars.VarDefinitionHelper.iterateClashingNames(VarDefinitionHelper.java:1541)
   //   at org.jetbrains.java.decompiler.modules.decompiler.vars.VarDefinitionHelper.iterateClashingExprent(VarDefinitionHelper.java:1672)
   //   at org.jetbrains.java.decompiler.modules.decompiler.vars.VarDefinitionHelper.iterateClashingNames(VarDefinitionHelper.java:1492)
   //   at org.jetbrains.java.decompiler.modules.decompiler.vars.VarDefinitionHelper.iterateClashingNames(VarDefinitionHelper.java:1541)
   //   at org.jetbrains.java.decompiler.modules.decompiler.vars.VarDefinitionHelper.iterateClashingExprent(VarDefinitionHelper.java:1672)
   //   at org.jetbrains.java.decompiler.modules.decompiler.vars.VarDefinitionHelper.iterateClashingNames(VarDefinitionHelper.java:1492)
   //   at org.jetbrains.java.decompiler.modules.decompiler.vars.VarDefinitionHelper.iterateClashingNames(VarDefinitionHelper.java:1541)
   //   at org.jetbrains.java.decompiler.modules.decompiler.vars.VarDefinitionHelper.iterateClashingExprent(VarDefinitionHelper.java:1672)
   //   at org.jetbrains.java.decompiler.modules.decompiler.vars.VarDefinitionHelper.iterateClashingNames(VarDefinitionHelper.java:1492)
   //   at org.jetbrains.java.decompiler.modules.decompiler.vars.VarDefinitionHelper.iterateClashingNames(VarDefinitionHelper.java:1541)
   //   at org.jetbrains.java.decompiler.modules.decompiler.vars.VarDefinitionHelper.iterateClashingExprent(VarDefinitionHelper.java:1672)
   //   at org.jetbrains.java.decompiler.modules.decompiler.vars.VarDefinitionHelper.iterateClashingNames(VarDefinitionHelper.java:1492)
   //   at org.jetbrains.java.decompiler.modules.decompiler.vars.VarDefinitionHelper.iterateClashingNames(VarDefinitionHelper.java:1541)
   //   at org.jetbrains.java.decompiler.modules.decompiler.vars.VarDefinitionHelper.iterateClashingExprent(VarDefinitionHelper.java:1672)
   //   at org.jetbrains.java.decompiler.modules.decompiler.vars.VarDefinitionHelper.iterateClashingNames(VarDefinitionHelper.java:1492)
   //   at org.jetbrains.java.decompiler.modules.decompiler.vars.VarDefinitionHelper.iterateClashingNames(VarDefinitionHelper.java:1541)
   //   at org.jetbrains.java.decompiler.modules.decompiler.vars.VarDefinitionHelper.iterateClashingExprent(VarDefinitionHelper.java:1672)
   //   at org.jetbrains.java.decompiler.modules.decompiler.vars.VarDefinitionHelper.iterateClashingNames(VarDefinitionHelper.java:1492)
   //   at org.jetbrains.java.decompiler.modules.decompiler.vars.VarDefinitionHelper.iterateClashingNames(VarDefinitionHelper.java:1541)
   //   at org.jetbrains.java.decompiler.modules.decompiler.vars.VarDefinitionHelper.iterateClashingExprent(VarDefinitionHelper.java:1672)
   //   at org.jetbrains.java.decompiler.modules.decompiler.vars.VarDefinitionHelper.iterateClashingNames(VarDefinitionHelper.java:1492)
   //   at org.jetbrains.java.decompiler.modules.decompiler.vars.VarDefinitionHelper.iterateClashingNames(VarDefinitionHelper.java:1541)
   //   at org.jetbrains.java.decompiler.modules.decompiler.vars.VarDefinitionHelper.iterateClashingExprent(VarDefinitionHelper.java:1672)
   //   at org.jetbrains.java.decompiler.modules.decompiler.vars.VarDefinitionHelper.iterateClashingNames(VarDefinitionHelper.java:1492)
   //   at org.jetbrains.java.decompiler.modules.decompiler.vars.VarDefinitionHelper.iterateClashingNames(VarDefinitionHelper.java:1541)
   //   at org.jetbrains.java.decompiler.modules.decompiler.vars.VarDefinitionHelper.iterateClashingExprent(VarDefinitionHelper.java:1672)
   //   at org.jetbrains.java.decompiler.modules.decompiler.vars.VarDefinitionHelper.iterateClashingNames(VarDefinitionHelper.java:1492)
   //   at org.jetbrains.java.decompiler.modules.decompiler.vars.VarDefinitionHelper.iterateClashingNames(VarDefinitionHelper.java:1541)
   //   at org.jetbrains.java.decompiler.modules.decompiler.vars.VarDefinitionHelper.iterateClashingExprent(VarDefinitionHelper.java:1672)
   //   at org.jetbrains.java.decompiler.modules.decompiler.vars.VarDefinitionHelper.iterateClashingNames(VarDefinitionHelper.java:1492)
   //   at org.jetbrains.java.decompiler.modules.decompiler.vars.VarDefinitionHelper.iterateClashingNames(VarDefinitionHelper.java:1541)
   //   at org.jetbrains.java.decompiler.modules.decompiler.vars.VarDefinitionHelper.iterateClashingExprent(VarDefinitionHelper.java:1672)
   //   at org.jetbrains.java.decompiler.modules.decompiler.vars.VarDefinitionHelper.iterateClashingNames(VarDefinitionHelper.java:1492)
   //   at org.jetbrains.java.decompiler.modules.decompiler.vars.VarDefinitionHelper.iterateClashingNames(VarDefinitionHelper.java:1541)
   //   at org.jetbrains.java.decompiler.modules.decompiler.vars.VarDefinitionHelper.iterateClashingExprent(VarDefinitionHelper.java:1672)
   //   at org.jetbrains.java.decompiler.modules.decompiler.vars.VarDefinitionHelper.iterateClashingNames(VarDefinitionHelper.java:1492)
   //   at org.jetbrains.java.decompiler.modules.decompiler.vars.VarDefinitionHelper.iterateClashingNames(VarDefinitionHelper.java:1541)
   //   at org.jetbrains.java.decompiler.modules.decompiler.vars.VarDefinitionHelper.iterateClashingExprent(VarDefinitionHelper.java:1672)
   //   at org.jetbrains.java.decompiler.modules.decompiler.vars.VarDefinitionHelper.iterateClashingNames(VarDefinitionHelper.java:1492)
   //   at org.jetbrains.java.decompiler.modules.decompiler.vars.VarDefinitionHelper.iterateClashingNames(VarDefinitionHelper.java:1541)
   //   at org.jetbrains.java.decompiler.modules.decompiler.vars.VarDefinitionHelper.iterateClashingExprent(VarDefinitionHelper.java:1672)
   //   at org.jetbrains.java.decompiler.modules.decompiler.vars.VarDefinitionHelper.iterateClashingNames(VarDefinitionHelper.java:1492)
   //   at org.jetbrains.java.decompiler.modules.decompiler.vars.VarDefinitionHelper.iterateClashingNames(VarDefinitionHelper.java:1541)
   //   at org.jetbrains.java.decompiler.modules.decompiler.vars.VarDefinitionHelper.iterateClashingExprent(VarDefinitionHelper.java:1672)
   //   at org.jetbrains.java.decompiler.modules.decompiler.vars.VarDefinitionHelper.iterateClashingNames(VarDefinitionHelper.java:1492)
   //   at org.jetbrains.java.decompiler.modules.decompiler.vars.VarDefinitionHelper.iterateClashingNames(VarDefinitionHelper.java:1541)
   //   at org.jetbrains.java.decompiler.modules.decompiler.vars.VarDefinitionHelper.iterateClashingExprent(VarDefinitionHelper.java:1672)
   //   at org.jetbrains.java.decompiler.modules.decompiler.vars.VarDefinitionHelper.iterateClashingNames(VarDefinitionHelper.java:1492)
   //   at org.jetbrains.java.decompiler.modules.decompiler.vars.VarDefinitionHelper.iterateClashingNames(VarDefinitionHelper.java:1541)
   //   at org.jetbrains.java.decompiler.modules.decompiler.vars.VarDefinitionHelper.iterateClashingExprent(VarDefinitionHelper.java:1672)
   //   at org.jetbrains.java.decompiler.modules.decompiler.vars.VarDefinitionHelper.iterateClashingNames(VarDefinitionHelper.java:1492)
   //   at org.jetbrains.java.decompiler.modules.decompiler.vars.VarDefinitionHelper.iterateClashingNames(VarDefinitionHelper.java:1541)
   //   at org.jetbrains.java.decompiler.modules.decompiler.vars.VarDefinitionHelper.iterateClashingExprent(VarDefinitionHelper.java:1672)
   //   at org.jetbrains.java.decompiler.modules.decompiler.vars.VarDefinitionHelper.iterateClashingNames(VarDefinitionHelper.java:1492)
   //   at org.jetbrains.java.decompiler.modules.decompiler.vars.VarDefinitionHelper.iterateClashingNames(VarDefinitionHelper.java:1541)
   //   at org.jetbrains.java.decompiler.modules.decompiler.vars.VarDefinitionHelper.iterateClashingExprent(VarDefinitionHelper.java:1672)
   //   at org.jetbrains.java.decompiler.modules.decompiler.vars.VarDefinitionHelper.iterateClashingNames(VarDefinitionHelper.java:1492)
   //   at org.jetbrains.java.decompiler.modules.decompiler.vars.VarDefinitionHelper.iterateClashingNames(VarDefinitionHelper.java:1541)
   //   at org.jetbrains.java.decompiler.modules.decompiler.vars.VarDefinitionHelper.iterateClashingExprent(VarDefinitionHelper.java:1672)
   //   at org.jetbrains.java.decompiler.modules.decompiler.vars.VarDefinitionHelper.iterateClashingNames(VarDefinitionHelper.java:1492)
   //   at org.jetbrains.java.decompiler.modules.decompiler.vars.VarDefinitionHelper.iterateClashingNames(VarDefinitionHelper.java:1541)
   //   at org.jetbrains.java.decompiler.modules.decompiler.vars.VarDefinitionHelper.iterateClashingExprent(VarDefinitionHelper.java:1672)
   //   at org.jetbrains.java.decompiler.modules.decompiler.vars.VarDefinitionHelper.iterateClashingNames(VarDefinitionHelper.java:1492)
   //   at org.jetbrains.java.decompiler.modules.decompiler.vars.VarDefinitionHelper.iterateClashingNames(VarDefinitionHelper.java:1541)
   //   at org.jetbrains.java.decompiler.modules.decompiler.vars.VarDefinitionHelper.iterateClashingExprent(VarDefinitionHelper.java:1672)
   //   at org.jetbrains.java.decompiler.modules.decompiler.vars.VarDefinitionHelper.iterateClashingNames(VarDefinitionHelper.java:1492)
   //   at org.jetbrains.java.decompiler.modules.decompiler.vars.VarDefinitionHelper.iterateClashingNames(VarDefinitionHelper.java:1541)
   //   at org.jetbrains.java.decompiler.modules.decompiler.vars.VarDefinitionHelper.iterateClashingExprent(VarDefinitionHelper.java:1672)
   //   at org.jetbrains.java.decompiler.modules.decompiler.vars.VarDefinitionHelper.iterateClashingNames(VarDefinitionHelper.java:1492)
   //   at org.jetbrains.java.decompiler.modules.decompiler.vars.VarDefinitionHelper.iterateClashingNames(VarDefinitionHelper.java:1541)
   //   at org.jetbrains.java.decompiler.modules.decompiler.vars.VarDefinitionHelper.iterateClashingExprent(VarDefinitionHelper.java:1672)
   //   at org.jetbrains.java.decompiler.modules.decompiler.vars.VarDefinitionHelper.iterateClashingNames(VarDefinitionHelper.java:1492)
   //   at org.jetbrains.java.decompiler.modules.decompiler.vars.VarDefinitionHelper.iterateClashingNames(VarDefinitionHelper.java:1541)
   //   at org.jetbrains.java.decompiler.modules.decompiler.vars.VarDefinitionHelper.iterateClashingExprent(VarDefinitionHelper.java:1672)
   //   at org.jetbrains.java.decompiler.modules.decompiler.vars.VarDefinitionHelper.iterateClashingNames(VarDefinitionHelper.java:1492)
   //   at org.jetbrains.java.decompiler.modules.decompiler.vars.VarDefinitionHelper.iterateClashingNames(VarDefinitionHelper.java:1541)
   //   at org.jetbrains.java.decompiler.modules.decompiler.vars.VarDefinitionHelper.iterateClashingExprent(VarDefinitionHelper.java:1672)
   //   at org.jetbrains.java.decompiler.modules.decompiler.vars.VarDefinitionHelper.iterateClashingNames(VarDefinitionHelper.java:1492)
   //   at org.jetbrains.java.decompiler.modules.decompiler.vars.VarDefinitionHelper.iterateClashingNames(VarDefinitionHelper.java:1541)
   //   at org.jetbrains.java.decompiler.modules.decompiler.vars.VarDefinitionHelper.iterateClashingExprent(VarDefinitionHelper.java:1672)
   //   at org.jetbrains.java.decompiler.modules.decompiler.vars.VarDefinitionHelper.iterateClashingNames(VarDefinitionHelper.java:1492)
   //   at org.jetbrains.java.decompiler.modules.decompiler.vars.VarDefinitionHelper.iterateClashingNames(VarDefinitionHelper.java:1541)
   //   at org.jetbrains.java.decompiler.modules.decompiler.vars.VarDefinitionHelper.iterateClashingExprent(VarDefinitionHelper.java:1672)
   //   at org.jetbrains.java.decompiler.modules.decompiler.vars.VarDefinitionHelper.iterateClashingNames(VarDefinitionHelper.java:1492)
   //   at org.jetbrains.java.decompiler.modules.decompiler.vars.VarDefinitionHelper.iterateClashingNames(VarDefinitionHelper.java:1541)
   //   at org.jetbrains.java.decompiler.modules.decompiler.vars.VarDefinitionHelper.iterateClashingExprent(VarDefinitionHelper.java:1672)
   //   at org.jetbrains.java.decompiler.modules.decompiler.vars.VarDefinitionHelper.iterateClashingNames(VarDefinitionHelper.java:1492)
   //   at org.jetbrains.java.decompiler.modules.decompiler.vars.VarDefinitionHelper.iterateClashingNames(VarDefinitionHelper.java:1541)
   //   at org.jetbrains.java.decompiler.modules.decompiler.vars.VarDefinitionHelper.iterateClashingExprent(VarDefinitionHelper.java:1672)
   //   at org.jetbrains.java.decompiler.modules.decompiler.vars.VarDefinitionHelper.iterateClashingNames(VarDefinitionHelper.java:1492)
   //   at org.jetbrains.java.decompiler.modules.decompiler.vars.VarDefinitionHelper.iterateClashingNames(VarDefinitionHelper.java:1541)
   //   at org.jetbrains.java.decompiler.modules.decompiler.vars.VarDefinitionHelper.iterateClashingExprent(VarDefinitionHelper.java:1672)
   //   at org.jetbrains.java.decompiler.modules.decompiler.vars.VarDefinitionHelper.iterateClashingNames(VarDefinitionHelper.java:1492)
   //   at org.jetbrains.java.decompiler.modules.decompiler.vars.VarDefinitionHelper.iterateClashingNames(VarDefinitionHelper.java:1541)
   //   at org.jetbrains.java.decompiler.modules.decompiler.vars.VarDefinitionHelper.iterateClashingExprent(VarDefinitionHelper.java:1672)
   //   at org.jetbrains.java.decompiler.modules.decompiler.vars.VarDefinitionHelper.iterateClashingNames(VarDefinitionHelper.java:1492)
   //   at org.jetbrains.java.decompiler.modules.decompiler.vars.VarDefinitionHelper.iterateClashingNames(VarDefinitionHelper.java:1541)
   //   at org.jetbrains.java.decompiler.modules.decompiler.vars.VarDefinitionHelper.iterateClashingExprent(VarDefinitionHelper.java:1672)
   //   at org.jetbrains.java.decompiler.modules.decompiler.vars.VarDefinitionHelper.iterateClashingNames(VarDefinitionHelper.java:1492)
   //   at org.jetbrains.java.decompiler.modules.decompiler.vars.VarDefinitionHelper.iterateClashingNames(VarDefinitionHelper.java:1541)
   //   at org.jetbrains.java.decompiler.modules.decompiler.vars.VarDefinitionHelper.iterateClashingExprent(VarDefinitionHelper.java:1672)
   //   at org.jetbrains.java.decompiler.modules.decompiler.vars.VarDefinitionHelper.iterateClashingNames(VarDefinitionHelper.java:1492)
   //   at org.jetbrains.java.decompiler.modules.decompiler.vars.VarDefinitionHelper.iterateClashingNames(VarDefinitionHelper.java:1541)
   //   at org.jetbrains.java.decompiler.modules.decompiler.vars.VarDefinitionHelper.iterateClashingExprent(VarDefinitionHelper.java:1672)
   //   at org.jetbrains.java.decompiler.modules.decompiler.vars.VarDefinitionHelper.iterateClashingNames(VarDefinitionHelper.java:1492)
   //   at org.jetbrains.java.decompiler.modules.decompiler.vars.VarDefinitionHelper.iterateClashingNames(VarDefinitionHelper.java:1541)
   //   at org.jetbrains.java.decompiler.modules.decompiler.vars.VarDefinitionHelper.iterateClashingExprent(VarDefinitionHelper.java:1672)
   //   at org.jetbrains.java.decompiler.modules.decompiler.vars.VarDefinitionHelper.iterateClashingNames(VarDefinitionHelper.java:1492)
   //   at org.jetbrains.java.decompiler.modules.decompiler.vars.VarDefinitionHelper.iterateClashingNames(VarDefinitionHelper.java:1541)
   //   at org.jetbrains.java.decompiler.modules.decompiler.vars.VarDefinitionHelper.iterateClashingExprent(VarDefinitionHelper.java:1672)
   //   at org.jetbrains.java.decompiler.modules.decompiler.vars.VarDefinitionHelper.iterateClashingNames(VarDefinitionHelper.java:1492)
   //   at org.jetbrains.java.decompiler.modules.decompiler.vars.VarDefinitionHelper.iterateClashingNames(VarDefinitionHelper.java:1541)
   //   at org.jetbrains.java.decompiler.modules.decompiler.vars.VarDefinitionHelper.iterateClashingExprent(VarDefinitionHelper.java:1672)
   //   at org.jetbrains.java.decompiler.modules.decompiler.vars.VarDefinitionHelper.iterateClashingNames(VarDefinitionHelper.java:1492)
   //   at org.jetbrains.java.decompiler.modules.decompiler.vars.VarDefinitionHelper.iterateClashingNames(VarDefinitionHelper.java:1541)
   //   at org.jetbrains.java.decompiler.modules.decompiler.vars.VarDefinitionHelper.iterateClashingExprent(VarDefinitionHelper.java:1672)
   //   at org.jetbrains.java.decompiler.modules.decompiler.vars.VarDefinitionHelper.iterateClashingNames(VarDefinitionHelper.java:1492)
   //   at org.jetbrains.java.decompiler.modules.decompiler.vars.VarDefinitionHelper.iterateClashingNames(VarDefinitionHelper.java:1541)
   //   at org.jetbrains.java.decompiler.modules.decompiler.vars.VarDefinitionHelper.iterateClashingExprent(VarDefinitionHelper.java:1672)
   //   at org.jetbrains.java.decompiler.modules.decompiler.vars.VarDefinitionHelper.iterateClashingNames(VarDefinitionHelper.java:1492)
   //   at org.jetbrains.java.decompiler.modules.decompiler.vars.VarDefinitionHelper.iterateClashingNames(VarDefinitionHelper.java:1541)
   //   at org.jetbrains.java.decompiler.modules.decompiler.vars.VarDefinitionHelper.iterateClashingExprent(VarDefinitionHelper.java:1672)
   //   at org.jetbrains.java.decompiler.modules.decompiler.vars.VarDefinitionHelper.iterateClashingNames(VarDefinitionHelper.java:1492)
   //   at org.jetbrains.java.decompiler.modules.decompiler.vars.VarDefinitionHelper.iterateClashingNames(VarDefinitionHelper.java:1541)
   //   at org.jetbrains.java.decompiler.modules.decompiler.vars.VarDefinitionHelper.iterateClashingExprent(VarDefinitionHelper.java:1672)
   //   at org.jetbrains.java.decompiler.modules.decompiler.vars.VarDefinitionHelper.iterateClashingNames(VarDefinitionHelper.java:1492)
   //   at org.jetbrains.java.decompiler.modules.decompiler.vars.VarDefinitionHelper.iterateClashingNames(VarDefinitionHelper.java:1541)
   //   at org.jetbrains.java.decompiler.modules.decompiler.vars.VarDefinitionHelper.iterateClashingExprent(VarDefinitionHelper.java:1672)
   //   at org.jetbrains.java.decompiler.modules.decompiler.vars.VarDefinitionHelper.iterateClashingNames(VarDefinitionHelper.java:1492)
   //   at org.jetbrains.java.decompiler.modules.decompiler.vars.VarDefinitionHelper.iterateClashingNames(VarDefinitionHelper.java:1541)
   //   at org.jetbrains.java.decompiler.modules.decompiler.vars.VarDefinitionHelper.iterateClashingExprent(VarDefinitionHelper.java:1672)
   //   at org.jetbrains.java.decompiler.modules.decompiler.vars.VarDefinitionHelper.iterateClashingNames(VarDefinitionHelper.java:1492)
   //   at org.jetbrains.java.decompiler.modules.decompiler.vars.VarDefinitionHelper.iterateClashingNames(VarDefinitionHelper.java:1541)
   //   at org.jetbrains.java.decompiler.modules.decompiler.vars.VarDefinitionHelper.iterateClashingExprent(VarDefinitionHelper.java:1672)
   //   at org.jetbrains.java.decompiler.modules.decompiler.vars.VarDefinitionHelper.iterateClashingNames(VarDefinitionHelper.java:1492)
   //   at org.jetbrains.java.decompiler.modules.decompiler.vars.VarDefinitionHelper.iterateClashingNames(VarDefinitionHelper.java:1541)
   //   at org.jetbrains.java.decompiler.modules.decompiler.vars.VarDefinitionHelper.iterateClashingExprent(VarDefinitionHelper.java:1672)
   //   at org.jetbrains.java.decompiler.modules.decompiler.vars.VarDefinitionHelper.iterateClashingNames(VarDefinitionHelper.java:1492)
   //   at org.jetbrains.java.decompiler.modules.decompiler.vars.VarDefinitionHelper.iterateClashingNames(VarDefinitionHelper.java:1541)
   //   at org.jetbrains.java.decompiler.modules.decompiler.vars.VarDefinitionHelper.iterateClashingExprent(VarDefinitionHelper.java:1672)
   //   at org.jetbrains.java.decompiler.modules.decompiler.vars.VarDefinitionHelper.iterateClashingNames(VarDefinitionHelper.java:1492)
   //   at org.jetbrains.java.decompiler.modules.decompiler.vars.VarDefinitionHelper.iterateClashingNames(VarDefinitionHelper.java:1541)
   //   at org.jetbrains.java.decompiler.modules.decompiler.vars.VarDefinitionHelper.iterateClashingExprent(VarDefinitionHelper.java:1672)
   //   at org.jetbrains.java.decompiler.modules.decompiler.vars.VarDefinitionHelper.iterateClashingNames(VarDefinitionHelper.java:1492)
   //   at org.jetbrains.java.decompiler.modules.decompiler.vars.VarDefinitionHelper.iterateClashingNames(VarDefinitionHelper.java:1541)
   //   at org.jetbrains.java.decompiler.modules.decompiler.vars.VarDefinitionHelper.iterateClashingExprent(VarDefinitionHelper.java:1672)
   //   at org.jetbrains.java.decompiler.modules.decompiler.vars.VarDefinitionHelper.iterateClashingNames(VarDefinitionHelper.java:1492)
   //   at org.jetbrains.java.decompiler.modules.decompiler.vars.VarDefinitionHelper.iterateClashingNames(VarDefinitionHelper.java:1541)
   //   at org.jetbrains.java.decompiler.modules.decompiler.vars.VarDefinitionHelper.iterateClashingExprent(VarDefinitionHelper.java:1672)
   //   at org.jetbrains.java.decompiler.modules.decompiler.vars.VarDefinitionHelper.iterateClashingNames(VarDefinitionHelper.java:1492)
   //   at org.jetbrains.java.decompiler.modules.decompiler.vars.VarDefinitionHelper.iterateClashingNames(VarDefinitionHelper.java:1541)
   //   at org.jetbrains.java.decompiler.modules.decompiler.vars.VarDefinitionHelper.iterateClashingExprent(VarDefinitionHelper.java:1672)
   //   at org.jetbrains.java.decompiler.modules.decompiler.vars.VarDefinitionHelper.iterateClashingNames(VarDefinitionHelper.java:1492)
   //   at org.jetbrains.java.decompiler.modules.decompiler.vars.VarDefinitionHelper.iterateClashingNames(VarDefinitionHelper.java:1541)
   //   at org.jetbrains.java.decompiler.modules.decompiler.vars.VarDefinitionHelper.iterateClashingExprent(VarDefinitionHelper.java:1672)
   //   at org.jetbrains.java.decompiler.modules.decompiler.vars.VarDefinitionHelper.iterateClashingNames(VarDefinitionHelper.java:1492)
   //   at org.jetbrains.java.decompiler.modules.decompiler.vars.VarDefinitionHelper.iterateClashingNames(VarDefinitionHelper.java:1541)
   //   at org.jetbrains.java.decompiler.modules.decompiler.vars.VarDefinitionHelper.iterateClashingExprent(VarDefinitionHelper.java:1672)
   //   at org.jetbrains.java.decompiler.modules.decompiler.vars.VarDefinitionHelper.iterateClashingNames(VarDefinitionHelper.java:1492)
   //   at org.jetbrains.java.decompiler.modules.decompiler.vars.VarDefinitionHelper.iterateClashingNames(VarDefinitionHelper.java:1541)
   //   at org.jetbrains.java.decompiler.modules.decompiler.vars.VarDefinitionHelper.iterateClashingExprent(VarDefinitionHelper.java:1672)
   //   at org.jetbrains.java.decompiler.modules.decompiler.vars.VarDefinitionHelper.iterateClashingNames(VarDefinitionHelper.java:1492)
   //   at org.jetbrains.java.decompiler.modules.decompiler.vars.VarDefinitionHelper.iterateClashingNames(VarDefinitionHelper.java:1541)
   //   at org.jetbrains.java.decompiler.modules.decompiler.vars.VarDefinitionHelper.iterateClashingExprent(VarDefinitionHelper.java:1672)
   //   at org.jetbrains.java.decompiler.modules.decompiler.vars.VarDefinitionHelper.iterateClashingNames(VarDefinitionHelper.java:1492)
   //   at org.jetbrains.java.decompiler.modules.decompiler.vars.VarDefinitionHelper.iterateClashingNames(VarDefinitionHelper.java:1541)
   //   at org.jetbrains.java.decompiler.modules.decompiler.vars.VarDefinitionHelper.iterateClashingExprent(VarDefinitionHelper.java:1672)
   //   at org.jetbrains.java.decompiler.modules.decompiler.vars.VarDefinitionHelper.iterateClashingNames(VarDefinitionHelper.java:1492)
   //   at org.jetbrains.java.decompiler.modules.decompiler.vars.VarDefinitionHelper.iterateClashingNames(VarDefinitionHelper.java:1541)
   //   at org.jetbrains.java.decompiler.modules.decompiler.vars.VarDefinitionHelper.iterateClashingExprent(VarDefinitionHelper.java:1672)
   //   at org.jetbrains.java.decompiler.modules.decompiler.vars.VarDefinitionHelper.iterateClashingNames(VarDefinitionHelper.java:1492)
   //   at org.jetbrains.java.decompiler.modules.decompiler.vars.VarDefinitionHelper.iterateClashingNames(VarDefinitionHelper.java:1541)
   //   at org.jetbrains.java.decompiler.modules.decompiler.vars.VarDefinitionHelper.iterateClashingExprent(VarDefinitionHelper.java:1672)
   //   at org.jetbrains.java.decompiler.modules.decompiler.vars.VarDefinitionHelper.iterateClashingNames(VarDefinitionHelper.java:1492)
   //   at org.jetbrains.java.decompiler.modules.decompiler.vars.VarDefinitionHelper.iterateClashingNames(VarDefinitionHelper.java:1541)
   //   at org.jetbrains.java.decompiler.modules.decompiler.vars.VarDefinitionHelper.iterateClashingExprent(VarDefinitionHelper.java:1672)
   //   at org.jetbrains.java.decompiler.modules.decompiler.vars.VarDefinitionHelper.iterateClashingNames(VarDefinitionHelper.java:1492)
   //   at org.jetbrains.java.decompiler.modules.decompiler.vars.VarDefinitionHelper.iterateClashingNames(VarDefinitionHelper.java:1541)
   //   at org.jetbrains.java.decompiler.modules.decompiler.vars.VarDefinitionHelper.iterateClashingExprent(VarDefinitionHelper.java:1672)
   //   at org.jetbrains.java.decompiler.modules.decompiler.vars.VarDefinitionHelper.iterateClashingNames(VarDefinitionHelper.java:1492)
   //   at org.jetbrains.java.decompiler.modules.decompiler.vars.VarDefinitionHelper.iterateClashingNames(VarDefinitionHelper.java:1541)
   //   at org.jetbrains.java.decompiler.modules.decompiler.vars.VarDefinitionHelper.iterateClashingExprent(VarDefinitionHelper.java:1672)
   //   at org.jetbrains.java.decompiler.modules.decompiler.vars.VarDefinitionHelper.iterateClashingNames(VarDefinitionHelper.java:1492)
   //   at org.jetbrains.java.decompiler.modules.decompiler.vars.VarDefinitionHelper.iterateClashingNames(VarDefinitionHelper.java:1541)
   //   at org.jetbrains.java.decompiler.modules.decompiler.vars.VarDefinitionHelper.iterateClashingExprent(VarDefinitionHelper.java:1672)
   //   at org.jetbrains.java.decompiler.modules.decompiler.vars.VarDefinitionHelper.iterateClashingNames(VarDefinitionHelper.java:1492)
   //   at org.jetbrains.java.decompiler.modules.decompiler.vars.VarDefinitionHelper.iterateClashingNames(VarDefinitionHelper.java:1541)
   //   at org.jetbrains.java.decompiler.modules.decompiler.vars.VarDefinitionHelper.iterateClashingExprent(VarDefinitionHelper.java:1672)
   //   at org.jetbrains.java.decompiler.modules.decompiler.vars.VarDefinitionHelper.iterateClashingNames(VarDefinitionHelper.java:1492)
   //   at org.jetbrains.java.decompiler.modules.decompiler.vars.VarDefinitionHelper.iterateClashingNames(VarDefinitionHelper.java:1541)
   //   at org.jetbrains.java.decompiler.modules.decompiler.vars.VarDefinitionHelper.iterateClashingExprent(VarDefinitionHelper.java:1672)
   //   at org.jetbrains.java.decompiler.modules.decompiler.vars.VarDefinitionHelper.iterateClashingNames(VarDefinitionHelper.java:1492)
   //   at org.jetbrains.java.decompiler.modules.decompiler.vars.VarDefinitionHelper.iterateClashingNames(VarDefinitionHelper.java:1541)
   //   at org.jetbrains.java.decompiler.modules.decompiler.vars.VarDefinitionHelper.iterateClashingExprent(VarDefinitionHelper.java:1672)
   //   at org.jetbrains.java.decompiler.modules.decompiler.vars.VarDefinitionHelper.iterateClashingNames(VarDefinitionHelper.java:1492)
   //   at org.jetbrains.java.decompiler.modules.decompiler.vars.VarDefinitionHelper.iterateClashingNames(VarDefinitionHelper.java:1541)
   //   at org.jetbrains.java.decompiler.modules.decompiler.vars.VarDefinitionHelper.iterateClashingExprent(VarDefinitionHelper.java:1672)
   //   at org.jetbrains.java.decompiler.modules.decompiler.vars.VarDefinitionHelper.iterateClashingNames(VarDefinitionHelper.java:1492)
   //   at org.jetbrains.java.decompiler.modules.decompiler.vars.VarDefinitionHelper.iterateClashingNames(VarDefinitionHelper.java:1541)
   //   at org.jetbrains.java.decompiler.modules.decompiler.vars.VarDefinitionHelper.iterateClashingExprent(VarDefinitionHelper.java:1672)
   //   at org.jetbrains.java.decompiler.modules.decompiler.vars.VarDefinitionHelper.iterateClashingNames(VarDefinitionHelper.java:1492)
   //   at org.jetbrains.java.decompiler.modules.decompiler.vars.VarDefinitionHelper.iterateClashingNames(VarDefinitionHelper.java:1541)
   //   at org.jetbrains.java.decompiler.modules.decompiler.vars.VarDefinitionHelper.iterateClashingExprent(VarDefinitionHelper.java:1672)
   //   at org.jetbrains.java.decompiler.modules.decompiler.vars.VarDefinitionHelper.iterateClashingNames(VarDefinitionHelper.java:1492)
   //   at org.jetbrains.java.decompiler.modules.decompiler.vars.VarDefinitionHelper.iterateClashingNames(VarDefinitionHelper.java:1541)
   //   at org.jetbrains.java.decompiler.modules.decompiler.vars.VarDefinitionHelper.iterateClashingExprent(VarDefinitionHelper.java:1672)
   //   at org.jetbrains.java.decompiler.modules.decompiler.vars.VarDefinitionHelper.iterateClashingNames(VarDefinitionHelper.java:1492)
   //   at org.jetbrains.java.decompiler.modules.decompiler.vars.VarDefinitionHelper.iterateClashingNames(VarDefinitionHelper.java:1541)
   //   at org.jetbrains.java.decompiler.modules.decompiler.vars.VarDefinitionHelper.iterateClashingExprent(VarDefinitionHelper.java:1672)
   //   at org.jetbrains.java.decompiler.modules.decompiler.vars.VarDefinitionHelper.iterateClashingNames(VarDefinitionHelper.java:1492)
   //   at org.jetbrains.java.decompiler.modules.decompiler.vars.VarDefinitionHelper.iterateClashingNames(VarDefinitionHelper.java:1541)
   //   at org.jetbrains.java.decompiler.modules.decompiler.vars.VarDefinitionHelper.iterateClashingExprent(VarDefinitionHelper.java:1672)
   //   at org.jetbrains.java.decompiler.modules.decompiler.vars.VarDefinitionHelper.iterateClashingNames(VarDefinitionHelper.java:1492)
   //   at org.jetbrains.java.decompiler.modules.decompiler.vars.VarDefinitionHelper.iterateClashingNames(VarDefinitionHelper.java:1541)
   //   at org.jetbrains.java.decompiler.modules.decompiler.vars.VarDefinitionHelper.iterateClashingExprent(VarDefinitionHelper.java:1672)
   //   at org.jetbrains.java.decompiler.modules.decompiler.vars.VarDefinitionHelper.iterateClashingNames(VarDefinitionHelper.java:1492)
   //   at org.jetbrains.java.decompiler.modules.decompiler.vars.VarDefinitionHelper.iterateClashingNames(VarDefinitionHelper.java:1541)
   //   at org.jetbrains.java.decompiler.modules.decompiler.vars.VarDefinitionHelper.iterateClashingExprent(VarDefinitionHelper.java:1672)
   //   at org.jetbrains.java.decompiler.modules.decompiler.vars.VarDefinitionHelper.iterateClashingNames(VarDefinitionHelper.java:1492)
   //   at org.jetbrains.java.decompiler.modules.decompiler.vars.VarDefinitionHelper.iterateClashingNames(VarDefinitionHelper.java:1541)
   //   at org.jetbrains.java.decompiler.modules.decompiler.vars.VarDefinitionHelper.iterateClashingExprent(VarDefinitionHelper.java:1672)
   //   at org.jetbrains.java.decompiler.modules.decompiler.vars.VarDefinitionHelper.iterateClashingNames(VarDefinitionHelper.java:1492)
   //   at org.jetbrains.java.decompiler.modules.decompiler.vars.VarDefinitionHelper.iterateClashingNames(VarDefinitionHelper.java:1541)
   //   at org.jetbrains.java.decompiler.modules.decompiler.vars.VarDefinitionHelper.iterateClashingExprent(VarDefinitionHelper.java:1672)
   //   at org.jetbrains.java.decompiler.modules.decompiler.vars.VarDefinitionHelper.iterateClashingNames(VarDefinitionHelper.java:1492)
   //   at org.jetbrains.java.decompiler.modules.decompiler.vars.VarDefinitionHelper.iterateClashingNames(VarDefinitionHelper.java:1541)
   //   at org.jetbrains.java.decompiler.modules.decompiler.vars.VarDefinitionHelper.iterateClashingExprent(VarDefinitionHelper.java:1672)
   //   at org.jetbrains.java.decompiler.modules.decompiler.vars.VarDefinitionHelper.iterateClashingNames(VarDefinitionHelper.java:1492)
   //   at org.jetbrains.java.decompiler.modules.decompiler.vars.VarDefinitionHelper.iterateClashingNames(VarDefinitionHelper.java:1541)
   //   at org.jetbrains.java.decompiler.modules.decompiler.vars.VarDefinitionHelper.iterateClashingExprent(VarDefinitionHelper.java:1672)
   //   at org.jetbrains.java.decompiler.modules.decompiler.vars.VarDefinitionHelper.iterateClashingNames(VarDefinitionHelper.java:1492)
   //   at org.jetbrains.java.decompiler.modules.decompiler.vars.VarDefinitionHelper.iterateClashingNames(VarDefinitionHelper.java:1541)
   //   at org.jetbrains.java.decompiler.modules.decompiler.vars.VarDefinitionHelper.iterateClashingExprent(VarDefinitionHelper.java:1672)
   //   at org.jetbrains.java.decompiler.modules.decompiler.vars.VarDefinitionHelper.iterateClashingNames(VarDefinitionHelper.java:1492)
   //   at org.jetbrains.java.decompiler.modules.decompiler.vars.VarDefinitionHelper.iterateClashingNames(VarDefinitionHelper.java:1541)
   //   at org.jetbrains.java.decompiler.modules.decompiler.vars.VarDefinitionHelper.iterateClashingExprent(VarDefinitionHelper.java:1672)
   //   at org.jetbrains.java.decompiler.modules.decompiler.vars.VarDefinitionHelper.iterateClashingNames(VarDefinitionHelper.java:1492)
   //   at org.jetbrains.java.decompiler.modules.decompiler.vars.VarDefinitionHelper.iterateClashingNames(VarDefinitionHelper.java:1541)
   //   at org.jetbrains.java.decompiler.modules.decompiler.vars.VarDefinitionHelper.iterateClashingExprent(VarDefinitionHelper.java:1672)
   //   at org.jetbrains.java.decompiler.modules.decompiler.vars.VarDefinitionHelper.iterateClashingNames(VarDefinitionHelper.java:1492)
   //   at org.jetbrains.java.decompiler.modules.decompiler.vars.VarDefinitionHelper.iterateClashingNames(VarDefinitionHelper.java:1541)
   //   at org.jetbrains.java.decompiler.modules.decompiler.vars.VarDefinitionHelper.iterateClashingExprent(VarDefinitionHelper.java:1672)
   //   at org.jetbrains.java.decompiler.modules.decompiler.vars.VarDefinitionHelper.iterateClashingNames(VarDefinitionHelper.java:1492)
   //   at org.jetbrains.java.decompiler.modules.decompiler.vars.VarDefinitionHelper.iterateClashingNames(VarDefinitionHelper.java:1541)
   //   at org.jetbrains.java.decompiler.modules.decompiler.vars.VarDefinitionHelper.iterateClashingExprent(VarDefinitionHelper.java:1672)
   //   at org.jetbrains.java.decompiler.modules.decompiler.vars.VarDefinitionHelper.iterateClashingNames(VarDefinitionHelper.java:1492)
   //   at org.jetbrains.java.decompiler.modules.decompiler.vars.VarDefinitionHelper.iterateClashingNames(VarDefinitionHelper.java:1541)
   //   at org.jetbrains.java.decompiler.modules.decompiler.vars.VarDefinitionHelper.iterateClashingExprent(VarDefinitionHelper.java:1672)
   //   at org.jetbrains.java.decompiler.modules.decompiler.vars.VarDefinitionHelper.iterateClashingNames(VarDefinitionHelper.java:1492)
   //   at org.jetbrains.java.decompiler.modules.decompiler.vars.VarDefinitionHelper.iterateClashingNames(VarDefinitionHelper.java:1541)
   //   at org.jetbrains.java.decompiler.modules.decompiler.vars.VarDefinitionHelper.iterateClashingExprent(VarDefinitionHelper.java:1672)
   //   at org.jetbrains.java.decompiler.modules.decompiler.vars.VarDefinitionHelper.iterateClashingNames(VarDefinitionHelper.java:1492)
   //   at org.jetbrains.java.decompiler.modules.decompiler.vars.VarDefinitionHelper.iterateClashingNames(VarDefinitionHelper.java:1541)
   //   at org.jetbrains.java.decompiler.modules.decompiler.vars.VarDefinitionHelper.iterateClashingExprent(VarDefinitionHelper.java:1672)
   //   at org.jetbrains.java.decompiler.modules.decompiler.vars.VarDefinitionHelper.iterateClashingNames(VarDefinitionHelper.java:1492)
   //   at org.jetbrains.java.decompiler.modules.decompiler.vars.VarDefinitionHelper.iterateClashingNames(VarDefinitionHelper.java:1541)
   //   at org.jetbrains.java.decompiler.modules.decompiler.vars.VarDefinitionHelper.iterateClashingExprent(VarDefinitionHelper.java:1672)
   //   at org.jetbrains.java.decompiler.modules.decompiler.vars.VarDefinitionHelper.iterateClashingNames(VarDefinitionHelper.java:1492)
   //   at org.jetbrains.java.decompiler.modules.decompiler.vars.VarDefinitionHelper.iterateClashingNames(VarDefinitionHelper.java:1541)
   //   at org.jetbrains.java.decompiler.modules.decompiler.vars.VarDefinitionHelper.iterateClashingExprent(VarDefinitionHelper.java:1672)
   //   at org.jetbrains.java.decompiler.modules.decompiler.vars.VarDefinitionHelper.iterateClashingNames(VarDefinitionHelper.java:1492)
   //   at org.jetbrains.java.decompiler.modules.decompiler.vars.VarDefinitionHelper.iterateClashingNames(VarDefinitionHelper.java:1541)
   //   at org.jetbrains.java.decompiler.modules.decompiler.vars.VarDefinitionHelper.iterateClashingExprent(VarDefinitionHelper.java:1672)
   //   at org.jetbrains.java.decompiler.modules.decompiler.vars.VarDefinitionHelper.iterateClashingNames(VarDefinitionHelper.java:1492)
   //   at org.jetbrains.java.decompiler.modules.decompiler.vars.VarDefinitionHelper.iterateClashingNames(VarDefinitionHelper.java:1541)
   //   at org.jetbrains.java.decompiler.modules.decompiler.vars.VarDefinitionHelper.iterateClashingExprent(VarDefinitionHelper.java:1672)
   //   at org.jetbrains.java.decompiler.modules.decompiler.vars.VarDefinitionHelper.iterateClashingNames(VarDefinitionHelper.java:1492)
   //   at org.jetbrains.java.decompiler.modules.decompiler.vars.VarDefinitionHelper.iterateClashingNames(VarDefinitionHelper.java:1541)
   //   at org.jetbrains.java.decompiler.modules.decompiler.vars.VarDefinitionHelper.iterateClashingExprent(VarDefinitionHelper.java:1672)
   //   at org.jetbrains.java.decompiler.modules.decompiler.vars.VarDefinitionHelper.iterateClashingNames(VarDefinitionHelper.java:1492)
   //   at org.jetbrains.java.decompiler.modules.decompiler.vars.VarDefinitionHelper.iterateClashingNames(VarDefinitionHelper.java:1541)
   //   at org.jetbrains.java.decompiler.modules.decompiler.vars.VarDefinitionHelper.iterateClashingExprent(VarDefinitionHelper.java:1672)
   //   at org.jetbrains.java.decompiler.modules.decompiler.vars.VarDefinitionHelper.iterateClashingNames(VarDefinitionHelper.java:1492)
   //   at org.jetbrains.java.decompiler.modules.decompiler.vars.VarDefinitionHelper.iterateClashingNames(VarDefinitionHelper.java:1541)
   //   at org.jetbrains.java.decompiler.modules.decompiler.vars.VarDefinitionHelper.iterateClashingExprent(VarDefinitionHelper.java:1672)
   //   at org.jetbrains.java.decompiler.modules.decompiler.vars.VarDefinitionHelper.iterateClashingNames(VarDefinitionHelper.java:1492)
   //   at org.jetbrains.java.decompiler.modules.decompiler.vars.VarDefinitionHelper.iterateClashingNames(VarDefinitionHelper.java:1541)
   //   at org.jetbrains.java.decompiler.modules.decompiler.vars.VarDefinitionHelper.iterateClashingExprent(VarDefinitionHelper.java:1672)
   //   at org.jetbrains.java.decompiler.modules.decompiler.vars.VarDefinitionHelper.iterateClashingNames(VarDefinitionHelper.java:1492)
   //   at org.jetbrains.java.decompiler.modules.decompiler.vars.VarDefinitionHelper.iterateClashingNames(VarDefinitionHelper.java:1541)
   //   at org.jetbrains.java.decompiler.modules.decompiler.vars.VarDefinitionHelper.iterateClashingExprent(VarDefinitionHelper.java:1672)
   //   at org.jetbrains.java.decompiler.modules.decompiler.vars.VarDefinitionHelper.iterateClashingNames(VarDefinitionHelper.java:1492)
   //   at org.jetbrains.java.decompiler.modules.decompiler.vars.VarDefinitionHelper.iterateClashingNames(VarDefinitionHelper.java:1541)
   //   at org.jetbrains.java.decompiler.modules.decompiler.vars.VarDefinitionHelper.iterateClashingExprent(VarDefinitionHelper.java:1672)
   //   at org.jetbrains.java.decompiler.modules.decompiler.vars.VarDefinitionHelper.iterateClashingNames(VarDefinitionHelper.java:1492)
   //   at org.jetbrains.java.decompiler.modules.decompiler.vars.VarDefinitionHelper.iterateClashingNames(VarDefinitionHelper.java:1541)
   //   at org.jetbrains.java.decompiler.modules.decompiler.vars.VarDefinitionHelper.iterateClashingExprent(VarDefinitionHelper.java:1672)
   //   at org.jetbrains.java.decompiler.modules.decompiler.vars.VarDefinitionHelper.iterateClashingNames(VarDefinitionHelper.java:1492)
   //   at org.jetbrains.java.decompiler.modules.decompiler.vars.VarDefinitionHelper.iterateClashingNames(VarDefinitionHelper.java:1541)
   //   at org.jetbrains.java.decompiler.modules.decompiler.vars.VarDefinitionHelper.iterateClashingExprent(VarDefinitionHelper.java:1672)
   //   at org.jetbrains.java.decompiler.modules.decompiler.vars.VarDefinitionHelper.iterateClashingNames(VarDefinitionHelper.java:1492)
   //   at org.jetbrains.java.decompiler.modules.decompiler.vars.VarDefinitionHelper.iterateClashingNames(VarDefinitionHelper.java:1541)
   //   at org.jetbrains.java.decompiler.modules.decompiler.vars.VarDefinitionHelper.iterateClashingExprent(VarDefinitionHelper.java:1672)
   //   at org.jetbrains.java.decompiler.modules.decompiler.vars.VarDefinitionHelper.iterateClashingNames(VarDefinitionHelper.java:1492)
   //   at org.jetbrains.java.decompiler.modules.decompiler.vars.VarDefinitionHelper.iterateClashingNames(VarDefinitionHelper.java:1541)
   //   at org.jetbrains.java.decompiler.modules.decompiler.vars.VarDefinitionHelper.iterateClashingExprent(VarDefinitionHelper.java:1672)
   //   at org.jetbrains.java.decompiler.modules.decompiler.vars.VarDefinitionHelper.iterateClashingNames(VarDefinitionHelper.java:1492)
   //   at org.jetbrains.java.decompiler.modules.decompiler.vars.VarDefinitionHelper.iterateClashingNames(VarDefinitionHelper.java:1541)
   //   at org.jetbrains.java.decompiler.modules.decompiler.vars.VarDefinitionHelper.iterateClashingExprent(VarDefinitionHelper.java:1672)
   //   at org.jetbrains.java.decompiler.modules.decompiler.vars.VarDefinitionHelper.iterateClashingNames(VarDefinitionHelper.java:1492)
   //   at org.jetbrains.java.decompiler.modules.decompiler.vars.VarDefinitionHelper.iterateClashingNames(VarDefinitionHelper.java:1541)
   //   at org.jetbrains.java.decompiler.modules.decompiler.vars.VarDefinitionHelper.iterateClashingExprent(VarDefinitionHelper.java:1672)
   //   at org.jetbrains.java.decompiler.modules.decompiler.vars.VarDefinitionHelper.iterateClashingNames(VarDefinitionHelper.java:1492)
   //   at org.jetbrains.java.decompiler.modules.decompiler.vars.VarDefinitionHelper.iterateClashingNames(VarDefinitionHelper.java:1541)
   //   at org.jetbrains.java.decompiler.modules.decompiler.vars.VarDefinitionHelper.iterateClashingExprent(VarDefinitionHelper.java:1672)
   //   at org.jetbrains.java.decompiler.modules.decompiler.vars.VarDefinitionHelper.iterateClashingNames(VarDefinitionHelper.java:1492)
   //   at org.jetbrains.java.decompiler.modules.decompiler.vars.VarDefinitionHelper.iterateClashingNames(VarDefinitionHelper.java:1541)
   //   at org.jetbrains.java.decompiler.modules.decompiler.vars.VarDefinitionHelper.iterateClashingExprent(VarDefinitionHelper.java:1672)
   //   at org.jetbrains.java.decompiler.modules.decompiler.vars.VarDefinitionHelper.iterateClashingNames(VarDefinitionHelper.java:1492)
   //   at org.jetbrains.java.decompiler.modules.decompiler.vars.VarDefinitionHelper.iterateClashingNames(VarDefinitionHelper.java:1541)
   //   at org.jetbrains.java.decompiler.modules.decompiler.vars.VarDefinitionHelper.iterateClashingExprent(VarDefinitionHelper.java:1672)
   //   at org.jetbrains.java.decompiler.modules.decompiler.vars.VarDefinitionHelper.iterateClashingNames(VarDefinitionHelper.java:1492)
   //   at org.jetbrains.java.decompiler.modules.decompiler.vars.VarDefinitionHelper.iterateClashingNames(VarDefinitionHelper.java:1541)
   //   at org.jetbrains.java.decompiler.modules.decompiler.vars.VarDefinitionHelper.iterateClashingExprent(VarDefinitionHelper.java:1672)
   //   at org.jetbrains.java.decompiler.modules.decompiler.vars.VarDefinitionHelper.iterateClashingNames(VarDefinitionHelper.java:1492)
   //   at org.jetbrains.java.decompiler.modules.decompiler.vars.VarDefinitionHelper.iterateClashingNames(VarDefinitionHelper.java:1541)
   //   at org.jetbrains.java.decompiler.modules.decompiler.vars.VarDefinitionHelper.iterateClashingExprent(VarDefinitionHelper.java:1672)
   //   at org.jetbrains.java.decompiler.modules.decompiler.vars.VarDefinitionHelper.iterateClashingNames(VarDefinitionHelper.java:1492)
   //   at org.jetbrains.java.decompiler.modules.decompiler.vars.VarDefinitionHelper.iterateClashingNames(VarDefinitionHelper.java:1541)
   //   at org.jetbrains.java.decompiler.modules.decompiler.vars.VarDefinitionHelper.iterateClashingExprent(VarDefinitionHelper.java:1672)
   //   at org.jetbrains.java.decompiler.modules.decompiler.vars.VarDefinitionHelper.iterateClashingNames(VarDefinitionHelper.java:1492)
   //   at org.jetbrains.java.decompiler.modules.decompiler.vars.VarDefinitionHelper.iterateClashingNames(VarDefinitionHelper.java:1541)
   //   at org.jetbrains.java.decompiler.modules.decompiler.vars.VarDefinitionHelper.iterateClashingExprent(VarDefinitionHelper.java:1672)
   //   at org.jetbrains.java.decompiler.modules.decompiler.vars.VarDefinitionHelper.iterateClashingNames(VarDefinitionHelper.java:1492)
   //   at org.jetbrains.java.decompiler.modules.decompiler.vars.VarDefinitionHelper.iterateClashingNames(VarDefinitionHelper.java:1541)
   //   at org.jetbrains.java.decompiler.modules.decompiler.vars.VarDefinitionHelper.iterateClashingExprent(VarDefinitionHelper.java:1672)
   //   at org.jetbrains.java.decompiler.modules.decompiler.vars.VarDefinitionHelper.iterateClashingNames(VarDefinitionHelper.java:1492)
   //   at org.jetbrains.java.decompiler.modules.decompiler.vars.VarDefinitionHelper.iterateClashingNames(VarDefinitionHelper.java:1541)
   //   at org.jetbrains.java.decompiler.modules.decompiler.vars.VarDefinitionHelper.iterateClashingExprent(VarDefinitionHelper.java:1672)
   //   at org.jetbrains.java.decompiler.modules.decompiler.vars.VarDefinitionHelper.iterateClashingNames(VarDefinitionHelper.java:1492)
   //   at org.jetbrains.java.decompiler.modules.decompiler.vars.VarDefinitionHelper.iterateClashingNames(VarDefinitionHelper.java:1541)
   //   at org.jetbrains.java.decompiler.modules.decompiler.vars.VarDefinitionHelper.iterateClashingExprent(VarDefinitionHelper.java:1672)
   //   at org.jetbrains.java.decompiler.modules.decompiler.vars.VarDefinitionHelper.iterateClashingNames(VarDefinitionHelper.java:1492)
   //   at org.jetbrains.java.decompiler.modules.decompiler.vars.VarDefinitionHelper.iterateClashingNames(VarDefinitionHelper.java:1541)
   //   at org.jetbrains.java.decompiler.modules.decompiler.vars.VarDefinitionHelper.iterateClashingExprent(VarDefinitionHelper.java:1672)
   //   at org.jetbrains.java.decompiler.modules.decompiler.vars.VarDefinitionHelper.iterateClashingNames(VarDefinitionHelper.java:1492)
   //   at org.jetbrains.java.decompiler.modules.decompiler.vars.VarDefinitionHelper.iterateClashingNames(VarDefinitionHelper.java:1541)
   //   at org.jetbrains.java.decompiler.modules.decompiler.vars.VarDefinitionHelper.iterateClashingExprent(VarDefinitionHelper.java:1672)
   //   at org.jetbrains.java.decompiler.modules.decompiler.vars.VarDefinitionHelper.iterateClashingNames(VarDefinitionHelper.java:1492)
   //   at org.jetbrains.java.decompiler.modules.decompiler.vars.VarDefinitionHelper.iterateClashingNames(VarDefinitionHelper.java:1541)
   //   at org.jetbrains.java.decompiler.modules.decompiler.vars.VarDefinitionHelper.iterateClashingExprent(VarDefinitionHelper.java:1672)
   //   at org.jetbrains.java.decompiler.modules.decompiler.vars.VarDefinitionHelper.iterateClashingNames(VarDefinitionHelper.java:1492)
   //   at org.jetbrains.java.decompiler.modules.decompiler.vars.VarDefinitionHelper.iterateClashingNames(VarDefinitionHelper.java:1541)
   //   at org.jetbrains.java.decompiler.modules.decompiler.vars.VarDefinitionHelper.iterateClashingExprent(VarDefinitionHelper.java:1672)
   //   at org.jetbrains.java.decompiler.modules.decompiler.vars.VarDefinitionHelper.iterateClashingNames(VarDefinitionHelper.java:1492)
   //   at org.jetbrains.java.decompiler.modules.decompiler.vars.VarDefinitionHelper.iterateClashingNames(VarDefinitionHelper.java:1541)
   //   at org.jetbrains.java.decompiler.modules.decompiler.vars.VarDefinitionHelper.iterateClashingExprent(VarDefinitionHelper.java:1672)
   //   at org.jetbrains.java.decompiler.modules.decompiler.vars.VarDefinitionHelper.iterateClashingNames(VarDefinitionHelper.java:1492)
   //   at org.jetbrains.java.decompiler.modules.decompiler.vars.VarDefinitionHelper.iterateClashingNames(VarDefinitionHelper.java:1541)
   //   at org.jetbrains.java.decompiler.modules.decompiler.vars.VarDefinitionHelper.iterateClashingExprent(VarDefinitionHelper.java:1672)
   //   at org.jetbrains.java.decompiler.modules.decompiler.vars.VarDefinitionHelper.iterateClashingNames(VarDefinitionHelper.java:1492)
   //   at org.jetbrains.java.decompiler.modules.decompiler.vars.VarDefinitionHelper.iterateClashingNames(VarDefinitionHelper.java:1541)
   //   at org.jetbrains.java.decompiler.modules.decompiler.vars.VarDefinitionHelper.iterateClashingExprent(VarDefinitionHelper.java:1672)
   //   at org.jetbrains.java.decompiler.modules.decompiler.vars.VarDefinitionHelper.iterateClashingNames(VarDefinitionHelper.java:1492)
   //   at org.jetbrains.java.decompiler.modules.decompiler.vars.VarDefinitionHelper.iterateClashingNames(VarDefinitionHelper.java:1541)
   //   at org.jetbrains.java.decompiler.modules.decompiler.vars.VarDefinitionHelper.iterateClashingExprent(VarDefinitionHelper.java:1672)
   //   at org.jetbrains.java.decompiler.modules.decompiler.vars.VarDefinitionHelper.iterateClashingNames(VarDefinitionHelper.java:1492)
   //   at org.jetbrains.java.decompiler.modules.decompiler.vars.VarDefinitionHelper.iterateClashingNames(VarDefinitionHelper.java:1541)
   //   at org.jetbrains.java.decompiler.modules.decompiler.vars.VarDefinitionHelper.iterateClashingExprent(VarDefinitionHelper.java:1672)
   //   at org.jetbrains.java.decompiler.modules.decompiler.vars.VarDefinitionHelper.iterateClashingNames(VarDefinitionHelper.java:1492)
   //   at org.jetbrains.java.decompiler.modules.decompiler.vars.VarDefinitionHelper.iterateClashingNames(VarDefinitionHelper.java:1541)
   //   at org.jetbrains.java.decompiler.modules.decompiler.vars.VarDefinitionHelper.iterateClashingExprent(VarDefinitionHelper.java:1672)
   //   at org.jetbrains.java.decompiler.modules.decompiler.vars.VarDefinitionHelper.iterateClashingNames(VarDefinitionHelper.java:1492)
   //   at org.jetbrains.java.decompiler.modules.decompiler.vars.VarDefinitionHelper.iterateClashingNames(VarDefinitionHelper.java:1541)
   //   at org.jetbrains.java.decompiler.modules.decompiler.vars.VarDefinitionHelper.iterateClashingExprent(VarDefinitionHelper.java:1672)
   //   at org.jetbrains.java.decompiler.modules.decompiler.vars.VarDefinitionHelper.iterateClashingNames(VarDefinitionHelper.java:1492)
   //   at org.jetbrains.java.decompiler.modules.decompiler.vars.VarDefinitionHelper.iterateClashingNames(VarDefinitionHelper.java:1541)
   //   at org.jetbrains.java.decompiler.modules.decompiler.vars.VarDefinitionHelper.iterateClashingExprent(VarDefinitionHelper.java:1672)
   //   at org.jetbrains.java.decompiler.modules.decompiler.vars.VarDefinitionHelper.iterateClashingNames(VarDefinitionHelper.java:1492)
   //   at org.jetbrains.java.decompiler.modules.decompiler.vars.VarDefinitionHelper.iterateClashingNames(VarDefinitionHelper.java:1541)
   //   at org.jetbrains.java.decompiler.modules.decompiler.vars.VarDefinitionHelper.iterateClashingExprent(VarDefinitionHelper.java:1672)
   //   at org.jetbrains.java.decompiler.modules.decompiler.vars.VarDefinitionHelper.iterateClashingNames(VarDefinitionHelper.java:1492)
   //   at org.jetbrains.java.decompiler.modules.decompiler.vars.VarDefinitionHelper.iterateClashingNames(VarDefinitionHelper.java:1541)
   //   at org.jetbrains.java.decompiler.modules.decompiler.vars.VarDefinitionHelper.iterateClashingExprent(VarDefinitionHelper.java:1672)
   //   at org.jetbrains.java.decompiler.modules.decompiler.vars.VarDefinitionHelper.iterateClashingNames(VarDefinitionHelper.java:1492)
   //   at org.jetbrains.java.decompiler.modules.decompiler.vars.VarDefinitionHelper.iterateClashingNames(VarDefinitionHelper.java:1541)
   //   at org.jetbrains.java.decompiler.modules.decompiler.vars.VarDefinitionHelper.iterateClashingExprent(VarDefinitionHelper.java:1672)
   //   at org.jetbrains.java.decompiler.modules.decompiler.vars.VarDefinitionHelper.iterateClashingNames(VarDefinitionHelper.java:1492)
   //   at org.jetbrains.java.decompiler.modules.decompiler.vars.VarDefinitionHelper.iterateClashingNames(VarDefinitionHelper.java:1541)
   //   at org.jetbrains.java.decompiler.modules.decompiler.vars.VarDefinitionHelper.iterateClashingExprent(VarDefinitionHelper.java:1672)
   //   at org.jetbrains.java.decompiler.modules.decompiler.vars.VarDefinitionHelper.iterateClashingNames(VarDefinitionHelper.java:1492)
   //   at org.jetbrains.java.decompiler.modules.decompiler.vars.VarDefinitionHelper.iterateClashingNames(VarDefinitionHelper.java:1541)
   //   at org.jetbrains.java.decompiler.modules.decompiler.vars.VarDefinitionHelper.iterateClashingExprent(VarDefinitionHelper.java:1672)
   //   at org.jetbrains.java.decompiler.modules.decompiler.vars.VarDefinitionHelper.iterateClashingNames(VarDefinitionHelper.java:1492)
   //   at org.jetbrains.java.decompiler.modules.decompiler.vars.VarDefinitionHelper.iterateClashingNames(VarDefinitionHelper.java:1541)
   //   at org.jetbrains.java.decompiler.modules.decompiler.vars.VarDefinitionHelper.iterateClashingExprent(VarDefinitionHelper.java:1672)
   //   at org.jetbrains.java.decompiler.modules.decompiler.vars.VarDefinitionHelper.iterateClashingNames(VarDefinitionHelper.java:1492)
   //   at org.jetbrains.java.decompiler.modules.decompiler.vars.VarDefinitionHelper.iterateClashingNames(VarDefinitionHelper.java:1541)
   //   at org.jetbrains.java.decompiler.modules.decompiler.vars.VarDefinitionHelper.iterateClashingExprent(VarDefinitionHelper.java:1672)
   //   at org.jetbrains.java.decompiler.modules.decompiler.vars.VarDefinitionHelper.iterateClashingNames(VarDefinitionHelper.java:1492)
   //   at org.jetbrains.java.decompiler.modules.decompiler.vars.VarDefinitionHelper.iterateClashingNames(VarDefinitionHelper.java:1541)
   //   at org.jetbrains.java.decompiler.modules.decompiler.vars.VarDefinitionHelper.iterateClashingExprent(VarDefinitionHelper.java:1672)
   //   at org.jetbrains.java.decompiler.modules.decompiler.vars.VarDefinitionHelper.iterateClashingNames(VarDefinitionHelper.java:1492)
   //   at org.jetbrains.java.decompiler.modules.decompiler.vars.VarDefinitionHelper.iterateClashingNames(VarDefinitionHelper.java:1541)
   //   at org.jetbrains.java.decompiler.modules.decompiler.vars.VarDefinitionHelper.iterateClashingExprent(VarDefinitionHelper.java:1672)
   //   at org.jetbrains.java.decompiler.modules.decompiler.vars.VarDefinitionHelper.iterateClashingNames(VarDefinitionHelper.java:1492)
   //   at org.jetbrains.java.decompiler.modules.decompiler.vars.VarDefinitionHelper.iterateClashingNames(VarDefinitionHelper.java:1541)
   //   at org.jetbrains.java.decompiler.modules.decompiler.vars.VarDefinitionHelper.iterateClashingExprent(VarDefinitionHelper.java:1672)
   //   at org.jetbrains.java.decompiler.modules.decompiler.vars.VarDefinitionHelper.iterateClashingNames(VarDefinitionHelper.java:1492)
   //   at org.jetbrains.java.decompiler.modules.decompiler.vars.VarDefinitionHelper.iterateClashingNames(VarDefinitionHelper.java:1541)
   //   at org.jetbrains.java.decompiler.modules.decompiler.vars.VarDefinitionHelper.iterateClashingExprent(VarDefinitionHelper.java:1672)
   //   at org.jetbrains.java.decompiler.modules.decompiler.vars.VarDefinitionHelper.iterateClashingNames(VarDefinitionHelper.java:1492)
   //   at org.jetbrains.java.decompiler.modules.decompiler.vars.VarDefinitionHelper.iterateClashingNames(VarDefinitionHelper.java:1541)
   //   at org.jetbrains.java.decompiler.modules.decompiler.vars.VarDefinitionHelper.iterateClashingExprent(VarDefinitionHelper.java:1672)
   //   at org.jetbrains.java.decompiler.modules.decompiler.vars.VarDefinitionHelper.iterateClashingNames(VarDefinitionHelper.java:1492)
   //   at org.jetbrains.java.decompiler.modules.decompiler.vars.VarDefinitionHelper.iterateClashingNames(VarDefinitionHelper.java:1541)
   //   at org.jetbrains.java.decompiler.modules.decompiler.vars.VarDefinitionHelper.iterateClashingExprent(VarDefinitionHelper.java:1672)
   //   at org.jetbrains.java.decompiler.modules.decompiler.vars.VarDefinitionHelper.iterateClashingNames(VarDefinitionHelper.java:1492)
   //   at org.jetbrains.java.decompiler.modules.decompiler.vars.VarDefinitionHelper.iterateClashingNames(VarDefinitionHelper.java:1541)
   //   at org.jetbrains.java.decompiler.modules.decompiler.vars.VarDefinitionHelper.iterateClashingExprent(VarDefinitionHelper.java:1672)
   //   at org.jetbrains.java.decompiler.modules.decompiler.vars.VarDefinitionHelper.iterateClashingNames(VarDefinitionHelper.java:1492)
   //   at org.jetbrains.java.decompiler.modules.decompiler.vars.VarDefinitionHelper.iterateClashingNames(VarDefinitionHelper.java:1541)
   //   at org.jetbrains.java.decompiler.modules.decompiler.vars.VarDefinitionHelper.iterateClashingExprent(VarDefinitionHelper.java:1672)
   //   at org.jetbrains.java.decompiler.modules.decompiler.vars.VarDefinitionHelper.iterateClashingNames(VarDefinitionHelper.java:1492)
   //   at org.jetbrains.java.decompiler.modules.decompiler.vars.VarDefinitionHelper.iterateClashingNames(VarDefinitionHelper.java:1541)
   //   at org.jetbrains.java.decompiler.modules.decompiler.vars.VarDefinitionHelper.iterateClashingExprent(VarDefinitionHelper.java:1672)
   //   at org.jetbrains.java.decompiler.modules.decompiler.vars.VarDefinitionHelper.iterateClashingNames(VarDefinitionHelper.java:1492)
   //   at org.jetbrains.java.decompiler.modules.decompiler.vars.VarDefinitionHelper.iterateClashingNames(VarDefinitionHelper.java:1541)
   //   at org.jetbrains.java.decompiler.modules.decompiler.vars.VarDefinitionHelper.iterateClashingExprent(VarDefinitionHelper.java:1672)
   //   at org.jetbrains.java.decompiler.modules.decompiler.vars.VarDefinitionHelper.iterateClashingNames(VarDefinitionHelper.java:1492)
   //   at org.jetbrains.java.decompiler.modules.decompiler.vars.VarDefinitionHelper.iterateClashingNames(VarDefinitionHelper.java:1541)
   //   at org.jetbrains.java.decompiler.modules.decompiler.vars.VarDefinitionHelper.iterateClashingExprent(VarDefinitionHelper.java:1672)
   //   at org.jetbrains.java.decompiler.modules.decompiler.vars.VarDefinitionHelper.iterateClashingNames(VarDefinitionHelper.java:1492)
   //   at org.jetbrains.java.decompiler.modules.decompiler.vars.VarDefinitionHelper.iterateClashingNames(VarDefinitionHelper.java:1541)
   //   at org.jetbrains.java.decompiler.modules.decompiler.vars.VarDefinitionHelper.iterateClashingExprent(VarDefinitionHelper.java:1672)
   //   at org.jetbrains.java.decompiler.modules.decompiler.vars.VarDefinitionHelper.iterateClashingNames(VarDefinitionHelper.java:1492)
   //   at org.jetbrains.java.decompiler.modules.decompiler.vars.VarDefinitionHelper.iterateClashingNames(VarDefinitionHelper.java:1541)
   //   at org.jetbrains.java.decompiler.modules.decompiler.vars.VarDefinitionHelper.iterateClashingExprent(VarDefinitionHelper.java:1672)
   //   at org.jetbrains.java.decompiler.modules.decompiler.vars.VarDefinitionHelper.iterateClashingNames(VarDefinitionHelper.java:1492)
   //   at org.jetbrains.java.decompiler.modules.decompiler.vars.VarDefinitionHelper.iterateClashingNames(VarDefinitionHelper.java:1541)
   //   at org.jetbrains.java.decompiler.modules.decompiler.vars.VarDefinitionHelper.iterateClashingExprent(VarDefinitionHelper.java:1672)
   //   at org.jetbrains.java.decompiler.modules.decompiler.vars.VarDefinitionHelper.iterateClashingNames(VarDefinitionHelper.java:1492)
   //   at org.jetbrains.java.decompiler.modules.decompiler.vars.VarDefinitionHelper.iterateClashingNames(VarDefinitionHelper.java:1541)
   //   at org.jetbrains.java.decompiler.modules.decompiler.vars.VarDefinitionHelper.iterateClashingExprent(VarDefinitionHelper.java:1672)
   //   at org.jetbrains.java.decompiler.modules.decompiler.vars.VarDefinitionHelper.iterateClashingNames(VarDefinitionHelper.java:1492)
   //   at org.jetbrains.java.decompiler.modules.decompiler.vars.VarDefinitionHelper.iterateClashingNames(VarDefinitionHelper.java:1541)
   //   at org.jetbrains.java.decompiler.modules.decompiler.vars.VarDefinitionHelper.iterateClashingExprent(VarDefinitionHelper.java:1672)
   //   at org.jetbrains.java.decompiler.modules.decompiler.vars.VarDefinitionHelper.iterateClashingNames(VarDefinitionHelper.java:1492)
   //   at org.jetbrains.java.decompiler.modules.decompiler.vars.VarDefinitionHelper.iterateClashingNames(VarDefinitionHelper.java:1541)
   //   at org.jetbrains.java.decompiler.modules.decompiler.vars.VarDefinitionHelper.iterateClashingExprent(VarDefinitionHelper.java:1672)
   //   at org.jetbrains.java.decompiler.modules.decompiler.vars.VarDefinitionHelper.iterateClashingNames(VarDefinitionHelper.java:1492)
   //   at org.jetbrains.java.decompiler.modules.decompiler.vars.VarDefinitionHelper.iterateClashingNames(VarDefinitionHelper.java:1541)
   //   at org.jetbrains.java.decompiler.modules.decompiler.vars.VarDefinitionHelper.iterateClashingExprent(VarDefinitionHelper.java:1672)
   //   at org.jetbrains.java.decompiler.modules.decompiler.vars.VarDefinitionHelper.iterateClashingNames(VarDefinitionHelper.java:1492)
   //   at org.jetbrains.java.decompiler.modules.decompiler.vars.VarDefinitionHelper.iterateClashingNames(VarDefinitionHelper.java:1541)
   //   at org.jetbrains.java.decompiler.modules.decompiler.vars.VarDefinitionHelper.iterateClashingExprent(VarDefinitionHelper.java:1672)
   //   at org.jetbrains.java.decompiler.modules.decompiler.vars.VarDefinitionHelper.iterateClashingNames(VarDefinitionHelper.java:1492)
   //   at org.jetbrains.java.decompiler.modules.decompiler.vars.VarDefinitionHelper.iterateClashingNames(VarDefinitionHelper.java:1541)
   //   at org.jetbrains.java.decompiler.modules.decompiler.vars.VarDefinitionHelper.iterateClashingExprent(VarDefinitionHelper.java:1672)
   //   at org.jetbrains.java.decompiler.modules.decompiler.vars.VarDefinitionHelper.iterateClashingNames(VarDefinitionHelper.java:1492)
   //   at org.jetbrains.java.decompiler.modules.decompiler.vars.VarDefinitionHelper.iterateClashingNames(VarDefinitionHelper.java:1541)
   //   at org.jetbrains.java.decompiler.modules.decompiler.vars.VarDefinitionHelper.iterateClashingExprent(VarDefinitionHelper.java:1672)
   //   at org.jetbrains.java.decompiler.modules.decompiler.vars.VarDefinitionHelper.iterateClashingNames(VarDefinitionHelper.java:1492)
   //   at org.jetbrains.java.decompiler.modules.decompiler.vars.VarDefinitionHelper.iterateClashingNames(VarDefinitionHelper.java:1541)
   //   at org.jetbrains.java.decompiler.modules.decompiler.vars.VarDefinitionHelper.iterateClashingExprent(VarDefinitionHelper.java:1672)
   //   at org.jetbrains.java.decompiler.modules.decompiler.vars.VarDefinitionHelper.iterateClashingNames(VarDefinitionHelper.java:1492)
   //   at org.jetbrains.java.decompiler.modules.decompiler.vars.VarDefinitionHelper.iterateClashingNames(VarDefinitionHelper.java:1541)
   //   at org.jetbrains.java.decompiler.modules.decompiler.vars.VarDefinitionHelper.iterateClashingExprent(VarDefinitionHelper.java:1672)
   //   at org.jetbrains.java.decompiler.modules.decompiler.vars.VarDefinitionHelper.iterateClashingNames(VarDefinitionHelper.java:1492)
   //   at org.jetbrains.java.decompiler.modules.decompiler.vars.VarDefinitionHelper.iterateClashingNames(VarDefinitionHelper.java:1541)
   ,
         var3
      );
   }

   private fun createMP4FastStartUri(inputUri: Uri, compressedUri: Uri, mediaSourceSize: Long): Uri? {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.IndexOutOfBoundsException: Index 0 out of bounds for length 0
      //   at java.base/jdk.internal.util.Preconditions.outOfBounds(Preconditions.java:100)
      //   at java.base/jdk.internal.util.Preconditions.outOfBoundsCheckIndex(Preconditions.java:106)
      //   at java.base/jdk.internal.util.Preconditions.checkIndex(Preconditions.java:302)
      //   at java.base/java.util.Objects.checkIndex(Objects.java:385)
      //   at java.base/java.util.ArrayList.remove(ArrayList.java:551)
      //   at org.jetbrains.java.decompiler.modules.decompiler.FinallyProcessor.removeExceptionInstructionsEx(FinallyProcessor.java:1057)
      //   at org.jetbrains.java.decompiler.modules.decompiler.FinallyProcessor.insertSemaphore(FinallyProcessor.java:350)
      //   at org.jetbrains.java.decompiler.modules.decompiler.FinallyProcessor.iterateGraph(FinallyProcessor.java:99)
      //
      // Bytecode:
      // 00: aload 2
      // 01: invokevirtual android/net/Uri.getPath ()Ljava/lang/String;
      // 04: astore 8
      // 06: aload 8
      // 08: ifnonnull 0d
      // 0b: aconst_null
      // 0c: areturn
      // 0d: new java/io/File
      // 10: dup
      // 11: aload 8
      // 13: invokespecial java/io/File.<init> (Ljava/lang/String;)V
      // 16: invokevirtual java/io/File.length ()J
      // 19: lload 3
      // 1a: lcmp
      // 1b: ifle 21
      // 1e: goto 23
      // 21: aload 2
      // 22: astore 1
      // 23: aload 0
      // 24: invokespecial com/discord/media/utils/MediaResolver.getResolver ()Landroid/content/ContentResolver;
      // 27: aload 1
      // 28: ldc "r"
      // 2a: invokevirtual android/content/ContentResolver.openFileDescriptor (Landroid/net/Uri;Ljava/lang/String;)Landroid/os/ParcelFileDescriptor;
      // 2d: astore 10
      // 2f: aload 10
      // 31: ifnonnull 36
      // 34: aconst_null
      // 35: areturn
      // 36: getstatic com/discord/media/utils/ContentResolverUtils.INSTANCE Lcom/discord/media/utils/ContentResolverUtils;
      // 39: aload 0
      // 3a: invokespecial com/discord/media/utils/MediaResolver.getResolver ()Landroid/content/ContentResolver;
      // 3d: aload 1
      // 3e: aconst_null
      // 3f: ldc "mp4"
      // 41: bipush 2
      // 42: aconst_null
      // 43: invokestatic com/discord/media/utils/ContentResolverUtils.createTempFile$default (Lcom/discord/media/utils/ContentResolverUtils;Landroid/content/ContentResolver;Landroid/net/Uri;Ljava/lang/String;Ljava/lang/String;ILjava/lang/Object;)Ljava/io/File;
      // 46: astore 9
      // 48: bipush 0
      // 49: istore 5
      // 4b: aload 10
      // 4d: invokevirtual android/os/ParcelFileDescriptor.getFileDescriptor ()Ljava/io/FileDescriptor;
      // 50: aload 9
      // 52: invokestatic wl/b.a (Ljava/io/FileDescriptor;Ljava/io/File;)Z
      // 55: istore 6
      // 57: iload 6
      // 59: ifeq 7a
      // 5c: iload 6
      // 5e: istore 5
      // 60: aload 9
      // 62: invokestatic android/net/Uri.fromFile (Ljava/io/File;)Landroid/net/Uri;
      // 65: astore 7
      // 67: iload 6
      // 69: istore 5
      // 6b: aload 7
      // 6d: ldc "fromFile(this)"
      // 6f: invokestatic kotlin/jvm/internal/q.g (Ljava/lang/Object;Ljava/lang/String;)V
      // 72: goto 7d
      // 75: astore 7
      // 77: goto b5
      // 7a: aload 1
      // 7b: astore 7
      // 7d: aload 10
      // 7f: invokevirtual android/os/ParcelFileDescriptor.close ()V
      // 82: iload 6
      // 84: ifeq 97
      // 87: new java/io/File
      // 8a: dup
      // 8b: aload 8
      // 8d: invokespecial java/io/File.<init> (Ljava/lang/String;)V
      // 90: invokevirtual java/io/File.delete ()Z
      // 93: pop
      // 94: goto b2
      // 97: aload 9
      // 99: invokevirtual java/io/File.delete ()Z
      // 9c: pop
      // 9d: aload 1
      // 9e: aload 2
      // 9f: invokestatic kotlin/jvm/internal/q.c (Ljava/lang/Object;Ljava/lang/Object;)Z
      // a2: ifne b2
      // a5: new java/io/File
      // a8: dup
      // a9: aload 8
      // ab: invokespecial java/io/File.<init> (Ljava/lang/String;)V
      // ae: invokevirtual java/io/File.delete ()Z
      // b1: pop
      // b2: aload 7
      // b4: areturn
      // b5: aload 10
      // b7: invokevirtual android/os/ParcelFileDescriptor.close ()V
      // ba: iload 5
      // bc: ifne dd
      // bf: aload 9
      // c1: invokevirtual java/io/File.delete ()Z
      // c4: pop
      // c5: aload 1
      // c6: aload 2
      // c7: invokestatic kotlin/jvm/internal/q.c (Ljava/lang/Object;Ljava/lang/Object;)Z
      // ca: ifne ea
      // cd: new java/io/File
      // d0: dup
      // d1: aload 8
      // d3: invokespecial java/io/File.<init> (Ljava/lang/String;)V
      // d6: invokevirtual java/io/File.delete ()Z
      // d9: pop
      // da: goto ea
      // dd: new java/io/File
      // e0: dup
      // e1: aload 8
      // e3: invokespecial java/io/File.<init> (Ljava/lang/String;)V
      // e6: invokevirtual java/io/File.delete ()Z
      // e9: pop
      // ea: aload 7
      // ec: athrow
   }

   private suspend fun handleImage(inputUri: Uri, compressionQuality: Int, isLowQuality: Boolean): Uri {
      label62: {
         if (var4 is <unrepresentable>) {
            val var8: <unrepresentable> = var4 as <unrepresentable>;
            if (((var4 as <unrepresentable>).label and Integer.MIN_VALUE) != 0) {
               var8.label = (var4 as <unrepresentable>).label + Integer.MIN_VALUE;
               var14 = var8;
               break label62;
            }
         }

         var14 = new d(this, var4) {
            Object L$0;
            Object L$1;
            int label;
            Object result;
            final MediaResolver this$0;

            {
               super(var2);
               this.this$0 = var1;
            }

            public final Object invokeSuspend(Object var1) {
               this.result = var1;
               this.label |= Integer.MIN_VALUE;
               return MediaResolver.access$handleImage(this.this$0, null, 0, false, this);
            }
         };
      }

      var var19: Any;
      label57: {
         var19 = ((<unrepresentable>)var14).result;
         val var9: Any = qh.b.e();
         if (((<unrepresentable>)var14).label != 0) {
            if (((<unrepresentable>)var14).label == 1) {
               var1 = ((<unrepresentable>)var14).L$1 as Uri;
               var15 = ((<unrepresentable>)var14).L$0 as MediaResolver;
               s.b(var19);
               break label57;
            }

            if (((<unrepresentable>)var14).label != 2) {
               throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }

            s.b(var19);
         } else {
            s.b(var19);
            var19 = this.getResolver();
            val var10: ContentResolverUtils = ContentResolverUtils.INSTANCE;
            val var17: Boolean;
            if (ContentResolverUtils.INSTANCE.isHeif((ContentResolver)var19, var1)
               || var10.isJpeg((ContentResolver)var19, var1)
               || var3 && var10.isPng((ContentResolver)var19, var1)) {
               var17 = true;
            } else {
               var17 = false;
            }

            var var18: Boolean = false;
            if (var17) {
               var18 = false;
               if (var3) {
                  var18 = true;
               }
            }

            if (var17) {
               var19 = rg.a.a;
               val var11: Context = this.context;
               val var23: Function1 = new Function1(var2, var18, this, var1) {
                  final int $compressionQuality;
                  final Uri $inputUri;
                  final boolean $shouldResize;
                  final MediaResolver this$0;

                  {
                     super(1);
                     this.$compressionQuality = var1;
                     this.$shouldResize = var2;
                     this.this$0 = var3;
                     this.$inputUri = var4;
                  }

                  public final void invoke(Compression var1) {
                     q.h(var1, "$this$compress");
                     var1.a(new QualityAndResolutionConstraint(this.$compressionQuality, this.$shouldResize));
                     g.a(var1, CompressFormat.JPEG);
                     e.a(
                        var1,
                        ContentResolverUtils.createTempFile$default(
                           ContentResolverUtils.INSTANCE, MediaResolver.access$getResolver(this.this$0), this.$inputUri, null, "jpeg", 2, null
                        )
                     );
                  }
               };
               ((<unrepresentable>)var14).L$0 = this;
               ((<unrepresentable>)var14).L$1 = var1;
               ((<unrepresentable>)var14).label = 1;
               var19 = rg.a.b((rg.a)var19, var11, var1, null, var23, (Continuation)var14, 4, null);
               if (var19 === var9) {
                  return var9;
               }

               var15 = this;
               break label57;
            }

            ((<unrepresentable>)var14).label = 2;
            val var12: Any = copyToFile$default(this, var1, null, (Continuation)var14, 2, null);
            var19 = var12;
            if (var12 === var9) {
               return var9;
            }
         }

         return var19;
      }

      var19 = var19 as File;
      var15.onProgress.invoke(var1, kotlin.coroutines.jvm.internal.b.c(100));
      var1 = Uri.fromFile((File)var19);
      q.g(var1, "fromFile(this)");
      return var1;
   }

   private suspend fun handleVideo(inputUri: Uri, compressionQuality: VideoCompressionQuality, skipVideoTranscode: Boolean): Uri {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.IndexOutOfBoundsException: Index 0 out of bounds for length 0
      //   at java.base/jdk.internal.util.Preconditions.outOfBounds(Preconditions.java:100)
      //   at java.base/jdk.internal.util.Preconditions.outOfBoundsCheckIndex(Preconditions.java:106)
      //   at java.base/jdk.internal.util.Preconditions.checkIndex(Preconditions.java:302)
      //   at java.base/java.util.Objects.checkIndex(Objects.java:385)
      //   at java.base/java.util.ArrayList.remove(ArrayList.java:551)
      //   at org.jetbrains.java.decompiler.modules.decompiler.FinallyProcessor.removeExceptionInstructionsEx(FinallyProcessor.java:1057)
      //   at org.jetbrains.java.decompiler.modules.decompiler.FinallyProcessor.insertSemaphore(FinallyProcessor.java:350)
      //   at org.jetbrains.java.decompiler.modules.decompiler.FinallyProcessor.iterateGraph(FinallyProcessor.java:99)
      //
      // Bytecode:
      // 000: aload 1
      // 001: astore 6
      // 003: aload 4
      // 005: instanceof com/discord/media/utils/MediaResolver$handleVideo$1
      // 008: ifeq 030
      // 00b: aload 4
      // 00d: checkcast com/discord/media/utils/MediaResolver$handleVideo$1
      // 010: astore 11
      // 012: aload 11
      // 014: getfield com/discord/media/utils/MediaResolver$handleVideo$1.label I
      // 017: istore 5
      // 019: iload 5
      // 01b: ldc_w -2147483648
      // 01e: iand
      // 01f: ifeq 030
      // 022: aload 11
      // 024: iload 5
      // 026: ldc_w -2147483648
      // 029: iadd
      // 02a: putfield com/discord/media/utils/MediaResolver$handleVideo$1.label I
      // 02d: goto 03f
      // 030: new com/discord/media/utils/MediaResolver$handleVideo$1
      // 033: dup
      // 034: aload 0
      // 035: aload 4
      // 037: invokespecial com/discord/media/utils/MediaResolver$handleVideo$1.<init> (Lcom/discord/media/utils/MediaResolver;Lkotlin/coroutines/Continuation;)V
      // 03a: astore 11
      // 03c: goto 02d
      // 03f: aload 11
      // 041: getfield com/discord/media/utils/MediaResolver$handleVideo$1.result Ljava/lang/Object;
      // 044: astore 4
      // 046: invokestatic qh/b.e ()Ljava/lang/Object;
      // 049: astore 13
      // 04b: aload 11
      // 04d: getfield com/discord/media/utils/MediaResolver$handleVideo$1.label I
      // 050: istore 5
      // 052: iload 5
      // 054: ifeq 0d5
      // 057: iload 5
      // 059: bipush 1
      // 05a: if_icmpeq 084
      // 05d: iload 5
      // 05f: bipush 2
      // 060: if_icmpeq 07c
      // 063: iload 5
      // 065: bipush 3
      // 066: if_icmpne 071
      // 069: aload 4
      // 06b: invokestatic kh/s.b (Ljava/lang/Object;)V
      // 06e: goto 325
      // 071: new java/lang/IllegalStateException
      // 074: dup
      // 075: ldc_w "call to 'resume' before 'invoke' with coroutine"
      // 078: invokespecial java/lang/IllegalStateException.<init> (Ljava/lang/String;)V
      // 07b: athrow
      // 07c: aload 4
      // 07e: invokestatic kh/s.b (Ljava/lang/Object;)V
      // 081: goto 2fa
      // 084: aload 11
      // 086: getfield com/discord/media/utils/MediaResolver$handleVideo$1.L$4 Ljava/lang/Object;
      // 089: checkcast com/discord/media/utils/MediaResolver
      // 08c: astore 8
      // 08e: aload 11
      // 090: getfield com/discord/media/utils/MediaResolver$handleVideo$1.L$3 Ljava/lang/Object;
      // 093: checkcast com/discord/media/utils/DiscordVideoMediaSource
      // 096: astore 10
      // 098: aload 11
      // 09a: getfield com/discord/media/utils/MediaResolver$handleVideo$1.L$2 Ljava/lang/Object;
      // 09d: checkcast android/net/Uri
      // 0a0: astore 2
      // 0a1: aload 11
      // 0a3: getfield com/discord/media/utils/MediaResolver$handleVideo$1.L$1 Ljava/lang/Object;
      // 0a6: checkcast android/net/Uri
      // 0a9: astore 6
      // 0ab: aload 11
      // 0ad: getfield com/discord/media/utils/MediaResolver$handleVideo$1.L$0 Ljava/lang/Object;
      // 0b0: checkcast com/discord/media/utils/MediaResolver
      // 0b3: astore 1
      // 0b4: aload 4
      // 0b6: invokestatic kh/s.b (Ljava/lang/Object;)V
      // 0b9: aload 4
      // 0bb: astore 12
      // 0bd: goto 20a
      // 0c0: astore 4
      // 0c2: aload 6
      // 0c4: astore 7
      // 0c6: aload 4
      // 0c8: astore 6
      // 0ca: aload 2
      // 0cb: astore 4
      // 0cd: aload 1
      // 0ce: astore 2
      // 0cf: aload 7
      // 0d1: astore 1
      // 0d2: goto 266
      // 0d5: aload 4
      // 0d7: invokestatic kh/s.b (Ljava/lang/Object;)V
      // 0da: getstatic com/discord/media/utils/ContentResolverUtils.INSTANCE Lcom/discord/media/utils/ContentResolverUtils;
      // 0dd: aload 0
      // 0de: invokespecial com/discord/media/utils/MediaResolver.getResolver ()Landroid/content/ContentResolver;
      // 0e1: aload 1
      // 0e2: aconst_null
      // 0e3: ldc "mp4"
      // 0e5: bipush 2
      // 0e6: aconst_null
      // 0e7: invokestatic com/discord/media/utils/ContentResolverUtils.createTempFile$default (Lcom/discord/media/utils/ContentResolverUtils;Landroid/content/ContentResolver;Landroid/net/Uri;Ljava/lang/String;Ljava/lang/String;ILjava/lang/Object;)Ljava/io/File;
      // 0ea: invokestatic android/net/Uri.fromFile (Ljava/io/File;)Landroid/net/Uri;
      // 0ed: astore 4
      // 0ef: aload 4
      // 0f1: ldc "fromFile(this)"
      // 0f3: invokestatic kotlin/jvm/internal/q.g (Ljava/lang/Object;Ljava/lang/String;)V
      // 0f6: getstatic kh/r.k Lkh/r$a;
      // 0f9: astore 7
      // 0fb: new com/discord/media/utils/DiscordVideoMediaSource
      // 0fe: astore 7
      // 100: aload 7
      // 102: aload 0
      // 103: getfield com/discord/media/utils/MediaResolver.context Landroid/content/Context;
      // 106: aload 6
      // 108: aload 4
      // 10a: aload 2
      // 10b: invokespecial com/discord/media/utils/DiscordVideoMediaSource.<init> (Landroid/content/Context;Landroid/net/Uri;Landroid/net/Uri;Lcom/discord/media/utils/VideoCompressionQuality;)V
      // 10e: aload 7
      // 110: invokestatic kh/r.b (Ljava/lang/Object;)Ljava/lang/Object;
      // 113: astore 2
      // 114: goto 125
      // 117: astore 2
      // 118: getstatic kh/r.k Lkh/r$a;
      // 11b: astore 7
      // 11d: aload 2
      // 11e: invokestatic kh/s.a (Ljava/lang/Throwable;)Ljava/lang/Object;
      // 121: invokestatic kh/r.b (Ljava/lang/Object;)Ljava/lang/Object;
      // 124: astore 2
      // 125: aload 2
      // 126: invokestatic kh/r.e (Ljava/lang/Object;)Ljava/lang/Throwable;
      // 129: astore 9
      // 12b: aload 9
      // 12d: ifnull 172
      // 130: aload 9
      // 132: invokevirtual java/lang/Throwable.getMessage ()Ljava/lang/String;
      // 135: astore 7
      // 137: new java/lang/StringBuilder
      // 13a: dup
      // 13b: invokespecial java/lang/StringBuilder.<init> ()V
      // 13e: astore 8
      // 140: aload 8
      // 142: ldc_w "["
      // 145: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 148: pop
      // 149: aload 8
      // 14b: aload 9
      // 14d: invokevirtual java/lang/StringBuilder.append (Ljava/lang/Object;)Ljava/lang/StringBuilder;
      // 150: pop
      // 151: aload 8
      // 153: ldc_w "] Error creating source: "
      // 156: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 159: pop
      // 15a: aload 8
      // 15c: aload 7
      // 15e: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 161: pop
      // 162: aload 0
      // 163: ldc_w "Media source error"
      // 166: aload 8
      // 168: invokevirtual java/lang/StringBuilder.toString ()Ljava/lang/String;
      // 16b: aload 6
      // 16d: aload 4
      // 16f: invokespecial com/discord/media/utils/MediaResolver.logMediaError (Ljava/lang/String;Ljava/lang/String;Landroid/net/Uri;Landroid/net/Uri;)V
      // 172: aload 2
      // 173: astore 7
      // 175: aload 2
      // 176: invokestatic kh/r.g (Ljava/lang/Object;)Z
      // 179: ifeq 17f
      // 17c: aconst_null
      // 17d: astore 7
      // 17f: aload 7
      // 181: checkcast com/discord/media/utils/DiscordVideoMediaSource
      // 184: astore 2
      // 185: aload 2
      // 186: ifnull 308
      // 189: iload 3
      // 18a: ifeq 1a1
      // 18d: aload 2
      // 18e: astore 10
      // 190: aload 6
      // 192: astore 1
      // 193: aload 0
      // 194: astore 2
      // 195: aload 2
      // 196: astore 9
      // 198: aload 2
      // 199: astore 8
      // 19b: aload 4
      // 19d: astore 2
      // 19e: goto 221
      // 1a1: getstatic com/discord/media/utils/Transcoder.INSTANCE Lcom/discord/media/utils/Transcoder;
      // 1a4: astore 7
      // 1a6: aload 0
      // 1a7: aload 1
      // 1a8: invokespecial com/discord/media/utils/MediaResolver.getRequestId (Landroid/net/Uri;)Ljava/lang/String;
      // 1ab: astore 1
      // 1ac: aload 0
      // 1ad: getfield com/discord/media/utils/MediaResolver.context Landroid/content/Context;
      // 1b0: astore 8
      // 1b2: new com/discord/media/utils/MediaResolver$handleVideo$2$compressedUri$1
      // 1b5: astore 9
      // 1b7: aload 9
      // 1b9: aload 0
      // 1ba: aload 6
      // 1bc: invokespecial com/discord/media/utils/MediaResolver$handleVideo$2$compressedUri$1.<init> (Lcom/discord/media/utils/MediaResolver;Landroid/net/Uri;)V
      // 1bf: aload 11
      // 1c1: aload 0
      // 1c2: putfield com/discord/media/utils/MediaResolver$handleVideo$1.L$0 Ljava/lang/Object;
      // 1c5: aload 11
      // 1c7: aload 6
      // 1c9: putfield com/discord/media/utils/MediaResolver$handleVideo$1.L$1 Ljava/lang/Object;
      // 1cc: aload 11
      // 1ce: aload 4
      // 1d0: putfield com/discord/media/utils/MediaResolver$handleVideo$1.L$2 Ljava/lang/Object;
      // 1d3: aload 11
      // 1d5: aload 2
      // 1d6: putfield com/discord/media/utils/MediaResolver$handleVideo$1.L$3 Ljava/lang/Object;
      // 1d9: aload 11
      // 1db: aload 0
      // 1dc: putfield com/discord/media/utils/MediaResolver$handleVideo$1.L$4 Ljava/lang/Object;
      // 1df: aload 11
      // 1e1: bipush 1
      // 1e2: putfield com/discord/media/utils/MediaResolver$handleVideo$1.label I
      // 1e5: aload 7
      // 1e7: aload 1
      // 1e8: aload 8
      // 1ea: aload 2
      // 1eb: aload 9
      // 1ed: aload 11
      // 1ef: invokevirtual com/discord/media/utils/Transcoder.convertCompress (Ljava/lang/String;Landroid/content/Context;Lcom/discord/media/utils/DiscordVideoMediaSource;Lkotlin/jvm/functions/Function1;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;
      // 1f2: astore 12
      // 1f4: aload 12
      // 1f6: aload 13
      // 1f8: if_acmpne 1fe
      // 1fb: aload 13
      // 1fd: areturn
      // 1fe: aload 2
      // 1ff: astore 10
      // 201: aload 0
      // 202: astore 8
      // 204: aload 8
      // 206: astore 1
      // 207: aload 4
      // 209: astore 2
      // 20a: aload 6
      // 20c: astore 7
      // 20e: aload 1
      // 20f: astore 4
      // 211: aload 2
      // 212: astore 9
      // 214: aload 12
      // 216: checkcast android/net/Uri
      // 219: astore 12
      // 21b: aload 1
      // 21c: astore 9
      // 21e: aload 12
      // 220: astore 1
      // 221: aload 6
      // 223: astore 7
      // 225: aload 9
      // 227: astore 4
      // 229: aload 2
      // 22a: astore 9
      // 22c: aload 8
      // 22e: aload 6
      // 230: aload 1
      // 231: aload 10
      // 233: invokevirtual pf/a.getSize ()J
      // 236: invokespecial com/discord/media/utils/MediaResolver.createMP4FastStartUri (Landroid/net/Uri;Landroid/net/Uri;J)Landroid/net/Uri;
      // 239: astore 2
      // 23a: aload 2
      // 23b: ifnonnull 241
      // 23e: goto 243
      // 241: aload 2
      // 242: astore 1
      // 243: aload 1
      // 244: areturn
      // 245: astore 6
      // 247: aload 7
      // 249: astore 1
      // 24a: aload 4
      // 24c: astore 2
      // 24d: aload 9
      // 24f: astore 4
      // 251: goto 266
      // 254: astore 7
      // 256: aload 6
      // 258: astore 1
      // 259: aload 0
      // 25a: astore 2
      // 25b: aload 7
      // 25d: astore 6
      // 25f: aload 4
      // 261: astore 9
      // 263: goto 24d
      // 266: getstatic kh/r.k Lkh/r$a;
      // 269: astore 7
      // 26b: aload 6
      // 26d: invokestatic kh/s.a (Ljava/lang/Throwable;)Ljava/lang/Object;
      // 270: invokestatic kh/r.b (Ljava/lang/Object;)Ljava/lang/Object;
      // 273: astore 6
      // 275: aload 6
      // 277: invokestatic kh/r.e (Ljava/lang/Object;)Ljava/lang/Throwable;
      // 27a: astore 7
      // 27c: aload 7
      // 27e: ifnonnull 287
      // 281: aload 6
      // 283: astore 1
      // 284: goto 300
      // 287: aload 7
      // 289: instanceof java/util/concurrent/CancellationException
      // 28c: ifne 305
      // 28f: aload 7
      // 291: invokevirtual java/lang/Throwable.getMessage ()Ljava/lang/String;
      // 294: astore 7
      // 296: new java/lang/StringBuilder
      // 299: dup
      // 29a: invokespecial java/lang/StringBuilder.<init> ()V
      // 29d: astore 6
      // 29f: aload 6
      // 2a1: ldc_w "Error compressing/converting video: "
      // 2a4: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 2a7: pop
      // 2a8: aload 6
      // 2aa: aload 7
      // 2ac: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 2af: pop
      // 2b0: aload 2
      // 2b1: ldc_w "Media conversion error"
      // 2b4: aload 6
      // 2b6: invokevirtual java/lang/StringBuilder.toString ()Ljava/lang/String;
      // 2b9: aload 1
      // 2ba: aload 4
      // 2bc: invokespecial com/discord/media/utils/MediaResolver.logMediaError (Ljava/lang/String;Ljava/lang/String;Landroid/net/Uri;Landroid/net/Uri;)V
      // 2bf: aload 11
      // 2c1: aconst_null
      // 2c2: putfield com/discord/media/utils/MediaResolver$handleVideo$1.L$0 Ljava/lang/Object;
      // 2c5: aload 11
      // 2c7: aconst_null
      // 2c8: putfield com/discord/media/utils/MediaResolver$handleVideo$1.L$1 Ljava/lang/Object;
      // 2cb: aload 11
      // 2cd: aconst_null
      // 2ce: putfield com/discord/media/utils/MediaResolver$handleVideo$1.L$2 Ljava/lang/Object;
      // 2d1: aload 11
      // 2d3: aconst_null
      // 2d4: putfield com/discord/media/utils/MediaResolver$handleVideo$1.L$3 Ljava/lang/Object;
      // 2d7: aload 11
      // 2d9: aconst_null
      // 2da: putfield com/discord/media/utils/MediaResolver$handleVideo$1.L$4 Ljava/lang/Object;
      // 2dd: aload 11
      // 2df: bipush 2
      // 2e0: putfield com/discord/media/utils/MediaResolver$handleVideo$1.label I
      // 2e3: aload 2
      // 2e4: aload 1
      // 2e5: aconst_null
      // 2e6: aload 11
      // 2e8: bipush 2
      // 2e9: aconst_null
      // 2ea: invokestatic com/discord/media/utils/MediaResolver.copyToFile$default (Lcom/discord/media/utils/MediaResolver;Landroid/net/Uri;Ljava/io/File;Lkotlin/coroutines/Continuation;ILjava/lang/Object;)Ljava/lang/Object;
      // 2ed: astore 1
      // 2ee: aload 1
      // 2ef: astore 4
      // 2f1: aload 1
      // 2f2: aload 13
      // 2f4: if_acmpne 2fa
      // 2f7: aload 13
      // 2f9: areturn
      // 2fa: aload 4
      // 2fc: checkcast android/net/Uri
      // 2ff: astore 1
      // 300: aload 1
      // 301: checkcast android/net/Uri
      // 304: areturn
      // 305: aload 7
      // 307: athrow
      // 308: aload 11
      // 30a: bipush 3
      // 30b: putfield com/discord/media/utils/MediaResolver$handleVideo$1.label I
      // 30e: aload 0
      // 30f: aload 1
      // 310: aconst_null
      // 311: aload 11
      // 313: bipush 2
      // 314: aconst_null
      // 315: invokestatic com/discord/media/utils/MediaResolver.copyToFile$default (Lcom/discord/media/utils/MediaResolver;Landroid/net/Uri;Ljava/io/File;Lkotlin/coroutines/Continuation;ILjava/lang/Object;)Ljava/lang/Object;
      // 318: astore 1
      // 319: aload 1
      // 31a: astore 4
      // 31c: aload 1
      // 31d: aload 13
      // 31f: if_acmpne 325
      // 322: aload 13
      // 324: areturn
      // 325: aload 4
      // 327: areturn
   }

   private fun logMediaError(tag: String, message: String, inputUri: Uri, outputUri: Uri) {
      val var5: CrashReporting = CrashReporting.INSTANCE;
      CrashReporting.addBreadcrumb$default(
         CrashReporting.INSTANCE, var2, r.l(new Pair[]{w.a("inputUri", var3.toString()), w.a("outputUri", var4.toString())}), null, 4, null
      );
      var5.captureMessage(var1, var2, CrashReporting.ErrorLevel.WARNING);
   }

   public fun cancel(inputUri: Uri) {
      q.h(var1, "inputUri");
      Transcoder.INSTANCE.cancel(this.getRequestId(var1));
   }

   public fun getMimeType(uri: Uri): String? {
      q.h(var1, "uri");
      return this.getResolver().getType(var1);
   }

   public fun handleVideoMetadata(inputUri: Uri): Map<String, Any> {
      q.h(var1, "inputUri");
      val var3: Context = this.context;
      val var2: Uri = Uri.EMPTY;
      q.g(Uri.EMPTY, "EMPTY");
      return new DiscordVideoMediaSource(var3, var1, var2, VideoCompressionQuality.High).getMetadata();
   }

   public suspend fun resolveToUri(
      inputUri: Uri,
      imageCompressionQuality: Int,
      videoCompressionQuality: VideoCompressionQuality,
      isLowQuality: Boolean,
      skipVideoTranscode: Boolean
   ): Uri {
      return f.g(
         k0.b(),
         new Function2(this, var1, var3, var5, var2, var4, null)// $VF: Couldn't be decompiled
   // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
   // java.lang.StackOverflowError
   //   at org.jetbrains.java.decompiler.struct.gen.VarType.<init>(VarType.java:82)
   //   at org.jetbrains.java.decompiler.struct.gen.MethodDescriptor.parseDescriptor(MethodDescriptor.java:67)
   //   at org.jetbrains.java.decompiler.struct.gen.MethodDescriptor.parseDescriptor(MethodDescriptor.java:80)
   //   at org.jetbrains.java.decompiler.struct.StructMethod.methodDescriptor(StructMethod.java:371)
   //   at org.jetbrains.java.decompiler.modules.decompiler.vars.VarDefinitionHelper.iterateClashingExprent(VarDefinitionHelper.java:1649)
   //   at org.jetbrains.java.decompiler.modules.decompiler.vars.VarDefinitionHelper.iterateClashingNames(VarDefinitionHelper.java:1492)
   //   at org.jetbrains.java.decompiler.modules.decompiler.vars.VarDefinitionHelper.iterateClashingNames(VarDefinitionHelper.java:1541)
   //   at org.jetbrains.java.decompiler.modules.decompiler.vars.VarDefinitionHelper.iterateClashingExprent(VarDefinitionHelper.java:1672)
   //   at org.jetbrains.java.decompiler.modules.decompiler.vars.VarDefinitionHelper.iterateClashingNames(VarDefinitionHelper.java:1492)
   //   at org.jetbrains.java.decompiler.modules.decompiler.vars.VarDefinitionHelper.iterateClashingNames(VarDefinitionHelper.java:1541)
   //   at org.jetbrains.java.decompiler.modules.decompiler.vars.VarDefinitionHelper.iterateClashingExprent(VarDefinitionHelper.java:1672)
   //   at org.jetbrains.java.decompiler.modules.decompiler.vars.VarDefinitionHelper.iterateClashingNames(VarDefinitionHelper.java:1492)
   //   at org.jetbrains.java.decompiler.modules.decompiler.vars.VarDefinitionHelper.iterateClashingNames(VarDefinitionHelper.java:1541)
   //   at org.jetbrains.java.decompiler.modules.decompiler.vars.VarDefinitionHelper.iterateClashingExprent(VarDefinitionHelper.java:1672)
   //   at org.jetbrains.java.decompiler.modules.decompiler.vars.VarDefinitionHelper.iterateClashingNames(VarDefinitionHelper.java:1492)
   //   at org.jetbrains.java.decompiler.modules.decompiler.vars.VarDefinitionHelper.iterateClashingNames(VarDefinitionHelper.java:1541)
   //   at org.jetbrains.java.decompiler.modules.decompiler.vars.VarDefinitionHelper.iterateClashingExprent(VarDefinitionHelper.java:1672)
   //   at org.jetbrains.java.decompiler.modules.decompiler.vars.VarDefinitionHelper.iterateClashingNames(VarDefinitionHelper.java:1492)
   //   at org.jetbrains.java.decompiler.modules.decompiler.vars.VarDefinitionHelper.iterateClashingNames(VarDefinitionHelper.java:1541)
   //   at org.jetbrains.java.decompiler.modules.decompiler.vars.VarDefinitionHelper.iterateClashingExprent(VarDefinitionHelper.java:1672)
   //   at org.jetbrains.java.decompiler.modules.decompiler.vars.VarDefinitionHelper.iterateClashingNames(VarDefinitionHelper.java:1492)
   //   at org.jetbrains.java.decompiler.modules.decompiler.vars.VarDefinitionHelper.iterateClashingNames(VarDefinitionHelper.java:1541)
   //   at org.jetbrains.java.decompiler.modules.decompiler.vars.VarDefinitionHelper.iterateClashingExprent(VarDefinitionHelper.java:1672)
   //   at org.jetbrains.java.decompiler.modules.decompiler.vars.VarDefinitionHelper.iterateClashingNames(VarDefinitionHelper.java:1492)
   //   at org.jetbrains.java.decompiler.modules.decompiler.vars.VarDefinitionHelper.iterateClashingNames(VarDefinitionHelper.java:1541)
   //   at org.jetbrains.java.decompiler.modules.decompiler.vars.VarDefinitionHelper.iterateClashingExprent(VarDefinitionHelper.java:1672)
   //   at org.jetbrains.java.decompiler.modules.decompiler.vars.VarDefinitionHelper.iterateClashingNames(VarDefinitionHelper.java:1492)
   //   at org.jetbrains.java.decompiler.modules.decompiler.vars.VarDefinitionHelper.iterateClashingNames(VarDefinitionHelper.java:1541)
   //   at org.jetbrains.java.decompiler.modules.decompiler.vars.VarDefinitionHelper.iterateClashingExprent(VarDefinitionHelper.java:1672)
   //   at org.jetbrains.java.decompiler.modules.decompiler.vars.VarDefinitionHelper.iterateClashingNames(VarDefinitionHelper.java:1492)
   //   at org.jetbrains.java.decompiler.modules.decompiler.vars.VarDefinitionHelper.iterateClashingNames(VarDefinitionHelper.java:1541)
   //   at org.jetbrains.java.decompiler.modules.decompiler.vars.VarDefinitionHelper.iterateClashingExprent(VarDefinitionHelper.java:1672)
   //   at org.jetbrains.java.decompiler.modules.decompiler.vars.VarDefinitionHelper.iterateClashingNames(VarDefinitionHelper.java:1492)
   //   at org.jetbrains.java.decompiler.modules.decompiler.vars.VarDefinitionHelper.iterateClashingNames(VarDefinitionHelper.java:1541)
   //   at org.jetbrains.java.decompiler.modules.decompiler.vars.VarDefinitionHelper.iterateClashingExprent(VarDefinitionHelper.java:1672)
   //   at org.jetbrains.java.decompiler.modules.decompiler.vars.VarDefinitionHelper.iterateClashingNames(VarDefinitionHelper.java:1492)
   //   at org.jetbrains.java.decompiler.modules.decompiler.vars.VarDefinitionHelper.iterateClashingNames(VarDefinitionHelper.java:1541)
   //   at org.jetbrains.java.decompiler.modules.decompiler.vars.VarDefinitionHelper.iterateClashingExprent(VarDefinitionHelper.java:1672)
   //   at org.jetbrains.java.decompiler.modules.decompiler.vars.VarDefinitionHelper.iterateClashingNames(VarDefinitionHelper.java:1492)
   //   at org.jetbrains.java.decompiler.modules.decompiler.vars.VarDefinitionHelper.iterateClashingNames(VarDefinitionHelper.java:1541)
   //   at org.jetbrains.java.decompiler.modules.decompiler.vars.VarDefinitionHelper.iterateClashingExprent(VarDefinitionHelper.java:1672)
   //   at org.jetbrains.java.decompiler.modules.decompiler.vars.VarDefinitionHelper.iterateClashingNames(VarDefinitionHelper.java:1492)
   //   at org.jetbrains.java.decompiler.modules.decompiler.vars.VarDefinitionHelper.iterateClashingNames(VarDefinitionHelper.java:1541)
   //   at org.jetbrains.java.decompiler.modules.decompiler.vars.VarDefinitionHelper.iterateClashingExprent(VarDefinitionHelper.java:1672)
   //   at org.jetbrains.java.decompiler.modules.decompiler.vars.VarDefinitionHelper.iterateClashingNames(VarDefinitionHelper.java:1492)
   //   at org.jetbrains.java.decompiler.modules.decompiler.vars.VarDefinitionHelper.iterateClashingNames(VarDefinitionHelper.java:1541)
   //   at org.jetbrains.java.decompiler.modules.decompiler.vars.VarDefinitionHelper.iterateClashingExprent(VarDefinitionHelper.java:1672)
   //   at org.jetbrains.java.decompiler.modules.decompiler.vars.VarDefinitionHelper.iterateClashingNames(VarDefinitionHelper.java:1492)
   //   at org.jetbrains.java.decompiler.modules.decompiler.vars.VarDefinitionHelper.iterateClashingNames(VarDefinitionHelper.java:1541)
   //   at org.jetbrains.java.decompiler.modules.decompiler.vars.VarDefinitionHelper.iterateClashingExprent(VarDefinitionHelper.java:1672)
   //   at org.jetbrains.java.decompiler.modules.decompiler.vars.VarDefinitionHelper.iterateClashingNames(VarDefinitionHelper.java:1492)
   //   at org.jetbrains.java.decompiler.modules.decompiler.vars.VarDefinitionHelper.iterateClashingNames(VarDefinitionHelper.java:1541)
   //   at org.jetbrains.java.decompiler.modules.decompiler.vars.VarDefinitionHelper.iterateClashingExprent(VarDefinitionHelper.java:1672)
   //   at org.jetbrains.java.decompiler.modules.decompiler.vars.VarDefinitionHelper.iterateClashingNames(VarDefinitionHelper.java:1492)
   //   at org.jetbrains.java.decompiler.modules.decompiler.vars.VarDefinitionHelper.iterateClashingNames(VarDefinitionHelper.java:1541)
   //   at org.jetbrains.java.decompiler.modules.decompiler.vars.VarDefinitionHelper.iterateClashingExprent(VarDefinitionHelper.java:1672)
   //   at org.jetbrains.java.decompiler.modules.decompiler.vars.VarDefinitionHelper.iterateClashingNames(VarDefinitionHelper.java:1492)
   //   at org.jetbrains.java.decompiler.modules.decompiler.vars.VarDefinitionHelper.iterateClashingNames(VarDefinitionHelper.java:1541)
   //   at org.jetbrains.java.decompiler.modules.decompiler.vars.VarDefinitionHelper.iterateClashingExprent(VarDefinitionHelper.java:1672)
   //   at org.jetbrains.java.decompiler.modules.decompiler.vars.VarDefinitionHelper.iterateClashingNames(VarDefinitionHelper.java:1492)
   //   at org.jetbrains.java.decompiler.modules.decompiler.vars.VarDefinitionHelper.iterateClashingNames(VarDefinitionHelper.java:1541)
   //   at org.jetbrains.java.decompiler.modules.decompiler.vars.VarDefinitionHelper.iterateClashingExprent(VarDefinitionHelper.java:1672)
   //   at org.jetbrains.java.decompiler.modules.decompiler.vars.VarDefinitionHelper.iterateClashingNames(VarDefinitionHelper.java:1492)
   //   at org.jetbrains.java.decompiler.modules.decompiler.vars.VarDefinitionHelper.iterateClashingNames(VarDefinitionHelper.java:1541)
   //   at org.jetbrains.java.decompiler.modules.decompiler.vars.VarDefinitionHelper.iterateClashingExprent(VarDefinitionHelper.java:1672)
   //   at org.jetbrains.java.decompiler.modules.decompiler.vars.VarDefinitionHelper.iterateClashingNames(VarDefinitionHelper.java:1492)
   //   at org.jetbrains.java.decompiler.modules.decompiler.vars.VarDefinitionHelper.iterateClashingNames(VarDefinitionHelper.java:1541)
   //   at org.jetbrains.java.decompiler.modules.decompiler.vars.VarDefinitionHelper.iterateClashingExprent(VarDefinitionHelper.java:1672)
   //   at org.jetbrains.java.decompiler.modules.decompiler.vars.VarDefinitionHelper.iterateClashingNames(VarDefinitionHelper.java:1492)
   //   at org.jetbrains.java.decompiler.modules.decompiler.vars.VarDefinitionHelper.iterateClashingNames(VarDefinitionHelper.java:1541)
   //   at org.jetbrains.java.decompiler.modules.decompiler.vars.VarDefinitionHelper.iterateClashingExprent(VarDefinitionHelper.java:1672)
   //   at org.jetbrains.java.decompiler.modules.decompiler.vars.VarDefinitionHelper.iterateClashingNames(VarDefinitionHelper.java:1492)
   //   at org.jetbrains.java.decompiler.modules.decompiler.vars.VarDefinitionHelper.iterateClashingNames(VarDefinitionHelper.java:1541)
   //   at org.jetbrains.java.decompiler.modules.decompiler.vars.VarDefinitionHelper.iterateClashingExprent(VarDefinitionHelper.java:1672)
   //   at org.jetbrains.java.decompiler.modules.decompiler.vars.VarDefinitionHelper.iterateClashingNames(VarDefinitionHelper.java:1492)
   //   at org.jetbrains.java.decompiler.modules.decompiler.vars.VarDefinitionHelper.iterateClashingNames(VarDefinitionHelper.java:1541)
   //   at org.jetbrains.java.decompiler.modules.decompiler.vars.VarDefinitionHelper.iterateClashingExprent(VarDefinitionHelper.java:1672)
   //   at org.jetbrains.java.decompiler.modules.decompiler.vars.VarDefinitionHelper.iterateClashingNames(VarDefinitionHelper.java:1492)
   //   at org.jetbrains.java.decompiler.modules.decompiler.vars.VarDefinitionHelper.iterateClashingNames(VarDefinitionHelper.java:1541)
   //   at org.jetbrains.java.decompiler.modules.decompiler.vars.VarDefinitionHelper.iterateClashingExprent(VarDefinitionHelper.java:1672)
   //   at org.jetbrains.java.decompiler.modules.decompiler.vars.VarDefinitionHelper.iterateClashingNames(VarDefinitionHelper.java:1492)
   //   at org.jetbrains.java.decompiler.modules.decompiler.vars.VarDefinitionHelper.iterateClashingNames(VarDefinitionHelper.java:1541)
   //   at org.jetbrains.java.decompiler.modules.decompiler.vars.VarDefinitionHelper.iterateClashingExprent(VarDefinitionHelper.java:1672)
   //   at org.jetbrains.java.decompiler.modules.decompiler.vars.VarDefinitionHelper.iterateClashingNames(VarDefinitionHelper.java:1492)
   //   at org.jetbrains.java.decompiler.modules.decompiler.vars.VarDefinitionHelper.iterateClashingNames(VarDefinitionHelper.java:1541)
   //   at org.jetbrains.java.decompiler.modules.decompiler.vars.VarDefinitionHelper.iterateClashingExprent(VarDefinitionHelper.java:1672)
   //   at org.jetbrains.java.decompiler.modules.decompiler.vars.VarDefinitionHelper.iterateClashingNames(VarDefinitionHelper.java:1492)
   //   at org.jetbrains.java.decompiler.modules.decompiler.vars.VarDefinitionHelper.iterateClashingNames(VarDefinitionHelper.java:1541)
   //   at org.jetbrains.java.decompiler.modules.decompiler.vars.VarDefinitionHelper.iterateClashingExprent(VarDefinitionHelper.java:1672)
   //   at org.jetbrains.java.decompiler.modules.decompiler.vars.VarDefinitionHelper.iterateClashingNames(VarDefinitionHelper.java:1492)
   //   at org.jetbrains.java.decompiler.modules.decompiler.vars.VarDefinitionHelper.iterateClashingNames(VarDefinitionHelper.java:1541)
   //   at org.jetbrains.java.decompiler.modules.decompiler.vars.VarDefinitionHelper.iterateClashingExprent(VarDefinitionHelper.java:1672)
   //   at org.jetbrains.java.decompiler.modules.decompiler.vars.VarDefinitionHelper.iterateClashingNames(VarDefinitionHelper.java:1492)
   //   at org.jetbrains.java.decompiler.modules.decompiler.vars.VarDefinitionHelper.iterateClashingNames(VarDefinitionHelper.java:1541)
   //   at org.jetbrains.java.decompiler.modules.decompiler.vars.VarDefinitionHelper.iterateClashingExprent(VarDefinitionHelper.java:1672)
   //   at org.jetbrains.java.decompiler.modules.decompiler.vars.VarDefinitionHelper.iterateClashingNames(VarDefinitionHelper.java:1492)
   //   at org.jetbrains.java.decompiler.modules.decompiler.vars.VarDefinitionHelper.iterateClashingNames(VarDefinitionHelper.java:1541)
   //   at org.jetbrains.java.decompiler.modules.decompiler.vars.VarDefinitionHelper.iterateClashingExprent(VarDefinitionHelper.java:1672)
   //   at org.jetbrains.java.decompiler.modules.decompiler.vars.VarDefinitionHelper.iterateClashingNames(VarDefinitionHelper.java:1492)
   //   at org.jetbrains.java.decompiler.modules.decompiler.vars.VarDefinitionHelper.iterateClashingNames(VarDefinitionHelper.java:1541)
   //   at org.jetbrains.java.decompiler.modules.decompiler.vars.VarDefinitionHelper.iterateClashingExprent(VarDefinitionHelper.java:1672)
   //   at org.jetbrains.java.decompiler.modules.decompiler.vars.VarDefinitionHelper.iterateClashingNames(VarDefinitionHelper.java:1492)
   //   at org.jetbrains.java.decompiler.modules.decompiler.vars.VarDefinitionHelper.iterateClashingNames(VarDefinitionHelper.java:1541)
   //   at org.jetbrains.java.decompiler.modules.decompiler.vars.VarDefinitionHelper.iterateClashingExprent(VarDefinitionHelper.java:1672)
   //   at org.jetbrains.java.decompiler.modules.decompiler.vars.VarDefinitionHelper.iterateClashingNames(VarDefinitionHelper.java:1492)
   //   at org.jetbrains.java.decompiler.modules.decompiler.vars.VarDefinitionHelper.iterateClashingNames(VarDefinitionHelper.java:1541)
   //   at org.jetbrains.java.decompiler.modules.decompiler.vars.VarDefinitionHelper.iterateClashingExprent(VarDefinitionHelper.java:1672)
   //   at org.jetbrains.java.decompiler.modules.decompiler.vars.VarDefinitionHelper.iterateClashingNames(VarDefinitionHelper.java:1492)
   //   at org.jetbrains.java.decompiler.modules.decompiler.vars.VarDefinitionHelper.iterateClashingNames(VarDefinitionHelper.java:1541)
   //   at org.jetbrains.java.decompiler.modules.decompiler.vars.VarDefinitionHelper.iterateClashingExprent(VarDefinitionHelper.java:1672)
   //   at org.jetbrains.java.decompiler.modules.decompiler.vars.VarDefinitionHelper.iterateClashingNames(VarDefinitionHelper.java:1492)
   //   at org.jetbrains.java.decompiler.modules.decompiler.vars.VarDefinitionHelper.iterateClashingNames(VarDefinitionHelper.java:1541)
   //   at org.jetbrains.java.decompiler.modules.decompiler.vars.VarDefinitionHelper.iterateClashingExprent(VarDefinitionHelper.java:1672)
   //   at org.jetbrains.java.decompiler.modules.decompiler.vars.VarDefinitionHelper.iterateClashingNames(VarDefinitionHelper.java:1492)
   //   at org.jetbrains.java.decompiler.modules.decompiler.vars.VarDefinitionHelper.iterateClashingNames(VarDefinitionHelper.java:1541)
   //   at org.jetbrains.java.decompiler.modules.decompiler.vars.VarDefinitionHelper.iterateClashingExprent(VarDefinitionHelper.java:1672)
   //   at org.jetbrains.java.decompiler.modules.decompiler.vars.VarDefinitionHelper.iterateClashingNames(VarDefinitionHelper.java:1492)
   //   at org.jetbrains.java.decompiler.modules.decompiler.vars.VarDefinitionHelper.iterateClashingNames(VarDefinitionHelper.java:1541)
   //   at org.jetbrains.java.decompiler.modules.decompiler.vars.VarDefinitionHelper.iterateClashingExprent(VarDefinitionHelper.java:1672)
   //   at org.jetbrains.java.decompiler.modules.decompiler.vars.VarDefinitionHelper.iterateClashingNames(VarDefinitionHelper.java:1492)
   //   at org.jetbrains.java.decompiler.modules.decompiler.vars.VarDefinitionHelper.iterateClashingNames(VarDefinitionHelper.java:1541)
   //   at org.jetbrains.java.decompiler.modules.decompiler.vars.VarDefinitionHelper.iterateClashingExprent(VarDefinitionHelper.java:1672)
   //   at org.jetbrains.java.decompiler.modules.decompiler.vars.VarDefinitionHelper.iterateClashingNames(VarDefinitionHelper.java:1492)
   //   at org.jetbrains.java.decompiler.modules.decompiler.vars.VarDefinitionHelper.iterateClashingNames(VarDefinitionHelper.java:1541)
   //   at org.jetbrains.java.decompiler.modules.decompiler.vars.VarDefinitionHelper.iterateClashingExprent(VarDefinitionHelper.java:1672)
   //   at org.jetbrains.java.decompiler.modules.decompiler.vars.VarDefinitionHelper.iterateClashingNames(VarDefinitionHelper.java:1492)
   //   at org.jetbrains.java.decompiler.modules.decompiler.vars.VarDefinitionHelper.iterateClashingNames(VarDefinitionHelper.java:1541)
   //   at org.jetbrains.java.decompiler.modules.decompiler.vars.VarDefinitionHelper.iterateClashingExprent(VarDefinitionHelper.java:1672)
   //   at org.jetbrains.java.decompiler.modules.decompiler.vars.VarDefinitionHelper.iterateClashingNames(VarDefinitionHelper.java:1492)
   //   at org.jetbrains.java.decompiler.modules.decompiler.vars.VarDefinitionHelper.iterateClashingNames(VarDefinitionHelper.java:1541)
   //   at org.jetbrains.java.decompiler.modules.decompiler.vars.VarDefinitionHelper.iterateClashingExprent(VarDefinitionHelper.java:1672)
   //   at org.jetbrains.java.decompiler.modules.decompiler.vars.VarDefinitionHelper.iterateClashingNames(VarDefinitionHelper.java:1492)
   //   at org.jetbrains.java.decompiler.modules.decompiler.vars.VarDefinitionHelper.iterateClashingNames(VarDefinitionHelper.java:1541)
   //   at org.jetbrains.java.decompiler.modules.decompiler.vars.VarDefinitionHelper.iterateClashingExprent(VarDefinitionHelper.java:1672)
   //   at org.jetbrains.java.decompiler.modules.decompiler.vars.VarDefinitionHelper.iterateClashingNames(VarDefinitionHelper.java:1492)
   //   at org.jetbrains.java.decompiler.modules.decompiler.vars.VarDefinitionHelper.iterateClashingNames(VarDefinitionHelper.java:1541)
   //   at org.jetbrains.java.decompiler.modules.decompiler.vars.VarDefinitionHelper.iterateClashingExprent(VarDefinitionHelper.java:1672)
   //   at org.jetbrains.java.decompiler.modules.decompiler.vars.VarDefinitionHelper.iterateClashingNames(VarDefinitionHelper.java:1492)
   //   at org.jetbrains.java.decompiler.modules.decompiler.vars.VarDefinitionHelper.iterateClashingNames(VarDefinitionHelper.java:1541)
   //   at org.jetbrains.java.decompiler.modules.decompiler.vars.VarDefinitionHelper.iterateClashingExprent(VarDefinitionHelper.java:1672)
   //   at org.jetbrains.java.decompiler.modules.decompiler.vars.VarDefinitionHelper.iterateClashingNames(VarDefinitionHelper.java:1492)
   //   at org.jetbrains.java.decompiler.modules.decompiler.vars.VarDefinitionHelper.iterateClashingNames(VarDefinitionHelper.java:1541)
   //   at org.jetbrains.java.decompiler.modules.decompiler.vars.VarDefinitionHelper.iterateClashingExprent(VarDefinitionHelper.java:1672)
   //   at org.jetbrains.java.decompiler.modules.decompiler.vars.VarDefinitionHelper.iterateClashingNames(VarDefinitionHelper.java:1492)
   //   at org.jetbrains.java.decompiler.modules.decompiler.vars.VarDefinitionHelper.iterateClashingNames(VarDefinitionHelper.java:1541)
   //   at org.jetbrains.java.decompiler.modules.decompiler.vars.VarDefinitionHelper.iterateClashingExprent(VarDefinitionHelper.java:1672)
   //   at org.jetbrains.java.decompiler.modules.decompiler.vars.VarDefinitionHelper.iterateClashingNames(VarDefinitionHelper.java:1492)
   //   at org.jetbrains.java.decompiler.modules.decompiler.vars.VarDefinitionHelper.iterateClashingNames(VarDefinitionHelper.java:1541)
   //   at org.jetbrains.java.decompiler.modules.decompiler.vars.VarDefinitionHelper.iterateClashingExprent(VarDefinitionHelper.java:1672)
   //   at org.jetbrains.java.decompiler.modules.decompiler.vars.VarDefinitionHelper.iterateClashingNames(VarDefinitionHelper.java:1492)
   //   at org.jetbrains.java.decompiler.modules.decompiler.vars.VarDefinitionHelper.iterateClashingNames(VarDefinitionHelper.java:1541)
   //   at org.jetbrains.java.decompiler.modules.decompiler.vars.VarDefinitionHelper.iterateClashingExprent(VarDefinitionHelper.java:1672)
   //   at org.jetbrains.java.decompiler.modules.decompiler.vars.VarDefinitionHelper.iterateClashingNames(VarDefinitionHelper.java:1492)
   //   at org.jetbrains.java.decompiler.modules.decompiler.vars.VarDefinitionHelper.iterateClashingNames(VarDefinitionHelper.java:1541)
   //   at org.jetbrains.java.decompiler.modules.decompiler.vars.VarDefinitionHelper.iterateClashingExprent(VarDefinitionHelper.java:1672)
   //   at org.jetbrains.java.decompiler.modules.decompiler.vars.VarDefinitionHelper.iterateClashingNames(VarDefinitionHelper.java:1492)
   //   at org.jetbrains.java.decompiler.modules.decompiler.vars.VarDefinitionHelper.iterateClashingNames(VarDefinitionHelper.java:1541)
   //   at org.jetbrains.java.decompiler.modules.decompiler.vars.VarDefinitionHelper.iterateClashingExprent(VarDefinitionHelper.java:1672)
   //   at org.jetbrains.java.decompiler.modules.decompiler.vars.VarDefinitionHelper.iterateClashingNames(VarDefinitionHelper.java:1492)
   //   at org.jetbrains.java.decompiler.modules.decompiler.vars.VarDefinitionHelper.iterateClashingNames(VarDefinitionHelper.java:1541)
   //   at org.jetbrains.java.decompiler.modules.decompiler.vars.VarDefinitionHelper.iterateClashingExprent(VarDefinitionHelper.java:1672)
   //   at org.jetbrains.java.decompiler.modules.decompiler.vars.VarDefinitionHelper.iterateClashingNames(VarDefinitionHelper.java:1492)
   //   at org.jetbrains.java.decompiler.modules.decompiler.vars.VarDefinitionHelper.iterateClashingNames(VarDefinitionHelper.java:1541)
   //   at org.jetbrains.java.decompiler.modules.decompiler.vars.VarDefinitionHelper.iterateClashingExprent(VarDefinitionHelper.java:1672)
   //   at org.jetbrains.java.decompiler.modules.decompiler.vars.VarDefinitionHelper.iterateClashingNames(VarDefinitionHelper.java:1492)
   //   at org.jetbrains.java.decompiler.modules.decompiler.vars.VarDefinitionHelper.iterateClashingNames(VarDefinitionHelper.java:1541)
   //   at org.jetbrains.java.decompiler.modules.decompiler.vars.VarDefinitionHelper.iterateClashingExprent(VarDefinitionHelper.java:1672)
   //   at org.jetbrains.java.decompiler.modules.decompiler.vars.VarDefinitionHelper.iterateClashingNames(VarDefinitionHelper.java:1492)
   //   at org.jetbrains.java.decompiler.modules.decompiler.vars.VarDefinitionHelper.iterateClashingNames(VarDefinitionHelper.java:1541)
   //   at org.jetbrains.java.decompiler.modules.decompiler.vars.VarDefinitionHelper.iterateClashingExprent(VarDefinitionHelper.java:1672)
   //   at org.jetbrains.java.decompiler.modules.decompiler.vars.VarDefinitionHelper.iterateClashingNames(VarDefinitionHelper.java:1492)
   //   at org.jetbrains.java.decompiler.modules.decompiler.vars.VarDefinitionHelper.iterateClashingNames(VarDefinitionHelper.java:1541)
   //   at org.jetbrains.java.decompiler.modules.decompiler.vars.VarDefinitionHelper.iterateClashingExprent(VarDefinitionHelper.java:1672)
   //   at org.jetbrains.java.decompiler.modules.decompiler.vars.VarDefinitionHelper.iterateClashingNames(VarDefinitionHelper.java:1492)
   //   at org.jetbrains.java.decompiler.modules.decompiler.vars.VarDefinitionHelper.iterateClashingNames(VarDefinitionHelper.java:1541)
   //   at org.jetbrains.java.decompiler.modules.decompiler.vars.VarDefinitionHelper.iterateClashingExprent(VarDefinitionHelper.java:1672)
   //   at org.jetbrains.java.decompiler.modules.decompiler.vars.VarDefinitionHelper.iterateClashingNames(VarDefinitionHelper.java:1492)
   //   at org.jetbrains.java.decompiler.modules.decompiler.vars.VarDefinitionHelper.iterateClashingNames(VarDefinitionHelper.java:1541)
   //   at org.jetbrains.java.decompiler.modules.decompiler.vars.VarDefinitionHelper.iterateClashingExprent(VarDefinitionHelper.java:1672)
   //   at org.jetbrains.java.decompiler.modules.decompiler.vars.VarDefinitionHelper.iterateClashingNames(VarDefinitionHelper.java:1492)
   //   at org.jetbrains.java.decompiler.modules.decompiler.vars.VarDefinitionHelper.iterateClashingNames(VarDefinitionHelper.java:1541)
   //   at org.jetbrains.java.decompiler.modules.decompiler.vars.VarDefinitionHelper.iterateClashingExprent(VarDefinitionHelper.java:1672)
   //   at org.jetbrains.java.decompiler.modules.decompiler.vars.VarDefinitionHelper.iterateClashingNames(VarDefinitionHelper.java:1492)
   //   at org.jetbrains.java.decompiler.modules.decompiler.vars.VarDefinitionHelper.iterateClashingNames(VarDefinitionHelper.java:1541)
   //   at org.jetbrains.java.decompiler.modules.decompiler.vars.VarDefinitionHelper.iterateClashingExprent(VarDefinitionHelper.java:1672)
   //   at org.jetbrains.java.decompiler.modules.decompiler.vars.VarDefinitionHelper.iterateClashingNames(VarDefinitionHelper.java:1492)
   //   at org.jetbrains.java.decompiler.modules.decompiler.vars.VarDefinitionHelper.iterateClashingNames(VarDefinitionHelper.java:1541)
   //   at org.jetbrains.java.decompiler.modules.decompiler.vars.VarDefinitionHelper.iterateClashingExprent(VarDefinitionHelper.java:1672)
   //   at org.jetbrains.java.decompiler.modules.decompiler.vars.VarDefinitionHelper.iterateClashingNames(VarDefinitionHelper.java:1492)
   //   at org.jetbrains.java.decompiler.modules.decompiler.vars.VarDefinitionHelper.iterateClashingNames(VarDefinitionHelper.java:1541)
   //   at org.jetbrains.java.decompiler.modules.decompiler.vars.VarDefinitionHelper.iterateClashingExprent(VarDefinitionHelper.java:1672)
   //   at org.jetbrains.java.decompiler.modules.decompiler.vars.VarDefinitionHelper.iterateClashingNames(VarDefinitionHelper.java:1492)
   //   at org.jetbrains.java.decompiler.modules.decompiler.vars.VarDefinitionHelper.iterateClashingNames(VarDefinitionHelper.java:1541)
   //   at org.jetbrains.java.decompiler.modules.decompiler.vars.VarDefinitionHelper.iterateClashingExprent(VarDefinitionHelper.java:1672)
   //   at org.jetbrains.java.decompiler.modules.decompiler.vars.VarDefinitionHelper.iterateClashingNames(VarDefinitionHelper.java:1492)
   //   at org.jetbrains.java.decompiler.modules.decompiler.vars.VarDefinitionHelper.iterateClashingNames(VarDefinitionHelper.java:1541)
   //   at org.jetbrains.java.decompiler.modules.decompiler.vars.VarDefinitionHelper.iterateClashingExprent(VarDefinitionHelper.java:1672)
   //   at org.jetbrains.java.decompiler.modules.decompiler.vars.VarDefinitionHelper.iterateClashingNames(VarDefinitionHelper.java:1492)
   //   at org.jetbrains.java.decompiler.modules.decompiler.vars.VarDefinitionHelper.iterateClashingNames(VarDefinitionHelper.java:1541)
   //   at org.jetbrains.java.decompiler.modules.decompiler.vars.VarDefinitionHelper.iterateClashingExprent(VarDefinitionHelper.java:1672)
   //   at org.jetbrains.java.decompiler.modules.decompiler.vars.VarDefinitionHelper.iterateClashingNames(VarDefinitionHelper.java:1492)
   //   at org.jetbrains.java.decompiler.modules.decompiler.vars.VarDefinitionHelper.iterateClashingNames(VarDefinitionHelper.java:1541)
   //   at org.jetbrains.java.decompiler.modules.decompiler.vars.VarDefinitionHelper.iterateClashingExprent(VarDefinitionHelper.java:1672)
   //   at org.jetbrains.java.decompiler.modules.decompiler.vars.VarDefinitionHelper.iterateClashingNames(VarDefinitionHelper.java:1492)
   //   at org.jetbrains.java.decompiler.modules.decompiler.vars.VarDefinitionHelper.iterateClashingNames(VarDefinitionHelper.java:1541)
   //   at org.jetbrains.java.decompiler.modules.decompiler.vars.VarDefinitionHelper.iterateClashingExprent(VarDefinitionHelper.java:1672)
   //   at org.jetbrains.java.decompiler.modules.decompiler.vars.VarDefinitionHelper.iterateClashingNames(VarDefinitionHelper.java:1492)
   //   at org.jetbrains.java.decompiler.modules.decompiler.vars.VarDefinitionHelper.iterateClashingNames(VarDefinitionHelper.java:1541)
   //   at org.jetbrains.java.decompiler.modules.decompiler.vars.VarDefinitionHelper.iterateClashingExprent(VarDefinitionHelper.java:1672)
   //   at org.jetbrains.java.decompiler.modules.decompiler.vars.VarDefinitionHelper.iterateClashingNames(VarDefinitionHelper.java:1492)
   //   at org.jetbrains.java.decompiler.modules.decompiler.vars.VarDefinitionHelper.iterateClashingNames(VarDefinitionHelper.java:1541)
   //   at org.jetbrains.java.decompiler.modules.decompiler.vars.VarDefinitionHelper.iterateClashingExprent(VarDefinitionHelper.java:1672)
   //   at org.jetbrains.java.decompiler.modules.decompiler.vars.VarDefinitionHelper.iterateClashingNames(VarDefinitionHelper.java:1492)
   //   at org.jetbrains.java.decompiler.modules.decompiler.vars.VarDefinitionHelper.iterateClashingNames(VarDefinitionHelper.java:1541)
   //   at org.jetbrains.java.decompiler.modules.decompiler.vars.VarDefinitionHelper.iterateClashingExprent(VarDefinitionHelper.java:1672)
   //   at org.jetbrains.java.decompiler.modules.decompiler.vars.VarDefinitionHelper.iterateClashingNames(VarDefinitionHelper.java:1492)
   //   at org.jetbrains.java.decompiler.modules.decompiler.vars.VarDefinitionHelper.iterateClashingNames(VarDefinitionHelper.java:1541)
   //   at org.jetbrains.java.decompiler.modules.decompiler.vars.VarDefinitionHelper.iterateClashingExprent(VarDefinitionHelper.java:1672)
   //   at org.jetbrains.java.decompiler.modules.decompiler.vars.VarDefinitionHelper.iterateClashingNames(VarDefinitionHelper.java:1492)
   //   at org.jetbrains.java.decompiler.modules.decompiler.vars.VarDefinitionHelper.iterateClashingNames(VarDefinitionHelper.java:1541)
   //   at org.jetbrains.java.decompiler.modules.decompiler.vars.VarDefinitionHelper.iterateClashingExprent(VarDefinitionHelper.java:1672)
   //   at org.jetbrains.java.decompiler.modules.decompiler.vars.VarDefinitionHelper.iterateClashingNames(VarDefinitionHelper.java:1492)
   //   at org.jetbrains.java.decompiler.modules.decompiler.vars.VarDefinitionHelper.iterateClashingNames(VarDefinitionHelper.java:1541)
   //   at org.jetbrains.java.decompiler.modules.decompiler.vars.VarDefinitionHelper.iterateClashingExprent(VarDefinitionHelper.java:1672)
   //   at org.jetbrains.java.decompiler.modules.decompiler.vars.VarDefinitionHelper.iterateClashingNames(VarDefinitionHelper.java:1492)
   //   at org.jetbrains.java.decompiler.modules.decompiler.vars.VarDefinitionHelper.iterateClashingNames(VarDefinitionHelper.java:1541)
   //   at org.jetbrains.java.decompiler.modules.decompiler.vars.VarDefinitionHelper.iterateClashingExprent(VarDefinitionHelper.java:1672)
   //   at org.jetbrains.java.decompiler.modules.decompiler.vars.VarDefinitionHelper.iterateClashingNames(VarDefinitionHelper.java:1492)
   //   at org.jetbrains.java.decompiler.modules.decompiler.vars.VarDefinitionHelper.iterateClashingNames(VarDefinitionHelper.java:1541)
   //   at org.jetbrains.java.decompiler.modules.decompiler.vars.VarDefinitionHelper.iterateClashingExprent(VarDefinitionHelper.java:1672)
   //   at org.jetbrains.java.decompiler.modules.decompiler.vars.VarDefinitionHelper.iterateClashingNames(VarDefinitionHelper.java:1492)
   //   at org.jetbrains.java.decompiler.modules.decompiler.vars.VarDefinitionHelper.iterateClashingNames(VarDefinitionHelper.java:1541)
   //   at org.jetbrains.java.decompiler.modules.decompiler.vars.VarDefinitionHelper.iterateClashingExprent(VarDefinitionHelper.java:1672)
   //   at org.jetbrains.java.decompiler.modules.decompiler.vars.VarDefinitionHelper.iterateClashingNames(VarDefinitionHelper.java:1492)
   //   at org.jetbrains.java.decompiler.modules.decompiler.vars.VarDefinitionHelper.iterateClashingNames(VarDefinitionHelper.java:1541)
   //   at org.jetbrains.java.decompiler.modules.decompiler.vars.VarDefinitionHelper.iterateClashingExprent(VarDefinitionHelper.java:1672)
   //   at org.jetbrains.java.decompiler.modules.decompiler.vars.VarDefinitionHelper.iterateClashingNames(VarDefinitionHelper.java:1492)
   //   at org.jetbrains.java.decompiler.modules.decompiler.vars.VarDefinitionHelper.iterateClashingNames(VarDefinitionHelper.java:1541)
   //   at org.jetbrains.java.decompiler.modules.decompiler.vars.VarDefinitionHelper.iterateClashingExprent(VarDefinitionHelper.java:1672)
   //   at org.jetbrains.java.decompiler.modules.decompiler.vars.VarDefinitionHelper.iterateClashingNames(VarDefinitionHelper.java:1492)
   //   at org.jetbrains.java.decompiler.modules.decompiler.vars.VarDefinitionHelper.iterateClashingNames(VarDefinitionHelper.java:1541)
   //   at org.jetbrains.java.decompiler.modules.decompiler.vars.VarDefinitionHelper.iterateClashingExprent(VarDefinitionHelper.java:1672)
   //   at org.jetbrains.java.decompiler.modules.decompiler.vars.VarDefinitionHelper.iterateClashingNames(VarDefinitionHelper.java:1492)
   //   at org.jetbrains.java.decompiler.modules.decompiler.vars.VarDefinitionHelper.iterateClashingNames(VarDefinitionHelper.java:1541)
   //   at org.jetbrains.java.decompiler.modules.decompiler.vars.VarDefinitionHelper.iterateClashingExprent(VarDefinitionHelper.java:1672)
   //   at org.jetbrains.java.decompiler.modules.decompiler.vars.VarDefinitionHelper.iterateClashingNames(VarDefinitionHelper.java:1492)
   //   at org.jetbrains.java.decompiler.modules.decompiler.vars.VarDefinitionHelper.iterateClashingNames(VarDefinitionHelper.java:1541)
   //   at org.jetbrains.java.decompiler.modules.decompiler.vars.VarDefinitionHelper.iterateClashingExprent(VarDefinitionHelper.java:1672)
   //   at org.jetbrains.java.decompiler.modules.decompiler.vars.VarDefinitionHelper.iterateClashingNames(VarDefinitionHelper.java:1492)
   //   at org.jetbrains.java.decompiler.modules.decompiler.vars.VarDefinitionHelper.iterateClashingNames(VarDefinitionHelper.java:1541)
   //   at org.jetbrains.java.decompiler.modules.decompiler.vars.VarDefinitionHelper.iterateClashingExprent(VarDefinitionHelper.java:1672)
   //   at org.jetbrains.java.decompiler.modules.decompiler.vars.VarDefinitionHelper.iterateClashingNames(VarDefinitionHelper.java:1492)
   //   at org.jetbrains.java.decompiler.modules.decompiler.vars.VarDefinitionHelper.iterateClashingNames(VarDefinitionHelper.java:1541)
   //   at org.jetbrains.java.decompiler.modules.decompiler.vars.VarDefinitionHelper.iterateClashingExprent(VarDefinitionHelper.java:1672)
   //   at org.jetbrains.java.decompiler.modules.decompiler.vars.VarDefinitionHelper.iterateClashingNames(VarDefinitionHelper.java:1492)
   //   at org.jetbrains.java.decompiler.modules.decompiler.vars.VarDefinitionHelper.iterateClashingNames(VarDefinitionHelper.java:1541)
   //   at org.jetbrains.java.decompiler.modules.decompiler.vars.VarDefinitionHelper.iterateClashingExprent(VarDefinitionHelper.java:1672)
   //   at org.jetbrains.java.decompiler.modules.decompiler.vars.VarDefinitionHelper.iterateClashingNames(VarDefinitionHelper.java:1492)
   //   at org.jetbrains.java.decompiler.modules.decompiler.vars.VarDefinitionHelper.iterateClashingNames(VarDefinitionHelper.java:1541)
   //   at org.jetbrains.java.decompiler.modules.decompiler.vars.VarDefinitionHelper.iterateClashingExprent(VarDefinitionHelper.java:1672)
   //   at org.jetbrains.java.decompiler.modules.decompiler.vars.VarDefinitionHelper.iterateClashingNames(VarDefinitionHelper.java:1492)
   //   at org.jetbrains.java.decompiler.modules.decompiler.vars.VarDefinitionHelper.iterateClashingNames(VarDefinitionHelper.java:1541)
   //   at org.jetbrains.java.decompiler.modules.decompiler.vars.VarDefinitionHelper.iterateClashingExprent(VarDefinitionHelper.java:1672)
   //   at org.jetbrains.java.decompiler.modules.decompiler.vars.VarDefinitionHelper.iterateClashingNames(VarDefinitionHelper.java:1492)
   //   at org.jetbrains.java.decompiler.modules.decompiler.vars.VarDefinitionHelper.iterateClashingNames(VarDefinitionHelper.java:1541)
   //   at org.jetbrains.java.decompiler.modules.decompiler.vars.VarDefinitionHelper.iterateClashingExprent(VarDefinitionHelper.java:1672)
   //   at org.jetbrains.java.decompiler.modules.decompiler.vars.VarDefinitionHelper.iterateClashingNames(VarDefinitionHelper.java:1492)
   //   at org.jetbrains.java.decompiler.modules.decompiler.vars.VarDefinitionHelper.iterateClashingNames(VarDefinitionHelper.java:1541)
   //   at org.jetbrains.java.decompiler.modules.decompiler.vars.VarDefinitionHelper.iterateClashingExprent(VarDefinitionHelper.java:1672)
   //   at org.jetbrains.java.decompiler.modules.decompiler.vars.VarDefinitionHelper.iterateClashingNames(VarDefinitionHelper.java:1492)
   //   at org.jetbrains.java.decompiler.modules.decompiler.vars.VarDefinitionHelper.iterateClashingNames(VarDefinitionHelper.java:1541)
   //   at org.jetbrains.java.decompiler.modules.decompiler.vars.VarDefinitionHelper.iterateClashingExprent(VarDefinitionHelper.java:1672)
   //   at org.jetbrains.java.decompiler.modules.decompiler.vars.VarDefinitionHelper.iterateClashingNames(VarDefinitionHelper.java:1492)
   //   at org.jetbrains.java.decompiler.modules.decompiler.vars.VarDefinitionHelper.iterateClashingNames(VarDefinitionHelper.java:1541)
   //   at org.jetbrains.java.decompiler.modules.decompiler.vars.VarDefinitionHelper.iterateClashingExprent(VarDefinitionHelper.java:1672)
   //   at org.jetbrains.java.decompiler.modules.decompiler.vars.VarDefinitionHelper.iterateClashingNames(VarDefinitionHelper.java:1492)
   //   at org.jetbrains.java.decompiler.modules.decompiler.vars.VarDefinitionHelper.iterateClashingNames(VarDefinitionHelper.java:1541)
   //   at org.jetbrains.java.decompiler.modules.decompiler.vars.VarDefinitionHelper.iterateClashingExprent(VarDefinitionHelper.java:1672)
   //   at org.jetbrains.java.decompiler.modules.decompiler.vars.VarDefinitionHelper.iterateClashingNames(VarDefinitionHelper.java:1492)
   //   at org.jetbrains.java.decompiler.modules.decompiler.vars.VarDefinitionHelper.iterateClashingNames(VarDefinitionHelper.java:1541)
   //   at org.jetbrains.java.decompiler.modules.decompiler.vars.VarDefinitionHelper.iterateClashingExprent(VarDefinitionHelper.java:1672)
   //   at org.jetbrains.java.decompiler.modules.decompiler.vars.VarDefinitionHelper.iterateClashingNames(VarDefinitionHelper.java:1492)
   //   at org.jetbrains.java.decompiler.modules.decompiler.vars.VarDefinitionHelper.iterateClashingNames(VarDefinitionHelper.java:1541)
   //   at org.jetbrains.java.decompiler.modules.decompiler.vars.VarDefinitionHelper.iterateClashingExprent(VarDefinitionHelper.java:1672)
   //   at org.jetbrains.java.decompiler.modules.decompiler.vars.VarDefinitionHelper.iterateClashingNames(VarDefinitionHelper.java:1492)
   //   at org.jetbrains.java.decompiler.modules.decompiler.vars.VarDefinitionHelper.iterateClashingNames(VarDefinitionHelper.java:1541)
   //   at org.jetbrains.java.decompiler.modules.decompiler.vars.VarDefinitionHelper.iterateClashingExprent(VarDefinitionHelper.java:1672)
   //   at org.jetbrains.java.decompiler.modules.decompiler.vars.VarDefinitionHelper.iterateClashingNames(VarDefinitionHelper.java:1492)
   //   at org.jetbrains.java.decompiler.modules.decompiler.vars.VarDefinitionHelper.iterateClashingNames(VarDefinitionHelper.java:1541)
   //   at org.jetbrains.java.decompiler.modules.decompiler.vars.VarDefinitionHelper.iterateClashingExprent(VarDefinitionHelper.java:1672)
   //   at org.jetbrains.java.decompiler.modules.decompiler.vars.VarDefinitionHelper.iterateClashingNames(VarDefinitionHelper.java:1492)
   //   at org.jetbrains.java.decompiler.modules.decompiler.vars.VarDefinitionHelper.iterateClashingNames(VarDefinitionHelper.java:1541)
   //   at org.jetbrains.java.decompiler.modules.decompiler.vars.VarDefinitionHelper.iterateClashingExprent(VarDefinitionHelper.java:1672)
   //   at org.jetbrains.java.decompiler.modules.decompiler.vars.VarDefinitionHelper.iterateClashingNames(VarDefinitionHelper.java:1492)
   //   at org.jetbrains.java.decompiler.modules.decompiler.vars.VarDefinitionHelper.iterateClashingNames(VarDefinitionHelper.java:1541)
   //   at org.jetbrains.java.decompiler.modules.decompiler.vars.VarDefinitionHelper.iterateClashingExprent(VarDefinitionHelper.java:1672)
   //   at org.jetbrains.java.decompiler.modules.decompiler.vars.VarDefinitionHelper.iterateClashingNames(VarDefinitionHelper.java:1492)
   //   at org.jetbrains.java.decompiler.modules.decompiler.vars.VarDefinitionHelper.iterateClashingNames(VarDefinitionHelper.java:1541)
   //   at org.jetbrains.java.decompiler.modules.decompiler.vars.VarDefinitionHelper.iterateClashingExprent(VarDefinitionHelper.java:1672)
   //   at org.jetbrains.java.decompiler.modules.decompiler.vars.VarDefinitionHelper.iterateClashingNames(VarDefinitionHelper.java:1492)
   //   at org.jetbrains.java.decompiler.modules.decompiler.vars.VarDefinitionHelper.iterateClashingNames(VarDefinitionHelper.java:1541)
   //   at org.jetbrains.java.decompiler.modules.decompiler.vars.VarDefinitionHelper.iterateClashingExprent(VarDefinitionHelper.java:1672)
   //   at org.jetbrains.java.decompiler.modules.decompiler.vars.VarDefinitionHelper.iterateClashingNames(VarDefinitionHelper.java:1492)
   //   at org.jetbrains.java.decompiler.modules.decompiler.vars.VarDefinitionHelper.iterateClashingNames(VarDefinitionHelper.java:1541)
   //   at org.jetbrains.java.decompiler.modules.decompiler.vars.VarDefinitionHelper.iterateClashingExprent(VarDefinitionHelper.java:1672)
   //   at org.jetbrains.java.decompiler.modules.decompiler.vars.VarDefinitionHelper.iterateClashingNames(VarDefinitionHelper.java:1492)
   //   at org.jetbrains.java.decompiler.modules.decompiler.vars.VarDefinitionHelper.iterateClashingNames(VarDefinitionHelper.java:1541)
   //   at org.jetbrains.java.decompiler.modules.decompiler.vars.VarDefinitionHelper.iterateClashingExprent(VarDefinitionHelper.java:1672)
   //   at org.jetbrains.java.decompiler.modules.decompiler.vars.VarDefinitionHelper.iterateClashingNames(VarDefinitionHelper.java:1492)
   //   at org.jetbrains.java.decompiler.modules.decompiler.vars.VarDefinitionHelper.iterateClashingNames(VarDefinitionHelper.java:1541)
   //   at org.jetbrains.java.decompiler.modules.decompiler.vars.VarDefinitionHelper.iterateClashingExprent(VarDefinitionHelper.java:1672)
   //   at org.jetbrains.java.decompiler.modules.decompiler.vars.VarDefinitionHelper.iterateClashingNames(VarDefinitionHelper.java:1492)
   //   at org.jetbrains.java.decompiler.modules.decompiler.vars.VarDefinitionHelper.iterateClashingNames(VarDefinitionHelper.java:1541)
   //   at org.jetbrains.java.decompiler.modules.decompiler.vars.VarDefinitionHelper.iterateClashingExprent(VarDefinitionHelper.java:1672)
   //   at org.jetbrains.java.decompiler.modules.decompiler.vars.VarDefinitionHelper.iterateClashingNames(VarDefinitionHelper.java:1492)
   //   at org.jetbrains.java.decompiler.modules.decompiler.vars.VarDefinitionHelper.iterateClashingNames(VarDefinitionHelper.java:1541)
   //   at org.jetbrains.java.decompiler.modules.decompiler.vars.VarDefinitionHelper.iterateClashingExprent(VarDefinitionHelper.java:1672)
   //   at org.jetbrains.java.decompiler.modules.decompiler.vars.VarDefinitionHelper.iterateClashingNames(VarDefinitionHelper.java:1492)
   //   at org.jetbrains.java.decompiler.modules.decompiler.vars.VarDefinitionHelper.iterateClashingNames(VarDefinitionHelper.java:1541)
   //   at org.jetbrains.java.decompiler.modules.decompiler.vars.VarDefinitionHelper.iterateClashingExprent(VarDefinitionHelper.java:1672)
   //   at org.jetbrains.java.decompiler.modules.decompiler.vars.VarDefinitionHelper.iterateClashingNames(VarDefinitionHelper.java:1492)
   //   at org.jetbrains.java.decompiler.modules.decompiler.vars.VarDefinitionHelper.iterateClashingNames(VarDefinitionHelper.java:1541)
   //   at org.jetbrains.java.decompiler.modules.decompiler.vars.VarDefinitionHelper.iterateClashingExprent(VarDefinitionHelper.java:1672)
   //   at org.jetbrains.java.decompiler.modules.decompiler.vars.VarDefinitionHelper.iterateClashingNames(VarDefinitionHelper.java:1492)
   //   at org.jetbrains.java.decompiler.modules.decompiler.vars.VarDefinitionHelper.iterateClashingNames(VarDefinitionHelper.java:1541)
   //   at org.jetbrains.java.decompiler.modules.decompiler.vars.VarDefinitionHelper.iterateClashingExprent(VarDefinitionHelper.java:1672)
   //   at org.jetbrains.java.decompiler.modules.decompiler.vars.VarDefinitionHelper.iterateClashingNames(VarDefinitionHelper.java:1492)
   //   at org.jetbrains.java.decompiler.modules.decompiler.vars.VarDefinitionHelper.iterateClashingNames(VarDefinitionHelper.java:1541)
   //   at org.jetbrains.java.decompiler.modules.decompiler.vars.VarDefinitionHelper.iterateClashingExprent(VarDefinitionHelper.java:1672)
   //   at org.jetbrains.java.decompiler.modules.decompiler.vars.VarDefinitionHelper.iterateClashingNames(VarDefinitionHelper.java:1492)
   //   at org.jetbrains.java.decompiler.modules.decompiler.vars.VarDefinitionHelper.iterateClashingNames(VarDefinitionHelper.java:1541)
   //   at org.jetbrains.java.decompiler.modules.decompiler.vars.VarDefinitionHelper.iterateClashingExprent(VarDefinitionHelper.java:1672)
   //   at org.jetbrains.java.decompiler.modules.decompiler.vars.VarDefinitionHelper.iterateClashingNames(VarDefinitionHelper.java:1492)
   //   at org.jetbrains.java.decompiler.modules.decompiler.vars.VarDefinitionHelper.iterateClashingNames(VarDefinitionHelper.java:1541)
   //   at org.jetbrains.java.decompiler.modules.decompiler.vars.VarDefinitionHelper.iterateClashingExprent(VarDefinitionHelper.java:1672)
   //   at org.jetbrains.java.decompiler.modules.decompiler.vars.VarDefinitionHelper.iterateClashingNames(VarDefinitionHelper.java:1492)
   //   at org.jetbrains.java.decompiler.modules.decompiler.vars.VarDefinitionHelper.iterateClashingNames(VarDefinitionHelper.java:1541)
   //   at org.jetbrains.java.decompiler.modules.decompiler.vars.VarDefinitionHelper.iterateClashingExprent(VarDefinitionHelper.java:1672)
   //   at org.jetbrains.java.decompiler.modules.decompiler.vars.VarDefinitionHelper.iterateClashingNames(VarDefinitionHelper.java:1492)
   //   at org.jetbrains.java.decompiler.modules.decompiler.vars.VarDefinitionHelper.iterateClashingNames(VarDefinitionHelper.java:1541)
   //   at org.jetbrains.java.decompiler.modules.decompiler.vars.VarDefinitionHelper.iterateClashingExprent(VarDefinitionHelper.java:1672)
   //   at org.jetbrains.java.decompiler.modules.decompiler.vars.VarDefinitionHelper.iterateClashingNames(VarDefinitionHelper.java:1492)
   //   at org.jetbrains.java.decompiler.modules.decompiler.vars.VarDefinitionHelper.iterateClashingNames(VarDefinitionHelper.java:1541)
   //   at org.jetbrains.java.decompiler.modules.decompiler.vars.VarDefinitionHelper.iterateClashingExprent(VarDefinitionHelper.java:1672)
   //   at org.jetbrains.java.decompiler.modules.decompiler.vars.VarDefinitionHelper.iterateClashingNames(VarDefinitionHelper.java:1492)
   //   at org.jetbrains.java.decompiler.modules.decompiler.vars.VarDefinitionHelper.iterateClashingNames(VarDefinitionHelper.java:1541)
   //   at org.jetbrains.java.decompiler.modules.decompiler.vars.VarDefinitionHelper.iterateClashingExprent(VarDefinitionHelper.java:1672)
   //   at org.jetbrains.java.decompiler.modules.decompiler.vars.VarDefinitionHelper.iterateClashingNames(VarDefinitionHelper.java:1492)
   //   at org.jetbrains.java.decompiler.modules.decompiler.vars.VarDefinitionHelper.iterateClashingNames(VarDefinitionHelper.java:1541)
   //   at org.jetbrains.java.decompiler.modules.decompiler.vars.VarDefinitionHelper.iterateClashingExprent(VarDefinitionHelper.java:1672)
   //   at org.jetbrains.java.decompiler.modules.decompiler.vars.VarDefinitionHelper.iterateClashingNames(VarDefinitionHelper.java:1492)
   //   at org.jetbrains.java.decompiler.modules.decompiler.vars.VarDefinitionHelper.iterateClashingNames(VarDefinitionHelper.java:1541)
   //   at org.jetbrains.java.decompiler.modules.decompiler.vars.VarDefinitionHelper.iterateClashingExprent(VarDefinitionHelper.java:1672)
   //   at org.jetbrains.java.decompiler.modules.decompiler.vars.VarDefinitionHelper.iterateClashingNames(VarDefinitionHelper.java:1492)
   //   at org.jetbrains.java.decompiler.modules.decompiler.vars.VarDefinitionHelper.iterateClashingNames(VarDefinitionHelper.java:1541)
   //   at org.jetbrains.java.decompiler.modules.decompiler.vars.VarDefinitionHelper.iterateClashingExprent(VarDefinitionHelper.java:1672)
   //   at org.jetbrains.java.decompiler.modules.decompiler.vars.VarDefinitionHelper.iterateClashingNames(VarDefinitionHelper.java:1492)
   //   at org.jetbrains.java.decompiler.modules.decompiler.vars.VarDefinitionHelper.iterateClashingNames(VarDefinitionHelper.java:1541)
   //   at org.jetbrains.java.decompiler.modules.decompiler.vars.VarDefinitionHelper.iterateClashingExprent(VarDefinitionHelper.java:1672)
   //   at org.jetbrains.java.decompiler.modules.decompiler.vars.VarDefinitionHelper.iterateClashingNames(VarDefinitionHelper.java:1492)
   //   at org.jetbrains.java.decompiler.modules.decompiler.vars.VarDefinitionHelper.iterateClashingNames(VarDefinitionHelper.java:1541)
   //   at org.jetbrains.java.decompiler.modules.decompiler.vars.VarDefinitionHelper.iterateClashingExprent(VarDefinitionHelper.java:1672)
   //   at org.jetbrains.java.decompiler.modules.decompiler.vars.VarDefinitionHelper.iterateClashingNames(VarDefinitionHelper.java:1492)
   //   at org.jetbrains.java.decompiler.modules.decompiler.vars.VarDefinitionHelper.iterateClashingNames(VarDefinitionHelper.java:1541)
   //   at org.jetbrains.java.decompiler.modules.decompiler.vars.VarDefinitionHelper.iterateClashingExprent(VarDefinitionHelper.java:1672)
   //   at org.jetbrains.java.decompiler.modules.decompiler.vars.VarDefinitionHelper.iterateClashingNames(VarDefinitionHelper.java:1492)
   //   at org.jetbrains.java.decompiler.modules.decompiler.vars.VarDefinitionHelper.iterateClashingNames(VarDefinitionHelper.java:1541)
   //   at org.jetbrains.java.decompiler.modules.decompiler.vars.VarDefinitionHelper.iterateClashingExprent(VarDefinitionHelper.java:1672)
   //   at org.jetbrains.java.decompiler.modules.decompiler.vars.VarDefinitionHelper.iterateClashingNames(VarDefinitionHelper.java:1492)
   //   at org.jetbrains.java.decompiler.modules.decompiler.vars.VarDefinitionHelper.iterateClashingNames(VarDefinitionHelper.java:1541)
   //   at org.jetbrains.java.decompiler.modules.decompiler.vars.VarDefinitionHelper.iterateClashingExprent(VarDefinitionHelper.java:1672)
   //   at org.jetbrains.java.decompiler.modules.decompiler.vars.VarDefinitionHelper.iterateClashingNames(VarDefinitionHelper.java:1492)
   //   at org.jetbrains.java.decompiler.modules.decompiler.vars.VarDefinitionHelper.iterateClashingNames(VarDefinitionHelper.java:1541)
   //   at org.jetbrains.java.decompiler.modules.decompiler.vars.VarDefinitionHelper.iterateClashingExprent(VarDefinitionHelper.java:1672)
   //   at org.jetbrains.java.decompiler.modules.decompiler.vars.VarDefinitionHelper.iterateClashingNames(VarDefinitionHelper.java:1492)
   //   at org.jetbrains.java.decompiler.modules.decompiler.vars.VarDefinitionHelper.iterateClashingNames(VarDefinitionHelper.java:1541)
   //   at org.jetbrains.java.decompiler.modules.decompiler.vars.VarDefinitionHelper.iterateClashingExprent(VarDefinitionHelper.java:1672)
   //   at org.jetbrains.java.decompiler.modules.decompiler.vars.VarDefinitionHelper.iterateClashingNames(VarDefinitionHelper.java:1492)
   //   at org.jetbrains.java.decompiler.modules.decompiler.vars.VarDefinitionHelper.iterateClashingNames(VarDefinitionHelper.java:1541)
   //   at org.jetbrains.java.decompiler.modules.decompiler.vars.VarDefinitionHelper.iterateClashingExprent(VarDefinitionHelper.java:1672)
   //   at org.jetbrains.java.decompiler.modules.decompiler.vars.VarDefinitionHelper.iterateClashingNames(VarDefinitionHelper.java:1492)
   //   at org.jetbrains.java.decompiler.modules.decompiler.vars.VarDefinitionHelper.iterateClashingNames(VarDefinitionHelper.java:1541)
   //   at org.jetbrains.java.decompiler.modules.decompiler.vars.VarDefinitionHelper.iterateClashingExprent(VarDefinitionHelper.java:1672)
   //   at org.jetbrains.java.decompiler.modules.decompiler.vars.VarDefinitionHelper.iterateClashingNames(VarDefinitionHelper.java:1492)
   //   at org.jetbrains.java.decompiler.modules.decompiler.vars.VarDefinitionHelper.iterateClashingNames(VarDefinitionHelper.java:1541)
   //   at org.jetbrains.java.decompiler.modules.decompiler.vars.VarDefinitionHelper.iterateClashingExprent(VarDefinitionHelper.java:1672)
   //   at org.jetbrains.java.decompiler.modules.decompiler.vars.VarDefinitionHelper.iterateClashingNames(VarDefinitionHelper.java:1492)
   //   at org.jetbrains.java.decompiler.modules.decompiler.vars.VarDefinitionHelper.iterateClashingNames(VarDefinitionHelper.java:1541)
   //   at org.jetbrains.java.decompiler.modules.decompiler.vars.VarDefinitionHelper.iterateClashingExprent(VarDefinitionHelper.java:1672)
   //   at org.jetbrains.java.decompiler.modules.decompiler.vars.VarDefinitionHelper.iterateClashingNames(VarDefinitionHelper.java:1492)
   //   at org.jetbrains.java.decompiler.modules.decompiler.vars.VarDefinitionHelper.iterateClashingNames(VarDefinitionHelper.java:1541)
   //   at org.jetbrains.java.decompiler.modules.decompiler.vars.VarDefinitionHelper.iterateClashingExprent(VarDefinitionHelper.java:1672)
   //   at org.jetbrains.java.decompiler.modules.decompiler.vars.VarDefinitionHelper.iterateClashingNames(VarDefinitionHelper.java:1492)
   //   at org.jetbrains.java.decompiler.modules.decompiler.vars.VarDefinitionHelper.iterateClashingNames(VarDefinitionHelper.java:1541)
   //   at org.jetbrains.java.decompiler.modules.decompiler.vars.VarDefinitionHelper.iterateClashingExprent(VarDefinitionHelper.java:1672)
   //   at org.jetbrains.java.decompiler.modules.decompiler.vars.VarDefinitionHelper.iterateClashingNames(VarDefinitionHelper.java:1492)
   //   at org.jetbrains.java.decompiler.modules.decompiler.vars.VarDefinitionHelper.iterateClashingNames(VarDefinitionHelper.java:1541)
   //   at org.jetbrains.java.decompiler.modules.decompiler.vars.VarDefinitionHelper.iterateClashingExprent(VarDefinitionHelper.java:1672)
   //   at org.jetbrains.java.decompiler.modules.decompiler.vars.VarDefinitionHelper.iterateClashingNames(VarDefinitionHelper.java:1492)
   //   at org.jetbrains.java.decompiler.modules.decompiler.vars.VarDefinitionHelper.iterateClashingNames(VarDefinitionHelper.java:1541)
   //   at org.jetbrains.java.decompiler.modules.decompiler.vars.VarDefinitionHelper.iterateClashingExprent(VarDefinitionHelper.java:1672)
   //   at org.jetbrains.java.decompiler.modules.decompiler.vars.VarDefinitionHelper.iterateClashingNames(VarDefinitionHelper.java:1492)
   //   at org.jetbrains.java.decompiler.modules.decompiler.vars.VarDefinitionHelper.iterateClashingNames(VarDefinitionHelper.java:1541)
   //   at org.jetbrains.java.decompiler.modules.decompiler.vars.VarDefinitionHelper.iterateClashingExprent(VarDefinitionHelper.java:1672)
   //   at org.jetbrains.java.decompiler.modules.decompiler.vars.VarDefinitionHelper.iterateClashingNames(VarDefinitionHelper.java:1492)
   //   at org.jetbrains.java.decompiler.modules.decompiler.vars.VarDefinitionHelper.iterateClashingNames(VarDefinitionHelper.java:1541)
   //   at org.jetbrains.java.decompiler.modules.decompiler.vars.VarDefinitionHelper.iterateClashingExprent(VarDefinitionHelper.java:1672)
   //   at org.jetbrains.java.decompiler.modules.decompiler.vars.VarDefinitionHelper.iterateClashingNames(VarDefinitionHelper.java:1492)
   //   at org.jetbrains.java.decompiler.modules.decompiler.vars.VarDefinitionHelper.iterateClashingNames(VarDefinitionHelper.java:1541)
   //   at org.jetbrains.java.decompiler.modules.decompiler.vars.VarDefinitionHelper.iterateClashingExprent(VarDefinitionHelper.java:1672)
   //   at org.jetbrains.java.decompiler.modules.decompiler.vars.VarDefinitionHelper.iterateClashingNames(VarDefinitionHelper.java:1492)
   //   at org.jetbrains.java.decompiler.modules.decompiler.vars.VarDefinitionHelper.iterateClashingNames(VarDefinitionHelper.java:1541)
   //   at org.jetbrains.java.decompiler.modules.decompiler.vars.VarDefinitionHelper.iterateClashingExprent(VarDefinitionHelper.java:1672)
   //   at org.jetbrains.java.decompiler.modules.decompiler.vars.VarDefinitionHelper.iterateClashingNames(VarDefinitionHelper.java:1492)
   //   at org.jetbrains.java.decompiler.modules.decompiler.vars.VarDefinitionHelper.iterateClashingNames(VarDefinitionHelper.java:1541)
   //   at org.jetbrains.java.decompiler.modules.decompiler.vars.VarDefinitionHelper.iterateClashingExprent(VarDefinitionHelper.java:1672)
   //   at org.jetbrains.java.decompiler.modules.decompiler.vars.VarDefinitionHelper.iterateClashingNames(VarDefinitionHelper.java:1492)
   //   at org.jetbrains.java.decompiler.modules.decompiler.vars.VarDefinitionHelper.iterateClashingNames(VarDefinitionHelper.java:1541)
   //   at org.jetbrains.java.decompiler.modules.decompiler.vars.VarDefinitionHelper.iterateClashingExprent(VarDefinitionHelper.java:1672)
   //   at org.jetbrains.java.decompiler.modules.decompiler.vars.VarDefinitionHelper.iterateClashingNames(VarDefinitionHelper.java:1492)
   //   at org.jetbrains.java.decompiler.modules.decompiler.vars.VarDefinitionHelper.iterateClashingNames(VarDefinitionHelper.java:1541)
   //   at org.jetbrains.java.decompiler.modules.decompiler.vars.VarDefinitionHelper.iterateClashingExprent(VarDefinitionHelper.java:1672)
   //   at org.jetbrains.java.decompiler.modules.decompiler.vars.VarDefinitionHelper.iterateClashingNames(VarDefinitionHelper.java:1492)
   //   at org.jetbrains.java.decompiler.modules.decompiler.vars.VarDefinitionHelper.iterateClashingNames(VarDefinitionHelper.java:1541)
   //   at org.jetbrains.java.decompiler.modules.decompiler.vars.VarDefinitionHelper.iterateClashingExprent(VarDefinitionHelper.java:1672)
   //   at org.jetbrains.java.decompiler.modules.decompiler.vars.VarDefinitionHelper.iterateClashingNames(VarDefinitionHelper.java:1492)
   //   at org.jetbrains.java.decompiler.modules.decompiler.vars.VarDefinitionHelper.iterateClashingNames(VarDefinitionHelper.java:1541)
   //   at org.jetbrains.java.decompiler.modules.decompiler.vars.VarDefinitionHelper.iterateClashingExprent(VarDefinitionHelper.java:1672)
   //   at org.jetbrains.java.decompiler.modules.decompiler.vars.VarDefinitionHelper.iterateClashingNames(VarDefinitionHelper.java:1492)
   //   at org.jetbrains.java.decompiler.modules.decompiler.vars.VarDefinitionHelper.iterateClashingNames(VarDefinitionHelper.java:1541)
   //   at org.jetbrains.java.decompiler.modules.decompiler.vars.VarDefinitionHelper.iterateClashingExprent(VarDefinitionHelper.java:1672)
   //   at org.jetbrains.java.decompiler.modules.decompiler.vars.VarDefinitionHelper.iterateClashingNames(VarDefinitionHelper.java:1492)
   //   at org.jetbrains.java.decompiler.modules.decompiler.vars.VarDefinitionHelper.iterateClashingNames(VarDefinitionHelper.java:1541)
   //   at org.jetbrains.java.decompiler.modules.decompiler.vars.VarDefinitionHelper.iterateClashingExprent(VarDefinitionHelper.java:1672)
   //   at org.jetbrains.java.decompiler.modules.decompiler.vars.VarDefinitionHelper.iterateClashingNames(VarDefinitionHelper.java:1492)
   //   at org.jetbrains.java.decompiler.modules.decompiler.vars.VarDefinitionHelper.iterateClashingNames(VarDefinitionHelper.java:1541)
   //   at org.jetbrains.java.decompiler.modules.decompiler.vars.VarDefinitionHelper.iterateClashingExprent(VarDefinitionHelper.java:1672)
   //   at org.jetbrains.java.decompiler.modules.decompiler.vars.VarDefinitionHelper.iterateClashingNames(VarDefinitionHelper.java:1492)
   //   at org.jetbrains.java.decompiler.modules.decompiler.vars.VarDefinitionHelper.iterateClashingNames(VarDefinitionHelper.java:1541)
   //   at org.jetbrains.java.decompiler.modules.decompiler.vars.VarDefinitionHelper.iterateClashingExprent(VarDefinitionHelper.java:1672)
   //   at org.jetbrains.java.decompiler.modules.decompiler.vars.VarDefinitionHelper.iterateClashingNames(VarDefinitionHelper.java:1492)
   //   at org.jetbrains.java.decompiler.modules.decompiler.vars.VarDefinitionHelper.iterateClashingNames(VarDefinitionHelper.java:1541)
   //   at org.jetbrains.java.decompiler.modules.decompiler.vars.VarDefinitionHelper.iterateClashingExprent(VarDefinitionHelper.java:1672)
   //   at org.jetbrains.java.decompiler.modules.decompiler.vars.VarDefinitionHelper.iterateClashingNames(VarDefinitionHelper.java:1492)
   //   at org.jetbrains.java.decompiler.modules.decompiler.vars.VarDefinitionHelper.iterateClashingNames(VarDefinitionHelper.java:1541)
   //   at org.jetbrains.java.decompiler.modules.decompiler.vars.VarDefinitionHelper.iterateClashingExprent(VarDefinitionHelper.java:1672)
   //   at org.jetbrains.java.decompiler.modules.decompiler.vars.VarDefinitionHelper.iterateClashingNames(VarDefinitionHelper.java:1492)
   //   at org.jetbrains.java.decompiler.modules.decompiler.vars.VarDefinitionHelper.iterateClashingNames(VarDefinitionHelper.java:1541)
   //   at org.jetbrains.java.decompiler.modules.decompiler.vars.VarDefinitionHelper.iterateClashingExprent(VarDefinitionHelper.java:1672)
   //   at org.jetbrains.java.decompiler.modules.decompiler.vars.VarDefinitionHelper.iterateClashingNames(VarDefinitionHelper.java:1492)
   //   at org.jetbrains.java.decompiler.modules.decompiler.vars.VarDefinitionHelper.iterateClashingNames(VarDefinitionHelper.java:1541)
   //   at org.jetbrains.java.decompiler.modules.decompiler.vars.VarDefinitionHelper.iterateClashingExprent(VarDefinitionHelper.java:1672)
   //   at org.jetbrains.java.decompiler.modules.decompiler.vars.VarDefinitionHelper.iterateClashingNames(VarDefinitionHelper.java:1492)
   //   at org.jetbrains.java.decompiler.modules.decompiler.vars.VarDefinitionHelper.iterateClashingNames(VarDefinitionHelper.java:1541)
   //   at org.jetbrains.java.decompiler.modules.decompiler.vars.VarDefinitionHelper.iterateClashingExprent(VarDefinitionHelper.java:1672)
   //   at org.jetbrains.java.decompiler.modules.decompiler.vars.VarDefinitionHelper.iterateClashingNames(VarDefinitionHelper.java:1492)
   //   at org.jetbrains.java.decompiler.modules.decompiler.vars.VarDefinitionHelper.iterateClashingNames(VarDefinitionHelper.java:1541)
   //   at org.jetbrains.java.decompiler.modules.decompiler.vars.VarDefinitionHelper.iterateClashingExprent(VarDefinitionHelper.java:1672)
   //   at org.jetbrains.java.decompiler.modules.decompiler.vars.VarDefinitionHelper.iterateClashingNames(VarDefinitionHelper.java:1492)
   //   at org.jetbrains.java.decompiler.modules.decompiler.vars.VarDefinitionHelper.iterateClashingNames(VarDefinitionHelper.java:1541)
   //   at org.jetbrains.java.decompiler.modules.decompiler.vars.VarDefinitionHelper.iterateClashingExprent(VarDefinitionHelper.java:1672)
   //   at org.jetbrains.java.decompiler.modules.decompiler.vars.VarDefinitionHelper.iterateClashingNames(VarDefinitionHelper.java:1492)
   //   at org.jetbrains.java.decompiler.modules.decompiler.vars.VarDefinitionHelper.iterateClashingNames(VarDefinitionHelper.java:1541)
   //   at org.jetbrains.java.decompiler.modules.decompiler.vars.VarDefinitionHelper.iterateClashingExprent(VarDefinitionHelper.java:1672)
   //   at org.jetbrains.java.decompiler.modules.decompiler.vars.VarDefinitionHelper.iterateClashingNames(VarDefinitionHelper.java:1492)
   //   at org.jetbrains.java.decompiler.modules.decompiler.vars.VarDefinitionHelper.iterateClashingNames(VarDefinitionHelper.java:1541)
   //   at org.jetbrains.java.decompiler.modules.decompiler.vars.VarDefinitionHelper.iterateClashingExprent(VarDefinitionHelper.java:1672)
   //   at org.jetbrains.java.decompiler.modules.decompiler.vars.VarDefinitionHelper.iterateClashingNames(VarDefinitionHelper.java:1492)
   //   at org.jetbrains.java.decompiler.modules.decompiler.vars.VarDefinitionHelper.iterateClashingNames(VarDefinitionHelper.java:1541)
   //   at org.jetbrains.java.decompiler.modules.decompiler.vars.VarDefinitionHelper.iterateClashingExprent(VarDefinitionHelper.java:1672)
   //   at org.jetbrains.java.decompiler.modules.decompiler.vars.VarDefinitionHelper.iterateClashingNames(VarDefinitionHelper.java:1492)
   //   at org.jetbrains.java.decompiler.modules.decompiler.vars.VarDefinitionHelper.iterateClashingNames(VarDefinitionHelper.java:1541)
   //   at org.jetbrains.java.decompiler.modules.decompiler.vars.VarDefinitionHelper.iterateClashingExprent(VarDefinitionHelper.java:1672)
   //   at org.jetbrains.java.decompiler.modules.decompiler.vars.VarDefinitionHelper.iterateClashingNames(VarDefinitionHelper.java:1492)
   //   at org.jetbrains.java.decompiler.modules.decompiler.vars.VarDefinitionHelper.iterateClashingNames(VarDefinitionHelper.java:1541)
   //   at org.jetbrains.java.decompiler.modules.decompiler.vars.VarDefinitionHelper.iterateClashingExprent(VarDefinitionHelper.java:1672)
   //   at org.jetbrains.java.decompiler.modules.decompiler.vars.VarDefinitionHelper.iterateClashingNames(VarDefinitionHelper.java:1492)
   //   at org.jetbrains.java.decompiler.modules.decompiler.vars.VarDefinitionHelper.iterateClashingNames(VarDefinitionHelper.java:1541)
   //   at org.jetbrains.java.decompiler.modules.decompiler.vars.VarDefinitionHelper.iterateClashingExprent(VarDefinitionHelper.java:1672)
   //   at org.jetbrains.java.decompiler.modules.decompiler.vars.VarDefinitionHelper.iterateClashingNames(VarDefinitionHelper.java:1492)
   //   at org.jetbrains.java.decompiler.modules.decompiler.vars.VarDefinitionHelper.iterateClashingNames(VarDefinitionHelper.java:1541)
   //   at org.jetbrains.java.decompiler.modules.decompiler.vars.VarDefinitionHelper.iterateClashingExprent(VarDefinitionHelper.java:1672)
   //   at org.jetbrains.java.decompiler.modules.decompiler.vars.VarDefinitionHelper.iterateClashingNames(VarDefinitionHelper.java:1492)
   //   at org.jetbrains.java.decompiler.modules.decompiler.vars.VarDefinitionHelper.iterateClashingNames(VarDefinitionHelper.java:1541)
   //   at org.jetbrains.java.decompiler.modules.decompiler.vars.VarDefinitionHelper.iterateClashingExprent(VarDefinitionHelper.java:1672)
   //   at org.jetbrains.java.decompiler.modules.decompiler.vars.VarDefinitionHelper.iterateClashingNames(VarDefinitionHelper.java:1492)
   //   at org.jetbrains.java.decompiler.modules.decompiler.vars.VarDefinitionHelper.iterateClashingNames(VarDefinitionHelper.java:1541)
   //   at org.jetbrains.java.decompiler.modules.decompiler.vars.VarDefinitionHelper.iterateClashingExprent(VarDefinitionHelper.java:1672)
   //   at org.jetbrains.java.decompiler.modules.decompiler.vars.VarDefinitionHelper.iterateClashingNames(VarDefinitionHelper.java:1492)
   //   at org.jetbrains.java.decompiler.modules.decompiler.vars.VarDefinitionHelper.iterateClashingNames(VarDefinitionHelper.java:1541)
   //   at org.jetbrains.java.decompiler.modules.decompiler.vars.VarDefinitionHelper.iterateClashingExprent(VarDefinitionHelper.java:1672)
   //   at org.jetbrains.java.decompiler.modules.decompiler.vars.VarDefinitionHelper.iterateClashingNames(VarDefinitionHelper.java:1492)
   //   at org.jetbrains.java.decompiler.modules.decompiler.vars.VarDefinitionHelper.iterateClashingNames(VarDefinitionHelper.java:1541)
   //   at org.jetbrains.java.decompiler.modules.decompiler.vars.VarDefinitionHelper.iterateClashingExprent(VarDefinitionHelper.java:1672)
   //   at org.jetbrains.java.decompiler.modules.decompiler.vars.VarDefinitionHelper.iterateClashingNames(VarDefinitionHelper.java:1492)
   //   at org.jetbrains.java.decompiler.modules.decompiler.vars.VarDefinitionHelper.iterateClashingNames(VarDefinitionHelper.java:1541)
   //   at org.jetbrains.java.decompiler.modules.decompiler.vars.VarDefinitionHelper.iterateClashingExprent(VarDefinitionHelper.java:1672)
   //   at org.jetbrains.java.decompiler.modules.decompiler.vars.VarDefinitionHelper.iterateClashingNames(VarDefinitionHelper.java:1492)
   //   at org.jetbrains.java.decompiler.modules.decompiler.vars.VarDefinitionHelper.iterateClashingNames(VarDefinitionHelper.java:1541)
   //   at org.jetbrains.java.decompiler.modules.decompiler.vars.VarDefinitionHelper.iterateClashingExprent(VarDefinitionHelper.java:1672)
   //   at org.jetbrains.java.decompiler.modules.decompiler.vars.VarDefinitionHelper.iterateClashingNames(VarDefinitionHelper.java:1492)
   //   at org.jetbrains.java.decompiler.modules.decompiler.vars.VarDefinitionHelper.iterateClashingNames(VarDefinitionHelper.java:1541)
   //   at org.jetbrains.java.decompiler.modules.decompiler.vars.VarDefinitionHelper.iterateClashingExprent(VarDefinitionHelper.java:1672)
   //   at org.jetbrains.java.decompiler.modules.decompiler.vars.VarDefinitionHelper.iterateClashingNames(VarDefinitionHelper.java:1492)
   //   at org.jetbrains.java.decompiler.modules.decompiler.vars.VarDefinitionHelper.iterateClashingNames(VarDefinitionHelper.java:1541)
   //   at org.jetbrains.java.decompiler.modules.decompiler.vars.VarDefinitionHelper.iterateClashingExprent(VarDefinitionHelper.java:1672)
   //   at org.jetbrains.java.decompiler.modules.decompiler.vars.VarDefinitionHelper.iterateClashingNames(VarDefinitionHelper.java:1492)
   //   at org.jetbrains.java.decompiler.modules.decompiler.vars.VarDefinitionHelper.iterateClashingNames(VarDefinitionHelper.java:1541)
   //   at org.jetbrains.java.decompiler.modules.decompiler.vars.VarDefinitionHelper.iterateClashingExprent(VarDefinitionHelper.java:1672)
   //   at org.jetbrains.java.decompiler.modules.decompiler.vars.VarDefinitionHelper.iterateClashingNames(VarDefinitionHelper.java:1492)
   //   at org.jetbrains.java.decompiler.modules.decompiler.vars.VarDefinitionHelper.iterateClashingNames(VarDefinitionHelper.java:1541)
   //   at org.jetbrains.java.decompiler.modules.decompiler.vars.VarDefinitionHelper.iterateClashingExprent(VarDefinitionHelper.java:1672)
   //   at org.jetbrains.java.decompiler.modules.decompiler.vars.VarDefinitionHelper.iterateClashingNames(VarDefinitionHelper.java:1492)
   //   at org.jetbrains.java.decompiler.modules.decompiler.vars.VarDefinitionHelper.iterateClashingNames(VarDefinitionHelper.java:1541)
   //   at org.jetbrains.java.decompiler.modules.decompiler.vars.VarDefinitionHelper.iterateClashingExprent(VarDefinitionHelper.java:1672)
   //   at org.jetbrains.java.decompiler.modules.decompiler.vars.VarDefinitionHelper.iterateClashingNames(VarDefinitionHelper.java:1492)
   //   at org.jetbrains.java.decompiler.modules.decompiler.vars.VarDefinitionHelper.iterateClashingNames(VarDefinitionHelper.java:1541)
   //   at org.jetbrains.java.decompiler.modules.decompiler.vars.VarDefinitionHelper.iterateClashingExprent(VarDefinitionHelper.java:1672)
   //   at org.jetbrains.java.decompiler.modules.decompiler.vars.VarDefinitionHelper.iterateClashingNames(VarDefinitionHelper.java:1492)
   //   at org.jetbrains.java.decompiler.modules.decompiler.vars.VarDefinitionHelper.iterateClashingNames(VarDefinitionHelper.java:1541)
   //   at org.jetbrains.java.decompiler.modules.decompiler.vars.VarDefinitionHelper.iterateClashingExprent(VarDefinitionHelper.java:1672)
   //   at org.jetbrains.java.decompiler.modules.decompiler.vars.VarDefinitionHelper.iterateClashingNames(VarDefinitionHelper.java:1492)
   //   at org.jetbrains.java.decompiler.modules.decompiler.vars.VarDefinitionHelper.iterateClashingNames(VarDefinitionHelper.java:1541)
   //   at org.jetbrains.java.decompiler.modules.decompiler.vars.VarDefinitionHelper.iterateClashingExprent(VarDefinitionHelper.java:1672)
   //   at org.jetbrains.java.decompiler.modules.decompiler.vars.VarDefinitionHelper.iterateClashingNames(VarDefinitionHelper.java:1492)
   //   at org.jetbrains.java.decompiler.modules.decompiler.vars.VarDefinitionHelper.iterateClashingNames(VarDefinitionHelper.java:1541)
   //   at org.jetbrains.java.decompiler.modules.decompiler.vars.VarDefinitionHelper.iterateClashingExprent(VarDefinitionHelper.java:1672)
   //   at org.jetbrains.java.decompiler.modules.decompiler.vars.VarDefinitionHelper.iterateClashingNames(VarDefinitionHelper.java:1492)
   //   at org.jetbrains.java.decompiler.modules.decompiler.vars.VarDefinitionHelper.iterateClashingNames(VarDefinitionHelper.java:1541)
   //   at org.jetbrains.java.decompiler.modules.decompiler.vars.VarDefinitionHelper.iterateClashingExprent(VarDefinitionHelper.java:1672)
   //   at org.jetbrains.java.decompiler.modules.decompiler.vars.VarDefinitionHelper.iterateClashingNames(VarDefinitionHelper.java:1492)
   //   at org.jetbrains.java.decompiler.modules.decompiler.vars.VarDefinitionHelper.iterateClashingNames(VarDefinitionHelper.java:1541)
   //   at org.jetbrains.java.decompiler.modules.decompiler.vars.VarDefinitionHelper.iterateClashingExprent(VarDefinitionHelper.java:1672)
   //   at org.jetbrains.java.decompiler.modules.decompiler.vars.VarDefinitionHelper.iterateClashingNames(VarDefinitionHelper.java:1492)
   //   at org.jetbrains.java.decompiler.modules.decompiler.vars.VarDefinitionHelper.iterateClashingNames(VarDefinitionHelper.java:1541)
   //   at org.jetbrains.java.decompiler.modules.decompiler.vars.VarDefinitionHelper.iterateClashingExprent(VarDefinitionHelper.java:1672)
   //   at org.jetbrains.java.decompiler.modules.decompiler.vars.VarDefinitionHelper.iterateClashingNames(VarDefinitionHelper.java:1492)
   //   at org.jetbrains.java.decompiler.modules.decompiler.vars.VarDefinitionHelper.iterateClashingNames(VarDefinitionHelper.java:1541)
   //   at org.jetbrains.java.decompiler.modules.decompiler.vars.VarDefinitionHelper.iterateClashingExprent(VarDefinitionHelper.java:1672)
   //   at org.jetbrains.java.decompiler.modules.decompiler.vars.VarDefinitionHelper.iterateClashingNames(VarDefinitionHelper.java:1492)
   //   at org.jetbrains.java.decompiler.modules.decompiler.vars.VarDefinitionHelper.iterateClashingNames(VarDefinitionHelper.java:1541)
   //   at org.jetbrains.java.decompiler.modules.decompiler.vars.VarDefinitionHelper.iterateClashingExprent(VarDefinitionHelper.java:1672)
   //   at org.jetbrains.java.decompiler.modules.decompiler.vars.VarDefinitionHelper.iterateClashingNames(VarDefinitionHelper.java:1492)
   //   at org.jetbrains.java.decompiler.modules.decompiler.vars.VarDefinitionHelper.iterateClashingNames(VarDefinitionHelper.java:1541)
   //   at org.jetbrains.java.decompiler.modules.decompiler.vars.VarDefinitionHelper.iterateClashingExprent(VarDefinitionHelper.java:1672)
   //   at org.jetbrains.java.decompiler.modules.decompiler.vars.VarDefinitionHelper.iterateClashingNames(VarDefinitionHelper.java:1492)
   //   at org.jetbrains.java.decompiler.modules.decompiler.vars.VarDefinitionHelper.iterateClashingNames(VarDefinitionHelper.java:1541)
   //   at org.jetbrains.java.decompiler.modules.decompiler.vars.VarDefinitionHelper.iterateClashingExprent(VarDefinitionHelper.java:1672)
   //   at org.jetbrains.java.decompiler.modules.decompiler.vars.VarDefinitionHelper.iterateClashingNames(VarDefinitionHelper.java:1492)
   //   at org.jetbrains.java.decompiler.modules.decompiler.vars.VarDefinitionHelper.iterateClashingNames(VarDefinitionHelper.java:1541)
   //   at org.jetbrains.java.decompiler.modules.decompiler.vars.VarDefinitionHelper.iterateClashingExprent(VarDefinitionHelper.java:1672)
   //   at org.jetbrains.java.decompiler.modules.decompiler.vars.VarDefinitionHelper.iterateClashingNames(VarDefinitionHelper.java:1492)
   //   at org.jetbrains.java.decompiler.modules.decompiler.vars.VarDefinitionHelper.iterateClashingNames(VarDefinitionHelper.java:1541)
   //   at org.jetbrains.java.decompiler.modules.decompiler.vars.VarDefinitionHelper.iterateClashingExprent(VarDefinitionHelper.java:1672)
   //   at org.jetbrains.java.decompiler.modules.decompiler.vars.VarDefinitionHelper.iterateClashingNames(VarDefinitionHelper.java:1492)
   //   at org.jetbrains.java.decompiler.modules.decompiler.vars.VarDefinitionHelper.iterateClashingNames(VarDefinitionHelper.java:1541)
   //   at org.jetbrains.java.decompiler.modules.decompiler.vars.VarDefinitionHelper.iterateClashingExprent(VarDefinitionHelper.java:1672)
   //   at org.jetbrains.java.decompiler.modules.decompiler.vars.VarDefinitionHelper.iterateClashingNames(VarDefinitionHelper.java:1492)
   //   at org.jetbrains.java.decompiler.modules.decompiler.vars.VarDefinitionHelper.iterateClashingNames(VarDefinitionHelper.java:1541)
   //   at org.jetbrains.java.decompiler.modules.decompiler.vars.VarDefinitionHelper.iterateClashingExprent(VarDefinitionHelper.java:1672)
   //   at org.jetbrains.java.decompiler.modules.decompiler.vars.VarDefinitionHelper.iterateClashingNames(VarDefinitionHelper.java:1492)
   //   at org.jetbrains.java.decompiler.modules.decompiler.vars.VarDefinitionHelper.iterateClashingNames(VarDefinitionHelper.java:1541)
   //   at org.jetbrains.java.decompiler.modules.decompiler.vars.VarDefinitionHelper.iterateClashingExprent(VarDefinitionHelper.java:1672)
   //   at org.jetbrains.java.decompiler.modules.decompiler.vars.VarDefinitionHelper.iterateClashingNames(VarDefinitionHelper.java:1492)
   //   at org.jetbrains.java.decompiler.modules.decompiler.vars.VarDefinitionHelper.iterateClashingNames(VarDefinitionHelper.java:1541)
   //   at org.jetbrains.java.decompiler.modules.decompiler.vars.VarDefinitionHelper.iterateClashingExprent(VarDefinitionHelper.java:1672)
   //   at org.jetbrains.java.decompiler.modules.decompiler.vars.VarDefinitionHelper.iterateClashingNames(VarDefinitionHelper.java:1492)
   //   at org.jetbrains.java.decompiler.modules.decompiler.vars.VarDefinitionHelper.iterateClashingNames(VarDefinitionHelper.java:1541)
   //   at org.jetbrains.java.decompiler.modules.decompiler.vars.VarDefinitionHelper.iterateClashingExprent(VarDefinitionHelper.java:1672)
   //   at org.jetbrains.java.decompiler.modules.decompiler.vars.VarDefinitionHelper.iterateClashingNames(VarDefinitionHelper.java:1492)
   //   at org.jetbrains.java.decompiler.modules.decompiler.vars.VarDefinitionHelper.iterateClashingNames(VarDefinitionHelper.java:1541)
   //   at org.jetbrains.java.decompiler.modules.decompiler.vars.VarDefinitionHelper.iterateClashingExprent(VarDefinitionHelper.java:1672)
   //   at org.jetbrains.java.decompiler.modules.decompiler.vars.VarDefinitionHelper.iterateClashingNames(VarDefinitionHelper.java:1492)
   //   at org.jetbrains.java.decompiler.modules.decompiler.vars.VarDefinitionHelper.iterateClashingNames(VarDefinitionHelper.java:1541)
   //   at org.jetbrains.java.decompiler.modules.decompiler.vars.VarDefinitionHelper.iterateClashingExprent(VarDefinitionHelper.java:1672)
   //   at org.jetbrains.java.decompiler.modules.decompiler.vars.VarDefinitionHelper.iterateClashingNames(VarDefinitionHelper.java:1492)
   //   at org.jetbrains.java.decompiler.modules.decompiler.vars.VarDefinitionHelper.iterateClashingNames(VarDefinitionHelper.java:1541)
   //   at org.jetbrains.java.decompiler.modules.decompiler.vars.VarDefinitionHelper.iterateClashingExprent(VarDefinitionHelper.java:1672)
   //   at org.jetbrains.java.decompiler.modules.decompiler.vars.VarDefinitionHelper.iterateClashingNames(VarDefinitionHelper.java:1492)
   //   at org.jetbrains.java.decompiler.modules.decompiler.vars.VarDefinitionHelper.iterateClashingNames(VarDefinitionHelper.java:1541)
   //   at org.jetbrains.java.decompiler.modules.decompiler.vars.VarDefinitionHelper.iterateClashingExprent(VarDefinitionHelper.java:1672)
   //   at org.jetbrains.java.decompiler.modules.decompiler.vars.VarDefinitionHelper.iterateClashingNames(VarDefinitionHelper.java:1492)
   //   at org.jetbrains.java.decompiler.modules.decompiler.vars.VarDefinitionHelper.iterateClashingNames(VarDefinitionHelper.java:1541)
   //   at org.jetbrains.java.decompiler.modules.decompiler.vars.VarDefinitionHelper.iterateClashingExprent(VarDefinitionHelper.java:1672)
   //   at org.jetbrains.java.decompiler.modules.decompiler.vars.VarDefinitionHelper.iterateClashingNames(VarDefinitionHelper.java:1492)
   //   at org.jetbrains.java.decompiler.modules.decompiler.vars.VarDefinitionHelper.iterateClashingNames(VarDefinitionHelper.java:1541)
   //   at org.jetbrains.java.decompiler.modules.decompiler.vars.VarDefinitionHelper.iterateClashingExprent(VarDefinitionHelper.java:1672)
   //   at org.jetbrains.java.decompiler.modules.decompiler.vars.VarDefinitionHelper.iterateClashingNames(VarDefinitionHelper.java:1492)
   //   at org.jetbrains.java.decompiler.modules.decompiler.vars.VarDefinitionHelper.iterateClashingNames(VarDefinitionHelper.java:1541)
   //   at org.jetbrains.java.decompiler.modules.decompiler.vars.VarDefinitionHelper.iterateClashingExprent(VarDefinitionHelper.java:1672)
   //   at org.jetbrains.java.decompiler.modules.decompiler.vars.VarDefinitionHelper.iterateClashingNames(VarDefinitionHelper.java:1492)
   //   at org.jetbrains.java.decompiler.modules.decompiler.vars.VarDefinitionHelper.iterateClashingNames(VarDefinitionHelper.java:1541)
   //   at org.jetbrains.java.decompiler.modules.decompiler.vars.VarDefinitionHelper.iterateClashingExprent(VarDefinitionHelper.java:1672)
   //   at org.jetbrains.java.decompiler.modules.decompiler.vars.VarDefinitionHelper.iterateClashingNames(VarDefinitionHelper.java:1492)
   //   at org.jetbrains.java.decompiler.modules.decompiler.vars.VarDefinitionHelper.iterateClashingNames(VarDefinitionHelper.java:1541)
   //   at org.jetbrains.java.decompiler.modules.decompiler.vars.VarDefinitionHelper.iterateClashingExprent(VarDefinitionHelper.java:1672)
   //   at org.jetbrains.java.decompiler.modules.decompiler.vars.VarDefinitionHelper.iterateClashingNames(VarDefinitionHelper.java:1492)
   //   at org.jetbrains.java.decompiler.modules.decompiler.vars.VarDefinitionHelper.iterateClashingNames(VarDefinitionHelper.java:1541)
   //   at org.jetbrains.java.decompiler.modules.decompiler.vars.VarDefinitionHelper.iterateClashingExprent(VarDefinitionHelper.java:1672)
   //   at org.jetbrains.java.decompiler.modules.decompiler.vars.VarDefinitionHelper.iterateClashingNames(VarDefinitionHelper.java:1492)
   //   at org.jetbrains.java.decompiler.modules.decompiler.vars.VarDefinitionHelper.iterateClashingNames(VarDefinitionHelper.java:1541)
   //   at org.jetbrains.java.decompiler.modules.decompiler.vars.VarDefinitionHelper.iterateClashingExprent(VarDefinitionHelper.java:1672)
   //   at org.jetbrains.java.decompiler.modules.decompiler.vars.VarDefinitionHelper.iterateClashingNames(VarDefinitionHelper.java:1492)
   //   at org.jetbrains.java.decompiler.modules.decompiler.vars.VarDefinitionHelper.iterateClashingNames(VarDefinitionHelper.java:1541)
   //   at org.jetbrains.java.decompiler.modules.decompiler.vars.VarDefinitionHelper.iterateClashingExprent(VarDefinitionHelper.java:1672)
   //   at org.jetbrains.java.decompiler.modules.decompiler.vars.VarDefinitionHelper.iterateClashingNames(VarDefinitionHelper.java:1492)
   //   at org.jetbrains.java.decompiler.modules.decompiler.vars.VarDefinitionHelper.iterateClashingNames(VarDefinitionHelper.java:1541)
   //   at org.jetbrains.java.decompiler.modules.decompiler.vars.VarDefinitionHelper.iterateClashingExprent(VarDefinitionHelper.java:1672)
   //   at org.jetbrains.java.decompiler.modules.decompiler.vars.VarDefinitionHelper.iterateClashingNames(VarDefinitionHelper.java:1492)
   //   at org.jetbrains.java.decompiler.modules.decompiler.vars.VarDefinitionHelper.iterateClashingNames(VarDefinitionHelper.java:1541)
   //   at org.jetbrains.java.decompiler.modules.decompiler.vars.VarDefinitionHelper.iterateClashingExprent(VarDefinitionHelper.java:1672)
   //   at org.jetbrains.java.decompiler.modules.decompiler.vars.VarDefinitionHelper.iterateClashingNames(VarDefinitionHelper.java:1492)
   //   at org.jetbrains.java.decompiler.modules.decompiler.vars.VarDefinitionHelper.iterateClashingNames(VarDefinitionHelper.java:1541)
   //   at org.jetbrains.java.decompiler.modules.decompiler.vars.VarDefinitionHelper.iterateClashingExprent(VarDefinitionHelper.java:1672)
   //   at org.jetbrains.java.decompiler.modules.decompiler.vars.VarDefinitionHelper.iterateClashingNames(VarDefinitionHelper.java:1492)
   //   at org.jetbrains.java.decompiler.modules.decompiler.vars.VarDefinitionHelper.iterateClashingNames(VarDefinitionHelper.java:1541)
   //   at org.jetbrains.java.decompiler.modules.decompiler.vars.VarDefinitionHelper.iterateClashingExprent(VarDefinitionHelper.java:1672)
   //   at org.jetbrains.java.decompiler.modules.decompiler.vars.VarDefinitionHelper.iterateClashingNames(VarDefinitionHelper.java:1492)
   //   at org.jetbrains.java.decompiler.modules.decompiler.vars.VarDefinitionHelper.iterateClashingNames(VarDefinitionHelper.java:1541)
   //   at org.jetbrains.java.decompiler.modules.decompiler.vars.VarDefinitionHelper.iterateClashingExprent(VarDefinitionHelper.java:1672)
   //   at org.jetbrains.java.decompiler.modules.decompiler.vars.VarDefinitionHelper.iterateClashingNames(VarDefinitionHelper.java:1492)
   //   at org.jetbrains.java.decompiler.modules.decompiler.vars.VarDefinitionHelper.iterateClashingNames(VarDefinitionHelper.java:1541)
   //   at org.jetbrains.java.decompiler.modules.decompiler.vars.VarDefinitionHelper.iterateClashingExprent(VarDefinitionHelper.java:1672)
   //   at org.jetbrains.java.decompiler.modules.decompiler.vars.VarDefinitionHelper.iterateClashingNames(VarDefinitionHelper.java:1492)
   //   at org.jetbrains.java.decompiler.modules.decompiler.vars.VarDefinitionHelper.iterateClashingNames(VarDefinitionHelper.java:1541)
   //   at org.jetbrains.java.decompiler.modules.decompiler.vars.VarDefinitionHelper.iterateClashingExprent(VarDefinitionHelper.java:1672)
   //   at org.jetbrains.java.decompiler.modules.decompiler.vars.VarDefinitionHelper.iterateClashingNames(VarDefinitionHelper.java:1492)
   //   at org.jetbrains.java.decompiler.modules.decompiler.vars.VarDefinitionHelper.iterateClashingNames(VarDefinitionHelper.java:1541)
   //   at org.jetbrains.java.decompiler.modules.decompiler.vars.VarDefinitionHelper.iterateClashingExprent(VarDefinitionHelper.java:1672)
   //   at org.jetbrains.java.decompiler.modules.decompiler.vars.VarDefinitionHelper.iterateClashingNames(VarDefinitionHelper.java:1492)
   //   at org.jetbrains.java.decompiler.modules.decompiler.vars.VarDefinitionHelper.iterateClashingNames(VarDefinitionHelper.java:1541)
   //   at org.jetbrains.java.decompiler.modules.decompiler.vars.VarDefinitionHelper.iterateClashingExprent(VarDefinitionHelper.java:1672)
   //   at org.jetbrains.java.decompiler.modules.decompiler.vars.VarDefinitionHelper.iterateClashingNames(VarDefinitionHelper.java:1492)
   //   at org.jetbrains.java.decompiler.modules.decompiler.vars.VarDefinitionHelper.iterateClashingNames(VarDefinitionHelper.java:1541)
   //   at org.jetbrains.java.decompiler.modules.decompiler.vars.VarDefinitionHelper.iterateClashingExprent(VarDefinitionHelper.java:1672)
   //   at org.jetbrains.java.decompiler.modules.decompiler.vars.VarDefinitionHelper.iterateClashingNames(VarDefinitionHelper.java:1492)
   //   at org.jetbrains.java.decompiler.modules.decompiler.vars.VarDefinitionHelper.iterateClashingNames(VarDefinitionHelper.java:1541)
   //   at org.jetbrains.java.decompiler.modules.decompiler.vars.VarDefinitionHelper.iterateClashingExprent(VarDefinitionHelper.java:1672)
   //   at org.jetbrains.java.decompiler.modules.decompiler.vars.VarDefinitionHelper.iterateClashingNames(VarDefinitionHelper.java:1492)
   //   at org.jetbrains.java.decompiler.modules.decompiler.vars.VarDefinitionHelper.iterateClashingNames(VarDefinitionHelper.java:1541)
   //   at org.jetbrains.java.decompiler.modules.decompiler.vars.VarDefinitionHelper.iterateClashingExprent(VarDefinitionHelper.java:1672)
   //   at org.jetbrains.java.decompiler.modules.decompiler.vars.VarDefinitionHelper.iterateClashingNames(VarDefinitionHelper.java:1492)
   //   at org.jetbrains.java.decompiler.modules.decompiler.vars.VarDefinitionHelper.iterateClashingNames(VarDefinitionHelper.java:1541)
   //   at org.jetbrains.java.decompiler.modules.decompiler.vars.VarDefinitionHelper.iterateClashingExprent(VarDefinitionHelper.java:1672)
   //   at org.jetbrains.java.decompiler.modules.decompiler.vars.VarDefinitionHelper.iterateClashingNames(VarDefinitionHelper.java:1492)
   //   at org.jetbrains.java.decompiler.modules.decompiler.vars.VarDefinitionHelper.iterateClashingNames(VarDefinitionHelper.java:1541)
   //   at org.jetbrains.java.decompiler.modules.decompiler.vars.VarDefinitionHelper.iterateClashingExprent(VarDefinitionHelper.java:1672)
   //   at org.jetbrains.java.decompiler.modules.decompiler.vars.VarDefinitionHelper.iterateClashingNames(VarDefinitionHelper.java:1492)
   //   at org.jetbrains.java.decompiler.modules.decompiler.vars.VarDefinitionHelper.iterateClashingNames(VarDefinitionHelper.java:1541)
   //   at org.jetbrains.java.decompiler.modules.decompiler.vars.VarDefinitionHelper.iterateClashingExprent(VarDefinitionHelper.java:1672)
   //   at org.jetbrains.java.decompiler.modules.decompiler.vars.VarDefinitionHelper.iterateClashingNames(VarDefinitionHelper.java:1492)
   //   at org.jetbrains.java.decompiler.modules.decompiler.vars.VarDefinitionHelper.iterateClashingNames(VarDefinitionHelper.java:1541)
   //   at org.jetbrains.java.decompiler.modules.decompiler.vars.VarDefinitionHelper.iterateClashingExprent(VarDefinitionHelper.java:1672)
   //   at org.jetbrains.java.decompiler.modules.decompiler.vars.VarDefinitionHelper.iterateClashingNames(VarDefinitionHelper.java:1492)
   //   at org.jetbrains.java.decompiler.modules.decompiler.vars.VarDefinitionHelper.iterateClashingNames(VarDefinitionHelper.java:1541)
   //   at org.jetbrains.java.decompiler.modules.decompiler.vars.VarDefinitionHelper.iterateClashingExprent(VarDefinitionHelper.java:1672)
   //   at org.jetbrains.java.decompiler.modules.decompiler.vars.VarDefinitionHelper.iterateClashingNames(VarDefinitionHelper.java:1492)
   //   at org.jetbrains.java.decompiler.modules.decompiler.vars.VarDefinitionHelper.iterateClashingNames(VarDefinitionHelper.java:1541)
   //   at org.jetbrains.java.decompiler.modules.decompiler.vars.VarDefinitionHelper.iterateClashingExprent(VarDefinitionHelper.java:1672)
   //   at org.jetbrains.java.decompiler.modules.decompiler.vars.VarDefinitionHelper.iterateClashingNames(VarDefinitionHelper.java:1492)
   //   at org.jetbrains.java.decompiler.modules.decompiler.vars.VarDefinitionHelper.iterateClashingNames(VarDefinitionHelper.java:1541)
   //   at org.jetbrains.java.decompiler.modules.decompiler.vars.VarDefinitionHelper.iterateClashingExprent(VarDefinitionHelper.java:1672)
   //   at org.jetbrains.java.decompiler.modules.decompiler.vars.VarDefinitionHelper.iterateClashingNames(VarDefinitionHelper.java:1492)
   //   at org.jetbrains.java.decompiler.modules.decompiler.vars.VarDefinitionHelper.iterateClashingNames(VarDefinitionHelper.java:1541)
   //   at org.jetbrains.java.decompiler.modules.decompiler.vars.VarDefinitionHelper.iterateClashingExprent(VarDefinitionHelper.java:1672)
   //   at org.jetbrains.java.decompiler.modules.decompiler.vars.VarDefinitionHelper.iterateClashingNames(VarDefinitionHelper.java:1492)
   //   at org.jetbrains.java.decompiler.modules.decompiler.vars.VarDefinitionHelper.iterateClashingNames(VarDefinitionHelper.java:1541)
   //   at org.jetbrains.java.decompiler.modules.decompiler.vars.VarDefinitionHelper.iterateClashingExprent(VarDefinitionHelper.java:1672)
   //   at org.jetbrains.java.decompiler.modules.decompiler.vars.VarDefinitionHelper.iterateClashingNames(VarDefinitionHelper.java:1492)
   //   at org.jetbrains.java.decompiler.modules.decompiler.vars.VarDefinitionHelper.iterateClashingNames(VarDefinitionHelper.java:1541)
   //   at org.jetbrains.java.decompiler.modules.decompiler.vars.VarDefinitionHelper.iterateClashingExprent(VarDefinitionHelper.java:1672)
   //   at org.jetbrains.java.decompiler.modules.decompiler.vars.VarDefinitionHelper.iterateClashingNames(VarDefinitionHelper.java:1492)
   //   at org.jetbrains.java.decompiler.modules.decompiler.vars.VarDefinitionHelper.iterateClashingNames(VarDefinitionHelper.java:1541)
   //   at org.jetbrains.java.decompiler.modules.decompiler.vars.VarDefinitionHelper.iterateClashingExprent(VarDefinitionHelper.java:1672)
   //   at org.jetbrains.java.decompiler.modules.decompiler.vars.VarDefinitionHelper.iterateClashingNames(VarDefinitionHelper.java:1492)
   //   at org.jetbrains.java.decompiler.modules.decompiler.vars.VarDefinitionHelper.iterateClashingNames(VarDefinitionHelper.java:1541)
   //   at org.jetbrains.java.decompiler.modules.decompiler.vars.VarDefinitionHelper.iterateClashingExprent(VarDefinitionHelper.java:1672)
   //   at org.jetbrains.java.decompiler.modules.decompiler.vars.VarDefinitionHelper.iterateClashingNames(VarDefinitionHelper.java:1492)
   //   at org.jetbrains.java.decompiler.modules.decompiler.vars.VarDefinitionHelper.iterateClashingNames(VarDefinitionHelper.java:1541)
   //   at org.jetbrains.java.decompiler.modules.decompiler.vars.VarDefinitionHelper.iterateClashingExprent(VarDefinitionHelper.java:1672)
   //   at org.jetbrains.java.decompiler.modules.decompiler.vars.VarDefinitionHelper.iterateClashingNames(VarDefinitionHelper.java:1492)
   //   at org.jetbrains.java.decompiler.modules.decompiler.vars.VarDefinitionHelper.iterateClashingNames(VarDefinitionHelper.java:1541)
   //   at org.jetbrains.java.decompiler.modules.decompiler.vars.VarDefinitionHelper.iterateClashingExprent(VarDefinitionHelper.java:1672)
   //   at org.jetbrains.java.decompiler.modules.decompiler.vars.VarDefinitionHelper.iterateClashingNames(VarDefinitionHelper.java:1492)
   //   at org.jetbrains.java.decompiler.modules.decompiler.vars.VarDefinitionHelper.iterateClashingNames(VarDefinitionHelper.java:1541)
   //   at org.jetbrains.java.decompiler.modules.decompiler.vars.VarDefinitionHelper.iterateClashingExprent(VarDefinitionHelper.java:1672)
   //   at org.jetbrains.java.decompiler.modules.decompiler.vars.VarDefinitionHelper.iterateClashingNames(VarDefinitionHelper.java:1492)
   //   at org.jetbrains.java.decompiler.modules.decompiler.vars.VarDefinitionHelper.iterateClashingNames(VarDefinitionHelper.java:1541)
   //   at org.jetbrains.java.decompiler.modules.decompiler.vars.VarDefinitionHelper.iterateClashingExprent(VarDefinitionHelper.java:1672)
   //   at org.jetbrains.java.decompiler.modules.decompiler.vars.VarDefinitionHelper.iterateClashingNames(VarDefinitionHelper.java:1492)
   //   at org.jetbrains.java.decompiler.modules.decompiler.vars.VarDefinitionHelper.iterateClashingNames(VarDefinitionHelper.java:1541)
   //   at org.jetbrains.java.decompiler.modules.decompiler.vars.VarDefinitionHelper.iterateClashingExprent(VarDefinitionHelper.java:1672)
   //   at org.jetbrains.java.decompiler.modules.decompiler.vars.VarDefinitionHelper.iterateClashingNames(VarDefinitionHelper.java:1492)
   //   at org.jetbrains.java.decompiler.modules.decompiler.vars.VarDefinitionHelper.iterateClashingNames(VarDefinitionHelper.java:1541)
   //   at org.jetbrains.java.decompiler.modules.decompiler.vars.VarDefinitionHelper.iterateClashingExprent(VarDefinitionHelper.java:1672)
   //   at org.jetbrains.java.decompiler.modules.decompiler.vars.VarDefinitionHelper.iterateClashingNames(VarDefinitionHelper.java:1492)
   //   at org.jetbrains.java.decompiler.modules.decompiler.vars.VarDefinitionHelper.iterateClashingNames(VarDefinitionHelper.java:1541)
   //   at org.jetbrains.java.decompiler.modules.decompiler.vars.VarDefinitionHelper.iterateClashingExprent(VarDefinitionHelper.java:1672)
   //   at org.jetbrains.java.decompiler.modules.decompiler.vars.VarDefinitionHelper.iterateClashingNames(VarDefinitionHelper.java:1492)
   //   at org.jetbrains.java.decompiler.modules.decompiler.vars.VarDefinitionHelper.iterateClashingNames(VarDefinitionHelper.java:1541)
   //   at org.jetbrains.java.decompiler.modules.decompiler.vars.VarDefinitionHelper.iterateClashingExprent(VarDefinitionHelper.java:1672)
   //   at org.jetbrains.java.decompiler.modules.decompiler.vars.VarDefinitionHelper.iterateClashingNames(VarDefinitionHelper.java:1492)
   //   at org.jetbrains.java.decompiler.modules.decompiler.vars.VarDefinitionHelper.iterateClashingNames(VarDefinitionHelper.java:1541)
   //   at org.jetbrains.java.decompiler.modules.decompiler.vars.VarDefinitionHelper.iterateClashingExprent(VarDefinitionHelper.java:1672)
   //   at org.jetbrains.java.decompiler.modules.decompiler.vars.VarDefinitionHelper.iterateClashingNames(VarDefinitionHelper.java:1492)
   //   at org.jetbrains.java.decompiler.modules.decompiler.vars.VarDefinitionHelper.iterateClashingNames(VarDefinitionHelper.java:1541)
   //   at org.jetbrains.java.decompiler.modules.decompiler.vars.VarDefinitionHelper.iterateClashingExprent(VarDefinitionHelper.java:1672)
   //   at org.jetbrains.java.decompiler.modules.decompiler.vars.VarDefinitionHelper.iterateClashingNames(VarDefinitionHelper.java:1492)
   //   at org.jetbrains.java.decompiler.modules.decompiler.vars.VarDefinitionHelper.iterateClashingNames(VarDefinitionHelper.java:1541)
   //   at org.jetbrains.java.decompiler.modules.decompiler.vars.VarDefinitionHelper.iterateClashingExprent(VarDefinitionHelper.java:1672)
   //   at org.jetbrains.java.decompiler.modules.decompiler.vars.VarDefinitionHelper.iterateClashingNames(VarDefinitionHelper.java:1492)
   //   at org.jetbrains.java.decompiler.modules.decompiler.vars.VarDefinitionHelper.iterateClashingNames(VarDefinitionHelper.java:1541)
   //   at org.jetbrains.java.decompiler.modules.decompiler.vars.VarDefinitionHelper.iterateClashingExprent(VarDefinitionHelper.java:1672)
   //   at org.jetbrains.java.decompiler.modules.decompiler.vars.VarDefinitionHelper.iterateClashingNames(VarDefinitionHelper.java:1492)
   //   at org.jetbrains.java.decompiler.modules.decompiler.vars.VarDefinitionHelper.iterateClashingNames(VarDefinitionHelper.java:1541)
   //   at org.jetbrains.java.decompiler.modules.decompiler.vars.VarDefinitionHelper.iterateClashingExprent(VarDefinitionHelper.java:1672)
   //   at org.jetbrains.java.decompiler.modules.decompiler.vars.VarDefinitionHelper.iterateClashingNames(VarDefinitionHelper.java:1492)
   //   at org.jetbrains.java.decompiler.modules.decompiler.vars.VarDefinitionHelper.iterateClashingNames(VarDefinitionHelper.java:1541)
   //   at org.jetbrains.java.decompiler.modules.decompiler.vars.VarDefinitionHelper.iterateClashingExprent(VarDefinitionHelper.java:1672)
   //   at org.jetbrains.java.decompiler.modules.decompiler.vars.VarDefinitionHelper.iterateClashingNames(VarDefinitionHelper.java:1492)
   //   at org.jetbrains.java.decompiler.modules.decompiler.vars.VarDefinitionHelper.iterateClashingNames(VarDefinitionHelper.java:1541)
   //   at org.jetbrains.java.decompiler.modules.decompiler.vars.VarDefinitionHelper.iterateClashingExprent(VarDefinitionHelper.java:1672)
   //   at org.jetbrains.java.decompiler.modules.decompiler.vars.VarDefinitionHelper.iterateClashingNames(VarDefinitionHelper.java:1492)
   //   at org.jetbrains.java.decompiler.modules.decompiler.vars.VarDefinitionHelper.iterateClashingNames(VarDefinitionHelper.java:1541)
   //   at org.jetbrains.java.decompiler.modules.decompiler.vars.VarDefinitionHelper.iterateClashingExprent(VarDefinitionHelper.java:1672)
   //   at org.jetbrains.java.decompiler.modules.decompiler.vars.VarDefinitionHelper.iterateClashingNames(VarDefinitionHelper.java:1492)
   //   at org.jetbrains.java.decompiler.modules.decompiler.vars.VarDefinitionHelper.iterateClashingNames(VarDefinitionHelper.java:1541)
   //   at org.jetbrains.java.decompiler.modules.decompiler.vars.VarDefinitionHelper.iterateClashingExprent(VarDefinitionHelper.java:1672)
   //   at org.jetbrains.java.decompiler.modules.decompiler.vars.VarDefinitionHelper.iterateClashingNames(VarDefinitionHelper.java:1492)
   //   at org.jetbrains.java.decompiler.modules.decompiler.vars.VarDefinitionHelper.iterateClashingNames(VarDefinitionHelper.java:1541)
   //   at org.jetbrains.java.decompiler.modules.decompiler.vars.VarDefinitionHelper.iterateClashingExprent(VarDefinitionHelper.java:1672)
   //   at org.jetbrains.java.decompiler.modules.decompiler.vars.VarDefinitionHelper.iterateClashingNames(VarDefinitionHelper.java:1492)
   //   at org.jetbrains.java.decompiler.modules.decompiler.vars.VarDefinitionHelper.iterateClashingNames(VarDefinitionHelper.java:1541)
   //   at org.jetbrains.java.decompiler.modules.decompiler.vars.VarDefinitionHelper.iterateClashingExprent(VarDefinitionHelper.java:1672)
   //   at org.jetbrains.java.decompiler.modules.decompiler.vars.VarDefinitionHelper.iterateClashingNames(VarDefinitionHelper.java:1492)
   //   at org.jetbrains.java.decompiler.modules.decompiler.vars.VarDefinitionHelper.iterateClashingNames(VarDefinitionHelper.java:1541)
   //   at org.jetbrains.java.decompiler.modules.decompiler.vars.VarDefinitionHelper.iterateClashingExprent(VarDefinitionHelper.java:1672)
   //   at org.jetbrains.java.decompiler.modules.decompiler.vars.VarDefinitionHelper.iterateClashingNames(VarDefinitionHelper.java:1492)
   //   at org.jetbrains.java.decompiler.modules.decompiler.vars.VarDefinitionHelper.iterateClashingNames(VarDefinitionHelper.java:1541)
   //   at org.jetbrains.java.decompiler.modules.decompiler.vars.VarDefinitionHelper.iterateClashingExprent(VarDefinitionHelper.java:1672)
   //   at org.jetbrains.java.decompiler.modules.decompiler.vars.VarDefinitionHelper.iterateClashingNames(VarDefinitionHelper.java:1492)
   //   at org.jetbrains.java.decompiler.modules.decompiler.vars.VarDefinitionHelper.iterateClashingNames(VarDefinitionHelper.java:1541)
   //   at org.jetbrains.java.decompiler.modules.decompiler.vars.VarDefinitionHelper.iterateClashingExprent(VarDefinitionHelper.java:1672)
   //   at org.jetbrains.java.decompiler.modules.decompiler.vars.VarDefinitionHelper.iterateClashingNames(VarDefinitionHelper.java:1492)
   //   at org.jetbrains.java.decompiler.modules.decompiler.vars.VarDefinitionHelper.iterateClashingNames(VarDefinitionHelper.java:1541)
   //   at org.jetbrains.java.decompiler.modules.decompiler.vars.VarDefinitionHelper.iterateClashingExprent(VarDefinitionHelper.java:1672)
   //   at org.jetbrains.java.decompiler.modules.decompiler.vars.VarDefinitionHelper.iterateClashingNames(VarDefinitionHelper.java:1492)
   //   at org.jetbrains.java.decompiler.modules.decompiler.vars.VarDefinitionHelper.iterateClashingNames(VarDefinitionHelper.java:1541)
   //   at org.jetbrains.java.decompiler.modules.decompiler.vars.VarDefinitionHelper.iterateClashingExprent(VarDefinitionHelper.java:1672)
   //   at org.jetbrains.java.decompiler.modules.decompiler.vars.VarDefinitionHelper.iterateClashingNames(VarDefinitionHelper.java:1492)
   //   at org.jetbrains.java.decompiler.modules.decompiler.vars.VarDefinitionHelper.iterateClashingNames(VarDefinitionHelper.java:1541)
   //   at org.jetbrains.java.decompiler.modules.decompiler.vars.VarDefinitionHelper.iterateClashingExprent(VarDefinitionHelper.java:1672)
   //   at org.jetbrains.java.decompiler.modules.decompiler.vars.VarDefinitionHelper.iterateClashingNames(VarDefinitionHelper.java:1492)
   //   at org.jetbrains.java.decompiler.modules.decompiler.vars.VarDefinitionHelper.iterateClashingNames(VarDefinitionHelper.java:1541)
   //   at org.jetbrains.java.decompiler.modules.decompiler.vars.VarDefinitionHelper.iterateClashingExprent(VarDefinitionHelper.java:1672)
   //   at org.jetbrains.java.decompiler.modules.decompiler.vars.VarDefinitionHelper.iterateClashingNames(VarDefinitionHelper.java:1492)
   //   at org.jetbrains.java.decompiler.modules.decompiler.vars.VarDefinitionHelper.iterateClashingNames(VarDefinitionHelper.java:1541)
   //   at org.jetbrains.java.decompiler.modules.decompiler.vars.VarDefinitionHelper.iterateClashingExprent(VarDefinitionHelper.java:1672)
   //   at org.jetbrains.java.decompiler.modules.decompiler.vars.VarDefinitionHelper.iterateClashingNames(VarDefinitionHelper.java:1492)
   //   at org.jetbrains.java.decompiler.modules.decompiler.vars.VarDefinitionHelper.iterateClashingNames(VarDefinitionHelper.java:1541)
   //   at org.jetbrains.java.decompiler.modules.decompiler.vars.VarDefinitionHelper.iterateClashingExprent(VarDefinitionHelper.java:1672)
   //   at org.jetbrains.java.decompiler.modules.decompiler.vars.VarDefinitionHelper.iterateClashingNames(VarDefinitionHelper.java:1492)
   //   at org.jetbrains.java.decompiler.modules.decompiler.vars.VarDefinitionHelper.iterateClashingNames(VarDefinitionHelper.java:1541)
   //   at org.jetbrains.java.decompiler.modules.decompiler.vars.VarDefinitionHelper.iterateClashingExprent(VarDefinitionHelper.java:1672)
   //   at org.jetbrains.java.decompiler.modules.decompiler.vars.VarDefinitionHelper.iterateClashingNames(VarDefinitionHelper.java:1492)
   //   at org.jetbrains.java.decompiler.modules.decompiler.vars.VarDefinitionHelper.iterateClashingNames(VarDefinitionHelper.java:1541)
   //   at org.jetbrains.java.decompiler.modules.decompiler.vars.VarDefinitionHelper.iterateClashingExprent(VarDefinitionHelper.java:1672)
   //   at org.jetbrains.java.decompiler.modules.decompiler.vars.VarDefinitionHelper.iterateClashingNames(VarDefinitionHelper.java:1492)
   //   at org.jetbrains.java.decompiler.modules.decompiler.vars.VarDefinitionHelper.iterateClashingNames(VarDefinitionHelper.java:1541)
   //   at org.jetbrains.java.decompiler.modules.decompiler.vars.VarDefinitionHelper.iterateClashingExprent(VarDefinitionHelper.java:1672)
   //   at org.jetbrains.java.decompiler.modules.decompiler.vars.VarDefinitionHelper.iterateClashingNames(VarDefinitionHelper.java:1492)
   //   at org.jetbrains.java.decompiler.modules.decompiler.vars.VarDefinitionHelper.iterateClashingNames(VarDefinitionHelper.java:1541)
   //   at org.jetbrains.java.decompiler.modules.decompiler.vars.VarDefinitionHelper.iterateClashingExprent(VarDefinitionHelper.java:1672)
   //   at org.jetbrains.java.decompiler.modules.decompiler.vars.VarDefinitionHelper.iterateClashingNames(VarDefinitionHelper.java:1492)
   //   at org.jetbrains.java.decompiler.modules.decompiler.vars.VarDefinitionHelper.iterateClashingNames(VarDefinitionHelper.java:1541)
   //   at org.jetbrains.java.decompiler.modules.decompiler.vars.VarDefinitionHelper.iterateClashingExprent(VarDefinitionHelper.java:1672)
   //   at org.jetbrains.java.decompiler.modules.decompiler.vars.VarDefinitionHelper.iterateClashingNames(VarDefinitionHelper.java:1492)
   //   at org.jetbrains.java.decompiler.modules.decompiler.vars.VarDefinitionHelper.iterateClashingNames(VarDefinitionHelper.java:1541)
   //   at org.jetbrains.java.decompiler.modules.decompiler.vars.VarDefinitionHelper.iterateClashingExprent(VarDefinitionHelper.java:1672)
   //   at org.jetbrains.java.decompiler.modules.decompiler.vars.VarDefinitionHelper.iterateClashingNames(VarDefinitionHelper.java:1492)
   //   at org.jetbrains.java.decompiler.modules.decompiler.vars.VarDefinitionHelper.iterateClashingNames(VarDefinitionHelper.java:1541)
   //   at org.jetbrains.java.decompiler.modules.decompiler.vars.VarDefinitionHelper.iterateClashingExprent(VarDefinitionHelper.java:1672)
   //   at org.jetbrains.java.decompiler.modules.decompiler.vars.VarDefinitionHelper.iterateClashingNames(VarDefinitionHelper.java:1492)
   //   at org.jetbrains.java.decompiler.modules.decompiler.vars.VarDefinitionHelper.iterateClashingNames(VarDefinitionHelper.java:1541)
   //   at org.jetbrains.java.decompiler.modules.decompiler.vars.VarDefinitionHelper.iterateClashingExprent(VarDefinitionHelper.java:1672)
   //   at org.jetbrains.java.decompiler.modules.decompiler.vars.VarDefinitionHelper.iterateClashingNames(VarDefinitionHelper.java:1492)
   //   at org.jetbrains.java.decompiler.modules.decompiler.vars.VarDefinitionHelper.iterateClashingNames(VarDefinitionHelper.java:1541)
   //   at org.jetbrains.java.decompiler.modules.decompiler.vars.VarDefinitionHelper.iterateClashingExprent(VarDefinitionHelper.java:1672)
   //   at org.jetbrains.java.decompiler.modules.decompiler.vars.VarDefinitionHelper.iterateClashingNames(VarDefinitionHelper.java:1492)
   //   at org.jetbrains.java.decompiler.modules.decompiler.vars.VarDefinitionHelper.iterateClashingNames(VarDefinitionHelper.java:1541)
   //   at org.jetbrains.java.decompiler.modules.decompiler.vars.VarDefinitionHelper.iterateClashingExprent(VarDefinitionHelper.java:1672)
   //   at org.jetbrains.java.decompiler.modules.decompiler.vars.VarDefinitionHelper.iterateClashingNames(VarDefinitionHelper.java:1492)
   //   at org.jetbrains.java.decompiler.modules.decompiler.vars.VarDefinitionHelper.iterateClashingNames(VarDefinitionHelper.java:1541)
   //   at org.jetbrains.java.decompiler.modules.decompiler.vars.VarDefinitionHelper.iterateClashingExprent(VarDefinitionHelper.java:1672)
   //   at org.jetbrains.java.decompiler.modules.decompiler.vars.VarDefinitionHelper.iterateClashingNames(VarDefinitionHelper.java:1492)
   //   at org.jetbrains.java.decompiler.modules.decompiler.vars.VarDefinitionHelper.iterateClashingNames(VarDefinitionHelper.java:1541)
   //   at org.jetbrains.java.decompiler.modules.decompiler.vars.VarDefinitionHelper.iterateClashingExprent(VarDefinitionHelper.java:1672)
   //   at org.jetbrains.java.decompiler.modules.decompiler.vars.VarDefinitionHelper.iterateClashingNames(VarDefinitionHelper.java:1492)
   //   at org.jetbrains.java.decompiler.modules.decompiler.vars.VarDefinitionHelper.iterateClashingNames(VarDefinitionHelper.java:1541)
   //   at org.jetbrains.java.decompiler.modules.decompiler.vars.VarDefinitionHelper.iterateClashingExprent(VarDefinitionHelper.java:1672)
   //   at org.jetbrains.java.decompiler.modules.decompiler.vars.VarDefinitionHelper.iterateClashingNames(VarDefinitionHelper.java:1492)
   //   at org.jetbrains.java.decompiler.modules.decompiler.vars.VarDefinitionHelper.iterateClashingNames(VarDefinitionHelper.java:1541)
   //   at org.jetbrains.java.decompiler.modules.decompiler.vars.VarDefinitionHelper.iterateClashingExprent(VarDefinitionHelper.java:1672)
   //   at org.jetbrains.java.decompiler.modules.decompiler.vars.VarDefinitionHelper.iterateClashingNames(VarDefinitionHelper.java:1492)
   //   at org.jetbrains.java.decompiler.modules.decompiler.vars.VarDefinitionHelper.iterateClashingNames(VarDefinitionHelper.java:1541)
   //   at org.jetbrains.java.decompiler.modules.decompiler.vars.VarDefinitionHelper.iterateClashingExprent(VarDefinitionHelper.java:1672)
   //   at org.jetbrains.java.decompiler.modules.decompiler.vars.VarDefinitionHelper.iterateClashingNames(VarDefinitionHelper.java:1492)
   //   at org.jetbrains.java.decompiler.modules.decompiler.vars.VarDefinitionHelper.iterateClashingNames(VarDefinitionHelper.java:1541)
   //   at org.jetbrains.java.decompiler.modules.decompiler.vars.VarDefinitionHelper.iterateClashingExprent(VarDefinitionHelper.java:1672)
   //   at org.jetbrains.java.decompiler.modules.decompiler.vars.VarDefinitionHelper.iterateClashingNames(VarDefinitionHelper.java:1492)
   //   at org.jetbrains.java.decompiler.modules.decompiler.vars.VarDefinitionHelper.iterateClashingNames(VarDefinitionHelper.java:1541)
   //   at org.jetbrains.java.decompiler.modules.decompiler.vars.VarDefinitionHelper.iterateClashingExprent(VarDefinitionHelper.java:1672)
   //   at org.jetbrains.java.decompiler.modules.decompiler.vars.VarDefinitionHelper.iterateClashingNames(VarDefinitionHelper.java:1492)
   //   at org.jetbrains.java.decompiler.modules.decompiler.vars.VarDefinitionHelper.iterateClashingNames(VarDefinitionHelper.java:1541)
   //   at org.jetbrains.java.decompiler.modules.decompiler.vars.VarDefinitionHelper.iterateClashingExprent(VarDefinitionHelper.java:1672)
   //   at org.jetbrains.java.decompiler.modules.decompiler.vars.VarDefinitionHelper.iterateClashingNames(VarDefinitionHelper.java:1492)
   //   at org.jetbrains.java.decompiler.modules.decompiler.vars.VarDefinitionHelper.iterateClashingNames(VarDefinitionHelper.java:1541)
   //   at org.jetbrains.java.decompiler.modules.decompiler.vars.VarDefinitionHelper.iterateClashingExprent(VarDefinitionHelper.java:1672)
   //   at org.jetbrains.java.decompiler.modules.decompiler.vars.VarDefinitionHelper.iterateClashingNames(VarDefinitionHelper.java:1492)
   //   at org.jetbrains.java.decompiler.modules.decompiler.vars.VarDefinitionHelper.iterateClashingNames(VarDefinitionHelper.java:1541)
   //   at org.jetbrains.java.decompiler.modules.decompiler.vars.VarDefinitionHelper.iterateClashingExprent(VarDefinitionHelper.java:1672)
   //   at org.jetbrains.java.decompiler.modules.decompiler.vars.VarDefinitionHelper.iterateClashingNames(VarDefinitionHelper.java:1492)
   //   at org.jetbrains.java.decompiler.modules.decompiler.vars.VarDefinitionHelper.iterateClashingNames(VarDefinitionHelper.java:1541)
   //   at org.jetbrains.java.decompiler.modules.decompiler.vars.VarDefinitionHelper.iterateClashingExprent(VarDefinitionHelper.java:1672)
   //   at org.jetbrains.java.decompiler.modules.decompiler.vars.VarDefinitionHelper.iterateClashingNames(VarDefinitionHelper.java:1492)
   //   at org.jetbrains.java.decompiler.modules.decompiler.vars.VarDefinitionHelper.iterateClashingNames(VarDefinitionHelper.java:1541)
   //   at org.jetbrains.java.decompiler.modules.decompiler.vars.VarDefinitionHelper.iterateClashingExprent(VarDefinitionHelper.java:1672)
   //   at org.jetbrains.java.decompiler.modules.decompiler.vars.VarDefinitionHelper.iterateClashingNames(VarDefinitionHelper.java:1492)
   //   at org.jetbrains.java.decompiler.modules.decompiler.vars.VarDefinitionHelper.iterateClashingNames(VarDefinitionHelper.java:1541)
   //   at org.jetbrains.java.decompiler.modules.decompiler.vars.VarDefinitionHelper.iterateClashingExprent(VarDefinitionHelper.java:1672)
   //   at org.jetbrains.java.decompiler.modules.decompiler.vars.VarDefinitionHelper.iterateClashingNames(VarDefinitionHelper.java:1492)
   //   at org.jetbrains.java.decompiler.modules.decompiler.vars.VarDefinitionHelper.iterateClashingNames(VarDefinitionHelper.java:1541)
   //   at org.jetbrains.java.decompiler.modules.decompiler.vars.VarDefinitionHelper.iterateClashingExprent(VarDefinitionHelper.java:1672)
   //   at org.jetbrains.java.decompiler.modules.decompiler.vars.VarDefinitionHelper.iterateClashingNames(VarDefinitionHelper.java:1492)
   //   at org.jetbrains.java.decompiler.modules.decompiler.vars.VarDefinitionHelper.iterateClashingNames(VarDefinitionHelper.java:1541)
   //   at org.jetbrains.java.decompiler.modules.decompiler.vars.VarDefinitionHelper.iterateClashingExprent(VarDefinitionHelper.java:1672)
   //   at org.jetbrains.java.decompiler.modules.decompiler.vars.VarDefinitionHelper.iterateClashingNames(VarDefinitionHelper.java:1492)
   //   at org.jetbrains.java.decompiler.modules.decompiler.vars.VarDefinitionHelper.iterateClashingNames(VarDefinitionHelper.java:1541)
   //   at org.jetbrains.java.decompiler.modules.decompiler.vars.VarDefinitionHelper.iterateClashingExprent(VarDefinitionHelper.java:1672)
   //   at org.jetbrains.java.decompiler.modules.decompiler.vars.VarDefinitionHelper.iterateClashingNames(VarDefinitionHelper.java:1492)
   //   at org.jetbrains.java.decompiler.modules.decompiler.vars.VarDefinitionHelper.iterateClashingNames(VarDefinitionHelper.java:1541)
   //   at org.jetbrains.java.decompiler.modules.decompiler.vars.VarDefinitionHelper.iterateClashingExprent(VarDefinitionHelper.java:1672)
   //   at org.jetbrains.java.decompiler.modules.decompiler.vars.VarDefinitionHelper.iterateClashingNames(VarDefinitionHelper.java:1492)
   //   at org.jetbrains.java.decompiler.modules.decompiler.vars.VarDefinitionHelper.iterateClashingNames(VarDefinitionHelper.java:1541)
   //   at org.jetbrains.java.decompiler.modules.decompiler.vars.VarDefinitionHelper.iterateClashingExprent(VarDefinitionHelper.java:1672)
   //   at org.jetbrains.java.decompiler.modules.decompiler.vars.VarDefinitionHelper.iterateClashingNames(VarDefinitionHelper.java:1492)
   //   at org.jetbrains.java.decompiler.modules.decompiler.vars.VarDefinitionHelper.iterateClashingNames(VarDefinitionHelper.java:1541)
   //   at org.jetbrains.java.decompiler.modules.decompiler.vars.VarDefinitionHelper.iterateClashingExprent(VarDefinitionHelper.java:1672)
   //   at org.jetbrains.java.decompiler.modules.decompiler.vars.VarDefinitionHelper.iterateClashingNames(VarDefinitionHelper.java:1492)
   //   at org.jetbrains.java.decompiler.modules.decompiler.vars.VarDefinitionHelper.iterateClashingNames(VarDefinitionHelper.java:1541)
   //   at org.jetbrains.java.decompiler.modules.decompiler.vars.VarDefinitionHelper.iterateClashingExprent(VarDefinitionHelper.java:1672)
   //   at org.jetbrains.java.decompiler.modules.decompiler.vars.VarDefinitionHelper.iterateClashingNames(VarDefinitionHelper.java:1492)
   //   at org.jetbrains.java.decompiler.modules.decompiler.vars.VarDefinitionHelper.iterateClashingNames(VarDefinitionHelper.java:1541)
   //   at org.jetbrains.java.decompiler.modules.decompiler.vars.VarDefinitionHelper.iterateClashingExprent(VarDefinitionHelper.java:1672)
   //   at org.jetbrains.java.decompiler.modules.decompiler.vars.VarDefinitionHelper.iterateClashingNames(VarDefinitionHelper.java:1492)
   //   at org.jetbrains.java.decompiler.modules.decompiler.vars.VarDefinitionHelper.iterateClashingNames(VarDefinitionHelper.java:1541)
   //   at org.jetbrains.java.decompiler.modules.decompiler.vars.VarDefinitionHelper.iterateClashingExprent(VarDefinitionHelper.java:1672)
   //   at org.jetbrains.java.decompiler.modules.decompiler.vars.VarDefinitionHelper.iterateClashingNames(VarDefinitionHelper.java:1492)
   //   at org.jetbrains.java.decompiler.modules.decompiler.vars.VarDefinitionHelper.iterateClashingNames(VarDefinitionHelper.java:1541)
   //   at org.jetbrains.java.decompiler.modules.decompiler.vars.VarDefinitionHelper.iterateClashingExprent(VarDefinitionHelper.java:1672)
   //   at org.jetbrains.java.decompiler.modules.decompiler.vars.VarDefinitionHelper.iterateClashingNames(VarDefinitionHelper.java:1492)
   //   at org.jetbrains.java.decompiler.modules.decompiler.vars.VarDefinitionHelper.iterateClashingNames(VarDefinitionHelper.java:1541)
   //   at org.jetbrains.java.decompiler.modules.decompiler.vars.VarDefinitionHelper.iterateClashingExprent(VarDefinitionHelper.java:1672)
   //   at org.jetbrains.java.decompiler.modules.decompiler.vars.VarDefinitionHelper.iterateClashingNames(VarDefinitionHelper.java:1492)
   //   at org.jetbrains.java.decompiler.modules.decompiler.vars.VarDefinitionHelper.iterateClashingNames(VarDefinitionHelper.java:1541)
   //   at org.jetbrains.java.decompiler.modules.decompiler.vars.VarDefinitionHelper.iterateClashingExprent(VarDefinitionHelper.java:1672)
   //   at org.jetbrains.java.decompiler.modules.decompiler.vars.VarDefinitionHelper.iterateClashingNames(VarDefinitionHelper.java:1492)
   //   at org.jetbrains.java.decompiler.modules.decompiler.vars.VarDefinitionHelper.iterateClashingNames(VarDefinitionHelper.java:1541)
   //   at org.jetbrains.java.decompiler.modules.decompiler.vars.VarDefinitionHelper.iterateClashingExprent(VarDefinitionHelper.java:1672)
   //   at org.jetbrains.java.decompiler.modules.decompiler.vars.VarDefinitionHelper.iterateClashingNames(VarDefinitionHelper.java:1492)
   //   at org.jetbrains.java.decompiler.modules.decompiler.vars.VarDefinitionHelper.iterateClashingNames(VarDefinitionHelper.java:1541)
   //   at org.jetbrains.java.decompiler.modules.decompiler.vars.VarDefinitionHelper.iterateClashingExprent(VarDefinitionHelper.java:1672)
   //   at org.jetbrains.java.decompiler.modules.decompiler.vars.VarDefinitionHelper.iterateClashingNames(VarDefinitionHelper.java:1492)
   //   at org.jetbrains.java.decompiler.modules.decompiler.vars.VarDefinitionHelper.iterateClashingNames(VarDefinitionHelper.java:1541)
   //   at org.jetbrains.java.decompiler.modules.decompiler.vars.VarDefinitionHelper.iterateClashingExprent(VarDefinitionHelper.java:1672)
   //   at org.jetbrains.java.decompiler.modules.decompiler.vars.VarDefinitionHelper.iterateClashingNames(VarDefinitionHelper.java:1492)
   //   at org.jetbrains.java.decompiler.modules.decompiler.vars.VarDefinitionHelper.iterateClashingNames(VarDefinitionHelper.java:1541)
   //   at org.jetbrains.java.decompiler.modules.decompiler.vars.VarDefinitionHelper.iterateClashingExprent(VarDefinitionHelper.java:1672)
   //   at org.jetbrains.java.decompiler.modules.decompiler.vars.VarDefinitionHelper.iterateClashingNames(VarDefinitionHelper.java:1492)
   //   at org.jetbrains.java.decompiler.modules.decompiler.vars.VarDefinitionHelper.iterateClashingNames(VarDefinitionHelper.java:1541)
   //   at org.jetbrains.java.decompiler.modules.decompiler.vars.VarDefinitionHelper.iterateClashingExprent(VarDefinitionHelper.java:1672)
   //   at org.jetbrains.java.decompiler.modules.decompiler.vars.VarDefinitionHelper.iterateClashingNames(VarDefinitionHelper.java:1492)
   //   at org.jetbrains.java.decompiler.modules.decompiler.vars.VarDefinitionHelper.iterateClashingNames(VarDefinitionHelper.java:1541)
   //   at org.jetbrains.java.decompiler.modules.decompiler.vars.VarDefinitionHelper.iterateClashingExprent(VarDefinitionHelper.java:1672)
   //   at org.jetbrains.java.decompiler.modules.decompiler.vars.VarDefinitionHelper.iterateClashingNames(VarDefinitionHelper.java:1492)
   //   at org.jetbrains.java.decompiler.modules.decompiler.vars.VarDefinitionHelper.iterateClashingNames(VarDefinitionHelper.java:1541)
   //   at org.jetbrains.java.decompiler.modules.decompiler.vars.VarDefinitionHelper.iterateClashingExprent(VarDefinitionHelper.java:1672)
   //   at org.jetbrains.java.decompiler.modules.decompiler.vars.VarDefinitionHelper.iterateClashingNames(VarDefinitionHelper.java:1492)
   //   at org.jetbrains.java.decompiler.modules.decompiler.vars.VarDefinitionHelper.iterateClashingNames(VarDefinitionHelper.java:1541)
   //   at org.jetbrains.java.decompiler.modules.decompiler.vars.VarDefinitionHelper.iterateClashingExprent(VarDefinitionHelper.java:1672)
   //   at org.jetbrains.java.decompiler.modules.decompiler.vars.VarDefinitionHelper.iterateClashingNames(VarDefinitionHelper.java:1492)
   //   at org.jetbrains.java.decompiler.modules.decompiler.vars.VarDefinitionHelper.iterateClashingNames(VarDefinitionHelper.java:1541)
   //   at org.jetbrains.java.decompiler.modules.decompiler.vars.VarDefinitionHelper.iterateClashingExprent(VarDefinitionHelper.java:1672)
   //   at org.jetbrains.java.decompiler.modules.decompiler.vars.VarDefinitionHelper.iterateClashingNames(VarDefinitionHelper.java:1492)
   //   at org.jetbrains.java.decompiler.modules.decompiler.vars.VarDefinitionHelper.iterateClashingNames(VarDefinitionHelper.java:1541)
   //   at org.jetbrains.java.decompiler.modules.decompiler.vars.VarDefinitionHelper.iterateClashingExprent(VarDefinitionHelper.java:1672)
   //   at org.jetbrains.java.decompiler.modules.decompiler.vars.VarDefinitionHelper.iterateClashingNames(VarDefinitionHelper.java:1492)
   //   at org.jetbrains.java.decompiler.modules.decompiler.vars.VarDefinitionHelper.iterateClashingNames(VarDefinitionHelper.java:1541)
   //   at org.jetbrains.java.decompiler.modules.decompiler.vars.VarDefinitionHelper.iterateClashingExprent(VarDefinitionHelper.java:1672)
   //   at org.jetbrains.java.decompiler.modules.decompiler.vars.VarDefinitionHelper.iterateClashingNames(VarDefinitionHelper.java:1492)
   //   at org.jetbrains.java.decompiler.modules.decompiler.vars.VarDefinitionHelper.iterateClashingNames(VarDefinitionHelper.java:1541)
   //   at org.jetbrains.java.decompiler.modules.decompiler.vars.VarDefinitionHelper.iterateClashingExprent(VarDefinitionHelper.java:1672)
   //   at org.jetbrains.java.decompiler.modules.decompiler.vars.VarDefinitionHelper.iterateClashingNames(VarDefinitionHelper.java:1492)
   //   at org.jetbrains.java.decompiler.modules.decompiler.vars.VarDefinitionHelper.iterateClashingNames(VarDefinitionHelper.java:1541)
   //   at org.jetbrains.java.decompiler.modules.decompiler.vars.VarDefinitionHelper.iterateClashingExprent(VarDefinitionHelper.java:1672)
   //   at org.jetbrains.java.decompiler.modules.decompiler.vars.VarDefinitionHelper.iterateClashingNames(VarDefinitionHelper.java:1492)
   //   at org.jetbrains.java.decompiler.modules.decompiler.vars.VarDefinitionHelper.iterateClashingNames(VarDefinitionHelper.java:1541)
   //   at org.jetbrains.java.decompiler.modules.decompiler.vars.VarDefinitionHelper.iterateClashingExprent(VarDefinitionHelper.java:1672)
   //   at org.jetbrains.java.decompiler.modules.decompiler.vars.VarDefinitionHelper.iterateClashingNames(VarDefinitionHelper.java:1492)
   //   at org.jetbrains.java.decompiler.modules.decompiler.vars.VarDefinitionHelper.iterateClashingNames(VarDefinitionHelper.java:1541)
   //   at org.jetbrains.java.decompiler.modules.decompiler.vars.VarDefinitionHelper.iterateClashingExprent(VarDefinitionHelper.java:1672)
   //   at org.jetbrains.java.decompiler.modules.decompiler.vars.VarDefinitionHelper.iterateClashingNames(VarDefinitionHelper.java:1492)
   //   at org.jetbrains.java.decompiler.modules.decompiler.vars.VarDefinitionHelper.iterateClashingNames(VarDefinitionHelper.java:1541)
   //   at org.jetbrains.java.decompiler.modules.decompiler.vars.VarDefinitionHelper.iterateClashingExprent(VarDefinitionHelper.java:1672)
   //   at org.jetbrains.java.decompiler.modules.decompiler.vars.VarDefinitionHelper.iterateClashingNames(VarDefinitionHelper.java:1492)
   //   at org.jetbrains.java.decompiler.modules.decompiler.vars.VarDefinitionHelper.iterateClashingNames(VarDefinitionHelper.java:1541)
   //   at org.jetbrains.java.decompiler.modules.decompiler.vars.VarDefinitionHelper.iterateClashingExprent(VarDefinitionHelper.java:1672)
   //   at org.jetbrains.java.decompiler.modules.decompiler.vars.VarDefinitionHelper.iterateClashingNames(VarDefinitionHelper.java:1492)
   //   at org.jetbrains.java.decompiler.modules.decompiler.vars.VarDefinitionHelper.iterateClashingNames(VarDefinitionHelper.java:1541)
   //   at org.jetbrains.java.decompiler.modules.decompiler.vars.VarDefinitionHelper.iterateClashingExprent(VarDefinitionHelper.java:1672)
   //   at org.jetbrains.java.decompiler.modules.decompiler.vars.VarDefinitionHelper.iterateClashingNames(VarDefinitionHelper.java:1492)
   //   at org.jetbrains.java.decompiler.modules.decompiler.vars.VarDefinitionHelper.iterateClashingNames(VarDefinitionHelper.java:1541)
   //   at org.jetbrains.java.decompiler.modules.decompiler.vars.VarDefinitionHelper.iterateClashingExprent(VarDefinitionHelper.java:1672)
   //   at org.jetbrains.java.decompiler.modules.decompiler.vars.VarDefinitionHelper.iterateClashingNames(VarDefinitionHelper.java:1492)
   //   at org.jetbrains.java.decompiler.modules.decompiler.vars.VarDefinitionHelper.iterateClashingNames(VarDefinitionHelper.java:1541)
   //   at org.jetbrains.java.decompiler.modules.decompiler.vars.VarDefinitionHelper.iterateClashingExprent(VarDefinitionHelper.java:1672)
   //   at org.jetbrains.java.decompiler.modules.decompiler.vars.VarDefinitionHelper.iterateClashingNames(VarDefinitionHelper.java:1492)
   //   at org.jetbrains.java.decompiler.modules.decompiler.vars.VarDefinitionHelper.iterateClashingNames(VarDefinitionHelper.java:1541)
   //   at org.jetbrains.java.decompiler.modules.decompiler.vars.VarDefinitionHelper.iterateClashingExprent(VarDefinitionHelper.java:1672)
   //   at org.jetbrains.java.decompiler.modules.decompiler.vars.VarDefinitionHelper.iterateClashingNames(VarDefinitionHelper.java:1492)
   //   at org.jetbrains.java.decompiler.modules.decompiler.vars.VarDefinitionHelper.iterateClashingNames(VarDefinitionHelper.java:1541)
   //   at org.jetbrains.java.decompiler.modules.decompiler.vars.VarDefinitionHelper.iterateClashingExprent(VarDefinitionHelper.java:1672)
   //   at org.jetbrains.java.decompiler.modules.decompiler.vars.VarDefinitionHelper.iterateClashingNames(VarDefinitionHelper.java:1492)
   //   at org.jetbrains.java.decompiler.modules.decompiler.vars.VarDefinitionHelper.iterateClashingNames(VarDefinitionHelper.java:1541)
   //   at org.jetbrains.java.decompiler.modules.decompiler.vars.VarDefinitionHelper.iterateClashingExprent(VarDefinitionHelper.java:1672)
   //   at org.jetbrains.java.decompiler.modules.decompiler.vars.VarDefinitionHelper.iterateClashingNames(VarDefinitionHelper.java:1492)
   //   at org.jetbrains.java.decompiler.modules.decompiler.vars.VarDefinitionHelper.iterateClashingNames(VarDefinitionHelper.java:1541)
   //   at org.jetbrains.java.decompiler.modules.decompiler.vars.VarDefinitionHelper.iterateClashingExprent(VarDefinitionHelper.java:1672)
   //   at org.jetbrains.java.decompiler.modules.decompiler.vars.VarDefinitionHelper.iterateClashingNames(VarDefinitionHelper.java:1492)
   //   at org.jetbrains.java.decompiler.modules.decompiler.vars.VarDefinitionHelper.iterateClashingNames(VarDefinitionHelper.java:1541)
   //   at org.jetbrains.java.decompiler.modules.decompiler.vars.VarDefinitionHelper.iterateClashingExprent(VarDefinitionHelper.java:1672)
   //   at org.jetbrains.java.decompiler.modules.decompiler.vars.VarDefinitionHelper.iterateClashingNames(VarDefinitionHelper.java:1492)
   //   at org.jetbrains.java.decompiler.modules.decompiler.vars.VarDefinitionHelper.iterateClashingNames(VarDefinitionHelper.java:1541)
   //   at org.jetbrains.java.decompiler.modules.decompiler.vars.VarDefinitionHelper.iterateClashingExprent(VarDefinitionHelper.java:1672)
   //   at org.jetbrains.java.decompiler.modules.decompiler.vars.VarDefinitionHelper.iterateClashingNames(VarDefinitionHelper.java:1492)
   //   at org.jetbrains.java.decompiler.modules.decompiler.vars.VarDefinitionHelper.iterateClashingNames(VarDefinitionHelper.java:1541)
   //   at org.jetbrains.java.decompiler.modules.decompiler.vars.VarDefinitionHelper.iterateClashingExprent(VarDefinitionHelper.java:1672)
   //   at org.jetbrains.java.decompiler.modules.decompiler.vars.VarDefinitionHelper.iterateClashingNames(VarDefinitionHelper.java:1492)
   //   at org.jetbrains.java.decompiler.modules.decompiler.vars.VarDefinitionHelper.iterateClashingNames(VarDefinitionHelper.java:1541)
   //   at org.jetbrains.java.decompiler.modules.decompiler.vars.VarDefinitionHelper.iterateClashingExprent(VarDefinitionHelper.java:1672)
   //   at org.jetbrains.java.decompiler.modules.decompiler.vars.VarDefinitionHelper.iterateClashingNames(VarDefinitionHelper.java:1492)
   //   at org.jetbrains.java.decompiler.modules.decompiler.vars.VarDefinitionHelper.iterateClashingNames(VarDefinitionHelper.java:1541)
   //   at org.jetbrains.java.decompiler.modules.decompiler.vars.VarDefinitionHelper.iterateClashingExprent(VarDefinitionHelper.java:1672)
   //   at org.jetbrains.java.decompiler.modules.decompiler.vars.VarDefinitionHelper.iterateClashingNames(VarDefinitionHelper.java:1492)
   //   at org.jetbrains.java.decompiler.modules.decompiler.vars.VarDefinitionHelper.iterateClashingNames(VarDefinitionHelper.java:1541)
   //   at org.jetbrains.java.decompiler.modules.decompiler.vars.VarDefinitionHelper.iterateClashingExprent(VarDefinitionHelper.java:1672)
   //   at org.jetbrains.java.decompiler.modules.decompiler.vars.VarDefinitionHelper.iterateClashingNames(VarDefinitionHelper.java:1492)
   //   at org.jetbrains.java.decompiler.modules.decompiler.vars.VarDefinitionHelper.iterateClashingNames(VarDefinitionHelper.java:1541)
   //   at org.jetbrains.java.decompiler.modules.decompiler.vars.VarDefinitionHelper.iterateClashingExprent(VarDefinitionHelper.java:1672)
   //   at org.jetbrains.java.decompiler.modules.decompiler.vars.VarDefinitionHelper.iterateClashingNames(VarDefinitionHelper.java:1492)
   //   at org.jetbrains.java.decompiler.modules.decompiler.vars.VarDefinitionHelper.iterateClashingNames(VarDefinitionHelper.java:1541)
   //   at org.jetbrains.java.decompiler.modules.decompiler.vars.VarDefinitionHelper.iterateClashingExprent(VarDefinitionHelper.java:1672)
   //   at org.jetbrains.java.decompiler.modules.decompiler.vars.VarDefinitionHelper.iterateClashingNames(VarDefinitionHelper.java:1492)
   //   at org.jetbrains.java.decompiler.modules.decompiler.vars.VarDefinitionHelper.iterateClashingNames(VarDefinitionHelper.java:1541)
   //   at org.jetbrains.java.decompiler.modules.decompiler.vars.VarDefinitionHelper.iterateClashingExprent(VarDefinitionHelper.java:1672)
   //   at org.jetbrains.java.decompiler.modules.decompiler.vars.VarDefinitionHelper.iterateClashingNames(VarDefinitionHelper.java:1492)
   //   at org.jetbrains.java.decompiler.modules.decompiler.vars.VarDefinitionHelper.iterateClashingNames(VarDefinitionHelper.java:1541)
   //   at org.jetbrains.java.decompiler.modules.decompiler.vars.VarDefinitionHelper.iterateClashingExprent(VarDefinitionHelper.java:1672)
   //   at org.jetbrains.java.decompiler.modules.decompiler.vars.VarDefinitionHelper.iterateClashingNames(VarDefinitionHelper.java:1492)
   //   at org.jetbrains.java.decompiler.modules.decompiler.vars.VarDefinitionHelper.iterateClashingNames(VarDefinitionHelper.java:1541)
   //   at org.jetbrains.java.decompiler.modules.decompiler.vars.VarDefinitionHelper.iterateClashingExprent(VarDefinitionHelper.java:1672)
   //   at org.jetbrains.java.decompiler.modules.decompiler.vars.VarDefinitionHelper.iterateClashingNames(VarDefinitionHelper.java:1492)
   //   at org.jetbrains.java.decompiler.modules.decompiler.vars.VarDefinitionHelper.iterateClashingNames(VarDefinitionHelper.java:1541)
   //   at org.jetbrains.java.decompiler.modules.decompiler.vars.VarDefinitionHelper.iterateClashingExprent(VarDefinitionHelper.java:1672)
   //   at org.jetbrains.java.decompiler.modules.decompiler.vars.VarDefinitionHelper.iterateClashingNames(VarDefinitionHelper.java:1492)
   //   at org.jetbrains.java.decompiler.modules.decompiler.vars.VarDefinitionHelper.iterateClashingNames(VarDefinitionHelper.java:1541)
   //   at org.jetbrains.java.decompiler.modules.decompiler.vars.VarDefinitionHelper.iterateClashingExprent(VarDefinitionHelper.java:1672)
   //   at org.jetbrains.java.decompiler.modules.decompiler.vars.VarDefinitionHelper.iterateClashingNames(VarDefinitionHelper.java:1492)
   //   at org.jetbrains.java.decompiler.modules.decompiler.vars.VarDefinitionHelper.iterateClashingNames(VarDefinitionHelper.java:1541)
   //   at org.jetbrains.java.decompiler.modules.decompiler.vars.VarDefinitionHelper.iterateClashingExprent(VarDefinitionHelper.java:1672)
   //   at org.jetbrains.java.decompiler.modules.decompiler.vars.VarDefinitionHelper.iterateClashingNames(VarDefinitionHelper.java:1492)
   //   at org.jetbrains.java.decompiler.modules.decompiler.vars.VarDefinitionHelper.iterateClashingNames(VarDefinitionHelper.java:1541)
   //   at org.jetbrains.java.decompiler.modules.decompiler.vars.VarDefinitionHelper.iterateClashingExprent(VarDefinitionHelper.java:1672)
   //   at org.jetbrains.java.decompiler.modules.decompiler.vars.VarDefinitionHelper.iterateClashingNames(VarDefinitionHelper.java:1492)
   //   at org.jetbrains.java.decompiler.modules.decompiler.vars.VarDefinitionHelper.iterateClashingNames(VarDefinitionHelper.java:1541)
   //   at org.jetbrains.java.decompiler.modules.decompiler.vars.VarDefinitionHelper.iterateClashingExprent(VarDefinitionHelper.java:1672)
   //   at org.jetbrains.java.decompiler.modules.decompiler.vars.VarDefinitionHelper.iterateClashingNames(VarDefinitionHelper.java:1492)
   //   at org.jetbrains.java.decompiler.modules.decompiler.vars.VarDefinitionHelper.iterateClashingNames(VarDefinitionHelper.java:1541)
   //   at org.jetbrains.java.decompiler.modules.decompiler.vars.VarDefinitionHelper.iterateClashingExprent(VarDefinitionHelper.java:1672)
   //   at org.jetbrains.java.decompiler.modules.decompiler.vars.VarDefinitionHelper.iterateClashingNames(VarDefinitionHelper.java:1492)
   //   at org.jetbrains.java.decompiler.modules.decompiler.vars.VarDefinitionHelper.iterateClashingNames(VarDefinitionHelper.java:1541)
   //   at org.jetbrains.java.decompiler.modules.decompiler.vars.VarDefinitionHelper.iterateClashingExprent(VarDefinitionHelper.java:1672)
   //   at org.jetbrains.java.decompiler.modules.decompiler.vars.VarDefinitionHelper.iterateClashingNames(VarDefinitionHelper.java:1492)
   //   at org.jetbrains.java.decompiler.modules.decompiler.vars.VarDefinitionHelper.iterateClashingNames(VarDefinitionHelper.java:1541)
   //   at org.jetbrains.java.decompiler.modules.decompiler.vars.VarDefinitionHelper.iterateClashingExprent(VarDefinitionHelper.java:1672)
   //   at org.jetbrains.java.decompiler.modules.decompiler.vars.VarDefinitionHelper.iterateClashingNames(VarDefinitionHelper.java:1492)
   //   at org.jetbrains.java.decompiler.modules.decompiler.vars.VarDefinitionHelper.iterateClashingNames(VarDefinitionHelper.java:1541)
   //   at org.jetbrains.java.decompiler.modules.decompiler.vars.VarDefinitionHelper.iterateClashingExprent(VarDefinitionHelper.java:1672)
   //   at org.jetbrains.java.decompiler.modules.decompiler.vars.VarDefinitionHelper.iterateClashingNames(VarDefinitionHelper.java:1492)
   //   at org.jetbrains.java.decompiler.modules.decompiler.vars.VarDefinitionHelper.iterateClashingNames(VarDefinitionHelper.java:1541)
   //   at org.jetbrains.java.decompiler.modules.decompiler.vars.VarDefinitionHelper.iterateClashingExprent(VarDefinitionHelper.java:1672)
   //   at org.jetbrains.java.decompiler.modules.decompiler.vars.VarDefinitionHelper.iterateClashingNames(VarDefinitionHelper.java:1492)
   //   at org.jetbrains.java.decompiler.modules.decompiler.vars.VarDefinitionHelper.iterateClashingNames(VarDefinitionHelper.java:1541)
   //   at org.jetbrains.java.decompiler.modules.decompiler.vars.VarDefinitionHelper.iterateClashingExprent(VarDefinitionHelper.java:1672)
   //   at org.jetbrains.java.decompiler.modules.decompiler.vars.VarDefinitionHelper.iterateClashingNames(VarDefinitionHelper.java:1492)
   //   at org.jetbrains.java.decompiler.modules.decompiler.vars.VarDefinitionHelper.iterateClashingNames(VarDefinitionHelper.java:1541)
   //   at org.jetbrains.java.decompiler.modules.decompiler.vars.VarDefinitionHelper.iterateClashingExprent(VarDefinitionHelper.java:1672)
   //   at org.jetbrains.java.decompiler.modules.decompiler.vars.VarDefinitionHelper.iterateClashingNames(VarDefinitionHelper.java:1492)
   //   at org.jetbrains.java.decompiler.modules.decompiler.vars.VarDefinitionHelper.iterateClashingNames(VarDefinitionHelper.java:1541)
   //   at org.jetbrains.java.decompiler.modules.decompiler.vars.VarDefinitionHelper.iterateClashingExprent(VarDefinitionHelper.java:1672)
   //   at org.jetbrains.java.decompiler.modules.decompiler.vars.VarDefinitionHelper.iterateClashingNames(VarDefinitionHelper.java:1492)
   //   at org.jetbrains.java.decompiler.modules.decompiler.vars.VarDefinitionHelper.iterateClashingNames(VarDefinitionHelper.java:1541)
   //   at org.jetbrains.java.decompiler.modules.decompiler.vars.VarDefinitionHelper.iterateClashingExprent(VarDefinitionHelper.java:1672)
   //   at org.jetbrains.java.decompiler.modules.decompiler.vars.VarDefinitionHelper.iterateClashingNames(VarDefinitionHelper.java:1492)
   //   at org.jetbrains.java.decompiler.modules.decompiler.vars.VarDefinitionHelper.iterateClashingNames(VarDefinitionHelper.java:1541)
   //   at org.jetbrains.java.decompiler.modules.decompiler.vars.VarDefinitionHelper.iterateClashingExprent(VarDefinitionHelper.java:1672)
   //   at org.jetbrains.java.decompiler.modules.decompiler.vars.VarDefinitionHelper.iterateClashingNames(VarDefinitionHelper.java:1492)
   //   at org.jetbrains.java.decompiler.modules.decompiler.vars.VarDefinitionHelper.iterateClashingNames(VarDefinitionHelper.java:1541)
   //   at org.jetbrains.java.decompiler.modules.decompiler.vars.VarDefinitionHelper.iterateClashingExprent(VarDefinitionHelper.java:1672)
   //   at org.jetbrains.java.decompiler.modules.decompiler.vars.VarDefinitionHelper.iterateClashingNames(VarDefinitionHelper.java:1492)
   //   at org.jetbrains.java.decompiler.modules.decompiler.vars.VarDefinitionHelper.iterateClashingNames(VarDefinitionHelper.java:1541)
   //   at org.jetbrains.java.decompiler.modules.decompiler.vars.VarDefinitionHelper.iterateClashingExprent(VarDefinitionHelper.java:1672)
   //   at org.jetbrains.java.decompiler.modules.decompiler.vars.VarDefinitionHelper.iterateClashingNames(VarDefinitionHelper.java:1492)
   //   at org.jetbrains.java.decompiler.modules.decompiler.vars.VarDefinitionHelper.iterateClashingNames(VarDefinitionHelper.java:1541)
   ,
         var6
      );
   }

   private companion object {
      public const val FREE_SPACE_PERCENT: Double
      public final val HALF_DAY_MILLIS: Long
   }
}
