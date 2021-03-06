package com.example.dave.programmerpuzzle.Persistence.Entities;

import android.database.Cursor;
import android.database.sqlite.SQLiteStatement;

import org.greenrobot.greendao.AbstractDao;
import org.greenrobot.greendao.Property;
import org.greenrobot.greendao.internal.DaoConfig;
import org.greenrobot.greendao.database.Database;
import org.greenrobot.greendao.database.DatabaseStatement;

// THIS CODE IS GENERATED BY greenDAO, DO NOT EDIT.
/** 
 * DAO for table "PUZZLE".
*/
public class PuzzleDao extends AbstractDao<Puzzle, Long> {

    public static final String TABLENAME = "PUZZLE";

    /**
     * Properties of entity Puzzle.<br/>
     * Can be used for QueryBuilder and for referencing column names.
     */
    public static class Properties {
        public final static Property Id = new Property(0, Long.class, "id", true, "_id");
        public final static Property Description = new Property(1, String.class, "description", false, "DESCRIPTION");
        public final static Property Code = new Property(2, String.class, "code", false, "CODE");
        public final static Property Language = new Property(3, String.class, "language", false, "LANGUAGE");
    }


    public PuzzleDao(DaoConfig config) {
        super(config);
    }
    
    public PuzzleDao(DaoConfig config, DaoSession daoSession) {
        super(config, daoSession);
    }

    /** Creates the underlying database table. */
    public static void createTable(Database db, boolean ifNotExists) {
        String constraint = ifNotExists? "IF NOT EXISTS ": "";
        db.execSQL("CREATE TABLE " + constraint + "\"PUZZLE\" (" + //
                "\"_id\" INTEGER PRIMARY KEY AUTOINCREMENT ," + // 0: id
                "\"DESCRIPTION\" TEXT," + // 1: description
                "\"CODE\" TEXT," + // 2: code
                "\"LANGUAGE\" TEXT);"); // 3: language
    }

    /** Drops the underlying database table. */
    public static void dropTable(Database db, boolean ifExists) {
        String sql = "DROP TABLE " + (ifExists ? "IF EXISTS " : "") + "\"PUZZLE\"";
        db.execSQL(sql);
    }

    @Override
    protected final void bindValues(DatabaseStatement stmt, Puzzle entity) {
        stmt.clearBindings();
 
        Long id = entity.getId();
        if (id != null) {
            stmt.bindLong(1, id);
        }
 
        String description = entity.getDescription();
        if (description != null) {
            stmt.bindString(2, description);
        }
 
        String code = entity.getCode();
        if (code != null) {
            stmt.bindString(3, code);
        }
 
        String language = entity.getLanguage();
        if (language != null) {
            stmt.bindString(4, language);
        }
    }

    @Override
    protected final void bindValues(SQLiteStatement stmt, Puzzle entity) {
        stmt.clearBindings();
 
        Long id = entity.getId();
        if (id != null) {
            stmt.bindLong(1, id);
        }
 
        String description = entity.getDescription();
        if (description != null) {
            stmt.bindString(2, description);
        }
 
        String code = entity.getCode();
        if (code != null) {
            stmt.bindString(3, code);
        }
 
        String language = entity.getLanguage();
        if (language != null) {
            stmt.bindString(4, language);
        }
    }

    @Override
    public Long readKey(Cursor cursor, int offset) {
        return cursor.isNull(offset + 0) ? null : cursor.getLong(offset + 0);
    }    

    @Override
    public Puzzle readEntity(Cursor cursor, int offset) {
        Puzzle entity = new Puzzle( //
            cursor.isNull(offset + 0) ? null : cursor.getLong(offset + 0), // id
            cursor.isNull(offset + 1) ? null : cursor.getString(offset + 1), // description
            cursor.isNull(offset + 2) ? null : cursor.getString(offset + 2), // code
            cursor.isNull(offset + 3) ? null : cursor.getString(offset + 3) // language
        );
        return entity;
    }
     
    @Override
    public void readEntity(Cursor cursor, Puzzle entity, int offset) {
        entity.setId(cursor.isNull(offset + 0) ? null : cursor.getLong(offset + 0));
        entity.setDescription(cursor.isNull(offset + 1) ? null : cursor.getString(offset + 1));
        entity.setCode(cursor.isNull(offset + 2) ? null : cursor.getString(offset + 2));
        entity.setLanguage(cursor.isNull(offset + 3) ? null : cursor.getString(offset + 3));
     }
    
    @Override
    protected final Long updateKeyAfterInsert(Puzzle entity, long rowId) {
        entity.setId(rowId);
        return rowId;
    }
    
    @Override
    public Long getKey(Puzzle entity) {
        if(entity != null) {
            return entity.getId();
        } else {
            return null;
        }
    }

    @Override
    public boolean hasKey(Puzzle entity) {
        return entity.getId() != null;
    }

    @Override
    protected final boolean isEntityUpdateable() {
        return true;
    }
    
}
