package example;

import example.content.*;
import arc.Events;
import mindustry.game.EventType.FileTreeInitEvent;
import mindustry.mod.Mod;

public class ACMModLoader extends Mod {
	public ACMModLoader() {
	@Override
	public void loadContent() {
           ACMBlock.load();
}
	}
}
