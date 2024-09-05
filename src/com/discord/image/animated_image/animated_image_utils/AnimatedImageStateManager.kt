package com.discord.image.animated_image.animated_image_utils

import com.discord.misc.utilities.queue.WorkerQueue
import com.discord.misc.utilities.threading.ThreadUtilsKt
import kotlin.jvm.internal.q

public class AnimatedImageStateManager<T>(handlePlay: () -> Unit,
   handlePause: () -> Unit,
   handleSetPlaceholder: (Any) -> Unit,
   handleConfigIsValid: (Any) -> Boolean,
   handleFetchAnimatedImage: (Any) -> Unit
) {
   private final val handlePlay: () -> Unit
   private final val handlePause: () -> Unit
   private final val handleSetPlaceholder: (Any) -> Unit
   private final val handleConfigIsValid: (Any) -> Boolean
   private final val handleFetchAnimatedImage: (Any) -> Unit
   private final var animatedImageConfig: Any?
   private final var animatedImageLoaded: Boolean

   init {
      q.h(var1, "handlePlay");
      q.h(var2, "handlePause");
      q.h(var3, "handleSetPlaceholder");
      q.h(var4, "handleConfigIsValid");
      q.h(var5, "handleFetchAnimatedImage");
      super();
      this.handlePlay = var1;
      this.handlePause = var2;
      this.handleSetPlaceholder = var3;
      this.handleConfigIsValid = var4;
      this.handleFetchAnimatedImage = var5;
   }

   private fun reload() {
      if (this.animatedImageConfig == null) {
         this.updateWorker(false);
      } else {
         this.onTryFetch(this.animatedImageConfig);
      }
   }

   private fun updateWorker(active: Boolean): Boolean {
      return workerQueue.updateWorker(this, var1, <unrepresentable>.INSTANCE);
   }

   public fun onAttachedToWindow() {
      if (ThreadUtilsKt.isOnMainThread()) {
         access$getHandlePlay$p(this).invoke();
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
         access$getHandlePause$p(this).invoke();
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
      if (ThreadUtilsKt.isOnMainThread()) {
         access$setAnimatedImageLoaded$p(this, var1);
         if (var2) {
            access$getHandlePlay$p(this).invoke();
         }

         return access$updateWorker(this, false);
      } else {
         val var3: Thread = Thread.currentThread();
         val var4: StringBuilder = new StringBuilder();
         var4.append("Expected to be on android main thread. Current: ");
         var4.append(var3);
         throw new IllegalStateException(var4.toString().toString());
      }
   }

   public fun onTryFetch(config: Any) {
      if (!ThreadUtilsKt.isOnMainThread()) {
         var1 = Thread.currentThread();
         val var2: StringBuilder = new StringBuilder();
         var2.append("Expected to be on android main thread. Current: ");
         var2.append(var1);
         throw new IllegalStateException(var2.toString().toString());
      } else {
         if (q.c(access$getAnimatedImageConfig$p(this), var1) && access$getAnimatedImageLoaded$p(this)) {
            access$updateWorker(this, false);
         } else {
            access$setAnimatedImageConfig$p(this, var1);
            access$setAnimatedImageLoaded$p(this, false);
            access$getHandleSetPlaceholder$p(this).invoke(var1);
            if (!access$getHandleConfigIsValid$p(this).invoke(var1) as java.lang.Boolean) {
               access$updateWorker(this, false);
            } else if (access$updateWorker(this, true)) {
               access$getHandleFetchAnimatedImage$p(this).invoke(var1);
            }
         }
      }
   }

   public fun reset(): Boolean {
      if (ThreadUtilsKt.isOnMainThread()) {
         access$setAnimatedImageConfig$p(this, null);
         access$setAnimatedImageLoaded$p(this, false);
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
