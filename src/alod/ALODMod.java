package alod;

import arc.*;
import arc.util.Log;
import mindustry.Vars;
import mindustry.game.EventType.ClientLoadEvent;
import mindustry.mod.Mod;

@SuppressWarnings("InstantiationOfUtilityClass")
public class ALODMod extends Mod{

    public ALODMod(){
        new DamageDisplay();
    }
}
