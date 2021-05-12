package java.standard;

import edu.axboot.AXBootApplication;
import edu.axboot.domain.standard.StandardRoomService;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.transaction.annotation.Transactional;

@RunWith(SpringRunner.class)
@SpringBootTest(classes = AXBootApplication.class)
public class StandardTest {

    @Autowired
    private StandardRoomService standardRoomService;

    @Transactional
    @Test
    public void testSave() {
        // given


        // when



        // then

    }
}
