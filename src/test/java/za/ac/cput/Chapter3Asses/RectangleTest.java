    package za.ac.cput.Chapter3Asses;
    import org.junit.*;
    import org.junit.rules.Timeout;

    public class RectangleTest {
        Rectangle rect = new Rectangle(5,4);
        int dExpectedArea = 20;
        Rectangle rectE = new Rectangle(5,4);
        @Test
        public void area() {
            Assert.assertEquals(dExpectedArea,rect.area());
        }
        @Test
        public void perimeterObjectEquality() {
            int dExpectedPerimeter=18;
            Assert.assertEquals(dExpectedPerimeter,rect.perimeter());}
        @Test
        public void perimeterObjectIdentity(){
            Assert.assertNotSame(rectE,rect);
        }
        @Test
        public void FailingTest(){
            Assert.fail("Failing Test");
        }
        @Rule
        public Timeout globalTimeout = new Timeout(20);
        @Test
        public void timeOutTest(){
            int infi=1;while(infi==1){}}
        @Ignore
        @Test
        public void ignoreTest(){
            int infi=1;while(infi==1){}
        }
    }