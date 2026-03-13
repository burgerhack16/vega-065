package ru.govno.client.utils;

import java.util.ArrayList;

// вега я возбудился от этого класса
// клаунч.проверкахвида
// и короче если юзер не угодил мы ему модули блокаем - #lockMod-
// ВЕГА ЭТО РУ ЭЗОТЕРИК ЕБА!!!

public class CLaunch {
    private int i;
    private boolean bn;
    private boolean bnlt;
    private boolean f;
    private boolean d;
    private boolean ia;
    private boolean na;
    private boolean noreq;
    private final ArrayList<String> nms = new ArrayList();

    public int ud() {
        return this.i;
    }

    public boolean isBN() {
        return this.bn;
    }

    public boolean isBNLT() {
        return this.bnlt;
    }

    public boolean delCL() {
        return this.d || this.isBNLT();
    }

    public boolean isFreak() {
        return this.f;
    }

    public ArrayList<String> getNMS() {
        return this.nms;
    }

    private CLaunch() {
    }

    public static CLaunch hook() {
        return new CLaunch();
    }

    public static String cC(String m) {
        return m;
    }
}
