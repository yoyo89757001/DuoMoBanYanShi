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
 * DAO for table "SHI_PING_BEAN".
*/
public class ShiPingBeanDao extends AbstractDao<ShiPingBean, String> {

    public static final String TABLENAME = "SHI_PING_BEAN";

    /**
     * Properties of entity ShiPingBean.<br/>
     * Can be used for QueryBuilder and for referencing column names.
     */
    public static class Properties {
        public final static Property Id = new Property(0, String.class, "id", true, "ID");
        public final static Property VideoTitle = new Property(1, String.class, "videoTitle", false, "VIDEO_TITLE");
        public final static Property Video = new Property(2, String.class, "video", false, "VIDEO");
        public final static Property TimeOf = new Property(3, String.class, "timeOf", false, "TIME_OF");
        public final static Property TimeDays = new Property(4, String.class, "timeDays", false, "TIME_DAYS");
        public final static Property TimeEnd = new Property(5, String.class, "timeEnd", false, "TIME_END");
        public final static Property IsRemove = new Property(6, boolean.class, "isRemove", false, "IS_REMOVE");
        public final static Property VideoType = new Property(7, String.class, "videoType", false, "VIDEO_TYPE");
        public final static Property IsDownload = new Property(8, boolean.class, "isDownload", false, "IS_DOWNLOAD");
    }


    public ShiPingBeanDao(DaoConfig config) {
        super(config);
    }
    
    public ShiPingBeanDao(DaoConfig config, DaoSession daoSession) {
        super(config, daoSession);
    }

    /** Creates the underlying database table. */
    public static void createTable(Database db, boolean ifNotExists) {
        String constraint = ifNotExists? "IF NOT EXISTS ": "";
        db.execSQL("CREATE TABLE " + constraint + "\"SHI_PING_BEAN\" (" + //
                "\"ID\" TEXT PRIMARY KEY NOT NULL ," + // 0: id
                "\"VIDEO_TITLE\" TEXT," + // 1: videoTitle
                "\"VIDEO\" TEXT," + // 2: video
                "\"TIME_OF\" TEXT," + // 3: timeOf
                "\"TIME_DAYS\" TEXT," + // 4: timeDays
                "\"TIME_END\" TEXT," + // 5: timeEnd
                "\"IS_REMOVE\" INTEGER NOT NULL ," + // 6: isRemove
                "\"VIDEO_TYPE\" TEXT," + // 7: videoType
                "\"IS_DOWNLOAD\" INTEGER NOT NULL );"); // 8: isDownload
    }

    /** Drops the underlying database table. */
    public static void dropTable(Database db, boolean ifExists) {
        String sql = "DROP TABLE " + (ifExists ? "IF EXISTS " : "") + "\"SHI_PING_BEAN\"";
        db.execSQL(sql);
    }

    @Override
    protected final void bindValues(DatabaseStatement stmt, ShiPingBean entity) {
        stmt.clearBindings();
        stmt.bindString(1, entity.getId());
 
        String videoTitle = entity.getVideoTitle();
        if (videoTitle != null) {
            stmt.bindString(2, videoTitle);
        }
 
        String video = entity.getVideo();
        if (video != null) {
            stmt.bindString(3, video);
        }
 
        String timeOf = entity.getTimeOf();
        if (timeOf != null) {
            stmt.bindString(4, timeOf);
        }
 
        String timeDays = entity.getTimeDays();
        if (timeDays != null) {
            stmt.bindString(5, timeDays);
        }
 
        String timeEnd = entity.getTimeEnd();
        if (timeEnd != null) {
            stmt.bindString(6, timeEnd);
        }
        stmt.bindLong(7, entity.getIsRemove() ? 1L: 0L);
 
        String videoType = entity.getVideoType();
        if (videoType != null) {
            stmt.bindString(8, videoType);
        }
        stmt.bindLong(9, entity.getIsDownload() ? 1L: 0L);
    }

    @Override
    protected final void bindValues(SQLiteStatement stmt, ShiPingBean entity) {
        stmt.clearBindings();
        stmt.bindString(1, entity.getId());
 
        String videoTitle = entity.getVideoTitle();
        if (videoTitle != null) {
            stmt.bindString(2, videoTitle);
        }
 
        String video = entity.getVideo();
        if (video != null) {
            stmt.bindString(3, video);
        }
 
        String timeOf = entity.getTimeOf();
        if (timeOf != null) {
            stmt.bindString(4, timeOf);
        }
 
        String timeDays = entity.getTimeDays();
        if (timeDays != null) {
            stmt.bindString(5, timeDays);
        }
 
        String timeEnd = entity.getTimeEnd();
        if (timeEnd != null) {
            stmt.bindString(6, timeEnd);
        }
        stmt.bindLong(7, entity.getIsRemove() ? 1L: 0L);
 
        String videoType = entity.getVideoType();
        if (videoType != null) {
            stmt.bindString(8, videoType);
        }
        stmt.bindLong(9, entity.getIsDownload() ? 1L: 0L);
    }

    @Override
    public String readKey(Cursor cursor, int offset) {
        return cursor.getString(offset + 0);
    }    

    @Override
    public ShiPingBean readEntity(Cursor cursor, int offset) {
        ShiPingBean entity = new ShiPingBean( //
            cursor.getString(offset + 0), // id
            cursor.isNull(offset + 1) ? null : cursor.getString(offset + 1), // videoTitle
            cursor.isNull(offset + 2) ? null : cursor.getString(offset + 2), // video
            cursor.isNull(offset + 3) ? null : cursor.getString(offset + 3), // timeOf
            cursor.isNull(offset + 4) ? null : cursor.getString(offset + 4), // timeDays
            cursor.isNull(offset + 5) ? null : cursor.getString(offset + 5), // timeEnd
            cursor.getShort(offset + 6) != 0, // isRemove
            cursor.isNull(offset + 7) ? null : cursor.getString(offset + 7), // videoType
            cursor.getShort(offset + 8) != 0 // isDownload
        );
        return entity;
    }
     
    @Override
    public void readEntity(Cursor cursor, ShiPingBean entity, int offset) {
        entity.setId(cursor.getString(offset + 0));
        entity.setVideoTitle(cursor.isNull(offset + 1) ? null : cursor.getString(offset + 1));
        entity.setVideo(cursor.isNull(offset + 2) ? null : cursor.getString(offset + 2));
        entity.setTimeOf(cursor.isNull(offset + 3) ? null : cursor.getString(offset + 3));
        entity.setTimeDays(cursor.isNull(offset + 4) ? null : cursor.getString(offset + 4));
        entity.setTimeEnd(cursor.isNull(offset + 5) ? null : cursor.getString(offset + 5));
        entity.setIsRemove(cursor.getShort(offset + 6) != 0);
        entity.setVideoType(cursor.isNull(offset + 7) ? null : cursor.getString(offset + 7));
        entity.setIsDownload(cursor.getShort(offset + 8) != 0);
     }
    
    @Override
    protected final String updateKeyAfterInsert(ShiPingBean entity, long rowId) {
        return entity.getId();
    }
    
    @Override
    public String getKey(ShiPingBean entity) {
        if(entity != null) {
            return entity.getId();
        } else {
            return null;
        }
    }

    @Override
    public boolean hasKey(ShiPingBean entity) {
        throw new UnsupportedOperationException("Unsupported for entities with a non-null key");
    }

    @Override
    protected final boolean isEntityUpdateable() {
        return true;
    }
    
}
