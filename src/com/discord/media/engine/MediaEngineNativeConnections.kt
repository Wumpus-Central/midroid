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
      kotlin.jvm.internal.q.h(var2, "connection");
      if (this.connections.containsKey(var1) xor true) {
         if (this.connections.containsValue(var2) xor true) {
            this.connections.put(var1, var2);
            val var3: Debug = Debug.INSTANCE;
         } else {
            throw new IllegalStateException("Check failed.".toString());
         }
      } else {
         throw new IllegalStateException("Check failed.".toString());
      }
   }

   public fun removeAndDispose(connectionId: Int) {
      val var2: NativeConnection = this.connections.remove(var1);
      val var4: Unit;
      if (var2 != null) {
         System.nanoTime();
         var2.dispose();
         val var3: Debug = Debug.INSTANCE;
         var4 = Unit.a;
      } else {
         var4 = null;
      }

      if (var4 == null) {
         val var5: Debug = Debug.INSTANCE;
      }
   }

   public fun removeAndDisposeAll() {
      val var1: java.util.Iterator = this.connections.keySet().iterator();

      while (var1.hasNext()) {
         this.removeAndDispose((var1.next() as java.lang.Number).intValue());
      }

      if (!this.connections.isEmpty()) {
         throw new IllegalStateException("Check failed.".toString());
      }
   }

   public companion object {
      private const val TAG: String
   }
}
