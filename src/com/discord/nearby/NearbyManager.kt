package com.discord.nearby

import android.content.Context
import com.google.android.gms.nearby.messages.Message
import com.google.android.gms.nearby.messages.SubscribeOptions
import kotlin.jvm.functions.Function1
import kotlin.jvm.internal.r
import o6.d
import o6.h
import o6.i

internal class NearbyManager(onFoundUser: (String) -> Unit, onLostUser: (String) -> Unit, onError: (String) -> Unit) : o6.b {
   private final val onFoundUser: (String) -> Unit
   private final val onLostUser: (String) -> Unit
   private final val onError: (String) -> Unit
   private final val subscribeOptions: SubscribeOptions
   private final val statusCallback: <unrepresentable>
   private final lateinit var outboundMessage: Message

   init {
      r.h(var1, "onFoundUser");
      r.h(var2, "onLostUser");
      r.h(var3, "onError");
      super();
      this.onFoundUser = var1;
      this.onLostUser = var2;
      this.onError = var3;
      val var4: SubscribeOptions = new com.google.android.gms.nearby.messages.SubscribeOptions.a().b(i.r).a();
      r.g(var4, "build(...)");
      this.subscribeOptions = var4;
      this.statusCallback = new h(this) {
         final NearbyManager this$0;

         {
            this.this$0 = var1;
         }

         public void onPermissionChanged(boolean var1) {
            super.onPermissionChanged(var1);
            if (!var1) {
               NearbyManager.access$getOnError$p(this.this$0).invoke("1");
            }
         }
      };
   }

   public fun disableNearby(context: Context) {
      r.h(var1, "context");
      val var3: d = l6.a.a(var1);
      var3.d(this.statusCallback);
      var var4: Message = this.outboundMessage;
      if (this.outboundMessage == null) {
         r.y("outboundMessage");
         var4 = null;
      }

      var3.e(var4);
      var3.g(this);
   }

   public fun enableNearby(context: Context) {
      r.h(var1, "context");
      var var2: Message = this.outboundMessage;
      if (this.outboundMessage == null) {
         r.y("outboundMessage");
         var2 = null;
      }

      val var4: d = l6.a.a(var1);
      var4.h(this.statusCallback);
      var4.j(var2);
      var4.i(this, this.subscribeOptions);
   }

   public open fun onFound(message: Message) {
      r.h(var1, "message");
      super.onFound(var1);
      val var2: Function1 = this.onFoundUser;
      val var3: ByteArray = var1.p();
      r.g(var3, "getContent(...)");
      var2.invoke(new java.lang.String(var3, gb.a.b));
   }

   public open fun onLost(message: Message) {
      r.h(var1, "message");
      super.onLost(var1);
      val var2: Function1 = this.onLostUser;
      val var3: ByteArray = var1.p();
      r.g(var3, "getContent(...)");
      var2.invoke(new java.lang.String(var3, gb.a.b));
   }

   public fun setOutboundMessage(message: String) {
      r.h(var1, "message");
      val var2: ByteArray = var1.getBytes(gb.a.b);
      r.g(var2, "getBytes(...)");
      this.outboundMessage = new Message(var2);
   }

   public companion object {
      public const val PERMISSION_DENIED: String
   }
}
