package com.discord.fastest_list.react

import com.discord.fastest_list.android.FastestListSections
import com.discord.fastest_list.android.FastestListView
import com.discord.fastest_list.android.FastestListVisibleItemsTracker
import com.discord.fastest_list.android.placeholder.FastestListPlaceholderConfig
import com.discord.fastest_list.android.scroll.FastestListScrollOffset
import com.discord.fastest_list.react_events.OnLayoutEvent
import com.discord.fastest_list.react_events.OnScrollBeginDragEvent
import com.discord.fastest_list.react_events.OnScrollEndDragEvent
import com.discord.fastest_list.react_events.OnScrollEvent
import com.discord.fastest_list.react_events.OnUnexpectedItemSizeEvent
import com.discord.fastest_list.react_events.OnVisibleItemsChangedEvent
import com.discord.misc.utilities.size.SizeUtilsKt
import com.discord.react.utilities.InitialPropsViewGroupManager
import com.discord.react.utilities.ReactStylesDiffMapExtensionsKt
import com.discord.reactevents.ReactEvents
import com.facebook.react.bridge.ReadableMap
import com.facebook.react.module.annotations.ReactModule
import com.facebook.react.uimanager.ReactStylesDiffMap
import com.facebook.react.uimanager.ThemedReactContext
import com.facebook.react.uimanager.annotations.ReactProp
import com.facebook.react.viewmanagers.FastestListManagerDelegate
import com.facebook.react.viewmanagers.FastestListManagerInterface
import eh.w
import kotlin.jvm.functions.Function2
import kotlin.jvm.functions.Function3
import kotlin.jvm.functions.Function5
import kotlin.jvm.functions.Function6
import kotlin.jvm.internal.h0
import kotlin.jvm.internal.r

@ReactModule(name = "FastestList")
internal class FastestListViewManager : InitialPropsViewGroupManager<FastestListView>, FastestListManagerInterface<FastestListView> {
   private final val delegate: FastestListManagerDelegate<FastestListView, FastestListViewManager> = new FastestListManagerDelegate(this)
   private final val reactEvents: ReactEvents =
      new ReactEvents(
         new Pair[]{
            w.a("onUnexpectedItemSize", h0.b(OnUnexpectedItemSizeEvent.class)),
            w.a("onLayout", h0.b(OnLayoutEvent.class)),
            w.a("onScroll", h0.b(OnScrollEvent.class)),
            w.a("onScrollBeginDrag", h0.b(OnScrollBeginDragEvent.class)),
            w.a("onScrollEndDrag", h0.b(OnScrollEndDragEvent.class)),
            w.a("onVisibleItemsChanged", h0.b(OnVisibleItemsChangedEvent.class))
         }
      )

   public open fun createViewInstance(reactContext: ThemedReactContext, initialProps: ReactStylesDiffMap): FastestListView {
      r.h(var1, "reactContext");
      r.h(var2, "initialProps");
      return new FastestListView(
         var1,
         ReactStylesDiffMapExtensionsKt.getBoolean(var2, "horizontal"),
         ReactStylesDiffMapExtensionsKt.getNonNullInt(var2, "insetEnd"),
         ReactStylesDiffMapExtensionsKt.getNonNullInt(var2, "insetStart"),
         ReactStylesDiffMapExtensionsKt.getBoolean(var2, "keyboardDismissOnDrag"),
         new Function5<FastestListView, Integer, Integer, Integer, Integer, Unit>(this) {
            final FastestListViewManager this$0;

            {
               super(5);
               this.this$0 = var1;
            }

            public final void invoke(FastestListView var1, int var2, int var3, int var4, int var5) {
               r.h(var1, "view");
               FastestListViewManager.access$getReactEvents$p(this.this$0)
                  .emitEvent(
                     var1,
                     new OnLayoutEvent(SizeUtilsKt.getPxToDp(var2), SizeUtilsKt.getPxToDp(var3), SizeUtilsKt.getPxToDp(var4), SizeUtilsKt.getPxToDp(var5))
                  );
            }
         },
         100L,
         new Function2<FastestListView, FastestListScrollOffset.Data, Unit>(this) {
            final FastestListViewManager this$0;

            {
               super(2);
               this.this$0 = var1;
            }

            public final void invoke(FastestListView var1, FastestListScrollOffset.Data var2) {
               r.h(var1, "view");
               r.h(var2, "data");
               FastestListViewManager.access$getReactEvents$p(this.this$0).emitEvent(var1, new OnScrollEvent(var2));
            }
         },
         new Function2<FastestListView, FastestListScrollOffset.Data, Unit>(this) {
            final FastestListViewManager this$0;

            {
               super(2);
               this.this$0 = var1;
            }

            public final void invoke(FastestListView var1, FastestListScrollOffset.Data var2) {
               r.h(var1, "view");
               r.h(var2, "data");
               FastestListViewManager.access$getReactEvents$p(this.this$0).emitEvent(var1, new OnScrollBeginDragEvent(var2));
            }
         },
         new Function2<FastestListView, FastestListScrollOffset.Data, Unit>(this) {
            final FastestListViewManager this$0;

            {
               super(2);
               this.this$0 = var1;
            }

            public final void invoke(FastestListView var1, FastestListScrollOffset.Data var2) {
               r.h(var1, "view");
               r.h(var2, "data");
               FastestListViewManager.access$getReactEvents$p(this.this$0).emitEvent(var1, new OnScrollEndDragEvent(var2));
            }
         },
         new Function3<FastestListView, FastestListSections.Entry, Integer, Unit>(this) {
            final FastestListViewManager this$0;

            {
               super(3);
               this.this$0 = var1;
            }

            public final void invoke(FastestListView var1, FastestListSections.Entry var2, int var3) {
               r.h(var1, "view");
               r.h(var2, "entry");
               FastestListViewManager.access$getReactEvents$p(this.this$0).emitEvent(var1, new OnUnexpectedItemSizeEvent(var2, var3));
            }
         },
         new Function6<FastestListView, java.lang.String, Integer, Integer, Integer, Integer, Unit>(this) {
            final FastestListViewManager this$0;

            {
               super(6);
               this.this$0 = var1;
            }

            public final void invoke(FastestListView var1, java.lang.String var2, int var3, int var4, int var5, int var6) {
               r.h(var1, "view");
               r.h(var2, "sectionsId");
               FastestListViewManager.access$getReactEvents$p(this.this$0).emitEvent(var1, new OnVisibleItemsChangedEvent(var2, var3, var4, var5, var6));
            }
         },
         FastestListDeserializerPlaceholderConfigKt.invoke(
            FastestListPlaceholderConfig.Companion, ReactStylesDiffMapExtensionsKt.getNonNullMap(var2, "placeholderConfig")
         ),
         FastestListVisibleItemsTracker.RenderAhead.Companion.create(ReactStylesDiffMapExtensionsKt.getNonNullString(var2, "renderAhead")),
         FastestListDeserializerSectionsKt.invoke(
            FastestListSections.Versioned.Companion, ReactStylesDiffMapExtensionsKt.getNonNullMap(var2, "sectionsVersioned")
         ),
         ReactStylesDiffMapExtensionsKt.getBoolean(var2, "showsHorizontalScrollIndicator"),
         ReactStylesDiffMapExtensionsKt.getBoolean(var2, "showsVerticalScrollIndicator")
      );
   }

   protected open fun getDelegate(): FastestListManagerDelegate<FastestListView, FastestListViewManager> {
      return this.delegate;
   }

   public open fun getExportedCustomDirectEventTypeConstants(): MutableMap<String, Any> {
      return this.reactEvents.exportEventConstants();
   }

   public open fun getName(): String {
      return "FastestList";
   }

   public open fun onDropViewInstance(view: FastestListView) {
      r.h(var1, "view");
      var1.onDrop();
   }

   public open fun scrollToLocation(view: FastestListView, section: Int, item: Int, animated: Boolean) {
      r.h(var1, "view");
      var1.scrollTo(var2, var3, var4);
   }

   public open fun scrollToTop(view: FastestListView, animated: Boolean) {
      r.h(var1, "view");
      var1.scrollToTop(var2);
   }

   @ReactProp(name = "horizontal")
   public open fun setHorizontal(view: FastestListView, value: Boolean) {
      r.h(var1, "view");
      var1.setHorizontal(var2);
   }

   @ReactProp(name = "insetEnd")
   public open fun setInsetEnd(view: FastestListView, value: Int) {
      r.h(var1, "view");
      var1.setInsetEnd(SizeUtilsKt.getDpToPx(var2));
   }

   @ReactProp(name = "insetStart")
   public open fun setInsetStart(view: FastestListView, value: Int) {
      r.h(var1, "view");
      var1.setInsetStart(SizeUtilsKt.getDpToPx(var2));
   }

   @ReactProp(name = "keyboardDismissOnDrag")
   public open fun setKeyboardDismissOnDrag(view: FastestListView, value: Boolean) {
      r.h(var1, "view");
      var1.setKeyboardDismissOnDrag(var2);
   }

   @ReactProp(name = "placeholderConfig")
   public open fun setPlaceholderConfig(view: FastestListView, value: ReadableMap?) {
      r.h(var1, "view");
      if (var2 != null) {
         var1.setPlaceholderConfig(FastestListDeserializerPlaceholderConfigKt.invoke(FastestListPlaceholderConfig.Companion, var2));
      } else {
         throw new IllegalArgumentException("Required value was null.".toString());
      }
   }

   @ReactProp(name = "renderAhead")
   public open fun setRenderAhead(view: FastestListView, value: String?) {
      r.h(var1, "view");
      if (var2 != null) {
         var1.setRenderAhead(FastestListVisibleItemsTracker.RenderAhead.Companion.create(var2));
      } else {
         throw new IllegalArgumentException("Required value was null.".toString());
      }
   }

   @ReactProp(name = "sectionsVersioned")
   public open fun setSectionsVersioned(view: FastestListView, value: ReadableMap?) {
      r.h(var1, "view");
      if (var2 != null) {
         var1.setSectionsVersioned(FastestListDeserializerSectionsKt.invoke(FastestListSections.Versioned.Companion, var2));
      } else {
         throw new IllegalArgumentException("Required value was null.".toString());
      }
   }

   @ReactProp(name = "showsHorizontalScrollIndicator")
   public open fun setShowsHorizontalScrollIndicator(view: FastestListView, value: Boolean) {
      r.h(var1, "view");
      var1.setShowsHorizontalScrollIndicator(var2);
   }

   @ReactProp(name = "showsVerticalScrollIndicator")
   public open fun setShowsVerticalScrollIndicator(view: FastestListView, value: Boolean) {
      r.h(var1, "view");
      var1.setShowsVerticalScrollIndicator(var2);
   }

   public companion object {
      internal const val NAME: String
      private const val PROP_HORIZONTAL: String
      private const val PROP_INSET_END: String
      private const val PROP_INSET_START: String
      private const val PROP_KEYBOARD_DISMISS_ON_DRAG: String
      private const val PROP_PLACEHOLDER_CONFIG: String
      private const val PROP_RENDER_AHEAD: String
      private const val PROP_SECTIONS_VERSIONED: String
      private const val PROP_SHOWS_HORIZONTAL_SCROLL_INDICATOR: String
      private const val PROP_SHOWS_VERTICAL_SCROLL_INDICATOR: String
   }
}
