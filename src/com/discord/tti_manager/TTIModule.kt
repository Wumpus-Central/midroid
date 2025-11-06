package com.discord.tti_manager

import android.content.Intent
import com.discord.codegen.NativeTTIModuleSpec
import com.discord.notifications.renderer.IncomingCallActivity
import com.facebook.react.bridge.ReactApplicationContext
import java.lang.reflect.Field
import java.util.Collections
import java.util.LinkedHashSet
import kotlin.jvm.internal.SourceDebugExtension

public class TTIModule(reactContext: ReactApplicationContext) : NativeTTIModuleSpec(var1) {
   @JvmStatic
   fun {
      val var0: java.util.Set = Collections.synchronizedSet(new LinkedHashSet());
      activitiesBeforeMain = var0;
   }

   public override fun getLaunchScenario(): String {
      return Companion.getLaunchScenario();
   }

   public override fun getMainActivityCreationTime(): Double? {
      return if (mainActivityCreationTime != null) (double)mainActivityCreationTime.longValue() else null;
   }

   public override fun getWasBroadcastReceiverStartedBefore(): Boolean {
      return broadcastReceiverInstantiationBeforeActivity;
   }

   public override fun getWasServiceStartedBefore(): Boolean {
      return serviceInstantiationBeforeActivity;
   }

   public override fun wasInitializeCompleteWhenActivityOpened(): Boolean {
      return wasInitializeCompleteWhenActivityOpened;
   }

   public override fun wasLaunchedViaShortcut(): Boolean {
      return wasLaunchedViaShortcut;
   }

   @SourceDebugExtension(["SMAP\nTTIModule.kt\nKotlin\n*S Kotlin\n*F\n+ 1 TTIModule.kt\ncom/discord/tti_manager/TTIModule$Companion\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n+ 3 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,195:1\n1755#2,3:196\n1755#2,3:200\n1#3:199\n*S KotlinDebug\n*F\n+ 1 TTIModule.kt\ncom/discord/tti_manager/TTIModule$Companion\n*L\n121#1:196,3\n157#1:200,3\n*E\n"])
   public companion object {
      private final var activityInstantiationBegan: Boolean
      private final var serviceInstantiationBeforeActivity: Boolean
      private final var broadcastReceiverInstantiationBeforeActivity: Boolean
      private final var wasInitializeCompleteWhenActivityOpened: Boolean
      private final var isInitializeComplete: Boolean
      private final var mainActivityCreationTime: Long?
      private final val activitiesBeforeMain: MutableSet<String>
      private final var mainActivityIntent: Intent?
      private final var wasLaunchedViaShortcut: Boolean
      private const val KEY_SHORTCUT: String
      private const val EXTRA_CONTENT_ACTION_TAG: String
      private const val EXTRA_CONTENT_ACTION_TYPE: String

      private fun checkAndMarkShortcutLaunch(intent: Intent?) {
         if (var1 != null && var1.hasExtra("discord_shortcut")) {
            TTIModule.access$setWasLaunchedViaShortcut$cp(true);
         }
      }

      private fun checkIncomingCallActivity(): Boolean {
         val var3: java.lang.Iterable = TTIModule.access$getActivitiesBeforeMain$cp();
         if (var3 !is java.util.Collection || !(var3 as java.util.Collection).isEmpty()) {
            val var6: java.util.Iterator = var3.iterator();

            while (var6.hasNext()) {
               if (StringsKt.T(var6.next() as java.lang.String, "IncomingCallActivity", false, 2, null)) {
                  return true;
               }
            }
         }

         val var7: Intent = TTIModule.access$getMainActivityIntent$cp();
         if (var7 != null) {
            val var4: Pair = TTIModule.Companion.extractContentActionData(var7);
            if (var4 != null) {
               val var12: java.lang.String = var4.b() as java.lang.String;
               val var2: Boolean = CollectionsKt.d0(
                  CollectionsKt.o(new java.lang.String[]{"CALL_CONNECT", "CALL_RING", "CALL_RING_END"}), var4.a() as java.lang.String
               );
               val var1: Boolean;
               if (var12 != null && StringsKt.T(var12, "CALL_RING", false, 2, null)) {
                  var1 = true;
               } else {
                  var1 = false;
               }

               if (var2 || var1) {
                  return true;
               }
            }
         }

         try {
            val var9: IncomingCallActivity.Companion = IncomingCallActivity.Companion;
            val var10: Field = IncomingCallActivity.class.getDeclaredField("selfIntent");
            var10.setAccessible(true);
            var11 = var10.get(null);
         } catch (var5: Exception) {
            return false;
         }

         return var11 != null;
      }

      private fun checkNotificationLaunch(): Boolean {
         var var1: Intent = TTIModule.access$getMainActivityIntent$cp();
         if (var1 != null) {
            val var2: Pair = TTIModule.Companion.extractContentActionData(var1);
            if (var2 != null) {
               val var3: java.lang.String = var2.a() as java.lang.String;
               val var5: java.lang.String = var2.b() as java.lang.String;
               if (var3 == "MESSAGE_CREATE" || var5 != null && StringsKt.N(var5, "MESSAGE_CREATE", false, 2, null)) {
                  return true;
               }
            }
         }

         var1 = TTIModule.access$getMainActivityIntent$cp();
         if (var1 != null && (var1.getFlags() and 268435456) != 0) {
            val var6: java.util.Set = var1.getCategories();
            if ((var6 == null || !var6.contains("android.intent.category.LAUNCHER")) && !var1.hasExtra("discord_shortcut")) {
               return true;
            }
         }

         return false;
      }

      private fun extractContentActionData(intent: Intent): Pair<String?, String?>? {
         val var2: java.lang.String = var1.getStringExtra("com.discord.notifications.actions.intents.ContentAction.tag");
         val var3: java.lang.String = var1.getStringExtra("com.discord.notifications.actions.intents.ContentAction.type");
         return if (var2 == null && var3 == null) null else new Pair(var3, var2);
      }

      public fun clearMainActivityCreation() {
         TTIModule.access$setMainActivityCreationTime$cp(null);
         TTIModule.access$getActivitiesBeforeMain$cp().clear();
         TTIModule.access$setMainActivityIntent$cp(null);
         TTIModule.access$setWasLaunchedViaShortcut$cp(false);
      }

      public fun getLaunchScenario(): String {
         var var1: Boolean;
         var var4: Boolean;
         label65: {
            var4 = this.checkIncomingCallActivity();
            val var6: java.lang.Iterable = TTIModule.access$getActivitiesBeforeMain$cp();
            if (var6 !is java.util.Collection || !(var6 as java.util.Collection).isEmpty()) {
               val var8: java.util.Iterator = var6.iterator();

               while (var8.hasNext()) {
                  if (StringsKt.y(var8.next() as java.lang.String, ".ShareActivity", false, 2, null)) {
                     var1 = true;
                     break label65;
                  }
               }
            }

            var1 = false;
         }

         var var2: Boolean = true;
         if (!TTIModule.access$getServiceInstantiationBeforeActivity$cp()) {
            if (TTIModule.access$getBroadcastReceiverInstantiationBeforeActivity$cp()) {
               var2 = true;
            } else {
               var2 = false;
            }
         }

         val var7: Boolean = this.checkNotificationLaunch();
         if (var4) {
            return "incoming_call";
         } else if (TTIModule.access$getWasLaunchedViaShortcut$cp()) {
            return "launcher_shortcut";
         } else if (var1) {
            return "share_activity";
         } else if (var7) {
            return "notification";
         } else if (var2) {
            return "other_background_task";
         } else {
            return if (!TTIModule.access$getActivitiesBeforeMain$cp().isEmpty()) "other_activity_launch" else "normal";
         }
      }

      public fun markActivityBeforeMain(className: String) {
         if (!TTIModule.access$getActivityInstantiationBegan$cp()) {
            TTIModule.access$getActivitiesBeforeMain$cp().add(var1);
         }
      }

      public fun markApplicationInitializeComplete() {
         TTIModule.access$setInitializeComplete$cp(true);
      }

      public fun markBroadcastReceiverInstantiation() {
         if (!TTIModule.access$getActivityInstantiationBegan$cp()) {
            TTIModule.access$setBroadcastReceiverInstantiationBeforeActivity$cp(true);
         }
      }

      public fun markMainActivityCreation(intent: Intent? = null) {
         TTIModule.access$setActivityInstantiationBegan$cp(true);
         this.checkAndMarkShortcutLaunch(var1);
         TTIModule.access$setWasInitializeCompleteWhenActivityOpened$cp(TTIModule.access$isInitializeComplete$cp());
         if (TTIModule.access$getMainActivityCreationTime$cp() == null) {
            TTIModule.access$setMainActivityCreationTime$cp(System.currentTimeMillis());
            if (var1 != null) {
               TTIModule.access$setMainActivityIntent$cp(var1);
            }
         }
      }

      public fun markServiceInstantiation() {
         if (!TTIModule.access$getActivityInstantiationBegan$cp()) {
            TTIModule.access$setServiceInstantiationBeforeActivity$cp(true);
         }
      }

      public fun setMainActivityIntent(intent: Intent? = null) {
         if (var1 != null) {
            TTIModule.access$setMainActivityIntent$cp(var1);
            this.checkAndMarkShortcutLaunch(var1);
         }
      }
   }
}
