import static org.junit.jupiter.api.Assertions.*;

import java.util.ArrayList;

import org.junit.jupiter.api.Test;

class BlockbusterTestCases {

	@Test
	void createDVDtest() {
		ArrayList<String> scenes = new ArrayList<>();
		DVD testDVD = new DVD("TestMovie", 100, scenes);
		assertNotNull(testDVD);
	}
	
	@Test
	void titleDVDtest() {
		ArrayList<String> scenes = new ArrayList<>();
		DVD testDVD = new DVD("TestMovie", 100, scenes);
		String expected = "TestMovie";
		String actual = testDVD.getTitle();
		assertEquals(expected, actual);
	}
	
	@Test
	void runTimeDVDtest() {
		ArrayList<String> scenes = new ArrayList<>();
		DVD testDVD = new DVD("TestMovie", 100, scenes);
		int expected = 100;
		int actual = testDVD.getRunTime();
		assertEquals(expected, actual);
	}
	
	@Test
	void createVHStest() {
		ArrayList<String> scenes = new ArrayList<>();
		VHS testVHS = new VHS("TestMovie", 100, scenes);
		assertNotNull(testVHS);
	}
	
	@Test
	void titleVHStest() {
		ArrayList<String> scenes = new ArrayList<>();
		VHS testVHS = new VHS("TestMovie", 100, scenes);
		String expected = "TestMovie";
		String actual = testVHS.getTitle();
		assertEquals(expected, actual);
	}
	
	@Test
	void runTimeVHStest() {
		ArrayList<String> scenes = new ArrayList<>();
		VHS testVHS = new VHS("TestMovie", 100, scenes);
		int expected = 100;
		int actual = testVHS.getRunTime();
		assertEquals(expected, actual);
	}
	
	@Test
	void currentTimeVHStest() {
		ArrayList<String> scenes = new ArrayList<>();
		VHS testVHS = new VHS("TestMovie", 100, scenes);
		int expected = 0;
		int actual = testVHS.getCurrentTime();
		assertEquals(expected, actual);
	}
	
	@Test
	void VHSplayTest() {
		ArrayList<String> scenes = new ArrayList<>();
		scenes.add("Scene 0");
		scenes.add("Scene 1");
		VHS testVHS = new VHS("TestMovie", 100, scenes);
		testVHS.play(0, scenes);
		int expected = 1;
		int actual = testVHS.getCurrentTime();
		assertEquals(expected, actual);
	}
	
	@Test
	void VHSrewindTest() {
		ArrayList<String> scenes = new ArrayList<>();
		scenes.add("Scene 0");
		scenes.add("Scene 1");
		VHS testVHS = new VHS("TestMovie", 100, scenes);
		testVHS.play(0, scenes);
		testVHS.rewind();
		int expected = 0;
		int actual = testVHS.getCurrentTime();
		assertEquals(expected, actual);
	}
	
	@Test
	void ExtendedVHSrewindTest() {
		ArrayList<String> scenes = new ArrayList<>();
		scenes.add("Scene 0");
		scenes.add("Scene 1");
		scenes.add("Scene 2");
		VHS testVHS = new VHS("TestMovie", 100, scenes);
		testVHS.play(0, scenes);
		testVHS.play(0, scenes);
		testVHS.play(0, scenes);
		testVHS.play(0, scenes);
		int expected = 0;
		int actual = testVHS.getCurrentTime();
		assertEquals(expected, actual);
	}

}
