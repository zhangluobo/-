package com.footprint.footprint.db.green;

import android.database.Cursor;
import android.database.sqlite.SQLiteStatement;

import org.greenrobot.greendao.AbstractDao;
import org.greenrobot.greendao.Property;
import org.greenrobot.greendao.internal.DaoConfig;
import org.greenrobot.greendao.database.Database;
import org.greenrobot.greendao.database.DatabaseStatement;

import com.footprint.footprint.dbbean.locationData;

// THIS CODE IS GENERATED BY greenDAO, DO NOT EDIT.
/** 
 * DAO for table "LOCATION_DATA".
*/
public class locationDataDao extends AbstractDao<locationData, Long> {

    public static final String TABLENAME = "LOCATION_DATA";

    /**
     * Properties of entity locationData.<br/>
     * Can be used for QueryBuilder and for referencing column names.
     */
    public static class Properties {
        public final static Property Id = new Property(0, Long.class, "id", true, "_id");
        public final static Property Name = new Property(1, String.class, "name", false, "NAME");
        public final static Property Jd = new Property(2, double.class, "jd", false, "JD");
        public final static Property Wd = new Property(3, double.class, "wd", false, "WD");
        public final static Property Time = new Property(4, String.class, "time", false, "TIME");
        public final static Property Beizhu1 = new Property(5, String.class, "beizhu1", false, "BEIZHU1");
        public final static Property Beizhu2 = new Property(6, String.class, "beizhu2", false, "BEIZHU2");
        public final static Property Beizhu3 = new Property(7, String.class, "beizhu3", false, "BEIZHU3");
    }


    public locationDataDao(DaoConfig config) {
        super(config);
    }
    
    public locationDataDao(DaoConfig config, DaoSession daoSession) {
        super(config, daoSession);
    }

    /** Creates the underlying database table. */
    public static void createTable(Database db, boolean ifNotExists) {
        String constraint = ifNotExists? "IF NOT EXISTS ": "";
        db.execSQL("CREATE TABLE " + constraint + "\"LOCATION_DATA\" (" + //
                "\"_id\" INTEGER PRIMARY KEY AUTOINCREMENT ," + // 0: id
                "\"NAME\" TEXT," + // 1: name
                "\"JD\" REAL NOT NULL ," + // 2: jd
                "\"WD\" REAL NOT NULL ," + // 3: wd
                "\"TIME\" TEXT," + // 4: time
                "\"BEIZHU1\" TEXT," + // 5: beizhu1
                "\"BEIZHU2\" TEXT," + // 6: beizhu2
                "\"BEIZHU3\" TEXT);"); // 7: beizhu3
    }

    /** Drops the underlying database table. */
    public static void dropTable(Database db, boolean ifExists) {
        String sql = "DROP TABLE " + (ifExists ? "IF EXISTS " : "") + "\"LOCATION_DATA\"";
        db.execSQL(sql);
    }

    @Override
    protected final void bindValues(DatabaseStatement stmt, locationData entity) {
        stmt.clearBindings();
 
        Long id = entity.getId();
        if (id != null) {
            stmt.bindLong(1, id);
        }
 
        String name = entity.getName();
        if (name != null) {
            stmt.bindString(2, name);
        }
        stmt.bindDouble(3, entity.getJd());
        stmt.bindDouble(4, entity.getWd());
 
        String time = entity.getTime();
        if (time != null) {
            stmt.bindString(5, time);
        }
 
        String beizhu1 = entity.getBeizhu1();
        if (beizhu1 != null) {
            stmt.bindString(6, beizhu1);
        }
 
        String beizhu2 = entity.getBeizhu2();
        if (beizhu2 != null) {
            stmt.bindString(7, beizhu2);
        }
 
        String beizhu3 = entity.getBeizhu3();
        if (beizhu3 != null) {
            stmt.bindString(8, beizhu3);
        }
    }

    @Override
    protected final void bindValues(SQLiteStatement stmt, locationData entity) {
        stmt.clearBindings();
 
        Long id = entity.getId();
        if (id != null) {
            stmt.bindLong(1, id);
        }
 
        String name = entity.getName();
        if (name != null) {
            stmt.bindString(2, name);
        }
        stmt.bindDouble(3, entity.getJd());
        stmt.bindDouble(4, entity.getWd());
 
        String time = entity.getTime();
        if (time != null) {
            stmt.bindString(5, time);
        }
 
        String beizhu1 = entity.getBeizhu1();
        if (beizhu1 != null) {
            stmt.bindString(6, beizhu1);
        }
 
        String beizhu2 = entity.getBeizhu2();
        if (beizhu2 != null) {
            stmt.bindString(7, beizhu2);
        }
 
        String beizhu3 = entity.getBeizhu3();
        if (beizhu3 != null) {
            stmt.bindString(8, beizhu3);
        }
    }

    @Override
    public Long readKey(Cursor cursor, int offset) {
        return cursor.isNull(offset + 0) ? null : cursor.getLong(offset + 0);
    }    

    @Override
    public locationData readEntity(Cursor cursor, int offset) {
        locationData entity = new locationData( //
            cursor.isNull(offset + 0) ? null : cursor.getLong(offset + 0), // id
            cursor.isNull(offset + 1) ? null : cursor.getString(offset + 1), // name
            cursor.getDouble(offset + 2), // jd
            cursor.getDouble(offset + 3), // wd
            cursor.isNull(offset + 4) ? null : cursor.getString(offset + 4), // time
            cursor.isNull(offset + 5) ? null : cursor.getString(offset + 5), // beizhu1
            cursor.isNull(offset + 6) ? null : cursor.getString(offset + 6), // beizhu2
            cursor.isNull(offset + 7) ? null : cursor.getString(offset + 7) // beizhu3
        );
        return entity;
    }
     
    @Override
    public void readEntity(Cursor cursor, locationData entity, int offset) {
        entity.setId(cursor.isNull(offset + 0) ? null : cursor.getLong(offset + 0));
        entity.setName(cursor.isNull(offset + 1) ? null : cursor.getString(offset + 1));
        entity.setJd(cursor.getDouble(offset + 2));
        entity.setWd(cursor.getDouble(offset + 3));
        entity.setTime(cursor.isNull(offset + 4) ? null : cursor.getString(offset + 4));
        entity.setBeizhu1(cursor.isNull(offset + 5) ? null : cursor.getString(offset + 5));
        entity.setBeizhu2(cursor.isNull(offset + 6) ? null : cursor.getString(offset + 6));
        entity.setBeizhu3(cursor.isNull(offset + 7) ? null : cursor.getString(offset + 7));
     }
    
    @Override
    protected final Long updateKeyAfterInsert(locationData entity, long rowId) {
        entity.setId(rowId);
        return rowId;
    }
    
    @Override
    public Long getKey(locationData entity) {
        if(entity != null) {
            return entity.getId();
        } else {
            return null;
        }
    }

    @Override
    public boolean hasKey(locationData entity) {
        return entity.getId() != null;
    }

    @Override
    protected final boolean isEntityUpdateable() {
        return true;
    }
    
}
