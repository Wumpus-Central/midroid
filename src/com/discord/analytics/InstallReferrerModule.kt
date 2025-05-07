package com.discord.analytics

import V9.f
import V9.t0
import android.content.SharedPreferences
import android.content.SharedPreferences.Editor
import com.android.installreferrer.api.InstallReferrerClient
import com.facebook.react.bridge.Promise
import com.facebook.react.bridge.ReactApplicationContext
import com.facebook.react.bridge.ReactContextBaseJavaModule
import com.facebook.react.bridge.ReactMethod
import java.util.concurrent.CancellationException
import kotlin.coroutines.Continuation
import kotlin.jvm.functions.Function2
import kotlin.jvm.internal.q
import kotlin.jvm.internal.Ref.ObjectRef
import kotlinx.coroutines.CoroutineScope
import kotlinx.coroutines.g
import m8.r
import m8.s
import m8.r.a
import t8.b

public class InstallReferrerModule(context: ReactApplicationContext) : ReactContextBaseJavaModule {
   init {
      q.h(var1, "context");
      super(var1);
   }

   @ReactMethod
   public fun get(promise: Promise) {
      q.h(var1, "promise");
      val var4: SharedPreferences = this.getReactApplicationContext().getSharedPreferences("InstallReferrer", 0);
      val var3: ObjectRef = new ObjectRef();
      var3.j = var4.getString("referrer", null);
      val var2: Int = var4.getInt("attempts", 0);
      if (var3.j != null) {
         var1.resolve(var3.j);
      } else if (var2 < 10) {
         f.d(
            g.b(),
            null,
            null,
            new Function2(new ObjectRef(), this, var3, var4, var1, var2, null) {
               final int $attempts;
               final ObjectRef $client;
               final SharedPreferences $prefs;
               final Promise $promise;
               final ObjectRef $referrer;
               int label;
               final InstallReferrerModule this$0;

               {
                  super(2, var7);
                  this.$client = var1;
                  this.this$0 = var2x;
                  this.$referrer = var3;
                  this.$prefs = var4;
                  this.$promise = var5;
                  this.$attempts = var6;
               }

               public final Continuation create(Object var1, Continuation var2) {
                  return new <anonymous constructor>(this.$client, this.this$0, this.$referrer, this.$prefs, this.$promise, this.$attempts, var2);
               }

               public final Object invoke(CoroutineScope var1, Continuation var2x) {
                  return (this.create(var1, var2x) as <unrepresentable>).invokeSuspend(Unit.a);
               }

               public final Object invokeSuspend(Object var1) {
                  val var3: Any = b.e();
                  if (this.label != 0) {
                     if (this.label != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                     }

                     s.b(var1);
                  } else {
                     s.b(var1);
                     var1 = new Function2(this.$client, this.this$0, this.$referrer, this.$prefs, this.$promise, this.$attempts, null) {
                        final int $attempts;
                        final ObjectRef $client;
                        final SharedPreferences $prefs;
                        final Promise $promise;
                        final ObjectRef $referrer;
                        private Object L$0;
                        Object L$1;
                        Object L$2;
                        Object L$3;
                        Object L$4;
                        int label;
                        final InstallReferrerModule this$0;

                        {
                           super(2, var7);
                           this.$client = var1;
                           this.this$0 = var2x;
                           this.$referrer = var3x;
                           this.$prefs = var4;
                           this.$promise = var5;
                           this.$attempts = var6;
                        }

                        public final Continuation create(Object var1, Continuation var2) {
                           val var3x: Function2 = new <anonymous constructor>(
                              this.$client, this.this$0, this.$referrer, this.$prefs, this.$promise, this.$attempts, var2
                           );
                           var3x.L$0 = var1;
                           return var3x;
                        }

                        public final Object invoke(CoroutineScope var1, Continuation var2x) {
                           return (this.create(var1, var2x) as <unrepresentable>).invokeSuspend(Unit.a);
                        }

                        // $VF: Duplicated exception handlers to handle obfuscated exceptions
                        // $VF: Could not inline inconsistent finally blocks
                        // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
                        public final Object invokeSuspend(Object var1) {
                           label132: {
                              var var3x: ObjectRef;
                              var var4: ObjectRef;
                              var var5: SharedPreferences;
                              var var195: Int;
                              label133: {
                                 var195 = (Integer)b.e();
                                 val var194: Promise;
                                 var var196: Any;
                                 if (this.label != 0) {
                                    if (this.label != 1) {
                                       throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                                    }

                                    var194 = this.L$4 as Promise;
                                    var5 = this.L$3 as SharedPreferences;
                                    var4 = this.L$2 as ObjectRef;
                                    var3x = this.L$1 as ObjectRef;
                                    var196 = this.L$0 as CoroutineScope;

                                    try {
                                       s.b(var1);
                                    } catch (var21: java.lang.Throwable) {
                                       val var174: a = r.k;
                                       var1 = r.b(s.a(var21));
                                       break label132;
                                    }

                                    var196 = var1;
                                 } else {
                                    s.b(var1);
                                    var196 = this.L$0 as CoroutineScope;
                                    var3x = this.$client;
                                    val var9: InstallReferrerModule = this.this$0;
                                    var4 = this.$referrer;
                                    var5 = this.$prefs;
                                    var1 = this.$promise;

                                    try {
                                       val var10: a = r.k;
                                       var199 = InstallReferrerClient.c(InstallReferrerModule.access$getReactApplicationContext(var9)).a();
                                       var3x.j = var199;
                                    } catch (var22: java.lang.Throwable) {
                                       val var175: a = r.k;
                                       var1 = r.b(s.a(var22));
                                       break label132;
                                    }

                                    if (var199 == null) {
                                       var195 = null;
                                       break label133;
                                    }

                                    try {
                                       this.L$0 = var196;
                                       this.L$1 = var3x;
                                       this.L$2 = var4;
                                       this.L$3 = var5;
                                       this.L$4 = var1;
                                       this.label = 1;
                                       var196 = InstallReferrerModuleKt.access$await(var199, this);
                                    } catch (var20: java.lang.Throwable) {
                                       val var176: a = r.k;
                                       var1 = r.b(s.a(var20));
                                       break label132;
                                    }

                                    if (var196 === var195) {
                                       return var195;
                                    }

                                    var194 = var1;
                                 }

                                 try {
                                    var196 = var196 as Int;
                                 } catch (var19: java.lang.Throwable) {
                                    val var177: a = r.k;
                                    var1 = r.b(s.a(var19));
                                    break label132;
                                 }

                                 var1 = var194;
                                 var195 = (Integer)var196;
                              }

                              label107: {
                                 if (var195 != null) {
                                    try {
                                       if (var195 == 0) {
                                          var180 = var3x.j as InstallReferrerClient;
                                          break label107;
                                       }
                                    } catch (var18: java.lang.Throwable) {
                                       val var178: a = r.k;
                                       var1 = r.b(s.a(var18));
                                       break label132;
                                    }
                                 }

                                 try {
                                    throw new IllegalStateException("Check failed.");
                                 } catch (var17: java.lang.Throwable) {
                                    val var179: a = r.k;
                                    var1 = r.b(s.a(var17));
                                    break label132;
                                 }
                              }

                              label98: {
                                 if (var180 != null) {
                                    try {
                                       var182 = var180.b();
                                    } catch (var16: java.lang.Throwable) {
                                       val var181: a = r.k;
                                       var1 = r.b(s.a(var16));
                                       break label132;
                                    }

                                    if (var182 != null) {
                                       try {
                                          var183 = var182.a();
                                          break label98;
                                       } catch (var15: java.lang.Throwable) {
                                          val var184: a = r.k;
                                          var1 = r.b(s.a(var15));
                                          break label132;
                                       }
                                    }
                                 }

                                 var183 = null;
                              }

                              label89:
                              try {
                                 var4.j = var183;
                                 q.e(var5);
                                 val var186: Editor = var5.edit();
                                 var186.putString("referrer", var4.j as java.lang.String);
                                 var186.apply();
                                 var1.resolve(var4.j);
                                 var1 = r.b(Unit.a);
                              } catch (var14: java.lang.Throwable) {
                                 val var185: a = r.k;
                                 var1 = r.b(s.a(var14));
                                 break label89;
                              }
                           }

                           val var192: SharedPreferences = this.$prefs;
                           val var187: Promise = this.$promise;
                           val var173: Int = this.$attempts;
                           val var170: java.lang.Throwable = r.e(var1);
                           if (var170 != null) {
                              q.e(var192);
                              val var193: Editor = var192.edit();
                              var193.putInt("attempts", var173 + 1);
                              var193.apply();
                              var187.resolve(null);
                              if (var170 is CancellationException) {
                                 throw var170;
                              }
                           }

                           val var171: ObjectRef = this.$client;

                           try {
                              var189 = var171.j as InstallReferrerClient;
                           } catch (var13: java.lang.Throwable) {
                              val var188: a = r.k;
                              r.b(s.a(var13));
                              return Unit.a;
                           }

                           var var172: Unit = null;
                           if (var189 != null) {
                              try {
                                 var189.a();
                                 var172 = Unit.a;
                              } catch (var12: java.lang.Throwable) {
                                 val var190: a = r.k;
                                 r.b(s.a(var12));
                                 return Unit.a;
                              }
                           }

                           try {
                              r.b(var172);
                           } catch (var11: java.lang.Throwable) {
                              val var191: a = r.k;
                              r.b(s.a(var11));
                              return Unit.a;
                           }

                           return Unit.a;
                        }
                     };
                     this.label = 1;
                     if (t0.c(1000L, var1, this) === var3) {
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
         var1.resolve(null);
      }
   }

   public open fun getName(): String {
      return "InstallReferrer";
   }

   public companion object {
      private const val MAX_ATTEMPTS: Int
   }
}
