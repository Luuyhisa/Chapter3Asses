    package za.ac.cput.modulecht3_4.modulecht3_4;

    import org.junit.Assert;
    import org.junit.Ignore;
    import org.junit.Rule;
    import org.junit.Test;
    import org.junit.rules.Timeout;

    public class RectangleTest {
        Rectangle rect = new Rectangle(5,4);
        int dExpectedArea = 20;
        Rectangle rectE = new Rectangle(5,4);
        @Ignore
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
        @Test(expected = AssertionError.class)
        public void FailingTest(){
            int dExpectedPerimeter=18;
            Assert.assertEquals(dExpectedPerimeter,rect.perimeter());
        }
        @Rule
        public Timeout globalTimeout = new Timeout(50);
        @Test
        public void timeOutTest(){
            int infi=1;while(infi==1){}}
        @Ignore
        @Test
        public void ignoreTest(){
            int infi=1;while(infi==1){}
        }
    }