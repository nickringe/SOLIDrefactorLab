import java.util.ArrayList;
import java.util.List;


public class Movie implements Play {

	private String title;
	private int runTime;
	private ArrayList<String> scenes = new ArrayList<>();
	private Play play;
	
	public Movie() {
		
	}

	public Movie(String title, int runTime, ArrayList<String> scenes, Play play) {
		this.title = title;
		this.runTime = runTime;
		this.scenes = scenes;
		this.play = play;
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
	
	public void printInfo() {
		System.out.println(this.title);
		System.out.println(this.runTime);
	}
	
	public void printScenes() {
		for (int i = 0; i < scenes.size(); i++) {
		System.out.println(scenes.get(i));
		}
	}
	
	public void play(List<String> Scenes) {
		Play.play(Scenes);
		
	}

	@Override
	public String toString() {
		return "Movie Title: " + title + ", Run Time: " + runTime + ", Scenes: " + scenes;
	}

	public Play getPlay() {
		return play;
	}

	public void setPlay(Play play) {
		this.play = play;
	}
	
	
}
