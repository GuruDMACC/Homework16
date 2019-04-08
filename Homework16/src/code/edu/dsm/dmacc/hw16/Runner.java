package code.edu.dsm.dmacc.hw16;

public class Runner {

	public static void main(String[] args) {

		System.out.println("Starting runner...");

		User user1 = new User("Guru", "Setty", "User1");

		TaskAssigner task1 = new Phone();

		TaskAssigner task2 = new Email();

		TaskAssigner task3 = new InPerson();

		task1.assignTask(user1, 1);
		task2.assignTask(user1, 2);
		task3.assignTask(user1, 3);

	}

}
