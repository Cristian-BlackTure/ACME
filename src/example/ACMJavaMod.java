package example;

import example.content.*;
import arc.Events;
import mindustry.game.EventType.FileTreeInitEvent;
import mindustry.mod.Mod;

public class ACMModLoader extends Mod {
	public ACMModLoader() {
		Events.on(FileTreeInitEvent.class, e -> Sfx.load());

	@Override
	public void loadContent() {
           ACMBlock.load();
	}
}
