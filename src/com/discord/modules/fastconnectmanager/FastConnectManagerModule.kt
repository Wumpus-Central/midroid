package com.discord.modules.fastconnectmanager

import ch.w
import com.discord.app_database.AppDatabaseModule
import com.discord.app_database.DatabaseVersions
import com.discord.cache.CacheModule
import com.discord.logging.Log
import com.discord.tti_manager.TTIMetrics
import com.facebook.react.bridge.ReactApplicationContext
import com.facebook.react.bridge.ReactContextBaseJavaModule
import com.facebook.react.bridge.ReactMethod
import com.facebook.react.modules.websocket.WebSocketModule
import dh.r
import java.util.concurrent.ConcurrentHashMap
import kotlin.jvm.internal.q
import o3.a
import okhttp3.WebSocket

public class FastConnectManagerModule(reactContext: ReactApplicationContext) : ReactContextBaseJavaModule {
   private final var identified: Boolean
   private final var identifyPayload: String
   private final var identifyUserId: String?
   private final var requiredDatabaseVersion: String?
   private final var socketId: Int?
   private final val sockets: ConcurrentHashMap<Int, WebSocket>

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
      q.h(var1, "reactContext");
      super(var1);
      this.sockets = new ConcurrentHashMap<>();
      this.identifyPayload = "";
   }

   private fun handleWebSocketOpen(webSocket: WebSocket, socketId: Int) {
      TTIMetrics.record$default(TTIMetrics.INSTANCE, "Native WebSocket opened", 0L, null, false, 14, null);
      if (!this.sendIdentify(var1, var2)) {
         this.sockets.put(var2, var1);
      }
   }

   private fun sendIdentify(webSocket: WebSocket?, socketId: Int): Boolean {
      if (var1 != null && this.socketId != null && var2 == this.socketId && !this.identified) {
         var var7: java.lang.String = this.identifyUserId;
         val var4: DatabaseVersions = AppDatabaseModule.Companion.getGuildVersions(this.identifyUserId, this.requiredDatabaseVersion);
         if (var7 != null) {
            var7 = IdentifyPayload.INSTANCE.withGuildVersions(this.identifyPayload, var4);
         } else {
            var7 = this.identifyPayload;
         }

         if (!q.c(this.identifyPayload, var7)) {
            val var5: Log = Log.INSTANCE;
            var2 = var4.getGuildVersions().length;
            val var9: StringBuilder = new StringBuilder();
            var9.append(var2);
            var9.append(" guild_versions added to identify payload");
            Log.i$default(var5, "FastConnectManagerModule", var9.toString(), null, 4, null);
         }

         TTIMetrics.record$default(TTIMetrics.INSTANCE, "Native WebSocket sent identify", 0L, null, false, 14, null);
         var1.send(var7);
         this.identified = true;
         return true;
      } else {
         return false;
      }
   }

   private fun setCacheValue(key: String, value: String?) {
      val var4: CacheModule.Companion = CacheModule.Companion;
      val var3: ReactApplicationContext = this.getReactApplicationContext();
      q.g(var3, "getReactApplicationContext(...)");
      val var5: CacheModule = var4.get(var3);
      if (var2 == null) {
         var5.removeItem(var1);
      } else {
         var5.setItem(var1, var2);
      }
   }

   public open fun getConstants(): MutableMap<String, String?> {
      val var1: CacheModule.Companion = CacheModule.Companion;
      val var2: ReactApplicationContext = this.getReactApplicationContext();
      q.g(var2, "getReactApplicationContext(...)");
      val var5: Pair = w.a("clientState", var1.get(var2).getItem("_clientStateKey"));
      val var3: ReactApplicationContext = this.getReactApplicationContext();
      q.g(var3, "getReactApplicationContext(...)");
      val var6: Pair = w.a("userId", var1.get(var3).getItem("_userIdKey"));
      val var4: ReactApplicationContext = this.getReactApplicationContext();
      q.g(var4, "getReactApplicationContext(...)");
      return r.m(new Pair[]{var5, var6, w.a("token", CacheModule.getToken$default(var1.get(var4), false, 1, null))});
   }

   public open fun getName(): String {
      return "DCDFastConnectManager";
   }

   public open fun initialize() {
      super.initialize();
      val var1: WebSocketModule = this.getWebSocketModule();
      if (var1 != null) {
         var1.mOnOpenHandler = new a(this);
      }
   }

   public open fun invalidate() {
      super.invalidate();
      val var1: WebSocketModule = this.getWebSocketModule();
      if (var1 != null) {
         var1.mOnOpenHandler = null;
      }
   }

   @ReactMethod
   public fun prepareIdentify(userId: String?, payload: String, socketId: Int, requiredDatabaseVersion: String?) {
      q.h(var2, "payload");
      this.socketId = var3;
      this.identifyUserId = var1;
      this.identifyPayload = var2;
      this.requiredDatabaseVersion = var4;
      this.sendIdentify(this.sockets.get(var3), var3);
   }

   @ReactMethod
   public fun setClientState(userId: String?, clientState: String?) {
      this.setCacheValue("_userIdKey", var1);
      this.setCacheValue("_clientStateKey", var2);
   }
}
