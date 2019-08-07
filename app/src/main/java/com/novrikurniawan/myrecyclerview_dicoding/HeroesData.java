package com.novrikurniawan.myrecyclerview_dicoding;

import java.util.ArrayList;

public class HeroesData {

    public static String[][] data = new String[][]{
            {"Belajar Android Jetpack Pro", "Google ATP", "https://www.dicoding.com/images/original/academy/belajar_android_jetpack_pro_logo_020619220133.jpg","Rp 1.100.000 (1100Pts)"},
            {"Memulai Pemrograman Dengan Python", "Dicoding Indonesia", "https://www.dicoding.com/images/original/academy/memulai_pemrograman_dengan_python_logo_090719134021.jpg","Gratis"},
            {"Memulai Pemrograman Dengan Java", "Dicoding Indonesia", "https://www.dicoding.com/images/original/academy/java_fundamental_logo_080119141920.jpg","Gratis"},
            {"Belajar Dasar Pemrograman Web", "CodePolitan", "https://www.dicoding.com/images/original/academy/web_fundamental_logo_030519090933.jpg","Gratis"},
            {"Belajar Membuat Game dengan Construct 2", "Dicoding Indonesia", "https://www.dicoding.com/images/original/academy/belajar_membuat_game_dengan_construct_2_logo_070119141021.jpg","Gratis"},
            {"Source Code Management Untuk Pemula", "Angga Pratama", "https://www.dicoding.com/images/original/academy/belajar_version_control_logo_150419144733.jpg","Gratis"},
            {"Belajar Membuat Aplikasi Kognitif", "Dicoding Indonesia", "https://www.dicoding.com/images/original/academy/belajar_membuat_aplikasi_kognitif_logo_070119141352.jpg","Gratis"},
            {"Memulai Pemrograman Dengan C", "Dicoding Indonesia", "https://www.dicoding.com/images/original/academy/memulai_pemrograman_dengan_c_logo_090719134617.jpg","Gratis"},
            {"Memulai Pemrograman Dengan Kotlin", "Dicoding Indonesia", "https://www.dicoding.com/images/original/academy/kotlin_fundamental_logo_010219112628.jpg","Gratis"},
            {"Belajar Membuat Aplikasi Android Untuk Pemula", "Google ATP", "https://www.dicoding.com/images/original/academy/belajar_membuat_aplikasi_android_untuk_pemula_logo_070119140911.jpg","Gratis"},
            {"Belajar Membuat Game Untuk Pemula", "Asosiasi Game Indonesia", "https://www.dicoding.com/images/original/academy/belajar_membuat_game_untuk_pemula_logo_070119140848.jpg","Gratis"},
            {"Menjadi Android Developer Expert", "Google ATP", "https://www.dicoding.com/images/original/academy/menjadi_android_developer_expert_logo_070119140352.jpg","Rp 2.200.000 (2200Pts)"}

    };

    public static ArrayList<Hero> getListData(){
        ArrayList<Hero> list = new ArrayList<>();
        for (String[] aData : data){
            Hero hero = new Hero();
            hero.setName(aData[0]);
            hero.setFrom(aData[1]);
            hero.setPhoto(aData[2]);
            hero.setHarga(aData[3]);

            list.add(hero);
        }
        return list;
    }

}
