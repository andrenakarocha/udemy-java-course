package Sections.Section13.SingleResponsabilityPrinciple.solution;


public class MailboxSettingsService {

    private SecurityService securityService;

    {
        securityService = new SecurityService();
    }

    public void changeSecondaryEmail(User user, String newSecondaryEmail) {
        if (securityService.hasAccess(user)) {
            user.setSecondaryEmail(newSecondaryEmail);
        }
    }

}
