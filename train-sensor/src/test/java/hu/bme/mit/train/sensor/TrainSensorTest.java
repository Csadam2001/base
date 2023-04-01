package hu.bme.mit.train.sensor;
import java.util.Date;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import static org.mockito.Mockito.*;
import hu.bme.mit.train.interfaces.TrainSensor;
public class TrainSensorTest {

    @Before
    public void before() {
        // TODO Add initializations
    }

    @Test
    public void ThisIsAnExampleTestStub() {
        // TODO Delete this and add test cases based on the issues
    }

    @Test
    public void testRecordTable() {
        TachnoGrafImpl t = new TachnoGrafImpl();
        t.record(new Date(), 10, 20);
        Assert.assertFalse(t.getRecordTable().isEmpty());
    }
}
