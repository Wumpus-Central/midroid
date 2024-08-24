package com.discord.media.engine.video

import com.discord.media.engine.MediaEngine
import java.util.concurrent.ConcurrentHashMap
import java.util.concurrent.CopyOnWriteArraySet
import kotlin.jvm.functions.Function1
import kotlin.jvm.functions.Function2
import kotlin.jvm.internal.r
import kotlin.jvm.internal.Ref.BooleanRef
import org.webrtc.VideoFrame
import org.webrtc.VideoSink

internal object AttachedVideoSinks {
   private final val streamOutputMap: ConcurrentHashMap<String, com.discord.media.engine.video.AttachedVideoSinks.VideoOutputSinks> = new ConcurrentHashMap()

   @JvmStatic
   fun `addSink$lambda$0`(var0: Function1, var1: Any): AttachedVideoSinks.VideoOutputSinks {
      r.h(var0, "$tmp0");
      return var0.invoke(var1) as AttachedVideoSinks.VideoOutputSinks;
   }

   @JvmStatic
   fun `removeSink$lambda$1`(var0: Function2, var1: Any, var2: Any): AttachedVideoSinks.VideoOutputSinks {
      r.h(var0, "$tmp0");
      return var0.invoke(var1, var2) as AttachedVideoSinks.VideoOutputSinks;
   }

   public fun addSink(mediaEngine: MediaEngine, sink: VideoSink, streamId: String): Boolean {
      r.h(var1, "mediaEngine");
      r.h(var2, "sink");
      r.h(var3, "streamId");
      val var4: BooleanRef = new BooleanRef();
      val var5: Any = streamOutputMap.computeIfAbsent(
         var3, new b(new Function1<java.lang.String, AttachedVideoSinks.VideoOutputSinks>(var4, var2, var1, var3) {
            final BooleanRef $isNewlyCreated;
            final MediaEngine $mediaEngine;
            final VideoSink $sink;
            final java.lang.String $streamId;

            {
               super(1);
               this.$isNewlyCreated = var1;
               this.$sink = var2;
               this.$mediaEngine = var3;
               this.$streamId = var4;
            }

            public final AttachedVideoSinks.VideoOutputSinks invoke(java.lang.String var1) {
               r.h(var1, "it");
               this.$isNewlyCreated.j = true;
               val var2: AttachedVideoSinks.VideoOutputSinks = new AttachedVideoSinks.VideoOutputSinks(this.$sink);
               this.$mediaEngine.setVideoOutputSink$media_engine_release(this.$streamId, new Function1<VideoFrame, java.lang.Boolean>(var2) {
                  {
                     super(1, var1, AttachedVideoSinks.VideoOutputSinks::class.java, "onFrame", "onFrame(Lorg/webrtc/VideoFrame;)Z", 0);
                  }

                  public final java.lang.Boolean invoke(VideoFrame var1) {
                     r.h(var1, "p0");
                     return (super.receiver as AttachedVideoSinks.VideoOutputSinks).onFrame(var1);
                  }
               });
               return var2;
            }
         })
      );
      r.g(var5, "mediaEngine: MediaEngine…)\n            }\n        }");
      (var5 as AttachedVideoSinks.VideoOutputSinks).add(var2);
      return var4.j;
   }

   public fun anySinksActive(): Boolean {
      return streamOutputMap.isEmpty() xor true;
   }

   public fun removeSink(mediaEngine: MediaEngine, sink: VideoSink, streamId: String): Boolean {
      r.h(var1, "mediaEngine");
      r.h(var2, "sink");
      r.h(var3, "streamId");
      val var4: Boolean;
      if (streamOutputMap.compute(
            var3, new a(new Function2<java.lang.String, AttachedVideoSinks.VideoOutputSinks, AttachedVideoSinks.VideoOutputSinks>(var2, var1, var3) {
               final MediaEngine $mediaEngine;
               final VideoSink $sink;
               final java.lang.String $streamId;

               {
                  super(2);
                  this.$sink = var1;
                  this.$mediaEngine = var2;
                  this.$streamId = var3;
               }

               public final AttachedVideoSinks.VideoOutputSinks invoke(java.lang.String var1, AttachedVideoSinks.VideoOutputSinks var2) {
                  r.h(var1, "<anonymous parameter 0>");
                  var var5: AttachedVideoSinks.VideoOutputSinks = null;
                  if (var2 != null) {
                     val var3: MediaEngine = this.$mediaEngine;
                     val var4: java.lang.String = this.$streamId;
                     var2.remove(this.$sink);
                     var5 = var2;
                     if (var2.isEmpty()) {
                        var3.setVideoOutputSink$media_engine_release(var4, null);
                        var5 = null;
                     }
                  }

                  return var5;
               }
            })
         )
         != null) {
         var4 = true;
      } else {
         var4 = false;
      }

      return var4;
   }

   private class VideoOutputSinks(sink: VideoSink) {
      private final val sinks: MutableSet<VideoSink>

      init {
         r.h(var1, "sink");
         super();
         val var2: CopyOnWriteArraySet = new CopyOnWriteArraySet();
         this.sinks = var2;
         var2.add(var1);
      }

      public fun add(sink: VideoSink): Boolean {
         r.h(var1, "sink");
         return this.sinks.add(var1);
      }

      public fun isEmpty(): Boolean {
         return this.sinks.isEmpty();
      }

      public fun onFrame(frame: VideoFrame): Boolean {
         r.h(var1, "frame");
         val var2: java.util.Iterator = this.sinks.iterator();

         while (var2.hasNext()) {
            (var2.next() as VideoSink).onFrame(var1);
         }

         var1.release();
         return true;
      }

      public fun remove(sink: VideoSink): Boolean {
         r.h(var1, "sink");
         return this.sinks.remove(var1);
      }
   }
}
