package edu.axboot.domain.guest;

import edu.axboot.AXBootApplication;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.transaction.annotation.Transactional;

@RunWith(SpringRunner.class)
@SpringBootTest(classes = AXBootApplication.class)
public class StandardGuestServiceTest {

    @Autowired
    private StandardGuestService standardGuestService;

    @Transactional
    @Test
    public void getLis() {

        // given


        // when


        // then

    }

}