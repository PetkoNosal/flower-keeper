package sk.petko.flowerkeeper.frontend.manager;

import javax.swing.JFrame;
import javax.swing.UIManager;
import javax.swing.WindowConstants;
import sk.petko.flowerkeeper.frontend.swing.MainScreen;

public class FrontendManager {

    private static final String TITLE = "FlowerKeeper";
    private static final boolean UNDECORATED = false;

    public FrontendManager() throws Exception {
        UIManager.setLookAndFeel(UIManager.getSystemLookAndFeelClassName());
        final JFrame frame = new JFrame(TITLE);
        frame.setAlwaysOnTop(true);
        frame.setLocationRelativeTo(null);
        frame.setContentPane(new MainScreen().getScreen());
        frame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        frame.setUndecorated(UNDECORATED);
        frame.pack();
        frame.setVisible(true);
    }
}
