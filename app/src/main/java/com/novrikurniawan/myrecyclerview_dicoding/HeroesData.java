package com.novrikurniawan.myrecyclerview_dicoding;

import java.util.ArrayList;

public class HeroesData {

    public static String[][] data = new String[][]{
            {"Belajar Android Jetpack Pro", "Google ATP", "https://www.dicoding.com/images/original/academy/belajar_android_jetpack_pro_logo_020619220133.jpg","Rp 1.100.000 (1100Pts)", "Android Jetpack terinspirasi oleh Support Library, seperangkat komponen untuk memudahkan pemanfaatan fitur Android terbaru sembari tetap menjaga kompatibilitas dengan versi-versi sebelumnya. Android Jetpack saat ini digunakan oleh 99% aplikasi di Play Store."},
            {"Memulai Pemrograman Dengan Python", "Dicoding Indonesia", "https://www.dicoding.com/images/original/academy/memulai_pemrograman_dengan_python_logo_090719134021.jpg","Gratis","Python adalah bahasa pemrograman interpretatif yang dapat digunakan pada berbagai platform dengan filosofi perancangan yang berfokus pada tingkat keterbacaan kode. Python adalah salah satu bahasa populer yang saat ini banyak digunakan dalam kaitan dengan Data Science dan Machine Learning. Keunggulan Python yang bersifat interpretatif juga banyak digunakan untuk prototyping atau scripting dalam pengelolaan infrastruktur."},
            {"Memulai Pemrograman Dengan Java", "Dicoding Indonesia", "https://www.dicoding.com/images/original/academy/java_fundamental_logo_080119141920.jpg","Gratis","Java adalah sebuah bahasa yang diciptakan oleh James Gosling di tahun 1990-an. Saat itu, paradigma Write Once, Run Anywhere (WORA) belum populer. Bahasa-bahasa yang ada perlu ditulis sangat spesifik berdasarkan platformnya. Maka muncullah Java sebagai bahasa yang dapat dijalankan di berbagai platform tanpa perlu melakukan re-kompilasi. Java membawa pendekatan konkurensi, berbasis kelas, dan tentunya berorientasi objek. Program yang dibuat di atas bahasa Java akan dijalankan pada Java Runtime Environment (JRE), sebuah lingkungan virtual yang dibuat sehingga mampu mengakomodasi paradigma WORA."},
            {"Belajar Dasar Pemrograman Web", "CodePolitan", "https://www.dicoding.com/images/original/academy/web_fundamental_logo_030519090933.jpg","Gratis","Website di era ini sudah menjadi kebutuhan utama yang tidak bisa dilupakan. Beberapa sektor seperti pemerintahan, bisnis, atau edukasi menggunakan website sebagai alat untuk promosi, management, tukar informasi, dan lainnya. Bahkan saat ini tidak jarang satu orang memiliki websitenya sendiri."},
            {"Belajar Membuat Game dengan Construct 2", "Dicoding Indonesia", "https://www.dicoding.com/images/original/academy/belajar_membuat_game_dengan_construct_2_logo_070119141021.jpg","Gratis","Kelas ini telah didesain khusus untuk game developer pemula. Software yang digunakan dalam kelas ini adalah Construct 2 Free Edition yang dapat diunduh secara bebas atau gratis melalui halaman resmi Construct 2."},
            {"Source Code Management Untuk Pemula", "Angga Pratama", "https://www.dicoding.com/images/original/academy/belajar_version_control_logo_150419144733.jpg","Gratis","Di dalam dunia development aplikasi, source code management (version control) adalah salah satu tools yang bisa digunakan untuk berkolaborasi antara developer. Tools inilah yang digunakan oleh tim kecil beranggotakan 1-5, bahkan sampai puluhan atau ratusan orang. Ya, perusahaan-perusahaan besar di dunia sudah pasti menggunakan version control untuk mengelola produk aplikasinya."},
            {"Belajar Membuat Aplikasi Kognitif", "Dicoding Indonesia", "https://www.dicoding.com/images/original/academy/belajar_membuat_aplikasi_kognitif_logo_070119141352.jpg","Gratis","Kelas ini didesain untuk developer yang ingin mempelajari aplikasi kognitif dengan menggunakan teknologi IBM Watson. Tool lain yang digunakan adalah CloudFoundry (CF) CLI, Postman, dan Android Studio (opsional). "},
            {"Memulai Pemrograman Dengan C", "Dicoding Indonesia", "https://www.dicoding.com/images/original/academy/memulai_pemrograman_dengan_c_logo_090719134617.jpg","Gratis","Bahasa C adalah bahasa imperative/procedural yang general purpose. Ia didesain untuk dikompile secara sederhana, untuk dapat mendukung low-level akses ke memory, sebagai pendukung bahasa yang dapat digunakan dalam instruksi mesin, dan untuk membutuhkan runtime support yang minimalis. Meskipun didesain secara minimal, C bisa digunakan sebagai bahasa yang multi-platform."},
            {"Memulai Pemrograman Dengan Kotlin", "Dicoding Indonesia", "https://www.dicoding.com/images/original/academy/kotlin_fundamental_logo_010219112628.jpg","Gratis","Pada tahun 2010 lalu JetBrains memulai sebuah proyek open-sources baru. Proyek ini merupakan sebuah bahasa pemrograman statically typed yang menargetkan JVM, Android, JavaScript dan Native. Kotlin -nama sebuah pulau di Rusia- menjadi inspirasi oleh tim pengembang untuk ditetapkan sebagai nama bahasa pemrograman tersebut. Kotlin pertama kali dirilis pada bulan Februari 2016 dengan versi 1.0. Saat ini sudah mencapai versi 1.3.30 per rilis 12 April 2019 lalu. "},
            {"Belajar Membuat Aplikasi Android Untuk Pemula", "Google ATP", "https://www.dicoding.com/images/original/academy/belajar_membuat_aplikasi_android_untuk_pemula_logo_070119140911.jpg","Gratis","Android semakin digandrungi. Per Maret 2018 ada lebih dari 3,6 juta aplikasi Android di Google Play Store (Statista). Di indonesia sendiri pada bulan Maret 2019 sebanyak 93,5% konsumen memilih platform Android untuk sistem operasi peranti mobile mereka (Statcounter). Ini menandakan bahwa kebutuhan akan Android developer, semakin meningkat. Tak heran, profesi Android developer merupakan 1 dari 5 profesi yang paling diincar perusahaan (LinkedIn Emerging Jobs Report 2019). "},
            {"Belajar Membuat Game Untuk Pemula", "Asosiasi Game Indonesia", "https://www.dicoding.com/images/original/academy/belajar_membuat_game_untuk_pemula_logo_070119140848.jpg","Gratis","Profesi game dev di Indonesia, sangat menjanjikan. Potensi industri Game nasional sangat pesat. Tahun 2017 nilainya tercatat Rp 11 triliun dan tumbuh 25-30 % per tahun (Kompas). Di kelas ini Anda akan mempelajari kemampuan-kemampuan dasar sebagai game developer."},
            {"Menjadi Android Developer Expert", "Google ATP", "https://www.dicoding.com/images/original/academy/menjadi_android_developer_expert_logo_070119140352.jpg","Rp 2.200.000 (2200Pts)","Android semakin digandrungi. Per Maret 2018 ada lebih dari 3,6 juta aplikasi Android di Google Play Store (Statista). Di indonesia sendiri pada bulan Maret 2019 sebanyak 93,5% konsumen memilih platform Android untuk sistem operasi peranti mobile mereka (Statcounter). Ini menandakan bahwa kebutuhan akan Android developer, semakin meningkat. Tak heran, profesi Android developer merupakan 1 dari 5 profesi yang paling diincar perusahaan (LinkedIn Emerging Jobs Report 2019). "}

    };

    public static ArrayList<Hero> getListData(){
        ArrayList<Hero> list = new ArrayList<>();
        for (String[] aData : data){
            Hero hero = new Hero();
            hero.setName(aData[0]);
            hero.setFrom(aData[1]);
            hero.setPhoto(aData[2]);
            hero.setHarga(aData[3]);
            hero.setDeskripsi(aData[4]);

            list.add(hero);
        }
        return list;
    }

}
