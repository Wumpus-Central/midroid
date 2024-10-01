package com.discord.modules.compressionmanager

import com.discord.logging.Log
import com.discord.misc.utilities.time.TimeElapsed
import com.discord.resource_usage.DeviceResourceUsageRecorder
import com.facebook.react.bridge.ReactApplicationContext
import com.facebook.react.bridge.ReactContextBaseJavaModule
import com.facebook.react.bridge.ReactMethod
import com.facebook.react.bridge.WritableMap
import com.facebook.react.modules.websocket.WebSocketModule
import com.facebook.react.modules.websocket.WebSocketModule.ContentHandler
import com.github.luben.zstd.ZstdBufferDecompressingStream
import java.io.ByteArrayOutputStream
import java.nio.Buffer
import java.nio.ByteBuffer
import java.util.concurrent.ConcurrentHashMap
import java.util.zip.Inflater
import java.util.zip.InflaterOutputStream
import kh.w
import kotlin.jvm.internal.q
import lh.r
import okio.ByteString
import qk.a

public class CompressionManagerModule(reactContext: ReactApplicationContext) : ReactContextBaseJavaModule {
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


   private final val zlibInflaters: MutableMap<Int, Inflater>
   private final val zstdInflaters: MutableMap<Int, com.discord.modules.compressionmanager.CompressionManagerModule.ZstdInflater>

   init {
      q.h(var1, "reactContext");
      super(var1);
      this.zlibInflaters = new ConcurrentHashMap<>();
      this.zstdInflaters = new ConcurrentHashMap<>();
   }

   @ReactMethod
   public fun disableZlibStreamSupport(socketId: Int) {
      val var2: WebSocketModule = this.getWebSocketModule();
      if (var2 != null) {
         var2.setContentHandler(var1, null);
      }

      this.zlibInflaters.remove(var1);
      val var3: CompressionManagerModule.ZstdInflater = this.zstdInflaters.get(var1);
      if (var3 != null) {
         var3.close();
      }

      this.zstdInflaters.remove(var1);
   }

   @ReactMethod
   public fun enableZlibStreamSupport(socketId: Int) {
      val var4: java.util.Map = this.zlibInflaters;
      val var5: Int = var1;
      var var3: Any = var4.get(var5);
      var var2: WebSocketModule = (WebSocketModule)var3;
      if (var3 == null) {
         var2 = new Inflater();
         var4.put(var5, var2);
      }

      var3 = var2 as Inflater;
      var2 = this.getWebSocketModule();
      if (var2 != null) {
         var2.setContentHandler(var1, new CompressionManagerModule.ZlibContentHandler((Inflater)var3));
      }
   }

   @ReactMethod
   public fun enableZstdStreamSupport(socketId: Int, dictionaryId: Int) {
      val var5: java.util.Map = this.zstdInflaters;
      val var6: Int = var1;
      var var4: Any = var5.get(var6);
      var var3: WebSocketModule = (WebSocketModule)var4;
      if (var4 == null) {
         var3 = new CompressionManagerModule.ZstdInflater();
         var5.put(var6, var3);
      }

      var4 = var3 as CompressionManagerModule.ZstdInflater;
      var3 = this.getWebSocketModule();
      if (var3 != null) {
         var3.setContentHandler(var1, new CompressionManagerModule.ZstdContentHandler((CompressionManagerModule.ZstdInflater)var4));
      }
   }

   public open fun getConstants(): MutableMap<String, Boolean> {
      return r.m(new Pair[]{w.a("supportsZstd", java.lang.Boolean.TRUE)});
   }

   public open fun getName(): String {
      return "DCDCompressionManager";
   }

   public companion object {
      private final val logTag: String
   }

   private class ZlibContentHandler(inflater: Inflater) : ContentHandler {
      private final val inflater: Inflater

      init {
         q.h(var1, "inflater");
         super();
         this.inflater = var1;
      }

      public open fun onMessage(text: String?, params: WritableMap) {
         q.h(var2, "params");
         var2.putString("data", var1);
         if (var1 != null) {
            DeviceResourceUsageRecorder.Companion.setSocketBytesReceived(DeviceResourceUsageRecorder.Companion.getSocketBytesReceived() + (long)var1.length());
         }
      }

      public open fun onMessage(byteString: ByteString, params: WritableMap) {
         q.h(var1, "byteString");
         q.h(var2, "params");
         val var6: TimeElapsed = new TimeElapsed(0L, 1, null);
         val var4: java.lang.String = new CompressionManagerModule.ZlibContentHandler.ZLibByteStream(var1, this.inflater).toDecodedString();
         if (var6.getDurationMillis() > 100L) {
            val var5: Log = Log.INSTANCE;
            val var3: java.lang.String = CompressionManagerModule.access$getLogTag$cp();
            q.g(var3, "access$getLogTag$cp(...)");
            val var9: java.lang.String = var6.getDuration();
            val var7: StringBuilder = new StringBuilder();
            var7.append("Decompressed ZLib message in ");
            var7.append(var9);
            Log.i$default(var5, var3, var7.toString(), null, 4, null);
         }

         var2.putString("type", "text");
         var2.putString("data", var4);
         var2.putInt("raw_length", var1.z());
         DeviceResourceUsageRecorder.Companion.setSocketBytesReceived(DeviceResourceUsageRecorder.Companion.getSocketBytesReceived() + (long)var1.z());
      }

      private class ZLibByteStream(bytes: ByteString, inflater: Inflater) : ByteArrayOutputStream {
         init {
            q.h(var1, "bytes");
            q.h(var2, "inflater");
            super(var1.z() * 2);
            val var3: InflaterOutputStream = new InflaterOutputStream(this, var2, 4096);
            var1.F(var3);
            var3.flush();
         }

         public fun toDecodedString(): String {
            val var1: ByteArray = this.buf;
            q.g(this.buf, "buf");
            return new java.lang.String(var1, 0, this.count, a.b);
         }

         public companion object {
            private const val INFLATE_BUFFER_SIZE: Int
            private const val INITIAL_BUFFER_SIZE_MULTIPLIER: Int
         }
      }
   }

   private class ZstdContentHandler(inflater: com.discord.modules.compressionmanager.CompressionManagerModule.ZstdInflater) : ContentHandler {
      private final val inflater: com.discord.modules.compressionmanager.CompressionManagerModule.ZstdInflater

      init {
         q.h(var1, "inflater");
         super();
         this.inflater = var1;
      }

      public open fun onMessage(text: String?, params: WritableMap) {
         q.h(var2, "params");
         var2.putString("data", var1);
         if (var1 != null) {
            DeviceResourceUsageRecorder.Companion.setSocketBytesReceived(DeviceResourceUsageRecorder.Companion.getSocketBytesReceived() + (long)var1.length());
         }
      }

      public open fun onMessage(byteString: ByteString, params: WritableMap) {
         q.h(var1, "byteString");
         q.h(var2, "params");
         val var6: TimeElapsed = new TimeElapsed(0L, 1, null);
         val var5: java.lang.String = this.inflater.decompress(var1);
         if (var6.getDurationMillis() > 100L) {
            val var3: Log = Log.INSTANCE;
            val var4: java.lang.String = CompressionManagerModule.access$getLogTag$cp();
            q.g(var4, "access$getLogTag$cp(...)");
            val var9: java.lang.String = var6.getDuration();
            val var7: StringBuilder = new StringBuilder();
            var7.append("Decompressed ZLib message in ");
            var7.append(var9);
            Log.i$default(var3, var4, var7.toString(), null, 4, null);
         }

         var2.putString("type", "text");
         var2.putString("data", var5);
         var2.putInt("raw_length", var1.z());
         DeviceResourceUsageRecorder.Companion.setSocketBytesReceived(DeviceResourceUsageRecorder.Companion.getSocketBytesReceived() + (long)var1.z());
      }
   }

   private class ZstdInflater : ZstdBufferDecompressingStream(ByteBuffer.allocate(0)) {
      private final var nextBuffer: ByteBuffer = ByteBuffer.allocate(0)

      public fun decompress(byteString: ByteString): String {
         q.h(var1, "byteString");
         this.nextBuffer = ByteBuffer.wrap(var1.C());
         val var6: java.util.List = i.T0(i.k());
         var var2: Int = Math.max(var1.z() * 2, 1024);
         var var8: ByteBuffer = ByteBuffer.allocate(var2);
         if (this.read(var8) != 0) {
            throw new UnsupportedOperationException("Error in zstd: still had data when trying to refill buffer");
         } else {
            var var4: Int = 1;

            for (int var3 = 0; var4 < 51; var4++) {
               val var5: Int = this.read(var8);
               var3 += var5;
               if (var5 == 0) {
                  if (var6.size() == 1) {
                     val var11: ByteArray = (var6.get(0) as ByteBuffer).array();
                     q.g(var11, "array(...)");
                     return new java.lang.String(var11, 0, var3, a.b);
                  }

                  val var9: ByteBuffer = ByteBuffer.allocate(var3);

                  for (ByteBuffer var12 : var6) {
                     ((Buffer)var12).flip();
                     var9.put(var12);
                  }

                  val var10: ByteArray = var9.array();
                  q.g(var10, "array(...)");
                  return new java.lang.String(var10, a.b);
               }

               var2 = Math.max(var2, var5 * 2);
               q.e(var8);
               var6.add(var8);
               var8 = ByteBuffer.allocate(var2);
            }

            throw new UnsupportedOperationException("Unable to decompress");
         }
      }

      protected open fun refill(currentBuffer: ByteBuffer): ByteBuffer {
         q.h(var1, "currentBuffer");
         var1 = this.nextBuffer;
         q.g(this.nextBuffer, "nextBuffer");
         return var1;
      }

      public companion object {
         private const val INITIAL_BUFFER_SIZE_MULTIPLIER: Int
      }
   }
}
