package com.composite;

import java.util.ArrayList;

public class SubMenu extends Menu {

    private ArrayList<Menu> menu;

    public SubMenu() {
        menu = new ArrayList<>();
    }

    public void removeChild(Menu child) {
        menu.remove(child);
    }

    public void addChild(Menu child) {
        menu.add(child);
    }

    @Override
    public void showOptions() {
        System.out.println(label);
        for (Menu menu : menu) {
            menu.showOptions();
        }
    }
}
