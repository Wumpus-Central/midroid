package com.discord.nearby

import android.content.Context
import com.google.android.gms.nearby.messages.Message
import com.google.android.gms.nearby.messages.SubscribeOptions
import com.google.android.gms.nearby.messages.SubscribeOptions.a
import jb.b
import jb.d
import jb.h
import jb.i
import kotlin.jvm.functions.Function1
import kotlin.jvm.internal.q

internal class NearbyManager(onFoundUser: (String) -> Unit, onLostUser: (String) -> Unit, onError: (String) -> Unit) : b {
   private final val onFoundUser: (String) -> Unit
   private final val onLostUser: (String) -> Unit
   private final val onError: (String) -> Unit
   private final val subscribeOptions: SubscribeOptions
   private final val statusCallback: <unrepresentable>
   private final lateinit var outboundMessage: Message

   init {
      q.h(var1, "onFoundUser");
      q.h(var2, "onLostUser");
      q.h(var3, "onError");
      super();
      this.onFoundUser = var1;
      this.onLostUser = var2;
      this.onError = var3;
      val var4: SubscribeOptions = new a().b(i.r).a();
      q.g(var4, "build(...)");
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
      q.h(var1, "context");
      val var3: d = gb.a.a(var1);
      var3.m(this.statusCallback);
      var var4: Message = this.outboundMessage;
      if (this.outboundMessage == null) {
         q.y("outboundMessage");
         var4 = null;
      }

      var3.b(var4);
      var3.h(this);
   }

   public fun enableNearby(context: Context) {
      q.h(var1, "context");
      var var2: Message = this.outboundMessage;
      if (this.outboundMessage == null) {
         q.y("outboundMessage");
         var2 = null;
      }

      val var4: d = gb.a.a(var1);
      var4.g(this.statusCallback);
      var4.f(var2);
      var4.e(this, this.subscribeOptions);
   }

   public open fun onFound(message: Message) {
      q.h(var1, "message");
      super.onFound(var1);
      val var2: Function1 = this.onFoundUser;
      val var3: ByteArray = var1.o();
      q.g(var3, "getContent(...)");
      var2.invoke(new java.lang.String(var3, lk.a.b));
   }

   public open fun onLost(message: Message) {
      q.h(var1, "message");
      super.onLost(var1);
      val var2: Function1 = this.onLostUser;
      val var3: ByteArray = var1.o();
      q.g(var3, "getContent(...)");
      var2.invoke(new java.lang.String(var3, lk.a.b));
   }

   public fun setOutboundMessage(message: String) {
      q.h(var1, "message");
      val var2: ByteArray = var1.getBytes(lk.a.b);
      q.g(var2, "getBytes(...)");
      this.outboundMessage = new Message(var2);
   }

   public companion object {
      public const val PERMISSION_DENIED: String
   }
}
