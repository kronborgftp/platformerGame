package inputs;

import main.GamePanel;

import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

public class KeyboardInputs implements KeyListener {

    private GamePanel gamePanel;
    public KeyboardInputs(GamePanel gamepanel){
        this.gamePanel = gamepanel;
    }
    @Override
    public void keyTyped(KeyEvent e) {

    }

    @Override
    public void keyPressed(KeyEvent e) {

    }

    @Override
    public void keyReleased(KeyEvent e) {

        switch(e.getKeyCode()) {

            case KeyEvent.VK_W:
                gamePanel.changeYDelta(-5);
                break;
            case KeyEvent.VK_A:
                gamePanel.changeXDelta(-5);
                break;
            case KeyEvent.VK_S:
                gamePanel.changeYDelta(5);
                break;
            case KeyEvent.VK_D:
                gamePanel.changeXDelta(5);
                break;

        }
    }
}
