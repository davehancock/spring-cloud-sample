import com.djh.beverage.core.domain.Beverage;
import com.djh.beverage.core.service.BeverageService;
import com.djh.beverage.web.BeverageController;
import junit.framework.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.runners.MockitoJUnitRunner;


@RunWith(MockitoJUnitRunner.class)
public class BeverageControllerTest {

    @Mock
    private BeverageService beverageService;

    @InjectMocks
    private BeverageController beverageController;

    @Test
    public void testDispenseBeverage() {

        Mockito.when(beverageService.dispenseBeverage()).thenReturn(new Beverage(null, null, 0, null));

        Beverage dispensedBeverage = beverageController.dispense();
        Assert.assertNotNull(dispensedBeverage);
    }

}
