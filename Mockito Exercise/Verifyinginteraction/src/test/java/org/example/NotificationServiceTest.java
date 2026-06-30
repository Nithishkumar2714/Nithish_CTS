package org.example;

import static org.mockito.Mockito.*;

import org.junit.jupiter.api.Test;

public class NotificationServiceTest {
    @Test
    void testVerifyEmailSent() {

        var mockEmailService = mock(EmailService.class);

        NotificationService service =
                new NotificationService(mockEmailService);

        service.notifyUser("abc@gmail.com");

        verify(mockEmailService).sendEmail("abc@gmail.com");
    }
}
