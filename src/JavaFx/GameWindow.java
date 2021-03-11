package JavaFx;

import javax.swing.*;
import java.awt.*;

public class GameWindow extends JFrame {

    private static final ImageIcon def = new ImageIcon("/resources/default.png");
    private static final ImageIcon o = new ImageIcon("/resources/o.png");
    private static final ImageIcon x = new ImageIcon("/resources/cross.png");

    private final JButton[][] map;

    public GameWindow() throws HeadlessException {
        setSize(360, 360);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        GridLayout layout = new GridLayout(3,3);
        JPanel panel = new JPanel(layout);
        map = new JButton[3][3];

        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                JButton button = new JButton();
                button.setIcon(def);
                button.addActionListener(a -> {
                     button.setIcon(x);
                    int button_X_Pos = button.getLocation().x;
                    int button_Y_Pos = button.getLocation().y;
                    if(checkVictory(button_X_Pos, button_Y_Pos, x)) {
                        showWinnerDialog("Вы победили");
                    } else if(movePc()) {
                        showWinnerDialog("Вы проиграли");
                    } else if(checkDraw()) {
                        showWinnerDialog("Ничья");
                    }
                });
                panel.add(button);
                map[i][j] = button;
            }
        }
        add(panel);
        setResizable(false);
        setVisible(true);
    }

    private boolean checkDraw() {
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                if(map[i][j].getIcon().equals(def)) {
                    return false;
                }
            }
        }
        return true;
    }

    private boolean checkVictory(int xCoord, int yCoord, ImageIcon icon) {
        boolean winner = true;


        if(map[0][0].getIcon().equals(map[1][1].getIcon())
                && map[0][0].getIcon().equals(map[2][2].getIcon())
                && map[0][0].getIcon().equals(icon)) {
            return winner;
        }


        //checking side diagonal
            if(map[0][2].getIcon().equals(map[1][1].getIcon())
                    && map[2][0].getIcon().equals(map[1][1].getIcon())
                    && map[0][2].getIcon().equals(icon)) {
                return winner;
            }


        //checking rows & cols
        for (int i = 0; i < 3; i++) {
            if (!map[i][yCoord].getIcon().equals(icon)) {
                winner = false;
                break;
            }
        }

        if(winner) {
            return winner;
        }

        winner = true;


        for (int j = 0; j < 3; j++) {
            if (!map[xCoord][j].getIcon().equals(icon)) {
                winner = false;
                break;
            }
        }

        if(winner) {
            return winner;
        }


        return winner;
    }


    private void showWinnerDialog(String result) {
        new WinnerDialog(this, result);
    }

    private boolean movePc() {
        int tempX = 0;
        int tempY = 0;
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                if (map[i][j].getIcon().equals(def)) {
                    map[i][j].setIcon(o);
                    tempX = i;
                    tempY = j;
                    break;
                }
            }
            break;
        }
        if (checkVictory(tempX, tempY, o)) {
            return true;
        } else {
            return false;
        }
    }

    public static void main(String[] args) {
        new GameWindow();
    }
}