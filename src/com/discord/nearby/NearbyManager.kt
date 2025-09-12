package com.discord.nearby

import android.content.Context
import com.google.android.gms.nearby.messages.Message
import com.google.android.gms.nearby.messages.SubscribeOptions
import kotlin.jvm.functions.Function1
import kotlin.jvm.internal.Intrinsics
import o7.d
import o7.h
import o7.i

internal class NearbyManager(onFoundUser: (String) -> Unit, onLostUser: (String) -> Unit, onError: (String) -> Unit) : o7.b {
   private final val onFoundUser: (String) -> Unit
   private final val onLostUser: (String) -> Unit
   private final val onError: (String) -> Unit
   private final val subscribeOptions: SubscribeOptions
   private final val statusCallback: <unrepresentable>
   private final lateinit var outboundMessage: Message

   init {
      this.onFoundUser = var1;
      this.onLostUser = var2;
      this.onError = var3;
      val var4: SubscribeOptions = new SubscribeOptions.a().b(i.x).a();
      this.subscribeOptions = var4;
      this.statusCallback = new h(this) {
         final NearbyManager this$0;

         {
            this.this$0 = var1;
         }

         @Override
         public void onPermissionChanged(boolean var1) {
            super.onPermissionChanged(var1);
            if (!var1) {
               NearbyManager.access$getOnError$p(this.this$0).invoke("1");
            }
         }
      };
   }

   public fun disableNearby(context: Context) {
      val var3: d = l7.a.a(var1);
      var3.h(this.statusCallback);
      var var4: Message = this.outboundMessage;
      if (this.outboundMessage == null) {
         Intrinsics.throwUninitializedPropertyAccessException("outboundMessage");
         var4 = null;
      }

      var3.j(var4);
      var3.c(this);
   }

   public fun enableNearby(context: Context) {
      var var2: Message = this.outboundMessage;
      if (this.outboundMessage == null) {
         Intrinsics.throwUninitializedPropertyAccessException("outboundMessage");
         var2 = null;
      }

      val var4: d = l7.a.a(var1);
      var4.k(this.statusCallback);
      var4.f(var2);
      var4.e(this, this.subscribeOptions);
   }

   public override fun onFound(message: Message) {
      super.onFound(var1);
      val var2: Function1 = this.onFoundUser;
      val var3: ByteArray = var1.q();
      var2.invoke(new java.lang.String(var3, Charsets.UTF_8));
   }

   public override fun onLost(message: Message) {
      super.onLost(var1);
      val var2: Function1 = this.onLostUser;
      val var3: ByteArray = var1.q();
      var2.invoke(new java.lang.String(var3, Charsets.UTF_8));
   }

   public fun setOutboundMessage(message: String) {
      val var2: ByteArray = var1.getBytes(Charsets.UTF_8);
      this.outboundMessage = new Message(var2);
   }

   public companion object {
      public const val PERMISSION_DENIED: String
   }
}
