package com.discord.billing

import android.app.Activity
import androidx.lifecycle.LifecycleOwner
import com.android.billingclient.api.BillingClient
import com.android.billingclient.api.BillingResult
import com.android.billingclient.api.ProductDetails
import com.android.billingclient.api.Purchase
import com.discord.billing.types.ProductType
import com.discord.billing.types.QueryProductDetailsParams
import com.discord.misc.utilities.backoff.ExponentialBackoff
import com.facebook.react.bridge.Promise
import com.facebook.react.bridge.ReactApplicationContext
import jb.K
import jb.U
import kotlin.coroutines.Continuation
import kotlin.enums.EnumEntries
import kotlin.jvm.functions.Function0
import kotlin.jvm.functions.Function1
import kotlin.jvm.functions.Function2
import kotlin.jvm.functions.Function3
import kotlin.jvm.internal.Ref.BooleanRef
import kotlinx.coroutines.CoroutineScope

internal class BillingManager(isProdBuild: Boolean,
   onConnectionUpdated: (Int) -> Unit,
   onPurchaseStateUpdated: (Int) -> Unit,
   onPurchaseUpdated: (String, String, String) -> Unit
) {
   private final val isProdBuild: Boolean
   public final val onConnectionUpdated: (Int) -> Unit
   public final val onPurchaseStateUpdated: (Int) -> Unit
   public final val onPurchaseUpdated: (String, String, String) -> Unit
   private final val prodPackageName: String
   private final val devPackageName: String
   private final val allowedPackageNames: Set<String>
   private final lateinit var billingClient: BillingClient
   private final val billingClientStateListener: <unrepresentable>
   private final val backoff: ExponentialBackoff

   init {
      kotlin.jvm.internal.r.h(var2, "onConnectionUpdated");
      kotlin.jvm.internal.r.h(var3, "onPurchaseStateUpdated");
      kotlin.jvm.internal.r.h(var4, "onPurchaseUpdated");
      super();
      this.isProdBuild = var1;
      this.onConnectionUpdated = var2;
      this.onPurchaseStateUpdated = var3;
      this.onPurchaseUpdated = var4;
      this.prodPackageName = "com.discord";
      this.devPackageName = "com.discord.debug.billingtesting";
      this.allowedPackageNames = w.i(new java.lang.String[]{"com.discord", "com.discord.debug.billingtesting"});
      this.billingClientStateListener = new c1.c(this) {
         final BillingManager this$0;

         {
            this.this$0 = var1;
         }

         @Override
         public void onBillingServiceDisconnected() {
            this.this$0.getOnConnectionUpdated().invoke(BillingManager.ConnectionState.DISCONNECTED.getValue());
            val var2: BillingClient = BillingManager.access$getBillingClient$p(this.this$0);
            var var1: BillingClient = var2;
            if (var2 == null) {
               kotlin.jvm.internal.r.y("billingClient");
               var1 = null;
            }

            if (!var1.f()) {
               BillingManager.access$reconnect(this.this$0);
            }
         }

         @Override
         public void onBillingSetupFinished(BillingResult var1) {
            kotlin.jvm.internal.r.h(var1, "billingResult");
            if (BillingManager.access$isNotOk(this.this$0, var1)) {
               BillingManager.access$reconnect(this.this$0);
            } else {
               BillingManager.access$getBackoff$p(this.this$0).succeed();
               this.this$0.getOnConnectionUpdated().invoke(BillingManager.ConnectionState.CONNECTED.getValue());
               BillingManager.loadPurchases$default(this.this$0, null, null, 3, null);
            }
         }
      };
      this.backoff = new ExponentialBackoff(U.j, 1000L, 300000L, 10);
   }

   @JvmStatic
   fun `consumePurchase$lambda$3`(var0: BillingManager, var1: Function1, var2: Function0, var3: BillingResult, var4: java.lang.String) {
      kotlin.jvm.internal.r.h(var3, "billingResult");
      kotlin.jvm.internal.r.h(var4, "<unused var>");
      if (var0.isNotOk(var3)) {
         var1.invoke(BillingManagerException.Companion.fromBillingResult(var3.b()));
      } else {
         var2.invoke();
      }
   }

   private fun getCoroutineScope(context: ReactApplicationContext): CoroutineScope {
      val var3: Activity = var1.getCurrentActivity();
      val var2: Boolean = var3 is LifecycleOwner;
      var var4: Any = null;
      val var5: LifecycleOwner;
      if (var2) {
         var5 = var3 as LifecycleOwner;
      } else {
         var5 = null;
      }

      if (var5 != null) {
         var4 = androidx.lifecycle.m.a(var5);
      }

      if (var4 == null) {
         var4 = U.j;
      }

      return (CoroutineScope)var4;
   }

   private fun handlePurchases(billingResult: BillingResult, purchases: List<Purchase>?) {
      this.onPurchaseStateUpdated.invoke(var1.b());
      if (var2 != null && !var2.isEmpty()) {
         val var3: java.util.Iterator = var2.iterator();

         while (var3.hasNext()) {
            this.verifyPurchase(var3.next() as Purchase);
         }
      }
   }

   private operator fun ((Exception) -> Unit).invoke(errorMessage: String) {
      kotlin.jvm.internal.r.h(var1, "<this>");
      var1.invoke(new IllegalStateException(var2));
   }

   private fun isBillingClientReady(): Boolean {
      if (this.billingClient != null) {
         var var2: BillingClient = this.billingClient;
         if (this.billingClient == null) {
            kotlin.jvm.internal.r.y("billingClient");
            var2 = null;
         }

         if (var2.f()) {
            return true;
         }
      }

      return false;
   }

   private fun BillingResult.isNotOk(): Boolean {
      val var2: Boolean;
      if (var1.b() != 0) {
         var2 = true;
      } else {
         var2 = false;
      }

      return var2;
   }

   private fun isRetryableError(billingResult: BillingResult): Boolean {
      val var2: Boolean;
      if (this.isNotOk(var1) && w.i(new Integer[]{6, -1, 2, 12}).contains(var1.b())) {
         var2 = true;
      } else {
         var2 = false;
      }

      return var2;
   }

   @JvmStatic
   fun `loadPurchases$lambda$4`(): Unit {
      return Unit.a;
   }

   @JvmStatic
   fun `loadPurchases$lambda$5`(var0: Exception): Unit {
      kotlin.jvm.internal.r.h(var0, "it");
      return Unit.a;
   }

   private fun reconnect() {
      try {
         this.backoff.fail(new Function1(this, null) {
            int label;
            final BillingManager this$0;

            {
               super(1, var2);
               this.this$0 = var1;
            }

            public final Continuation create(Continuation var1) {
               return new <anonymous constructor>(this.this$0, var1);
            }

            public final Object invoke(Continuation var1) {
               return (this.create(var1) as <unrepresentable>).invokeSuspend(Unit.a);
            }

            public final Object invokeSuspend(Object var1) {
               H9.b.e();
               if (this.label == 0) {
                  kotlin.c.b(var1);
                  val var2: BillingClient = BillingManager.access$getBillingClient$p(this.this$0);
                  var1 = var2;
                  if (var2 == null) {
                     kotlin.jvm.internal.r.y("billingClient");
                     var1 = null;
                  }

                  var1.l(BillingManager.access$getBillingClientStateListener$p(this.this$0));
                  this.this$0.getOnConnectionUpdated().invoke(kotlin.coroutines.jvm.internal.b.d(BillingManager.ConnectionState.CONNECTING.getValue()));
                  return Unit.a;
               } else {
                  throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
               }
            }
         });
      } catch (var3: Exception) {
         this.onConnectionUpdated.invoke(BillingManager.ConnectionState.ERROR.getValue());
      }
   }

   private fun verifyPurchase(purchase: Purchase) {
      if (var1.g() == 1 && !var1.k() && this.allowedPackageNames.contains(var1.e())) {
         val var2: java.util.List = var1.f();
         kotlin.jvm.internal.r.g(var2, "getProducts(...)");

         for (java.lang.String var6 : var2) {
            val var4: Function3 = this.onPurchaseUpdated;
            val var3: java.lang.String = var1.i();
            kotlin.jvm.internal.r.g(var3, "getPurchaseToken(...)");
            val var7: java.lang.String = var1.e();
            kotlin.jvm.internal.r.g(var7, "getPackageName(...)");
            kotlin.jvm.internal.r.e(var6);
            var4.invoke(var3, var7, var6);
         }
      }
   }

   public fun close() {
      if (this.billingClient != null) {
         var var1: BillingClient = this.billingClient;
         if (this.billingClient == null) {
            kotlin.jvm.internal.r.y("billingClient");
            var1 = null;
         }

         var1.c();
         this.backoff.cancel();
      } else {
         this.onConnectionUpdated.invoke(BillingManager.ConnectionState.ERROR.getValue());
      }
   }

   public fun consumePurchase(purchaseToken: String, onSuccess: () -> Unit, onError: (BillingManagerException) -> Unit) {
      kotlin.jvm.internal.r.h(var1, "purchaseToken");
      kotlin.jvm.internal.r.h(var2, "onSuccess");
      kotlin.jvm.internal.r.h(var3, "onError");
      if (!this.isBillingClientReady()) {
         var3.invoke(new BillingManagerException.BillingClientNotReadyException());
      } else {
         val var5: c1.e = c1.e.b().b(var1).a();
         kotlin.jvm.internal.r.g(var5, "build(...)");
         var var6: BillingClient = this.billingClient;
         if (this.billingClient == null) {
            kotlin.jvm.internal.r.y("billingClient");
            var6 = null;
         }

         var6.b(var5, new d(this, var3, var2));
      }
   }

   public fun getProducts(
      productIds: List<String>,
      productType: ProductType,
      reactPromise: Promise,
      onError: (BillingManagerException) -> Unit,
      context: ReactApplicationContext
   ) {
      kotlin.jvm.internal.r.h(var1, "productIds");
      kotlin.jvm.internal.r.h(var2, "productType");
      kotlin.jvm.internal.r.h(var3, "reactPromise");
      kotlin.jvm.internal.r.h(var4, "onError");
      kotlin.jvm.internal.r.h(var5, "context");
      if (!this.isBillingClientReady()) {
         var4.invoke(new BillingManagerException.BillingClientNotReadyException());
      } else {
         val var7: CoroutineScope = this.getCoroutineScope(var5);
         jb.f.d(
            var7,
            K.a(),
            null,
            new Function2(new ExponentialBackoff(var7, 0L, 0L, 0, 14, null), var4, this, var3, var2, var1, null)// $VF: Couldn't be decompiled
   // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
   // java.lang.NullPointerException: Cannot invoke "org.jetbrains.java.decompiler.modules.decompiler.stats.Statement.getVarDefinitions()" because "stat" is null
   //   at org.jetbrains.java.decompiler.modules.decompiler.vars.VarDefinitionHelper.iterateClashingNames(VarDefinitionHelper.java:1468)
   //   at org.jetbrains.java.decompiler.modules.decompiler.vars.VarDefinitionHelper.iterateClashingExprent(VarDefinitionHelper.java:1679)
   //   at org.jetbrains.java.decompiler.modules.decompiler.vars.VarDefinitionHelper.iterateClashingNames(VarDefinitionHelper.java:1496)
   //   at org.jetbrains.java.decompiler.modules.decompiler.vars.VarDefinitionHelper.iterateClashingNames(VarDefinitionHelper.java:1545)
   //   at org.jetbrains.java.decompiler.modules.decompiler.vars.VarDefinitionHelper.remapClashingNames(VarDefinitionHelper.java:1458)
   //   at org.jetbrains.java.decompiler.modules.decompiler.vars.VarProcessor.rerunClashing(VarProcessor.java:99)
   //   at org.jetbrains.java.decompiler.main.ClassWriter.invokeProcessors(ClassWriter.java:118)
   //   at org.jetbrains.java.decompiler.main.ClassWriter.writeClass(ClassWriter.java:352)
   //   at org.jetbrains.java.decompiler.modules.decompiler.exps.NewExprent.toJava(NewExprent.java:407)
   //   at org.jetbrains.java.decompiler.modules.decompiler.ExprProcessor.getCastedExprent(ExprProcessor.java:1014)
   //   at org.jetbrains.java.decompiler.modules.decompiler.exps.InvocationExprent.appendParamList(InvocationExprent.java:1153)
   //   at org.jetbrains.java.decompiler.modules.decompiler.exps.InvocationExprent.toJava(InvocationExprent.java:904)
   //   at org.jetbrains.java.decompiler.modules.decompiler.ExprProcessor.listToJava(ExprProcessor.java:891)
   //   at org.jetbrains.java.decompiler.modules.decompiler.stats.BasicBlockStatement.toJava(BasicBlockStatement.java:91)
   //   at org.jetbrains.java.decompiler.modules.decompiler.ExprProcessor.jmpWrapper(ExprProcessor.java:829)
   //   at org.jetbrains.java.decompiler.modules.decompiler.stats.IfStatement.toJava(IfStatement.java:258)
   //   at org.jetbrains.java.decompiler.modules.decompiler.stats.RootStatement.toJava(RootStatement.java:36)
   ,
            2,
            null
         );
      }
   }

   public fun loadPurchases(onSuccess: () -> Unit = new e(), onError: (Exception) -> Unit = new f()) {
      kotlin.jvm.internal.r.h(var1, "onSuccess");
      kotlin.jvm.internal.r.h(var2, "onError");
      if (!this.isBillingClientReady()) {
         var2.invoke(new BillingManagerException.BillingClientNotReadyException());
      } else {
         var var5: BillingClient = this.billingClient;
         if (this.billingClient == null) {
            kotlin.jvm.internal.r.y("billingClient");
            var5 = null;
         }

         var5.k(c1.m.a().b("subs").a(), new a(this));
         var var6: BillingClient = this.billingClient;
         if (this.billingClient == null) {
            kotlin.jvm.internal.r.y("billingClient");
            var6 = null;
         }

         var6.k(c1.m.a().b("inapp").a(), new a(this));
         var1.invoke();
      }
   }

   public fun open(context: ReactApplicationContext) {
      kotlin.jvm.internal.r.h(var1, "context");
      val var3: BillingClient = BillingClient.h(var1).c(com.android.billingclient.api.d.c().b().a()).d(new b(this)).a();
      this.billingClient = var3;
      var var7: BillingClient = var3;
      if (var3 == null) {
         kotlin.jvm.internal.r.y("billingClient");
         var7 = null;
      }

      if (!var7.f()) {
         try {
            var8 = this.billingClient;
         } catch (var6: Exception) {
            this.onConnectionUpdated.invoke(BillingManager.ConnectionState.ERROR.getValue());
            return;
         }

         if (var8 == null) {
            try {
               kotlin.jvm.internal.r.y("billingClient");
            } catch (var5: Exception) {
               this.onConnectionUpdated.invoke(BillingManager.ConnectionState.ERROR.getValue());
               return;
            }

            var8 = null;
         }

         try {
            var8.l(this.billingClientStateListener);
            this.onConnectionUpdated.invoke(BillingManager.ConnectionState.CONNECTING.getValue());
         } catch (var4: Exception) {
            this.onConnectionUpdated.invoke(BillingManager.ConnectionState.ERROR.getValue());
         }
      }
   }

   public fun purchase(
      activity: Activity?,
      productId: String,
      productType: ProductType,
      userId: String,
      oldProductId: String? = null,
      purchaseToken: String? = null,
      offerId: String? = null,
      onSuccess: () -> Unit,
      onError: (BillingManagerException) -> Unit
   ) {
      kotlin.jvm.internal.r.h(var2, "productId");
      kotlin.jvm.internal.r.h(var3, "productType");
      kotlin.jvm.internal.r.h(var4, "userId");
      kotlin.jvm.internal.r.h(var8, "onSuccess");
      kotlin.jvm.internal.r.h(var9, "onError");
      if (!this.isBillingClientReady()) {
         var9.invoke(new BillingManagerException.BillingClientNotReadyException());
      } else if (var1 == null) {
         var9.invoke(new BillingManagerException.BillingException("Current React Activity not found"));
      } else {
         val var12: BooleanRef = new BooleanRef();
         var var10: BillingClient = this.billingClient;
         if (this.billingClient == null) {
            kotlin.jvm.internal.r.y("billingClient");
            var10 = null;
         }

         var10.i(
            QueryProductDetailsParams.INSTANCE.create(var3, kotlin.collections.i.p(new java.lang.String[]{var2, var5})),
            new c(this, var9, var2, var5, var6, var4, var7, var1, var8, var12)
         );
      }
   }

   private enum class ConnectionState(value: Int) {
      CONNECTED(2),
      CONNECTING(1),
      DISCONNECTED(0),
      ERROR(3)
      public final val value: Int
      @JvmStatic
      private EnumEntries $ENTRIES;
      @JvmStatic
      private BillingManager.ConnectionState[] $VALUES;

      @JvmStatic
      fun {
         val var0: Array<BillingManager.ConnectionState> = $values();
         $VALUES = var0;
         $ENTRIES = I9.a.a(var0);
      }

      init {
         this.value = var3;
      }

      @JvmStatic
      fun getEntries(): EnumEntries {
         return $ENTRIES;
      }
   }

   public data class ProductDetailsResponse(billingResult: BillingResult, productDetails: List<ProductDetails>?) {
      public final val billingResult: BillingResult
      public final val productDetails: List<ProductDetails>?

      init {
         kotlin.jvm.internal.r.h(var1, "billingResult");
         super();
         this.billingResult = var1;
         this.productDetails = var2;
      }

      public operator fun component1(): BillingResult {
         return this.billingResult;
      }

      public operator fun component2(): List<ProductDetails>? {
         return this.productDetails;
      }

      public fun copy(billingResult: BillingResult = var0.billingResult, productDetails: List<ProductDetails>? = var0.productDetails): com.discord.billing.BillingManager.ProductDetailsResponse {
         kotlin.jvm.internal.r.h(var1, "billingResult");
         return new BillingManager.ProductDetailsResponse(var1, var2);
      }

      public override operator fun equals(other: Any?): Boolean {
         if (this === var1) {
            return true;
         } else if (var1 !is BillingManager.ProductDetailsResponse) {
            return false;
         } else {
            var1 = var1;
            if (!kotlin.jvm.internal.r.c(this.billingResult, var1.billingResult)) {
               return false;
            } else {
               return kotlin.jvm.internal.r.c(this.productDetails, var1.productDetails);
            }
         }
      }

      public override fun hashCode(): Int {
         val var2: Int = this.billingResult.hashCode();
         val var1: Int;
         if (this.productDetails == null) {
            var1 = 0;
         } else {
            var1 = this.productDetails.hashCode();
         }

         return var2 * 31 + var1;
      }

      public override fun toString(): String {
         val var3: BillingResult = this.billingResult;
         val var2: java.util.List = this.productDetails;
         val var1: StringBuilder = new StringBuilder();
         var1.append("ProductDetailsResponse(billingResult=");
         var1.append(var3);
         var1.append(", productDetails=");
         var1.append(var2);
         var1.append(")");
         return var1.toString();
      }
   }
}
