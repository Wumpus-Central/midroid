package com.discord.media.engine

import com.discord.media.engine.types.Debug
import com.discord.native.engine.NativeConnection
import java.util.LinkedHashMap
import kotlin.jvm.internal.SourceDebugExtension

@SourceDebugExtension(["SMAP\nMediaEngineNativeConnections.kt\nKotlin\n*S Kotlin\n*F\n+ 1 MediaEngineNativeConnections.kt\ncom/discord/media/engine/MediaEngineNativeConnections\n+ 2 Debug.kt\ncom/discord/media/engine/types/Debug\n+ 3 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,43:1\n38#2,4:44\n44#2,7:48\n38#2,4:55\n1863#3,2:59\n*S KotlinDebug\n*F\n+ 1 MediaEngineNativeConnections.kt\ncom/discord/media/engine/MediaEngineNativeConnections\n*L\n23#1:44,4\n30#1:48,7\n31#1:55,4\n35#1:59,2\n*E\n"])
internal class MediaEngineNativeConnections {
   private final val connections: MutableMap<Int, NativeConnection> = new LinkedHashMap()

   public operator fun get(connectionId: Int): NativeConnection? {
      return this.connections.get(var1);
   }

   public fun register(connectionId: Int, connection: NativeConnection) {
      if (!this.connections.containsKey(var1)) {
         if (!this.connections.containsValue(var2)) {
            this.connections.put(var1, var2);
            val var3: Debug = Debug.INSTANCE;
         } else {
            throw new IllegalStateException("Check failed.");
         }
      } else {
         throw new IllegalStateException("Check failed.");
      }
   }

   public fun removeAndDispose(connectionId: Int) {
      val var2: NativeConnection = this.connections.remove(var1);
      if (var2 != null) {
         System.nanoTime();
         var2.dispose();
         val var4: Debug = Debug.INSTANCE;
      } else {
         val var3: Debug = Debug.INSTANCE;
      }
   }

   public fun removeAndDisposeAll() {
      val var1: java.util.Iterator = this.connections.keySet().iterator();

      while (var1.hasNext()) {
         this.removeAndDispose((var1.next() as java.lang.Number).intValue());
      }

      if (!this.connections.isEmpty()) {
         throw new IllegalStateException("Check failed.");
      }
   }

   public companion object {
      private const val TAG: String
   }
}
