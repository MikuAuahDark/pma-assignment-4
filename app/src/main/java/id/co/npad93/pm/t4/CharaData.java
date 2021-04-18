package id.co.npad93.pm.t4;

import java.util.HashMap;

public class CharaData {
    public String getName() {
        return name;
    }

    public String getNation() {
        return nation;
    }

    public String getBirthday() {
        return birthday;
    }

    public String getAffiliation() {
        return affiliation;
    }

    public String getDescription() {
        return description;
    }

    public int getImage() {
        return image;
    }

    public static int count() {
        initialize();
        return all.length;
    }

    public static CharaData[] getAll() {
        initialize();
        return all.clone();
    }

    public static CharaData get(String name) {
        initialize();
        return byName.get(name);
    }

    public static CharaData get(int index) {
        initialize();
        return all[index];
    }

    private CharaData(String n, String nat, String b, String a, String d, int i) {
        name = n;
        nation = nat;
        birthday = b;
        affiliation = a;
        description = d;
        image = i;
    }

    private final String name, nation, birthday, affiliation, description;
    private final int image;

    private static HashMap<String, CharaData> byName;
    private static CharaData[] all;

    private static void initialize() {
        if (all == null) {
            all = new CharaData[]{
                new CharaData(
                    "Amber",
                    "Mondstadt",
                    "10 Agustus",
                    "Knights of Favonius",
                    "Gadis periang yang selalu energik dan penuh semangat. Amber adalah Outrider terbaik (dan juga satu satunya) di Knights of Favonius.",
                    R.drawable.amber_ktp
                ),
                new CharaData(
                    "Barbara",
                    "Mondstadt",
                    "5 Juli",
                    "Church of Favonius",
                    "Setiap penduduk Mondstadt mendambakan Barbara. Tetapi kata \"idola\" yang melekat padanya, dia hanya melihatnya dari majalah.",
                    R.drawable.barbara_ktp
                ),
                new CharaData(
                    "Ganyu",
                    "Liyue",
                    "2 Desember",
                    "Yuehai Pavilion",
                    "Seorang sekretaris di Yuehai Pavillion. Darah hewan pusaka Qilin mengalir di dalam tubuhnya.",
                    R.drawable.ganyu_ktp
                ),
                new CharaData(
                    "Hu Tao",
                    "Liyue",
                    "15 Juli",
                    "Wangsheng Funeral Parlor",
                    "Master ke-77 Wangsheng Funeral Parlor. Dia mengambil alih bisnis ini di umur yang cukup muda.",
                    R.drawable.hu_tao_ktp
                ),
                new CharaData(
                    "Lumine",
                    "Tidak Diketahui",
                    "Tidak Diketahui", // Hardcode: set to current date
                    "Neutral",
                    "Seorang pengembara yang berasal dari dunia lain, saudara satu-satunya yang ia miliki dirampas dari hadapannya oleh sesosok dewa, dan kini ia mengembara untuk mencari The Seven",
                    R.drawable.lumine_ktp
                ),
                new CharaData(
                    "Ningguang",
                    "Liyue",
                    "26 Agustus",
                    "Liyue Qixing",
                    "Seorang \"Tianguan\" dari \"Liyue Qixing\", kekayaannya tidak tertandingi di seluruh Teyvat.",
                    R.drawable.ningguang_ktp
                ),
                new CharaData(
                    "Noelle",
                    "Mondstadt",
                    "21 Maret",
                    "Knights of Favonius",
                    "Seorang pelayan yang bekerja di Knights of Favonius, memiliki impian untuk menjadi seorang Knight suatu hari kelak.",
                    R.drawable.noelle_ktp
                ),
                new CharaData(
                    "Sucrose",
                    "Mondstadt",
                    "26 November",
                    "Knights of Favonius",
                    "Seorang alkemis dipenuhi dengan rasa ingin tahu tentang semua hal. Dia meneliti bio-alkimia.",
                    R.drawable.sucrose_ktp
                ),
                new CharaData(
                    "Venti",
                    "Mondstadt",
                    "16 Juni",
                    "Archons",
                    "Salah satu penyair Mondstadt yang dengan bebas berkeliling di antara lorong-lorong Mondstadt.",
                    R.drawable.venti_ktp
                ),
                new CharaData(
                    "Zhongli",
                    "Liyue",
                    "31 Desember",
                    "Archons",
                    "Seorang tamu misterius yang diundang Wangsheng Funeral Parlor, memiliki pengetahuan mendalam akan banyak hal.",
                    R.drawable.zhongli_ktp
                )
            };

            byName = new HashMap<String, CharaData>();
            for (CharaData d : all) {
                byName.put(d.getName(), d);
            }
        }
    }
}
