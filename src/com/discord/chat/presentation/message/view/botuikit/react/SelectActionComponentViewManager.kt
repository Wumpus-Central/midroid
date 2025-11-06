package com.discord.chat.presentation.message.view.botuikit.react

import com.discord.chat.bridge.botuikit.Component
import com.discord.chat.bridge.botuikit.ComponentSerializer
import com.discord.chat.bridge.botuikit.SelectComponent
import com.discord.chat.presentation.message.view.botuikit.ComponentActionEventHandlers
import com.discord.chat.presentation.message.view.botuikit.ComponentContext
import com.discord.chat.presentation.message.view.botuikit.WidthInfo
import com.discord.chat.presentation.message.view.botuikit.components.SelectComponentView
import com.discord.chat.presentation.message.view.botuikit.react.deserialization.ComponentDeserializerKt
import com.discord.misc.utilities.measure.ViewMeasureExtensionsKt
import com.discord.reactevents.ReactEvents
import com.facebook.react.bridge.ReadableMap
import com.facebook.react.module.annotations.ReactModule
import com.facebook.react.uimanager.SimpleViewManager
import com.facebook.react.uimanager.ThemedReactContext
import com.facebook.react.uimanager.annotations.ReactProp
import kotlin.jvm.functions.Function0
import kotlin.jvm.internal.SourceDebugExtension
import kotlinx.serialization.json.Json
import org.json.JSONObject

@ReactModule(name = "SelectActionComponentView")
@SourceDebugExtension(["SMAP\nSelectActionComponentViewManager.kt\nKotlin\n*S Kotlin\n*F\n+ 1 SelectActionComponentViewManager.kt\ncom/discord/chat/presentation/message/view/botuikit/react/SelectActionComponentViewManager\n+ 2 ComponentDeserializer.kt\ncom/discord/chat/presentation/message/view/botuikit/react/deserialization/ComponentDeserializerKt\n*L\n1#1,70:1\n14#2,10:71\n*S KotlinDebug\n*F\n+ 1 SelectActionComponentViewManager.kt\ncom/discord/chat/presentation/message/view/botuikit/react/SelectActionComponentViewManager\n*L\n34#1:71,10\n*E\n"])
public class SelectActionComponentViewManager : SimpleViewManager<SelectComponentView> {
   private final val reactEvents: ReactEvents = new ReactEvents(ht.v.a("onTap", OnSelectComponentTapEvent::class))

   private fun createSelectComponentContext(onTap: () -> Unit): ComponentContext {
      val var2: ComponentContextDefaults = ComponentContextDefaults.INSTANCE;
      return new ComponentContext(
         "",
         ComponentContextDefaults.INSTANCE.getGENERAL_HANDLERS(),
         var2.getMARKDOWN_OPTIONS(),
         var2.getMARKDOWN_HANDLERS(),
         var2.getMEDIA_HANDLERS(),
         ComponentActionEventHandlers.copy$default(var2.getCOMPONENT_HANDLERS(), null, null, new a0(var1), null, null, 27, null),
         new WidthInfo(0, 0, 0, 4, null),
         false,
         false,
         false,
         true
      );
   }

   @JvmStatic
   fun `createSelectComponentContext$lambda$1`(var0: Function0, var1: java.lang.String): Unit {
      var0.invoke();
      return Unit.a;
   }

   @JvmStatic
   fun `setModel$lambda$0`(var0: SelectActionComponentViewManager, var1: SelectComponentView): Unit {
      var0.reactEvents.emitEvent(var1, new OnSelectComponentTapEvent());
      return Unit.a;
   }

   protected open fun createViewInstance(reactContext: ThemedReactContext): SelectComponentView {
      return new SelectComponentView(var1, null, 0, 6, null);
   }

   public override fun getExportedCustomDirectEventTypeConstants(): MutableMap<String, Any> {
      return this.reactEvents.exportEventConstants();
   }

   public override fun getName(): String {
      return "SelectActionComponentView";
   }

   @ReactProp(name = "model")
   public fun setModel(view: SelectComponentView, model: ReadableMap) {
      var var3: Boolean;
      try {
         val var19: Json = ComponentDeserializerKt.getJson();
         val var5: ComponentSerializer = ComponentSerializer.INSTANCE;
         val var14: java.lang.String = new JSONObject(var2.toHashMap()).toString();
         var15 = var19.b(var5, var14) as Component;
         var3 = var15 is SelectComponent;
      } catch (var8: Exception) {
         val var9: java.lang.String = (SelectComponent::class).getSimpleName();
         val var13: java.lang.String = var8.getMessage();
         val var4: StringBuilder = new StringBuilder();
         var4.append("Error while deserializing ");
         var4.append(var9);
         var4.append(": ");
         var4.append(var13);
         throw new IllegalStateException(var4.toString().toString());
      }

      if (var3) {
         var1.configure(var15 as SelectComponent, this.createSelectComponentContext(new b0(this, var1)));
         ViewMeasureExtensionsKt.measureAndLayout(var1);
      } else {
         try {
            val var11: java.lang.String = (SelectComponent::class).getSimpleName();
            val var21: java.lang.String = (var15.getClass()::class).getSimpleName();
            val var17: StringBuilder = new StringBuilder();
            var17.append("Expected ");
            var17.append(var11);
            var17.append(" but got ");
            var17.append(var21);
            throw new IllegalStateException(var17.toString().toString());
         } catch (var7: Exception) {
            val var10: java.lang.String = (SelectComponent::class).getSimpleName();
            val var16: java.lang.String = var7.getMessage();
            val var20: StringBuilder = new StringBuilder();
            var20.append("Error while deserializing ");
            var20.append(var10);
            var20.append(": ");
            var20.append(var16);
            throw new IllegalStateException(var20.toString().toString());
         }
      }
   }

   public companion object {
      public const val NAME: String
   }
}
