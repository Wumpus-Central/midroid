package com.discord.share

import android.content.Context
import android.content.Intent
import android.net.Uri
import android.os.Bundle
import com.discord.react_activities.ReactActivity
import com.discord.react_activities.ReactActivity.ActivityDelegate
import kotlin.jvm.internal.q

public class ShareActivity : ReactActivity {
   public override fun getActivityDelegate(): ActivityDelegate {
      return new ReactActivity.ActivityDelegate(this) {
         private ShareProps shareProps;
         final ShareActivity this$0;

         {
            super(var1, var1);
            this.this$0 = var1;
         }

         protected Bundle getLaunchOptions() {
            var var1: ShareProps = this.shareProps;
            if (this.shareProps == null) {
               q.y("shareProps");
               var1 = null;
            }

            return var1.toBundle();
         }

         protected void onCreate(Bundle var1) {
            val var3: ShareProps.Companion = ShareProps.Companion;
            val var4: Intent = this.this$0.getIntent();
            q.g(var4, "getIntent(...)");
            val var2: Context = this.getContext();
            q.g(var2, "getContext(...)");
            val var7: ShareProps = var3.createShareProps(var4, var2);
            this.shareProps = var7;
            var var5: ShareProps = var7;
            if (var7 == null) {
               q.y("shareProps");
               var5 = null;
            }

            val var8: java.util.List = var5.getAttachments();
            val var6: ShareActivity = this.this$0;

            for (ShareProps.Attachment var10 : var8) {
               var6.grantUriPermission(var6.getPackageName(), Uri.parse(var10.getUri()), 1);
            }

            super.onCreate(var1);
         }
      };
   }

   public override fun getNameOfComponent(): String {
      return "Share";
   }
}
