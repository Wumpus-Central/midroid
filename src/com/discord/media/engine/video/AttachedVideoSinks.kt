package com.discord.media.engine.video

import com.discord.media.engine.MediaEngine
import com.discord.media.engine.types.VideoSink
import java.util.concurrent.ConcurrentHashMap
import java.util.concurrent.CopyOnWriteArraySet
import kotlin.jvm.functions.Function1
import kotlin.jvm.functions.Function2
import kotlin.jvm.internal.SourceDebugExtension
import kotlin.jvm.internal.Ref.BooleanRef
import org.webrtc.VideoFrame

internal object AttachedVideoSinks {
   private final val streamOutputMap: ConcurrentHashMap<String, com.discord.media.engine.video.AttachedVideoSinks.VideoOutputSinks> = new ConcurrentHashMap()

   @JvmStatic
   fun `addSink$lambda$1`(var0: BooleanRef, var1: VideoSink, var2: MediaEngine, var3: java.lang.String, var4: java.lang.String): AttachedVideoSinks.VideoOutputSinks {
      var0.element = true;
      val var5: AttachedVideoSinks.VideoOutputSinks = new AttachedVideoSinks.VideoOutputSinks(var1);
      var2.setVideoOutputSink$media_engine_release(var3, new Function2<VideoFrame, java.lang.Boolean, java.lang.Boolean>(var5) {
         {
            super(2, var1, AttachedVideoSinks.VideoOutputSinks::class.java, "onFrame", "onFrame(Lorg/webrtc/VideoFrame;Z)Z", 0);
         }

         public final java.lang.Boolean invoke(VideoFrame var1, boolean var2) {
            return (super.receiver as AttachedVideoSinks.VideoOutputSinks).onFrame(var1, var2);
         }
      });
      return var5;
   }

   @JvmStatic
   fun `addSink$lambda$2`(var0: Function1, var1: Any): AttachedVideoSinks.VideoOutputSinks {
      return var0.invoke(var1) as AttachedVideoSinks.VideoOutputSinks;
   }

   @JvmStatic
   fun `removeSink$lambda$4`(var0: VideoSink, var1: MediaEngine, var2: java.lang.String, var3: java.lang.String, var4: AttachedVideoSinks.VideoOutputSinks): AttachedVideoSinks.VideoOutputSinks {
      var var6: AttachedVideoSinks.VideoOutputSinks = null;
      if (var4 != null) {
         var4.remove(var0);
         var var5: AttachedVideoSinks.VideoOutputSinks = var4;
         if (var4.isEmpty()) {
            var1.setVideoOutputSink$media_engine_release(var2, null);
            var5 = null;
         }

         var6 = var5;
      }

      return var6;
   }

   @JvmStatic
   fun `removeSink$lambda$5`(var0: Function2, var1: Any, var2: Any): AttachedVideoSinks.VideoOutputSinks {
      return var0.invoke(var1, var2) as AttachedVideoSinks.VideoOutputSinks;
   }

   public fun addSink(mediaEngine: MediaEngine, sink: VideoSink, streamId: String): Boolean {
      val var4: BooleanRef = new BooleanRef();
      val var5: Any = streamOutputMap.computeIfAbsent(var3, new b(new a(var4, var2, var1, var3)));
      (var5 as AttachedVideoSinks.VideoOutputSinks).add(var2);
      return var4.element;
   }

   public fun anySinksActive(): Boolean {
      return streamOutputMap.isEmpty() xor true;
   }

   public fun removeSink(mediaEngine: MediaEngine, sink: VideoSink, streamId: String): Boolean {
      val var4: Boolean;
      if (streamOutputMap.compute(var3, new d(new c(var2, var1, var3))) != null) {
         var4 = true;
      } else {
         var4 = false;
      }

      return var4;
   }

   @SourceDebugExtension(["SMAP\nAttachedVideoSinks.kt\nKotlin\n*S Kotlin\n*F\n+ 1 AttachedVideoSinks.kt\ncom/discord/media/engine/video/AttachedVideoSinks$VideoOutputSinks\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,77:1\n1863#2,2:78\n*S KotlinDebug\n*F\n+ 1 AttachedVideoSinks.kt\ncom/discord/media/engine/video/AttachedVideoSinks$VideoOutputSinks\n*L\n71#1:78,2\n*E\n"])
   private class VideoOutputSinks(sink: VideoSink) {
      private final val sinks: MutableSet<VideoSink>

      init {
         val var2: CopyOnWriteArraySet = new CopyOnWriteArraySet();
         this.sinks = var2;
         var2.add(var1);
      }

      public fun add(sink: VideoSink): Boolean {
         return this.sinks.add(var1);
      }

      public fun isEmpty(): Boolean {
         return this.sinks.isEmpty();
      }

      public fun onFrame(frame: VideoFrame, mirror: Boolean): Boolean {
         val var3: java.util.Iterator = this.sinks.iterator();

         while (var3.hasNext()) {
            (var3.next() as VideoSink).onFrame(var1, var2);
         }

         var1.release();
         return true;
      }

      public fun remove(sink: VideoSink): Boolean {
         return this.sinks.remove(var1);
      }
   }
}
