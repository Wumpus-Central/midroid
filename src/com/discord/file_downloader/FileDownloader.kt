package com.discord.file_downloader

import android.content.Context
import com.discord.resource_usage.DeviceResourceUsageRecorder
import ht.l
import java.io.File
import java.util.Map.Entry
import ju.g
import kotlin.coroutines.Continuation
import kotlin.jvm.functions.Function2
import kotlin.jvm.internal.SourceDebugExtension
import kotlinx.coroutines.flow.Flow
import kotlinx.coroutines.flow.FlowCollector
import okhttp3.Interceptor
import okhttp3.OkHttpClient
import okhttp3.Response
import okhttp3.Interceptor.Chain
import okhttp3.OkHttpClient.Builder
import org.jetbrains.annotations.NotNull

@SourceDebugExtension(["SMAP\nFileDownloader.kt\nKotlin\n*S Kotlin\n*F\n+ 1 FileDownloader.kt\ncom/discord/file_downloader/FileDownloader\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n+ 3 OkHttpClient.kt\nokhttp3/OkHttpClient$Builder\n*L\n1#1,88:1\n1863#2,2:89\n563#3:91\n*S KotlinDebug\n*F\n+ 1 FileDownloader.kt\ncom/discord/file_downloader/FileDownloader\n*L\n33#1:89,2\n21#1:91\n*E\n"])
public object FileDownloader {
   private final val defaultClient: OkHttpClient by l.b(new a())
      private final get() {
         return defaultClient$delegate.getValue() as OkHttpClient;
      }


   @JvmStatic
   fun `defaultClient_delegate$lambda$0`(): OkHttpClient {
      return new Builder().a(new Interceptor(DeviceResourceUsageRecorder.Companion) {
         final DeviceResourceUsageRecorder.Companion $receiver$inlined;

         {
            this.$receiver$inlined = var1;
         }

         @NotNull
         public final Response intercept(@NotNull Chain var1) {
            return this.$receiver$inlined.downloadInterceptor(var1);
         }
      }).c();
   }

   public fun downloadBlob(fileUrl: String, headers: Map<String, String> = s0.i(), client: OkHttpClient = var0.getDefaultClient()): Response {
      val var4: okhttp3.Request.Builder = new okhttp3.Request.Builder();

      for (Entry var5 : var2.entrySet()) {
         var4.a(var5.getKey() as java.lang.String, var5.getValue() as java.lang.String);
      }

      return var3.a(var4.l(var1).b()).execute();
   }

   public fun downloadFile(context: Context, fileUrl: String, fileName: String, downloadDirectory: File = var1.getCacheDir(), logErrors: Boolean = false): Flow<
         DownloadState
      > {
      return g.v(
         new Function2<FlowCollector, Continuation<? super Unit>, Object>(var4, var3, var2, var5, null)// $VF: Couldn't be decompiled
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
   
      );
   }
}
