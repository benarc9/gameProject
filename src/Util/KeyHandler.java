package Util;

import java.awt.event.KeyEvent;

public interface KeyHandler {
    void onKeyPress(KeyEvent event);
    void onKeyReleased(KeyEvent e);
    void onKeyTyped(KeyEvent event);
}