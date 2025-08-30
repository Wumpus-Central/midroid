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
import kotlin.jvm.internal.SourceDebugExtension
import kotlinx.serialization.json.Json
import org.json.JSONObject

@ReactModule(name = "TextDisplayComponentView")
@SourceDebugExtension(["SMAP\nTextDisplayComponentViewManager.kt\nKotlin\n*S Kotlin\n*F\n+ 1 TextDisplayComponentViewManager.kt\ncom/discord/chat/presentation/message/view/botuikit/react/TextDisplayComponentViewManager\n+ 2 ComponentDeserializer.kt\ncom/discord/chat/presentation/message/view/botuikit/react/deserialization/ComponentDeserializerKt\n*L\n1#1,152:1\n14#2,10:153\n*S KotlinDebug\n*F\n+ 1 TextDisplayComponentViewManager.kt\ncom/discord/chat/presentation/message/view/botuikit/react/TextDisplayComponentViewManager\n*L\n67#1:153,10\n*E\n"])
public class TextDisplayComponentViewManager : SimpleViewManager<TextDisplayComponentView> {
   private final val reactEvents: ReactEvents =
      new ReactEvents(
         B9.s.a("onTapLink", TapLinkData::class),
         B9.s.a("onLongPressLink", LongPressLinkData::class),
         B9.s.a("onTapAttachmentLink", TapAttachmentLinkData::class),
         B9.s.a("onLongPressAttachmentLink", LongPressAttachmentLinkData::class),
         B9.s.a("onTapMention", TapMentionData::class),
         B9.s.a("onTapTimestamp", TapTimestampEvent::class),
         B9.s.a("onTapInlineCode", TapInlineCodeEvent::class),
         B9.s.a("onTapEmoji", TapEmojiData::class)
      )
      private final var markdownOptions: MarkdownTextRenderOptions
   private final val viewComponents: MutableMap<TextDisplayComponentView, TextDisplayComponent>

   private fun configureView(view: TextDisplayComponentView, component: TextDisplayComponent) {
      var1.configure(var2, this.createTextDisplayComponentContext(var1));
      ViewMeasureExtensionsKt.measureAndLayout(var1);
   }

   private fun createTextDisplayComponentContext(view: TextDisplayComponentView): ComponentContext {
      val var2: ComponentContextDefaults = ComponentContextDefaults.INSTANCE;
      return new ComponentContext(
         "",
         ComponentContextDefaults.INSTANCE.getGENERAL_HANDLERS(),
         this.markdownOptions,
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
            new F(),
            new G(this, var1),
            new H(this, var1),
            new I(this, var1),
            new J()
         ),
         var2.getMEDIA_HANDLERS(),
         var2.getCOMPONENT_HANDLERS(),
         new WidthInfo(0, 0, 0, 4, null),
         false,
         false,
         false,
         true
      );
   }

   @JvmStatic
   fun `createTextDisplayComponentContext$lambda$1`(var0: TextDisplayComponentViewManager, var1: TextDisplayComponentView, var2: LinkContentNode): Unit {
      var0.reactEvents.emitEvent(var1, new TapLinkData(null, var2, null));
      return Unit.a;
   }

   @JvmStatic
   fun `createTextDisplayComponentContext$lambda$10`(): Unit {
      return Unit.a;
   }

   @JvmStatic
   fun `createTextDisplayComponentContext$lambda$11`(var0: TextDisplayComponentViewManager, var1: TextDisplayComponentView, var2: java.lang.String): Unit {
      var0.reactEvents.emitEvent(var1, new TapTimestampEvent(var2));
      return Unit.a;
   }

   @JvmStatic
   fun `createTextDisplayComponentContext$lambda$12`(var0: TextDisplayComponentViewManager, var1: TextDisplayComponentView, var2: InlineCodeContentNode): Unit {
      var0.reactEvents.emitEvent(var1, new TapInlineCodeEvent(var2));
      return Unit.a;
   }

   @JvmStatic
   fun `createTextDisplayComponentContext$lambda$13`(var0: TextDisplayComponentViewManager, var1: TextDisplayComponentView, var2: EmojiContentNode): Unit {
      var0.reactEvents.emitEvent(var1, new TapEmojiData(var2));
      return Unit.a;
   }

   @JvmStatic
   fun `createTextDisplayComponentContext$lambda$14`(var0: SoundmojiContentNode): Unit {
      return Unit.a;
   }

   @JvmStatic
   fun `createTextDisplayComponentContext$lambda$2`(var0: TextDisplayComponentViewManager, var1: TextDisplayComponentView, var2: LinkContentNode): Unit {
      var0.reactEvents.emitEvent(var1, new LongPressLinkData(var2.getUrl()));
      return Unit.a;
   }

   @JvmStatic
   fun `createTextDisplayComponentContext$lambda$3`(var0: java.lang.String, var1: java.lang.String, var2: java.lang.String): Unit {
      return Unit.a;
   }

   @JvmStatic
   fun `createTextDisplayComponentContext$lambda$4`(var0: java.lang.String, var1: java.lang.String, var2: java.lang.String, var3: java.lang.String): Unit {
      return Unit.a;
   }

   @JvmStatic
   fun `createTextDisplayComponentContext$lambda$5`(var0: TextDisplayComponentViewManager, var1: TextDisplayComponentView, var2: java.lang.String): Unit {
      var0.reactEvents.emitEvent(var1, new TapAttachmentLinkData(var2));
      return Unit.a;
   }

   @JvmStatic
   fun `createTextDisplayComponentContext$lambda$6`(
      var0: TextDisplayComponentViewManager, var1: TextDisplayComponentView, var2: java.lang.String, var3: java.lang.String
   ): Unit {
      var0.reactEvents.emitEvent(var1, new LongPressAttachmentLinkData(var2, var3));
      return Unit.a;
   }

   @JvmStatic
   fun `createTextDisplayComponentContext$lambda$7`(
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
   fun `createTextDisplayComponentContext$lambda$8`(var0: CommandMentionContentNode): Unit {
      return Unit.a;
   }

   @JvmStatic
   fun `createTextDisplayComponentContext$lambda$9`(var0: CommandMentionContentNode): Unit {
      return Unit.a;
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
      this.viewComponents.remove(var1);
      super.onDropViewInstance(var1);
   }

   @ReactProp(name = "markdownTextRenderOptions")
   public fun setMarkdownTextRenderOptions(view: TextDisplayComponentView, options: ReadableMap) {
      this.markdownOptions = new MarkdownTextRenderOptions(
         this.markdownOptions.getContainerId(),
         var2.getBoolean("shouldAnimateEmoji"),
         var2.getBoolean("shouldShowLinkDecorations"),
         var2.getBoolean("shouldShowRoleDot"),
         var2.getBoolean("shouldShowRoleOnName")
      );
      val var3: TextDisplayComponent = this.viewComponents.get(var1);
      if (var3 != null) {
         this.configureView(var1, var3);
      }
   }

   @ReactProp(name = "model")
   public fun setModel(view: TextDisplayComponentView, model: ReadableMap) {
      var var3: Boolean;
      try {
         val var20: Json = ComponentDeserializerKt.getJson();
         val var5: ComponentSerializer = ComponentSerializer.INSTANCE;
         val var14: java.lang.String = new JSONObject(var2.toHashMap()).toString();
         var15 = var20.b(var5, var14) as Component;
         var3 = var15 is TextDisplayComponent;
      } catch (var8: Exception) {
         val var9: java.lang.String = (TextDisplayComponent::class).getSimpleName();
         val var13: java.lang.String = var8.getMessage();
         val var4: StringBuilder = new StringBuilder();
         var4.append("Error while deserializing ");
         var4.append(var9);
         var4.append(": ");
         var4.append(var13);
         throw new IllegalStateException(var4.toString().toString());
      }

      if (var3) {
         val var19: TextDisplayComponent = var15 as TextDisplayComponent;
         this.viewComponents.put(var1, var15 as TextDisplayComponent);
         this.configureView(var1, var19);
      } else {
         try {
            val var11: java.lang.String = (TextDisplayComponent::class).getSimpleName();
            val var17: java.lang.String = (var15.getClass()::class).getSimpleName();
            val var22: StringBuilder = new StringBuilder();
            var22.append("Expected ");
            var22.append(var11);
            var22.append(" but got ");
            var22.append(var17);
            throw new IllegalStateException(var22.toString().toString());
         } catch (var7: Exception) {
            val var10: java.lang.String = (TextDisplayComponent::class).getSimpleName();
            val var16: java.lang.String = var7.getMessage();
            val var21: StringBuilder = new StringBuilder();
            var21.append("Error while deserializing ");
            var21.append(var10);
            var21.append(": ");
            var21.append(var16);
            throw new IllegalStateException(var21.toString().toString());
         }
      }
   }

   public companion object {
      public const val NAME: String
   }
}
