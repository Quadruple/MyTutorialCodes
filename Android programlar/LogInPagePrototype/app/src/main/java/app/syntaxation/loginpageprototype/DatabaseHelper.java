package app.syntaxation.loginpageprototype;

import android.database.Cursor;
import android.database.sqlite.SQLiteOpenHelper ;
import android.content.ContentValues ;
import android.content.Context ;
import android.database.sqlite.SQLiteDatabase ;

public class DatabaseHelper extends SQLiteOpenHelper {

    // Database Variables
    private static final int DATABASE_VERSION = 1 ;
    private static final String DATABASE_NAME = "Accounts.db" ;
    private static final String TABLE_NAME = "Accounts" ;
    private static final String COL_1 = "ROWNUMBER" ;
    private static final String COL_2 = "ID" ;
    private static final String COL_3 = "PASSWORD" ;

    public DatabaseHelper(Context context, String name, SQLiteDatabase.CursorFactory factory, int version) {
        super(context, DATABASE_NAME, factory, DATABASE_VERSION);
    }

    // Creating the database
    @Override
    public void onCreate(SQLiteDatabase sqLiteDatabase) {
        String query = " CREATE TABLE " + TABLE_NAME + "(" + COL_1 + " INTEGER PRIMARY KEY AUTOINCREMENT, " + COL_2 + " TEXT, " + COL_3 + " TEXT " + " ); " ;
        sqLiteDatabase.execSQL(query) ;
    }

    // Upgrading the database to the new one
    @Override
    public void onUpgrade(SQLiteDatabase sqLiteDatabase, int i, int i1) {
        String query = "DROP TABLE IF EXISTS" + TABLE_NAME ;
        sqLiteDatabase.execSQL(query) ;
        onCreate(sqLiteDatabase) ;
    }

    // Inserting user's ID and Password to the database
    public void InsertIDandPassword (String id , String password) {
        ContentValues values = new ContentValues() ;
        values.put(COL_2 , id) ;
        values.put(COL_3 , password) ;
        SQLiteDatabase database = getWritableDatabase() ;
        database.insert(TABLE_NAME , null , values) ;
        database.close() ;
    }

    // Matching a user's ID and Password
    public String matchPassword (String id) {
        SQLiteDatabase sqLiteDatabase = getWritableDatabase() ;
        Cursor cursor=sqLiteDatabase.query("Accounts", null, " ID=?", new String[]{id}, null, null, null);
        cursor.moveToFirst() ;
        String result = cursor.getString(cursor.getColumnIndex("PASSWORD")) ;
        cursor.close() ;
        return result ;
    }
}
