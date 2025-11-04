package com.discord.image.animated_image.animated_image_utils

import com.discord.misc.utilities.queue.WorkerQueue
import com.discord.misc.utilities.threading.ThreadUtilsKt
import kotlin.jvm.functions.Function0
import kotlin.jvm.internal.SourceDebugExtension
import o8.a

@SourceDebugExtension(["SMAP\nAnimatedImageStateManager.kt\nKotlin\n*S Kotlin\n*F\n+ 1 AnimatedImageStateManager.kt\ncom/discord/image/animated_image/animated_image_utils/AnimatedImageStateManager\n+ 2 ThreadUtils.kt\ncom/discord/misc/utilities/threading/ThreadUtilsKt\n*L\n1#1,125:1\n14#2,5:126\n14#2,5:131\n14#2,5:136\n14#2,5:141\n14#2,5:146\n*S KotlinDebug\n*F\n+ 1 AnimatedImageStateManager.kt\ncom/discord/image/animated_image/animated_image_utils/AnimatedImageStateManager\n*L\n22#1:126,5\n67#1:131,5\n74#1:136,5\n86#1:141,5\n94#1:146,5\n*E\n"])
public class AnimatedImageStateManager<T>(handlePlay: () -> Unit,
   handlePause: () -> Unit,
   handleStop: (() -> Unit)? = null,
   handleRecycle: (Any) -> Unit,
   handleConfigIsValid: (Any) -> Boolean,
   handleFetchAnimatedImage: (Any) -> Unit
) {
   private final val handlePlay: () -> Unit
   private final val handlePause: () -> Unit
   private final val handleStop: (() -> Unit)?
   private final val handleRecycle: (Any) -> Unit
   private final val handleConfigIsValid: (Any) -> Boolean
   private final val handleFetchAnimatedImage: (Any) -> Unit
   private final var animatedImageConfig: Any?
   private final var animatedImageLoaded: Boolean
   private final var autoplay: Boolean
   private final var playPending: Boolean
   private final var pausePending: Boolean

   init {
      this.handlePlay = var1;
      this.handlePause = var2;
      this.handleStop = var3;
      this.handleRecycle = var4;
      this.handleConfigIsValid = var5;
      this.handleFetchAnimatedImage = var6;
      this.autoplay = true;
   }

   private fun reload() {
      if (this.animatedImageConfig == null) {
         this.updateWorker(false);
      } else {
         this.onTryFetch(this.animatedImageConfig);
      }
   }

   private fun setImageConfig(config: Any?) {
      this.animatedImageConfig = (T)var1;
      this.animatedImageLoaded = false;
   }

   private fun updateWorker(active: Boolean): Boolean {
      return workerQueue.updateWorker(this, var1, new a());
   }

   @JvmStatic
   fun `updateWorker$lambda$5`(var0: AnimatedImageStateManager): Unit {
      var0.reload();
      return Unit.a;
   }

   public fun onAttachedToWindow() {
      if (ThreadUtilsKt.isOnMainThread()) {
         access$reload(this);
      } else {
         val var1: Thread = Thread.currentThread();
         val var2: StringBuilder = new StringBuilder();
         var2.append("Expected to be on android main thread. Current: ");
         var2.append(var1);
         throw new IllegalStateException(var2.toString().toString());
      }
   }

   public fun onDetachedFromWindow(): Boolean {
      if (ThreadUtilsKt.isOnMainThread()) {
         val var3: Function0 = access$getHandleStop$p(this);
         if (var3 != null) {
            var3.invoke();
         }

         access$setPlayPending$p(this, false);
         access$setPausePending$p(this, false);
         return access$updateWorker(this, false);
      } else {
         val var2: Thread = Thread.currentThread();
         val var1: StringBuilder = new StringBuilder();
         var1.append("Expected to be on android main thread. Current: ");
         var1.append(var2);
         throw new IllegalStateException(var1.toString().toString());
      }
   }

   public fun onFetchFinished(animatedImageLoaded: Boolean, animate: Boolean = false): Boolean {
      if (!ThreadUtilsKt.isOnMainThread()) {
         val var4: Thread = Thread.currentThread();
         val var3: StringBuilder = new StringBuilder();
         var3.append("Expected to be on android main thread. Current: ");
         var3.append(var4);
         throw new IllegalStateException(var3.toString().toString());
      } else {
         access$setAnimatedImageLoaded$p(this, var1);
         access$setAutoplay$p(this, var2);
         if (var2 || access$getPlayPending$p(this)) {
            this.play();
         }

         return access$updateWorker(this, false);
      }
   }

   public fun onTryFetch(config: Any) {
      if (ThreadUtilsKt.isOnMainThread()) {
         if (access$getAnimatedImageConfig$p(this) == var1 && access$getAnimatedImageLoaded$p(this)) {
            access$updateWorker(this, false);
         } else {
            access$setImageConfig(this, var1);
            access$getHandleRecycle$p(this).invoke(var1);
            if (!access$getHandleConfigIsValid$p(this).invoke(var1) as java.lang.Boolean) {
               access$updateWorker(this, false);
            } else if (access$updateWorker(this, true)) {
               access$getHandleFetchAnimatedImage$p(this).invoke(var1);
            }
         }
      } else {
         var1 = Thread.currentThread();
         val var2: StringBuilder = new StringBuilder();
         var2.append("Expected to be on android main thread. Current: ");
         var2.append(var1);
         throw new IllegalStateException(var2.toString().toString());
      }
   }

   public fun pause() {
      this.playPending = false;
      if (this.animatedImageLoaded) {
         this.handlePause.invoke();
         this.pausePending = false;
      } else {
         this.pausePending = true;
      }
   }

   public fun play() {
      this.pausePending = false;
      if (this.animatedImageLoaded) {
         this.handlePlay.invoke();
         this.playPending = false;
      } else {
         this.playPending = true;
      }
   }

   public fun reset(): Boolean {
      if (ThreadUtilsKt.isOnMainThread()) {
         access$setImageConfig(this, null);
         return access$updateWorker(this, false);
      } else {
         val var2: Thread = Thread.currentThread();
         val var1: StringBuilder = new StringBuilder();
         var1.append("Expected to be on android main thread. Current: ");
         var1.append(var2);
         throw new IllegalStateException(var1.toString().toString());
      }
   }

   public companion object {
      private final val workerQueue: WorkerQueue<AnimatedImageStateManager<*>>
   }
}
