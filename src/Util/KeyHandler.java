package Util;

import javax.swing.*;

public interface KeyHandler {
    void onKeyPress(KeyStroke e);
    void onKeyPress(Character e);
}