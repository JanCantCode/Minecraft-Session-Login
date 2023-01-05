package tk.jandev.minecraftsessionlogin.client.sessionLogin;

import com.mojang.authlib.GameProfile;
import com.mojang.util.UUIDTypeAdapter;
import net.fabricmc.fabric.api.client.command.v2.ClientCommandManager;
import net.fabricmc.fabric.api.client.command.v2.ClientCommandRegistrationCallback;
import net.minecraft.client.MinecraftClient;
import net.minecraft.client.util.Session;
import org.jetbrains.annotations.Nullable;
import tk.jandev.minecraftsessionlogin.client.sessionLogin.gui.SessionInputGui;

import java.util.UUID;

public class SetSession {

    public static String username = "Black_2";
    public static String accessToken = "eyJlbmMiOiJBMTI4Q0JDK0hTMjU2IiwiYWxnIjoiUlNBLU9BRVAiLCJjdHkiOiJKV1QiLCJ6aXAiOiJERUYiLCJ4NXQiOiIxZlVBejExYmtpWklFaE5KSVZnSDFTdTVzX2cifQ.eBpo5aitxVADQzUxDuiu8SQGioFsN5hgGVMA53ksPysDo3Ns48mqBkSK_SG799lX4VSUZpPA5pyobxiQpqjugOjDMwFgguN24DqDYUlU_6JkQj36DLVgzcCb5w4uU4zGKCPI50LgsqOt1NDS860VLyi-qGHGa0julzsFJOREwAI.pUQi1QqvFhtMsbt4t6Ci5A.cGUxGQMgTglYHiGMUIMz6OLJUfaQOMBnu_KFQ2Azi40Llvw6AD3okg35NFXFWO4qXb5OXJyjFgOynFHeysyQ_KeorJk-qRs4Afkn3JH9US4DWPU7zYJTkGzeFHv5z3r8oEuv4yd91AJRRZMU-fsOV_k6nOKUCcYa5m16tDceJdbhxX08pN01v98MSUv8QwLDZ4FY79mbLkEWn2vdkaBZE3oD7hIv4-FtffDZKjnFaen3J0LEbgUYU3FbZwsOgX7J14bCfQq59ZzVs1xiW_3P-LgVnaqfL70OI9vfGpC0FDHRCamPRn7i-gp9TA30y2kOyP7N-wiCJ-PW3LBVXABWz_QhC3UYXgIvAtFTmpuOpXqPczQtw3mhvm1NSjuJeIw_y-VgqZbEmAfgmD23QQu3dkw483iXuFxiWRaaTvopLSn68h9qbck88SSnpcuFH1fzp2NvhWcIlfmd66pq5S1A_AI9CW3h2OAYiSI5XYrTLu33fi9wa4kUU9scOltQEq67fTRCjAstvLgwSqdyU2JBDV-NYakRuDlyHT9AXYcQFG-3X47-IZmd2CGM7xB3XeozQufuyBm6tvxn80Zlsbc5An9Ulo46wCYiImxMyHpU8D24yxd1yiBrmnoBl_LVeJnOjw4tlliqyUtxBNUl4LGTuYMknCTlGz1zz0q2zZMHwUrQ3xBLHTm57lyjGsMMf8ourAclFXdjFSFmB9agzlNOMXKWLPG3Cn-htJj22DMhqkXPkNkkRE5tSC6caIl4Moj7PTm5sh1yoiDhlikPa5puW03XU13EE7AK67U_otoPUVDNPfD6BULwWEYwncAhNkdONXOI4Ft33e-E43obgbz8_4ffmeiB5UCqFaMYAOTsFcS7WbFm_gsCG9oAvuc33fGcfYfT_eGaELWUOVeFhXDQ_QPqnXkPvRYo256KNrfRWGZfG8dihXrYsPjOg2129-wm1nU8nI2rjSRhXQVzAj3Gka5fjWumPHV7rbYGtRgz_7_UOPPtng57ZT5Fsb_WktXTqNof8Nk6gZOvTQUqUmBE54gT_k_sra77coxyqntjTkQkYGYMCA38tJmffDEWuUOyeE_ZDNAWKQ57AcFfrjuixOZSaKN_Trb_qj-7NDS5W8S4g7CEtfeEtv6U5XlorqVfVAENQW8mTdUQtQACH5-rOwKgk9OmK_pPViQhCoClJxtJKssLzxp5iCuWiaCJwo_nyPyWvYfEJaJKov7YAcJpj1whpq5djlaEow6C-S9qzdHNznUYxHOWOCB-X9rIq4ITLwLnLho8V1Inkkuw3rkSx9CRqyoRi9Bd1BPe-obQ8bzCV9XO2UG_rDvuZmm6q9YoTvBkA_lYQYt2jaHPn9mD7IZf2GRiayPsXO80_m16OuP2NYR1IyEV2qD1BShebfERlNsMPX1pve3H-r6sgHmyIYWv8uR8qWD3_NXbWVPBmPzsjfvmZVJ4gRnnzQtQshsksWxiclsjT3HcGQ8JwQk4AhJFz08E2fWeUKVSGbGD0_LuVMjhZPcn6W5v1m888wTSHv_6RMkJrk3yk_frQM9d8zOtYqU1_IvJkPNcdEZsHHg.FKX6FsaLkzuWWc7jUv43kP8EsuEfRzkrGtjyKaK7gAs";

    public static String UUID = "e49f9f72-8494-4760-8017-b21f880e2361";

    public static String sessionid = "token:"+accessToken+":"+UUID;

    public static boolean originalSession = true;

    public static MinecraftClient mc = MinecraftClient.getInstance();


    public static void registerSessionCommand() {
        ClientCommandRegistrationCallback.EVENT.register((dispatcher, registryAccess) -> dispatcher.register(ClientCommandManager.literal("session").executes(context -> {
            mc.send(() -> mc.setScreen(new SessionInputGui()));
            return 1;
        })));

    }




    @Nullable
    public static java.util.UUID getUuidOrNull() {
        try {
            return UUIDTypeAdapter.fromString(UUID);
        } catch (IllegalArgumentException var2) {
            return null;
        }
    }


    public static GameProfile getGameProfile() {
        return new GameProfile(getUuidOrNull(), username);
    }



}
