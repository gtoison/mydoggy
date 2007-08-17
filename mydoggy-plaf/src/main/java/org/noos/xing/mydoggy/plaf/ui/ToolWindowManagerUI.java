package org.noos.xing.mydoggy.plaf.ui;

import org.noos.xing.mydoggy.ToolWindowManager;

import javax.swing.plaf.ComponentUI;
import java.awt.*;

/**
 * @author Angelo De Caro (angelo.decaro@gmail.com)
 */
public interface ToolWindowManagerUI {

    public static String BAR_SPLIT_PANE = "BAR_SPLIT_PANE";
    public static String REPRESENTATIVE_ANCHOR_BUTTON_UI = "REPRESENTATIVE_ANCHOR_BUTTON_UI";
    public static String TOOL_WINDOW_TITLE_BAR_UI = "TOOL_WINDOW_TITLE_BAR_UI";
    public static String BAR_CONTENT_PANE = "BAR_CONTENT_PANE";
    public static String CORNER_CONTENT_PANE = "CORNER_CONTENT_PANE";

    public static String MY_DOGGY_MANAGER_PANEL = "MY_DOGGY_MANAGER_PANEL";
    public static String MY_DOGGY_MANAGER_MAIN_CONTAINER = "MY_DOGGY_MANAGER_MAIN_CONTAINER";

    public static String DESKTOP_CONTENT_PANE = "DESKTOP_CONTENT_PANE";


    Component createComponent(String key, ToolWindowManager manager, Object... args);

    ComponentUI createComponentUI(String key, ToolWindowManager manager, Object... args);

    void applyCustomization(String key, Component component, Object... args);

}
