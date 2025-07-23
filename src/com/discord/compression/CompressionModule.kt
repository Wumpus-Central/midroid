package com.discord.compression

import A9.q
import com.discord.codegen.NativeCompressionModuleSpec
import com.discord.logging.Log
import com.discord.misc.utilities.time.TimeElapsed
import com.discord.resource_usage.DeviceResourceUsageRecorder
import com.facebook.react.bridge.ReactApplicationContext
import com.facebook.react.bridge.WritableMap
import com.facebook.react.modules.websocket.WebSocketModule
import com.facebook.react.modules.websocket.WebSocketModule.ContentHandler
import com.github.luben.zstd.ZstdBufferDecompressingStream
import gb.a
import java.io.ByteArrayOutputStream
import java.nio.Buffer
import java.nio.ByteBuffer
import java.util.concurrent.ConcurrentHashMap
import java.util.zip.Inflater
import java.util.zip.InflaterOutputStream
import kotlin.jvm.internal.r
import okio.ByteString
import z9.s

public class CompressionModule(reactContext: ReactApplicationContext) : NativeCompressionModuleSpec {
   private final val zlibInflaters: MutableMap<Int, Inflater>
   private final val zstdInflaters: MutableMap<Int, com.discord.compression.CompressionModule.ZstdInflater>

   private final val webSocketModule: WebSocketModule?
      private final get() {
         val var1: ReactApplicationContext = this.getReactApplicationContextIfActiveOrWarn();
         val var2: WebSocketModule;
         if (var1 != null) {
            var2 = var1.getNativeModule(WebSocketModule.class) as WebSocketModule;
         } else {
            var2 = null;
         }

         return var2;
      }


   init {
      r.h(var1, "reactContext");
      super(var1);
      this.zlibInflaters = new ConcurrentHashMap<>();
      this.zstdInflaters = new ConcurrentHashMap<>();
   }

   public override fun disableZlibStreamSupport(socketId: Double) {
      val var3: Int = (int)var1;
      val var4: WebSocketModule = this.getWebSocketModule();
      if (var4 != null) {
         var4.setContentHandler(var3, null);
      }

      this.zlibInflaters.remove(var3);
      val var5: CompressionModule.ZstdInflater = this.zstdInflaters.get(var3);
      if (var5 != null) {
         var5.close();
      }

      this.zstdInflaters.remove(var3);
   }

   public override fun enableZlibStreamSupport(socketId: Double) {
      val var3: Int = (int)var1;
      val var7: java.util.Map = this.zlibInflaters;
      val var6: Int = var3;
      var var5: WebSocketModule = (WebSocketModule)var7.get(var6);
      var var4: Any = var5;
      if (var5 == null) {
         var4 = new Inflater();
         var7.put(var6, var4);
      }

      var4 = var4 as Inflater;
      var5 = this.getWebSocketModule();
      if (var5 != null) {
         var5.setContentHandler(var3, new CompressionModule.ZlibContentHandler((Inflater)var4));
      }
   }

   public override fun enableZstdStreamSupport(socketId: Double) {
      val var3: Int = (int)var1;
      val var7: java.util.Map = this.zstdInflaters;
      val var6: Int = var3;
      var var5: WebSocketModule = (WebSocketModule)var7.get(var6);
      var var4: Any = var5;
      if (var5 == null) {
         var4 = new CompressionModule.ZstdInflater();
         var7.put(var6, var4);
      }

      var4 = var4 as CompressionModule.ZstdInflater;
      var5 = this.getWebSocketModule();
      if (var5 != null) {
         var5.setContentHandler(var3, new CompressionModule.ZstdContentHandler((CompressionModule.ZstdInflater)var4));
      }
   }

   protected override fun getTypedExportedConstants(): MutableMap<String, Any> {
      return q.m(new Pair[]{s.a("supportsZstd", java.lang.Boolean.TRUE)});
   }

   public companion object {
      private final val logTag: String
   }

   private class ZlibContentHandler(inflater: Inflater) : ContentHandler {
      private final val inflater: Inflater

      init {
         r.h(var1, "inflater");
         super();
         this.inflater = var1;
      }

      public open fun onMessage(text: String, params: WritableMap) {
         r.h(var1, "text");
         r.h(var2, "params");
         var2.putString("data", var1);
         DeviceResourceUsageRecorder.Companion.setSocketBytesReceived(DeviceResourceUsageRecorder.Companion.getSocketBytesReceived() + (long)var1.length());
      }

      public open fun onMessage(byteString: ByteString, params: WritableMap) {
         r.h(var1, "byteString");
         r.h(var2, "params");
         val var6: TimeElapsed = new TimeElapsed(0L, 1, null);
         val var4: java.lang.String = new CompressionModule.ZlibContentHandler.ZLibByteStream(var1, this.inflater).toDecodedString();
         if (var6.getDurationMillis() > 100L) {
            val var3: Log = Log.INSTANCE;
            val var5: java.lang.String = CompressionModule.access$getLogTag$cp();
            r.g(var5, "access$getLogTag$cp(...)");
            val var9: java.lang.String = var6.getDuration();
            val var7: StringBuilder = new StringBuilder();
            var7.append("Decompressed ZLib message in ");
            var7.append(var9);
            Log.i$default(var3, var5, var7.toString(), null, 4, null);
         }

         var2.putString("type", "text");
         var2.putString("data", var4);
         var2.putInt("raw_length", var1.D());
         DeviceResourceUsageRecorder.Companion.setSocketBytesReceived(DeviceResourceUsageRecorder.Companion.getSocketBytesReceived() + (long)var1.D());
      }

      private class ZLibByteStream(bytes: ByteString, inflater: Inflater) : ByteArrayOutputStream {
         init {
            r.h(var1, "bytes");
            r.h(var2, "inflater");
            super(var1.D() * 2);
            val var3: InflaterOutputStream = new InflaterOutputStream(this, var2, 4096);
            var1.I(var3);
            var3.flush();
         }

         public fun toDecodedString(): String {
            val var1: ByteArray = this.buf;
            r.g(this.buf, "buf");
            return new java.lang.String(var1, 0, this.count, a.b);
         }

         public companion object {
            private const val INITIAL_BUFFER_SIZE_MULTIPLIER: Int
            private const val INFLATE_BUFFER_SIZE: Int
         }
      }
   }

   private class ZstdContentHandler(inflater: com.discord.compression.CompressionModule.ZstdInflater) : ContentHandler {
      private final val inflater: com.discord.compression.CompressionModule.ZstdInflater

      init {
         r.h(var1, "inflater");
         super();
         this.inflater = var1;
      }

      public open fun onMessage(text: String, params: WritableMap) {
         r.h(var1, "text");
         r.h(var2, "params");
         var2.putString("data", var1);
         DeviceResourceUsageRecorder.Companion.setSocketBytesReceived(DeviceResourceUsageRecorder.Companion.getSocketBytesReceived() + (long)var1.length());
      }

      public open fun onMessage(byteString: ByteString, params: WritableMap) {
         r.h(var1, "byteString");
         r.h(var2, "params");
         val var6: TimeElapsed = new TimeElapsed(0L, 1, null);
         val var3: java.lang.String = this.inflater.decompress(var1);
         if (var6.getDurationMillis() > 100L) {
            val var5: Log = Log.INSTANCE;
            val var4: java.lang.String = CompressionModule.access$getLogTag$cp();
            r.g(var4, "access$getLogTag$cp(...)");
            val var9: java.lang.String = var6.getDuration();
            val var7: StringBuilder = new StringBuilder();
            var7.append("Decompressed ZLib message in ");
            var7.append(var9);
            Log.i$default(var5, var4, var7.toString(), null, 4, null);
         }

         var2.putString("type", "text");
         var2.putString("data", var3);
         var2.putInt("raw_length", var1.D());
         DeviceResourceUsageRecorder.Companion.setSocketBytesReceived(DeviceResourceUsageRecorder.Companion.getSocketBytesReceived() + (long)var1.D());
      }
   }

   private class ZstdInflater : ZstdBufferDecompressingStream(ByteBuffer.allocate(0)) {
      private final var nextBuffer: ByteBuffer = ByteBuffer.allocate(0)

      public fun decompress(byteString: ByteString): String {
         r.h(var1, "byteString");
         this.nextBuffer = ByteBuffer.wrap(var1.G());
         val var6: java.util.List = i.W0(i.k());
         var var2: Int = Math.max(var1.D() * 2, 1024);
         var var8: ByteBuffer = ByteBuffer.allocate(var2);
         if (this.read(var8) != 0) {
            throw new UnsupportedOperationException("Error in zstd: still had data when trying to refill buffer");
         } else {
            var var3: Int = 1;

            for (int var4 = 0; var3 < 51; var3++) {
               val var5: Int = this.read(var8);
               var4 += var5;
               if (var5 == 0) {
                  if (var6.size() == 1) {
                     val var11: ByteArray = (var6.get(0) as ByteBuffer).array();
                     r.g(var11, "array(...)");
                     return new java.lang.String(var11, 0, var4, a.b);
                  }

                  val var9: ByteBuffer = ByteBuffer.allocate(var4);

                  for (ByteBuffer var12 : var6) {
                     ((Buffer)var12).flip();
                     var9.put(var12);
                  }

                  val var10: ByteArray = var9.array();
                  r.g(var10, "array(...)");
                  return new java.lang.String(var10, a.b);
               }

               var2 = Math.max(var2, var5 * 2);
               r.e(var8);
               var6.add(var8);
               var8 = ByteBuffer.allocate(var2);
            }

            throw new UnsupportedOperationException("Unable to decompress");
         }
      }

      protected open fun refill(currentBuffer: ByteBuffer): ByteBuffer {
         r.h(var1, "currentBuffer");
         var1 = this.nextBuffer;
         r.g(this.nextBuffer, "nextBuffer");
         return var1;
      }

      public companion object {
         private const val INITIAL_BUFFER_SIZE_MULTIPLIER: Int
      }
   }
}
