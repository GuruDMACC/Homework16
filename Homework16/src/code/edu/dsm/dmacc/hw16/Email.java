package code.edu.dsm.dmacc.hw16;

public class Email extends TaskAssigner {

	@Override
	public boolean assignTask(User user, Integer priority) {

		System.out.println("Inside assignTask - in Email");

		System.out.println("User : " + user.toString() + " & Priority :"
				+ priority);
		return true;

	}

}
