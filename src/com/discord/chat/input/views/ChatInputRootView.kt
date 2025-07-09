package com.discord.chat.input.views

import ab.I
import ab.K
import android.content.Context
import android.content.Intent
import android.content.ClipData.Item
import android.net.Uri
import android.text.Editable
import android.text.Layout
import android.text.TextWatcher
import android.util.AttributeSet
import android.util.Pair
import android.view.KeyEvent
import android.view.LayoutInflater
import android.view.View
import android.view.Window
import android.widget.RelativeLayout
import androidx.core.view.ContentInfoCompat
import androidx.core.view.Y
import com.discord.SetTextSizeSpKt
import com.discord.chat.input.bridge.ChatInputNode
import com.discord.chat.input.databinding.ChatInputRootViewBinding
import com.discord.chat.input.plugins.DeleteNodeOnBackspaceTextWatcher
import com.discord.chat.input.plugins.SelectionGuardSpanWatcher
import com.discord.chat.input.spans.DCDInputSpan
import com.discord.chat.input.utils.EditTextUtilsKt
import com.discord.fonts.DiscordFont
import com.discord.fonts.DiscordFontUtilsKt
import com.discord.keyboard.KeyboardEvent
import com.discord.misc.utilities.coroutines.CoroutineViewUtilsKt
import com.discord.misc.utilities.keyboard.KeyboardExtensionsKt
import com.discord.misc.utilities.size.SizeUtilsKt
import com.discord.span.utilities.BackgroundSpanDrawer
import com.discord.span.utilities.SpannableExtensionsKt
import db.x
import java.util.ArrayList
import java.util.LinkedHashSet
import java.util.UUID
import kotlin.coroutines.Continuation
import kotlin.jvm.functions.Function2
import kotlin.jvm.internal.r
import kotlinx.coroutines.CoroutineScope
import kotlinx.coroutines.Job
import kotlinx.coroutines.flow.MutableStateFlow

public class ChatInputRootView  public constructor(context: Context, attrs: AttributeSet? = null, defStyleAttr: Int = 0) : RelativeLayout, KeyboardEvent {
   private final var blurJob: Job?

   public final var listener: com.discord.chat.input.views.ChatInputRootView.ChatInputListener?
      internal set

   private final val binding: ChatInputRootViewBinding
   private final var lineHeightMeasurer: ChatInputRootViewMeasurer
   private final val editText: DCDChatInput
   private final val insertedPayloads: MutableSet<ContentInfoCompat>

   public final val lineCount: Int?
      public final get() {
         val var1: Layout = this.editText.getLayout();
         val var2: Int;
         if (var1 != null) {
            var2 = var1.getLineCount();
         } else {
            var2 = null;
         }

         return var2;
      }


   public final var isCursorVisible: Boolean
      public final get() {
         return this.editText.isCursorVisible();
      }

      public final set(value) {
         this.editText.setCursorVisible(var1);
      }


   public final var isEditTextEnabled: Boolean
      public final get() {
         return this.editText.isEnabled();
      }

      public final set(value) {
         this.editText.setEnabled(var1);
      }


   public final var hint: String?
      public final get() {
         val var1: java.lang.CharSequence = this.editText.getHint();
         val var2: java.lang.String;
         if (var1 != null) {
            var2 = var1.toString();
         } else {
            var2 = null;
         }

         return var2;
      }

      public final set(value) {
         this.editText.setHint(var1);
         this.editTextHint = var1;
         this.updateHintEllipsis();
      }


   public final var hintTextColor: Int
      public final get() {
         return this.editText.getCurrentHintTextColor();
      }

      public final set(value) {
         this.editText.setHintTextColor(var1);
      }


   public final var text: String
      public final get() {
         return java.lang.String.valueOf(this.editText.getText());
      }

      public final set(value) {
         r.h(var1, "value");
         this.editText.setText(var1);
      }


   public final var textColor: Int
      public final get() {
         return this.editText.getCurrentTextColor();
      }

      public final set(value) {
         this.editText.setTextColor(var1);
      }


   private final var editTextHint: CharSequence?
   private final var editTextMaxLines: Int
   private final var lastEditId: String
   private final val currentTextFlow: MutableStateFlow<com.discord.chat.input.views.ChatInputRootView.CurrentTextAndSelection?>
   private final val currentLayoutFlow: MutableStateFlow<Int>

   fun ChatInputRootView(var1: Context) {
      r.h(var1, "context");
      this(var1, null, 0, 6, null);
   }

   fun ChatInputRootView(var1: Context, var2: AttributeSet) {
      r.h(var1, "context");
      this(var1, var2, 0, 4, null);
   }

   init {
      r.h(var1, "context");
      super(var1, var2, var3);
      val var6: ChatInputRootViewBinding = ChatInputRootViewBinding.inflate(LayoutInflater.from(var1), this);
      r.g(var6, "inflate(...)");
      this.binding = var6;
      this.lineHeightMeasurer = new ChatInputRootViewMeasurer(this, new a(this));
      val var7: DCDChatInput = var6.chatInputEditText;
      r.g(var6.chatInputEditText, "chatInputEditText");
      this.editText = var7;
      this.insertedPayloads = new LinkedHashSet<>();
      this.editTextHint = var7.getHint();
      this.editTextMaxLines = var7.getMaxLines();
      val var4: java.lang.String = UUID.randomUUID().toString();
      r.g(var4, "toString(...)");
      this.lastEditId = var4;
      this.currentTextFlow = x.a(null);
      this.currentLayoutFlow = x.a(0);
      DiscordFontUtilsKt.setDiscordFont(var7, DiscordFont.PrimaryMedium);
      SetTextSizeSpKt.setTextSizeSp(var7, 16.0F);
      var7.setOnRequestSend(new b(this));
      var7.setOnSelectionChanged(new c(this));
      var7.setOnFocusChangeListener(new d(this));
      Y.G0(var7, new java.lang.String[]{"image/*"}, new e(this, var1));
      var7.addTextChangedListener(
         new TextWatcher(this) {
            final ChatInputRootView this$0;

            {
               this.this$0 = var1;
            }

            public void afterTextChanged(Editable var1) {
               val var2: java.lang.String = java.lang.String.valueOf(var1);
               ChatInputRootView.access$setLastEditId$p(this.this$0, UUID.randomUUID().toString());
               ChatInputRootView.access$getCurrentTextFlow$p(this.this$0)
                  .setValue(
                     new ChatInputRootView.CurrentTextAndSelection(
                        ChatInputRootView.access$getEditText$p(this.this$0).getSelectionStart(),
                        ChatInputRootView.access$getEditText$p(this.this$0).getSelectionEnd(),
                        var2,
                        ChatInputRootView.access$getLastEditId$p(this.this$0)
                     )
                  );
               ChatInputRootView.access$getLineHeightMeasurer$p(this.this$0).measure(false);
               ChatInputRootView.access$updateHintEllipsis(this.this$0);
            }

            public void beforeTextChanged(java.lang.CharSequence var1, int var2, int var3, int var4) {
            }

            public void onTextChanged(java.lang.CharSequence var1, int var2, int var3, int var4) {
            }
         }
      );
      var7.addTextChangedListener(new DeleteNodeOnBackspaceTextWatcher());
      this.addOnLayoutChangeListener(new f(this));
   }

   @JvmStatic
   fun `_init_$lambda$1`(var0: ChatInputRootView): Unit {
      if (var0.listener != null) {
         var0.listener.onRequestSend();
      }

      return Unit.a;
   }

   @JvmStatic
   fun `_init_$lambda$10`(var0: ChatInputRootView, var1: View, var2: Int, var3: Int, var4: Int, var5: Int, var6: Int, var7: Int, var8: Int, var9: Int) {
      var0.currentLayoutFlow.setValue((var0.currentLayoutFlow.getValue() as java.lang.Number).intValue() + 1);
   }

   @JvmStatic
   fun `_init_$lambda$2`(var0: ChatInputRootView, var1: Int, var2: Int): Unit {
      var0.currentTextFlow
         .setValue(new ChatInputRootView.CurrentTextAndSelection(var1, var2, java.lang.String.valueOf(var0.editText.getText()), var0.lastEditId));
      return Unit.a;
   }

   @JvmStatic
   fun `_init_$lambda$3`(var0: ChatInputRootView, var1: View, var2: Boolean) {
      if (var2) {
         if (var0.listener != null) {
            var0.listener.onFocus(var0.editText.getSelectionStart(), var0.editText.getSelectionStart());
         }
      } else if (var0.listener != null) {
         var0.listener.onEndBlur(java.lang.String.valueOf(var0.editText.getText()));
      }
   }

   @JvmStatic
   fun `_init_$lambda$8`(var0: ChatInputRootView, var1: Context, var2: View, var3: ContentInfoCompat): ContentInfoCompat {
      val var15: Pair = var3.i(new g(var1));
      r.e(var15);
      val var9: ContentInfoCompat = var15.first as ContentInfoCompat;
      val var16: ContentInfoCompat = var15.second as ContentInfoCompat;
      val var19: Boolean;
      if (var9 != null) {
         val var7: java.util.Set = var0.insertedPayloads;
         r.e(var3);
         var7.add(var3);
         val var6: Int = var9.c().getItemCount();

         for (int var4 = 0; var4 < var6; var4++) {
            val var8: Uri = var9.c().getItemAt(var4).getUri();
            r.g(var8, "getUri(...)");
            if (var0.listener != null) {
               var0.listener.onImageInserted(var8);
            }
         }

         var19 = true;
      } else {
         var19 = false;
      }

      var var10: ContentInfoCompat = var16;
      if (var16 != null) {
         val var23: Editable = var0.editText.getText();
         if (var23 != null && !kotlin.text.h.c0(var23)) {
            return var16;
         }

         val var11: Pair = var16.i(new h());
         r.e(var11);
         val var17: ContentInfoCompat = var11.first as ContentInfoCompat;
         var10 = var11.second as ContentInfoCompat;
         if (var17 != null) {
            if (!var19) {
               val var12: java.util.Set = var0.insertedPayloads;
               r.e(var3);
               var12.add(var3);
            }

            val var21: Int = var17.c().getItemCount();

            for (int var20 = 0; var20 < var21; var20++) {
               val var13: Intent = var17.c().getItemAt(var20).getIntent();
               r.g(var13, "getIntent(...)");
               val var18: java.lang.String = var13.getStringExtra("data");
               if (var18 != null && var0.listener != null) {
                  var0.listener.onCommandInserted(var18);
               }
            }

            var10 = null;
         }
      }

      return var10;
   }

   private inline fun ContentInfoCompat.forEachIntent(action: (Intent) -> Unit) {
      val var4: Int = var1.c().getItemCount();

      for (int var3 = 0; var3 < var4; var3++) {
         val var5: Intent = var1.c().getItemAt(var3).getIntent();
         r.g(var5, "getIntent(...)");
         var2.invoke(var5);
      }
   }

   private inline fun ContentInfoCompat.forEachUri(action: (Uri) -> Unit) {
      val var4: Int = var1.c().getItemCount();

      for (int var3 = 0; var3 < var4; var3++) {
         val var5: Uri = var1.c().getItemAt(var3).getUri();
         r.g(var5, "getUri(...)");
         var2.invoke(var5);
      }
   }

   @JvmStatic
   fun `lambda$8$lambda$4`(var0: Context, var1: Item): Boolean {
      val var4: Uri = var1.getUri();
      var var2: Boolean = false;
      if (var4 != null) {
         val var5: java.lang.String = var0.getContentResolver().getType(var1.getUri());
         var2 = false;
         if (var5 != null) {
            var2 = false;
            if (kotlin.text.h.I(var5, "image/", false, 2, null)) {
               var2 = true;
            }
         }
      }

      return var2;
   }

   @JvmStatic
   fun `lambda$8$lambda$6`(var0: Item): Boolean {
      val var1: Boolean;
      if (var0.getIntent() != null && r.c(var0.getIntent().getType(), "application/x-discord-interaction-data") && var0.getIntent().hasExtra("data")) {
         var1 = true;
      } else {
         var1 = false;
      }

      return var1;
   }

   @JvmStatic
   fun `lineHeightMeasurer$lambda$0`(var0: ChatInputRootView, var1: Int): Unit {
      if (var0.listener != null) {
         var0.listener.onContentSizeChange((int)SizeUtilsKt.getPxToDp(var0.getWidth()), (int)SizeUtilsKt.getPxToDp(var1));
      }

      return Unit.a;
   }

   private fun updateChatNodes(chatInputNodes: List<ChatInputNode>, offset: Int = 0) {
      val var4: ArrayList = new ArrayList(kotlin.collections.i.v(var1, 10));

      for (ChatInputNode var5 : var1) {
         var4.add(ChatInputNode.copy$default(var5, 0, var5.getLocation() + var2, 0, null, false, null, false, 125, null));
      }

      for (ChatInputNode var7 : var4) {
         val var17: Editable = this.editText.getEditableText();
         r.g(var17, "getEditableText(...)");
         EditTextUtilsKt.setChatInputNodeStyle(var17, var7);
      }

      val var8: Editable = this.editText.getEditableText();
      r.g(var8, "getEditableText(...)");
      val var9: Array<Any> = var8.getSpans(0, var8.length(), BackgroundSpanDrawer.class);
      r.g(var9, "getSpans(...)");
      var var15: Boolean;
      if (var9.length == 0) {
         var15 = true;
      } else {
         var15 = false;
      }

      if (var15) {
         val var10: Editable = this.editText.getEditableText();
         r.g(var10, "getEditableText(...)");
         SpannableExtensionsKt.coverWithSpan(var10, new BackgroundSpanDrawer(this.editText));
      }

      val var11: Editable = this.editText.getEditableText();
      r.g(var11, "getEditableText(...)");
      val var12: Array<Any> = var11.getSpans(0, var11.length(), SelectionGuardSpanWatcher.class);
      r.g(var12, "getSpans(...)");
      var15 = false;
      if (var12.length == 0) {
         var15 = true;
      }

      if (var15) {
         val var13: Editable = this.editText.getEditableText();
         r.g(var13, "getEditableText(...)");
         SpannableExtensionsKt.coverWithSpan(var13, new SelectionGuardSpanWatcher());
      }
   }

   private fun updateHintEllipsis() {
      if (this.editText.length() == 0) {
         EditTextUtilsKt.addEllipsizedHint$default(this.editText, this.editTextHint, null, 2, null);
      } else {
         EditTextUtilsKt.removeEllipsizedHint(this.editText, this.editTextMaxLines);
      }
   }

   public fun backspace() {
      this.editText.dispatchKeyEvent(new KeyEvent(0, 67));
   }

   public fun clearAndApplyChatNodes(editId: String?, chatInputNodes: List<ChatInputNode>) {
      r.h(var2, "chatInputNodes");
      if (r.c(this.lastEditId, var1) || var1 == null) {
         val var6: Editable = this.editText.getEditableText();
         val var5: Array<DCDInputSpan> = var6.getSpans(0, var6.length(), DCDInputSpan.class) as Array<DCDInputSpan>;
         if (var5 != null) {
            val var4: Int = var5.length;

            for (int var3 = 0; var3 < var4; var3++) {
               var6.removeSpan(var5[var3]);
            }
         }

         updateChatNodes$default(this, var2, 0, 2, null);
      }
   }

   public fun clearInputFocus() {
      this.editText.clearFocus();
   }

   protected open fun onAttachedToWindow() {
      super.onAttachedToWindow();
      db.e.o(db.e.q(db.e.f(this.currentTextFlow, 100L), new Function2(this, null) {
         Object L$0;
         int label;
         final ChatInputRootView this$0;

         {
            super(2, var2x);
            this.this$0 = var1;
         }

         public final Continuation create(Object var1, Continuation var2) {
            val var3: Function2 = new <anonymous constructor>(this.this$0, var2);
            var3.L$0 = var1;
            return var3;
         }

         public final Object invoke(ChatInputRootView.CurrentTextAndSelection var1, Continuation var2x) {
            return (this.create(var1, var2x) as <unrepresentable>).invokeSuspend(Unit.a);
         }

         public final Object invokeSuspend(Object var1) {
            y9.b.e();
            if (this.label == 0) {
               kotlin.c.b(var1);
               val var2x: ChatInputRootView.CurrentTextAndSelection = this.L$0 as ChatInputRootView.CurrentTextAndSelection;
               if (this.L$0 as ChatInputRootView.CurrentTextAndSelection != null) {
                  var1 = this.this$0.getListener();
                  if (var1 != null) {
                     var1.onTextOrSelectionChanged(var2x.getSelectionStart(), var2x.getSelectionEnd(), var2x.getText(), var2x.getEditId());
                  }
               }

               return Unit.a;
            } else {
               throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
         }
      }), CoroutineViewUtilsKt.getAttachedScope(this));
      db.e.o(db.e.q(db.e.f(this.currentLayoutFlow, 32L), new Function2(this, null) {
         int label;
         final ChatInputRootView this$0;

         {
            super(2, var2x);
            this.this$0 = var1;
         }

         public final Continuation create(Object var1, Continuation var2) {
            return new <anonymous constructor>(this.this$0, var2);
         }

         public final Object invoke(int var1, Continuation var2x) {
            return (this.create(var1, var2x) as <unrepresentable>).invokeSuspend(Unit.a);
         }

         public final Object invokeSuspend(Object var1) {
            y9.b.e();
            if (this.label == 0) {
               kotlin.c.b(var1);
               ChatInputRootView.access$getLineHeightMeasurer$p(this.this$0).measure(true);
               return Unit.a;
            } else {
               throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
         }
      }), CoroutineViewUtilsKt.getAttachedScope(this));
   }

   public override fun onKeyboardStateChanged(opened: Boolean) {
      if (this.blurJob != null) {
         kotlinx.coroutines.Job.a.a(this.blurJob, null, 1, null);
      }

      if (!var1) {
         this.blurJob = ab.f.d(CoroutineViewUtilsKt.getAttachedScope(this), null, null, new Function2(this, null) {
            int label;
            final ChatInputRootView this$0;

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
               val var3: Any = y9.b.e();
               if (this.label != 0) {
                  if (this.label != 1) {
                     throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                  }

                  kotlin.c.b(var1);
               } else {
                  kotlin.c.b(var1);
                  var1 = K.a();
                  val var4: Function2 = new Function2(null) {
                     int label;

                     {
                        super(2, var1);
                     }

                     public final Continuation create(Object var1, Continuation var2) {
                        return new <anonymous constructor>(var2);
                     }

                     public final Object invoke(CoroutineScope var1, Continuation var2x) {
                        return (this.create(var1, var2x) as <unrepresentable>).invokeSuspend(Unit.a);
                     }

                     public final Object invokeSuspend(Object var1) {
                        val var3: Any = y9.b.e();
                        if (this.label != 0) {
                           if (this.label != 1) {
                              throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                           }

                           kotlin.c.b(var1);
                        } else {
                           kotlin.c.b(var1);
                           this.label = 1;
                           if (I.a(100L, this) === var3) {
                              return var3;
                           }
                        }

                        return Unit.a;
                     }
                  };
                  this.label = 1;
                  if (ab.f.g(var1, var4, this) === var3) {
                     return var3;
                  }
               }

               val var6: Context = this.this$0.getContext();
               r.g(var6, "getContext(...)");
               if (!ChatInputRootViewKt.isScreenReaderOn(var6)) {
                  ChatInputRootView.access$getEditText$p(this.this$0).clearFocus();
                  val var7: ChatInputRootView.ChatInputListener = this.this$0.getListener();
                  if (var7 != null) {
                     var7.onEndBlur(java.lang.String.valueOf(ChatInputRootView.access$getEditText$p(this.this$0).getText()));
                  }
               }

               return Unit.a;
            }
         }, 3, null);
      }
   }

   public fun replaceRange(location: Int, length: Int, text: String, styleBlocks: List<ChatInputNode>, keepCursorPosition: Boolean, editId: String?) {
      r.h(var3, "text");
      r.h(var4, "styleBlocks");
      if (r.c(var6, this.lastEditId) || var6 == null) {
         val var9: Editable = this.editText.getText();
         val var7: Int;
         if (var9 != null) {
            var7 = var9.length();
         } else {
            var7 = 0;
         }

         if (var1 <= var7) {
            var2 = var2 + var1;
            if (var2 + var1 <= var7) {
               this.editText.getEditableText().replace(var1, var2, var3);
               this.updateChatNodes(var4, var1);
            }
         }
      }
   }

   public fun requestInputFocus(): Boolean {
      return this.editText.requestFocus();
   }

   public fun setNoExtractUI(enabled: Boolean) {
      this.editText.setNoExtractUI(var1);
   }

   public fun setSelection(start: Int, stop: Int = var1) {
      this.editText.setSelection(var1, var2);
   }

   public fun showKeyboard(window: Window) {
      r.h(var1, "window");
      KeyboardExtensionsKt.showKeyboard(this.editText, var1);
   }

   public interface ChatInputListener {
      public abstract fun onCommandInserted(data: String) {
      }

      public abstract fun onContentSizeChange(width: Int, height: Int) {
      }

      public abstract fun onEndBlur(text: String) {
      }

      public abstract fun onFocus(start: Int, end: Int) {
      }

      public abstract fun onImageInserted(uri: Uri) {
      }

      public abstract fun onRequestSend() {
      }

      public abstract fun onTextOrSelectionChanged(start: Int, end: Int, text: String, editId: String) {
      }
   }

   public data class CurrentTextAndSelection(selectionStart: Int, selectionEnd: Int, text: String, editId: String) {
      public final val selectionStart: Int
      public final val selectionEnd: Int
      public final val text: String
      public final val editId: String

      init {
         r.h(var3, "text");
         r.h(var4, "editId");
         super();
         this.selectionStart = var1;
         this.selectionEnd = var2;
         this.text = var3;
         this.editId = var4;
      }

      public operator fun component1(): Int {
         return this.selectionStart;
      }

      public operator fun component2(): Int {
         return this.selectionEnd;
      }

      public operator fun component3(): String {
         return this.text;
      }

      public operator fun component4(): String {
         return this.editId;
      }

      public fun copy(selectionStart: Int = var0.selectionStart, selectionEnd: Int = var0.selectionEnd, text: String = var0.text, editId: String = var0.editId): com.discord.chat.input.views.ChatInputRootView.CurrentTextAndSelection {
         r.h(var3, "text");
         r.h(var4, "editId");
         return new ChatInputRootView.CurrentTextAndSelection(var1, var2, var3, var4);
      }

      public override operator fun equals(other: Any?): Boolean {
         if (this === var1) {
            return true;
         } else if (var1 !is ChatInputRootView.CurrentTextAndSelection) {
            return false;
         } else {
            var1 = var1;
            if (this.selectionStart != var1.selectionStart) {
               return false;
            } else if (this.selectionEnd != var1.selectionEnd) {
               return false;
            } else if (!r.c(this.text, var1.text)) {
               return false;
            } else {
               return r.c(this.editId, var1.editId);
            }
         }
      }

      public override fun hashCode(): Int {
         return ((Integer.hashCode(this.selectionStart) * 31 + Integer.hashCode(this.selectionEnd)) * 31 + this.text.hashCode()) * 31 + this.editId.hashCode();
      }

      public override fun toString(): String {
         val var2: Int = this.selectionStart;
         val var1: Int = this.selectionEnd;
         val var5: java.lang.String = this.text;
         val var3: java.lang.String = this.editId;
         val var4: StringBuilder = new StringBuilder();
         var4.append("CurrentTextAndSelection(selectionStart=");
         var4.append(var2);
         var4.append(", selectionEnd=");
         var4.append(var1);
         var4.append(", text=");
         var4.append(var5);
         var4.append(", editId=");
         var4.append(var3);
         var4.append(")");
         return var4.toString();
      }
   }
}
