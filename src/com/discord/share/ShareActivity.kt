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
         private ReactRootView rootView;
         private ShareProps shareProps;
         final ShareActivity this$0;

         {
            super(var1, var1);
            this.this$0 = var1;
         }

         private final void updateShareProps(Intent var1) {
            if (var1 != null) {
               val var3: ShareProps.Companion = ShareProps.Companion;
               val var2: Context = this.getContext();
               val var6: ShareProps = var3.createShareProps(var1, var2);
               this.shareProps = var6;
               var var4: ShareProps = var6;
               if (var6 == null) {
                  Intrinsics.throwUninitializedPropertyAccessException("shareProps");
                  var4 = null;
               }

               val var7: java.util.List = var4.getAttachments();
               val var5: ShareActivity = this.this$0;

               for (ShareProps.Attachment var8 : var7) {
                  var5.grantUriPermission(var5.getPackageName(), Uri.parse(var8.getUri()), 1);
               }
            }
         }

         @Override
         protected ReactRootView createRootView() {
            val var2: ReactRootView = super.createRootView();
            this.rootView = var2;
            var var1: ReactRootView = var2;
            if (var2 == null) {
               Intrinsics.throwUninitializedPropertyAccessException("rootView");
               var1 = null;
            }

            return var1;
         }

         protected Bundle getLaunchOptions() {
            var var1: ShareProps = this.shareProps;
            if (this.shareProps == null) {
               Intrinsics.throwUninitializedPropertyAccessException("shareProps");
               var1 = null;
            }

            return var1.toBundle();
         }

         public void onCreate(Bundle var1) {
            this.updateShareProps(this.this$0.getIntent());
            super.onCreate(var1);
         }

         public boolean onNewIntent(Intent var1) {
            if (var1 != null) {
               this.updateShareProps(var1);
               var var3: ShareProps = null;
               var var2: ReactRootView = this.rootView;
               if (this.rootView == null) {
                  Intrinsics.throwUninitializedPropertyAccessException("rootView");
                  var2 = null;
               }

               if (this.shareProps == null) {
                  Intrinsics.throwUninitializedPropertyAccessException("shareProps");
               } else {
                  var3 = this.shareProps;
               }

               var2.setAppProperties(var3.toBundle());
            }

            return super.onNewIntent(var1);
         }
      };
   }

   public override fun getNameOfComponent(): String {
      return "Share";
   }
}
