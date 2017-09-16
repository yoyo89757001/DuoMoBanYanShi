package com.example.xiaojun.duomobanyanshi.beans;

import android.database.Cursor;
import android.database.sqlite.SQLiteStatement;

import org.greenrobot.greendao.AbstractDao;
import org.greenrobot.greendao.Property;
import org.greenrobot.greendao.internal.DaoConfig;
import org.greenrobot.greendao.database.Database;
import org.greenrobot.greendao.database.DatabaseStatement;

// THIS CODE IS GENERATED BY greenDAO, DO NOT EDIT.
/** 
 * DAO for table "SHI_BIE_JI_LU_BEAN".
*/
public class ShiBieJiLuBeanDao extends AbstractDao<ShiBieJiLuBean, Long> {

    public static final String TABLENAME = "SHI_BIE_JI_LU_BEAN";

    /**
     * Properties of entity ShiBieJiLuBean.<br/>
     * Can be used for QueryBuilder and for referencing column names.
     */
    public static class Properties {
        public final static Property Id = new Property(0, Long.class, "id", true, "_id");
        public final static Property Times = new Property(1, String.class, "times", false, "TIMES");
        public final static Property Name = new Property(2, String.class, "name", false, "NAME");
        public final static Property UrlPath = new Property(3, String.class, "urlPath", false, "URL_PATH");
    }


    public ShiBieJiLuBeanDao(DaoConfig config) {
        super(config);
    }
    
    public ShiBieJiLuBeanDao(DaoConfig config, DaoSession daoSession) {
        super(config, daoSession);
    }

    /** Creates the underlying database table. */
    public static void createTable(Database db, boolean ifNotExists) {
        String constraint = ifNotExists? "IF NOT EXISTS ": "";
        db.execSQL("CREATE TABLE " + constraint + "\"SHI_BIE_JI_LU_BEAN\" (" + //
                "\"_id\" INTEGER PRIMARY KEY NOT NULL ," + // 0: id
                "\"TIMES\" TEXT," + // 1: times
                "\"NAME\" TEXT," + // 2: name
                "\"URL_PATH\" TEXT);"); // 3: urlPath
    }

    /** Drops the underlying database table. */
    public static void dropTable(Database db, boolean ifExists) {
        String sql = "DROP TABLE " + (ifExists ? "IF EXISTS " : "") + "\"SHI_BIE_JI_LU_BEAN\"";
        db.execSQL(sql);
    }

    @Override
    protected final void bindValues(DatabaseStatement stmt, ShiBieJiLuBean entity) {
        stmt.clearBindings();
        stmt.bindLong(1, entity.getId());
 
        String times = entity.getTimes();
        if (times != null) {
            stmt.bindString(2, times);
        }
 
        String name = entity.getName();
        if (name != null) {
            stmt.bindString(3, name);
        }
 
        String urlPath = entity.getUrlPath();
        if (urlPath != null) {
            stmt.bindString(4, urlPath);
        }
    }

    @Override
    protected final void bindValues(SQLiteStatement stmt, ShiBieJiLuBean entity) {
        stmt.clearBindings();
        stmt.bindLong(1, entity.getId());
 
        String times = entity.getTimes();
        if (times != null) {
            stmt.bindString(2, times);
        }
 
        String name = entity.getName();
        if (name != null) {
            stmt.bindString(3, name);
        }
 
        String urlPath = entity.getUrlPath();
        if (urlPath != null) {
            stmt.bindString(4, urlPath);
        }
    }

    @Override
    public Long readKey(Cursor cursor, int offset) {
        return cursor.getLong(offset + 0);
    }    

    @Override
    public ShiBieJiLuBean readEntity(Cursor cursor, int offset) {
        ShiBieJiLuBean entity = new ShiBieJiLuBean( //
            cursor.getLong(offset + 0), // id
            cursor.isNull(offset + 1) ? null : cursor.getString(offset + 1), // times
            cursor.isNull(offset + 2) ? null : cursor.getString(offset + 2), // name
            cursor.isNull(offset + 3) ? null : cursor.getString(offset + 3) // urlPath
        );
        return entity;
    }
     
    @Override
    public void readEntity(Cursor cursor, ShiBieJiLuBean entity, int offset) {
        entity.setId(cursor.getLong(offset + 0));
        entity.setTimes(cursor.isNull(offset + 1) ? null : cursor.getString(offset + 1));
        entity.setName(cursor.isNull(offset + 2) ? null : cursor.getString(offset + 2));
        entity.setUrlPath(cursor.isNull(offset + 3) ? null : cursor.getString(offset + 3));
     }
    
    @Override
    protected final Long updateKeyAfterInsert(ShiBieJiLuBean entity, long rowId) {
        entity.setId(rowId);
        return rowId;
    }
    
    @Override
    public Long getKey(ShiBieJiLuBean entity) {
        if(entity != null) {
            return entity.getId();
        } else {
            return null;
        }
    }

    @Override
    public boolean hasKey(ShiBieJiLuBean entity) {
        throw new UnsupportedOperationException("Unsupported for entities with a non-null key");
    }

    @Override
    protected final boolean isEntityUpdateable() {
        return true;
    }
    
}
