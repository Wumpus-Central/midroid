package com.discord.emoji_picker.react

import android.view.View
import com.discord.emoji_picker.EmojiPickerCache
import com.discord.emoji_picker.EmojiPickerItem
import com.discord.emoji_picker.EmojiPickerItemData
import com.discord.emoji_picker.EmojiPickerScroller
import com.discord.emoji_picker.EmojiPickerView
import com.discord.emoji_picker.react.deserialization.EmojiPickerItemDataCoreDataDeserializer
import com.discord.emoji_picker.react.deserialization.EmojiPickerViewConfigDeserializer
import com.discord.emoji_picker.react_events.OnLongPressEmojiEvent
import com.discord.emoji_picker.react_events.OnPressEmojiEvent
import com.discord.emoji_picker.react_events.OnScrollBeginDragEvent
import com.discord.emoji_picker.react_events.OnScrollEndDragEvent
import com.discord.emoji_picker.react_events.OnScrollEvent
import com.discord.emoji_picker.react_events.OnShowNitroUpsell
import com.discord.emoji_picker.react_events.OnStickyHeaderRenderEvent
import com.discord.react.utilities.InitialPropsViewGroupManager
import com.discord.react.utilities.ReactStylesDiffMapExtensionsKt
import com.discord.reactevents.ReactEvents
import com.facebook.react.bridge.ReadableMap
import com.facebook.react.module.annotations.ReactModule
import com.facebook.react.uimanager.ReactStylesDiffMap
import com.facebook.react.uimanager.ThemedReactContext
import com.facebook.react.uimanager.annotations.ReactProp
import com.facebook.react.viewmanagers.EmojiPickerViewManagerDelegate
import com.facebook.react.viewmanagers.EmojiPickerViewManagerInterface
import java.util.LinkedHashMap
import java.util.Map.Entry
import kh.w
import kotlin.jvm.functions.Function2
import kotlin.jvm.functions.Function3
import kotlin.jvm.internal.g0
import kotlin.jvm.internal.q

@ReactModule(name = "EmojiPickerView")
internal class EmojiPickerViewManager : InitialPropsViewGroupManager<EmojiPickerView>, EmojiPickerViewManagerInterface<EmojiPickerView> {
   private final val delegate: EmojiPickerViewManagerDelegate<EmojiPickerView, EmojiPickerViewManager> = new EmojiPickerViewManagerDelegate(this)
   private final val emojiPickerCaches: MutableMap<EmojiPickerView, EmojiPickerCache> = new LinkedHashMap()
   private final val reactEvents: ReactEvents =
      new ReactEvents(
         w.a("onPressEmoji", g0.b(OnPressEmojiEvent.class)),
         w.a("onLongPressEmoji", g0.b(OnLongPressEmojiEvent.class)),
         w.a("onScroll", g0.b(OnScrollEvent.class)),
         w.a("onScrollBeginDrag", g0.b(OnScrollBeginDragEvent.class)),
         w.a("onScrollEndDrag", g0.b(OnScrollEndDragEvent.class)),
         w.a("onStickyHeaderRender", g0.b(OnStickyHeaderRenderEvent.class)),
         w.a("onShowNitroUpsell", g0.b(OnShowNitroUpsell.class))
      )

   public open fun createViewInstance(reactContext: ThemedReactContext, initialProps: ReactStylesDiffMap): EmojiPickerView {
      q.h(var1, "reactContext");
      q.h(var2, "initialProps");
      val var9: ReadableMap = var2.getMap("config");
      val var4: Float = var2.getFloat("paddingTop", 0.0F);
      val var3: Float = var2.getFloat("paddingBottom", 0.0F);
      val var6: Int = var2.getInt("emojiSize", -1);
      val var5: Int = var2.getInt("emojiMargin", -1);
      val var8: ReadableMap = var2.getMap("emojiData");
      if (var9 != null) {
         if (var6 != -1) {
            if (var5 != -1) {
               if (var8 != null) {
                  val var12: EmojiPickerItemData.CoreData = EmojiPickerItemDataCoreDataDeserializer.INSTANCE
                     .deserialize(EmojiPickerItemData.CoreData.Companion, var8, var3, var4);
                  val var10: EmojiPickerView = new EmojiPickerView(
                     var1,
                     var6,
                     var5,
                     var12,
                     new Function3(this, var1) {
                        final ThemedReactContext $reactContext;
                        final EmojiPickerViewManager this$0;

                        {
                           super(3);
                           this.this$0 = var1;
                           this.$reactContext = var2;
                        }

                        public final void invoke(View var1, java.lang.Long var2, java.lang.String var3) {
                           q.h(var1, "view");
                           q.h(var3, "emojiName");
                           val var4: ReactEvents = EmojiPickerViewManager.access$getReactEvents$p(this.this$0);
                           val var6: java.lang.String;
                           if (var2 != null) {
                              var6 = var2.toString();
                           } else {
                              var6 = null;
                           }

                           var4.emitEvent(this.$reactContext, var1, new OnPressEmojiEvent(var3, var6));
                        }
                     },
                     new Function2(this) {
                        final EmojiPickerViewManager this$0;

                        {
                           super(2);
                           this.this$0 = var1;
                        }

                        public final void invoke(EmojiPickerView var1, EmojiPickerScroller.ScrollEvent var2) {
                           q.h(var1, "view");
                           q.h(var2, "data");
                           EmojiPickerViewManager.access$getReactEvents$p(this.this$0).emitEvent(var1, new OnScrollEvent(var2));
                        }
                     },
                     new Function2(this) {
                        final EmojiPickerViewManager this$0;

                        {
                           super(2);
                           this.this$0 = var1;
                        }

                        public final void invoke(EmojiPickerView var1, EmojiPickerScroller.ScrollEvent var2) {
                           q.h(var1, "view");
                           q.h(var2, "data");
                           EmojiPickerViewManager.access$getReactEvents$p(this.this$0).emitEvent(var1, new OnScrollBeginDragEvent(var2));
                        }
                     },
                     new Function2(this) {
                        final EmojiPickerViewManager this$0;

                        {
                           super(2);
                           this.this$0 = var1;
                        }

                        public final void invoke(EmojiPickerView var1, EmojiPickerScroller.ScrollEvent var2) {
                           q.h(var1, "view");
                           q.h(var2, "data");
                           EmojiPickerViewManager.access$getReactEvents$p(this.this$0).emitEvent(var1, new OnScrollEndDragEvent(var2));
                        }
                     },
                     new Function3(this, var1) {
                        final ThemedReactContext $reactContext;
                        final EmojiPickerViewManager this$0;

                        {
                           super(3);
                           this.this$0 = var1;
                           this.$reactContext = var2;
                        }

                        public final void invoke(View var1, java.lang.Long var2, java.lang.String var3) {
                           q.h(var1, "view");
                           q.h(var3, "emojiName");
                           val var5: ReactEvents = EmojiPickerViewManager.access$getReactEvents$p(this.this$0);
                           val var6: java.lang.String;
                           if (var2 != null) {
                              var6 = var2.toString();
                           } else {
                              var6 = null;
                           }

                           var5.emitEvent(this.$reactContext, var1, new OnLongPressEmojiEvent(var3, var6));
                        }
                     },
                     new Function2(this, var1) {
                        final ThemedReactContext $reactContext;
                        final EmojiPickerViewManager this$0;

                        {
                           super(2);
                           this.this$0 = var1;
                           this.$reactContext = var2;
                        }

                        public final void invoke(View var1, int var2) {
                           q.h(var1, "view");
                           EmojiPickerViewManager.access$getReactEvents$p(this.this$0).emitEvent(this.$reactContext, var1, new OnStickyHeaderRenderEvent(var2));
                        }
                     },
                     new Function2(this, var1) {
                        final ThemedReactContext $reactContext;
                        final EmojiPickerViewManager this$0;

                        {
                           super(2);
                           this.this$0 = var1;
                           this.$reactContext = var2;
                        }

                        public final void invoke(View var1, boolean var2) {
                           q.h(var1, "view");
                           EmojiPickerViewManager.access$getReactEvents$p(this.this$0).emitEvent(this.$reactContext, var1, new OnShowNitroUpsell(var2));
                        }
                     },
                     ReactStylesDiffMapExtensionsKt.getBoolean(var2, "useTier0UpsellContent"),
                     EmojiPickerViewConfigDeserializer.INSTANCE.deserialize(EmojiPickerView.Config.Companion, var9)
                  );
                  this.emojiPickerCaches.put(var10, new EmojiPickerCache(var10, var12));
                  return var10;
               } else {
                  throw new IllegalArgumentException("Failed requirement.".toString());
               }
            } else {
               throw new IllegalArgumentException("Failed requirement.".toString());
            }
         } else {
            throw new IllegalArgumentException("Failed requirement.".toString());
         }
      } else {
         throw new IllegalArgumentException("Failed requirement.".toString());
      }
   }

   protected open fun getDelegate(): EmojiPickerViewManagerDelegate<EmojiPickerView, EmojiPickerViewManager> {
      return this.delegate;
   }

   public open fun getExportedCustomDirectEventTypeConstants(): MutableMap<String, Any> {
      return this.reactEvents.exportEventConstants();
   }

   public open fun getName(): String {
      return "EmojiPickerView";
   }

   public open fun invalidate() {
      super.invalidate();
      val var1: java.util.Iterator = this.emojiPickerCaches.entrySet().iterator();

      while (var1.hasNext()) {
         ((var1.next() as Entry).getValue() as EmojiPickerCache).invalidate();
      }

      this.emojiPickerCaches.clear();
   }

   public open fun onDropViewInstance(view: EmojiPickerView) {
      q.h(var1, "view");
      super.onDropViewInstance(var1);
      var1.onDestroy();
      val var2: EmojiPickerCache = this.emojiPickerCaches.remove(var1);
      if (var2 != null) {
         var2.invalidate();
      }
   }

   public open fun refreshEmojis(view: EmojiPickerView) {
      q.h(var1, "view");
      val var2: EmojiPickerCache = this.emojiPickerCaches.get(var1);
      if (var2 != null) {
         EmojiPickerCache.refreshEmojis$default(var2, null, 1, null);
      }
   }

   public open fun scrollToHeaderIndex(view: EmojiPickerView, index: Int, animated: Boolean) {
      q.h(var1, "view");
      var1.scrollToItemAtIndex(var2, var3, EmojiPickerItem.ItemType.CATEGORY);
   }

   public open fun scrollingEnabled(view: EmojiPickerView, enabled: Boolean) {
      q.h(var1, "view");
      var1.scrollingEnabled(var2);
   }

   @ReactProp(name = "config")
   public open fun setConfig(view: EmojiPickerView, value: ReadableMap?) {
      q.h(var1, "view");
      if (!this.isInitialProp(var1, "config") && var2 != null) {
         var1.setConfig(EmojiPickerViewConfigDeserializer.INSTANCE.deserialize(EmojiPickerView.Config.Companion, var2));
      }
   }

   @ReactProp(name = "emojiData")
   public open fun setEmojiData(view: EmojiPickerView, value: ReadableMap?) {
      q.h(var1, "view");
      if (!this.isInitialProp(var1, "emojiData") && var2 != null) {
         val var3: EmojiPickerItemData.CoreData = EmojiPickerItemDataCoreDataDeserializer.deserialize$default(
            EmojiPickerItemDataCoreDataDeserializer.INSTANCE, EmojiPickerItemData.CoreData.Companion, var2, 0.0F, 0.0F, 6, null
         );
         val var4: EmojiPickerCache = this.emojiPickerCaches.get(var1);
         if (var4 != null) {
            var4.refreshEmojis(var3);
         }

         var1.setCoreData(var3);
      }
   }

   @ReactProp(name = "emojiMargin")
   public open fun setEmojiMargin(view: EmojiPickerView, value: Int) {
      q.h(var1, "view");
      var1.setEmojiMargin(var2);
   }

   @ReactProp(name = "emojiSize")
   public open fun setEmojiSize(view: EmojiPickerView, value: Int) {
      q.h(var1, "view");
      var1.setEmojiSize(var2);
   }

   @ReactProp(name = "paddingBottom")
   public open fun setPaddingBottom(view: EmojiPickerView, value: Float) {
      q.h(var1, "view");
      var1.setContentPaddingBottom(var2);
   }

   @ReactProp(name = "paddingTop")
   public open fun setPaddingTop(view: EmojiPickerView, value: Float) {
      q.h(var1, "view");
      var1.setContentPaddingTop(var2);
   }

   @ReactProp(name = "useTier0UpsellContent")
   public open fun setUseTier0UpsellContent(view: EmojiPickerView, value: Boolean) {
      q.h(var1, "view");
      var1.setUseTier0UpsellContent(var2);
   }

   public companion object {
      internal const val NAME: String
      private const val PROP_CONFIG: String
      private const val PROP_EMOJI_DATA: String
      private const val PROP_EMOJI_MARGIN: String
      private const val PROP_EMOJI_SIZE: String
      private const val PROP_PADDING_BOTTOM: String
      private const val PROP_PADDING_TOP: String
      private const val PROP_USE_TIER_0_UPSELL_CONTENT: String
   }
}
