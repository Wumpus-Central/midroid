@file:SourceDebugExtension(["SMAP\nNotificationImageCache.kt\nKotlin\n*S Kotlin\n*F\n+ 1 NotificationImageCache.kt\ncom/discord/notifications/renderer/utils/NotificationImageCacheKt\n+ 2 _Arrays.kt\nkotlin/collections/ArraysKt___ArraysKt\n+ 3 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,81:1\n3829#2:82\n4344#2,2:83\n1863#3,2:85\n*S KotlinDebug\n*F\n+ 1 NotificationImageCache.kt\ncom/discord/notifications/renderer/utils/NotificationImageCacheKt\n*L\n29#1:82\n29#1:83,2\n31#1:85,2\n*E\n"])

package com.discord.notifications.renderer.utils

import android.content.Context
import android.net.Uri
import java.io.File
import java.util.ArrayList
import kotlin.coroutines.Continuation
import kotlin.jvm.functions.Function2
import kotlin.jvm.internal.SourceDebugExtension
import kotlinx.coroutines.CoroutineScope
import mc.K

public final val notificationsDir: File
   public final get() {
      return new File(var0.getCacheDir(), "notifications");
   }


private const val MAX_NOTIFICATIONS_CACHE_TTL_MILLIS: Long = 864000000L

@JvmSynthetic
fun `access$enforceNotificationsCacheTTL`(var0: File) {
   enforceNotificationsCacheTTL(var0);
}

private fun enforceNotificationsCacheTTL(directory: File) {
   if (var0.exists()) {
      val var3: Long = System.currentTimeMillis();
      val var6: Array<File> = var0.listFiles();
      if (var6 != null) {
         val var5: ArrayList = new ArrayList();
         val var2: Int = var6.length;

         for (int var1 = 0; var1 < var2; var1++) {
            var0 = var6[var1];
            if (var6[var1].isFile() && var3 - var6[var1].lastModified() > 864000000L) {
               var5.add(var0);
            }
         }

         val var8: java.util.Iterator = var5.iterator();

         while (var8.hasNext()) {
            (var8.next() as File).delete();
         }
      }
   }
}

public suspend fun storeRemoteImageViaFileProvider(context: Context, imageUrl: String): Pair<Uri, String>? {
   return mc.f.g(
      K.b(),
      new Function2<CoroutineScope, Continuation, Object>(var0, var1, null)// $VF: Couldn't be decompiled
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
   //   at org.jetbrains.java.decompiler.modules.decompiler.ExprProcessor.getCastedExprent(ExprProcessor.java:1014)
   //   at org.jetbrains.java.decompiler.modules.decompiler.exps.ExitExprent.toJava(ExitExprent.java:86)
   //   at org.jetbrains.java.decompiler.modules.decompiler.ExprProcessor.listToJava(ExprProcessor.java:891)
   //   at org.jetbrains.java.decompiler.modules.decompiler.stats.BasicBlockStatement.toJava(BasicBlockStatement.java:91)
   //   at org.jetbrains.java.decompiler.modules.decompiler.stats.RootStatement.toJava(RootStatement.java:36)
   ,
      var2
   );
}
