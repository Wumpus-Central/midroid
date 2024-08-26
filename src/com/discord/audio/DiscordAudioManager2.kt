package com.discord.audio

import android.content.Context
import android.media.AudioDeviceCallback
import android.media.AudioDeviceInfo
import android.media.AudioManager
import android.media.AudioManager.OnCommunicationDeviceChangedListener
import android.os.RemoteException
import java.util.ArrayList
import kotlin.jvm.functions.Function1
import kotlin.jvm.internal.r

public class DiscordAudioManager2(context: Context) : DiscordAudioManagerInterface, OnCommunicationDeviceChangedListener {
   private final val context: Context
   private final val listeners: ArrayList<DiscordAudioManagerListener>
   private final val androidAudioManager: AudioManager
   private final var audioDevices: Set<AudioDeviceInfo>
   private final val audioDeviceCallback: AudioDeviceCallback
   private final var scoRetryCount: Int
   private final var communicationDeviceChangedRegistered: Boolean
   private final var preferredAudioDevice: AudioDeviceInfo?

   init {
      r.h(var1, "context");
      super();
      this.context = var1;
      this.listeners = new ArrayList<>();
      val var2: AudioManager = var1.getSystemService(AudioManager.class) as AudioManager;
      this.androidAudioManager = var2;
      this.audioDevices = u.d();
      this.audioDeviceCallback = this.setupAudioDeviceCallback();
      val var3: Array<AudioDeviceInfo> = var2.getDevices(2);
      r.g(var3, "currentDevices");
      this.audioDevices = kotlin.collections.b.H0(var3);
   }

   private fun emitEffectiveDevice() {
      this.notifyListeners(new Function1<DiscordAudioManagerListener, Unit>(this.getEffectiveAudioDevice()) {
         final AndroidAudioDevice $device;

         {
            super(1);
            this.$device = var1;
         }

         public final void invoke(DiscordAudioManagerListener var1) {
            r.h(var1, "listener");
            var1.onActiveAudioDeviceChanged(this.$device);
         }
      });
   }

   private fun notifyListeners(action: (DiscordAudioManagerListener) -> Unit) {
      val var2: java.util.Iterator = this.listeners.iterator();

      while (var2.hasNext()) {
         var1.invoke(var2.next());
      }
   }

   private fun setActiveAudioDevice(device: AudioDeviceInfo) {
      try {
         b.a(this.androidAudioManager, var1);
      } catch (RemoteException | var2: IllegalArgumentException) {
      }
   }

   private fun setupAudioDeviceCallback(): AudioDeviceCallback {
      return new AudioDeviceCallback(this) {
         final DiscordAudioManager2 this$0;

         {
            this.this$0 = var1;
         }

         // $VF: Duplicated exception handlers to handle obfuscated exceptions
         public void onAudioDevicesAdded(AudioDeviceInfo[] var1) {
            var var11: Boolean;
            label91: {
               if (var1 != null) {
                  if (var1.length == 0) {
                     var11 = (boolean)1;
                  } else {
                     var11 = (boolean)0;
                  }

                  if (!var11) {
                     var11 = 0;
                     break label91;
                  }
               }

               var11 = 1;
            }

            if (!var11) {
               val var5: DiscordAudioManager2 = this.this$0;
               val var8: java.util.Set = DiscordAudioManager2.access$getAudioDevices$p(this.this$0);
               val var7: ArrayList = new ArrayList();
               val var3: Int = var1.length;

               for (int var12 = 0; var12 < var3; var12++) {
                  val var6: AudioDeviceInfo = var1[var12];
                  if (var1[var12].isSink()) {
                     var7.add(var6);
                  }
               }

               DiscordAudioManager2.access$setAudioDevices$p(var5, u.l(var8, var7));
               DiscordAudioManager2.access$notifyListeners(this.this$0, new Function1<DiscordAudioManagerListener, Unit>(this.this$0) {
                  final DiscordAudioManager2 this$0;

                  {
                     super(1);
                     this.this$0 = var1;
                  }

                  public final void invoke(DiscordAudioManagerListener var1) {
                     r.h(var1, "listener");
                     var1.onAudioDevicesUpdated(h.N0(this.this$0.getAudioDevices()));
                  }
               });
               if (DiscordAudioManager2.access$getPreferredAudioDevice$p(this.this$0) == null) {
                  var var4: Int = var1.length;
                  var11 = 0;

                  while (true) {
                     var21 = null;
                     if (var11 >= var4) {
                        var19 = null;
                        break;
                     }

                     var19 = var1[var11];
                     val var15: Boolean;
                     if (AndroidAudioDeviceKt.getAudioDeviceTypeToSimpleMapping().getOrDefault(var1[var11].getType(), SimpleDeviceType.INVALID) === SimpleDeviceType.BLUETOOTH_HEADSET
                        )
                      {
                        var15 = true;
                     } else {
                        var15 = false;
                     }

                     if (var15) {
                        break;
                     }

                     var11++;
                  }

                  var4 = var1.length;
                  var11 = 0;

                  var var20: AudioDeviceInfo;
                  while (true) {
                     var20 = (AudioDeviceInfo)var21;
                     if (var11 >= var4) {
                        break;
                     }

                     var20 = var1[var11];
                     val var16: Boolean;
                     if (AndroidAudioDeviceKt.getAudioDeviceTypeToSimpleMapping().getOrDefault(var1[var11].getType(), SimpleDeviceType.INVALID) === SimpleDeviceType.WIRED_HEADSET
                        )
                      {
                        var16 = true;
                     } else {
                        var16 = false;
                     }

                     if (var16) {
                        break;
                     }

                     var11++;
                  }

                  if (var19 != null) {
                     try {
                        b.a(DiscordAudioManager2.access$getAndroidAudioManager$p(this.this$0), var19);
                     } catch (RemoteException | var10: IllegalArgumentException) {
                     }
                  } else if (var20 != null) {
                     try {
                        b.a(DiscordAudioManager2.access$getAndroidAudioManager$p(this.this$0), var20);
                     } catch (RemoteException | var9: IllegalArgumentException) {
                     }
                  }
               }

               DiscordAudioManager2.access$emitEffectiveDevice(this.this$0);
            }
         }

         public void onAudioDevicesRemoved(AudioDeviceInfo[] var1) {
            var var2: Boolean = true;
            if (var1 != null) {
               if (var1.length == 0) {
                  var2 = true;
               } else {
                  var2 = false;
               }

               if (var2) {
                  var2 = true;
               } else {
                  var2 = false;
               }
            }

            if (!var2) {
               val var6: DiscordAudioManager2 = this.this$0;
               val var5: java.util.Set = DiscordAudioManager2.access$getAudioDevices$p(this.this$0);
               val var7: ArrayList = new ArrayList();
               val var12: Int = var1.length;

               for (int var11 = 0; var11 < var12; var11++) {
                  val var8: AudioDeviceInfo = var1[var11];
                  if (var1[var11].isSink()) {
                     var7.add(var8);
                  }
               }

               DiscordAudioManager2.access$setAudioDevices$p(var6, u.j(var5, h.R0(var7)));
               DiscordAudioManager2.access$notifyListeners(this.this$0, new Function1<DiscordAudioManagerListener, Unit>(this.this$0) {
                  final DiscordAudioManager2 this$0;

                  {
                     super(1);
                     this.this$0 = var1;
                  }

                  public final void invoke(DiscordAudioManagerListener var1) {
                     r.h(var1, "listener");
                     var1.onAudioDevicesUpdated(h.N0(this.this$0.getAudioDevices()));
                  }
               });
               DiscordAudioManager2.access$emitEffectiveDevice(this.this$0);
            }
         }
      };
   }

   public override fun addListener(listener: DiscordAudioManagerListener) {
      r.h(var1, "listener");
      this.listeners.add(var1);
   }

   public override fun getAudioDevices(): Set<AndroidAudioDevice> {
      val var3: java.util.Set = this.audioDevices;
      val var2: ArrayList = new ArrayList();

      for (Object var4 : var3) {
         val var1: Int = (var4 as AudioDeviceInfo).getType();
         val var5: Boolean;
         if (var1 != 8 && var1 != 18 && var1 != 24 && var1 != 27 && var1 != 30) {
            var5 = true;
         } else {
            var5 = false;
         }

         if (var5) {
            var2.add(var4);
         }
      }

      val var8: ArrayList = new ArrayList(h.t(var2, 10));

      for (AudioDeviceInfo var9 : var2) {
         var8.add(AndroidAudioDevice.Companion.fromAudioDeviceInfo(var9));
      }

      return h.Q0(var8);
   }

   public override fun getEffectiveAudioDevice(): AndroidAudioDevice {
      val var1: AudioDeviceInfo = a.a(this.androidAudioManager);
      return if (var1 != null) AndroidAudioDevice.Companion.fromAudioDeviceInfo(var1) else new AndroidAudioDevice();
   }

   public open fun onCommunicationDeviceChanged(device: AudioDeviceInfo?) {
      this.emitEffectiveDevice();
   }

   public override fun removeListener(listener: DiscordAudioManagerListener) {
      r.h(var1, "listener");
      this.listeners.remove(var1);
   }

   public override fun setActiveAudioDevice(device: AndroidAudioDevice) {
      r.h(var1, "device");
      val var4: java.util.Iterator = this.audioDevices.iterator();

      while (true) {
         if (var4.hasNext()) {
            val var3: Any = var4.next();
            val var2: Boolean;
            if ((var3 as AudioDeviceInfo).getId() == var1.getDeviceId()) {
               var2 = true;
            } else {
               var2 = false;
            }

            if (!var2) {
               continue;
            }

            var5 = var3;
            break;
         }

         var5 = null;
         break;
      }

      val var6: AudioDeviceInfo = var5 as AudioDeviceInfo;
      if (var5 as AudioDeviceInfo != null) {
         this.preferredAudioDevice = var6;
         this.setActiveAudioDevice(var6);
      }
   }

   public override fun setCommunicationModeOn(on: Boolean) {
      if (var1) {
         this.androidAudioManager.setMode(3);
         val var4: Any = null;
         this.androidAudioManager.registerAudioDeviceCallback(this.audioDeviceCallback, null);
         if (!this.communicationDeviceChangedRegistered) {
            d.a(this.androidAudioManager, c.a(this.context), this);
            this.communicationDeviceChangedRegistered = true;
         }

         val var16: AudioDeviceInfo = this.preferredAudioDevice;

         var var12: Any;
         label81: {
            for (var12 : this.audioDevices) {
               val var2: Boolean;
               if (AndroidAudioDeviceKt.getAudioDeviceTypeToSimpleMapping().getOrDefault((var12 as AudioDeviceInfo).getType(), SimpleDeviceType.INVALID) === SimpleDeviceType.BLUETOOTH_HEADSET
                  )
                {
                  var2 = true;
               } else {
                  var2 = false;
               }

               if (var2) {
                  break label81;
               }
            }

            var12 = null;
         }

         label71: {
            for (var12 : this.audioDevices) {
               val var10: Boolean;
               if (AndroidAudioDeviceKt.getAudioDeviceTypeToSimpleMapping().getOrDefault((var12 as AudioDeviceInfo).getType(), SimpleDeviceType.INVALID) === SimpleDeviceType.WIRED_HEADSET
                  )
                {
                  var10 = true;
               } else {
                  var10 = false;
               }

               if (var10) {
                  break label71;
               }
            }

            var12 = null;
         }

         val var19: AudioDeviceInfo = var12 as AudioDeviceInfo;
         val var20: java.util.Iterator = this.audioDevices.iterator();

         val var11: Boolean;
         do {
            var12 = var4;
            if (!var20.hasNext()) {
               break;
            }

            var12 = var20.next();
            if (AndroidAudioDeviceKt.getAudioDeviceTypeToSimpleMapping().getOrDefault((var12 as AudioDeviceInfo).getType(), SimpleDeviceType.INVALID) === SimpleDeviceType.SPEAKERPHONE
               )
             {
               var11 = true;
            } else {
               var11 = false;
            }
         } while (!var11);

         var12 = var12 as AudioDeviceInfo;
         if (var16 != null && this.audioDevices.contains(var16)) {
            this.setActiveAudioDevice(var16);
         } else if (var12 as AudioDeviceInfo != null) {
            this.setActiveAudioDevice(var12 as AudioDeviceInfo);
         } else if (var19 != null) {
            this.setActiveAudioDevice(var19);
         } else if (var12 != null) {
            this.setActiveAudioDevice((AudioDeviceInfo)var12);
         }
      } else {
         if (this.communicationDeviceChangedRegistered) {
            this.communicationDeviceChangedRegistered = false;
            e.a(this.androidAudioManager, this);
         }

         this.androidAudioManager.unregisterAudioDeviceCallback(this.audioDeviceCallback);
         this.androidAudioManager.setMode(0);
      }
   }

   public override fun setSCORetryCount(count: Int) {
      this.scoRetryCount = var1;
   }

   public companion object {
      private final var instance: DiscordAudioManager2?

      public fun getInstance(context: Context): DiscordAudioManager2 {
         r.h(var1, "context");
         if (DiscordAudioManager2.access$getInstance$cp() == null) {
            DiscordAudioManager2.access$setInstance$cp(new DiscordAudioManager2(var1));
         }

         val var2: DiscordAudioManager2 = DiscordAudioManager2.access$getInstance$cp();
         r.e(var2);
         return var2;
      }
   }
}
