package com.discord.chat.presentation.message.system

import O9.K
import O9.f
import R9.e
import android.content.Context
import android.os.Bundle
import android.util.AttributeSet
import android.view.LayoutInflater
import android.view.View
import android.view.View.OnClickListener
import android.widget.TextView
import androidx.core.view.a0
import androidx.core.view.accessibility.AccessibilityNodeInfoCompat
import androidx.lifecycle.Lifecycle
import com.discord.SetTextSizeSpKt
import com.discord.chat.bridge.Message
import com.discord.chat.databinding.CallSystemMessageViewBinding
import com.discord.chat.presentation.events.ChatEventHandler
import com.discord.chat.presentation.list.ChatListConstraintLayout
import com.discord.chat.presentation.message.AddSystemMessageCardStyleKt
import com.discord.fonts.DiscordFont
import com.discord.fonts.DiscordFontUtilsKt
import com.discord.misc.utilities.coroutines.AttachedViewCoroutineScope
import com.discord.misc.utilities.coroutines.CoroutineViewUtilsKt
import com.discord.misc.utilities.time.IntervalFlowKt
import com.discord.overlapping_circles.OverlappingCirclesView
import com.discord.overlapping_circles.OverlappingItem
import com.discord.react_asset_fetcher.ReactAsset
import com.discord.react_asset_fetcher.ReactAssetUtilsKt
import com.discord.react_gesture_handler.nested_touch.NestedScrollOnTouchUtilsKt
import com.discord.react_strings.I18nMessage
import com.discord.react_strings.I18nUtilsKt
import com.discord.theme.R
import com.discord.theme.ThemeManagerKt
import com.discord.theme.utils.ColorUtilsKt
import com.facebook.drawee.view.SimpleDraweeView
import f8.s
import java.util.ArrayList
import java.util.Arrays
import kotlin.coroutines.Continuation
import kotlin.jvm.functions.Function2
import kotlin.jvm.internal.q
import kotlin.time.Duration
import kotlinx.coroutines.CoroutineScope
import kotlinx.coroutines.flow.Flow
import kotlinx.coroutines.flow.FlowCollector

public class CallSystemMessageView  public constructor(context: Context, attrs: AttributeSet? = null) : ChatListConstraintLayout {
   private final val binding: CallSystemMessageViewBinding
   private final val grayIconColor: Int
   private final val greenIconColor: Int
   private final val redIconColor: Int

   fun CallSystemMessageView(var1: Context) {
      q.h(var1, "context");
      this(var1, null, 2, null);
   }

   init {
      q.h(var1, "context");
      super(var1, var2);
      this.greenIconColor = ColorUtilsKt.getColorCompat(this, R.color.green_360);
      this.redIconColor = ColorUtilsKt.getColorCompat(this, R.color.red_400);
      this.grayIconColor = ThemeManagerKt.getTheme().getInteractiveNormal();
      val var3: CallSystemMessageViewBinding = CallSystemMessageViewBinding.inflate(LayoutInflater.from(var1), this);
      q.g(var3, "inflate(...)");
      this.binding = var3;
      AddSystemMessageCardStyleKt.addSystemMessageCardStyle(this);
      val var5: TextView = var3.message;
      q.e(var3.message);
      SetTextSizeSpKt.setTextSizeSp(var5, 16.0F);
      DiscordFontUtilsKt.setDiscordFont(var5, DiscordFont.PrimarySemibold);
      var5.setTextColor(ThemeManagerKt.getTheme().getHeaderPrimary());
      val var4: TextView = var3.info;
      q.e(var3.info);
      SetTextSizeSpKt.setTextSizeSp(var4, 12.0F);
      DiscordFontUtilsKt.setDiscordFont(var4, DiscordFont.PrimaryNormal);
      var4.setTextColor(ThemeManagerKt.getTheme().getTextMuted());
   }

   @JvmStatic
   fun `setMessage$lambda$3`(var0: ChatEventHandler, var1: Message, var2: View) {
      q.h(var0, "$eventHandler");
      q.h(var1, "$message");
      var0.onTapCall-pfaIj0E(var1.getId-3Eiw7ao(), var1.getChannelId-o4g7jtM());
   }

   public fun setMessage(message: Message, eventHandler: ChatEventHandler) {
      q.h(var1, "message");
      q.h(var2, "eventHandler");
      val var8: SimpleDraweeView = this.binding.icon;
      q.g(this.binding.icon, "icon");
      val var6: java.lang.Boolean = var1.getMissed();
      val var7: java.lang.Boolean = java.lang.Boolean.TRUE;
      val var11: ReactAsset;
      if (q.c(var6, java.lang.Boolean.TRUE)) {
         var11 = ReactAsset.CallDisconnect;
      } else {
         var11 = ReactAsset.CallConnect;
      }

      ReactAssetUtilsKt.setReactAsset(var8, var11);
      val var12: SimpleDraweeView = this.binding.icon;
      q.g(this.binding.icon, "icon");
      val var3: Int;
      if (q.c(var1.isCallActive(), var7)) {
         var3 = this.greenIconColor;
      } else if (q.c(var1.getMissed(), var7)) {
         var3 = this.redIconColor;
      } else {
         var3 = this.grayIconColor;
      }

      ColorUtilsKt.setTintColor(var12, var3);
      this.binding.message.setText(var1.getTitle());
      val var13: AttachedViewCoroutineScope = CoroutineViewUtilsKt.getAttachedScope(this);
      val var9: java.lang.String = CallSystemMessageView.class.getSimpleName();
      val var19: StringBuilder = new StringBuilder();
      var19.append("Binding ");
      var19.append(var9);
      AttachedViewCoroutineScope.cancelAllWork$default(var13, var19.toString(), null, 2, null);
      if (q.c(var1.isCallActive(), var7)) {
         val var14: java.lang.Long = var1.getRawMilliseconds();
         q.e(var14);
         f.d(
            CoroutineViewUtilsKt.getAttachedScope(this),
            null,
            null,
            new Function2(this, var14, var1, null) {
               final Message $message;
               final long $start;
               int label;
               final CallSystemMessageView this$0;

               {
                  super(2, var5);
                  this.this$0 = var1;
                  this.$start = var2x;
                  this.$message = var4;
               }

               public final Continuation create(Object var1, Continuation var2) {
                  return new <anonymous constructor>(this.this$0, this.$start, this.$message, var2);
               }

               public final Object invoke(CoroutineScope var1, Continuation var2x) {
                  return (this.create(var1, var2x) as <unrepresentable>).invokeSuspend(Unit.a);
               }

               public final Object invokeSuspend(Object var1) {
                  val var3: Any = l8.b.e();
                  if (this.label != 0) {
                     if (this.label != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                     }

                     s.b(var1);
                  } else {
                     s.b(var1);
                     val var5: CallSystemMessageView = this.this$0;
                     var1 = Lifecycle.State.m;
                     val var4: Function2 = new Function2(this.$start, this.this$0, this.$message, null) {
                        final Message $message;
                        final long $start;
                        int label;
                        final CallSystemMessageView this$0;

                        {
                           super(2, var5x);
                           this.$start = var1;
                           this.this$0 = var3x;
                           this.$message = var4x;
                        }

                        public final Continuation create(Object var1, Continuation var2) {
                           return new <anonymous constructor>(this.$start, this.this$0, this.$message, var2);
                        }

                        public final Object invoke(CoroutineScope var1, Continuation var2x) {
                           return (this.create(var1, var2x) as <unrepresentable>).invokeSuspend(Unit.a);
                        }

                        public final Object invokeSuspend(Object var1) {
                           val var3: Any = l8.b.e();
                           if (this.label != 0) {
                              if (this.label != 1) {
                                 throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                              }

                              s.b(var1);
                           } else {
                              s.b(var1);
                              var1 = Duration.k;
                              val var4: Flow = e.n(
                                 new Flow(IntervalFlowKt.intervalFlow-QTBD994(kotlin.time.b.s(1, N9.b.n), Duration.k.c()), this.$start) {
                                    final long $start$inlined;
                                    final Flow $this_unsafeTransform$inlined;

                                    {
                                       this.$this_unsafeTransform$inlined = var1;
                                       this.$start$inlined = var2x;
                                    }

                                    public Object collect(FlowCollector var1, Continuation var2x) {
                                       val var3x: Any = this.$this_unsafeTransform$inlined
                                          .collect(
                                             new FlowCollector(var1, this.$start$inlined) {
                                                final long $start$inlined;
                                                final FlowCollector $this_unsafeFlow;

                                                {
                                                   this.$this_unsafeFlow = var1;
                                                   this.$start$inlined = var2x;
                                                }

                                                public final Object emit(Object var1, Continuation var2x) {
                                                   label23: {
                                                      if (var2x is <unrepresentable>) {
                                                         val var4x: <unrepresentable> = var2x as <unrepresentable>;
                                                         if (((var2x as <unrepresentable>).label and Integer.MIN_VALUE) != 0) {
                                                            var4x.label = (var2x as <unrepresentable>).label + Integer.MIN_VALUE;
                                                            var9 = var4x;
                                                            break label23;
                                                         }
                                                      }

                                                      var9 = new kotlin.coroutines.jvm.internal.d(this, var2x) {
                                                         Object L$0;
                                                         int label;
                                                         Object result;
                                                         final <unrepresentable> this$0;

                                                         {
                                                            super(var2x);
                                                            this.this$0 = var1;
                                                         }

                                                         public final Object invokeSuspend(Object var1) {
                                                            this.result = var1;
                                                            this.label |= Integer.MIN_VALUE;
                                                            return this.this$0.emit(null, this);
                                                         }
                                                      };
                                                   }

                                                   var var5: Any = ((<unrepresentable>)var9).result;
                                                   val var11: Any = l8.b.e();
                                                   if (((<unrepresentable>)var9).label != 0) {
                                                      if (((<unrepresentable>)var9).label != 1) {
                                                         throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                                                      }

                                                      s.b(var5);
                                                   } else {
                                                      s.b(var5);
                                                      var5 = this.$this_unsafeFlow;
                                                      var1 = var1;
                                                      val var7: kotlin.time.Duration.a = Duration.k;
                                                      val var8: java.lang.Comparable = kotlin.ranges.d.e(
                                                         Duration.l(kotlin.time.b.t(System.currentTimeMillis() - this.$start$inlined, N9.b.m)),
                                                         Duration.l(Duration.k.c())
                                                      );
                                                      ((<unrepresentable>)var9).label = 1;
                                                      if (var5.emit(var8, (Continuation)var9) === var11) {
                                                         return var11;
                                                      }
                                                   }

                                                   return Unit.a;
                                                }
                                             },
                                             var2x
                                          );
                                       return if (var3x === l8.b.e()) var3x else Unit.a;
                                    }
                                 },
                                 K.a()
                              );
                              val var6: FlowCollector = new FlowCollector(this.this$0, this.$message) {
                                 final Message $message;
                                 final CallSystemMessageView this$0;

                                 {
                                    this.this$0 = var1;
                                    this.$message = var2x;
                                 }

                                 public final Object emit_VtjQ1oo/* $VF was: emit-VtjQ1oo*/(long var1, Continuation var3x) {
                                    val var8: CallSystemMessageView = this.this$0;
                                    val var9: Message = this.$message;
                                    val var6x: Long = Duration.w(var1);
                                    val var5: Int = Duration.A(var1);
                                    val var4x: Int = Duration.C(var1);
                                    Duration.B(var1);
                                    val var11: TextView = CallSystemMessageView.access$getBinding$p(var8).info;
                                    val var10: java.lang.String = java.lang.String.format(
                                       "%02d:%02d:%02d%s",
                                       Arrays.copyOf(
                                          new Object[]{
                                             kotlin.coroutines.jvm.internal.b.e(var6x),
                                             kotlin.coroutines.jvm.internal.b.d(var5),
                                             kotlin.coroutines.jvm.internal.b.d(var4x),
                                             var9.getDescription()
                                          },
                                          4
                                       )
                                    );
                                    q.g(var10, "format(...)");
                                    var11.setText(var10);
                                    return Unit.a;
                                 }
                              };
                              this.label = 1;
                              if (var4.collect(var6, this) === var3) {
                                 return var3;
                              }
                           }

                           return Unit.a;
                        }
                     };
                     this.label = 1;
                     if (CoroutineViewUtilsKt.repeatOnLifecycleOwner(var5, var1, var4, this) === var3) {
                        return var3;
                     }
                  }

                  return Unit.a;
               }
            },
            3,
            null
         );
      } else {
         this.binding.info.setText(var1.getDescription());
      }

      val var20: OverlappingCirclesView = this.binding.participants;
      val var17: java.util.List = var1.getAvatarURLs();
      var var15: java.util.List = var17;
      if (var17 == null) {
         var15 = i.k();
      }

      val var18: ArrayList = new ArrayList(i.v(var15, 10));
      val var16: java.util.Iterator = var15.iterator();

      while (var16.hasNext()) {
         var18.add(new OverlappingItem(var16.next() as java.lang.String));
      }

      var20.setItems(var18);
      val var10: b = new b(var2, var1);
      NestedScrollOnTouchUtilsKt.setOnClickListenerNested(this, true, var10);
      a0.p0(this, new androidx.core.view.a(this, var10) {
         final OnClickListener $onClickListener;
         final CallSystemMessageView this$0;

         {
            this.this$0 = var1;
            this.$onClickListener = var2;
         }

         @Override
         public void onInitializeAccessibilityNodeInfo(View var1, AccessibilityNodeInfoCompat var2) {
            q.h(var1, "host");
            q.h(var2, "info");
            super.onInitializeAccessibilityNodeInfo(var1, var2);
            val var3: Context = this.this$0.getContext();
            q.g(var3, "getContext(...)");
            var2.L0(I18nUtilsKt.i18nFormat$default(var3, I18nMessage.A11Y_ROLE_BUTTON, null, 2, null));
         }

         @Override
         public boolean performAccessibilityAction(View var1, int var2, Bundle var3) {
            q.h(var1, "host");
            if (var2 == 16) {
               this.$onClickListener.onClick(var1);
            }

            return super.performAccessibilityAction(var1, var2, var3);
         }
      });
   }
}
