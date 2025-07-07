package com.discord.media.engine

import com.discord.media.engine.types.Debug
import com.discord.native.engine.NativeConnection
import java.util.LinkedHashMap

internal class MediaEngineNativeConnections {
   private final val connections: MutableMap<Int, NativeConnection> = new LinkedHashMap()

   public operator fun get(connectionId: Int): NativeConnection? {
      return this.connections.get(var1);
   }

   public fun register(connectionId: Int, connection: NativeConnection) {
      kotlin.jvm.internal.r.h(var2, "connection");
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
         val var3: Debug = Debug.INSTANCE;
      } else {
         val var4: Debug = Debug.INSTANCE;
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
