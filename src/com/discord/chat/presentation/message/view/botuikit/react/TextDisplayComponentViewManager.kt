package com.discord.chat.presentation.message.view.botuikit.react

import com.discord.chat.bridge.botuikit.Component
import com.discord.chat.bridge.botuikit.ComponentSerializer
import com.discord.chat.bridge.botuikit.TextDisplayComponent
import com.discord.chat.bridge.contentnode.CommandMentionContentNode
import com.discord.chat.bridge.contentnode.EmojiContentNode
import com.discord.chat.bridge.contentnode.InlineCodeContentNode
import com.discord.chat.bridge.contentnode.LinkContentNode
import com.discord.chat.bridge.contentnode.SoundmojiContentNode
import com.discord.chat.presentation.message.view.botuikit.ComponentContext
import com.discord.chat.presentation.message.view.botuikit.MarkdownTextRenderEventHandlers
import com.discord.chat.presentation.message.view.botuikit.MarkdownTextRenderOptions
import com.discord.chat.presentation.message.view.botuikit.WidthInfo
import com.discord.chat.presentation.message.view.botuikit.components.TextDisplayComponentView
import com.discord.chat.presentation.message.view.botuikit.react.deserialization.ComponentDeserializerKt
import com.discord.chat.reactevents.LongPressAttachmentLinkData
import com.discord.chat.reactevents.LongPressLinkData
import com.discord.chat.reactevents.TapAttachmentLinkData
import com.discord.chat.reactevents.TapEmojiData
import com.discord.chat.reactevents.TapInlineCodeEvent
import com.discord.chat.reactevents.TapLinkData
import com.discord.chat.reactevents.TapMentionData
import com.discord.chat.reactevents.TapTimestampEvent
import com.discord.misc.utilities.measure.ViewMeasureExtensionsKt
import com.discord.reactevents.ReactEvents
import com.facebook.react.bridge.ReadableMap
import com.facebook.react.module.annotations.ReactModule
import com.facebook.react.uimanager.SimpleViewManager
import com.facebook.react.uimanager.ThemedReactContext
import com.facebook.react.uimanager.annotations.ReactProp
import java.util.LinkedHashMap
import kotlin.jvm.internal.SourceDebugExtension
import kotlinx.serialization.json.Json
import org.json.JSONObject

@ReactModule(name = "TextDisplayComponentView")
@SourceDebugExtension(["SMAP\nTextDisplayComponentViewManager.kt\nKotlin\n*S Kotlin\n*F\n+ 1 TextDisplayComponentViewManager.kt\ncom/discord/chat/presentation/message/view/botuikit/react/TextDisplayComponentViewManager\n+ 2 Maps.kt\nkotlin/collections/MapsKt__MapsKt\n+ 3 ComponentDeserializer.kt\ncom/discord/chat/presentation/message/view/botuikit/react/deserialization/ComponentDeserializerKt\n*L\n1#1,200:1\n381#2,7:201\n381#2,7:218\n14#3,10:208\n*S KotlinDebug\n*F\n+ 1 TextDisplayComponentViewManager.kt\ncom/discord/chat/presentation/message/view/botuikit/react/TextDisplayComponentViewManager\n*L\n82#1:201,7\n90#1:218,7\n83#1:208,10\n*E\n"])
public class TextDisplayComponentViewManager : SimpleViewManager<TextDisplayComponentView> {
   private final val reactEvents: ReactEvents =
      new ReactEvents(
         A9.s.a("onTapLink", TapLinkData::class),
         A9.s.a("onLongPressLink", LongPressLinkData::class),
         A9.s.a("onTapAttachmentLink", TapAttachmentLinkData::class),
         A9.s.a("onLongPressAttachmentLink", LongPressAttachmentLinkData::class),
         A9.s.a("onTapMention", TapMentionData::class),
         A9.s.a("onTapTimestamp", TapTimestampEvent::class),
         A9.s.a("onTapInlineCode", TapInlineCodeEvent::class),
         A9.s.a("onTapEmoji", TapEmojiData::class)
      )
      private final val viewToDataMapping: MutableMap<TextDisplayComponentView, PartialData> = new LinkedHashMap()

   private fun createTextDisplayComponentContext(view: TextDisplayComponentView, data: Data): ComponentContext {
      val var4: java.lang.String = var2.getMarkdownTextRenderOptions().getContainerId();
      val var3: ComponentContextDefaults = ComponentContextDefaults.INSTANCE;
      return new ComponentContext(
         var4,
         ComponentContextDefaults.INSTANCE.getGENERAL_HANDLERS(),
         var2.getMarkdownTextRenderOptions(),
         new MarkdownTextRenderEventHandlers(
            new B(this, var1),
            new K(this, var1),
            new L(),
            new M(),
            new N(this, var1),
            new O(this, var1),
            new C(this, var1),
            new D(),
            new E(),
            new F(this, var1),
            new G(this, var1),
            new H(this, var1),
            new I(this, var1),
            new J()
         ),
         var3.getMEDIA_HANDLERS(),
         var3.getCOMPONENT_HANDLERS(),
         new WidthInfo(0, 0, 0, 4, null),
         false,
         false,
         false,
         true
      );
   }

   @JvmStatic
   fun `createTextDisplayComponentContext$lambda$10`(var0: CommandMentionContentNode): Unit {
      return Unit.a;
   }

   @JvmStatic
   fun `createTextDisplayComponentContext$lambda$11`(var0: TextDisplayComponentViewManager, var1: TextDisplayComponentView): Unit {
      var0.tryConfigure(var1);
      return Unit.a;
   }

   @JvmStatic
   fun `createTextDisplayComponentContext$lambda$12`(var0: TextDisplayComponentViewManager, var1: TextDisplayComponentView, var2: java.lang.String): Unit {
      var0.reactEvents.emitEvent(var1, new TapTimestampEvent(var2));
      return Unit.a;
   }

   @JvmStatic
   fun `createTextDisplayComponentContext$lambda$13`(var0: TextDisplayComponentViewManager, var1: TextDisplayComponentView, var2: InlineCodeContentNode): Unit {
      var0.reactEvents.emitEvent(var1, new TapInlineCodeEvent(var2));
      return Unit.a;
   }

   @JvmStatic
   fun `createTextDisplayComponentContext$lambda$14`(var0: TextDisplayComponentViewManager, var1: TextDisplayComponentView, var2: EmojiContentNode): Unit {
      var0.reactEvents.emitEvent(var1, new TapEmojiData(var2));
      return Unit.a;
   }

   @JvmStatic
   fun `createTextDisplayComponentContext$lambda$15`(var0: SoundmojiContentNode): Unit {
      return Unit.a;
   }

   @JvmStatic
   fun `createTextDisplayComponentContext$lambda$2`(var0: TextDisplayComponentViewManager, var1: TextDisplayComponentView, var2: LinkContentNode): Unit {
      var0.reactEvents.emitEvent(var1, new TapLinkData(null, var2, null));
      return Unit.a;
   }

   @JvmStatic
   fun `createTextDisplayComponentContext$lambda$3`(var0: TextDisplayComponentViewManager, var1: TextDisplayComponentView, var2: LinkContentNode): Unit {
      var0.reactEvents.emitEvent(var1, new LongPressLinkData(var2.getUrl()));
      return Unit.a;
   }

   @JvmStatic
   fun `createTextDisplayComponentContext$lambda$4`(var0: java.lang.String, var1: java.lang.String, var2: java.lang.String): Unit {
      return Unit.a;
   }

   @JvmStatic
   fun `createTextDisplayComponentContext$lambda$5`(var0: java.lang.String, var1: java.lang.String, var2: java.lang.String, var3: java.lang.String): Unit {
      return Unit.a;
   }

   @JvmStatic
   fun `createTextDisplayComponentContext$lambda$6`(var0: TextDisplayComponentViewManager, var1: TextDisplayComponentView, var2: java.lang.String): Unit {
      var0.reactEvents.emitEvent(var1, new TapAttachmentLinkData(var2));
      return Unit.a;
   }

   @JvmStatic
   fun `createTextDisplayComponentContext$lambda$7`(
      var0: TextDisplayComponentViewManager, var1: TextDisplayComponentView, var2: java.lang.String, var3: java.lang.String
   ): Unit {
      var0.reactEvents.emitEvent(var1, new LongPressAttachmentLinkData(var2, var3));
      return Unit.a;
   }

   @JvmStatic
   fun `createTextDisplayComponentContext$lambda$8`(
      var0: TextDisplayComponentViewManager,
      var1: TextDisplayComponentView,
      var2: java.lang.String,
      var3: java.lang.String,
      var4: java.lang.String,
      var5: java.lang.String
   ): Unit {
      var0.reactEvents.emitEvent(var1, new TapMentionData(var2, var3, var4, var5));
      return Unit.a;
   }

   @JvmStatic
   fun `createTextDisplayComponentContext$lambda$9`(var0: CommandMentionContentNode): Unit {
      return Unit.a;
   }

   private fun tryConfigure(view: TextDisplayComponentView) {
      val var2: PartialData = this.viewToDataMapping.get(var1);
      if (var2 != null) {
         val var4: Data = var2.toData();
         if (var4 != null) {
            var1.configure(var4.getComponent(), this.createTextDisplayComponentContext(var1, var4));
            ViewMeasureExtensionsKt.measureAndLayout(var1);
         }
      }
   }

   protected open fun createViewInstance(reactContext: ThemedReactContext): TextDisplayComponentView {
      return new TextDisplayComponentView(var1);
   }

   public open fun getExportedCustomDirectEventTypeConstants(): MutableMap<String, Any> {
      return this.reactEvents.exportEventConstants();
   }

   public open fun getName(): String {
      return "TextDisplayComponentView";
   }

   public open fun onDropViewInstance(view: TextDisplayComponentView) {
      this.viewToDataMapping.remove(var1);
      super.onDropViewInstance(var1);
   }

   @ReactProp(name = "markdownTextRenderOptions")
   public fun setMarkdownTextRenderOptions(view: TextDisplayComponentView, options: ReadableMap) {
      val var5: java.util.Map = this.viewToDataMapping;
      var var4: Any = this.viewToDataMapping.get(var1);
      var var3: Any = var4;
      if (var4 == null) {
         var3 = new PartialData(null, null, 3, null);
         var5.put(var1, var3);
      }

      val var8: PartialData = var3 as PartialData;
      var4 = var2.getString("containerId");
      var3 = var4;
      if (var4 == null) {
         var3 = "";
      }

      var8.setMarkdownTextRenderOptions(
         new MarkdownTextRenderOptions(
            (java.lang.String)var3,
            var2.getBoolean("shouldAnimateEmoji"),
            var2.getBoolean("shouldShowLinkDecorations"),
            var2.getBoolean("shouldShowRoleDot"),
            var2.getBoolean("shouldShowRoleOnName")
         )
      );
      this.tryConfigure(var1);
   }

   @ReactProp(name = "model")
   public fun setModel(view: TextDisplayComponentView, model: ReadableMap) {
      val var6: java.util.Map = this.viewToDataMapping;
      var var5: Json = this.viewToDataMapping.get(var1);
      var var4: StringBuilder = var5;
      if (var5 == null) {
         var4 = new PartialData(null, null, 3, null);
         var6.put(var1, var4);
      }

      var var3: Boolean;
      try {
         var5 = ComponentDeserializerKt.getJson();
         val var25: ComponentSerializer = ComponentSerializer.INSTANCE;
         val var15: java.lang.String = new JSONObject(var2.toHashMap()).toString();
         var16 = var5.b(var25, var15) as Component;
         var3 = var16 is TextDisplayComponent;
      } catch (var9: Exception) {
         val var10: java.lang.String = (TextDisplayComponent::class).getSimpleName();
         val var14: java.lang.String = var9.getMessage();
         var4 = new StringBuilder();
         var4.append("Error while deserializing ");
         var4.append(var10);
         var4.append(": ");
         var4.append(var14);
         throw new IllegalStateException(var4.toString().toString());
      }

      if (var3) {
         (var4 as PartialData).setComponent(var16 as TextDisplayComponent);
         this.tryConfigure(var1);
      } else {
         try {
            val var12: java.lang.String = (TextDisplayComponent::class).getSimpleName();
            val var23: java.lang.String = (var16.getClass()::class).getSimpleName();
            val var18: StringBuilder = new StringBuilder();
            var18.append("Expected ");
            var18.append(var12);
            var18.append(" but got ");
            var18.append(var23);
            throw new IllegalStateException(var18.toString().toString());
         } catch (var8: Exception) {
            val var11: java.lang.String = (TextDisplayComponent::class).getSimpleName();
            val var17: java.lang.String = var8.getMessage();
            var4 = new StringBuilder();
            var4.append("Error while deserializing ");
            var4.append(var11);
            var4.append(": ");
            var4.append(var17);
            throw new IllegalStateException(var4.toString().toString());
         }
      }
   }

   public companion object {
      public const val NAME: String
   }
}
