package com.discord.chatreplay

import android.app.Activity
import android.content.ActivityNotFoundException
import android.content.Intent
import android.net.Uri
import android.os.Bundle
import android.widget.Toast
import androidx.core.content.FileProvider
import androidx.core.content.c
import java.io.File
import java.nio.file.Path
import java.util.ArrayList
import kotlin.jvm.internal.SourceDebugExtension
import kotlinx.serialization.json.Json
import pb.f

@SourceDebugExtension(["SMAP\nReplayProviderActivity.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ReplayProviderActivity.kt\ncom/discord/chatreplay/ReplayProviderActivity\n+ 2 SerialFormat.kt\nkotlinx/serialization/SerialFormatKt\n+ 3 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 4 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,111:1\n113#2:112\n1#3:113\n1557#4:114\n1628#4,3:115\n*S KotlinDebug\n*F\n+ 1 ReplayProviderActivity.kt\ncom/discord/chatreplay/ReplayProviderActivity\n*L\n30#1:112\n61#1:114\n61#1:115,3\n*E\n"])
public class ReplayProviderActivity : Activity {
   private fun getReplayFile(replayName: String): File {
      val var2: java.lang.String = this.getFilesDir().getPath();
      val var3: StringBuilder = new StringBuilder();
      var3.append(var2);
      var3.append("/rows");
      return new File(a.a(var3.toString(), new java.lang.String[0]).toString(), var1);
   }

   private fun getReplaysList(): List<Replay> {
      val var1: java.lang.String = this.getFilesDir().getPath();
      val var2: StringBuilder = new StringBuilder();
      var2.append(var1);
      var2.append("/rows");
      val var5: Path = a.a(var2.toString(), new java.lang.String[0]);
      val var8: Array<File> = new File(b.a(var5).toString()).listFiles();
      var var6: Array<File> = var8;
      if (var8 == null) {
         var6 = new File[0];
      }

      val var3: IntRange = h.N(var6);
      val var9: ArrayList = new ArrayList(CollectionsKt.v(var3, 10));
      val var11: java.util.Iterator = var3.iterator();

      while (var11.hasNext()) {
         var9.add(var6[(var11 as I).nextInt()]);
      }

      val var7: ArrayList = new ArrayList(CollectionsKt.v(var9, 10));

      for (File var10 : var9) {
         val var12: java.lang.String = var10.getName();
         var7.add(new Replay(var12, var10.lastModified()));
      }

      return var7;
   }

   private fun grantAccessToFile(toPackage: String, file: File): Uri {
      val var3: Uri = FileProvider.getUriForFile(this, "com.discord.replays", var2);
      this.grantUriPermission(var1, var3, 1);
      return var3;
   }

   protected open fun onCreate(savedInstanceState: Bundle?) {
      super.onCreate(var1);
      if (this.getIntent().getAction() == "com.discord.GET_REPLAY_LIST") {
         val var2: java.util.List = this.getReplaysList();
         val var3: Intent = new Intent();
         val var4: kotlinx.serialization.json.Json.a = Json.d;
         Json.d.a();
         var3.putExtra("INTENT_EXTRA_REPLAYS_LIST", var4.c(new f(Replay.Companion.serializer()), var2));
         this.setResult(-1, var3);
         this.finish();
      } else if (this.getIntent().getAction() == "com.discord.REQUEST_REPLAY_ACCESS") {
         val var5: Uri = this.getIntent().getData();
         val var6: java.lang.String = var5.getQueryParameter("target");
         var var8: Uri = this.getIntent().getData();
         val var9: java.lang.String = var8.getQueryParameter("toPackage");
         var8 = this.grantAccessToFile(var9, this.getReplayFile(var6));
         val var7: Intent = new Intent();
         var7.putExtra("INTENT_EXTRA_GRANTED_URI", var8);
         this.setResult(-1, var7);
         this.finish();
      }
   }

   @SourceDebugExtension(["SMAP\nReplayProviderActivity.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ReplayProviderActivity.kt\ncom/discord/chatreplay/ReplayProviderActivity$Companion\n+ 2 SerialFormat.kt\nkotlinx/serialization/SerialFormatKt\n*L\n1#1,111:1\n123#2:112\n*S KotlinDebug\n*F\n+ 1 ReplayProviderActivity.kt\ncom/discord/chatreplay/ReplayProviderActivity$Companion\n*L\n82#1:112\n*E\n"])
   public companion object {
      private const val INTENT_EXTRA_REPLAYS_LIST: String
      private const val INTENT_EXTRA_GRANTED_URI: String

      public fun getGrantedUri(intent: Intent): Uri {
         val var2: Any = c.b(var1, "INTENT_EXTRA_GRANTED_URI", Uri.class);
         return var2 as Uri;
      }

      public fun getReplaysListFromIntent(intent: Intent): List<Replay> {
         val var2: java.lang.String = var1.getStringExtra("INTENT_EXTRA_REPLAYS_LIST");
         val var3: kotlinx.serialization.json.Json.a = Json.d;
         Json.d.a();
         return var3.b(new f(Replay.Companion.serializer()), var2) as MutableList<Replay>;
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
