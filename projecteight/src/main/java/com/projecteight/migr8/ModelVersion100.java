package com.projecteight.migr8;

import android.database.sqlite.SQLiteDatabase;
import org.baracus.migr8.MigrationStep;
import org.baracus.util.Logger;
import com.projecteight.model.Customer;

/**
 * Created with IntelliJ IDEA.
 *
 * Initial demonstration model version creating the customer table
 *
 */
public class ModelVersion100 implements MigrationStep {

    private static final Logger logger = new Logger(ModelVersion100.class);

    @Override
    public void applyVersion(SQLiteDatabase db) {

        String stmt  = "CREATE TABLE " + Customer.TABLE_CUSTOMER
                + "( "  + Customer.idCol+" INTEGER PRIMARY KEY"
                + " , " + Customer.lastNameCol+ " TEXT"
                + " , " + Customer.firstNameCol+ " TEXT"
                + " , " + Customer.createDateCol+ " INTEGER"
                + " , " + Customer.lastModifiedCol+ " INTEGER"
                +  ")";
        logger.info(stmt);
        db.execSQL(stmt);

    }

    @Override
    public int getModelVersionNumber() {
        return 100;
    }
}
