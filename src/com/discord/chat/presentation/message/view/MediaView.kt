package com.discord.chat.presentation.message.view

import android.content.Context
import android.content.res.ColorStateList
import android.content.res.Configuration
import android.graphics.drawable.ColorDrawable
import android.graphics.drawable.GradientDrawable
import android.util.AttributeSet
import android.view.LayoutInflater
import android.view.View
import android.view.View.OnClickListener
import android.view.View.OnLongClickListener
import android.widget.FrameLayout
import android.widget.ImageView
import android.widget.ProgressBar
import android.widget.TextView
import android.widget.FrameLayout.LayoutParams
import androidx.constraintlayout.widget.ConstraintLayout
import com.discord.chat.databinding.MediaViewBinding
import com.discord.chat.presentation.message.utils.GetMediaImagePlaceholderStatesListenerKt
import com.discord.chat.presentation.message.view.media.ViewAttachedListener
import com.discord.image.fresco.R
import com.discord.image.fresco.SetOptionalImageUrlKt
import com.discord.media_player.MediaPlayer
import com.discord.media_player.MediaPlayerManager
import com.discord.media_player.MediaPlayerManagerModule
import com.discord.media_player.MediaPlayerView
import com.discord.media_player.MediaSource
import com.discord.media_player.MediaPlayer.Event
import com.discord.media_player.MediaPlayer.PlayerSettings
import com.discord.media_player.reactevents.MediaPlayFinishedAnalytics
import com.discord.misc.utilities.coroutines.CoroutineViewUtilsKt
import com.discord.misc.utilities.measure.ViewMeasureExtensionsKt
import com.discord.misc.utilities.view.ViewBackgroundUtilsKt
import com.discord.portals.from_native.PortalFromNativeContextManager
import com.discord.portals.utils.ViewRemoveFromParentKt
import com.discord.react_asset_fetcher.ReactAsset
import com.discord.react_asset_fetcher.ReactAssetUtilsKt
import com.discord.react_gesture_handler.nested_touch.NestedScrollOnTouchUtilsKt
import com.discord.react_strings.I18nMessage
import com.discord.react_strings.I18nUtilsKt
import com.discord.theme.ThemeManagerKt
import com.discord.theme.utils.ColorUtilsKt
import com.facebook.drawee.generic.GenericDraweeHierarchy
import com.facebook.drawee.view.SimpleDraweeView
import com.facebook.react.bridge.LifecycleEventListener
import com.facebook.react.bridge.ReactContext
import com.facebook.react.uimanager.ThemedReactContext
import kotlin.coroutines.Continuation
import kotlin.jvm.functions.Function2
import kotlinx.coroutines.CoroutineScope
import kotlinx.coroutines.flow.Flow
import kotlinx.coroutines.flow.FlowCollector

public open class MediaView  public constructor(context: Context, attrs: AttributeSet? = null, defStyleAttr: Int = 0) : FrameLayout {
   private final val binding: MediaViewBinding
   private final var mediaPlayerView: MediaPlayerView?
   private final var mediaSource: MediaSource?
   private final var mediaPlayer: MediaPlayer?
   private final var mediaViewScrolling: Boolean
   private final var mediaViewFocused: Boolean
   private final var mediaViewDetached: Boolean
   private final var mediaPlaybackState: Event?
   private final var mediaVolumeOn: Boolean
   private final var mediaShouldResume: Boolean
   private final var mediaOrientation: Int?
   private final var mediaPortalEvent: com.discord.portals.from_native.PortalFromNativeContextManager.Event?
   private final var mediaCanPlayInline: Boolean
   private final var mediaPlayThirdParty: Boolean
   private final var mediaHidePlayButton: Boolean
   private final var mediaThumbnailFadeDuration: Int
   private final var mediaOnPlayCallback: () -> Unit
   private final var overlayTagText: String?
   private final var overlayTagIcon: ReactAsset?
   private final var overlayTagTextColor: Int?
   private final var overlayTagBackgroundColor: Int?
   private final var onMediaPlayFinishedAnalytics: (MediaPlayFinishedAnalytics) -> Unit
   private final var playerSettings: PlayerSettings
   private final var pauseId: String?
   private final val managerModule: MediaPlayerManagerModule?
   private final val attachStateChangeListener: ViewAttachedListener
   private final val lifecycleListener: <unrepresentable>

   private final val reactContext: ReactContext?
      private final get() {
         val var1: Context = this.getContext();
         val var2: ReactContext;
         if (var1 is ReactContext) {
            var2 = var1 as ReactContext;
         } else {
            var2 = null;
         }

         return var2;
      }


   private final val shouldShowGifIndicator: Boolean
      private final get() {
         val var2: Boolean;
         if (var1.isGifv() && !var1.getShouldAutoPlay()) {
            var2 = true;
         } else {
            var2 = false;
         }

         return var2;
      }


   open fun MediaView(var1: Context) {
      kotlin.jvm.internal.q.h(var1, "context");
      this(var1, null, 0, 6, null);
   }

   open fun MediaView(var1: Context, var2: AttributeSet) {
      kotlin.jvm.internal.q.h(var1, "context");
      this(var1, var2, 0, 4, null);
   }

   init {
      kotlin.jvm.internal.q.h(var1, "context");
      super(var1, var2, var3);
      val var4: MediaViewBinding = MediaViewBinding.inflate(LayoutInflater.from(var1), this);
      kotlin.jvm.internal.q.g(var4, "inflate(...)");
      this.binding = var4;
      this.mediaViewFocused = true;
      this.mediaViewDetached = true;
      this.mediaCanPlayInline = true;
      this.mediaThumbnailFadeDuration = this.getResources().getInteger(R.integer.image_fade_duration);
      this.mediaOnPlayCallback = new x0();
      this.onMediaPlayFinishedAnalytics = new y0();
      this.playerSettings = MediaPlayer.Factory.getDefaultSettings();
      val var6: Context;
      if (var1 !is ThemedReactContext) {
         var6 = null;
      } else {
         var6 = var1;
      }

      val var7: ThemedReactContext = var6 as ThemedReactContext;
      val var8: MediaPlayerManagerModule;
      if (var6 as ThemedReactContext != null) {
         var8 = var7.getNativeModule(MediaPlayerManagerModule.class) as MediaPlayerManagerModule;
      } else {
         var8 = null;
      }

      this.managerModule = var8;
      val var9: ViewAttachedListener = new ViewAttachedListener(this, new z0(this), new A0(this));
      this.attachStateChangeListener = var9;
      this.lifecycleListener = new LifecycleEventListener(this) {
         final MediaView this$0;

         {
            this.this$0 = var1;
         }

         public void onHostDestroy() {
         }

         public void onHostPause() {
            MediaView.setMediaData$default(
               this.this$0, null, false, false, false, null, false, null, null, false, false, false, 0, null, null, null, null, null, null, 262135, null
            );
         }

         public void onHostResume() {
            MediaView.setMediaData$default(
               this.this$0, null, false, false, true, null, false, null, null, false, false, false, 0, null, null, null, null, null, null, 262135, null
            );
         }
      };
      this.addOnAttachStateChangeListener(var9);
      val var10: ImageView = var4.inlineMediaPlayButton;
      kotlin.jvm.internal.q.e(var4.inlineMediaPlayButton);
      ViewBackgroundUtilsKt.setBackgroundOval$default(var10, -16777216, 0, 2, null);
      ColorUtilsKt.setTintColor(var10, -1);
      I18nUtilsKt.i18nContentDescription$default(var10, I18nMessage.PLAY_FULL_VIDEO, null, 2, null);
      val var11: SimpleDraweeView = var4.inlineMediaGifIndicator;
      kotlin.jvm.internal.q.g(var4.inlineMediaGifIndicator, "inlineMediaGifIndicator");
      ReactAssetUtilsKt.setReactAsset(var11, ReactAsset.Gif);
      val var5: SimpleDraweeView = var4.inlineMediaImagePreview;
      (var4.inlineMediaImagePreview.getHierarchy() as GenericDraweeHierarchy).A(new ColorDrawable(ThemeManagerKt.getTheme().getBackgroundSecondaryAlt()));
      val var12: GenericDraweeHierarchy = var5.getHierarchy() as GenericDraweeHierarchy;
      val var13: GradientDrawable = new GradientDrawable();
      var13.setShape(0);
      var13.setStroke(
         var5.getResources().getDimensionPixelSize(com.discord.chat.R.dimen.message_media_view_stroke),
         ColorUtilsKt.getColorCompat(var1, com.discord.chat.R.color.chat_media_view_stroke)
      );
      var12.z(var13);
   }

   @JvmStatic
   fun `attachStateChangeListener$lambda$2`(var0: MediaView, var1: Boolean): Unit {
      if (var1) {
         setMediaData$default(
            var0, null, false, false, false, null, false, null, null, false, false, false, 0, null, null, null, null, null, null, 262141, null
         );
      } else {
         setMediaData$default(var0, null, true, false, false, null, false, null, null, false, false, false, 0, null, null, null, null, null, null, 262137, null);
      }

      return Unit.a;
   }

   @JvmStatic
   fun `attachStateChangeListener$lambda$3`(var0: MediaView, var1: Boolean): Unit {
      setMediaData$default(var0, null, false, var1, false, null, false, null, null, false, false, false, 0, null, null, null, null, null, null, 262139, null);
      return Unit.a;
   }

   @JvmStatic
   fun `mediaOnPlayCallback$lambda$0`(): Unit {
      return Unit.a;
   }

   @JvmStatic
   fun `onMediaPlayFinishedAnalytics$lambda$1`(var0: MediaPlayFinishedAnalytics): Unit {
      kotlin.jvm.internal.q.h(var0, "it");
      return Unit.a;
   }

   private fun pause() {
      if (this.mediaPlayer != null) {
         this.mediaPlayer.pause();
      }

      this.togglePortalControl(false);
   }

   private fun play() {
      if (this.mediaPlayer != null) {
         this.mediaPlayer.play();
      }

      this.togglePortalControl(true);
   }

   private fun prepareMediaPlayer(mediaSource: MediaSource, loopMedia: Boolean): Pair<MediaPlayer, MediaPlayerView>? {
      if (var1.getSourceUrl() == null) {
         return null;
      } else {
         var var4: MediaPlayerView = this.mediaPlayerView;
         if (this.mediaPlayerView == null) {
            val var8: Context = this.getContext();
            kotlin.jvm.internal.q.g(var8, "getContext(...)");
            var4 = new MediaPlayerView(var8);
            this.addView(var4.getView(), 0, new LayoutParams(-1, -1));
         }

         var4.setVisible(true);
         var var10: MediaPlayer = this.mediaPlayer;
         if (this.mediaPlayer == null) {
            val var11: MediaPlayerManager = MediaPlayerManager.INSTANCE;
            val var7: Context = this.getContext();
            kotlin.jvm.internal.q.g(var7, "getContext(...)");
            val var12: java.lang.Double = var1.getPortal();
            kotlin.jvm.internal.q.e(var12);
            var10 = var11.acquire(var7, var12, this.playerSettings);
         }

         var10.setEventListener(new p0(this));
         var10.setVolumeListener(new u0(this));
         var10.setAnalyticsListener(new v0(this));
         val var3: Float;
         if (var1.isGifv()) {
            var3 = 0.0F;
         } else {
            var3 = 1.0F;
         }

         var10.setVolume(var3);
         MediaPlayer.preparePlayer$default(var10, var1, true, var2, 0L, var4, null, 40, null);
         this.mediaPlayer = var10;
         this.mediaPlayerView = var4;
         ViewMeasureExtensionsKt.measureAndLayout(this);
         return new Pair(var10, var4);
      }
   }

   @JvmStatic
   fun `prepareMediaPlayer$lambda$19$lambda$16`(var0: MediaView, var1: MediaPlayer.Event): Unit {
      kotlin.jvm.internal.q.h(var1, "event");
      setMediaData$default(var0, null, false, false, false, var1, false, null, null, false, false, false, 0, null, null, null, null, null, null, 262127, null);
      return Unit.a;
   }

   @JvmStatic
   fun `prepareMediaPlayer$lambda$19$lambda$17`(var0: MediaView, var1: Float): Unit {
      val var2: Boolean;
      if (var1 > 0.0F) {
         var2 = true;
      } else {
         var2 = false;
      }

      setMediaData$default(var0, null, false, false, false, null, var2, null, null, false, false, false, 0, null, null, null, null, null, null, 262111, null);
      return Unit.a;
   }

   @JvmStatic
   fun `prepareMediaPlayer$lambda$19$lambda$18`(var0: MediaView, var1: MediaPlayFinishedAnalytics): Unit {
      kotlin.jvm.internal.q.h(var1, "event");
      var0.onMediaPlayFinishedAnalytics.invoke(var1);
      return Unit.a;
   }

   private fun registerForPortal() {
      val var5: MediaSource = this.mediaSource;
      if (this.mediaSource != null) {
         val var3: java.lang.Double = this.mediaSource.getPortal();
         if (var3 != null) {
            val var1: Double = var3;
            val var6: MediaPlayer = this.mediaPlayer;
            val var7: Pair;
            if (this.mediaPlayer != null && this.mediaPlayerView != null) {
               kotlin.jvm.internal.q.e(this.mediaPlayer);
               val var9: MediaPlayerView = this.mediaPlayerView;
               kotlin.jvm.internal.q.e(this.mediaPlayerView);
               var7 = new Pair(var6, var9);
            } else {
               if (!var5.isValid()) {
                  return;
               }

               val var4: Pair = this.prepareMediaPlayer(var5, var5.isGifv());
               var7 = var4;
               if (var4 == null) {
                  return;
               }
            }

            val var10: MediaPlayer = var7.a() as MediaPlayer;
            PortalFromNativeContextManager.INSTANCE
               .addPortal(var1, (var7.b() as MediaPlayerView).getView(), new B0(this), new C0(this, var5, var10), new q0(this, var10, var5), new r0(var5, this));
         }
      }
   }

   @JvmStatic
   fun `registerForPortal$lambda$20`(var0: MediaView, var1: View): Unit {
      kotlin.jvm.internal.q.h(var1, "view");
      var0.removeOnAttachStateChangeListener(var0.attachStateChangeListener);
      ViewRemoveFromParentKt.removeFromParent(var1);
      return Unit.a;
   }

   @JvmStatic
   fun `registerForPortal$lambda$21`(var0: MediaView, var1: MediaSource, var2: MediaPlayer, var3: View): Unit {
      kotlin.jvm.internal.q.h(var3, "it");
      if (var0.managerModule != null) {
         var0.managerModule.startPlayerProgressInterval(var1, var2);
      }

      var0.play();
      return Unit.a;
   }

   @JvmStatic
   fun `registerForPortal$lambda$22`(var0: MediaView, var1: MediaPlayer, var2: MediaSource, var3: View): Unit {
      kotlin.jvm.internal.q.h(var3, "it");
      var0.mediaVolumeOn = var1.isMuted() xor true;
      if (var0.managerModule != null) {
         var0.managerModule.stopPlayerProgressInterval(var2);
      }

      val var7: java.lang.Double = var2.getPortal();
      val var5: java.lang.Double;
      if (var0.mediaSource != null) {
         var5 = var0.mediaSource.getPortal();
      } else {
         var5 = null;
      }

      if (!kotlin.jvm.internal.q.a(var7, var5) || var1.hasEnded() || !var0.isAttachedToWindow()) {
         var0.releasePlayer();
      }

      return Unit.a;
   }

   @JvmStatic
   fun `registerForPortal$lambda$23`(var0: MediaSource, var1: MediaView, var2: View): Unit {
      kotlin.jvm.internal.q.h(var2, "view");
      val var3: java.lang.Double = var0.getPortal();
      val var5: java.lang.Double;
      if (var1.mediaSource != null) {
         var5 = var1.mediaSource.getPortal();
      } else {
         var5 = null;
      }

      if (kotlin.jvm.internal.q.a(var3, var5)) {
         setMediaData$default(
            var1, null, false, false, false, null, false, null, null, false, false, false, 0, null, null, null, null, null, null, 262143, null
         );
         var1.addView(var2, 0);
         ViewMeasureExtensionsKt.measureAndLayout(var1);
      }

      var1.addOnAttachStateChangeListener(var1.attachStateChangeListener);
      return Unit.a;
   }

   private fun releasePlayer() {
      val var1: MediaPlayerManagerModule = this.managerModule;
      if (this.managerModule != null) {
         if (this.mediaSource == null) {
            return;
         }

         val var8: java.lang.Double = this.mediaSource.getPortal();
         if (var8 == null) {
            return;
         }

         var1.toggle(var8, false);
      }

      val var4: java.lang.Double;
      if (this.mediaSource != null) {
         var4 = this.mediaSource.getPortal();
      } else {
         var4 = null;
      }

      MediaPlayerManager.INSTANCE.release(var4);
      if (this.mediaPlayer != null) {
         this.mediaPlayer.reset();
         this.mediaPlayer = null;
      }

      if (this.mediaPlayerView != null) {
         this.mediaPlayerView.reset();
      }
   }

   @JvmStatic
   fun `setMediaData$lambda$7`(var0: MediaView, var1: MediaSource, var2: View) {
      if (var0.mediaPlayer != null && var0.mediaPlayerView != null) {
         var0.play();
      } else {
         var0.prepareMediaPlayer(var1, false);
         var0.mediaOnPlayCallback.invoke();
      }
   }

   @JvmStatic
   fun `setMediaData$lambda$9`(var0: MediaView, var1: Boolean, var2: MediaSource, var3: View) {
      if (var0.mediaPlayer != null) {
         val var6: Float;
         if (var1) {
            var6 = 0.0F;
         } else {
            var6 = 1.0F;
         }

         var0.mediaPlayer.setVolume(var6);
      }

      if (var2 != null) {
         val var8: java.lang.Double = var2.getPortal();
         if (var8 != null) {
            val var4: Double = var8.doubleValue();
            if (var0.managerModule != null) {
               var0.managerModule.onMuteToggle(var4, var1);
            }
         }
      }
   }

   @JvmStatic
   fun `setOnMediaClickListeners$lambda$10`(var0: MediaView, var1: OnClickListener, var2: View) {
      var0.registerForPortal();
      var1.onClick(var0);
   }

   private fun setupTag(isTagVisible: Boolean, content: String?, icon: ReactAsset?, backgroundColor: Int?, textColor: Int?) {
      val var7: ConstraintLayout = this.binding.overlayTag;
      kotlin.jvm.internal.q.e(this.binding.overlayTag);
      var var6: Byte;
      if (var1) {
         var6 = 0;
      } else {
         var6 = 8;
      }

      var7.setVisibility(var6);
      if (var4 != null) {
         var7.setBackgroundTintList(ColorStateList.valueOf(var4));
      }

      val var9: ConstraintLayout = this.binding.overlayTag;
      kotlin.jvm.internal.q.g(this.binding.overlayTag, "overlayTag");
      if (var9.getVisibility() == 0) {
         if (var5 != null) {
            var6 = var5;
         } else {
            var6 = com.discord.theme.R.color.white_500;
         }

         val var10: SimpleDraweeView = this.binding.overlayTagIcon;
         if (var3 != null) {
            kotlin.jvm.internal.q.e(this.binding.overlayTagIcon);
            var10.setVisibility(0);
            ReactAssetUtilsKt.setReactAsset(var10, var3);
            ColorUtilsKt.setTintColor(var10, var6);
         } else {
            kotlin.jvm.internal.q.e(this.binding.overlayTagIcon);
            var10.setVisibility(8);
         }

         val var8: TextView = this.binding.overlayTagText;
         this.binding.overlayTagText.setTextColor(var6);
         var8.setText(var2);
      }
   }

   private fun togglePortalControl(play: Boolean) {
      if (this.mediaSource != null) {
         val var5: java.lang.Double = this.mediaSource.getPortal();
         if (var5 != null) {
            val var2: Double = var5.doubleValue();
            if (this.managerModule != null) {
               this.managerModule.toggle(var2, var1);
            }
         }
      }
   }

   protected open fun onAttachedToWindow() {
      super.onAttachedToWindow();
      val var1: ReactContext = this.getReactContext();
      if (var1 != null) {
         var1.addLifecycleEventListener(this.lifecycleListener);
      }

      Aa.f.d(
         CoroutineViewUtilsKt.attachedScope(this, true),
         null,
         null,
         new Function2(this, null) {
            int label;
            final MediaView this$0;

            {
               super(2, var2x);
               this.this$0 = var1;
            }

            public final Continuation create(Object var1, Continuation var2) {
               return new <anonymous constructor>(this.this$0, var2);
            }

            public final Object invoke(CoroutineScope var1, Continuation var2x) {
               return (this.create(var1, var2x) as <unrepresentable>).invokeSuspend(Unit.a);
            }

            public final Object invokeSuspend(Object var1) {
               val var3: Any = Y8.b.e();
               if (this.label != 0) {
                  if (this.label != 1) {
                     throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                  }

                  kotlin.c.b(var1);
               } else {
                  kotlin.c.b(var1);
                  var1 = PortalFromNativeContextManager.INSTANCE.getPortalContextIdsFlow();
                  val var4: FlowCollector = new FlowCollector(this.this$0) {
                     final MediaView this$0;

                     {
                        this.this$0 = var1;
                     }

                     public final Object emit(PortalFromNativeContextManager.Event var1, Continuation var2x) {
                        MediaView.setMediaData$default(
                           this.this$0,
                           null,
                           false,
                           false,
                           false,
                           null,
                           false,
                           null,
                           var1,
                           false,
                           false,
                           false,
                           0,
                           null,
                           null,
                           null,
                           null,
                           null,
                           null,
                           262015,
                           null
                        );
                        return Unit.a;
                     }
                  };
                  this.label = 1;
                  if (var1.collect(var4, this) === var3) {
                     return var3;
                  }
               }

               return Unit.a;
            }
         },
         3,
         null
      );
      Aa.f.d(CoroutineViewUtilsKt.attachedScope(this, true), null, null, new Function2(this, null) {
         int label;
         final MediaView this$0;

         {
            super(2, var2x);
            this.this$0 = var1;
         }

         public final Continuation create(Object var1, Continuation var2) {
            return new <anonymous constructor>(this.this$0, var2);
         }

         public final Object invoke(CoroutineScope var1, Continuation var2x) {
            return (this.create(var1, var2x) as <unrepresentable>).invokeSuspend(Unit.a);
         }

         public final Object invokeSuspend(Object var1) {
            val var3: Any = Y8.b.e();
            if (this.label != 0) {
               if (this.label != 1) {
                  throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
               }

               kotlin.c.b(var1);
            } else {
               kotlin.c.b(var1);
               var1 = MediaView.access$getManagerModule$p(this.this$0);
               if (var1 != null) {
                  val var6: Flow = var1.getPausePlayerFlow();
                  if (var6 != null) {
                     val var4: FlowCollector = new FlowCollector(this.this$0) {
                        final MediaView this$0;

                        {
                           this.this$0 = var1;
                        }

                        public final Object emit(java.lang.String var1, Continuation var2x) {
                           if (!kotlin.jvm.internal.q.c(MediaView.access$getPauseId$p(this.this$0), var1)) {
                              MediaView.access$setPauseId$p(this.this$0, var1);
                              MediaView.access$pause(this.this$0);
                           }

                           return Unit.a;
                        }
                     };
                     this.label = 1;
                     if (var6.collect(var4, this) === var3) {
                        return var3;
                     }
                  }
               }
            }

            return Unit.a;
         }
      }, 3, null);
   }

   protected open fun onConfigurationChanged(newConfig: Configuration?) {
      super.onConfigurationChanged(var1);
      val var2: Int;
      if (var1 != null) {
         var2 = var1.orientation;
      } else {
         var2 = null;
      }

      setMediaData$default(this, null, false, false, false, null, false, var2, null, false, false, false, 0, null, null, null, null, null, null, 262079, null);
   }

   protected open fun onDetachedFromWindow() {
      super.onDetachedFromWindow();
      val var1: ReactContext = this.getReactContext();
      if (var1 != null) {
         var1.removeLifecycleEventListener(this.lifecycleListener);
      }
   }

   public fun setAnalyticsListener(onMediaPlayFinishedAnalytics: (MediaPlayFinishedAnalytics) -> Unit) {
      kotlin.jvm.internal.q.h(var1, "onMediaPlayFinishedAnalytics");
      this.onMediaPlayFinishedAnalytics = var1;
   }

   public fun setMediaData(
      mediaSource: MediaSource? = var0.mediaSource,
      mediaViewDetached: Boolean = var0.mediaViewDetached,
      mediaViewScrolling: Boolean = var0.mediaViewScrolling,
      mediaViewFocused: Boolean = var0.mediaViewFocused,
      mediaPlaybackState: Event? = var0.mediaPlaybackState,
      mediaVolumeOn: Boolean = var0.mediaVolumeOn,
      mediaOrientation: Int? = var0.mediaOrientation,
      mediaPortalEvent: com.discord.portals.from_native.PortalFromNativeContextManager.Event? = var0.mediaPortalEvent,
      mediaCanPlayInline: Boolean = var0.mediaCanPlayInline,
      mediaPlayThirdParty: Boolean = var0.mediaPlayThirdParty,
      mediaHidePlayButton: Boolean = var0.mediaHidePlayButton,
      mediaThumbnailFadeDuration: Int = var0.mediaThumbnailFadeDuration,
      mediaOnPlayCallback: () -> Unit = var0.mediaOnPlayCallback,
      overlayTagText: String? = var0.overlayTagText,
      overlayTagIcon: ReactAsset? = var0.overlayTagIcon,
      overlayTagBackgroundColor: Int? = var0.overlayTagBackgroundColor,
      overlayTagTextColor: Int? = var0.overlayTagTextColor,
      playerSettings: PlayerSettings = var0.playerSettings
   ) {
      kotlin.jvm.internal.q.h(var13, "mediaOnPlayCallback");
      kotlin.jvm.internal.q.h(var18, "playerSettings");
      if (!kotlin.jvm.internal.q.c(this.mediaSource, var1)
         || this.mediaViewDetached != var2
         || this.mediaViewScrolling != var3
         || this.mediaViewFocused != var4
         || !kotlin.jvm.internal.q.c(this.mediaPlaybackState, var5)
         || this.mediaVolumeOn != var6
         || !kotlin.jvm.internal.q.c(this.mediaOrientation, var7)
         || !kotlin.jvm.internal.q.c(this.mediaPortalEvent, var8)
         || this.mediaCanPlayInline != var9
         || this.mediaPlayThirdParty != var10
         || this.mediaHidePlayButton != var11
         || this.mediaThumbnailFadeDuration != var12
         || !kotlin.jvm.internal.q.c(this.mediaOnPlayCallback, var13)
         || !kotlin.jvm.internal.q.c(this.overlayTagText, var14)
         || this.overlayTagIcon != var15
         || !kotlin.jvm.internal.q.c(this.overlayTagBackgroundColor, var16)
         || !kotlin.jvm.internal.q.c(this.overlayTagTextColor, var17)
         || !kotlin.jvm.internal.q.c(this.playerSettings, var18)) {
         val var21: Boolean = kotlin.jvm.internal.q.c(this.mediaSource, var1);
         val var22: Boolean = kotlin.jvm.internal.q.c(this.mediaOrientation, var7);
         this.mediaSource = var1;
         this.mediaViewDetached = var2;
         this.mediaViewScrolling = var3;
         this.mediaViewFocused = var4;
         this.mediaPlaybackState = var5;
         this.mediaOrientation = var7;
         this.mediaVolumeOn = var6;
         this.mediaPortalEvent = var8;
         this.mediaCanPlayInline = var9;
         this.mediaPlayThirdParty = var10;
         this.mediaHidePlayButton = var11;
         this.mediaThumbnailFadeDuration = var12;
         this.mediaOnPlayCallback = var13;
         this.overlayTagText = var14;
         this.overlayTagIcon = var15;
         this.overlayTagBackgroundColor = var16;
         this.overlayTagTextColor = var17;
         this.playerSettings = var18;
         val var31: java.lang.Double;
         if (var1 != null) {
            var31 = var1.getPortal();
         } else {
            var31 = null;
         }

         val var24: java.lang.Boolean = PortalFromNativeContextManager.INSTANCE.isMediaViewBeingPortaled(var31);
         if (!var22 && !kotlin.jvm.internal.q.c(var24, java.lang.Boolean.TRUE)) {
            this.releasePlayer();
         }

         var var19: Boolean;
         if (!kotlin.jvm.internal.q.c(var5, MediaPlayer.Event.BufferStart.INSTANCE) || var1 != null && var1.isGifv()) {
            var19 = false;
         } else {
            var19 = true;
         }

         val var32: ProgressBar = this.binding.inlineMediaLoadingIndicator;
         kotlin.jvm.internal.q.g(this.binding.inlineMediaLoadingIndicator, "inlineMediaLoadingIndicator");
         val var20: Byte;
         if (var19) {
            var20 = 0;
         } else {
            var20 = 8;
         }

         var32.setVisibility(var20);
         if (!var21) {
            (this.binding.inlineMediaImagePreview.getHierarchy() as GenericDraweeHierarchy).x(var12);
            val var25: SimpleDraweeView = this.binding.inlineMediaImagePreview;
            kotlin.jvm.internal.q.g(this.binding.inlineMediaImagePreview, "inlineMediaImagePreview");
            val var33: java.lang.Boolean;
            if (var1 != null) {
               var33 = var1.getShouldAutoPlay();
            } else {
               var33 = null;
            }

            val var48: java.lang.Boolean;
            if (var1 != null) {
               var48 = var1.getSrcIsAnimated();
            } else {
               var48 = null;
            }

            val var61: java.lang.String;
            if (var1 != null) {
               var61 = var1.getPreviewUrl();
            } else {
               var61 = null;
            }

            val var26: SimpleDraweeView = this.binding.inlineMediaImagePreview;
            kotlin.jvm.internal.q.g(this.binding.inlineMediaImagePreview, "inlineMediaImagePreview");
            val var65: java.lang.String;
            if (var1 != null) {
               var65 = var1.getPlaceholder();
            } else {
               var65 = null;
            }

            val var23: Int;
            if (var1 != null) {
               var23 = var1.getPlaceholderVersion();
            } else {
               var23 = null;
            }

            SetOptionalImageUrlKt.setOptionalImageUrl(
               var25, var61, var33, var48, GetMediaImagePlaceholderStatesListenerKt.getMediaImagePlaceholderStatesListener(var26, var65, var23)
            );
         }

         val var34: SimpleDraweeView = this.binding.inlineMediaImagePreview;
         kotlin.jvm.internal.q.g(this.binding.inlineMediaImagePreview, "inlineMediaImagePreview");
         val var49: MediaPlayer.Event.StartedPlaying = MediaPlayer.Event.StartedPlaying.INSTANCE;
         var var50: Boolean;
         if (!kotlin.jvm.internal.q.c(var5, MediaPlayer.Event.StartedPlaying.INSTANCE) && !kotlin.jvm.internal.q.c(var5, MediaPlayer.Event.Paused.INSTANCE)) {
            var50 = 1;
         } else {
            var50 = 0;
         }

         if (var50) {
            var50 = 0;
         } else {
            var50 = 8;
         }

         var34.setVisibility(var50);
         val var35: SimpleDraweeView = this.binding.inlineMediaGifIndicator;
         kotlin.jvm.internal.q.g(this.binding.inlineMediaGifIndicator, "inlineMediaGifIndicator");
         var var52: Boolean;
         if (var1 != null && this.getShouldShowGifIndicator(var1)) {
            var52 = 1;
         } else {
            var52 = 0;
         }

         if (var52) {
            var52 = 0;
         } else {
            var52 = 8;
         }

         var35.setVisibility(var52);
         var var54: Boolean;
         if (var1 != null && var1.isValid() && !var19 && !kotlin.jvm.internal.q.c(var5, var49)) {
            var54 = 1;
         } else {
            var54 = 0;
         }

         if (var1 != null && var1.isVideo() && (var54 || var10) && !var11) {
            var54 = (boolean)1;
         } else {
            var54 = (boolean)0;
         }

         val var36: ImageView = this.binding.inlineMediaPlayButton;
         kotlin.jvm.internal.q.g(this.binding.inlineMediaPlayButton, "inlineMediaPlayButton");
         if (var54) {
            var54 = 0;
         } else {
            var54 = 8;
         }

         var36.setVisibility(var54);
         val var62: ImageView = this.binding.inlineMediaPlayButton;
         kotlin.jvm.internal.q.g(this.binding.inlineMediaPlayButton, "inlineMediaPlayButton");
         val var37: s0;
         if (this.mediaCanPlayInline && !var10 && var1 != null) {
            var37 = new s0(this, var1);
         } else {
            var37 = null;
         }

         NestedScrollOnTouchUtilsKt.setOnClickListenerNested$default(var62, false, var37, 1, null);
         val var38: SimpleDraweeView = this.binding.inlineMediaVolumeToggle;
         kotlin.jvm.internal.q.g(this.binding.inlineMediaVolumeToggle, "inlineMediaVolumeToggle");
         var var57: Boolean;
         if (var1 != null && var1.isVideo() && var1.isValid() && var5 != null && var9) {
            var57 = 1;
         } else {
            var57 = 0;
         }

         if (var57) {
            var57 = 0;
         } else {
            var57 = 8;
         }

         var38.setVisibility(var57);
         val var63: SimpleDraweeView = this.binding.inlineMediaVolumeToggle;
         kotlin.jvm.internal.q.g(this.binding.inlineMediaVolumeToggle, "inlineMediaVolumeToggle");
         val var39: ReactAsset;
         if (var6) {
            var39 = ReactAsset.Volume;
         } else {
            var39 = ReactAsset.VolumeMute;
         }

         ReactAssetUtilsKt.setReactAsset(var63, var39);
         val var40: SimpleDraweeView = this.binding.inlineMediaVolumeToggle;
         kotlin.jvm.internal.q.g(this.binding.inlineMediaVolumeToggle, "inlineMediaVolumeToggle");
         ColorUtilsKt.setTintColor(var40, -1);
         val var64: SimpleDraweeView = this.binding.inlineMediaVolumeToggle;
         kotlin.jvm.internal.q.g(this.binding.inlineMediaVolumeToggle, "inlineMediaVolumeToggle");
         val var41: I18nMessage;
         if (var6) {
            var41 = I18nMessage.SOUND_MUTE;
         } else {
            var41 = I18nMessage.SOUND_UNMUTE;
         }

         I18nUtilsKt.i18nContentDescription$default(var64, var41, null, 2, null);
         val var42: SimpleDraweeView = this.binding.inlineMediaVolumeToggle;
         kotlin.jvm.internal.q.g(this.binding.inlineMediaVolumeToggle, "inlineMediaVolumeToggle");
         NestedScrollOnTouchUtilsKt.setOnClickListenerNested$default(var42, false, new t0(this, var6, var1), 1, null);
         val var43: ImageView = this.binding.inlineMediaPlayButton;
         kotlin.jvm.internal.q.g(this.binding.inlineMediaPlayButton, "inlineMediaPlayButton");
         if (var43.getVisibility() == 0 && var14 != null && var14.length() != 0) {
            var6 = true;
         } else {
            var6 = false;
         }

         this.setupTag(var6, var14, var15, var16, var17);
         var6 = kotlin.jvm.internal.q.c(var5, MediaPlayer.Event.PlaybackEnded.INSTANCE);
         var var59: Boolean;
         if (var6 && kotlin.jvm.internal.q.c(var24, java.lang.Boolean.TRUE)) {
            var59 = true;
         } else {
            var59 = false;
         }

         if (!var6 && (!var2 && var9 || kotlin.jvm.internal.q.c(var24, java.lang.Boolean.TRUE)) && var21) {
            var19 = false;
         } else {
            var19 = true;
         }

         if (var59) {
            this.togglePortalControl(false);
         } else if (var19) {
            this.releasePlayer();
            setMediaData$default(
               this, null, false, false, false, null, false, null, null, false, false, false, 0, null, null, null, null, null, null, 262127, null
            );
            return;
         }

         if (this.mediaPlayerView != null) {
            if (var1 != null && !kotlin.jvm.internal.q.c(var24, java.lang.Boolean.FALSE)) {
               var6 = true;
            } else {
               var6 = false;
            }

            this.mediaPlayerView.setVisible(var6);
         }

         if (var1 != null && var1.getShouldAutoPlay() && !var2 && !var3) {
            if (var5 == null) {
               kotlin.jvm.internal.q.e(var1);
               this.prepareMediaPlayer(var1, true);
            } else {
               if (kotlin.jvm.internal.q.c(var5, var49)) {
                  return;
               }

               this.play();
            }
         } else {
            if (!var2 && var4 && !kotlin.jvm.internal.q.c(var24, java.lang.Boolean.FALSE)) {
               var59 = false;
            } else {
               var59 = true;
            }

            if (this.mediaPlayerView != null) {
               val var46: View = this.mediaPlayerView.getView();
               if (var46 != null) {
                  if (!kotlin.jvm.internal.q.c(var5, var49)
                     || var59
                     || (var1 == null || !var1.isVideo()) && !kotlin.jvm.internal.q.c(var24, java.lang.Boolean.TRUE)) {
                     var2 = false;
                  } else {
                     var2 = true;
                  }

                  var46.setKeepScreenOn(var2);
               }
            }

            if (!var59 && this.mediaShouldResume) {
               this.play();
               this.mediaShouldResume = false;
            } else if (var59) {
               this.pause();
               if (kotlin.jvm.internal.q.c(var5, var49) && !kotlin.jvm.internal.q.c(var24, java.lang.Boolean.FALSE)) {
                  this.mediaShouldResume = true;
               }
            } else if (kotlin.jvm.internal.q.c(var5, var49)) {
               this.play();
            } else if (kotlin.jvm.internal.q.c(var5, MediaPlayer.Event.Paused.INSTANCE)) {
               this.pause();
            }
         }
      }
   }

   public fun setOnMediaClickListeners(onClickListener: OnClickListener?, onLongClickListener: OnLongClickListener?) {
      val var3: w0;
      if (var1 != null) {
         var3 = new w0(this, var1);
      } else {
         var3 = null;
      }

      NestedScrollOnTouchUtilsKt.setOnClickListenerNested$default(this, false, var3, 1, null);
      NestedScrollOnTouchUtilsKt.setOnLongClickListenerNested$default(this, false, var2, 1, null);
   }
}
