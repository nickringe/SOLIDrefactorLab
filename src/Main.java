import java.util.ArrayList;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		boolean movieListCont = true;
		boolean sceneCont = true;
		ArrayList<String> SpongeScenes = new ArrayList<>();
		SpongeScenes.add("Scene 0: Beginning");
		SpongeScenes.add("Scene 1: Patrick Gets Lost");
		SpongeScenes.add("Scene 2: Spongebob Goes Looking");
		SpongeScenes.add("Scene 3: Everything Goes Wrong");
		SpongeScenes.add("Scene 4: SpongeBob Finds Patrick");
		SpongeScenes.add("Scene 5: The End");

		ArrayList<String> StandScenes = new ArrayList<>();
		StandScenes.add("Scene 0: Beginning");
		StandScenes.add("Scene 1: The Sleepover");
		StandScenes.add("Scene 2: Storytelling");
		StandScenes.add("Scene 3: The Train");
		StandScenes.add("Scene 4: The Body");
		StandScenes.add("Scene 5: The End");

		ArrayList<String> GoonieScenes = new ArrayList<>();
		GoonieScenes.add("Scene 0: Beginning");
		GoonieScenes.add("Scene 1: The Attic");
		GoonieScenes.add("Scene 2: Fratelli's Secret");
		GoonieScenes.add("Scene 3: Into The Undergound");
		GoonieScenes.add("Scene 4: Treasure");
		GoonieScenes.add("Scene 5: The End");

		ArrayList<String> CopScenes = new ArrayList<>();
		CopScenes.add("Scene 0: Beginning");
		CopScenes.add("Scene 1: Things Heat Up");
		CopScenes.add("Scene 2: Bobo In Blue");
		CopScenes.add("Scene 3: Gimme a Milk, Steve");
		CopScenes.add("Scene 4: The Last Stand");
		CopScenes.add("Scene 5: The End");

		ArrayList<String> LostScenes = new ArrayList<>();
		LostScenes.add("Scene 0: Beginning");
		LostScenes.add("Scene 1: Carnival");
		LostScenes.add("Scene 2: Vampire Secrets");
		LostScenes.add("Scene 3: The Chase");
		LostScenes.add("Scene 4: Will They Survive?");
		LostScenes.add("Scene 5: The End");

		ArrayList<String> HarryScenes = new ArrayList<>();
		HarryScenes.add("Scene 0: Beginning");
		HarryScenes.add("Scene 1: All Hope Is Lost");
		HarryScenes.add("Scene 2: Or Is It?");
		HarryScenes.add("Scene 3: It Definitely Is");
		HarryScenes.add("Scene 4: But Wait, Maybe Not!?");
		HarryScenes.add("Scene 5: The End");

		VHS spongeBob = new VHS("SpongeBob - The Movie!", 87, SpongeScenes, 0);
		VHS standByMe = new VHS("Stand By Me", 89, StandScenes, 0);
		VHS goonies = new VHS("The Goonies", 114, GoonieScenes, 0);
		DVD copAndAhalf = new DVD("Cop and A Half", 97, CopScenes);
		DVD lostBoys = new DVD("The Lost Boys", 97, LostScenes);
		DVD harryPotter = new DVD("Harry Potter and the Deathly Hallows Pt 1", 146, HarryScenes);

		ArrayList<VHS> movies = new ArrayList<>();
		movies.add(spongeBob);
		movies.add(standByMe);
		movies.add(goonies);
		
		ArrayList<DVD> dvds = new ArrayList<>();
		dvds.add(copAndAhalf);
		dvds.add(lostBoys);
		dvds.add(harryPotter);

		System.out.println("Welcome To GC BlockBuster!");
		while (movieListCont = true) {
			try {
			System.out.println("Please select a movie from the list:");
			System.out.println("1." + spongeBob.getTitle());
			System.out.println("2." + standByMe.getTitle());
			System.out.println("3." + goonies.getTitle());
			System.out.println("4." + copAndAhalf.getTitle());
			System.out.println("5." + lostBoys.getTitle());
			System.out.println("6." + harryPotter.getTitle());
			System.out.println("0.Exit Program");
			Scanner scnr = new Scanner(System.in);
			int movieChoice = scnr.nextInt();

			if (movieChoice < 0 || movieChoice > (movies.size() + dvds.size())) {
				System.out.println("Sorry, that isn't a choice.\n");
			} else if (movieChoice == 1) {
				System.out.println(spongeBob.getTitle());
				System.out.println("Run time: " + spongeBob.getRunTime());
				System.out.println("Would you like to watch the movie? y/n:");
				String userChoice = scnr.next();
				if (userChoice.charAt(0) == 'y' || userChoice.charAt(0) == 'Y') {
					System.out.println("Which scene of " + spongeBob.getTitle());
					System.out.println("would you like to see? 0-5:");
					int sceneChoice = scnr.nextInt();
					if (sceneChoice == 0) {
						spongeBob.setCurrentTime(sceneChoice);
						spongeBob.play(sceneChoice, SpongeScenes);
						while (sceneCont = true) {
							System.out.println("Would you like to continue watching? y/n:");
							String continueChoice = scnr.next();
							if (continueChoice.charAt(0) == 'y' || continueChoice.charAt(0) == 'Y') {
								sceneChoice = sceneChoice + 1;
								if (sceneChoice > SpongeScenes.size() - 1) {
									sceneChoice = 0;
								}
								spongeBob.play(sceneChoice, SpongeScenes);
								sceneCont = true;
							} else {
								sceneCont = false;
								break;
							}
						}
					} else if (sceneChoice == 1) {
						spongeBob.setCurrentTime(sceneChoice);
						spongeBob.play(sceneChoice, SpongeScenes);
						while (sceneCont = true) {
							System.out.println("Would you like to continue watching? y/n:");
							String continueChoice = scnr.next();
							if (continueChoice.charAt(0) == 'y' || continueChoice.charAt(0) == 'Y') {
								sceneChoice = sceneChoice + 1;
								if (sceneChoice > SpongeScenes.size() - 1) {
									sceneChoice = 0;
								}
								spongeBob.play(sceneChoice, SpongeScenes);
								sceneCont = true;
							} else {
								sceneCont = false;
								break;
							}
						}
					} else if (sceneChoice == 2) {
						spongeBob.setCurrentTime(sceneChoice);
						spongeBob.play(sceneChoice, SpongeScenes);
						while (sceneCont = true) {
							System.out.println("Would you like to continue watching? y/n:");
							String continueChoice = scnr.next();
							if (continueChoice.charAt(0) == 'y' || continueChoice.charAt(0) == 'Y') {
								sceneChoice = sceneChoice + 1;
								if (sceneChoice > SpongeScenes.size() - 1) {
									sceneChoice = 0;
								}
								spongeBob.play(sceneChoice, SpongeScenes);
								sceneCont = true;
							} else {
								sceneCont = false;
								break;
							}
						}
					} else if (sceneChoice == 3) {
						spongeBob.setCurrentTime(sceneChoice);
						spongeBob.play(sceneChoice, SpongeScenes);
						while (sceneCont = true) {
							System.out.println("Would you like to continue watching? y/n:");
							String continueChoice = scnr.next();
							if (continueChoice.charAt(0) == 'y' || continueChoice.charAt(0) == 'Y') {
								sceneChoice = sceneChoice + 1;
								if (sceneChoice > SpongeScenes.size() - 1) {
									sceneChoice = 0;
								}
								spongeBob.play(sceneChoice, SpongeScenes);
								sceneCont = true;
							} else {
								sceneCont = false;
								break;
							}
						}
					} else if (sceneChoice == 4) {
						spongeBob.setCurrentTime(sceneChoice);
						spongeBob.play(sceneChoice, SpongeScenes);
						while (sceneCont = true) {
							System.out.println("Would you like to continue watching? y/n:");
							String continueChoice = scnr.next();
							if (continueChoice.charAt(0) == 'y' || continueChoice.charAt(0) == 'Y') {
								sceneChoice = sceneChoice + 1;
								if (sceneChoice > SpongeScenes.size() - 1) {
									sceneChoice = 0;
								}
								spongeBob.play(sceneChoice, SpongeScenes);
								sceneCont = true;
							} else {
								sceneCont = false;
								break;
							}
						}
					} else if (sceneChoice == 5) {
						spongeBob.setCurrentTime(sceneChoice);
						spongeBob.play(sceneChoice, SpongeScenes);
						while (sceneCont = true) {
							System.out.println("Would you like to continue watching? y/n:");
							String continueChoice = scnr.next();
							if (continueChoice.charAt(0) == 'y' || continueChoice.charAt(0) == 'Y') {
								sceneChoice = sceneChoice + 1;
								if (sceneChoice > SpongeScenes.size() - 1) {
									sceneChoice = 0;
								}
								spongeBob.play(sceneChoice, SpongeScenes);
								sceneCont = true;
							} else {
								sceneCont = false;
								break;
							}
						}
					} else {
						System.out.println("Sorry, I didn't get that.");
						System.out.println("Would you like to continue watching? y/n:");
						String continueChoice = scnr.next();
						if (continueChoice.charAt(0) == 'y' || continueChoice.charAt(0) == 'Y') {
							sceneCont = true;
						} else {
							sceneCont = false;
						}

					}
				} else {
					movieListCont = true;

				}

			} else if (movieChoice == 2) {
				System.out.println(standByMe.getTitle());
				System.out.println("Run time: " + standByMe.getRunTime());
				System.out.println("Would you like to watch the movie? y/n:");
				String userChoice = scnr.next();
				if (userChoice.charAt(0) == 'y' || userChoice.charAt(0) == 'Y') {
					System.out.println("Which scene of " + standByMe.getTitle());
					System.out.println("would you like to see? 0-5:");
					int sceneChoice = scnr.nextInt();
					if (sceneChoice == 0) {
						standByMe.setCurrentTime(sceneChoice);
						standByMe.play(sceneChoice, StandScenes);
						while (sceneCont = true) {
							System.out.println("Would you like to continue watching? y/n:");
							String continueChoice = scnr.next();
							if (continueChoice.charAt(0) == 'y' || continueChoice.charAt(0) == 'Y') {
								sceneChoice = sceneChoice + 1;
								if (sceneChoice > StandScenes.size() - 1) {
									sceneChoice = 0;
								}
								standByMe.play(sceneChoice, StandScenes);
								sceneCont = true;
							} else {
								sceneCont = false;
								break;
							}
						}
					} else if (sceneChoice == 1) {
						standByMe.setCurrentTime(sceneChoice);
						standByMe.play(sceneChoice, StandScenes);
						while (sceneCont = true) {
							System.out.println("Would you like to continue watching? y/n:");
							String continueChoice = scnr.next();
							if (continueChoice.charAt(0) == 'y' || continueChoice.charAt(0) == 'Y') {
								sceneChoice = sceneChoice + 1;
								if (sceneChoice > StandScenes.size() - 1) {
									sceneChoice = 0;
								}
								standByMe.play(sceneChoice, StandScenes);
								sceneCont = true;
							} else {
								sceneCont = false;
								break;
							}
						}
					} else if (sceneChoice == 2) {
						standByMe.setCurrentTime(sceneChoice);
						standByMe.play(sceneChoice, StandScenes);
						while (sceneCont = true) {
							System.out.println("Would you like to continue watching? y/n:");
							String continueChoice = scnr.next();
							if (continueChoice.charAt(0) == 'y' || continueChoice.charAt(0) == 'Y') {
								sceneChoice = sceneChoice + 1;
								if (sceneChoice > StandScenes.size() - 1) {
									sceneChoice = 0;
								}
								standByMe.play(sceneChoice, StandScenes);
								sceneCont = true;
							} else {
								sceneCont = false;
								break;
							}
						}
					} else if (sceneChoice == 3) {
						standByMe.setCurrentTime(sceneChoice);
						standByMe.play(sceneChoice, StandScenes);
						while (sceneCont = true) {
							System.out.println("Would you like to continue watching? y/n:");
							String continueChoice = scnr.next();
							if (continueChoice.charAt(0) == 'y' || continueChoice.charAt(0) == 'Y') {
								sceneChoice = sceneChoice + 1;
								if (sceneChoice > StandScenes.size() - 1) {
									sceneChoice = 0;
								}
								standByMe.play(sceneChoice, StandScenes);
								sceneCont = true;
							} else {
								sceneCont = false;
								break;
							}
						}
					} else if (sceneChoice == 4) {
						standByMe.setCurrentTime(sceneChoice);
						standByMe.play(sceneChoice, StandScenes);
						while (sceneCont = true) {
							System.out.println("Would you like to continue watching? y/n:");
							String continueChoice = scnr.next();
							if (continueChoice.charAt(0) == 'y' || continueChoice.charAt(0) == 'Y') {
								sceneChoice = sceneChoice + 1;
								if (sceneChoice > StandScenes.size() - 1) {
									sceneChoice = 0;
								}
								standByMe.play(sceneChoice, StandScenes);
								sceneCont = true;
							} else {
								sceneCont = false;
								break;
							}
						}
					} else if (sceneChoice == 5) {
						standByMe.setCurrentTime(sceneChoice);
						standByMe.play(sceneChoice, StandScenes);
						while (sceneCont = true) {
							System.out.println("Would you like to continue watching? y/n:");
							String continueChoice = scnr.next();
							if (continueChoice.charAt(0) == 'y' || continueChoice.charAt(0) == 'Y') {
								sceneChoice = sceneChoice + 1;
								if (sceneChoice > StandScenes.size() - 1) {
									sceneChoice = 0;
								}
								standByMe.play(sceneChoice, StandScenes);
								sceneCont = true;
							} else {
								sceneCont = false;
								break;
							}
						}
					} else {
						System.out.println("Sorry, I didn't get that.");
						System.out.println("Would you like to continue watching? y/n:");
						String continueChoice = scnr.next();
						if (continueChoice.charAt(0) == 'y' || continueChoice.charAt(0) == 'Y') {
							sceneCont = true;
						} else {
							sceneCont = false;
						}

					}
				} else {
					movieListCont = true;

				}
			} else if (movieChoice == 3) {
				System.out.println(goonies.getTitle());
				System.out.println("Run time: " + goonies.getRunTime());
				System.out.println("Would you like to watch the movie? y/n:");
				String userChoice = scnr.next();
				if (userChoice.charAt(0) == 'y' || userChoice.charAt(0) == 'Y') {
					System.out.println("Which scene of " + goonies.getTitle());
					System.out.println("would you like to see? 0-5:");
					int sceneChoice = scnr.nextInt();
					if (sceneChoice == 0) {
						goonies.setCurrentTime(sceneChoice);
						goonies.play(sceneChoice, GoonieScenes);
						while (sceneCont = true) {
							System.out.println("Would you like to continue watching? y/n:");
							String continueChoice = scnr.next();
							if (continueChoice.charAt(0) == 'y' || continueChoice.charAt(0) == 'Y') {
								sceneChoice = sceneChoice + 1;
								if (sceneChoice > GoonieScenes.size() - 1) {
									sceneChoice = 0;
								}
								goonies.play(sceneChoice, GoonieScenes);
								sceneCont = true;
							} else {
								sceneCont = false;
								break;
							}
						}
					} else if (sceneChoice == 1) {
						goonies.setCurrentTime(sceneChoice);
						goonies.play(sceneChoice, GoonieScenes);
						while (sceneCont = true) {
							System.out.println("Would you like to continue watching? y/n:");
							String continueChoice = scnr.next();
							if (continueChoice.charAt(0) == 'y' || continueChoice.charAt(0) == 'Y') {
								sceneChoice = sceneChoice + 1;
								if (sceneChoice > GoonieScenes.size() - 1) {
									sceneChoice = 0;
								}
								goonies.play(sceneChoice, GoonieScenes);
								sceneCont = true;
							} else {
								sceneCont = false;
								break;
							}
						}
					} else if (sceneChoice == 2) {
						goonies.setCurrentTime(sceneChoice);
						goonies.play(sceneChoice, GoonieScenes);
						while (sceneCont = true) {
							System.out.println("Would you like to continue watching? y/n:");
							String continueChoice = scnr.next();
							if (continueChoice.charAt(0) == 'y' || continueChoice.charAt(0) == 'Y') {
								sceneChoice = sceneChoice + 1;
								if (sceneChoice > GoonieScenes.size() - 1) {
									sceneChoice = 0;
								}
								goonies.play(sceneChoice, GoonieScenes);
								sceneCont = true;
							} else {
								sceneCont = false;
								break;
							}
						}
					} else if (sceneChoice == 3) {
						goonies.setCurrentTime(sceneChoice);
						goonies.play(sceneChoice, GoonieScenes);
						while (sceneCont = true) {
							System.out.println("Would you like to continue watching? y/n:");
							String continueChoice = scnr.next();
							if (continueChoice.charAt(0) == 'y' || continueChoice.charAt(0) == 'Y') {
								sceneChoice = sceneChoice + 1;
								if (sceneChoice > GoonieScenes.size() - 1) {
									sceneChoice = 0;
								}
								goonies.play(sceneChoice, GoonieScenes);
								sceneCont = true;
							} else {
								sceneCont = false;
								break;
							}
						}
					} else if (sceneChoice == 4) {
						goonies.setCurrentTime(sceneChoice);
						goonies.play(sceneChoice, GoonieScenes);
						while (sceneCont = true) {
							System.out.println("Would you like to continue watching? y/n:");
							String continueChoice = scnr.next();
							if (continueChoice.charAt(0) == 'y' || continueChoice.charAt(0) == 'Y') {
								sceneChoice = sceneChoice + 1;
								if (sceneChoice > GoonieScenes.size() - 1) {
									sceneChoice = 0;
								}
								goonies.play(sceneChoice, GoonieScenes);
								sceneCont = true;
							} else {
								sceneCont = false;
								break;
							}
						}
					} else if (sceneChoice == 5) {
						goonies.setCurrentTime(sceneChoice);
						goonies.play(sceneChoice, GoonieScenes);
						while (sceneCont = true) {
							System.out.println("Would you like to continue watching? y/n:");
							String continueChoice = scnr.next();
							if (continueChoice.charAt(0) == 'y' || continueChoice.charAt(0) == 'Y') {
								sceneChoice = sceneChoice + 1;
								if (sceneChoice > GoonieScenes.size() - 1) {
									sceneChoice = 0;
								}
								goonies.play(sceneChoice, GoonieScenes);
								sceneCont = true;
							} else {
								sceneCont = false;
								break;
							}
						}
					} else {
						System.out.println("Sorry, I didn't get that.");
						System.out.println("Would you like to continue watching? y/n:");
						String continueChoice = scnr.next();
						if (continueChoice.charAt(0) == 'y' || continueChoice.charAt(0) == 'Y') {
							sceneCont = true;
						} else {
							sceneCont = false;
						}

					}
				} else {
					movieListCont = true;

				}
			} else if (movieChoice == 4) {
				System.out.println(copAndAhalf.getTitle());
				System.out.println("Run time: " + copAndAhalf.getRunTime());
				System.out.println("Would you like to watch the movie? y/n:");
				String userChoice = scnr.next();
				if (userChoice.charAt(0) == 'y' || userChoice.charAt(0) == 'Y') {
					System.out.println("Which scene of " + copAndAhalf.getTitle());
					System.out.println("would you like to see? 0-5:");
					int sceneChoice = scnr.nextInt();
					if (sceneChoice == 0) {
						copAndAhalf.play(sceneChoice, CopScenes);
						while (sceneCont = true) {
							System.out.println("Would you like to continue watching? y/n:");
							String continueChoice = scnr.next();
							if (continueChoice.charAt(0) == 'y' || continueChoice.charAt(0) == 'Y') {
								sceneChoice = sceneChoice + 1;
								if (sceneChoice > CopScenes.size() - 1) {
									sceneChoice = 0;
								}
								copAndAhalf.play(sceneChoice, CopScenes);
								sceneCont = true;
							} else {
								sceneCont = false;
								break;
							}
						}
					} else if (sceneChoice == 1) {
						copAndAhalf.play(sceneChoice, CopScenes);
						while (sceneCont = true) {
							System.out.println("Would you like to continue watching? y/n:");
							String continueChoice = scnr.next();
							if (continueChoice.charAt(0) == 'y' || continueChoice.charAt(0) == 'Y') {
								sceneChoice = sceneChoice + 1;
								if (sceneChoice > CopScenes.size() - 1) {
									sceneChoice = 0;
								}
								copAndAhalf.play(sceneChoice, CopScenes);
								sceneCont = true;
							} else {
								sceneCont = false;
								break;
							}
						}
					} else if (sceneChoice == 2) {
						copAndAhalf.play(sceneChoice, CopScenes);
						while (sceneCont = true) {
							System.out.println("Would you like to continue watching? y/n:");
							String continueChoice = scnr.next();
							if (continueChoice.charAt(0) == 'y' || continueChoice.charAt(0) == 'Y') {
								sceneChoice = sceneChoice + 1;
								if (sceneChoice > CopScenes.size() - 1) {
									sceneChoice = 0;
								}
								copAndAhalf.play(sceneChoice, CopScenes);
								sceneCont = true;
							} else {
								sceneCont = false;
								break;
							}
						}
					} else if (sceneChoice == 3) {
						copAndAhalf.play(sceneChoice, CopScenes);
						while (sceneCont = true) {
							System.out.println("Would you like to continue watching? y/n:");
							String continueChoice = scnr.next();
							if (continueChoice.charAt(0) == 'y' || continueChoice.charAt(0) == 'Y') {
								sceneChoice = sceneChoice + 1;
								if (sceneChoice > CopScenes.size() - 1) {
									sceneChoice = 0;
								}
								copAndAhalf.play(sceneChoice, CopScenes);
								sceneCont = true;
							} else {
								sceneCont = false;
								break;
							}
						}
					} else if (sceneChoice == 4) {
						copAndAhalf.play(sceneChoice, CopScenes);
						while (sceneCont = true) {
							System.out.println("Would you like to continue watching? y/n:");
							String continueChoice = scnr.next();
							if (continueChoice.charAt(0) == 'y' || continueChoice.charAt(0) == 'Y') {
								sceneChoice = sceneChoice + 1;
								if (sceneChoice > CopScenes.size() - 1) {
									sceneChoice = 0;
								}
								copAndAhalf.play(sceneChoice, CopScenes);
								sceneCont = true;
							} else {
								sceneCont = false;
								break;
							}
						}
					} else if (sceneChoice == 5) {
						copAndAhalf.play(sceneChoice, CopScenes);
						while (sceneCont = true) {
							System.out.println("Would you like to continue watching? y/n:");
							String continueChoice = scnr.next();
							if (continueChoice.charAt(0) == 'y' || continueChoice.charAt(0) == 'Y') {
								sceneChoice = sceneChoice + 1;
								if (sceneChoice > CopScenes.size() - 1) {
									sceneChoice = 0;
								}
								copAndAhalf.play(sceneChoice, CopScenes);
								sceneCont = true;
							} else {
								sceneCont = false;
								break;
							}
						}
					} else {
						System.out.println("Sorry, I didn't get that.");
						System.out.println("Would you like to continue watching? y/n:");
						String continueChoice = scnr.next();
						if (continueChoice.charAt(0) == 'y' || continueChoice.charAt(0) == 'Y') {
							sceneCont = true;
						} else {
							sceneCont = false;
						}

					}

				} 

			} else if (movieChoice == 5) {
				System.out.println(lostBoys.getTitle());
				System.out.println("Run time: " + lostBoys.getRunTime());
				System.out.println("Would you like to watch the movie? y/n:");
				String userChoice = scnr.next();
				if (userChoice.charAt(0) == 'y' || userChoice.charAt(0) == 'Y') {
					System.out.println("Which scene of " + lostBoys.getTitle());
					System.out.println("would you like to see? 0-5:");
					int sceneChoice = scnr.nextInt();
					if (sceneChoice == 0) {
						lostBoys.play(sceneChoice, LostScenes);
						while (sceneCont = true) {
							System.out.println("Would you like to continue watching? y/n:");
							String continueChoice = scnr.next();
							if (continueChoice.charAt(0) == 'y' || continueChoice.charAt(0) == 'Y') {
								sceneChoice = sceneChoice + 1;
								if (sceneChoice > LostScenes.size() - 1) {
									sceneChoice = 0;
								}
								lostBoys.play(sceneChoice, LostScenes);
								sceneCont = true;
							} else {
								sceneCont = false;
								break;
							}
						}
					} else if (sceneChoice == 1) {
						lostBoys.play(sceneChoice, LostScenes);
						while (sceneCont = true) {
							System.out.println("Would you like to continue watching? y/n:");
							String continueChoice = scnr.next();
							if (continueChoice.charAt(0) == 'y' || continueChoice.charAt(0) == 'Y') {
								sceneChoice = sceneChoice + 1;
								if (sceneChoice > LostScenes.size() - 1) {
									sceneChoice = 0;
								}
								lostBoys.play(sceneChoice, LostScenes);
								sceneCont = true;
							} else {
								sceneCont = false;
								break;
							}
						}
					} else if (sceneChoice == 2) {
						lostBoys.play(sceneChoice, LostScenes);
						while (sceneCont = true) {
							System.out.println("Would you like to continue watching? y/n:");
							String continueChoice = scnr.next();
							if (continueChoice.charAt(0) == 'y' || continueChoice.charAt(0) == 'Y') {
								sceneChoice = sceneChoice + 1;
								if (sceneChoice > LostScenes.size() - 1) {
									sceneChoice = 0;
								}
								lostBoys.play(sceneChoice, LostScenes);
								sceneCont = true;
							} else {
								sceneCont = false;
								break;
							}
						}
					} else if (sceneChoice == 3) {
						lostBoys.play(sceneChoice, LostScenes);
						while (sceneCont = true) {
							System.out.println("Would you like to continue watching? y/n:");
							String continueChoice = scnr.next();
							if (continueChoice.charAt(0) == 'y' || continueChoice.charAt(0) == 'Y') {
								sceneChoice = sceneChoice + 1;
								if (sceneChoice > LostScenes.size() - 1) {
									sceneChoice = 0;
								}
								lostBoys.play(sceneChoice, LostScenes);
								sceneCont = true;
							} else {
								sceneCont = false;
								break;
							}
						}
					} else if (sceneChoice == 4) {
						lostBoys.play(sceneChoice, LostScenes);
						while (sceneCont = true) {
							System.out.println("Would you like to continue watching? y/n:");
							String continueChoice = scnr.next();
							if (continueChoice.charAt(0) == 'y' || continueChoice.charAt(0) == 'Y') {
								sceneChoice = sceneChoice + 1;
								if (sceneChoice > LostScenes.size() - 1) {
									sceneChoice = 0;
								}
								lostBoys.play(sceneChoice, LostScenes);
								sceneCont = true;
							} else {
								sceneCont = false;
								break;
							}
						}
					} else if (sceneChoice == 5) {
						lostBoys.play(sceneChoice, LostScenes);
						while (sceneCont = true) {
							System.out.println("Would you like to continue watching? y/n:");
							String continueChoice = scnr.next();
							if (continueChoice.charAt(0) == 'y' || continueChoice.charAt(0) == 'Y') {
								sceneChoice = sceneChoice + 1;
								if (sceneChoice > LostScenes.size() - 1) {
									sceneChoice = 0;
								}
								lostBoys.play(sceneChoice, LostScenes);
								sceneCont = true;
							} else {
								sceneCont = false;
								break;
							}
						}
					} else {
						System.out.println("Sorry, I didn't get that.");
						System.out.println("Would you like to continue watching? y/n:");
						String continueChoice = scnr.next();
						if (continueChoice.charAt(0) == 'y' || continueChoice.charAt(0) == 'Y') {
							sceneCont = true;
						} else {
							sceneCont = false;
						}

					}

				}
			} else if (movieChoice == 6) {
				System.out.println(harryPotter.getTitle());
				System.out.println("Run time: " + harryPotter.getRunTime());
				System.out.println("Would you like to watch the movie? y/n:");
				String userChoice = scnr.next();
				if (userChoice.charAt(0) == 'y' || userChoice.charAt(0) == 'Y') {
					System.out.println("Which scene of " + harryPotter.getTitle());
					System.out.println("would you like to see? 0-5:");
					int sceneChoice = scnr.nextInt();
					if (sceneChoice == 0) {
						harryPotter.play(sceneChoice, HarryScenes);
						while (sceneCont = true) {
							System.out.println("Would you like to continue watching? y/n:");
							String continueChoice = scnr.next();
							if (continueChoice.charAt(0) == 'y' || continueChoice.charAt(0) == 'Y') {
								sceneChoice = sceneChoice + 1;
								if (sceneChoice > HarryScenes.size() - 1) {
									sceneChoice = 0;
								}
								harryPotter.play(sceneChoice, HarryScenes);
								sceneCont = true;
							} else {
								sceneCont = false;
								break;
							}
						}
					} else if (sceneChoice == 1) {
						harryPotter.play(sceneChoice, HarryScenes);
						while (sceneCont = true) {
							System.out.println("Would you like to continue watching? y/n:");
							String continueChoice = scnr.next();
							if (continueChoice.charAt(0) == 'y' || continueChoice.charAt(0) == 'Y') {
								sceneChoice = sceneChoice + 1;
								if (sceneChoice > HarryScenes.size() - 1) {
									sceneChoice = 0;
								}
								harryPotter.play(sceneChoice, HarryScenes);
								sceneCont = true;
							} else {
								sceneCont = false;
								break;
							}
						}
					} else if (sceneChoice == 2) {
						harryPotter.play(sceneChoice, HarryScenes);
						while (sceneCont = true) {
							System.out.println("Would you like to continue watching? y/n:");
							String continueChoice = scnr.next();
							if (continueChoice.charAt(0) == 'y' || continueChoice.charAt(0) == 'Y') {
								sceneChoice = sceneChoice + 1;
								if (sceneChoice > HarryScenes.size() - 1) {
									sceneChoice = 0;
								}
								harryPotter.play(sceneChoice, HarryScenes);
								sceneCont = true;
							} else {
								sceneCont = false;
								break;
							}
						}
					} else if (sceneChoice == 3) {
						harryPotter.play(sceneChoice, HarryScenes);
						while (sceneCont = true) {
							System.out.println("Would you like to continue watching? y/n:");
							String continueChoice = scnr.next();
							if (continueChoice.charAt(0) == 'y' || continueChoice.charAt(0) == 'Y') {
								sceneChoice = sceneChoice + 1;
								if (sceneChoice > HarryScenes.size() - 1) {
									sceneChoice = 0;
								}
								harryPotter.play(sceneChoice, HarryScenes);
								sceneCont = true;
							} else {
								sceneCont = false;
								break;
							}
						}
					} else if (sceneChoice == 4) {
						harryPotter.play(sceneChoice, HarryScenes);
						while (sceneCont = true) {
							System.out.println("Would you like to continue watching? y/n:");
							String continueChoice = scnr.next();
							if (continueChoice.charAt(0) == 'y' || continueChoice.charAt(0) == 'Y') {
								sceneChoice = sceneChoice + 1;
								if (sceneChoice > HarryScenes.size() - 1) {
									sceneChoice = 0;
								}
								harryPotter.play(sceneChoice, HarryScenes);
								sceneCont = true;
							} else {
								sceneCont = false;
								break;
							}
						}
					} else if (sceneChoice == 5) {
						harryPotter.play(sceneChoice, HarryScenes);
						while (sceneCont = true) {
							System.out.println("Would you like to continue watching? y/n:");
							String continueChoice = scnr.next();
							if (continueChoice.charAt(0) == 'y' || continueChoice.charAt(0) == 'Y') {
								sceneChoice = sceneChoice + 1;
								if (sceneChoice > HarryScenes.size() - 1) {
									sceneChoice = 0;
								}
								harryPotter.play(sceneChoice, HarryScenes);
								sceneCont = true;
							} else {
								sceneCont = false;
								break;
							}
						}
					} else {
						System.out.println("Sorry, I didn't get that.");
						System.out.println("Would you like to continue watching? y/n:");
						String continueChoice = scnr.next();
						if (continueChoice.charAt(0) == 'y' || continueChoice.charAt(0) == 'Y') {
							sceneCont = true;
						} else {
							sceneCont = false;
						}

					}

				}
			} else if (movieChoice == 0){
				break;
			}
			} catch (Exception e) {
				System.out.println("Invalid Input.\n");
			}
		} // main while loop
		System.out.println("Goodbye!");
	}
}
