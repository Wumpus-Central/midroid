package com.discord.chatreplay

import android.app.Activity
import android.content.ActivityNotFoundException
import android.content.Intent
import android.net.Uri
import android.os.Bundle
import android.widget.Toast
import androidx.core.content.FileProvider
import gn.f
import java.io.File
import java.nio.file.Path
import java.util.ArrayList
import kotlin.jvm.internal.q
import kotlinx.serialization.json.Json
import mj.o

public class ReplayProviderActivity : Activity {
   private fun getReplayFile(replayName: String): File {
      val var3: java.lang.String = this.getFilesDir().getPath();
      val var2: StringBuilder = new StringBuilder();
      var2.append(var3);
      var2.append("/rows");
      return new File(a.a(var2.toString(), new java.lang.String[0]).toString(), var1);
   }

   private fun getReplaysList(): List<Replay> {
      val var2: java.lang.String = this.getFilesDir().getPath();
      val var1: StringBuilder = new StringBuilder();
      var1.append(var2);
      var1.append("/rows");
      val var5: Path = a.a(var1.toString(), new java.lang.String[0]);
      q.e(var5);
      val var8: Array<File> = new File(b.a(var5).toString()).listFiles();
      var var6: Array<File> = var8;
      if (var8 == null) {
         var6 = new File[0];
      }

      val var3: IntRange = c.H(var6);
      val var9: ArrayList = new ArrayList(i.u(var3, 10));
      val var11: java.util.Iterator = var3.iterator();

      while (var11.hasNext()) {
         var9.add(var6[(var11 as o).c()]);
      }

      val var7: ArrayList = new ArrayList(i.u(var9, 10));

      for (File var12 : var9) {
         val var4: java.lang.String = var12.getName();
         q.g(var4, "getName(...)");
         var7.add(new Replay(var4, var12.lastModified()));
      }

      return var7;
   }

   private fun grantAccessToFile(toPackage: String, file: File): Uri {
      val var3: Uri = FileProvider.getUriForFile(this, "com.discord.replays", var2);
      this.grantUriPermission(var1, var3, 1);
      q.e(var3);
      return var3;
   }

   protected open fun onCreate(savedInstanceState: Bundle?) {
      super.onCreate(var1);
      if (q.c(this.getIntent().getAction(), "com.discord.GET_REPLAY_LIST")) {
         val var3: java.util.List = this.getReplaysList();
         val var4: Intent = new Intent();
         val var2: kotlinx.serialization.json.Json.a = Json.d;
         Json.d.a();
         var4.putExtra("INTENT_EXTRA_REPLAYS_LIST", var2.c(new f(Replay.Companion.serializer()), var3));
         this.setResult(-1, var4);
         this.finish();
      } else if (q.c(this.getIntent().getAction(), "com.discord.REQUEST_REPLAY_ACCESS")) {
         val var5: Uri = this.getIntent().getData();
         q.e(var5);
         val var6: java.lang.String = var5.getQueryParameter("target");
         q.e(var6);
         var var8: Uri = this.getIntent().getData();
         q.e(var8);
         val var9: java.lang.String = var8.getQueryParameter("toPackage");
         q.e(var9);
         var8 = this.grantAccessToFile(var9, this.getReplayFile(var6));
         val var7: Intent = new Intent();
         var7.putExtra("INTENT_EXTRA_GRANTED_URI", var8);
         this.setResult(-1, var7);
         this.finish();
      }
   }

   public companion object {
      private const val INTENT_EXTRA_GRANTED_URI: String
      private const val INTENT_EXTRA_REPLAYS_LIST: String

      public fun getGrantedUri(intent: Intent): Uri {
         q.h(var1, "intent");
         val var2: Any = androidx.core.content.b.b(var1, "INTENT_EXTRA_GRANTED_URI", Uri.class);
         q.e(var2);
         return var2 as Uri;
      }

      public fun getReplaysListFromIntent(intent: Intent): List<Replay> {
         q.h(var1, "intent");
         val var3: java.lang.String = var1.getStringExtra("INTENT_EXTRA_REPLAYS_LIST");
         q.e(var3);
         val var2: kotlinx.serialization.json.Json.a = Json.d;
         Json.d.a();
         return var2.b(new f(Replay.Companion.serializer()), var3) as MutableList<Replay>;
      }

      public fun requestReplayList(activity: Activity, requestCode: Int) {
         q.h(var1, "activity");
         val var3: Intent = new Intent();
         var3.setAction("com.discord.GET_REPLAY_LIST");

         try {
            var1.startActivityForResult(var3, var2);
         } catch (var4: ActivityNotFoundException) {
            Toast.makeText(var1, "Unable to fetch replay list, activity not available.", 1).show();
         }
      }

      public fun requestUriPermission(activity: Activity, replayFilename: String, requestCode: Int) {
         q.h(var1, "activity");
         q.h(var2, "replayFilename");
         val var5: Intent = new Intent();
         var5.setAction("com.discord.REQUEST_REPLAY_ACCESS");
         val var6: java.lang.String = var1.getPackageName();
         val var4: StringBuilder = new StringBuilder();
         var4.append("discord://request_replay?target=");
         var4.append(var2);
         var4.append("&toPackage=");
         var4.append(var6);
         var5.setData(Uri.parse(var4.toString()));
         var1.startActivityForResult(var5, var3);
      }
   }
}
