package com.premraj.registerservice.serviceImpl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.premraj.registerservice.entity.ActivateAccountDetails;
import com.premraj.registerservice.repository.ActivateAccountDetailsRepo;
import com.premraj.registerservice.repository.UserDetailsRepo;

@Service
public class ActivateAccountDetailsServiceImpl {

	@Autowired
	private ActivateAccountDetailsRepo activateAccountDetailsRepo;

	@Autowired
	private UserDetailsRepo userDetailsRepo;

	public void getAccountActivationDetails(String registeredEmail, String tempPassword, String newPassword,
			String confirmPassword) {

		String fetchedEmail = this.activateAccountDetailsRepo.findByEmail(registeredEmail);
		String fetchedTempPasswordFromDb = this.activateAccountDetailsRepo.fetchPasswordFromDb(registeredEmail);
		if (fetchedEmail.equals(registeredEmail)) {
			if (fetchedTempPasswordFromDb.equals(tempPassword)) {
				checkNewAndConfirmPassword(newPassword, confirmPassword, registeredEmail);
			} else {
				System.out.println("Invalid password ! Please enter valid temporary password sent to your mail");
			}

		} else {
			System.out.println("Invalid email ! Please enter registered email id");
		}

		System.out.println("fE+fTP+nP+cP" + fetchedEmail + fetchedTempPasswordFromDb + newPassword + confirmPassword);

	}

	public String checkNewAndConfirmPassword(String newPassword, String confirmPassword, String registeredEmail) {
		if (newPassword.equals(confirmPassword)) {
			System.out.println("newPass==confirmPasss");
			ActivateAccountDetails activateAccountDetails = new ActivateAccountDetails();
			this.activateAccountDetailsRepo.updateTempPassToConfirmPass(confirmPassword, registeredEmail);
			System.out.println("Setting tempPass to confPass");
			this.activateAccountDetailsRepo.save(activateAccountDetails);

			this.userDetailsRepo.updateStatus("active", registeredEmail);
			System.out.println("Setting userStatus to active");

			System.out.println("Congratulations! Account activated successfully");
			return ("Congratulations! Account activated successfully");
		} else {
			System.out.println("New Password and Confirm Password must be same");
			return "New Password and Confirm Password must be same";
		}

	}
}
