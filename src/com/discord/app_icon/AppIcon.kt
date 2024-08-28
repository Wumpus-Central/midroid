package com.discord.app_icon

import kotlin.enums.EnumEntries
import sj.a

public enum class AppIcon(id: String, aliasSuffix: String) {
   ANGRY("AngryIcon", "MainAngry"),
   BEANIE("BeanieIcon", "MainBeanie"),
   BLURPLE_TWILIGHT("BlurpleTwilightIcon", "MainBlurpleTwilight"),
   BLUSH("BlushIcon", "MainBlush"),
   BRAND_DARK("BrandDarkIcon", "MainBrandDark"),
   BRAND_INVERTED("BrandInvertedIcon", "MainBrandInverted"),
   CAMO("CamoIcon", "MainCamo"),
   CHERRY_BLOSSOM("CherryBlossomIcon", "MainCherryBlossom"),
   CIRCUIT("CircuitIcon", "MainCircuit"),
   COLOR_WAVE("ColorWaveIcon", "MainColorWave"),
   CONTROLLER("ControllerIcon", "MainController"),
   DEFAULT("AppIcon", "MainDefault"),
   GALAXY("GalaxyIcon", "MainGalaxy"),
   GAMING("GamingIcon", "MainGaming"),
   HOLO_WAVES("HoloWavesIcon", "MainHoloWaves"),
   IN_RAINBOWS("InRainbowsIcon", "MainInRainbows"),
   MANGA("MangaIcon", "MainManga"),
   MATTE_DARK("MatteDarkIcon", "MainMatteDark"),
   MATTE_LIGHT("MatteLightIcon", "MainMatteLight"),
   MIDNIGHT_PRISM("MidnightPrismIcon", "MainMidnightPrism"),
   MUSHROOM("MushroomIcon", "MainMushroom"),
   PASTEL("PastelIcon", "MainPastel"),
   PIRATE("PirateIcon", "MainPirate"),
   SUNSET("SunsetIcon", "MainSunset"),
   Y2K("Y2KIcon", "MainY2K")

   public final val alias: String
      public final get() {
         val var2: java.lang.String = this.aliasSuffix;
         val var1: StringBuilder = new StringBuilder();
         var1.append("com.discord.main.");
         var1.append(var2);
         return var1.toString();
      }


   private final val aliasSuffix: String
   public final val id: String
   @JvmStatic
   private EnumEntries $ENTRIES;
   @JvmStatic
   private AppIcon[] $VALUES;

   @JvmStatic
   fun {
      val var0: Array<AppIcon> = $values();
      $VALUES = var0;
      $ENTRIES = a.a(var0);
   }

   init {
      this.id = var3;
      this.aliasSuffix = var4;
   }

   @JvmStatic
   fun getEntries(): EnumEntries {
      return $ENTRIES;
   }
}
