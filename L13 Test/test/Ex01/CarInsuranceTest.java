package Ex01;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CarInsuranceTest {
    CarInsurance ci = new CarInsurance(1000);

    @Test
    void calculatePremium() {
        assertEquals(1062.5,ci.calculatePremium(21,false,4));
    }
}