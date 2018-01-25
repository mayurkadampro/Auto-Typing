
import java.awt.AWTException;
import java.awt.Robot;
import java.io.IOException;
import java.awt.event.KeyEvent;

class Type {

    public static void main(String args[]) {

        try {
            String str;
            str = "That's it guys hope you enjoy this video and don't forget to like share and subscribe................";
            Robot rb = new Robot();
            Runtime run = Runtime.getRuntime();
            String str1 = "notepad.exe";
            run.exec(str1);
            rb.delay(5000);
            char ch[] = str.toCharArray();

            for (int i = 0; i < ch.length; i++) {
                if (ch[i] == 'a' || ch[i] == 'A') {
                    rb.keyPress(KeyEvent.VK_A);
                    rb.keyRelease(KeyEvent.VK_A);
                    rb.delay(50);
                }
                if (ch[i] == 'b' || ch[i] == 'B') {
                    rb.keyPress(KeyEvent.VK_B);
                    rb.keyRelease(KeyEvent.VK_B);
                    rb.delay(50);
                }
                if (ch[i] == 'c' || ch[i] == 'C') {
                    rb.keyPress(KeyEvent.VK_C);
                    rb.keyRelease(KeyEvent.VK_C);
                    rb.delay(50);
                }
                if (ch[i] == 'd' || ch[i] == 'D') {
                    rb.keyPress(KeyEvent.VK_D);
                    rb.keyRelease(KeyEvent.VK_D);
                    rb.delay(50);
                }
                if (ch[i] == 'e' || ch[i] == 'E') {
                    rb.keyPress(KeyEvent.VK_E);
                    rb.keyRelease(KeyEvent.VK_E);
                    rb.delay(50);
                }
                if (ch[i] == 'f' || ch[i] == 'F') {
                    rb.keyPress(KeyEvent.VK_F);
                    rb.keyRelease(KeyEvent.VK_F);
                    rb.delay(50);
                }
                if (ch[i] == 'g' || ch[i] == 'G') {
                    rb.keyPress(KeyEvent.VK_G);
                    rb.keyRelease(KeyEvent.VK_G);
                    rb.delay(50);
                }
                if (ch[i] == 'h' || ch[i] == 'H') {
                    rb.keyPress(KeyEvent.VK_H);
                    rb.keyRelease(KeyEvent.VK_H);
                    rb.delay(50);
                }
                if (ch[i] == 'i' || ch[i] == 'I') {
                    rb.keyPress(KeyEvent.VK_I);
                    rb.keyRelease(KeyEvent.VK_I);
                    rb.delay(50);
                }
                if (ch[i] == 'j' || ch[i] == 'J') {
                    rb.keyPress(KeyEvent.VK_J);
                    rb.keyRelease(KeyEvent.VK_J);
                    rb.delay(50);
                }
                if (ch[i] == 'k' || ch[i] == 'K') {
                    rb.keyPress(KeyEvent.VK_K);
                    rb.keyRelease(KeyEvent.VK_K);
                    rb.delay(50);
                }
                if (ch[i] == 'l' || ch[i] == 'L') {
                    rb.keyPress(KeyEvent.VK_L);
                    rb.keyRelease(KeyEvent.VK_L);
                    rb.delay(50);
                }
                if (ch[i] == 'm' || ch[i] == 'M') {
                    rb.keyPress(KeyEvent.VK_M);
                    rb.keyRelease(KeyEvent.VK_M);
                    rb.delay(50);
                }
                if (ch[i] == 'n' || ch[i] == 'N') {
                    rb.keyPress(KeyEvent.VK_N);
                    rb.keyRelease(KeyEvent.VK_N);
                    rb.delay(50);
                }
                if (ch[i] == 'o' || ch[i] == 'O') {
                    rb.keyPress(KeyEvent.VK_O);
                    rb.keyRelease(KeyEvent.VK_O);
                    rb.delay(50);
                }
                if (ch[i] == 'p' || ch[i] == 'P') {
                    rb.keyPress(KeyEvent.VK_P);
                    rb.keyRelease(KeyEvent.VK_P);
                    rb.delay(50);
                }
                if (ch[i] == 'q' || ch[i] == 'Q') {
                    rb.keyPress(KeyEvent.VK_Q);
                    rb.keyRelease(KeyEvent.VK_Q);
                    rb.delay(50);
                }
                if (ch[i] == 'r' || ch[i] == 'R') {
                    rb.keyPress(KeyEvent.VK_R);
                    rb.keyRelease(KeyEvent.VK_R);
                    rb.delay(50);
                }
                if (ch[i] == 's' || ch[i] == 'S') {
                    rb.keyPress(KeyEvent.VK_S);
                    rb.keyRelease(KeyEvent.VK_S);
                    rb.delay(50);
                }
                if (ch[i] == 't' || ch[i] == 'T') {
                    rb.keyPress(KeyEvent.VK_T);
                    rb.keyRelease(KeyEvent.VK_T);
                    rb.delay(50);
                }
                if (ch[i] == 'u' || ch[i] == 'U') {
                    rb.keyPress(KeyEvent.VK_U);
                    rb.keyRelease(KeyEvent.VK_U);
                    rb.delay(50);
                }
                if (ch[i] == 'v' || ch[i] == 'V') {
                    rb.keyPress(KeyEvent.VK_V);
                    rb.keyRelease(KeyEvent.VK_V);
                    rb.delay(50);
                }
                if (ch[i] == 'w' || ch[i] == 'W') {
                    rb.keyPress(KeyEvent.VK_W);
                    rb.keyRelease(KeyEvent.VK_W);
                    rb.delay(50);
                }
                if (ch[i] == 'x' || ch[i] == 'X') {
                    rb.keyPress(KeyEvent.VK_X);
                    rb.keyRelease(KeyEvent.VK_X);
                    rb.delay(50);
                }
                if (ch[i] == 'y' || ch[i] == 'Y') {
                    rb.keyPress(KeyEvent.VK_Y);
                    rb.keyRelease(KeyEvent.VK_Y);
                    rb.delay(50);
                }
                if (ch[i] == 'z' || ch[i] == 'Z') {
                    rb.keyPress(KeyEvent.VK_Z);
                    rb.keyRelease(KeyEvent.VK_Z);
                    rb.delay(50);
                }
                if (ch[i] == ' ') {
                    rb.keyPress(KeyEvent.VK_SPACE);
                    rb.keyRelease(KeyEvent.VK_SPACE);
                    rb.delay(50);
                }
                if (ch[i] == ':') {
                    rb.keyPress(KeyEvent.VK_COLON);
                    rb.keyRelease(KeyEvent.VK_COLON);
                    rb.delay(50);
                }
                if (ch[i] == ';') {
                    rb.keyPress(KeyEvent.VK_SEMICOLON);
                    rb.keyRelease(KeyEvent.VK_SEMICOLON);
                    rb.delay(50);
                }
                if (ch[i] == ';') {
                    rb.keyPress(KeyEvent.VK_SEMICOLON);
                    rb.keyRelease(KeyEvent.VK_SEMICOLON);
                    rb.delay(50);
                }
                if (ch[i] == '.') {
                    rb.keyPress(KeyEvent.VK_PERIOD);
                    rb.keyRelease(KeyEvent.VK_PERIOD);
                    rb.delay(50);
                }

            }
            rb.delay(3000);
            rb.keyPress(KeyEvent.VK_ALT);
            rb.keyPress(KeyEvent.VK_F4);
            rb.keyRelease(KeyEvent.VK_ALT);
            rb.keyRelease(KeyEvent.VK_F4);
            rb.keyPress(KeyEvent.VK_RIGHT);
            rb.keyRelease(KeyEvent.VK_RIGHT);
            rb.keyPress(KeyEvent.VK_ENTER);
            rb.keyRelease(KeyEvent.VK_ENTER);
        } catch (AWTException | IOException ex) {
        }

    }

}
