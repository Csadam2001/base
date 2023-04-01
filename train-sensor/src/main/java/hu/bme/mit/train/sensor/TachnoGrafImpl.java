package hu.bme.mit.train.sensor;

import com.google.common.collect.Table;
import com.google.common.collect.HashBasedTable;
import java.util.Date;

public class TachnoGrafImpl{

    Table<Date, Integer, Integer> recordTable = HashBasedTable.create();;

    public void record(Date time, int joystickPos, int refSpeed) {
        recordTable.put(time, joystickPos, refSpeed);
    }

    public Table<Date, Integer, Integer> getRecordTable() {
        return recordTable;
    }
}