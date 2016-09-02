package quizgame.test.com.osakabenquiz;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

/**
 * Created by saffran on 2016/08/24.
 */
public class DatabaseHelper extends SQLiteOpenHelper {

    public DatabaseHelper(Context context){

        super(context, "MyTable.db", null, 1);

    }

    @Override
    public void onCreate(SQLiteDatabase db) {

        db.execSQL("CREATE TABLE MyTable " +
                "(" +
                "_id INTEGER PRIMARY KEY AUTOINCREMENT" +
                ", Pref TEXT" +
                ", City0 TEXT" +
                ", City1 TEXT" +
                ", City2 TEXT" +
                ", City3 TEXT" +
                ", City4 TEXT" +
                ", Clear INTEGER" +
                ")");
        db.execSQL("INSERT INTO MyTable(Pref,City0, City1, City2, City3, City4, Clear) values ('「なおす」の意味は？','片づける','治療する','修理する','片づける','ちらかす',1);");
        db.execSQL("INSERT INTO MyTable(Pref,City0, City1, City2, City3, City4, Clear) values ('「よす」の意味は？','仲間に入れる','止める','喜び','仲間に入れる','見せる',0);");
        db.execSQL("INSERT INTO MyTable(Pref,City0, City1, City2, City3, City4, Clear) values ('「わやになる」の意味は？','ダメになる','てんやわんやになる','大勢になる','輪になる','ダメになる',0);");
        db.execSQL("INSERT INTO MyTable(Pref,City0, City1, City2, City3, City4, Clear) values ('「こうてくる」の意味は？','買ってくる','降りてくる','買ってくる','こうしてくる','取ってくる',0);");
        db.execSQL("INSERT INTO MyTable(Pref,City0, City1, City2, City3, City4, Clear) values ('「けえへん」','来ない','来ない','毛が変','偉い','貰えない',0);");
        db.execSQL("INSERT INTO MyTable(Pref,City0, City1, City2, City3, City4, Clear) values ('「じぶん」の意味は？','自分','自分','相手','第三者','目下の人',0);");
        db.execSQL("INSERT INTO MyTable(Pref,City0, City1, City2, City3, City4, Clear) values ('「なんぼ」の意味は？','おいくら','おいくら','年齢','野菜','時間',0);");
        db.execSQL("INSERT INTO MyTable(Pref,City0, City1, City2, City3, City4, Clear) values ('「ちゃう」の意味は？','違う','お茶','水','違う','合っている',0);");
        db.execSQL("INSERT INTO MyTable(Pref,City0, City1, City2, City3, City4, Clear) values ('「よういわんわ」の意味は？','呆れている','呆れている','よく言えない','言葉がたりない','用意できてない',0);");
        db.execSQL("INSERT INTO MyTable(Pref,City0, City1, City2, City3, City4, Clear) values ('「きばる」の意味は？','頑張る','応援する','ふんばる','頑張る','耐える',0);");
    }
    @Override
    public void onUpgrade(SQLiteDatabase db, int oldVersion,int newVersion){


    }

}
