package com.discord.sounds

import android.annotation.SuppressLint
import android.content.Context
import android.webkit.URLUtil
import com.discord.logging.Log
import com.discord.react.utilities.NativeMapExtensionsKt
import com.discord.sounds.utils.SoundExtensionsKt
import com.facebook.react.bridge.Callback
import com.facebook.react.bridge.ReactApplicationContext
import com.facebook.react.bridge.ReactContextBaseJavaModule
import com.facebook.react.bridge.ReactMethod
import java.io.File
import kotlin.jvm.functions.Function1
import kotlin.jvm.internal.q
import vj.w

public class SoundManagerModule(reactContext: ReactApplicationContext) : ReactContextBaseJavaModule {
   private final val soundManager: SoundManager

   init {
      q.h(var1, "reactContext");
      super(var1);
      this.soundManager = new SoundManager(var1);
   }

   @SuppressLint(["DiscouragedApi"])
   private fun Context.resolveRawResId(fileName: String, type: String = "raw"): Int {
      val var4: Int = var1.getResources().getIdentifier(var2, var3, var1.getPackageName());
      if (var4 > 0) {
         return var4;
      } else {
         val var5: java.lang.String = var1.getPackageName();
         val var6: StringBuilder = new StringBuilder();
         var6.append("Failed requirement, resId should not be zero - fileName: ");
         var6.append(var2);
         var6.append(", type: ");
         var6.append(var3);
         var6.append(", packageName: ");
         var6.append(var5);
         throw new IllegalArgumentException(var6.toString().toString());
      }
   }

   public override fun getName(): String {
      return "DCDSoundManager";
   }

   @ReactMethod
   public fun pause(key: Int) {
      val var2: Log = Log.INSTANCE;
      val var3: java.lang.String = SoundManager.Companion.getLogTag();
      val var4: StringBuilder = new StringBuilder();
      var4.append("Pause ");
      var4.append(var1);
      Log.i$default(var2, var3, var4.toString(), null, 4, null);
      this.soundManager.pause(var1);
   }

   @ReactMethod
   public fun play(key: Int) {
      val var3: Log = Log.INSTANCE;
      val var2: java.lang.String = SoundManager.Companion.getLogTag();
      val var4: StringBuilder = new StringBuilder();
      var4.append("Play ");
      var4.append(var1);
      Log.i$default(var3, var2, var4.toString(), null, 4, null);
      this.soundManager.play(var1);
   }

   @ReactMethod
   public fun prepare(fileName: String, usage: String?, key: Int, callback: Callback) {
      q.h(var1, "fileName");
      q.h(var4, "callback");
      val var9: Log = Log.INSTANCE;
      val var8: java.lang.String = SoundManager.Companion.getLogTag();
      val var7: StringBuilder = new StringBuilder();
      var7.append("Prepare ");
      var7.append(var1);
      var7.append(" with ");
      var7.append(var3);
      var7.append(".");
      Log.i$default(var9, var8, var7.toString(), null, 4, null);
      var var5: Byte = 5;
      if (var2 != null) {
         switch (var2.hashCode()) {
            case 103772132:
               if (!var2.equals("media")) {
                  var5 = 5;
               } else {
                  var5 = 1;
               }
               break;
            case 112386354:
               if (!var2.equals("voice")) {
                  var5 = 5;
               } else {
                  var5 = 2;
               }
               break;
            case 301372961:
               if (!var2.equals("ring_tone")) {
                  var5 = 5;
               } else {
                  var5 = 6;
               }
               break;
            case 595233003:
               var2.equals("notification");
               var5 = 5;
               break;
            default:
               var5 = 5;
         }
      }

      val var13: Int;
      if (URLUtil.isValidUrl(var1)) {
         val var16: java.lang.String = SoundExtensionsKt.getRemoteSoundFilename(var1);
         val var11: ReactApplicationContext = this.getReactApplicationContext();
         q.g(var11, "getReactApplicationContext(...)");
         val var12: File = new File(SoundExtensionsKt.getSoundsCacheDirectory(var11), var16);
         if (!var12.exists()) {
            val var14: ReactApplicationContext = this.getReactApplicationContext();
            q.g(var14, "getReactApplicationContext(...)");
            SoundExtensionsKt.fetchSound(var14, var1, this.soundManager, var3, var5, new Function1(var4) {
               final Callback $callback;

               {
                  super(1);
                  this.$callback = var1;
               }

               public final void invoke(int var1) {
                  this.$callback.invoke(null, NativeMapExtensionsKt.nativeMapOf(w.a("duration", var1), w.a("numberOfChannels", -1)));
               }
            });
            return;
         }

         var12.setLastModified(System.currentTimeMillis());
         var1 = var12.getAbsolutePath();
         var13 = null;
      } else {
         val var15: ReactApplicationContext = this.getReactApplicationContext();
         q.g(var15, "getReactApplicationContext(...)");
         var13 = resolveRawResId$default(this, var15, var1, null, 2, null);
         var1 = null;
      }

      this.soundManager.prepare(var3, var5, var13, var1, new Function1(var4) {
         final Callback $callback;

         {
            super(1);
            this.$callback = var1;
         }

         public final void invoke(int var1) {
            this.$callback.invoke(null, NativeMapExtensionsKt.nativeMapOf(w.a("duration", var1), w.a("numberOfChannels", -1)));
         }
      });
   }

   @ReactMethod
   public fun release(key: Int) {
      val var2: Log = Log.INSTANCE;
      val var3: java.lang.String = SoundManager.Companion.getLogTag();
      val var4: StringBuilder = new StringBuilder();
      var4.append("Release ");
      var4.append(var1);
      Log.i$default(var2, var3, var4.toString(), null, 4, null);
      this.soundManager.release(var1);
   }

   @ReactMethod
   public fun setCurrentTime(key: Int, value: Int) {
      val var5: Log = Log.INSTANCE;
      val var3: java.lang.String = SoundManager.Companion.getLogTag();
      val var4: StringBuilder = new StringBuilder();
      var4.append("Set current time for ");
      var4.append(var1);
      var4.append(" with value ");
      var4.append(var2);
      Log.i$default(var5, var3, var4.toString(), null, 4, null);
      this.soundManager.setCurrentTime(var1, var2);
   }

   @ReactMethod
   public fun setNumberOfLoops(key: Int, value: Int) {
      val var3: Log = Log.INSTANCE;
      val var5: java.lang.String = SoundManager.Companion.getLogTag();
      val var4: StringBuilder = new StringBuilder();
      var4.append("Set number of loops for ");
      var4.append(var1);
      var4.append(" with value ");
      var4.append(var2);
      Log.i$default(var3, var5, var4.toString(), null, 4, null);
      this.soundManager.setNumberOfLoops(var1, var2);
   }

   @ReactMethod
   public fun setPan(key: Int, value: Int) {
      val var3: Log = Log.INSTANCE;
      val var4: java.lang.String = SoundManager.Companion.getLogTag();
      val var5: StringBuilder = new StringBuilder();
      var5.append("Set pan for ");
      var5.append(var1);
      var5.append(" with value ");
      var5.append(var2);
      Log.i$default(var3, var4, var5.toString(), null, 4, null);
      this.soundManager.setPan(var1, (float)var2);
   }

   @ReactMethod
   public fun setVolume(key: Int, value: Float) {
      val var3: Log = Log.INSTANCE;
      val var4: java.lang.String = SoundManager.Companion.getLogTag();
      val var5: StringBuilder = new StringBuilder();
      var5.append("Set volume for ");
      var5.append(var1);
      var5.append(" with value ");
      var5.append(var2);
      Log.i$default(var3, var4, var5.toString(), null, 4, null);
      this.soundManager.setVolume(var1, var2);
   }

   @ReactMethod
   public fun stop(key: Int) {
      val var4: Log = Log.INSTANCE;
      val var2: java.lang.String = SoundManager.Companion.getLogTag();
      val var3: StringBuilder = new StringBuilder();
      var3.append("Stop ");
      var3.append(var1);
      Log.i$default(var4, var2, var3.toString(), null, 4, null);
      this.soundManager.stop(var1);
   }
}
