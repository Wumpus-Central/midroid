package com.discord.audio

import android.content.BroadcastReceiver
import android.content.Context
import android.content.Intent
import android.content.IntentFilter
import android.media.AudioDeviceCallback
import android.media.AudioDeviceInfo
import android.media.AudioManager
import com.discord.logging.Log
import java.util.ArrayList
import kotlin.jvm.functions.Function1
import kotlin.jvm.internal.q

public class DiscordAudioManager(context: Context) : DiscordAudioManagerInterface {
   private final val context: Context
   private final val listeners: ArrayList<DiscordAudioManagerListener>
   private final var communicationModeOn: Boolean
   private final val androidAudioManager: AudioManager
   private final val audioDeviceCallback: AudioDeviceCallback
   private final var scoRetryCount: Int
   private final var scoRetryAttempts: Int
   private final var scoReceiverRegistered: Boolean
   private final var audioDevices: List<AudioDeviceInfo>
   private final var desiredDeviceType: SimpleDeviceType
   private final val audioManagerBroadcastReceiver: <unrepresentable>

   init {
      q.h(var1, "context");
      super();
      this.context = var1;
      this.listeners = new ArrayList<>();
      val var2: AudioManager = var1.getSystemService(AudioManager.class) as AudioManager;
      this.androidAudioManager = var2;
      this.audioDeviceCallback = this.setupAudioDeviceCallback();
      this.audioDevices = i.j();
      this.desiredDeviceType = SimpleDeviceType.DEFAULT;
      this.audioManagerBroadcastReceiver = new BroadcastReceiver(this) {
         final DiscordAudioManager this$0;

         {
            this.this$0 = var1;
         }

         public void onReceive(Context var1, Intent var2) {
            val var7: java.lang.String;
            if (var2 != null) {
               var7 = var2.getAction();
            } else {
               var7 = null;
            }

            if (var7 != null && var7.hashCode() == -1692127708 && var7.equals("android.media.ACTION_SCO_AUDIO_STATE_UPDATED")) {
               val var4: Int = var2.getIntExtra("android.media.extra.SCO_AUDIO_PREVIOUS_STATE", -1);
               var var3: Int = var2.getIntExtra("android.media.extra.SCO_AUDIO_STATE", -1);
               val var8: Log = Log.INSTANCE;
               val var6: java.lang.String = this.this$0.scoStateToString(var4);
               val var9: java.lang.String = this.this$0.scoStateToString(var3);
               val var5: StringBuilder = new StringBuilder();
               var5.append("Bluetooth SCO State Change - previous: ");
               var5.append(var6);
               var5.append(" current: ");
               var5.append(var9);
               Log.i$default(var8, "DiscordAudioManager", var5.toString(), null, 4, null);
               if (var3 == -1 || var3 == 0) {
                  if (DiscordAudioManager.access$getDesiredDeviceType$p(this.this$0) === SimpleDeviceType.BLUETOOTH_HEADSET) {
                     if (DiscordAudioManager.access$getScoRetryAttempts$p(this.this$0) < DiscordAudioManager.access$getScoRetryCount$p(this.this$0)) {
                        DiscordAudioManager.access$setScoRetryAttempts$p(this.this$0, DiscordAudioManager.access$getScoRetryAttempts$p(this.this$0) + 1);
                        var3 = DiscordAudioManager.access$getScoRetryAttempts$p(this.this$0);
                        val var11: StringBuilder = new StringBuilder();
                        var11.append("Retry SCO # ");
                        var11.append(var3);
                        Log.i$default(var8, "DiscordAudioManager", var11.toString(), null, 4, null);
                        DiscordAudioManager.access$getAndroidAudioManager$p(this.this$0).startBluetoothSco();
                     } else {
                        DiscordAudioManager.access$setDesiredDeviceType$p(this.this$0, SimpleDeviceType.DEFAULT);
                        DiscordAudioManager.access$emitEffectiveDevice(this.this$0);
                     }
                  }
               } else if (var3 == 1 && DiscordAudioManager.access$getAndroidAudioManager$p(this.this$0).isBluetoothScoOn()) {
                  DiscordAudioManager.access$setScoRetryAttempts$p(this.this$0, 0);
                  DiscordAudioManager.access$emitEffectiveDevice(this.this$0);
               }
            }
         }
      };
      val var3: Array<AudioDeviceInfo> = var2.getDevices(2);
      q.e(var3);
      this.audioDevices = kotlin.collections.c.z0(var3);
   }

   private fun emitEffectiveDevice() {
      this.notifyListeners(new Function1(this.getEffectiveAudioDevice()) {
         final AndroidAudioDevice $device;

         {
            super(1);
            this.$device = var1;
         }

         public final void invoke(DiscordAudioManagerListener var1) {
            q.h(var1, "listener");
            var1.onActiveAudioDeviceChanged(this.$device);
         }
      });
   }

   private fun getActiveAudioDevice(): SimpleDeviceType {
      val var2: SimpleDeviceType = SimpleDeviceType.INVALID;
      var var1: SimpleDeviceType;
      if (this.androidAudioManager.isSpeakerphoneOn()) {
         var1 = SimpleDeviceType.SPEAKERPHONE;
      } else if (this.androidAudioManager.isBluetoothScoOn()) {
         var1 = SimpleDeviceType.BLUETOOTH_HEADSET;
      } else {
         if (this.audioDevices !is java.util.Collection || !this.audioDevices.isEmpty()) {
            for (AudioDeviceInfo var6 : var5) {
               if (AndroidAudioDeviceKt.getAudioDeviceTypeToSimpleMapping().getOrDefault(var6.getType(), SimpleDeviceType.INVALID) === SimpleDeviceType.WIRED_HEADSET
                  )
                {
                  return SimpleDeviceType.WIRED_HEADSET;
               }
            }
         }

         val var7: java.util.List = this.audioDevices;
         if (this.audioDevices is java.util.Collection && this.audioDevices.isEmpty()) {
            var1 = var2;
         } else {
            val var9: java.util.Iterator = this.audioDevices.iterator();

            val var10: Any;
            do {
               var1 = var2;
               if (!var9.hasNext()) {
                  break;
               }

               var10 = AndroidAudioDeviceKt.getAudioDeviceTypeToSimpleMapping()
                  .getOrDefault((var9.next() as AudioDeviceInfo).getType(), SimpleDeviceType.INVALID);
               var1 = SimpleDeviceType.EARPIECE;
            } while (var10 != SimpleDeviceType.EARPIECE);
         }
      }

      return var1;
   }

   private fun getSimpleDevices(): Set<SimpleDeviceType> {
      val var3: java.util.List = this.audioDevices;
      val var2: ArrayList = new ArrayList();

      for (var3 : var3) {
         val var6: AudioDeviceInfo = var3 as AudioDeviceInfo;
         val var5: java.util.Map = AndroidAudioDeviceKt.getAudioDeviceTypeToSimpleMapping();
         val var1: Int = var6.getType();
         val var12: SimpleDeviceType = SimpleDeviceType.INVALID;
         if (var5.getOrDefault(var1, var12) != var12) {
            var2.add(var3);
         }
      }

      val var10: ArrayList = new ArrayList(i.u(var2, 10));

      for (AudioDeviceInfo var7 : var2) {
         var10.add(AndroidAudioDeviceKt.getAudioDeviceTypeToSimpleMapping().getOrDefault(var7.getType(), SimpleDeviceType.INVALID));
      }

      val var8: java.util.Set = i.T0(var10);
      if (var8.contains(SimpleDeviceType.WIRED_HEADSET)) {
         var8.remove(SimpleDeviceType.EARPIECE);
      }

      return var8;
   }

   private fun notifyListeners(action: (DiscordAudioManagerListener) -> Unit) {
      val var2: java.util.Iterator = this.listeners.iterator();

      while (var2.hasNext()) {
         var1.invoke(var2.next());
      }
   }

   private fun registerAudioManagerReceivers() {
      if (!this.scoReceiverRegistered) {
         Log.i$default(Log.INSTANCE, "DiscordAudioManager", "Registering SCO Callbacks", null, 4, null);
         val var1: IntentFilter = new IntentFilter();
         var1.addAction("android.media.ACTION_SCO_AUDIO_STATE_UPDATED");
         androidx.core.content.a.k(this.context, this.audioManagerBroadcastReceiver, var1, 4);
         this.scoReceiverRegistered = true;
      }
   }

   private fun setActiveAudioDevice(deviceType: SimpleDeviceType) {
      switch (DiscordAudioManager.WhenMappings.$EnumSwitchMapping$0[var1.ordinal()]) {
         case 1:
            this.androidAudioManager.stopBluetoothSco();
            this.androidAudioManager.setBluetoothScoOn(false);
            this.androidAudioManager.setSpeakerphoneOn(true);
            break;
         case 2:
            this.androidAudioManager.stopBluetoothSco();
            this.androidAudioManager.setBluetoothScoOn(false);
            this.androidAudioManager.setSpeakerphoneOn(false);
            break;
         case 3:
            this.androidAudioManager.stopBluetoothSco();
            this.androidAudioManager.setBluetoothScoOn(false);
            this.androidAudioManager.setSpeakerphoneOn(false);
            break;
         case 4:
            this.scoRetryAttempts = 0;
            this.androidAudioManager.setSpeakerphoneOn(false);
            this.androidAudioManager.startBluetoothSco();
            break;
         case 5:
         case 6:
            return;
         default:
      }

      this.desiredDeviceType = var1;
      this.emitEffectiveDevice();
   }

   private fun setupAudioDeviceCallback(): AudioDeviceCallback {
      return new AudioDeviceCallback(this) {
         final DiscordAudioManager this$0;

         {
            this.this$0 = var1;
         }

         public void onAudioDevicesAdded(AudioDeviceInfo[] var1) {
            if (var1 != null && var1.length != 0) {
               val var6: DiscordAudioManager = this.this$0;
               val var7: java.util.List = DiscordAudioManager.access$getAudioDevices$p(this.this$0);
               val var4: ArrayList = new ArrayList();
               var var3: Int = var1.length;

               for (int var2 = 0; var2 < var3; var2++) {
                  val var5: AudioDeviceInfo = var1[var2];
                  if (var1[var2].isSink()) {
                     var4.add(var5);
                  }
               }

               DiscordAudioManager.access$setAudioDevices$p(var6, i.y0(var7, var4));
               DiscordAudioManager.access$notifyListeners(this.this$0, new Function1(this.this$0) {
                  final DiscordAudioManager this$0;

                  {
                     super(1);
                     this.this$0 = var1;
                  }

                  public final void invoke(DiscordAudioManagerListener var1) {
                     q.h(var1, "listener");
                     var1.onAudioDevicesUpdated(i.Q0(this.this$0.getAudioDevices()));
                  }
               });
               if (DiscordAudioManager.access$getDesiredDeviceType$p(this.this$0) === SimpleDeviceType.DEFAULT) {
                  var3 = var1.length;

                  for (int var8 = 0; var8 < var3; var8++) {
                     if (var1[var8].getType() == 7) {
                        DiscordAudioManager.access$getAndroidAudioManager$p(this.this$0).startBluetoothSco();
                        DiscordAudioManager.access$getAndroidAudioManager$p(this.this$0).setSpeakerphoneOn(false);
                        break;
                     }
                  }
               }

               DiscordAudioManager.access$emitEffectiveDevice(this.this$0);
            }
         }

         public void onAudioDevicesRemoved(AudioDeviceInfo[] var1) {
            if (var1 != null && var1.length != 0) {
               val var5: DiscordAudioManager = this.this$0;
               val var4: java.util.List = DiscordAudioManager.access$getAudioDevices$p(this.this$0);
               val var6: ArrayList = new ArrayList();
               val var3: Int = var1.length;

               for (int var2 = 0; var2 < var3; var2++) {
                  val var7: AudioDeviceInfo = var1[var2];
                  if (var1[var2].isSink()) {
                     var6.add(var7);
                  }
               }

               DiscordAudioManager.access$setAudioDevices$p(var5, i.u0(var4, i.U0(var6)));
               DiscordAudioManager.access$notifyListeners(this.this$0, new Function1(this.this$0) {
                  final DiscordAudioManager this$0;

                  {
                     super(1);
                     this.this$0 = var1;
                  }

                  public final void invoke(DiscordAudioManagerListener var1) {
                     q.h(var1, "listener");
                     var1.onAudioDevicesUpdated(i.Q0(this.this$0.getAudioDevices()));
                  }
               });
               val var9: SimpleDeviceType = DiscordAudioManager.access$getDesiredDeviceType$p(this.this$0);
               val var10: SimpleDeviceType = SimpleDeviceType.DEFAULT;
               if (var9 != SimpleDeviceType.DEFAULT
                  && !DiscordAudioManager.access$getSimpleDevices(this.this$0).contains(DiscordAudioManager.access$getDesiredDeviceType$p(this.this$0))) {
                  if (DiscordAudioManager.access$getDesiredDeviceType$p(this.this$0) === SimpleDeviceType.BLUETOOTH_HEADSET) {
                     DiscordAudioManager.access$getAndroidAudioManager$p(this.this$0).stopBluetoothSco();
                  }

                  DiscordAudioManager.access$setDesiredDeviceType$p(this.this$0, var10);
               }

               DiscordAudioManager.access$emitEffectiveDevice(this.this$0);
            }
         }
      };
   }

   private fun unRegisterAudioManagerReceivers() {
      Log.i$default(Log.INSTANCE, "DiscordAudioManager", "Un-Registering SCO Callbacks", null, 4, null);

      try {
         this.context.unregisterReceiver(this.audioManagerBroadcastReceiver);
      } catch (var2: IllegalArgumentException) {
      }

      this.scoReceiverRegistered = false;
   }

   public override fun addListener(listener: DiscordAudioManagerListener) {
      q.h(var1, "listener");
      this.listeners.add(var1);
   }

   public override fun getAudioDevices(): Set<AndroidAudioDevice> {
      val var2: java.util.Set = this.getSimpleDevices();
      val var1: ArrayList = new ArrayList(i.u(var2, 10));

      for (SimpleDeviceType var3 : var2) {
         var1.add(AndroidAudioDevice.Companion.fromSimpleDeviceType(var3));
      }

      return i.T0(var1);
   }

   public override fun getEffectiveAudioDevice(): AndroidAudioDevice {
      val var1: SimpleDeviceType = this.getActiveAudioDevice();
      val var2: SimpleDeviceType = this.desiredDeviceType;
      if (this.desiredDeviceType === SimpleDeviceType.DEFAULT) {
         return AndroidAudioDevice.Companion.fromSimpleDeviceType(var1);
      } else {
         return if (var1 === SimpleDeviceType.WIRED_HEADSET && this.desiredDeviceType === SimpleDeviceType.EARPIECE)
            AndroidAudioDevice.Companion.fromSimpleDeviceType(SimpleDeviceType.WIRED_HEADSET)
            else
            AndroidAudioDevice.Companion.fromSimpleDeviceType(this.desiredDeviceType);
      }
   }

   public override fun removeListener(listener: DiscordAudioManagerListener) {
      q.h(var1, "listener");
      this.listeners.remove(var1);
   }

   public fun scoStateToString(state: Int): String {
      val var2: java.lang.String;
      if (var1 != -1) {
         if (var1 != 0) {
            if (var1 != 1) {
               if (var1 != 2) {
                  var2 = "UNKNOWN";
               } else {
                  var2 = "SCO_AUDIO_STATE_CONNECTING";
               }
            } else {
               var2 = "SCO_AUDIO_STATE_CONNECTED";
            }
         } else {
            var2 = "SCO_AUDIO_STATE_DISCONNECTED";
         }
      } else {
         var2 = "SCO_AUDIO_STATE_ERROR";
      }

      return var2;
   }

   public override fun setActiveAudioDevice(device: AndroidAudioDevice) {
      q.h(var1, "device");
      this.setActiveAudioDevice(var1.getSimpleDeviceType());
   }

   public override fun setCommunicationModeOn(on: Boolean) {
      this.communicationModeOn = var1;
      this.scoRetryAttempts = 0;
      val var3: Log = Log.INSTANCE;
      val var2: StringBuilder = new StringBuilder();
      var2.append("setCommunicationModeOn: ");
      var2.append(var1);
      Log.i$default(var3, "DiscordAudioManager", var2.toString(), null, 4, null);
      if (var1) {
         val var4: Array<AudioDeviceInfo> = this.androidAudioManager.getDevices(2);
         q.e(var4);
         this.audioDevices = kotlin.collections.c.z0(var4);
         this.androidAudioManager.registerAudioDeviceCallback(this.audioDeviceCallback, null);
         this.androidAudioManager.setMode(3);
         this.registerAudioManagerReceivers();
         if (this.desiredDeviceType != SimpleDeviceType.DEFAULT) {
            this.setActiveAudioDevice(this.desiredDeviceType);
         } else {
            val var6: java.util.Set = this.getSimpleDevices();
            val var7: SimpleDeviceType = SimpleDeviceType.BLUETOOTH_HEADSET;
            if (var6.contains(SimpleDeviceType.BLUETOOTH_HEADSET)) {
               this.desiredDeviceType = var7;
               this.androidAudioManager.setSpeakerphoneOn(false);
               this.androidAudioManager.startBluetoothSco();
            } else if (this.getSimpleDevices().contains(SimpleDeviceType.WIRED_HEADSET)) {
               this.androidAudioManager.setSpeakerphoneOn(false);
            } else {
               this.androidAudioManager.setSpeakerphoneOn(true);
            }
         }
      } else {
         this.androidAudioManager.unregisterAudioDeviceCallback(this.audioDeviceCallback);
         this.androidAudioManager.setMode(0);
         this.unRegisterAudioManagerReceivers();
         this.androidAudioManager.stopBluetoothSco();
         this.androidAudioManager.setSpeakerphoneOn(false);
      }

      this.emitEffectiveDevice();
   }

   public override fun setSCORetryCount(count: Int) {
      this.scoRetryCount = var1;
   }

   public companion object {
      private final var instance: DiscordAudioManager?

      public fun getInstance(context: Context): DiscordAudioManager {
         q.h(var1, "context");
         if (DiscordAudioManager.access$getInstance$cp() == null) {
            DiscordAudioManager.access$setInstance$cp(new DiscordAudioManager(var1));
         }

         val var2: DiscordAudioManager = DiscordAudioManager.access$getInstance$cp();
         q.e(var2);
         return var2;
      }
   }
}
