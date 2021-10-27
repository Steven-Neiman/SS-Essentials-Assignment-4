/*
A class for testing the Line class
I'm having trouble figuring out how to do unit tests in VSCode, so this code doesn't actually work
It's just a best guess to show that I'm paying attention and trying. I'll ask questions tomorrow to figure
out how to get my unit tests working and redo this.
*/

import org.junit.Test;
import JB4.main;

public class LineTest {
    @Test
    public void verticalSlopeTest(){
        Line vertical = new Line(0,0,0,10);
        Assert vertical.getSlope() throws ArithmeticException;
    }
    @Test
    public void HorizontalSlopeTest(){
        Line horizontal = new Line(0,0,10,0);
        AssertEquals(0, horizontal.getSlope, 0.01);
    }
    @Test
    public void SlopeTest(){
        Line diagonal =  new Line(0,0,10,10);
        AssertEquals(1, diagonal.getSlope(), 0.01);
    }
    @Test
    public void zeroLengthTest(){
        Line zero = new Line(0,0,0,0);
        AssertEquals(1, zero.getDistance(),0.01);
    }
    @Test
    public void lengthTest(){
        Line length = new Line(0,0,1,1);
        AssertEquals(1.414, length.getDistance(), 0.01);
    }
    @Test
    public void notParallelTest(){
        Line np1 = new Line(0,0,1,0);
        Line np2 = new Line(0,0,1,1);
        AssertFalse(np1.parallelTo(np2));
    }
    @Test
    public void parallelTest(){
        Line p1 = new Line(0,0,1,1);
        Line p2 = new Line(0,1,3,4);
        Assert(p1.parallelTo(p2));
    }
}
