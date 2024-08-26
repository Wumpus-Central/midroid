package com.discord.share

import android.content.Context
import android.content.Intent
import android.net.Uri
import android.os.Bundle
import com.discord.react_activities.ReactActivity
import com.discord.react_activities.ReactActivity.ActivityDelegate
import kotlin.jvm.internal.r

public class ShareActivity : ReactActivity {
   public open fun getActivityDelegate(): ActivityDelegate {
      return new ActivityDelegate(this) {
         private ShareProps shareProps;
         final ShareActivity this$0;

         {
            super(var1, var1);
            this.this$0 = var1;
         }

         protected Bundle getLaunchOptions() {
            var var1: ShareProps = this.shareProps;
            if (this.shareProps == null) {
               r.y("shareProps");
               var1 = null;
            }

            return var1.toBundle();
         }

         protected void onCreate(Bundle var1) {
            val var2: ShareProps.Companion = ShareProps.Companion;
            val var3: Intent = this.this$0.getIntent();
            r.g(var3, "intent");
            val var4: Context = this.getContext();
            r.g(var4, "context");
            val var7: ShareProps = var2.createShareProps(var3, var4);
            this.shareProps = var7;
            var var5: ShareProps = var7;
            if (var7 == null) {
               r.y("shareProps");
               var5 = null;
            }

            val var8: java.util.List = var5.getAttachments();
            val var6: ShareActivity = this.this$0;

            for (ShareProps.Attachment var9 : var8) {
               var6.grantUriPermission(var6.getPackageName(), Uri.parse(var9.getUri()), 1);
            }

            super.onCreate(var1);
         }
      };
   }

   public open fun getNameOfComponent(): String {
      return "Share";
   }
}
