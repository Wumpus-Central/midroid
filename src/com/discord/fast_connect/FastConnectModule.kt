package com.discord.fast_connect

import com.discord.app_database.AppDatabase
import com.discord.app_database.DatabaseVersions
import com.discord.cache.Cache
import com.discord.codegen.NativeFastConnectModuleSpec
import com.discord.logging.Log
import com.discord.tti_manager.TTIMetrics
import com.facebook.react.bridge.ReactApplicationContext
import com.facebook.react.modules.websocket.WebSocketModule
import com.facebook.react.modules.websocket.WebSocketModule.OnOpenHandler
import java.util.concurrent.ConcurrentHashMap
import kotlin.jvm.internal.q
import okhttp3.WebSocket
import s9.s

internal class FastConnectModule(reactContext: ReactApplicationContext) : NativeFastConnectModuleSpec {
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


   private final var identified: Boolean
   private final var socketId: Int?
   private final var identifyUserId: String?
   private final var identifyPayload: String
   private final var requiredDatabaseVersion: String?

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
         val var4: DatabaseVersions = AppDatabase.INSTANCE.getGuildVersions(this.identifyUserId, this.requiredDatabaseVersion);
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
      val var3: Cache = Cache.Companion.get();
      if (var2 == null) {
         var3.removeItem(var1);
      } else {
         var3.setItem(var1, var2);
      }
   }

   protected override fun getTypedExportedConstants(): MutableMap<String, String?> {
      val var1: Cache.Companion = Cache.Companion;
      return t9.q.m(
         new Pair[]{
            s.a("clientState", Cache.Companion.get().getItem("_clientStateKey")),
            s.a("userId", var1.get().getItem("_userIdKey")),
            s.a("token", Cache.getToken$default(var1.get(), false, 1, null))
         }
      );
   }

   public open fun initialize() {
      super.initialize();
      val var1: WebSocketModule = this.getWebSocketModule();
      if (var1 != null) {
         var1.setMOnOpenHandler(new OnOpenHandler(this) {
            final FastConnectModule this$0;

            {
               this.this$0 = var1;
            }

            public void onOpen(WebSocket var1, int var2) {
               q.h(var1, "webSocket");
               FastConnectModule.access$handleWebSocketOpen(this.this$0, var1, var2);
            }
         });
      }
   }

   public open fun invalidate() {
      super.invalidate();
      val var1: WebSocketModule = this.getWebSocketModule();
      if (var1 != null) {
         var1.setMOnOpenHandler(null);
      }
   }

   public override fun prepareIdentify(userId: String?, payload: String, socketId: Double, requiredDatabaseVersion: String?) {
      q.h(var2, "payload");
      val var6: Int = (int)var3;
      this.socketId = (int)var3;
      this.identifyUserId = var1;
      this.identifyPayload = var2;
      this.requiredDatabaseVersion = var5;
      this.sendIdentify(this.sockets.get(var6), var6);
   }

   public override fun setClientState(userId: String?, clientState: String?) {
      this.setCacheValue("_userIdKey", var1);
      this.setCacheValue("_clientStateKey", var2);
   }
}
