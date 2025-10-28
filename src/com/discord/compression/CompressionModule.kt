package com.discord.compression

import B9.s
import com.discord.codegen.NativeCompressionModuleSpec
import com.discord.logging.Log
import com.discord.misc.utilities.time.TimeElapsed
import com.discord.resource_usage.DeviceResourceUsageRecorder
import com.facebook.react.bridge.ReactApplicationContext
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
import kotlin.jvm.internal.SourceDebugExtension
import okio.ByteString

@SourceDebugExtension(["SMAP\nCompressionModule.kt\nKotlin\n*S Kotlin\n*F\n+ 1 CompressionModule.kt\ncom/discord/compression/CompressionModule\n+ 2 Maps.kt\nkotlin/collections/MapsKt__MapsKt\n*L\n1#1,195:1\n381#2,7:196\n381#2,7:203\n*S KotlinDebug\n*F\n+ 1 CompressionModule.kt\ncom/discord/compression/CompressionModule\n*L\n35#1:196,7\n60#1:203,7\n*E\n"])
public class CompressionModule(reactContext: ReactApplicationContext) : NativeCompressionModuleSpec(var1) {
   private final val zlibInflaters: MutableMap<Int, Inflater> = new ConcurrentHashMap()
   private final val zstdInflaters: MutableMap<Int, com.discord.compression.CompressionModule.ZstdInflater> = new ConcurrentHashMap()

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
      var var5: Any = var7.get(var6);
      var var4: WebSocketModule = (WebSocketModule)var5;
      if (var5 == null) {
         var4 = new Inflater();
         var7.put(var6, var4);
      }

      var5 = var4 as Inflater;
      var4 = this.getWebSocketModule();
      if (var4 != null) {
         var4.setContentHandler(var3, new CompressionModule.ZlibContentHandler((Inflater)var5));
      }
   }

   public override fun enableZstdStreamSupport(socketId: Double) {
      val var3: Int = (int)var1;
      val var7: java.util.Map = this.zstdInflaters;
      val var6: Int = var3;
      var var5: Any = var7.get(var6);
      var var4: WebSocketModule = (WebSocketModule)var5;
      if (var5 == null) {
         var4 = new CompressionModule.ZstdInflater();
         var7.put(var6, var4);
      }

      var5 = var4 as CompressionModule.ZstdInflater;
      var4 = this.getWebSocketModule();
      if (var4 != null) {
         var4.setContentHandler(var3, new CompressionModule.ZstdContentHandler((CompressionModule.ZstdInflater)var5));
      }
   }

   protected override fun getTypedExportedConstants(): MutableMap<String, Any> {
      return L.m(new Pair[]{s.a("supportsZstd", java.lang.Boolean.TRUE)});
   }

   public companion object {
      private final val logTag: String
   }

   private class ZlibContentHandler(inflater: Inflater) : ContentHandler {
      private final val inflater: Inflater

      init {
         this.inflater = var1;
      }

      public open fun onMessage(text: String, params: WritableMap) {
         var2.putString("data", var1);
         DeviceResourceUsageRecorder.Companion.setSocketBytesReceived(DeviceResourceUsageRecorder.Companion.getSocketBytesReceived() + (long)var1.length());
      }

      public open fun onMessage(byteString: ByteString, params: WritableMap) {
         val var6: TimeElapsed = new TimeElapsed(0L, 1, null);
         val var3: java.lang.String = new CompressionModule.ZlibContentHandler.ZLibByteStream(var1, this.inflater).toDecodedString();
         if (var6.getDurationMillis() > 100L) {
            val var4: Log = Log.INSTANCE;
            val var5: java.lang.String = CompressionModule.access$getLogTag$cp();
            val var9: java.lang.String = var6.getDuration();
            val var7: StringBuilder = new StringBuilder();
            var7.append("Decompressed ZLib message in ");
            var7.append(var9);
            Log.i$default(var4, var5, var7.toString(), null, 4, null);
         }

         var2.putString("type", "text");
         var2.putString("data", var3);
         var2.putInt("raw_length", var1.C());
         DeviceResourceUsageRecorder.Companion.setSocketBytesReceived(DeviceResourceUsageRecorder.Companion.getSocketBytesReceived() + (long)var1.C());
      }

      private class ZLibByteStream(bytes: ByteString, inflater: Inflater) : ByteArrayOutputStream(var1.C() * 2) {
         init {
            val var3: InflaterOutputStream = new InflaterOutputStream(this, var2, 4096);
            var1.H(var3);
            var3.flush();
         }

         public fun toDecodedString(): String {
            val var1: ByteArray = this.buf;
            return new java.lang.String(var1, 0, this.count, Charsets.UTF_8);
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
         this.inflater = var1;
      }

      public open fun onMessage(text: String, params: WritableMap) {
         var2.putString("data", var1);
         DeviceResourceUsageRecorder.Companion.setSocketBytesReceived(DeviceResourceUsageRecorder.Companion.getSocketBytesReceived() + (long)var1.length());
      }

      public open fun onMessage(byteString: ByteString, params: WritableMap) {
         val var6: TimeElapsed = new TimeElapsed(0L, 1, null);
         val var3: java.lang.String = this.inflater.decompress(var1);
         if (var6.getDurationMillis() > 100L) {
            val var5: Log = Log.INSTANCE;
            val var4: java.lang.String = CompressionModule.access$getLogTag$cp();
            val var7: java.lang.String = var6.getDuration();
            val var9: StringBuilder = new StringBuilder();
            var9.append("Decompressed ZLib message in ");
            var9.append(var7);
            Log.i$default(var5, var4, var9.toString(), null, 4, null);
         }

         var2.putString("type", "text");
         var2.putString("data", var3);
         var2.putInt("raw_length", var1.C());
         DeviceResourceUsageRecorder.Companion.setSocketBytesReceived(DeviceResourceUsageRecorder.Companion.getSocketBytesReceived() + (long)var1.C());
      }
   }

   private class ZstdInflater : ZstdBufferDecompressingStream(ByteBuffer.allocate(0)) {
      private final var nextBuffer: ByteBuffer = ByteBuffer.allocate(0)

      public fun decompress(byteString: ByteString): String {
         this.nextBuffer = ByteBuffer.wrap(var1.F());
         val var6: java.util.List = CollectionsKt.V0(CollectionsKt.k());
         var var2: Int = Math.max(var1.C() * 2, 1024);
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
                     return new java.lang.String(var11, 0, var3, Charsets.UTF_8);
                  }

                  val var9: ByteBuffer = ByteBuffer.allocate(var3);

                  for (ByteBuffer var7 : var6) {
                     ((Buffer)var7).flip();
                     var9.put(var7);
                  }

                  val var10: ByteArray = var9.array();
                  return new java.lang.String(var10, Charsets.UTF_8);
               }

               var2 = Math.max(var2, var5 * 2);
               var6.add(var8);
               var8 = ByteBuffer.allocate(var2);
            }

            throw new UnsupportedOperationException("Unable to decompress");
         }
      }

      protected open fun refill(currentBuffer: ByteBuffer): ByteBuffer {
         var1 = this.nextBuffer;
         return var1;
      }

      public companion object {
         private const val INITIAL_BUFFER_SIZE_MULTIPLIER: Int
      }
   }
}
