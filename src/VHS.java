import java.util.ArrayList;
import java.util.List;

public class VHS implements Play {

	private int currentTime = 0;
	private String title;
	private int runTime;
	private ArrayList<String> scenes;
	
	public VHS() {
		super();
	}
	
	public VHS(String title, int runTime, ArrayList<String> scenes) {
		this.title = title;
		this.runTime = runTime;
		this.scenes = scenes;
	}
	
	public VHS(String title, int runTime, ArrayList<String> scenes, int currentTime) {
		this.title = title;
		this.runTime = runTime;
		this.scenes = scenes;
		this.currentTime = currentTime;
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

	public int getCurrentTime() {
		return currentTime;
	}
	
	public void setCurrentTime(int currentTime) {
		this.currentTime = currentTime;
	}

	
	public void play(int a, List<String> Scenes) {
		System.out.println(Scenes.get(a));
		this.currentTime = currentTime + 1;
		if (a > getScenes().size() || currentTime > getScenes().size()) {
			rewind();
		}
		
	}
	public void rewind() {
		this.currentTime = 0;
	}

	@Override
	public String toString() {
		return "VHS Title: " + getTitle() + ", CurrentTime: " + currentTime + ", Run Time: " + getRunTime() + ", Scenes: " + getScenes();
		
	}



	
	
	

}
