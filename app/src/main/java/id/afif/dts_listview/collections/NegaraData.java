package id.afif.dts_listview.collections;

import java.util.ArrayList;

public class NegaraData {

    public static String[] nama = {
            "Indonesia",
            "Malaysia",
            "Brunei",
            "Thailand",
            "Cambodia",
            "Vietnam",
            "Myanmar",
            "Timor Leste"
    };

    public static String[] detail = {
            "disebut juga dengan Negara Kesatuan Republik Indonesia; atau hanya Republik Indonesia adalah negara di Asia Tenggara yang dilintasi garis khatulistiwa dan berada di antara daratan benua Asia dan Australia, serta antara Samudra Pasifik dan Samudra Hindia.",
            "Malaysia adalah sebuah negara federal yang terdiri dari tiga belas negeri dan tiga wilayah federal di Asia Tenggara dengan luas 329.847 km persegi. Ibu kotanya adalah Kuala Lumpur, sedangkan Putrajaya menjadi pusat pemerintahan federal.",
            "Brunei Darussalam atau Brunei, nama resmi: Negara Brunei Darussalam, adalah negara berdaulat di Asia Tenggara yang terletak di pantai utara pulau Kalimantan. ",
            "Thailand, secara resmi Kerajaan Thailand yang dibaca Rātcha-āṇāchạk Thai, Rāja-ādnyācạkra Thai; atau Prathēt Thai, Pradēsa Thai, atau Mueang Thai, adalah sebuah negara di Asia Tenggara yang berbatasan dengan Laos dan Kamboja di timur, Malaysia dan Teluk Siam di selatan, dan Myanmar dan Laut Andaman di barat.",
            "Kerajaan Kamboja adalah sebuah negara berbentuk monarki konstitusional di Asia Tenggara. Negara ini merupakan penerus Kekaisaran Khmer yang pernah menguasai seluruh Semenanjung Indochina antara abad ke-11 dan 14. ",
            "Vietnam, bernama resmi Republik Sosialis Vietnam adalah negara paling timur di Semenanjung Indochina di Asia Tenggara. Vietnam berbatasan dengan Republik Rakyat Tiongkok di sebelah utara, Laos di sebelah barat laut,",
            "Republik Persatuan Myanmar adalah sebuah negara berdaulat di Asia Tenggara. Myanmar berbatasan dengan India dan Bangladesh di sebelah barat, Thailand dan Laos di sebelah timur dan Tiongkok di sebelah utara dan timur laut.",
            "Timor Leste, atau secara resmi bernama Republik Demokratik Timor Leste, yang sebelum merdeka bernama Timor Timur, adalah sebuah negara pulau di Asia Tenggara."
    };

    public static ArrayList<Negara> getNegara() {
        ArrayList<Negara> list = new ArrayList<>();
        for (int pos = 0; pos < nama.length; pos++) {
            Negara negara = new Negara();
            negara.setNama(nama[pos]);
            negara.setDetail(detail[pos]);

            list.add(negara);
        }
        return list;
    }

}
