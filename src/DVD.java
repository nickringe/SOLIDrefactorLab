import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;


public class DVD implements Play {
	
	private String title;
	private int runTime;
	private ArrayList<String> scenes;
	public DVD() {
		
	}
	
	public DVD(String title, int runTime, ArrayList<String> scenes) {
		this.title = title;
		this.runTime = runTime;
		this.scenes = scenes;
	}
	
	
	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public int getRunTime() {
		return runTime;
	}

	public void setRunTime(int runTime) {
		this.runTime = runTime;
	}

	public ArrayList<String> getScenes() {
		return scenes;
	}

	public void setScenes(ArrayList<String> scenes) {
		this.scenes = scenes;
	}

	public void play(int a, ArrayList<String> b) {
	System.out.println(b.get(a));
	}
	
	public void printScenes() {
		for (int i = 0; i < scenes.size(); i++) {
		System.out.println(scenes.get(i));
		}
	}

	public void play() {
		System.out.println("What scene would you like to watch?");
		printScenes();
		Scanner scnr = new Scanner(System.in);
		int userChoice = scnr.nextInt();
		System.out.println(getScenes().get(userChoice));
		scnr.close();
	}

	@Override
	public String toString() {
		return "DVD Title: " + getTitle() + ", Run Time: " + getRunTime() + ", Scenes: " + getScenes();
	}
	
	

}
