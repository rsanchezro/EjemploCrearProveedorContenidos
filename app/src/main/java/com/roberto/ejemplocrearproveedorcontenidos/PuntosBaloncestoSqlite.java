package com.roberto.ejemplocrearproveedorcontenidos;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

import androidx.annotation.Nullable;

public class PuntosBaloncestoSqlite extends SQLiteOpenHelper {
    public PuntosBaloncestoSqlite(@Nullable Context context, @Nullable String name, @Nullable SQLiteDatabase.CursorFactory factory, int version) {
        super(context, "PuntosBaloncesto", null, 1);
    }
    @Override
    public void onCreate(SQLiteDatabase db) {
        db.execSQL("CREATE TABLE Puntos(" +
                "_id INTEGER PRIMARY KEY AUTOINCREMENT," +
                "Puntos_Local INTEGER," +
                "Puntos_Visitante INTEGER," +
                "Fecha BIGINT)");
    }
    @Override
    public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion) {
        //Necesario implementar si hay nueva version de la base de datos
    }
}
