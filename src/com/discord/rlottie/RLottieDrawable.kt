package com.discord.rlottie

import android.content.Context
import android.graphics.Bitmap
import android.graphics.Canvas
import android.graphics.Paint
import android.graphics.Rect
import android.graphics.Bitmap.Config
import android.graphics.drawable.Animatable
import android.graphics.drawable.BitmapDrawable
import android.graphics.drawable.Drawable.Callback
import android.os.Handler
import android.os.SystemClock
import android.util.Log
import android.view.View
import java.io.File
import java.lang.ref.WeakReference
import java.util.ArrayList
import java.util.HashMap
import java.util.Map.Entry
import java.util.concurrent.ExecutorService
import java.util.concurrent.LinkedBlockingQueue
import java.util.concurrent.ThreadPoolExecutor
import java.util.concurrent.TimeUnit
import kotlin.jvm.internal.r
import kotlin.jvm.internal.Ref.IntRef

public open class RLottieDrawable : BitmapDrawable, Animatable {
   public final val animatedBitmap: Bitmap?
      public final get() {
         if (this.renderingBitmap != null) {
            return this.renderingBitmap;
         } else {
            return if (this.nextRenderingBitmap != null) this.nextRenderingBitmap else null;
         }
      }


   private final var applyTransformation: Boolean
   private final var applyingLayerColors: Boolean
   private final var autoRepeatPlayCount: Int

   public final var backgroundBitmap: Bitmap?
      private set

   private final var cacheGenerateTask: Runnable?
   private final var currentFrame: Int
   private final var currentParentView: View?
   private final var customEndFrame: Int
   private final var decodeSingleFrame: Boolean
   private final var destroyWhenDone: Boolean
   private final val dstRect: Rect
   private final var forceFrameRedraw: Boolean
   private final var height: Int

   private final val isCurrentParentViewMaster: Boolean
      private final get() {
         val var4: Callback = this.getCallback();
         val var3: Boolean = true;
         if (var4 != null) {
            return true;
         } else {
            var var1: Int = this.parentViews.size();

            var var2: Boolean;
            while (true) {
               var2 = var3;
               if (var1 <= 0) {
                  break;
               }

               if (this.parentViews.get(0).get() != null) {
                  if (this.parentViews.get(0).get() === this.currentParentView) {
                     var2 = var3;
                  } else {
                     var2 = false;
                  }
                  break;
               }

               this.parentViews.remove(0);
               var1--;
            }

            return var2;
         }
      }


   private final var isRecycled: Boolean
   private final var isRunning: Boolean
   private final var lastFrameTime: Long
   private final val loadFrameRunnable: Runnable
   private final var loadFrameTask: Runnable?
   private final val metaData: IntArray
   private final var nativePtr: Long
   private final val newColorUpdates: HashMap<String, Int>
   private final var newReplaceColors: Array<Int>?
   private final var nextFrameIsLast: Boolean

   public final var nextRenderingBitmap: Bitmap?
      private set

   private final val parentViews: ArrayList<WeakReference<View?>>
   private final var pendingColorUpdates: HashMap<String, Int>
   private final var pendingReplaceColors: Array<Int>?
   private final var playbackMode: com.discord.rlottie.RLottieDrawable.PlaybackMode

   public final var renderingBitmap: Bitmap?
      private set

   private final var scaleX: Float
   private final var scaleY: Float
   private final var screenRefreshRate: Float
   private final var shouldLimitFps: Boolean
   private final var singleFrameDecoded: Boolean
   private final var timeBetweenFrames: Int
   private final val uiRunnable: Runnable
   private final val uiRunnableCacheFinished: Runnable
   private final val uiRunnableGenerateCache: Runnable
   private final val uiRunnableGenerateCacheQueue: Runnable
   private final val uiRunnableLastFrame: Runnable
   private final val uiRunnableNoFrame: Runnable
   private final var vibrationPattern: HashMap<Int, Int>?
   private final var width: Int

   open fun RLottieDrawable(var1: Context, var2: Int, var3: java.lang.String, var4: Int, var5: Int, var6: Float) {
      this(var1, var2, var3, var4, var5, var6, false, null, 192, null);
   }

   open fun RLottieDrawable(var1: Context, var2: Int, var3: java.lang.String, var4: Int, var5: Int, var6: Float, var7: Boolean) {
      this(var1, var2, var3, var4, var5, var6, var7, null, 128, null);
   }

   public constructor(context: Context,
      rawRes: Int,
      name: String,
      width: Int,
      height: Int,
      screenRefreshRate: Float,
      startDecode: Boolean = true,
      colorReplacement: IntArray? = null
   ) : r.i(var1, "context") {
      r.i(var3, "name");
      super();
      this.metaData = new int[3];
      this.customEndFrame = -1;
      this.newColorUpdates = new HashMap<>();
      this.pendingColorUpdates = new HashMap<>();
      this.playbackMode = RLottieDrawable.PlaybackMode.LOOP;
      this.screenRefreshRate = 60.0F;
      this.scaleX = 1.0F;
      this.scaleY = 1.0F;
      this.dstRect = new Rect();
      this.parentViews = new ArrayList<>();
      this.uiRunnableNoFrame = new Runnable(this) {
         final RLottieDrawable this$0;

         {
            this.this$0 = var1;
         }

         @Override
         public final void run() {
            RLottieDrawable.access$setLoadFrameTask$p(this.this$0, null);
            RLottieDrawable.access$decodeFrameFinishedInternal(this.this$0);
         }
      };
      this.uiRunnableCacheFinished = new Runnable(this) {
         final RLottieDrawable this$0;

         {
            this.this$0 = var1;
         }

         @Override
         public final void run() {
            RLottieDrawable.access$setCacheGenerateTask$p(this.this$0, null);
            RLottieDrawable.access$decodeFrameFinishedInternal(this.this$0);
         }
      };
      this.uiRunnable = new Runnable(this) {
         final RLottieDrawable this$0;

         {
            this.this$0 = var1;
         }

         @Override
         public final void run() {
            RLottieDrawable.access$setSingleFrameDecoded$p(this.this$0, true);
            RLottieDrawable.access$invalidateInternal(this.this$0);
            RLottieDrawable.access$decodeFrameFinishedInternal(this.this$0);
         }
      };
      this.uiRunnableLastFrame = new Runnable(this) {
         final RLottieDrawable this$0;

         {
            this.this$0 = var1;
         }

         @Override
         public final void run() {
            RLottieDrawable.access$setSingleFrameDecoded$p(this.this$0, true);
            RLottieDrawable.access$setRunning$p(this.this$0, false);
            RLottieDrawable.access$invalidateInternal(this.this$0);
            RLottieDrawable.access$decodeFrameFinishedInternal(this.this$0);
         }
      };
      this.uiRunnableGenerateCacheQueue = new Runnable(this) {
         final RLottieDrawable this$0;

         {
            this.this$0 = var1;
         }

         @Override
         public final void run() {
            if (RLottieDrawable.access$getCacheGenerateTask$p(this.this$0) != null) {
               RLottieDrawable.Companion.access$createCache(
                  RLottieDrawable.Companion,
                  RLottieDrawable.access$getNativePtr$p(this.this$0),
                  RLottieDrawable.access$getWidth$p(this.this$0),
                  RLottieDrawable.access$getHeight$p(this.this$0)
               );
               RLottieDrawable.access$getUiHandler$cp().post(RLottieDrawable.access$getUiRunnableCacheFinished$p(this.this$0));
            }
         }
      };
      this.uiRunnableGenerateCache = new Runnable(this) {
         final RLottieDrawable this$0;

         {
            this.this$0 = var1;
         }

         @Override
         public final void run() {
            if (!RLottieDrawable.access$isRecycled$p(this.this$0)
               && !RLottieDrawable.access$getDestroyWhenDone$p(this.this$0)
               && RLottieDrawable.access$getNativePtr$p(this.this$0) != 0L) {
               val var1: ThreadPoolExecutor = RLottieDrawable.access$getLottieCacheGenerateQueue$cp();
               if (var1 != null) {
                  val var2: Runnable = RLottieDrawable.access$getUiRunnableGenerateCacheQueue$p(this.this$0);
                  RLottieDrawable.access$setCacheGenerateTask$p(this.this$0, var2);
                  var1.execute(var2);
               }
            }

            RLottieDrawable.access$decodeFrameFinishedInternal(this.this$0);
         }
      };
      this.loadFrameRunnable = new Runnable(this) {
         final RLottieDrawable this$0;

         {
            this.this$0 = var1;
         }

         // $VF: Duplicated exception handlers to handle obfuscated exceptions
         // $VF: Could not inline inconsistent finally blocks
         // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
         @Override
         public final void run() {
            if (!RLottieDrawable.access$isRecycled$p(this.this$0)) {
               if (RLottieDrawable.access$getNativePtr$p(this.this$0) == 0L) {
                  RLottieDrawable.access$getUiHandler$cp().post(RLottieDrawable.access$getUiRunnableNoFrame$p(this.this$0));
               } else {
                  if (this.this$0.getBackgroundBitmap() == null) {
                     label165:
                     try {
                        RLottieDrawable.access$setBackgroundBitmap$p(
                           this.this$0,
                           Bitmap.createBitmap(
                              RLottieDrawable.access$getWidth$p(this.this$0), RLottieDrawable.access$getHeight$p(this.this$0), Config.ARGB_8888
                           )
                        );
                     } catch (var25: java.lang.Throwable) {
                        Log.e("RLottieDrawable", "Error Loading Frame in Runnable", var25);
                        break label165;
                     }
                  }

                  label136:
                  if (this.this$0.getBackgroundBitmap() != null) {
                     label173: {
                        var var45: java.util.Iterator;
                        try {
                           if (!(RLottieDrawable.access$getPendingColorUpdates$p(this.this$0).isEmpty() xor true)) {
                              break label173;
                           }

                           var45 = RLottieDrawable.access$getPendingColorUpdates$p(this.this$0).entrySet().iterator();
                        } catch (var23: Exception) {
                           break label173;
                        }

                        while (true) {
                           try {
                              if (!var45.hasNext()) {
                                 break;
                              }

                              val var7: Entry = var45.next() as Entry;
                              RLottieDrawable.Companion.access$setLayerColor(
                                 RLottieDrawable.Companion,
                                 RLottieDrawable.access$getNativePtr$p(this.this$0),
                                 var7.getKey() as java.lang.String,
                                 (var7.getValue() as java.lang.Number).intValue()
                              );
                           } catch (var24: Exception) {
                              break label173;
                           }
                        }

                        try {
                           RLottieDrawable.access$getPendingColorUpdates$p(this.this$0).clear();
                        } catch (var11: Exception) {
                        }
                     }

                     val var46: Array<Int> = RLottieDrawable.access$getPendingReplaceColors$p(this.this$0);
                     if (var46 != null) {
                        RLottieDrawable.Companion.access$replaceColors(
                           RLottieDrawable.Companion, RLottieDrawable.access$getNativePtr$p(this.this$0), b.n0(var46)
                        );
                     }

                     RLottieDrawable.access$setPendingReplaceColors$p(this.this$0, null);

                     var var4: Long;
                     var var43: Int;
                     var var53: Bitmap;
                     try {
                        var47 = RLottieDrawable.Companion;
                        var4 = RLottieDrawable.access$getNativePtr$p(this.this$0);
                        var43 = RLottieDrawable.access$getCurrentFrame$p(this.this$0);
                        var53 = this.this$0.getBackgroundBitmap();
                     } catch (var21: Exception) {
                        Log.e("RLottieDrawable", "Error loading frame", var21);
                        break label136;
                     }

                     if (var53 == null) {
                        try {
                           r.s();
                        } catch (var20: Exception) {
                           Log.e("RLottieDrawable", "Error loading frame", var20);
                           break label136;
                        }
                     }

                     var var2: Int;
                     var var3: Int;
                     var var54: Bitmap;
                     try {
                        var3 = RLottieDrawable.access$getWidth$p(this.this$0);
                        var2 = RLottieDrawable.access$getHeight$p(this.this$0);
                        var54 = this.this$0.getBackgroundBitmap();
                     } catch (var19: Exception) {
                        Log.e("RLottieDrawable", "Error loading frame", var19);
                        break label136;
                     }

                     if (var54 == null) {
                        try {
                           r.s();
                        } catch (var18: Exception) {
                           Log.e("RLottieDrawable", "Error loading frame", var18);
                           break label136;
                        }
                     }

                     try {
                        if (RLottieDrawable.Companion.access$getFrame(var47, var4, var43, var53, var3, var2, var54.getRowBytes(), true) == -1) {
                           RLottieDrawable.access$getUiHandler$cp().post(RLottieDrawable.access$getUiRunnableNoFrame$p(this.this$0));
                           return;
                        }
                     } catch (var22: Exception) {
                        Log.e("RLottieDrawable", "Error loading frame", var22);
                        break label136;
                     }

                     try {
                        var48 = RLottieDrawable.access$getMetaData$p(this.this$0);
                     } catch (var17: Exception) {
                        Log.e("RLottieDrawable", "Error loading frame", var17);
                        break label136;
                     }

                     var var44: Byte = 2;
                     if (var48[2] != 0) {
                        try {
                           RLottieDrawable.access$getUiHandler$cp().post(RLottieDrawable.access$getUiRunnableGenerateCache$p(this.this$0));
                           RLottieDrawable.access$getMetaData$p(this.this$0)[2] = 0;
                        } catch (var16: Exception) {
                           Log.e("RLottieDrawable", "Error loading frame", var16);
                           break label136;
                        }
                     }

                     label117: {
                        try {
                           RLottieDrawable.access$setNextRenderingBitmap$p(this.this$0, this.this$0.getBackgroundBitmap());
                           if (RLottieDrawable.access$getShouldLimitFps$p(this.this$0)) {
                              break label117;
                           }
                        } catch (var15: Exception) {
                           Log.e("RLottieDrawable", "Error loading frame", var15);
                           break label136;
                        }

                        var44 = 1;
                     }

                     label174: {
                        try {
                           if (RLottieDrawable.access$getCurrentFrame$p(this.this$0) + var44 < RLottieDrawable.access$getMetaData$p(this.this$0)[0]) {
                              if (RLottieDrawable.access$getPlaybackMode$p(this.this$0) != RLottieDrawable.PlaybackMode.FREEZE) {
                                 break label174;
                              }

                              RLottieDrawable.access$setNextFrameIsLast$p(this.this$0, true);
                              RLottieDrawable.access$setAutoRepeatPlayCount$p(this.this$0, RLottieDrawable.access$getAutoRepeatPlayCount$p(this.this$0) + 1);
                              break label136;
                           }
                        } catch (var14: Exception) {
                           Log.e("RLottieDrawable", "Error loading frame", var14);
                           break label136;
                        }

                        try {
                           if (RLottieDrawable.access$getPlaybackMode$p(this.this$0) === RLottieDrawable.PlaybackMode.LOOP) {
                              RLottieDrawable.access$setCurrentFrame$p(this.this$0, 0);
                              RLottieDrawable.access$setNextFrameIsLast$p(this.this$0, false);
                              break label136;
                           }
                        } catch (var13: Exception) {
                           Log.e("RLottieDrawable", "Error loading frame", var13);
                           break label136;
                        }

                        try {
                           if (RLottieDrawable.access$getPlaybackMode$p(this.this$0) === RLottieDrawable.PlaybackMode.ONCE) {
                              RLottieDrawable.access$setCurrentFrame$p(this.this$0, 0);
                              RLottieDrawable.access$setNextFrameIsLast$p(this.this$0, true);
                              RLottieDrawable.access$setAutoRepeatPlayCount$p(this.this$0, RLottieDrawable.access$getAutoRepeatPlayCount$p(this.this$0) + 1);
                              break label136;
                           }
                        } catch (var12: Exception) {
                           Log.e("RLottieDrawable", "Error loading frame", var12);
                           break label136;
                        }

                        try {
                           RLottieDrawable.access$setNextFrameIsLast$p(this.this$0, true);
                        } catch (var9: Exception) {
                           Log.e("RLottieDrawable", "Error loading frame", var9);
                        }
                        break label136;
                     }

                     try {
                        RLottieDrawable.access$setCurrentFrame$p(this.this$0, RLottieDrawable.access$getCurrentFrame$p(this.this$0) + var44);
                        RLottieDrawable.access$setNextFrameIsLast$p(this.this$0, false);
                     } catch (var10: Exception) {
                        Log.e("RLottieDrawable", "Error loading frame", var10);
                     }
                  }

                  RLottieDrawable.access$getUiHandler$cp().post(RLottieDrawable.access$getUiRunnable$p(this.this$0));
               }
            }
         }
      };

      var var11: IntRef;
      try {
         var56 = var1.getResources().openRawResource(var2);
         r.d(var56, "context.resources.openRawResource(rawRes)");
         var11 = new IntRef();
      } catch (var19: java.lang.Throwable) {
         Log.e("RLottieDrawable", "Error Constructing", var19);
         return;
      }

      var2 = 0;

      while (true) {
         var var9: Int;
         var var12: ByteArray;
         try {
            var12 = buffer;
            var9 = var56.read(buffer, 0, buffer.length);
            var11.j = var9;
         } catch (var16: java.lang.Throwable) {
            Log.e("RLottieDrawable", "Error Constructing", var16);
            break;
         }

         if (var9 <= 0) {
            try {
               val var59: java.lang.String = new java.lang.String(readBuffer, 0, var2, ik.a.b);
               var56.close();
               this.width = var4;
               this.height = var5;
               this.screenRefreshRate = var6;
               val var57: Paint = this.getPaint();
               r.d(var57, "paint");
               var57.setFlags(2);
               this.nativePtr = RLottieDrawable.Companion.access$createWithJson(Companion, var59, var3, this.metaData, var8);
               this.timeBetweenFrames = Math.max(16, (int)(1000.0F / (float)this.metaData[1]));
               this.playbackMode = RLottieDrawable.PlaybackMode.LOOP;
            } catch (var15: java.lang.Throwable) {
               Log.e("RLottieDrawable", "Error Constructing", var15);
               break;
            }

            if (var7) {
               try {
                  this.setAllowDecodeSingleFrame(true);
               } catch (var14: java.lang.Throwable) {
                  Log.e("RLottieDrawable", "Error Constructing", var14);
                  break;
               }
            }
            break;
         }

         try {
            if (readBuffer.length < var9 + var2) {
               val var13: ByteArray = new byte[readBuffer.length * 2];
               System.arraycopy(readBuffer, 0, var13, 0, var2);
               readBuffer = var13;
            }
         } catch (var18: java.lang.Throwable) {
            Log.e("RLottieDrawable", "Error Constructing", var18);
            break;
         }

         try {
            System.arraycopy(var12, 0, readBuffer, var2, var11.j);
            var2 += var11.j;
         } catch (var17: java.lang.Throwable) {
            Log.e("RLottieDrawable", "Error Constructing", var17);
            break;
         }
      }
   }

   open fun RLottieDrawable(var1: File, var2: Int, var3: Int, var4: Boolean, var5: Boolean, var6: Float) {
      this(var1, var2, var3, var4, var5, var6, null, 64, null);
   }

   public constructor(file: File, w: Int, h: Int, precache: Boolean, limitFps: Boolean, screenRefreshRate: Float, colorReplacement: IntArray? = null) : r.i(
         var1, "file"
      ) {
      super();
      val var8: IntArray = new int[3];
      this.metaData = var8;
      this.customEndFrame = -1;
      this.newColorUpdates = new HashMap<>();
      this.pendingColorUpdates = new HashMap<>();
      this.playbackMode = RLottieDrawable.PlaybackMode.LOOP;
      this.screenRefreshRate = 60.0F;
      this.scaleX = 1.0F;
      this.scaleY = 1.0F;
      this.dstRect = new Rect();
      this.parentViews = new ArrayList<>();
      this.uiRunnableNoFrame = new Runnable(this) {
         final RLottieDrawable this$0;

         {
            this.this$0 = var1;
         }

         @Override
         public final void run() {
            RLottieDrawable.access$setLoadFrameTask$p(this.this$0, null);
            RLottieDrawable.access$decodeFrameFinishedInternal(this.this$0);
         }
      };
      this.uiRunnableCacheFinished = new Runnable(this) {
         final RLottieDrawable this$0;

         {
            this.this$0 = var1;
         }

         @Override
         public final void run() {
            RLottieDrawable.access$setCacheGenerateTask$p(this.this$0, null);
            RLottieDrawable.access$decodeFrameFinishedInternal(this.this$0);
         }
      };
      this.uiRunnable = new Runnable(this) {
         final RLottieDrawable this$0;

         {
            this.this$0 = var1;
         }

         @Override
         public final void run() {
            RLottieDrawable.access$setSingleFrameDecoded$p(this.this$0, true);
            RLottieDrawable.access$invalidateInternal(this.this$0);
            RLottieDrawable.access$decodeFrameFinishedInternal(this.this$0);
         }
      };
      this.uiRunnableLastFrame = new Runnable(this) {
         final RLottieDrawable this$0;

         {
            this.this$0 = var1;
         }

         @Override
         public final void run() {
            RLottieDrawable.access$setSingleFrameDecoded$p(this.this$0, true);
            RLottieDrawable.access$setRunning$p(this.this$0, false);
            RLottieDrawable.access$invalidateInternal(this.this$0);
            RLottieDrawable.access$decodeFrameFinishedInternal(this.this$0);
         }
      };
      this.uiRunnableGenerateCacheQueue = new Runnable(this) {
         final RLottieDrawable this$0;

         {
            this.this$0 = var1;
         }

         @Override
         public final void run() {
            if (RLottieDrawable.access$getCacheGenerateTask$p(this.this$0) != null) {
               RLottieDrawable.Companion.access$createCache(
                  RLottieDrawable.Companion,
                  RLottieDrawable.access$getNativePtr$p(this.this$0),
                  RLottieDrawable.access$getWidth$p(this.this$0),
                  RLottieDrawable.access$getHeight$p(this.this$0)
               );
               RLottieDrawable.access$getUiHandler$cp().post(RLottieDrawable.access$getUiRunnableCacheFinished$p(this.this$0));
            }
         }
      };
      this.uiRunnableGenerateCache = new Runnable(this) {
         final RLottieDrawable this$0;

         {
            this.this$0 = var1;
         }

         @Override
         public final void run() {
            if (!RLottieDrawable.access$isRecycled$p(this.this$0)
               && !RLottieDrawable.access$getDestroyWhenDone$p(this.this$0)
               && RLottieDrawable.access$getNativePtr$p(this.this$0) != 0L) {
               val var1: ThreadPoolExecutor = RLottieDrawable.access$getLottieCacheGenerateQueue$cp();
               if (var1 != null) {
                  val var2: Runnable = RLottieDrawable.access$getUiRunnableGenerateCacheQueue$p(this.this$0);
                  RLottieDrawable.access$setCacheGenerateTask$p(this.this$0, var2);
                  var1.execute(var2);
               }
            }

            RLottieDrawable.access$decodeFrameFinishedInternal(this.this$0);
         }
      };
      this.loadFrameRunnable = new Runnable(this) {
         final RLottieDrawable this$0;

         {
            this.this$0 = var1;
         }

         // $VF: Duplicated exception handlers to handle obfuscated exceptions
         // $VF: Could not inline inconsistent finally blocks
         // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
         @Override
         public final void run() {
            if (!RLottieDrawable.access$isRecycled$p(this.this$0)) {
               if (RLottieDrawable.access$getNativePtr$p(this.this$0) == 0L) {
                  RLottieDrawable.access$getUiHandler$cp().post(RLottieDrawable.access$getUiRunnableNoFrame$p(this.this$0));
               } else {
                  if (this.this$0.getBackgroundBitmap() == null) {
                     label165:
                     try {
                        RLottieDrawable.access$setBackgroundBitmap$p(
                           this.this$0,
                           Bitmap.createBitmap(
                              RLottieDrawable.access$getWidth$p(this.this$0), RLottieDrawable.access$getHeight$p(this.this$0), Config.ARGB_8888
                           )
                        );
                     } catch (var25: java.lang.Throwable) {
                        Log.e("RLottieDrawable", "Error Loading Frame in Runnable", var25);
                        break label165;
                     }
                  }

                  label136:
                  if (this.this$0.getBackgroundBitmap() != null) {
                     label173: {
                        var var45: java.util.Iterator;
                        try {
                           if (!(RLottieDrawable.access$getPendingColorUpdates$p(this.this$0).isEmpty() xor true)) {
                              break label173;
                           }

                           var45 = RLottieDrawable.access$getPendingColorUpdates$p(this.this$0).entrySet().iterator();
                        } catch (var23: Exception) {
                           break label173;
                        }

                        while (true) {
                           try {
                              if (!var45.hasNext()) {
                                 break;
                              }

                              val var7: Entry = var45.next() as Entry;
                              RLottieDrawable.Companion.access$setLayerColor(
                                 RLottieDrawable.Companion,
                                 RLottieDrawable.access$getNativePtr$p(this.this$0),
                                 var7.getKey() as java.lang.String,
                                 (var7.getValue() as java.lang.Number).intValue()
                              );
                           } catch (var24: Exception) {
                              break label173;
                           }
                        }

                        try {
                           RLottieDrawable.access$getPendingColorUpdates$p(this.this$0).clear();
                        } catch (var11: Exception) {
                        }
                     }

                     val var46: Array<Int> = RLottieDrawable.access$getPendingReplaceColors$p(this.this$0);
                     if (var46 != null) {
                        RLottieDrawable.Companion.access$replaceColors(
                           RLottieDrawable.Companion, RLottieDrawable.access$getNativePtr$p(this.this$0), b.n0(var46)
                        );
                     }

                     RLottieDrawable.access$setPendingReplaceColors$p(this.this$0, null);

                     var var4: Long;
                     var var43: Int;
                     var var53: Bitmap;
                     try {
                        var47 = RLottieDrawable.Companion;
                        var4 = RLottieDrawable.access$getNativePtr$p(this.this$0);
                        var43 = RLottieDrawable.access$getCurrentFrame$p(this.this$0);
                        var53 = this.this$0.getBackgroundBitmap();
                     } catch (var21: Exception) {
                        Log.e("RLottieDrawable", "Error loading frame", var21);
                        break label136;
                     }

                     if (var53 == null) {
                        try {
                           r.s();
                        } catch (var20: Exception) {
                           Log.e("RLottieDrawable", "Error loading frame", var20);
                           break label136;
                        }
                     }

                     var var2: Int;
                     var var3: Int;
                     var var54: Bitmap;
                     try {
                        var3 = RLottieDrawable.access$getWidth$p(this.this$0);
                        var2 = RLottieDrawable.access$getHeight$p(this.this$0);
                        var54 = this.this$0.getBackgroundBitmap();
                     } catch (var19: Exception) {
                        Log.e("RLottieDrawable", "Error loading frame", var19);
                        break label136;
                     }

                     if (var54 == null) {
                        try {
                           r.s();
                        } catch (var18: Exception) {
                           Log.e("RLottieDrawable", "Error loading frame", var18);
                           break label136;
                        }
                     }

                     try {
                        if (RLottieDrawable.Companion.access$getFrame(var47, var4, var43, var53, var3, var2, var54.getRowBytes(), true) == -1) {
                           RLottieDrawable.access$getUiHandler$cp().post(RLottieDrawable.access$getUiRunnableNoFrame$p(this.this$0));
                           return;
                        }
                     } catch (var22: Exception) {
                        Log.e("RLottieDrawable", "Error loading frame", var22);
                        break label136;
                     }

                     try {
                        var48 = RLottieDrawable.access$getMetaData$p(this.this$0);
                     } catch (var17: Exception) {
                        Log.e("RLottieDrawable", "Error loading frame", var17);
                        break label136;
                     }

                     var var44: Byte = 2;
                     if (var48[2] != 0) {
                        try {
                           RLottieDrawable.access$getUiHandler$cp().post(RLottieDrawable.access$getUiRunnableGenerateCache$p(this.this$0));
                           RLottieDrawable.access$getMetaData$p(this.this$0)[2] = 0;
                        } catch (var16: Exception) {
                           Log.e("RLottieDrawable", "Error loading frame", var16);
                           break label136;
                        }
                     }

                     label117: {
                        try {
                           RLottieDrawable.access$setNextRenderingBitmap$p(this.this$0, this.this$0.getBackgroundBitmap());
                           if (RLottieDrawable.access$getShouldLimitFps$p(this.this$0)) {
                              break label117;
                           }
                        } catch (var15: Exception) {
                           Log.e("RLottieDrawable", "Error loading frame", var15);
                           break label136;
                        }

                        var44 = 1;
                     }

                     label174: {
                        try {
                           if (RLottieDrawable.access$getCurrentFrame$p(this.this$0) + var44 < RLottieDrawable.access$getMetaData$p(this.this$0)[0]) {
                              if (RLottieDrawable.access$getPlaybackMode$p(this.this$0) != RLottieDrawable.PlaybackMode.FREEZE) {
                                 break label174;
                              }

                              RLottieDrawable.access$setNextFrameIsLast$p(this.this$0, true);
                              RLottieDrawable.access$setAutoRepeatPlayCount$p(this.this$0, RLottieDrawable.access$getAutoRepeatPlayCount$p(this.this$0) + 1);
                              break label136;
                           }
                        } catch (var14: Exception) {
                           Log.e("RLottieDrawable", "Error loading frame", var14);
                           break label136;
                        }

                        try {
                           if (RLottieDrawable.access$getPlaybackMode$p(this.this$0) === RLottieDrawable.PlaybackMode.LOOP) {
                              RLottieDrawable.access$setCurrentFrame$p(this.this$0, 0);
                              RLottieDrawable.access$setNextFrameIsLast$p(this.this$0, false);
                              break label136;
                           }
                        } catch (var13: Exception) {
                           Log.e("RLottieDrawable", "Error loading frame", var13);
                           break label136;
                        }

                        try {
                           if (RLottieDrawable.access$getPlaybackMode$p(this.this$0) === RLottieDrawable.PlaybackMode.ONCE) {
                              RLottieDrawable.access$setCurrentFrame$p(this.this$0, 0);
                              RLottieDrawable.access$setNextFrameIsLast$p(this.this$0, true);
                              RLottieDrawable.access$setAutoRepeatPlayCount$p(this.this$0, RLottieDrawable.access$getAutoRepeatPlayCount$p(this.this$0) + 1);
                              break label136;
                           }
                        } catch (var12: Exception) {
                           Log.e("RLottieDrawable", "Error loading frame", var12);
                           break label136;
                        }

                        try {
                           RLottieDrawable.access$setNextFrameIsLast$p(this.this$0, true);
                        } catch (var9: Exception) {
                           Log.e("RLottieDrawable", "Error loading frame", var9);
                        }
                        break label136;
                     }

                     try {
                        RLottieDrawable.access$setCurrentFrame$p(this.this$0, RLottieDrawable.access$getCurrentFrame$p(this.this$0) + var44);
                        RLottieDrawable.access$setNextFrameIsLast$p(this.this$0, false);
                     } catch (var10: Exception) {
                        Log.e("RLottieDrawable", "Error loading frame", var10);
                     }
                  }

                  RLottieDrawable.access$getUiHandler$cp().post(RLottieDrawable.access$getUiRunnable$p(this.this$0));
               }
            }
         }
      };
      this.width = var2;
      this.height = var3;
      this.shouldLimitFps = var5;
      this.screenRefreshRate = var6;
      val var9: Paint = this.getPaint();
      r.d(var9, "paint");
      var9.setFlags(2);
      val var12: RLottieDrawable.Companion = Companion;
      val var10: java.lang.String = var1.getAbsolutePath();
      r.d(var10, "file.absolutePath");
      this.nativePtr = RLottieDrawable.Companion.access$create(var12, var10, var2, var3, var8, var4, var7, this.shouldLimitFps);
      if (var4 && lottieCacheGenerateQueue == null) {
         lottieCacheGenerateQueue = new ThreadPoolExecutor(1, 1, 0L, TimeUnit.MILLISECONDS, new LinkedBlockingQueue<>());
      }

      if (this.nativePtr == 0L) {
         var1.delete();
      }

      if (this.shouldLimitFps && var8[1] < 60) {
         this.shouldLimitFps = false;
      }

      val var11: Byte;
      if (this.shouldLimitFps) {
         var11 = 33;
      } else {
         var11 = 16;
      }

      this.timeBetweenFrames = Math.max(var11, (int)(1000.0F / (float)var8[1]));
   }

   private fun checkRunningTasks() {
      if (this.cacheGenerateTask != null) {
         if (lottieCacheGenerateQueue == null) {
            r.s();
         }

         if (lottieCacheGenerateQueue.remove(this.cacheGenerateTask)) {
            this.cacheGenerateTask = null;
         }
      }

      if (!this.hasParentView() && this.nextRenderingBitmap != null && this.loadFrameTask != null) {
         this.loadFrameTask = null;
         this.nextRenderingBitmap = null;
      }
   }

   private fun decodeFrameFinishedInternal() {
      if (this.destroyWhenDone) {
         this.checkRunningTasks();
         if (this.loadFrameTask == null && this.cacheGenerateTask == null && this.nativePtr != 0L) {
            RLottieDrawable.Companion.access$destroy(Companion, this.nativePtr);
            this.nativePtr = 0L;
         }
      }

      if (this.nativePtr == 0L) {
         this.recycleResources();
      } else {
         if (!this.hasParentView()) {
            this.stop();
         }

         this.scheduleNextGetFrame();
      }
   }

   private fun hasParentView(): Boolean {
      if (this.getCallback() != null) {
         return true;
      } else {
         for (int var1 = this.parentViews.size(); var1 > 0; var1--) {
            if (this.parentViews.get(0).get() != null) {
               return true;
            }

            this.parentViews.remove(0);
         }

         return false;
      }
   }

   private fun invalidateInternal() {
      var var2: Int = this.parentViews.size();

      for (int var1 = 0; var1 < var2; var1++) {
         val var3: View = this.parentViews.get(var1).get();
         if (var3 != null) {
            var3.invalidate();
         } else {
            this.parentViews.remove(var1);
            var2--;
            var1--;
         }
      }

      if (this.getCallback() != null) {
         this.invalidateSelf();
      }
   }

   private fun recycleResources() {
      if (this.renderingBitmap != null) {
         if (this.renderingBitmap == null) {
            r.s();
         }

         this.renderingBitmap.recycle();
         this.renderingBitmap = null;
      }

      if (this.backgroundBitmap != null) {
         if (this.backgroundBitmap == null) {
            r.s();
         }

         this.backgroundBitmap.recycle();
         this.backgroundBitmap = null;
      }
   }

   private fun requestRedrawColors() {
      if (!this.applyingLayerColors && !this.isRunning && this.decodeSingleFrame) {
         if (this.currentFrame <= 2) {
            this.currentFrame = 0;
         }

         this.nextFrameIsLast = false;
         this.singleFrameDecoded = false;
         if (!this.scheduleNextGetFrame()) {
            this.forceFrameRedraw = true;
         }
      }

      this.invalidateInternal();
   }

   private fun scheduleNextGetFrame(): Boolean {
      if (this.loadFrameTask == null && this.nextRenderingBitmap == null && this.nativePtr != 0L && !this.destroyWhenDone) {
         if (!this.isRunning && (!this.decodeSingleFrame || this.decodeSingleFrame && this.singleFrameDecoded)) {
            return false;
         } else {
            if (this.newColorUpdates.isEmpty() xor true) {
               this.pendingColorUpdates.putAll(this.newColorUpdates);
               this.newColorUpdates.clear();
            }

            if (this.newReplaceColors != null) {
               this.pendingReplaceColors = this.newReplaceColors;
               this.newReplaceColors = null;
            }

            val var4: ExecutorService = loadFrameRunnableQueue;
            val var3: Runnable = this.loadFrameRunnable;
            this.loadFrameTask = this.loadFrameRunnable;
            var4.execute(var3);
            return true;
         }
      } else {
         return false;
      }
   }

   public fun addParentView(view: View?) {
      if (var1 != null) {
         var var3: Int = this.parentViews.size();
         var var2: Int = 0;

         while (var2 < var3) {
            if (this.parentViews.get(var2).get() === var1) {
               return;
            }

            var var5: Int = var3;
            var var4: Int = var2;
            if (this.parentViews.get(var2).get() == null) {
               this.parentViews.remove(var2);
               var5 = var3 - 1;
               var4 = var2 - 1;
            }

            var2 = var4 + 1;
            var3 = var5;
         }

         this.parentViews.add(0, new WeakReference<>(var1));
      }
   }

   public fun beginApplyLayerColors() {
      this.applyingLayerColors = true;
   }

   public fun commitApplyLayerColors() {
      if (this.applyingLayerColors) {
         this.applyingLayerColors = false;
         if (!this.isRunning && this.decodeSingleFrame) {
            if (this.currentFrame <= 2) {
               this.currentFrame = 0;
            }

            this.nextFrameIsLast = false;
            this.singleFrameDecoded = false;
            if (!this.scheduleNextGetFrame()) {
               this.forceFrameRedraw = true;
            }
         }

         this.invalidateInternal();
      }
   }

   public open fun draw(canvas: Canvas) {
      r.i(var1, "canvas");
      if (this.nativePtr != 0L && !this.destroyWhenDone) {
         var var6: Long = SystemClock.elapsedRealtime();
         val var8: Long = Math.abs(var6 - this.lastFrameTime);
         val var3: Float = 60;
         val var4: Int;
         if (this.screenRefreshRate <= 60) {
            var4 = this.timeBetweenFrames - 6;
         } else {
            var4 = this.timeBetweenFrames;
         }

         if (this.isRunning) {
            if (this.renderingBitmap == null && this.nextRenderingBitmap == null) {
               this.scheduleNextGetFrame();
            } else if (this.nextRenderingBitmap != null && (this.renderingBitmap == null || var8 >= var4) && this.isCurrentParentViewMaster()) {
               if (this.vibrationPattern != null && this.currentParentView != null) {
                  if (this.vibrationPattern == null) {
                     r.s();
                  }

                  val var11: Int = this.vibrationPattern.get(this.currentFrame - 1);
                  if (var11 != null) {
                     val var12: View = this.currentParentView;
                     if (this.currentParentView != null) {
                        val var5: Byte;
                        if (var11 == 1) {
                           var5 = 0;
                        } else {
                           var5 = 3;
                        }

                        var12.performHapticFeedback(var5, 2);
                     }
                  }
               }

               this.backgroundBitmap = this.renderingBitmap;
               this.renderingBitmap = this.nextRenderingBitmap;
               if (this.nextFrameIsLast) {
                  this.stop();
               }

               this.loadFrameTask = null;
               this.singleFrameDecoded = true;
               this.nextRenderingBitmap = null;
               if (!(this.screenRefreshRate <= var3)) {
                  var6 -= Math.min(16L, var8 - (long)var4);
               }

               this.lastFrameTime = var6;
               this.scheduleNextGetFrame();
            }
         } else if ((this.forceFrameRedraw || this.decodeSingleFrame && var8 >= var4) && this.nextRenderingBitmap != null) {
            this.backgroundBitmap = this.renderingBitmap;
            this.renderingBitmap = this.nextRenderingBitmap;
            this.loadFrameTask = null;
            this.singleFrameDecoded = true;
            this.nextRenderingBitmap = null;
            if (!(this.screenRefreshRate <= var3)) {
               var6 -= Math.min(16L, var8 - (long)var4);
            }

            this.lastFrameTime = var6;
            if (this.forceFrameRedraw) {
               this.singleFrameDecoded = false;
               this.forceFrameRedraw = false;
            }

            this.scheduleNextGetFrame();
         }

         if (this.renderingBitmap != null) {
            if (this.applyTransformation) {
               this.dstRect.set(this.getBounds());
               this.scaleX = (float)this.dstRect.width() / this.width;
               this.scaleY = (float)this.dstRect.height() / this.height;
               this.applyTransformation = false;
            }

            var1.save();
            var1.translate((float)this.dstRect.left, (float)this.dstRect.top);
            var1.scale(this.scaleX, this.scaleY);
            if (this.renderingBitmap == null) {
               r.s();
            }

            var1.drawBitmap(this.renderingBitmap, 0.0F, 0.0F, this.getPaint());
            if (this.isRunning) {
               this.invalidateInternal();
            }

            var1.restore();
         }
      }
   }

   public open fun getIntrinsicHeight(): Int {
      return this.height;
   }

   public open fun getIntrinsicWidth(): Int {
      return this.width;
   }

   public open fun getMinimumHeight(): Int {
      return this.height;
   }

   public open fun getMinimumWidth(): Int {
      return this.width;
   }

   public open fun getOpacity(): Int {
      return -2;
   }

   public fun hasBitmap(): Boolean {
      val var1: Boolean;
      if (this.nativePtr == 0L || this.renderingBitmap == null && this.nextRenderingBitmap == null) {
         var1 = false;
      } else {
         var1 = true;
      }

      return var1;
   }

   public open fun isRunning(): Boolean {
      return this.isRunning;
   }

   protected open fun onBoundsChange(bounds: Rect) {
      r.i(var1, "bounds");
      super.onBoundsChange(var1);
      this.applyTransformation = true;
   }

   public fun recycle() {
      this.isRunning = false;
      this.isRecycled = true;
      this.checkRunningTasks();
      if (this.loadFrameTask == null && this.cacheGenerateTask == null) {
         if (this.nativePtr != 0L) {
            RLottieDrawable.Companion.access$destroy(Companion, this.nativePtr);
            this.nativePtr = 0L;
         }

         this.recycleResources();
      } else {
         this.destroyWhenDone = true;
      }
   }

   public fun removeParentView(view: View?) {
      if (var1 != null) {
         var var3: Int = this.parentViews.size();
         var var2: Int = 0;

         while (var2 < var3) {
            var var4: Int;
            var var5: Int;
            label20: {
               val var6: View = this.parentViews.get(var2).get();
               if (var6 != var1) {
                  var4 = var3;
                  var5 = var2;
                  if (var6 != null) {
                     break label20;
                  }
               }

               this.parentViews.remove(var2);
               var4 = var3 - 1;
               var5 = var2 - 1;
            }

            var2 = var5 + 1;
            var3 = var4;
         }
      }
   }

   public fun replaceColors(colors: Array<Int>?) {
      this.newReplaceColors = var1;
      this.requestRedrawColors();
   }

   public fun restart(): Boolean {
      val var1: RLottieDrawable.PlaybackMode = RLottieDrawable.PlaybackMode.ONCE;
      if (this.playbackMode.compareTo(RLottieDrawable.PlaybackMode.ONCE) >= 0 && this.autoRepeatPlayCount != 0) {
         this.autoRepeatPlayCount = 0;
         this.playbackMode = var1;
         this.start();
         return true;
      } else {
         return false;
      }
   }

   public fun setAllowDecodeSingleFrame(value: Boolean) {
      this.decodeSingleFrame = var1;
      if (var1) {
         this.scheduleNextGetFrame();
      }
   }

   public fun setCurrentParentView(view: View?) {
      this.currentParentView = var1;
   }

   public fun setLayerColor(layerName: String, color: Int) {
      r.i(var1, "layerName");
      this.newColorUpdates.put(var1, var2);
      this.requestRedrawColors();
   }

   public fun setPlaybackMode(value: com.discord.rlottie.RLottieDrawable.PlaybackMode) {
      r.i(var1, "value");
      if (this.playbackMode != RLottieDrawable.PlaybackMode.ONCE || var1 != RLottieDrawable.PlaybackMode.FREEZE || this.currentFrame == 0) {
         this.playbackMode = var1;
      }
   }

   public fun setProgress(oldProgress: Float) {
      var var5: Float;
      label18: {
         if (var1 < 0.0F) {
            var1 = 0.0F;
         } else {
            var5 = var1;
            if (!(var1 > 1.0F)) {
               break label18;
            }

            var1 = 1.0F;
         }

         var5 = var1;
      }

      this.currentFrame = (int)(this.metaData[0] * var5);
      this.nextFrameIsLast = false;
      this.singleFrameDecoded = false;
      if (!this.scheduleNextGetFrame()) {
         this.forceFrameRedraw = true;
      }

      this.invalidateSelf();
   }

   public fun setVibrationPattern(pattern: HashMap<Int, Int>?) {
      this.vibrationPattern = var1;
   }

   public open fun start() {
      if (!this.isRunning && (this.playbackMode.compareTo(RLottieDrawable.PlaybackMode.ONCE) < 0 || this.autoRepeatPlayCount == 0)) {
         this.isRunning = true;
         this.scheduleNextGetFrame();
         this.invalidateInternal();
      }
   }

   public open fun stop() {
      this.isRunning = false;
   }

   public companion object {
      private final val buffer: ByteArray
      private final val loadFrameRunnableQueue: ExecutorService
      private final var lottieCacheGenerateQueue: ThreadPoolExecutor?
      private final var readBuffer: ByteArray
      private final val uiHandler: Handler

      private external fun create(src: String, w: Int, h: Int, params: IntArray, precache: Boolean, colorReplacement: IntArray?, limitFps: Boolean): Long {
      }

      private external fun createCache(ptr: Long, w: Int, h: Int) {
      }

      private external fun createWithJson(json: String, name: String, params: IntArray, colorReplacement: IntArray?): Long {
      }

      private external fun destroy(ptr: Long) {
      }

      private external fun getFrame(ptr: Long, frame: Int, bitmap: Bitmap, w: Int, h: Int, stride: Int, clear: Boolean): Int {
      }

      private external fun replaceColors(ptr: Long, colorReplacement: IntArray) {
      }

      private external fun setLayerColor(ptr: Long, layer: String, color: Int) {
      }
   }

   public enum class PlaybackMode {
      FREEZE,
      LOOP,
      ONCE      @JvmStatic
      private RLottieDrawable.PlaybackMode[] $VALUES;

      // $VF: Failed to inline enum fields
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      @JvmStatic
      fun {
         val var0: RLottieDrawable.PlaybackMode = new RLottieDrawable.PlaybackMode();
         LOOP = var0;
         val var2: RLottieDrawable.PlaybackMode = new RLottieDrawable.PlaybackMode();
         ONCE = var2;
         val var1: RLottieDrawable.PlaybackMode = new RLottieDrawable.PlaybackMode();
         FREEZE = var1;
         $VALUES = new RLottieDrawable.PlaybackMode[]{var0, var2, var1};
      }
   }
}
