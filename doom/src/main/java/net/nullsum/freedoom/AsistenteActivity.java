package net.nullsum.freedoom;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;

import com.github.paolorotolo.appintro.AppIntro;
import com.github.paolorotolo.appintro.AppIntroFragment;

public class AsistenteActivity extends AppIntro {

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        // ============================================
        // CARTEL 1 — Bienvenida
        // ============================================
        addSlide(AppIntroFragment.newInstance(
                "Bienvenido a HexaTouch",
                "Delta Touch es de pago.\n" +
                "Freedoom está viejo.\n" +
                "Y si no tienes PC ni dinero,\n" +
                "te quedas fuera.\n\n" +
                "HexaTouch nació para cambiar eso.\n" +
                "Es gratis. Es tuyo.\n" +
                "Y está hecho para que nadie\n" +
                "se quede sin jugar."
        ));

        // ============================================
        // CARTEL 2 — Tu historia
        // ============================================
        addSlide(AppIntroFragment.newInstance(
                "¿Cómo nació esto?",
                "De querer jugar Doom\n" +
                "y no poder.\n" +
                "De no tener PC,\n" +
                "ni dinero, ni idea.\n\n" +
                "Empezó desde un teléfono.\n" +
                "Sin ayuda, sin experiencia.\n" +
                "Solo con ganas de aprender\n" +
                "y de compartir."
        ));

        // ============================================
        // CARTEL 3 — WADs y mods
        // ============================================
        addSlide(AppIntroFragment.newInstance(
                "¿Qué son los WADs?",
                "Son los archivos\n" +
                "con los niveles, las armas\n" +
                "y los enemigos.\n\n" +
                "Los mods son cambios\n" +
                "que transforman el juego.\n\n" +
                "HexaTouch ya trae Freedoom.\n" +
                "Lo demás lo pones tú."
        ));

        // ============================================
        // CARTEL 4 — Dónde ponerlos
        // ============================================
        addSlide(AppIntroFragment.newInstance(
                "¿Dónde van?",
                "Los WADs aquí:\n" +
                "/sdcard/HexaTouch/wads/\n\n" +
                "Los mods aquí:\n" +
                "/sdcard/HexaTouch/mods/\n\n" +
                "HexaTouch los encuentra solo.\n" +
                "No tienes que hacer nada más."
        ));

        // ============================================
        // CARTEL 5 — Comunidad y links
        // ============================================
        addSlide(AppIntroFragment.newInstance(
                "Únete a la comunidad",
                "Discord → sugerencias, charla y links\n" +
                "Mods → moddb.com/games/doom-ii/mods\n" +
                "YouTube → gameplays y progreso\n\n" +
                "WADs gratis: Freedoom, Chex, HACX\n" +
                "WADs de pago: Steam, GOG"
        ));

        // ============================================
        // CARTEL 6 — Tips
        // ============================================
        addSlide(AppIntroFragment.newInstance(
                "Tips rápidos",
                ".wad → completo\n" +
                ".pwad → parcial\n" +
                ".pk3 → mod moderno\n\n" +
                "Si tu teléfono es viejo,\n" +
                "usa LZDoom.\n\n" +
                "Reporta bugs en Discord.\n" +
                "Y los WADs de pago, se compran."
        ));

        // ============================================
        // Configuración visual — ROJO Y NEGRO
        // ============================================
        setBarColor(getResources().getColor(android.R.color.black));
        setSeparatorColor(getResources().getColor(android.R.color.holo_red_dark));
        setIndicatorColor(
                getResources().getColor(android.R.color.holo_red_light),
                getResources().getColor(android.R.color.darker_gray)
        );
        setColorDoneText(getResources().getColor(android.R.color.white));
        setColorSkipButton(getResources().getColor(android.R.color.white));
        setNextArrowColor(getResources().getColor(android.R.color.holo_red_light));

        // Botones
        showSkipButton(true);
        setProgressButtonEnabled(true);
    }

    @Override
    public void onDonePressed(Fragment currentFragment) {
        super.onDonePressed(currentFragment);
        finish();
    }

    @Override
    public void onSkipPressed(Fragment currentFragment) {
        super.onSkipPressed(currentFragment);
        finish();
    }
}