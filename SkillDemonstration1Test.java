import static org.junit.Assert.*;
import org.junit.*;

public class SkillDemonstration1Test {
    @Test
    public void concatenate() {
        assertEquals("pineapple", 
        SkillDemonstration1.concatenate("pine", "berry"));
    }
}
