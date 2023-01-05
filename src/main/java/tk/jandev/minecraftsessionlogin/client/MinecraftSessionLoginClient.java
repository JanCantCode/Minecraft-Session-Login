package tk.jandev.minecraftsessionlogin.client;

import net.fabricmc.api.ClientModInitializer;
import net.fabricmc.api.EnvType;
import net.fabricmc.api.Environment;
import tk.jandev.minecraftsessionlogin.client.sessionLogin.SetSession;

@Environment(EnvType.CLIENT)
public class MinecraftSessionLoginClient implements ClientModInitializer {
    @Override
    public void onInitializeClient() {

        SetSession sessionSetter = new SetSession();
        SetSession.registerSessionCommand();
    }
}
