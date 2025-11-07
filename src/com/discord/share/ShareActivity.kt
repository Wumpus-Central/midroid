package com.discord.share

import android.content.Context
import android.content.Intent
import android.net.Uri
import android.os.Bundle
import com.discord.react_activities.ReactActivity
import com.discord.react_activities.ReactActivity.ActivityDelegate
import com.facebook.react.ReactRootView
import kotlin.jvm.internal.Intrinsics

public class ShareActivity : ReactActivity {
   public override fun getActivityDelegate(): ActivityDelegate {
      return new ReactActivity.ActivityDelegate(this) {
         private ShareProps shareProps;
         final ShareActivity this$0;

         {
            super(var1, var1);
            this.this$0 = var1;
         }

         private final void updateShareProps(Intent var1) {
            if (var1 != null) {
               val var2: ShareProps.Companion = ShareProps.Companion;
               val var3: Context = this.getContext();
               val var6: ShareProps = var2.createShareProps(var1, var3);
               this.shareProps = var6;
               var var4: ShareProps = var6;
               if (var6 == null) {
                  Intrinsics.throwUninitializedPropertyAccessException("shareProps");
                  var4 = null;
               }

               val var7: java.lang.Iterable = var4.getAttachments();
               val var5: ShareActivity = this.this$0;

               for (ShareProps.Attachment var9 : var7) {
                  var5.grantUriPermission(var5.getPackageName(), Uri.parse(var9.getUri()), 1);
               }
            }
         }

         @Override
         protected ReactRootView createRootView() {
            val var1: Context = this.getContext();
            val var2: com.discord.react_rootview.ReactRootView = new com.discord.react_rootview.ReactRootView(var1);
            var2.setIsFabric(this.isFabricEnabled());
            return var2;
         }

         @Override
         protected Bundle getLaunchOptions() {
            var var1: ShareProps = this.shareProps;
            if (this.shareProps == null) {
               Intrinsics.throwUninitializedPropertyAccessException("shareProps");
               var1 = null;
            }

            return var1.toBundle();
         }

         @Override
         public void onCreate(Bundle var1) {
            this.updateShareProps(this.this$0.getIntent());
            super.onCreate(var1);
         }

         @Override
         public boolean onNewIntent(Intent var1) {
            if (var1 != null) {
               this.updateShareProps(var1);
               this.this$0.finish();
               this.this$0.startActivity(var1);
            }

            return super.onNewIntent(var1);
         }
      };
   }

   public override fun getNameOfComponent(): String {
      return "Share";
   }
}
