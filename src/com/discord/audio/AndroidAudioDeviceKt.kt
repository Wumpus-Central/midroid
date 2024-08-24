package com.discord.audio

public final var audioDeviceTypeToSimpleMapping: MutableMap<Int, SimpleDeviceType>
   internal set

public fun audioDeviceInfoToString(type: Int): String {
   var var1: java.lang.String;
   switch (var0) {
      case 0:
         var1 = "TYPE_UNKNOWN";
         break;
      case 1:
         var1 = "TYPE_BUILTIN_EARPIECE";
         break;
      case 2:
         var1 = "TYPE_BUILTIN_SPEAKER";
         break;
      case 3:
         var1 = "TYPE_WIRED_HEADSET";
         break;
      case 4:
         var1 = "TYPE_WIRED_HEADPHONES";
         break;
      case 5:
         var1 = "TYPE_LINE_ANALOG";
         break;
      case 6:
         var1 = "TYPE_LINE_DIGITAL";
         break;
      case 7:
         var1 = "TYPE_BLUETOOTH_SCO";
         break;
      case 8:
         var1 = "TYPE_BLUETOOTH_A2DP";
         break;
      case 9:
         var1 = "TYPE_HDMI";
         break;
      case 10:
         var1 = "TYPE_HDMI_ARC";
         break;
      case 11:
         var1 = "TYPE_USB_DEVICE";
         break;
      case 12:
         var1 = "TYPE_USB_ACCESSORY";
         break;
      case 13:
         var1 = "TYPE_DOCK";
         break;
      case 14:
         var1 = "TYPE_FM";
         break;
      case 15:
         var1 = "TYPE_BUILTIN_MIC";
         break;
      case 16:
         var1 = "TYPE_FM_TUNER";
         break;
      case 17:
         var1 = "TYPE_TV_TUNER";
         break;
      case 18:
         var1 = "TYPE_TELEPHONY";
         break;
      case 19:
         var1 = "TYPE_AUX_LINE";
         break;
      case 20:
         var1 = "TYPE_IP";
         break;
      case 21:
         var1 = "TYPE_BUS";
         break;
      case 22:
         var1 = "TYPE_USB_HEADSET";
         break;
      case 23:
         var1 = "TYPE_HEARING_AID";
         break;
      case 24:
         var1 = "TYPE_BUILTIN_SPEAKER_SAFE";
         break;
      case 25:
         var1 = "TYPE_REMOTE_SUBMIX";
         break;
      case 26:
         var1 = "TYPE_BLE_HEADSET";
         break;
      case 27:
         var1 = "TYPE_BLE_SPEAKER";
         break;
      case 28:
      default:
         var1 = "";
         break;
      case 29:
         var1 = "TYPE_HDMI_EARC";
         break;
      case 30:
         var1 = "TYPE_BLE_BROADCAST";
         break;
      case 31:
         var1 = "TYPE_DOCK_ANALOG";
   }

   return var1;
}
