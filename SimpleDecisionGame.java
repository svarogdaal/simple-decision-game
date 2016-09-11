import java.util.Scanner;


public class SimpleDecisionGame {
	public static void main(String[] args) {
		
		System.out.println("What is your name?");
		String name;
		name = user_input();
		
		System.out.println("\n\tHello, " + name + "! I'm Descartes' evil genius.");
		System.out.println("\tAt least, I used to be evil. I decided to give you a chance to escape your dream");
		System.out.println("\tBut it can't be too easy... You'll have to face a few challenges.");
		System.out.println("\tRemember, your quest is to wake up!\n");
		
		start(name);
	}
	
	public static String user_input() {
		Scanner kb = new Scanner(System.in);
		System.out.print("--> ");
		String x = kb.nextLine();
		return x;
	}
	
	public static void dead(String s) {
		System.out.println(s);
		System.out.println("THE END!");
		System.exit(0);
	}
	
	public static void start(String n){
		
		String answer;
		
		System.out.println("\tTo get you started, here's a simple choice:");
		System.out.println("\tTo your left there is a door labeled 'Fear your logic'.");
		System.out.println("\tTo your right there is a door labeled 'Greed is good'.");
		System.out.println("\tWhich way do you go?");
		answer = user_input();
		System.out.println();
		
		if (answer.equalsIgnoreCase("left"))
			logic_room(n);
		else if (answer.equalsIgnoreCase("right"))
			gold_universe(n);
		else {
			System.out.println("\tI don't understand that, we'll start over!");
			start(n);
		}
	}
	
	public static void logic_room(String n) {
		System.out.println("You are in a big room with lots of fancy books.");
		System.out.println("Two people are sitting at a table.\n");
		System.out.println("\tEvil Genius: See those people, " + n + "? They are Gottlob Frege and Bertrand Russell.");
		System.out.println("\tEvil Genius: As you know, they are impeccable logicians, so there will be no logical errors in their answers.");
		System.out.println("\tEvil Genius: Let's see if you can handle this puzzle:\n");
		
		muddy_children(n);
	}
	
	public static void muddy_children(String n) {
		System.out.println("At least one of you has mud on his face.");
		System.out.println("Frege and Russell will answer simultaneously, so they won't learn each other's answer until the next question.\n");
		System.out.println("Are you ready?");
		user_input();
		System.out.println();
		
		int num;
		num = 1 + (int)(Math.random() * 3);
		
		if (num == 1)
			only_one(n);
		else if (num == 2)
			only_two(n);
		else
			all_three(n);
	}
	
	public static void only_one(String n) {
		System.out.println("You see that Russell is muddy, but Frege is not.\n");
		System.out.println("\tEvil Genius: Can you know whether you are muddy?");
		String know = user_input();
		String wrong = "\tEvil Genius: Logic is not your thing... Let's try something else.";
		
		if (know.equalsIgnoreCase("yes")) {
			System.out.println(wrong);
			user_input();
			scene24(n);
		}
		else if (know.equalsIgnoreCase("no")) {
			System.out.println("\tRussell: Yes.");
			System.out.println("\tFrege: No.");
			System.out.println("\n\tEvil Genius: How about now, can you know?");
			know = user_input();
			
			if (know.equalsIgnoreCase("yes")) {
				System.out.println("\tEvil Genius: Are you muddy?");
				know = user_input();
				
				if (know.equalsIgnoreCase("yes")) {
					System.out.println(wrong);
					user_input();
					scene24(n);
				}
				else if (know.equalsIgnoreCase("no")) {
					System.out.println("\tEvil Genius: Very good indeed! On to the next challenge...");
					user_input();
					deepest_room(n);
				}
				else {
					System.out.println("\tI don't understand that, we'll start over!");
					only_one(n);
				}
			}
			else if (know.equalsIgnoreCase("no")) {
				System.out.println(wrong);
				user_input();
				scene24(n);
			}
			else {
				System.out.println("\tI don't understand that, we'll start over!");
				only_one(n);
			}
		}
		else {
			System.out.println("\tI don't understand that, we'll start over!");
			only_one(n);
		}
	}
	
	public static void only_two(String n) {
		int x = 1 + (int)(Math.random() * 2);
		if (x == 1)
			only_two_a(n);
		else
			only_two_b(n);
	}
	
	public static void only_two_a(String n) {
		System.out.println("You see that Russell and Frege are muddy.\n");
		System.out.println("\tEvil Genius: Can you know whether you are muddy?");
		String know = user_input();
		String wrong = "\tEvil Genius: Logic is not your thing... Let's try something else.";
		
		if (know.equalsIgnoreCase("yes")) {
			System.out.println(wrong);
			user_input();
			scene24(n);
		}
		else if (know.equalsIgnoreCase("no")) {
			System.out.println("\tRussell: No.");
			System.out.println("\tFrege: No.");
			System.out.println("\n\tEvil Genius: How about now, can you know?");
			know = user_input();
			
			if (know.equalsIgnoreCase("no")) {
				System.out.println("\tRussell: Yes.");
				System.out.println("\tFrege: Yes.");
				System.out.println("\n\tEvil Genius: And now, can you know?");
				know = user_input();
				
				if (know.equalsIgnoreCase("no")) {
					System.out.println(wrong);
					user_input();
					scene24(n);
				}
				else if (know.equalsIgnoreCase("yes")) {
					System.out.println("\tEvil Genius: Are you muddy?");
					know = user_input();
					
					if (know.equalsIgnoreCase("yes")) {
						System.out.println(wrong);
						user_input();
						scene24(n);
					}
					else if (know.equalsIgnoreCase("no")) {
						System.out.println("\tEvil Genius: Very good indeed! On to the next challenge...");
						user_input();
						deepest_room(n);
					}
					else {
						System.out.println("\tI don't understand that, we'll start over!");
						only_two_a(n);
					}
				}
				else {
					System.out.println("\tI don't understand that, we'll start over!");
					only_two_a(n);
				}
			}
			else if (know.equalsIgnoreCase("yes")) {
				System.out.println(wrong);
				user_input();
				scene24(n);
			}
			else {
				System.out.println("\tI don't understand that, we'll start over!");
				only_two_a(n);
			}
		}
		else {
			System.out.println("\tI don't understand that, we'll start over!");
			only_two_a(n);
		}
	}
	
	public static void only_two_b(String n) {
		System.out.println("You see that Russell is muddy, but Frege is not.\n");
		System.out.println("\tEvil Genius: Can you know whether you are muddy?");
		String know = user_input();
		String wrong = "\tEvil Genius: Logic is not your thing... Let's try something else.";
		
		if (know.equalsIgnoreCase("yes")) {
			System.out.println(wrong);
			user_input();
			scene24(n);
		}
		else if (know.equalsIgnoreCase("no")) {
			System.out.println("\tRussell: No.");
			System.out.println("\tFrege: No.");
			System.out.println("\n\tEvil Genius: How about now, can you know?");
			know = user_input();
			
			if (know.equalsIgnoreCase("no")) {
				System.out.println(wrong);
				user_input();
				scene24(n);
			}
			else if (know.equalsIgnoreCase("yes")) {
				System.out.println("\tEvil Genius: Are you muddy?");
				know = user_input();
				
				if (know.equalsIgnoreCase("yes")) {
					System.out.println("\tEvil Genius: Very good indeed! On to the next challenge...");
					user_input();
					deepest_room(n);
				}
				else if (know.equalsIgnoreCase("no")) {
					System.out.println(wrong);
					user_input();
					scene24(n);
				}
				else {
					System.out.println("\tI don't understand that, we'll start over!");
					only_two_b(n);
				}
			}
			else {
				System.out.println("\tI don't understand that, we'll start over!");
				only_two_b(n);
			}
		}
		else {
			System.out.println("\tI don't understand that, we'll start over!");
			only_two_b(n);
		}
	}

	public static void all_three(String n) {
		System.out.println("You see that Russell and Frege are muddy.\n");
		System.out.println("\tEvil Genius: Can you know whether you are muddy?");
		String know = user_input();
		String wrong = "\tEvil Genius: Logic is not your thing... Let's try something else.";
		
		if (know.equalsIgnoreCase("yes")) {
			System.out.println(wrong);
			user_input();
			scene24(n);
		}
		else if (know.equalsIgnoreCase("no")) {
			System.out.println("\tRussell: No.");
			System.out.println("\tFrege: No.");
			System.out.println("\n\tEvil Genius: How about now, can you know?");
			know = user_input();
			
			if (know.equalsIgnoreCase("yes")) {
				System.out.println(wrong);
				user_input();
				scene24(n);
			}
			else if (know.equalsIgnoreCase("no")) {
				System.out.println("\tRussell: No.");
				System.out.println("\tFrege: No.");
				System.out.println("\n\tEvil Genius: And now, can you know?");
				know = user_input();
				
				if (know.equalsIgnoreCase("no")) {
					System.out.println(wrong);
					user_input();
					scene24(n);
				}
				else if (know.equalsIgnoreCase("yes")) {
					System.out.println("\tEvil Genius: Are you muddy?");
					know = user_input();
					
					if (know.equalsIgnoreCase("yes")) {
						System.out.println("\tEvil Genius: Very good indeed! On to the next challenge...");
						user_input();
						deepest_room(n);
					}
					else if (know.equalsIgnoreCase("no")) {
						System.out.println(wrong);
						user_input();
						scene24(n);
					}
					else {
						System.out.println("\tI don't understand that, we'll start over!");
						all_three(n);
					}
				}
				else {
					System.out.println("\tI don't understand that, we'll start over!");
					all_three(n);
				}
			}
			else {
				System.out.println("\tI don't understand that, we'll start over!");
				all_three(n);
			}
		}
		else {
			System.out.println("\tI don't understand that, we'll start over!");
			all_three(n);
		}
	}
	
	
	public static void highest_ground(String n) {
		System.out.println("You are now on the highest moral and physical ground.");
		System.out.println("There is a fortified tower here. You knock on the door and a french soldier opens a window.\n");
		System.out.println("\tFrench soldier: I knew it! I could smell you from a mile, " + n + "!");
		System.out.println("\tFrench soldier: You shall not awake in this tower, you dreaming pig dog!");
		System.out.println("\tFrench soldier: Go and boil your bottom, you offspring of a silly person!");
		System.out.println("\tFrench soldier: Now walk away or I shall taunt you a second time!\n");
		System.out.println("Do you walk away, attack, or insult?");
		String answer = user_input();
		String[] taunts = {"You empty-headed animal food trough wiper!", "I fart in your general direction!",
						   "Your mother was a hamster and your father smelt of elderberries!", "I blow my nose at you, so-called '" + n + "'!"};
		while (true) {
			if (answer.equalsIgnoreCase("walk away"))
				dead("You are wise not to enter a fight with the french soldier. You wake up.");
			else if (answer.equalsIgnoreCase("attack"))
				dead("The frenchman throws the contents of his night bucket at you.\nHe also throws a cow... You died!");
			else
				for (String taunt: taunts) {
					System.out.println("\tFrench soldier: " + taunt);
					System.out.println("What now?");
					answer = user_input();
					if (answer.equalsIgnoreCase("attack"))
						dead("The frenchman throws the contents of his night bucket at you.\nHe also throws a cow... You died!");
					else if (answer.equalsIgnoreCase("walk away"))
						dead("You are wise not to enter a fight with the french soldier. You wake up.");
				}
		}
	}

	public static void king_puzzle(String n) {
		System.out.println("\tKing: There are three boxes in front of you, labeled 1, 2, and 3.");
		System.out.println("\tKing: Each sends you to some other place, but only one of them sends you to a NICER place.");
		System.out.println("\tKing: You will choose a box, after which I will open one of the remaining non-winning boxes.");
		System.out.println("\tKing: Finally, you will tell me whether you stay with your initial choice or switch to the other unopened box.");
		System.out.println("\tKing: Are you ready?");
		user_input();
		
		monty_hall(n);
	}
	
	public static void monty_hall(String n) {
		
		int car = 1 + (int)(Math.random() * 3);
		int x = 1 + (int)(Math.random() * 2);
		int monty;
		
		System.out.println("\tKing: Choose a box.");
		int choice = 0;
		try {
			choice = Integer.parseInt(user_input());
		}
		catch (NumberFormatException err) {
			System.out.println("That's not a number! Try again.");
			monty_hall(n);
			return;
		}
		
		if (choice > 3) {
			System.out.println("There are only 3 boxes! Try again.");
			monty_hall(n);
			return;
		}
		
		if (choice == car) {
			if (car == 1)
				if (x == 1)
					monty = 2;
				else
					monty = 3;
			else if (car == 2)
				if (x == 1)
					monty = 1;
				else
					monty = 3;
			else
				monty = x;
		}
		else {
			if (car == 1 && choice == 2 || car == 2 && choice == 1)
				monty = 3;
			else if (car == 1 && choice == 3 || car == 3 && choice == 1)
				monty = 2;
			else
				monty = 1;
		}
		
		System.out.println("The king opens box " + monty + ".\n");
		System.out.println("\tKing: So you switch or stay?");
		String answer = user_input();
		
		while (!answer.equalsIgnoreCase("switch") && !answer.equalsIgnoreCase("stay")) {
			System.out.println("Your choices are 'switch' or 'stay'.");
			answer = user_input();
		}
		
		if (answer.equalsIgnoreCase("stay") && car == choice) {
			System.out.println("\tKing: You win! Now I'll send you somewhere quite interesting...");
			user_input();
			deepest_room(n);
		}
		else if (answer.equalsIgnoreCase("switch") && car != choice) {
			System.out.println("\tKing: You win! Now I'll send you somewhere quite interesting...");
			user_input();
			deepest_room(n);
		}
		else {
			System.out.println("\tKing: You lose! I wish you good luck. You'll need it where you're going...");
			user_input();
			scene24(n);
		}
		
	}
	
	public static void gold_universe(String n) {
		
		String[] places = {"throne", "throne room", "palace", "city", "kingdom", "continent", "planet",
						   "solar system", "galaxy", "universe"};
		
		System.out.println("You are in a universe completely made of gold, but not really.\n");
		int i = places.length;
		
		while (i >= 2) {
			System.out.println("And in this " + places[i - 1] + " completely made of gold, but not really,");
			System.out.println("there is a " + places[i - 2] + " completely made of gold, but not really.");
			user_input();
			i -= 1;
		}
		
		System.out.println("I'm tired of this too, so from now on just assume everything is made of gold...");
		System.out.println("But not really.");
		user_input();
		
		System.out.println("On the throne sits a king. He says to you:\n");
		System.out.println("\tKing: I was expecting you, " + n + "!");
		System.out.println("\tKing: I have no time for small talk, so here's your puzzle:");
		user_input();
		
		king_puzzle(n);
	}
	
	public static void deepest_room(String n) {
		System.out.println("You are now in the deepest room, both physically and philosophically.");
		System.out.println("A pandimensional being appears. He's called Frank.\n");
		System.out.println("\tFrank: I know what you seek, " + n + ", but first you must answer my questions.");
		user_input();
		System.out.println("\tFrank: What is the answer to life, the universe, and everything?");
		String answer = user_input();
		
		if (!answer.equals("42")) {
			System.out.println("\tFrank: I cannot allow a being so unevolved to remain any longer in my presence!");
			System.out.println("\tFrank: You will be sent to almost certain death.");
			user_input();
			scene24(n);
		}
		else {
			System.out.println("\tFrank: You surprise me, mortal! Let's see how you will fare from now on.");
			System.out.println("\tFrank: What is {(234 + 35 * 62) / [(423 - 78) * 83]} * (2 - 1 - 1) + 57 -15?");
			answer = user_input();
			if (!answer.equals("42")) {
				System.out.println("\tFrank: That is simply wrong! I've had enough of you...");
				dead("Frank destroys you in all dimensions.");
			}
			else {
				System.out.println("\tFrank: Very good! I like you, " + n + ". But now comes the real test.");
				System.out.println("\tFrank: What is your name?");
				answer = user_input();
				if (answer.equals("42")) {
					System.out.println("\tFrank: Wonderful! You cast away rationality and you understood the meaning of life, the universe, and everything.");
					System.out.println("\tFrank: I will now release you from this evil genius. Farewell, wise one!");
					dead("You wake up.");
				}
				else if (answer.equalsIgnoreCase(n)) {
					System.out.println("\tFrank: I am disappointed that you chose reason over the answer to EVERYTHING.");
					System.out.println("\tFrank: You will be sent to almost certain death.");
					user_input();
					scene24(n);
				}
				else {
					System.out.println("\tFrank: That is simply wrong! I've had enough of you...");
					dead("Frank destroys you in all dimensions.");
				}
			}
		}
	}
	
	public static void scene24(String n) {
		System.out.println("You have reached the Gorge of Eternal Peril.");
		System.out.println("Here you meet the old man from scene 24; he is the keeper of the bridge of death.\n");
		System.out.println("\tOld man: Stop! Who will cross the bridge of death\n\tmust answer me these questions three\n\t'ere the other side he see.");
		user_input();
		System.out.println("\tOld man: What is your name?");
		String answer = user_input();
		
		if (answer.equals(n)) {
			System.out.println("\tOld man: What is your quest?");
			answer = user_input();
			
			if (answer.contains("wake up")) {
				System.out.println("\tOld man: What is the airspeed velocity of an unladen swallow (in m/s)?");
				answer = user_input();
				
				if (answer.contains("african") && answer.contains("european")) {
					System.out.println("\tOld man: Well, I... I don't know...");
					System.out.println("The old man gets cast into the Gorge of Eternal Peril and you may safely cross the bridge.");
					user_input();
					highest_ground(n);
				}
				else if (answer.contains("11")) {
					System.out.println("\tOld man: A nerdy bugger, aren't you? Right, off you go!");
					user_input();
					highest_ground(n);
				}
				else
					dead("You have been cast into the Gorge of Eternal Peril... in which you perish... eternally.");
			}
			else
				dead("You have been cast into the Gorge of Eternal Peril... in which you perish... eternally.");
		}
		else
			dead("You have been cast into the Gorge of Eternal Peril... in which you perish... eternally.");
	}
}