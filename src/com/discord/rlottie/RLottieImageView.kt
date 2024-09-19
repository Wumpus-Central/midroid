package com.discord.rlottie

import android.annotation.SuppressLint
import android.content.Context
import android.os.Build.VERSION
import android.util.AttributeSet
import android.view.Display
import android.view.View
import android.view.WindowManager
import androidx.appcompat.widget.m
import com.discord.rlottie.RLottieDrawable.PlaybackMode
import java.io.File
import java.util.HashMap
import java.util.Map.Entry
import kotlin.jvm.internal.q
import nh.x

public open class RLottieImageView : m {
   private final var layerColors: HashMap<String, Int>?
   private final var drawable: RLottieDrawable?
   private final var playbackMode: PlaybackMode
   private final var attachedToWindow: Boolean
   private final var playing: Boolean
   private final var startOnAttach: Boolean

   public constructor(context: Context) : q.i(var1, "context") {
      super(var1);
      this.playbackMode = RLottieDrawable.PlaybackMode.FREEZE;
   }

   public constructor(context: Context, attrs: AttributeSet?) : q.i(var1, "context") {
      super(var1, var2);
      this.playbackMode = RLottieDrawable.PlaybackMode.FREEZE;
   }

   public constructor(context: Context, attrs: AttributeSet?, defStyleAttr: Int = 0) : q.i(var1, "context") {
      super(var1, var2, var3);
      this.playbackMode = RLottieDrawable.PlaybackMode.FREEZE;
   }

   @SuppressLint(["AnnotateVersionCheck"])
   private fun Context.getDisplayCompat(): Display {
      val var2: Display;
      if (VERSION.SDK_INT >= 30) {
         var2 = a.a(var1);
         if (var2 == null) {
            q.s();
         }

         q.d(var2, "display!!");
      } else {
         val var3: Any = var1.getSystemService("window");
         if (var3 == null) {
            throw new x("null cannot be cast to non-null type android.view.WindowManager");
         }

         var2 = (var3 as WindowManager).getDefaultDisplay();
         q.d(var2, "(getSystemService(Contex…owManager).defaultDisplay");
      }

      return var2;
   }

   open fun `_$_clearFindViewByIdCache`() {
      if (this._$_findViewCache != null) {
         this._$_findViewCache.clear();
      }
   }

   open fun `_$_findCachedViewById`(var1: Int): View {
      if (this._$_findViewCache == null) {
         this._$_findViewCache = new HashMap();
      }

      val var3: View = this._$_findViewCache.get(var1) as View;
      var var2: View = var3;
      if (var3 == null) {
         var2 = this.findViewById(var1);
         this._$_findViewCache.put(var1, var2);
      }

      return var2;
   }

   protected open fun onAttachedToWindow() {
      super.onAttachedToWindow();
      this.attachedToWindow = true;
      if (this.playing && this.drawable != null) {
         this.drawable.start();
      }
   }

   protected open fun onDetachedFromWindow() {
      super.onDetachedFromWindow();
      this.attachedToWindow = false;
      if (this.drawable != null) {
         this.drawable.stop();
      }
   }

   public fun pauseAnimation() {
      val var1: RLottieDrawable = this.drawable;
      if (this.drawable != null) {
         this.playing = false;
         if (this.attachedToWindow) {
            if (var1 != null) {
               var1.stop();
            }
         } else {
            this.startOnAttach = false;
         }
      }
   }

   public fun playAnimation() {
      val var1: RLottieDrawable = this.drawable;
      if (this.drawable != null) {
         this.playing = true;
         if (this.attachedToWindow) {
            if (var1 != null) {
               var1.start();
            }
         } else {
            this.startOnAttach = true;
         }
      }
   }

   public fun replaceColors(colors: Array<Int>?) {
      if (this.drawable != null) {
         this.drawable.replaceColors(var1);
      }
   }

   public fun setAnimation(resId: Int, w: Int, h: Int) {
      setAnimation$default(this, var1, var2, var3, null, null, 16, null);
   }

   public fun setAnimation(
      resId: Int,
      width: Int,
      height: Int,
      colorReplacement: IntArray? = null,
      playbackMode: PlaybackMode = RLottieDrawable.PlaybackMode.LOOP
   ) {
      q.i(var5, "playbackMode");
      val var7: Context = this.getContext();
      q.d(var7, "context");
      val var6: Context = this.getContext();
      q.d(var6, "context");
      val var9: RLottieDrawable = new RLottieDrawable(
         var7, var1, java.lang.String.valueOf(var1), var2, var3, this.getDisplayCompat(var6).getRefreshRate(), false, var4
      );
      this.drawable = var9;
      this.playbackMode = var5;
      var9.setPlaybackMode(var5);
      if (this.layerColors != null) {
         if (this.drawable != null) {
            this.drawable.beginApplyLayerColors();
         }

         for (Entry var16 : this.layerColors.entrySet()) {
            val var15: java.lang.String = var16.getKey() as java.lang.String;
            var1 = (var16.getValue() as java.lang.Number).intValue();
            if (this.drawable != null) {
               this.drawable.setLayerColor(var15, var1);
            }
         }

         if (this.drawable != null) {
            this.drawable.commitApplyLayerColors();
         }
      }

      if (this.drawable != null) {
         this.drawable.setAllowDecodeSingleFrame(true);
      }

      this.setImageDrawable(this.drawable);
   }

   public fun setAnimation(context: Context, file: File, width: Int, height: Int, playbackMode: PlaybackMode = RLottieDrawable.PlaybackMode.LOOP) {
      q.i(var1, "context");
      q.i(var2, "file");
      q.i(var5, "playbackMode");
      val var6: RLottieDrawable = new RLottieDrawable(var2, var3, var4, false, true, this.getDisplayCompat(var1).getRefreshRate(), null, 64, null);
      this.drawable = var6;
      this.playbackMode = var5;
      var6.setPlaybackMode(var5);
      if (this.drawable != null) {
         this.drawable.setAllowDecodeSingleFrame(true);
      }

      this.setImageDrawable(this.drawable);
   }

   public fun setLayerColor(layer: String, color: Int) {
      q.i(var1, "layer");
      if (this.layerColors == null) {
         this.layerColors = new HashMap<>();
      }

      if (this.layerColors == null) {
         q.s();
      }

      this.layerColors.put(var1, var2);
      if (this.drawable != null) {
         this.drawable.setLayerColor(var1, var2);
      }
   }

   public fun setPlaybackMode(playbackMode: PlaybackMode) {
      q.i(var1, "playbackMode");
      this.playbackMode = var1;
      if (this.drawable != null) {
         this.drawable.setPlaybackMode(var1);
      }
   }

   public fun setProgress(progress: Float) {
      if (this.drawable != null) {
         this.drawable.setProgress(var1);
      }
   }
}
