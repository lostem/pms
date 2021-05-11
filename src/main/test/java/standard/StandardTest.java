package java.standard;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.transaction.annotation.Transactional;

@RunWith(SpringRunner.class)
@SpringBootTest
public class StandardTest {

//    @Autowired
//    public StandardRoomService standardRoomService;
//
//    @After
//    public void cleanup() {
//        standardRoomRepository.deleteAll();
//    }

    @Transactional
    @Test
    public void testSave() {
        // given
        String  roomNum = "101";
        String roomTypCd = "SB";


        // when



        // then

    }
}
