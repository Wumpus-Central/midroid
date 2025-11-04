package com.discord.chatreplay

import android.app.Activity
import android.content.ActivityNotFoundException
import android.content.Intent
import android.net.Uri
import android.os.Bundle
import android.widget.Toast
import androidx.core.content.FileProvider
import androidx.core.content.b
import java.io.File
import java.nio.file.Path
import java.nio.file.Paths
import java.util.ArrayList
import kotlin.jvm.internal.SourceDebugExtension
import kotlinx.serialization.json.Json
import kotlinx.serialization.json.Json.a

@SourceDebugExtension(["SMAP\nReplayProviderActivity.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ReplayProviderActivity.kt\ncom/discord/chatreplay/ReplayProviderActivity\n+ 2 SerialFormat.kt\nkotlinx/serialization/SerialFormatKt\n+ 3 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 4 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,112:1\n113#2:113\n1#3:114\n1557#4:115\n1628#4,3:116\n*S KotlinDebug\n*F\n+ 1 ReplayProviderActivity.kt\ncom/discord/chatreplay/ReplayProviderActivity\n*L\n31#1:113\n62#1:115\n62#1:116,3\n*E\n"])
public class ReplayProviderActivity : Activity {
   private fun getReplayFile(replayName: String): File {
      val var3: java.lang.String = this.getFilesDir().getPath();
      val var2: StringBuilder = new StringBuilder();
      var2.append(var3);
      var2.append("/rows");
      return new File(Paths.get(var2.toString()).toString(), var1);
   }

   private fun getReplaysList(): List<Replay> {
      val var2: java.lang.String = this.getFilesDir().getPath();
      val var1: StringBuilder = new StringBuilder();
      var1.append(var2);
      var1.append("/rows");
      val var5: Path = Paths.get(var1.toString());
      val var8: Array<File> = new File(var5.toAbsolutePath().toString()).listFiles();
      var var6: Array<File> = var8;
      if (var8 == null) {
         var6 = new File[0];
      }

      val var3: IntRange = m.a0(var6);
      val var9: ArrayList = new ArrayList(CollectionsKt.w(var3, 10));
      val var11: java.util.Iterator = var3.iterator();

      while (var11.hasNext()) {
         var9.add(var6[(var11 as q0).nextInt()]);
      }

      val var7: ArrayList = new ArrayList(CollectionsKt.w(var9, 10));

      for (File var4 : var9) {
         val var12: java.lang.String = var4.getName();
         var7.add(new Replay(var12, var4.lastModified()));
      }

      return var7;
   }

   private fun grantAccessToFile(toPackage: String, file: File): Uri {
      val var3: java.lang.String = this.getPackageName();
      val var4: StringBuilder = new StringBuilder();
      var4.append(var3);
      var4.append(".replays");
      val var5: Uri = FileProvider.getUriForFile(this, var4.toString(), var2);
      this.grantUriPermission(var1, var5, 1);
      return var5;
   }

   protected open fun onCreate(savedInstanceState: Bundle?) {
      super.onCreate(var1);
      if (this.getIntent().getAction() == "com.discord.GET_REPLAY_LIST") {
         val var3: java.util.List = this.getReplaysList();
         val var7: Intent = new Intent();
         val var11: a = Json.d;
         Json.d.a();
         var7.putExtra("INTENT_EXTRA_REPLAYS_LIST", var11.c(new av.f(Replay.Companion.serializer()), var3));
         this.setResult(-1, var7);
         this.finish();
      } else {
         if (this.getIntent().getAction() == "com.discord.REQUEST_REPLAY_ACCESS") {
            val var4: Uri = this.getIntent().getData();
            val var5: java.lang.String = var4.getQueryParameter("target");
            var var2: Uri = this.getIntent().getData();
            val var8: java.lang.String = var2.getQueryParameter("toPackage");
            var2 = this.grantAccessToFile(var8, this.getReplayFile(var5));
            val var6: Intent = new Intent();
            var6.putExtra("INTENT_EXTRA_GRANTED_URI", var2);
            this.setResult(-1, var6);
            this.finish();
         }
      }
   }

   @SourceDebugExtension(["SMAP\nReplayProviderActivity.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ReplayProviderActivity.kt\ncom/discord/chatreplay/ReplayProviderActivity$Companion\n+ 2 SerialFormat.kt\nkotlinx/serialization/SerialFormatKt\n+ 3 Uri.kt\nandroidx/core/net/UriKt\n*L\n1#1,112:1\n123#2:113\n29#3:114\n*S KotlinDebug\n*F\n+ 1 ReplayProviderActivity.kt\ncom/discord/chatreplay/ReplayProviderActivity$Companion\n*L\n83#1:113\n107#1:114\n*E\n"])
   public companion object {
      private const val INTENT_EXTRA_REPLAYS_LIST: String
      private const val INTENT_EXTRA_GRANTED_URI: String

      public fun getGrantedUri(intent: Intent): Uri {
         val var2: Any = b.b(var1, "INTENT_EXTRA_GRANTED_URI", Uri.class);
         return var2 as Uri;
      }

      public fun getReplaysListFromIntent(intent: Intent): List<Replay> {
         val var3: java.lang.String = var1.getStringExtra("INTENT_EXTRA_REPLAYS_LIST");
         val var2: a = Json.d;
         Json.d.a();
         return var2.b(new av.f(Replay.Companion.serializer()), var3) as MutableList<Replay>;
      }

      public fun requestReplayList(activity: Activity, requestCode: Int) {
         val var3: Intent = new Intent();
         var3.setAction("com.discord.GET_REPLAY_LIST");

         try {
            var1.startActivityForResult(var3, var2);
         } catch (var4: ActivityNotFoundException) {
            Toast.makeText(var1, "Unable to fetch replay list, activity not available.", 1).show();
         }
      }

      public fun requestUriPermission(activity: Activity, replayFilename: String, requestCode: Int) {
         val var4: Intent = new Intent();
         var4.setAction("com.discord.REQUEST_REPLAY_ACCESS");
         val var5: java.lang.String = var1.getPackageName();
         val var6: StringBuilder = new StringBuilder();
         var6.append("discord://request_replay?target=");
         var6.append(var2);
         var6.append("&toPackage=");
         var6.append(var5);
         var4.setData(Uri.parse(var6.toString()));
         var1.startActivityForResult(var4, var3);
      }
   }
}
